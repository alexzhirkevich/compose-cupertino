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
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoIconDefaults
import io.github.alexzhirkevich.cupertino.copy
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.filled.XmarkCircle
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronBackward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronForward
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@Immutable
object CupertinoSectionDefaults {

    val PaddingValues = PaddingValues(
        horizontal = CupertinoSectionTokens.HorizontalPadding,
        vertical = CupertinoSectionTokens.VerticalPadding
    )

    val DividerPadding = CupertinoSectionTokens.HorizontalPadding

    val DividerPaddingWithIcon =
        DividerPadding + CupertinoSectionTokens.MinHeight + CupertinoSectionTokens.InlinePadding

    val Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.secondarySystemGroupedBackground

    val EnterTransition = slideInVertically { -it } +
            expandVertically(expandFrom = Alignment.Bottom)

    val ExitTransition = slideOutVertically { -it } +
            shrinkVertically(shrinkTowards = Alignment.Top)

    @Composable
    @ReadOnlyComposable
    fun paddingValues(
        style: SectionStyle,
        includePaddingBetweenSections: Boolean
    ): PaddingValues {
        val default = if (style.inset && style.grouped)
            PaddingValues
        else ZeroPaddingValues

        return if (includePaddingBetweenSections)
            default.copy(
                top = CupertinoSectionTokens.SplitPadding,
                bottom = CupertinoSectionTokens.SplitPadding
            ) else default
    }

    @Composable
    @ReadOnlyComposable
    fun shape(style: SectionStyle = LocalSectionStyle.current): CornerBasedShape =
        if (style.grouped && style.inset)
            CupertinoTheme.shapes.medium
        else RoundedCornerShape(0)

    @Composable
    @ReadOnlyComposable
    fun titleColor(style: SectionStyle) = if (style == SectionStyle.Sidebar)
        CupertinoTheme.colorScheme.label else
        CupertinoTheme.colorScheme.secondaryLabel

    @Composable
    @ReadOnlyComposable
    fun titleTextStyle(style: SectionStyle = LocalSectionStyle.current) =
        when {
            style == SectionStyle.Sidebar -> CupertinoTheme.typography.title3.copy(
                fontWeight = FontWeight.Bold
            )
            style.grouped -> CupertinoTheme.typography.footnote
            else ->CupertinoTheme.typography.subhead
                .copy(fontWeight = FontWeight.SemiBold)
        }

    @Composable
    @ReadOnlyComposable
    fun captionTextStyle(style: SectionStyle = LocalSectionStyle.current) =
        if (style.grouped)
            CupertinoTheme.typography.footnote
        else CupertinoTheme.typography.body

    @Composable
    @ReadOnlyComposable
    fun captionColor(style: SectionStyle = LocalSectionStyle.current) =
        if (style.grouped)
            CupertinoTheme.colorScheme.secondaryLabel
        else CupertinoTheme.colorScheme.label

    @Composable
    @ReadOnlyComposable
    fun containerColor(style: SectionStyle) = if (style.shouldFillContainer)
        Color else
        CupertinoTheme.colorScheme.systemGroupedBackground

    @Composable
    fun PickerButton(
        modifier: Modifier,
        expanded: Boolean,
        shape: Shape = CupertinoTheme.shapes.small,
        containerColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        activeContentColor: Color = CupertinoTheme.colorScheme.accent,
        contentColor: Color = CupertinoTheme.colorScheme.label,
        title: @Composable () -> Unit,
    ) {
        Box(
            modifier = modifier
                .clip(shape)
                .background(containerColor.takeOrElse { CupertinoTheme.colorScheme.quaternarySystemFill })
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            CompositionLocalProvider(
                LocalContentColor provides if (expanded)
                    activeContentColor.takeOrElse { CupertinoTheme.colorScheme.accent }
                else contentColor.takeOrElse { CupertinoTheme.colorScheme.label }
            ) {
                title()
            }
        }
    }

    /**
     * Default label trailing icon - chevron
     * */
    @Composable
    fun LabelChevron() {
        CupertinoIcon(
            imageVector = if (LocalLayoutDirection.current == LayoutDirection.Ltr)
                CupertinoIcons.Default.ChevronBackward else CupertinoIcons.Default.ChevronForward,
            contentDescription = null,
            modifier = Modifier
                .height(CupertinoIconDefaults.SmallSize)
                .rotate(180f)
        )
    }


    @Composable
    fun TextFieldClearButton(
        visible : Boolean,
        onClick : () -> Unit
    ) {
        AnimatedVisibility(
            visible = visible,
            enter = fadeIn() + scaleIn(initialScale = .75f),
            exit = fadeOut() + scaleOut(targetScale = .75f)
        ) {
            CupertinoIcon(
                imageVector = CupertinoIcons.Filled.XmarkCircle,
                contentDescription = "Clear",
                modifier = Modifier
                    .pointerInput(0){
                        detectTapGestures {
                            onClick()
                        }
                    }
                    .size(CupertinoIconDefaults.MediumSize),
                tint = CupertinoTheme.colorScheme.tertiaryLabel
            )
        }
    }
}


internal object CupertinoSectionTokens {

    val SplitPadding = 12.dp
    val InlinePadding = 6.dp
    val VerticalPadding = 8.dp
    val HorizontalPadding = 18.dp
    val MinHeight = 45.dp
}

private val ZeroPaddingValues = PaddingValues(0.dp)