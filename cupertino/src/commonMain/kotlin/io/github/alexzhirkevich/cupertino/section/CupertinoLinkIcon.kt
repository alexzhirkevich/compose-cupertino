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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
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
import io.github.alexzhirkevich.cupertino.CupertinoIconDefaults
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
fun CupertinoLinkIcon(
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
        .size(CupertinoIconDefaults.MediumSize)
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
fun CupertinoLinkIcon(
    imageVector : ImageVector,
    modifier: Modifier = Modifier,
    containerColor: Color = CupertinoLabelIconDefaults.ContainerColor,
    tint : Color = CupertinoLabelIconDefaults.Tint,
    shape: Shape = CupertinoLabelIconDefaults.Shape,
    contentDescription : String? = null
) = CupertinoLinkIcon(
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
fun CupertinoLinkIcon(
    bitmap: ImageBitmap,
    modifier: Modifier = Modifier,
    containerColor: Color = CupertinoLabelIconDefaults.ContainerColor,
    tint : Color = CupertinoLabelIconDefaults.Tint,
    shape: Shape = CupertinoLabelIconDefaults.Shape,
    contentDescription : String? = null
) = CupertinoLinkIcon(
    painter = remember(bitmap) { BitmapPainter(bitmap) },
    modifier = modifier,
    containerColor = containerColor,
    tint = tint,
    shape = shape,
    contentDescription = contentDescription
)

@Immutable
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
