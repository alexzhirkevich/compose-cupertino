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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import io.github.alexzhirkevich.cupertino.Separator
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

private object VerticalDividerContentType
private object SplitPaddingContentType
private object SectionTitleContentType
private object SectionCaptionContentType

/**
 * Section extension for lazy lists.
 *
 * Section title, caption and each row will be rendered as a separate lazy list item
 *
 * @param style style of the section. If no value provided [LocalSectionStyle] will be used
 * */
fun LazyListScope.section(
    style: SectionStyle? = null,
    shape : CornerBasedShape ?= null,
    title: @Composable (LazyItemScope.(padding: PaddingValues) -> Unit)? = null,
    caption: @Composable (LazyItemScope.(padding: PaddingValues) -> Unit)? = null,
    content: SectionScope.() -> Unit
) {

    val itemsPadding = PaddingValues(
        horizontal = SectionTokens.HorizontalPadding,
        vertical = SectionTokens.VerticalPadding,
    )

    @Composable
    fun resolvedStyle() : SectionStyle = style ?: LocalSectionStyle.current

    item(contentType = SplitPaddingContentType) {
        Spacer(Modifier.height(SectionTokens.SplitPadding))
    }

    if (title != null) {
        item(contentType = SectionTitleContentType) {
            SectionTitle(
                style = resolvedStyle()
            ) {
                title(this, it)
            }
        }
    }

    val items = SectionScopeImpl().apply(content).items

    item(contentType = VerticalDividerContentType) {
        SectionDivider(resolvedStyle())
    }

    items.fastForEachIndexed { index, item ->
        item(item.key, item.contentType) {
            val resolvedShape = shape ?: CupertinoSectionDefaults.Shape

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
                            SectionTokens.HorizontalPadding else 0.dp
                    )
                    .then(clipModifier)
                    .background(CupertinoSectionDefaults.color())

            ) {
                CompositionLocalProvider(LocalSectionStyle provides resolvedStyle()) {
                    item.content(itemsPadding)
                }

                if (index != items.lastIndex &&
                    item.dividerPadding != null &&
                    items[index+1].dividerPadding != null) {
                    Separator(Modifier.padding(start = item.dividerPadding))
                }
            }
        }
    }

    item(contentType = VerticalDividerContentType) {
        SectionDivider(resolvedStyle())
    }

    if (caption != null) {
        item(contentType = SectionCaptionContentType) {
            SectionCaption(
                style = resolvedStyle()
            ) {
                caption(this, it)
            }
        }
    }

        item(contentType = VerticalDividerContentType) {
            if (!resolvedStyle().grouped) {
                SectionDivider(resolvedStyle())
            }
        }

    item(contentType = SplitPaddingContentType) {
        Spacer(Modifier.height(SectionTokens.SplitPadding))
    }
}

private val CornerSizeZero = CornerSize(0)