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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.CupertinoDivider
import io.github.alexzhirkevich.cupertino.Surface


/**
 * iOS-like list section.
 *
 * There is also an optimized [section] extension for lazy lists.
 *
 * @param modifier section modifier
 * @param style section style
 * @param shape section shape
 * @param color section background color
 * @param title section top label
 * @param caption section bottom label
 * @param content section builder
 *
 * @see section
 * */
@Composable
fun CupertinoSection(
    modifier : Modifier = Modifier,
    style: SectionStyle = LocalSectionStyle.current,
    shape : CornerBasedShape = CupertinoSectionDefaults.shape(style),
    color: Color = CupertinoSectionDefaults.Color,
    containerColor : Color = CupertinoSectionDefaults.containerColor(style),
    contentPadding : PaddingValues = CupertinoSectionDefaults.paddingValues(
        style = style,
        includePaddingBetweenSections = true
    ),
    title : (@Composable () -> Unit)?=null,
    caption : (@Composable () -> Unit)?=null,
    content : SectionScope.() -> Unit
) {
    CompositionLocalProvider(
        LocalSectionStyle provides style
    ) {
        Column(
            modifier = modifier
                .background(containerColor)
                .padding(contentPadding)
        ) {
            if (title != null) {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = if (style.grouped)
                        containerColor
                    else color
                ) {
                    SectionTitle(
                        style = style,
                        lazy = false
                    ){
                        title()
                    }
                }
                SectionDivider(
                    modifier = Modifier.background(color),
                    style = style
                )
            }

            val scope = SectionScopeImpl().apply(content)

            Surface(
                color = color,
                shape = shape,
            ) {
                scope.Draw()
            }
            SectionDivider(
                modifier = Modifier.background(color),
                style = style
            )

            if (caption != null) {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = if (style.grouped)
                        containerColor
                    else color
                ) {
                    SectionCaption(
                        style = style,
                        lazy = false,
                        content = caption
                    )
                }
                if (!style.grouped) {
                    SectionDivider(style)
                }
            }
        }
    }
}


@Composable
internal fun SectionTitle(
    style: SectionStyle,
    lazy : Boolean,
    content: @Composable () -> Unit
) {

    val additionalPadding = if (style.inset && style.grouped && lazy)
        CupertinoSectionTokens.HorizontalPadding else 0.dp

    CompositionLocalProvider(
        LocalContentColor provides CupertinoSectionDefaults.titleColor(),
        LocalSectionStyle provides style
    ) {
        ProvideTextStyle(CupertinoSectionDefaults.titleTextStyle(style)) {
            Box(
                Modifier.padding(
                    PaddingValues(
                        start = CupertinoSectionTokens.HorizontalPadding + additionalPadding,
                        end = CupertinoSectionTokens.HorizontalPadding + additionalPadding,
                        bottom = CupertinoSectionTokens.InlinePadding
                    )
                )
            ) {
                content()
            }
        }
    }
}

@Composable
internal fun SectionCaption(
    style: SectionStyle,
    lazy : Boolean,
    content: @Composable () -> Unit
) {

    val addCorner = if (style.inset && style.grouped && lazy)
        CupertinoSectionTokens.HorizontalPadding else 0.dp

    CompositionLocalProvider(
        LocalContentColor provides CupertinoSectionDefaults.captionColor(style),
        LocalSectionStyle provides style
    ) {
        ProvideTextStyle(CupertinoSectionDefaults.captionTextStyle(style)) {
            Box(
                Modifier.padding(
                    PaddingValues(
                        horizontal = CupertinoSectionTokens.HorizontalPadding + addCorner,
                        vertical = CupertinoSectionTokens.InlinePadding
                    )
                )
            ) {
                content()
            }
        }
    }
}

@Composable
internal fun SectionDivider(
    style: SectionStyle,
    modifier: Modifier = Modifier
) {
    if (style.inset && style.grouped)
        return

    CupertinoDivider(
        modifier = modifier.padding(
            start = if (style.grouped)
                0.dp else CupertinoSectionTokens.HorizontalPadding
        )
    )
}
