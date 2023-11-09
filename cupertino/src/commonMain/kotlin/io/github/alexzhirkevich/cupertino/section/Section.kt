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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.Separator
import io.github.alexzhirkevich.cupertino.Surface
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White

/**
 * Icon with colored background and rounded corners often used in [CupertinoSection] label
 * */
@Composable
fun CupertinoLabelIcon(
    painter : Painter,
    containerColor: Color = CupertinoTheme.colorScheme.accent,
    tint : Color = CupertinoColors.White,
    contentDescription : String? = null
) {
    CupertinoIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = tint,
        modifier = Modifier
            .clip(CupertinoTheme.shapes.small)
            .background(containerColor)
            .padding(4.dp)
    )
}

/**
 * Icon with colored background and rounded corners often used in [CupertinoSection] label
 * */
@Composable
fun CupertinoLabelIcon(
    imageVector : ImageVector,
    containerColor: Color = CupertinoTheme.colorScheme.accent,
    tint : Color = CupertinoColors.White,
    contentDescription : String? = null
) {
    CupertinoLabelIcon(
        painter = rememberVectorPainter(imageVector),
        containerColor = containerColor,
        tint = tint,
        contentDescription = contentDescription
    )
}

/**
 * Icon with colored background and rounded corners often used in [CupertinoSection] label
 * */
@Composable
fun CupertinoLabelIcon(
    bitmap: ImageBitmap,
    containerColor: Color = CupertinoTheme.colorScheme.accent,
    tint : Color = CupertinoColors.White,
    contentDescription : String? = null
) {
    CupertinoLabelIcon(
        painter = remember(bitmap) { BitmapPainter(bitmap) },
        containerColor = containerColor,
        tint = tint,
        contentDescription = contentDescription
    )
}


/**
 * Section of the iOS list.
 *
 * There is also an optimized [section] extension for lazy lists.
 *
 * @param modifier section modifier
 * @param style section style
 * @param title section top label
 * @param caption section bottom label
 * @param content section builder
 *
 * @see section
 * */
@Composable
fun CupertinoSection(
    modifier : Modifier = Modifier,
    style: SectionStyle = SectionStyle.InsetGrouped,
    shape : CornerBasedShape = CupertinoSectionDefaults.Shape,
    title : (@Composable (padding : PaddingValues) -> Unit)?=null,
    caption : (@Composable (padding : PaddingValues) -> Unit)?=null,
    content : SectionScope.() -> Unit
) {
    CompositionLocalProvider(
        LocalSectionStyle provides style
    ) {
        Column(
            modifier = modifier
                .padding(CupertinoSectionDefaults.paddingValues)
        ) {
            if (title != null) {
                SectionTitle(
                    style = style,
                    content = title
                )
            }
            val scope = remember(content) {
                SectionScopeImpl().apply(content)
            }
            Surface(
                color = CupertinoTheme.colorScheme.systemGroupedBackground,
                shape = shape
            ) {
                scope.Draw()
            }
            if (caption != null) {
                SectionCaption(
                    style = style,
                    content = caption
                )
            }
        }
    }
}


@Composable
internal fun SectionTitle(
    style: SectionStyle,
    content: @Composable (padding: PaddingValues) -> Unit
) {

    val additionalPadding = if (style.inset && style.grouped)
        SectionTokens.HorizontalPadding else 0.dp

    CompositionLocalProvider(
        LocalContentColor provides CupertinoSectionDefaults.titleColor(),
        LocalSectionStyle provides style
    ) {
        ProvideTextStyle(CupertinoSectionDefaults.titleTextStyle(style)) {
            content(
                PaddingValues(
                    start = SectionTokens.HorizontalPadding + additionalPadding,
                    end = SectionTokens.HorizontalPadding + additionalPadding,
                    bottom = SectionTokens.InlinePadding
                )
            )
        }
    }
}

@Composable
internal fun SectionCaption(
    style: SectionStyle,
    content: @Composable (padding: PaddingValues) -> Unit
) {

    val addCorner = if (style.inset && style.grouped)
        SectionTokens.HorizontalPadding else 0.dp

    CompositionLocalProvider(
        LocalContentColor provides CupertinoSectionDefaults.captionColor(style),
        LocalSectionStyle provides style
    ) {
        ProvideTextStyle(CupertinoSectionDefaults.captionTextStyle(style)) {
            content(
                PaddingValues(
                    horizontal = SectionTokens.HorizontalPadding + addCorner,
                    vertical = SectionTokens.InlinePadding
                )
            )
        }
    }
}

@Composable
internal fun SectionDivider(
    style: SectionStyle
) {
    if (style.inset && style.grouped)
        return

    Separator(modifier = Modifier.padding(
        start = if (style.grouped)
            0.dp else SectionTokens.HorizontalPadding
    ))
}
