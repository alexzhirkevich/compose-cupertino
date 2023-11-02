package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@Composable
@NonRestartableComposable
fun Separator(
    modifier: Modifier = Modifier,
    thickness : Dp = Dp.Hairline,
    color : Color = CupertinoTheme.colorScheme.opaqueSeparator
) {

    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }
    Spacer(
        modifier
            .fillMaxWidth()
            .height(targetThickness)
            .background(color = color)
    )
}

@Composable
@NonRestartableComposable
fun VerticalSeparator(
    modifier: Modifier = Modifier,
    thickness : Dp = Dp.Hairline,
    color : Color = CupertinoTheme.colorScheme.opaqueSeparator
) {
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }

    Spacer(
        modifier
            .fillMaxHeight()
            .width(targetThickness)
            .background(color = color)
    )
}