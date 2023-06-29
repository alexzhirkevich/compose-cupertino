package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter


@Composable
actual fun AdaptiveIcon(
    painter: Painter,
    systemName: String?,
    contentDescription: String?,
    modifier: Modifier,
    tint: Color
) {

    val systemPainter = remember(systemName) {
        if (systemName != null)
            BitmapPainter(ImageBitmapWithSystemName(systemName))
        else null
    }

    Icon(
        painter = systemPainter ?: painter,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}

@Composable
actual fun AdaptiveIcon(
    imageVector: ImageVector,
    systemName: String?,
    contentDescription: String?,
    modifier: Modifier,
    tint: Color
) {
    AdaptiveIcon(
        painter = rememberVectorPainter(imageVector),
        systemName = systemName,
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
    AdaptiveIcon(
        painter = remember(bitmap) { BitmapPainter(bitmap) },
        systemName = systemName,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}