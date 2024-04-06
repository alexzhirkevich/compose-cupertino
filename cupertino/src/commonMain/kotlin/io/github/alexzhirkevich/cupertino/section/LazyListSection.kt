/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino.section

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import io.github.alexzhirkevich.cupertino.CupertinoDivider
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.LocalContainerColor
import io.github.alexzhirkevich.cupertino.Surface


/**
 * Section extension for lazy lists.
 *
 * Section [title], [caption] and each row will be rendered as a separate lazy list item.
 * There is also a [CupertinoSection] variant for usage outside of lazy lists.
 *
 * @param style style of the section. If no value provided [LocalSectionStyle] will be used.
 * @param title section top label. To match the section style, title string should be transformed with [sectionTitle]
 * @param caption section bottom text.
 * @param content section builder.
 * @param state section state. Used for section collapsing
 * when [style] is [SectionStyle.Sidebar] and [title] is provided.
 * @param enterTransition section collapse animation
 * @param exitTransition section expand animation
 * @see CupertinoSection
 * @see sectionTitle
 * */
@OptIn(ExperimentalFoundationApi::class)
@ExperimentalCupertinoApi
fun LazyListScope.section(
    style: SectionStyle? = null,
    state: SectionState? = null,
    enterTransition: EnterTransition = CupertinoSectionDefaults.EnterTransition,
    exitTransition: ExitTransition = CupertinoSectionDefaults.ExitTransition,
    shape : CornerBasedShape ?= null,
    color : Color = Color.Unspecified,
    stickyTitle : Boolean = false,
    title: @Composable (LazyItemScope.() -> Unit)? = null,
    caption: @Composable (LazyItemScope.() -> Unit)? = null,
    content: LazySectionScope.() -> Unit
) {

    val itemsPadding = CupertinoSectionDefaults.PaddingValues

    @Composable
    fun resolvedStyle(): SectionStyle = style ?: LocalSectionStyle.current

    @Composable
    fun resolvedColor(): Color = color.takeOrElse {
        CupertinoSectionDefaults.Color
    }


    item(contentType = SplitPaddingContentType) {
        Spacer(
            Modifier
                .height(CupertinoSectionTokens.SplitPadding)
                .fillMaxWidth()
        )
    }

    if (title != null) {

        if (stickyTitle) {
            stickyHeader(contentType = SectionTitleContentType) {
                SectionTitle(
                    style = resolvedStyle(),
                    lazy = true,
                    state = state,
                ) {
                    title()
                }
            }
        } else {
            item(contentType = SectionTitleContentType) {
                SectionTitle(
                    style = resolvedStyle(),
                    lazy = true,
                    state = state,
                ) {
                    title()
                }
            }
        }
        item(contentType = DividerContentType) {
            SectionDivider(style = resolvedStyle())
        }
    }

    val items = LazySectionScopeImpl().apply(content).items

    items.fastForEachIndexed { index, item ->
        item(item.key, item.contentType) {
            AnimateSection(
                style = resolvedStyle(),
                state = state,
                enterTransition = enterTransition,
                exitTransition = exitTransition
            ) {
                val resolvedShape = shape ?: CupertinoSectionDefaults.shape(resolvedStyle())

                val clipShape = when {
                    !resolvedStyle().inset || !resolvedStyle().grouped -> null

                    else -> RoundedCornerShape(
                        topStart = if (index == 0) resolvedShape.topStart else CornerSizeZero,
                        topEnd = if (index == 0) resolvedShape.topEnd else CornerSizeZero,
                        bottomStart = if (index == items.lastIndex) resolvedShape.bottomStart else CornerSizeZero,
                        bottomEnd = if (index == items.lastIndex) resolvedShape.bottomEnd else CornerSizeZero
                    )
                }

                val clipModifier = clipShape?.let { Modifier.clip(it) } ?: Modifier

                Column(
                    modifier = Modifier
                        .padding(
                            horizontal = if (resolvedStyle().inset && resolvedStyle().grouped)
                                CupertinoSectionTokens.HorizontalPadding else 0.dp
                        )
                        .then(clipModifier)
                        .background(resolvedColor())

                ) {
                    CompositionLocalProvider(
                        LocalSectionStyle provides resolvedStyle(),
                        LocalContainerColor provides resolvedColor()
                    ) {
                        item.content(itemsPadding)
                    }

                    if (index != items.lastIndex &&
                        item.dividerPadding != null &&
                        items[index + 1].dividerPadding != null
                    ) {
                        CupertinoDivider(Modifier.padding(start = item.dividerPadding))
                    }
                }
            }
        }
    }

    item(contentType = DividerContentType) {
        SectionDivider(
            style = resolvedStyle(),
        )
    }

    if (caption != null) {
        item(contentType = SectionCaptionContentType) {
            AnimateSection(
                style = resolvedStyle(),
                state = state,
                enterTransition = enterTransition,
                exitTransition = exitTransition
            ) {
                SectionCaption(
                    lazy = true,
                    style = resolvedStyle(),
                    content = {
                        caption()
                    }
                )
            }
        }
    }


    if (caption != null) {
        item(contentType = DividerContentType) {
            if (!resolvedStyle().grouped) {
                AnimateSection(
                    style = resolvedStyle(),
                    state = state,
                    enterTransition = enterTransition,
                    exitTransition = exitTransition
                ) {
                    SectionDivider(
                        style = resolvedStyle(),
                    )
                }
            }
        }
    }

    item(contentType = SplitPaddingContentType) {
        Spacer(
            Modifier
                .height(CupertinoSectionTokens.SplitPadding)
                .fillMaxWidth()
        )
    }
}


//private val DefaultSectionEnter = fadeIn() + expandIn(
//    expandFrom = Alignment.TopCenter,
//    initialSize = { IntSize(it.width, 0) }
//)
//
//private val DefaultSectionExit = fadeOut() +  shrinkOut(
//    shrinkTowards = Alignment.TopCenter,
//    targetSize = { IntSize(it.width, 0 ) }
//)

@Composable
internal fun AnimateSection(
    style: SectionStyle,
    state: SectionState?,
    enterTransition: EnterTransition,
    exitTransition: ExitTransition,
    content: @Composable () -> Unit
){
    AnimatedVisibility(
        modifier = Modifier.clipToBounds(),
        visible = style != SectionStyle.Sidebar || state?.isCollapsed != true,
        enter = enterTransition,
        exit = exitTransition,
    ) {
        content()
    }
}

private object DividerContentType
private object SplitPaddingContentType
private object SectionTitleContentType
private object SectionCaptionContentType

private val CornerSizeZero = CornerSize(0)