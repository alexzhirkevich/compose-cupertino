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

package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.PhotoStack: ImageVector
    get() {
        if (_photoStack != null) {
            return _photoStack!!
        }
        _photoStack = Builder(name = "PhotoStack", defaultWidth = 24.082.dp, defaultHeight =
                25.4883.dp, viewportWidth = 24.082f, viewportHeight = 25.4883f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5664f, 15.8906f)
                curveTo(7.1367f, 15.8906f, 5.9883f, 14.707f, 5.9883f, 13.2891f)
                curveTo(5.9883f, 11.8828f, 7.1367f, 10.7227f, 8.5664f, 10.7227f)
                curveTo(9.9844f, 10.7227f, 11.1445f, 11.8828f, 11.1445f, 13.2891f)
                curveTo(11.1445f, 14.707f, 9.9844f, 15.8906f, 8.5664f, 15.8906f)
                close()
                moveTo(3.6328f, 23.5898f)
                curveTo(2.5078f, 23.5898f, 1.8867f, 22.9805f, 1.8867f, 21.8086f)
                lineTo(1.8867f, 20.6719f)
                lineTo(4.6289f, 18.2695f)
                curveTo(5.0977f, 17.8711f, 5.543f, 17.6484f, 6.0352f, 17.6484f)
                curveTo(6.5508f, 17.6484f, 7.043f, 17.8711f, 7.5f, 18.2812f)
                lineTo(9.457f, 20.0273f)
                lineTo(14.3672f, 15.7031f)
                curveTo(14.8828f, 15.2461f, 15.4102f, 15.0586f, 16.0078f, 15.0586f)
                curveTo(16.5938f, 15.0586f, 17.1797f, 15.2695f, 17.6602f, 15.7148f)
                lineTo(22.1953f, 19.9805f)
                lineTo(22.1953f, 21.8086f)
                curveTo(22.1953f, 22.9805f, 21.5508f, 23.5898f, 20.4375f, 23.5898f)
                close()
                moveTo(3.5625f, 25.4766f)
                lineTo(20.5195f, 25.4766f)
                curveTo(22.875f, 25.4766f, 24.082f, 24.2812f, 24.082f, 21.9492f)
                lineTo(24.082f, 10.1602f)
                curveTo(24.082f, 7.8281f, 22.875f, 6.6445f, 20.5195f, 6.6445f)
                lineTo(3.5625f, 6.6445f)
                curveTo(1.1836f, 6.6445f, 0.0f, 7.8281f, 0.0f, 10.1602f)
                lineTo(0.0f, 21.9492f)
                curveTo(0.0f, 24.2812f, 1.1836f, 25.4766f, 3.5625f, 25.4766f)
                close()
                moveTo(2.2383f, 4.7578f)
                lineTo(21.8555f, 4.7578f)
                curveTo(21.6797f, 3.6914f, 21.1758f, 3.1055f, 20.0039f, 3.1055f)
                lineTo(4.0898f, 3.1055f)
                curveTo(2.918f, 3.1055f, 2.4141f, 3.6914f, 2.2383f, 4.7578f)
                close()
                moveTo(4.6523f, 1.5117f)
                lineTo(19.4414f, 1.5117f)
                curveTo(19.3711f, 0.5156f, 18.8086f, 0.0f, 17.7188f, 0.0f)
                lineTo(6.3633f, 0.0f)
                curveTo(5.2852f, 0.0f, 4.7227f, 0.5156f, 4.6523f, 1.5117f)
                close()
            }
        }
        .build()
        return _photoStack!!
    }

private var _photoStack: ImageVector? = null
