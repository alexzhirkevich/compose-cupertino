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

package io.github.alexzhirkevich.cupertino.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.ArrowLeftArrowRight: ImageVector
    get() {
        if (_arrowLeftArrowRight != null) {
            return _arrowLeftArrowRight!!
        }
        _arrowLeftArrowRight = Builder(name = "ArrowLeftArrowRight", defaultWidth = 22.6129.dp,
                defaultHeight = 27.6914.dp, viewportWidth = 22.6129f, viewportHeight =
                27.6914f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3516f, 6.2461f)
                curveTo(-0.1289f, 6.7031f, -0.1054f, 7.3828f, 0.3516f, 7.8164f)
                lineTo(6.3868f, 13.7227f)
                curveTo(6.5977f, 13.9336f, 6.9024f, 14.0625f, 7.1602f, 14.0625f)
                curveTo(7.7813f, 14.0625f, 8.2032f, 13.6289f, 8.2032f, 13.0195f)
                curveTo(8.2032f, 12.7266f, 8.0977f, 12.4922f, 7.8985f, 12.293f)
                lineTo(5.379f, 9.8555f)
                lineTo(3.1993f, 7.9688f)
                lineTo(5.9063f, 8.0859f)
                lineTo(21.5626f, 8.0859f)
                curveTo(22.1719f, 8.0859f, 22.6055f, 7.6523f, 22.6055f, 7.0313f)
                curveTo(22.6055f, 6.4219f, 22.1719f, 5.9883f, 21.5626f, 5.9883f)
                lineTo(5.9063f, 5.9883f)
                lineTo(3.1993f, 6.0938f)
                lineTo(5.379f, 4.2188f)
                lineTo(7.8985f, 1.7695f)
                curveTo(8.0977f, 1.5703f, 8.2032f, 1.3477f, 8.2032f, 1.043f)
                curveTo(8.2032f, 0.4336f, 7.7813f, 0.0117f, 7.1602f, 0.0117f)
                curveTo(6.9024f, 0.0117f, 6.5977f, 0.1289f, 6.3868f, 0.3398f)
                close()
                moveTo(22.2657f, 21.457f)
                curveTo(22.7344f, 21.0f, 22.7227f, 20.3203f, 22.2657f, 19.875f)
                lineTo(16.2305f, 13.9688f)
                curveTo(16.0196f, 13.7695f, 15.7149f, 13.6406f, 15.4454f, 13.6406f)
                curveTo(14.8243f, 13.6406f, 14.4141f, 14.0625f, 14.4141f, 14.6719f)
                curveTo(14.4141f, 14.9766f, 14.5079f, 15.2109f, 14.7071f, 15.3984f)
                lineTo(17.2383f, 17.8477f)
                lineTo(19.418f, 19.7344f)
                lineTo(16.711f, 19.6172f)
                lineTo(1.0547f, 19.6172f)
                curveTo(0.4454f, 19.6172f, 1.0E-4f, 20.0508f, 1.0E-4f, 20.6602f)
                curveTo(1.0E-4f, 21.2812f, 0.4454f, 21.7148f, 1.0547f, 21.7148f)
                lineTo(16.711f, 21.7148f)
                lineTo(19.418f, 21.5977f)
                lineTo(17.2383f, 23.4844f)
                lineTo(14.7071f, 25.9219f)
                curveTo(14.5079f, 26.1211f, 14.4141f, 26.3555f, 14.4141f, 26.6602f)
                curveTo(14.4141f, 27.2695f, 14.8243f, 27.6914f, 15.4454f, 27.6914f)
                curveTo(15.7149f, 27.6914f, 16.0196f, 27.5625f, 16.2305f, 27.3633f)
                close()
            }
        }
        .build()
        return _arrowLeftArrowRight!!
    }

private var _arrowLeftArrowRight: ImageVector? = null
