/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import io.github.alexzhirkevich.cupertino.LocalContainerColor
import io.github.alexzhirkevich.cupertino.Separator
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
 *
 * @see CupertinoSection
 * @see sectionTitle
 * */
fun LazyListScope.section(
    style: SectionStyle? = null,
    shape : CornerBasedShape ?= null,
    color : Color? = null,
    containerColor : Color? = null,
    title: @Composable (LazyItemScope.(padding: PaddingValues) -> Unit)? = null,
    caption: @Composable (LazyItemScope.(padding: PaddingValues) -> Unit)? = null,
    content: SectionScope.() -> Unit
) {

    val itemsPadding = CupertinoSectionDefaults.PaddingValues

    @Composable
    fun resolvedStyle(): SectionStyle = style ?: LocalSectionStyle.current

    @Composable
    fun resolvedColor(): Color = color ?: CupertinoSectionDefaults.Color

    @Composable
    fun resolvedContainerColor(): Color = containerColor ?: CupertinoSectionDefaults.containerColor(
        style = resolvedStyle()
    )

    item(contentType = SplitPaddingContentType) {
        Spacer(
            Modifier
                .height(SectionTokens.SplitPadding)
                .fillMaxWidth()
                .background(resolvedContainerColor())
        )
    }

    if (title != null) {
        item(contentType = SectionTitleContentType) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = if (resolvedStyle().grouped)
                    resolvedContainerColor()
                else resolvedColor()
            ) {
                SectionTitle(
                    style = resolvedStyle(),
                    lazy = true
                ) {
                    title(this, it)
                }
            }
        }
        item(contentType = DividerContentType) {
            SectionDivider(
                style = resolvedStyle(),
                modifier = Modifier.background(resolvedColor())
            )
        }
    }

    val items = SectionScopeImpl().apply(content).items

    items.fastForEachIndexed { index, item ->
        item(item.key, item.contentType) {
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
                    .background(resolvedContainerColor())
                    .padding(
                        horizontal = if (resolvedStyle().inset && resolvedStyle().grouped)
                            SectionTokens.HorizontalPadding else 0.dp
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
                    Separator(Modifier.padding(start = item.dividerPadding))
                }
            }
        }
    }

    item(contentType = DividerContentType) {
        SectionDivider(
            style = resolvedStyle(),
            modifier = Modifier.background(resolvedColor())
        )
    }

    if (caption != null) {
        item(contentType = SectionCaptionContentType) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = if (resolvedStyle().grouped)
                    resolvedContainerColor()
                else resolvedColor()
            ) {
                SectionCaption(
                    lazy = true,
                    style = resolvedStyle()
                ) {
                    caption(this, it)
                }
            }
        }
    }

    if (caption != null) {
        item(contentType = DividerContentType) {
            if (!resolvedStyle().grouped) {
                SectionDivider(
                    style = resolvedStyle(),
                    modifier = Modifier.background(resolvedContainerColor())
                )
            }
        }
    }

    item(contentType = SplitPaddingContentType) {
        Spacer(
            Modifier
                .height(SectionTokens.SplitPadding)
                .fillMaxWidth()
                .background(resolvedContainerColor())
        )
    }
}

private object DividerContentType
private object SplitPaddingContentType
private object SectionTitleContentType
private object SectionCaptionContentType

private val CornerSizeZero = CornerSize(0)