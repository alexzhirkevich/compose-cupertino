package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme

@Composable
@NonRestartableComposable
fun CupertinoDivider(
    modifier: Modifier = Modifier,
    thickness : Dp = .5.dp,
    color : Color = AdaptiveTheme.colorScheme
        .outlineVariant.copy(alpha = .25f)
) {
    Divider(
        modifier = modifier,
        thickness = thickness,
        color = color
    )
}

@Composable
@NonRestartableComposable
fun CupertinoVerticalDivider(
    modifier: Modifier = Modifier,
    thickness : Dp = .5.dp,
    color : Color = AdaptiveTheme.colorScheme
        .outlineVariant.copy(alpha = .25f)
) {
    VerticalDivider(
        modifier = modifier,
        thickness = thickness,
        color = color
    )
}

@Composable
internal fun VerticalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: Color = DividerDefaults.color,
) {
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }
    Box(
        modifier
            .fillMaxHeight()
            .width(targetThickness)
            .background(color = color)
    )
}