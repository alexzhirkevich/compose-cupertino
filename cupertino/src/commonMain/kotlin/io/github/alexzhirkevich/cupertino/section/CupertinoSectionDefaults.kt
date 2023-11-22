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

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

object CupertinoSectionDefaults {

    val PaddingValues = PaddingValues(
        horizontal = SectionTokens.HorizontalPadding,
        vertical = SectionTokens.VerticalPadding
    )

    val Shape: CornerBasedShape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.shapes.medium

    @Composable
    @ReadOnlyComposable
    fun titleColor() =
        CupertinoTheme.colorScheme.secondaryLabel

    @Composable
    @ReadOnlyComposable
    fun titleTextStyle(style: SectionStyle) =
        if (style.grouped)
            CupertinoTheme.typography.footnote
        else CupertinoTheme.typography.subhead
            .copy(fontWeight = FontWeight.SemiBold)

     @Composable
     @ReadOnlyComposable
     fun captionTextStyle(style: SectionStyle) =
         if (style.grouped)
             CupertinoTheme.typography.footnote
         else CupertinoTheme.typography.body

    @Composable
    @ReadOnlyComposable
    fun captionColor(style: SectionStyle) =
        if (style.grouped)
            CupertinoTheme.colorScheme.secondaryLabel
        else CupertinoTheme.colorScheme.label

    @Composable
    @ReadOnlyComposable
    fun color() = CupertinoTheme.colorScheme.secondarySystemGroupedBackground

    @Composable
    @ReadOnlyComposable
    fun containerColor(style: SectionStyle) = if (style.shouldFillContainer)
        color()
    else CupertinoTheme.colorScheme.systemGroupedBackground
}


internal object SectionTokens {

    val SplitPadding = 12.dp
    val InlinePadding = 6.dp
    val VerticalPadding = 8.dp
    val HorizontalPadding = 18.dp
    val MinHeight = 45.dp
    val DividerPadding = HorizontalPadding
    val DividerPaddingWithIcon= DividerPadding + MinHeight + InlinePadding
}