package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.MediumCupertinoIconSize
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White

/**
 * Icon with colored background and rounded corners often used in [CupertinoSection] label
 *
 * @param painter icon [Painter]
 * @param containerColor icon background color
 * @param tint icon tint
 * @param contentDescription icon content description
 *
 * @see CupertinoIcon
 * */
@Composable
fun CupertinoLabelIcon(
    painter : Painter,
    modifier: Modifier = Modifier,
    containerColor: Color = CupertinoLabelIconDefaults.ContainerColor,
    tint : Color = CupertinoLabelIconDefaults.Tint,
    shape: Shape = CupertinoLabelIconDefaults.Shape,
    contentDescription : String? = null
) =  CupertinoIcon(
    painter = painter,
    contentDescription = contentDescription,
    tint = tint,
    modifier = modifier
        .clip(shape)
        .background(containerColor)
        .padding(6.dp)
        .size(MediumCupertinoIconSize)
)

/**
 * Icon with colored background and rounded corners often used in [CupertinoSection] label
 *
 * @param imageVector icon [ImageVector]
 * @param containerColor icon background color
 * @param tint icon tint
 * @param contentDescription icon content description
 *
 * @see CupertinoIcon
 * */
@Composable
fun CupertinoLabelIcon(
    imageVector : ImageVector,
    modifier: Modifier = Modifier,
    containerColor: Color = CupertinoLabelIconDefaults.ContainerColor,
    tint : Color = CupertinoLabelIconDefaults.Tint,
    shape: Shape = CupertinoLabelIconDefaults.Shape,
    contentDescription : String? = null
) = CupertinoLabelIcon(
    painter = rememberVectorPainter(imageVector),
    modifier = modifier,
    containerColor = containerColor,
    tint = tint,
    shape = shape,
    contentDescription = contentDescription
)

/**
 * Icon with colored background and rounded corners often used in [CupertinoSection] label
 *
 * @param bitmap icon [ImageBitmap]
 * @param containerColor icon background color
 * @param tint icon tint
 * @param contentDescription icon content description
 *
 * @see CupertinoIcon
 * */
@Composable
fun CupertinoLabelIcon(
    bitmap: ImageBitmap,
    modifier: Modifier = Modifier,
    containerColor: Color = CupertinoLabelIconDefaults.ContainerColor,
    tint : Color = CupertinoLabelIconDefaults.Tint,
    shape: Shape = CupertinoLabelIconDefaults.Shape,
    contentDescription : String? = null
) = CupertinoLabelIcon(
    painter = remember(bitmap) { BitmapPainter(bitmap) },
    modifier = modifier,
    containerColor = containerColor,
    tint = tint,
    shape = shape,
    contentDescription = contentDescription
)

object CupertinoLabelIconDefaults {

    val ContainerColor: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.accent

    val Tint: Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoColors.White


    val Shape: Shape
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.shapes.small
}
