package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
actual fun AdaptiveIcon(
    imageVector: ImageVector,
    systemName: String?,
    contentDescription: String?,
    modifier: Modifier,
    tint: Color
) {
    Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}

@Composable
actual fun AdaptiveIcon(
    bitmap: ImageBitmap,
    systemName: String?,
    contentDescription: String?,
    modifier: Modifier,
    tint: Color
) {
    Icon(
        bitmap = bitmap,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}

@Composable
actual fun AdaptiveIcon(
    painter: Painter,
    systemName: String?,
    contentDescription: String?,
    modifier: Modifier,
    tint: Color
) {
    Icon(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}