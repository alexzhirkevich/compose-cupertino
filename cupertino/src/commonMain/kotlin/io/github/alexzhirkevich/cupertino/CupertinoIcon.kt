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

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor

/**
 * A Material Design icon component that draws [imageVector] using [tint], with a default value
 * of [LocalContentColor]. If [imageVector] has no intrinsic size, this component will use the
 * recommended default size. Icon is an opinionated component designed to be used with single-color
 * icons so that they can be tinted correctly for the component they are placed in. For multicolored
 * icons and icons that should not be tinted, use [Color.Unspecified] for [tint]. For generic images
 * that should not be tinted, and do not follow the recommended icon size, use the generic
 * [androidx.compose.foundation.Image] instead. For a clickable icon, see [CupertinoIconButton].
 *
 * To learn more about icons, see [Material Design icons](https://m3.material.io/styles/icons/overview)
 *
 * @param imageVector [ImageVector] to draw inside this icon
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents.
 * @param modifier the [Modifier] to be applied to this icon
 * @param tint tint to be applied to [imageVector]. If [Color.Unspecified] is provided, then no tint
 * is applied.
 */
@Composable
fun CupertinoIcon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
) {
    CupertinoIcon(
        painter = rememberVectorPainter(imageVector),
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}

/**
 * A Material Design icon component that draws [bitmap] using [tint], with a default value
 * of [LocalContentColor]. If [bitmap] has no intrinsic size, this component will use the
 * recommended default size. Icon is an opinionated component designed to be used with single-color
 * icons so that they can be tinted correctly for the component they are placed in. For multicolored
 * icons and icons that should not be tinted, use [Color.Unspecified] for [tint]. For generic images
 * that should not be tinted, and do not follow the recommended icon size, use the generic
 * [androidx.compose.foundation.Image] instead. For a clickable icon, see [CupertinoIconButton].
 *
 * To learn more about icons, see [Material Design icons](https://m3.material.io/styles/icons/overview)
 *
 * @param bitmap [ImageBitmap] to draw inside this icon
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents.
 * @param modifier the [Modifier] to be applied to this icon
 * @param tint tint to be applied to [bitmap]. If [Color.Unspecified] is provided, then no tint is
 * applied.
 */
@Composable
fun CupertinoIcon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
) {
    val painter = remember(bitmap) { BitmapPainter(bitmap) }
    CupertinoIcon(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}

/**
 * A Material Design icon component that draws [painter] using [tint], with a default value
 * of [LocalContentColor]. If [painter] has no intrinsic size, this component will use the
 * recommended default size. Icon is an opinionated component designed to be used with single-color
 * icons so that they can be tinted correctly for the component they are placed in. For multicolored
 * icons and icons that should not be tinted, use [Color.Unspecified] for [tint]. For generic images
 * that should not be tinted, and do not follow the recommended icon size, use the generic
 * [androidx.compose.foundation.Image] instead. For a clickable icon, see [CupertinoIconButton].
 *
 * To learn more about icons, see [Material Design icons](https://m3.material.io/styles/icons/overview)
 *
 * @param painter [Painter] to draw inside this icon
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents.
 * @param modifier the [Modifier] to be applied to this icon
 * @param tint tint to be applied to [painter]. If [Color.Unspecified] is provided, then no tint is
 * applied.
 */
@Composable
fun CupertinoIcon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
) {
    val colorFilter = if (tint == Color.Unspecified) null else ColorFilter.tint(tint)
    val semantics =
        if (contentDescription != null) {
            Modifier.semantics {
                this.contentDescription = contentDescription
                this.role = Role.Image
            }
        } else {
            Modifier
        }
    Box(
        modifier = modifier
            .toolingGraphicsLayer()
            .defaultSizeFor(painter)
            .paint(painter, colorFilter = colorFilter, contentScale = ContentScale.Fit)
            .then(semantics)
    )
}

private fun Modifier.defaultSizeFor(painter: Painter) =
    this.then(
        if (painter.intrinsicSize == Size.Unspecified || painter.intrinsicSize.isInfinite()) {
            DefaultIconSizeModifier
        } else {
            Modifier
        }
    )

private fun Size.isInfinite() = width.isInfinite() && height.isInfinite()

@Immutable
object CupertinoIconDefaults {
    val LargeSize = 24.dp
    val MediumSize = 20.dp
    val SmallSize = 14.dp
}

// Default icon size, for icons with no intrinsic size information
private val DefaultIconSizeModifier = Modifier.size(CupertinoIconDefaults.LargeSize)
