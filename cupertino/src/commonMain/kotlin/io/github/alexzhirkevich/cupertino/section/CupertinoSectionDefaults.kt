package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

object CupertinoSectionDefaults {
    val paddingValues = PaddingValues(
        horizontal = SectionTokens.HorizontalPadding,
        vertical = SectionTokens.VerticalPadding
    )

    val Shape: CornerBasedShape
        @Composable
        get() = CupertinoTheme.shapes.medium

    @Composable
    fun titleColor() =
        CupertinoTheme.colorScheme.secondaryLabel

    @Composable
    fun titleTextStyle(style: SectionStyle) =
        if (style.grouped)
            CupertinoTheme.typography.footnote
        else CupertinoTheme.typography.subhead
            .copy(fontWeight = FontWeight.SemiBold)

     @Composable
    fun captionTextStyle(style: SectionStyle) =
         if (style.grouped)
             CupertinoTheme.typography.footnote
         else CupertinoTheme.typography.body

    @Composable
    fun captionColor(style: SectionStyle) =
        if (style.grouped)
            CupertinoTheme.colorScheme.secondaryLabel
        else CupertinoTheme.colorScheme.label

    @Composable
    fun color() = CupertinoTheme.colorScheme.secondarySystemGroupedBackground

    @Composable
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