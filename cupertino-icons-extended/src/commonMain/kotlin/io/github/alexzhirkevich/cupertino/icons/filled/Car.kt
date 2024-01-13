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

public val CupertinoIcons.Filled.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 27.7266.dp, defaultHeight = 21.7852.dp,
                viewportWidth = 27.7266f, viewportHeight = 21.7852f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8398f, 6.6914f)
                curveTo(5.1094f, 5.4141f, 5.6836f, 3.7383f, 6.0703f, 3.0586f)
                curveTo(6.3867f, 2.5078f, 6.7266f, 2.2617f, 7.3594f, 2.1797f)
                curveTo(8.25f, 2.0625f, 10.2422f, 1.9805f, 13.8633f, 1.9805f)
                curveTo(17.4961f, 1.9805f, 19.4883f, 2.0391f, 20.3672f, 2.1797f)
                curveTo(21.0f, 2.2734f, 21.3281f, 2.5078f, 21.6562f, 3.0586f)
                curveTo(22.0547f, 3.7266f, 22.5938f, 5.4141f, 22.8984f, 6.6914f)
                curveTo(23.0039f, 7.125f, 22.8164f, 7.2891f, 22.3711f, 7.2656f)
                curveTo(20.4258f, 7.1367f, 18.1055f, 7.0195f, 13.8633f, 7.0195f)
                curveTo(9.6328f, 7.0195f, 7.3125f, 7.1367f, 5.3672f, 7.2656f)
                curveTo(4.9102f, 7.2891f, 4.7344f, 7.125f, 4.8398f, 6.6914f)
                close()
                moveTo(5.4141f, 15.3516f)
                curveTo(4.3477f, 15.3516f, 3.5273f, 14.5312f, 3.5273f, 13.4648f)
                curveTo(3.5273f, 12.3867f, 4.3477f, 11.5781f, 5.4141f, 11.5781f)
                curveTo(6.4805f, 11.5781f, 7.3008f, 12.3867f, 7.3008f, 13.4648f)
                curveTo(7.3008f, 14.5312f, 6.4805f, 15.3516f, 5.4141f, 15.3516f)
                close()
                moveTo(10.7695f, 14.8828f)
                curveTo(9.9609f, 14.8828f, 9.4102f, 14.332f, 9.4102f, 13.5234f)
                curveTo(9.4102f, 12.7266f, 9.9609f, 12.1758f, 10.7695f, 12.1758f)
                lineTo(16.9688f, 12.1758f)
                curveTo(17.7656f, 12.1758f, 18.3164f, 12.7266f, 18.3164f, 13.5234f)
                curveTo(18.3164f, 14.332f, 17.7656f, 14.8828f, 16.9688f, 14.8828f)
                close()
                moveTo(22.3125f, 15.3516f)
                curveTo(21.2461f, 15.3516f, 20.4375f, 14.5312f, 20.4375f, 13.4648f)
                curveTo(20.4375f, 12.3867f, 21.2461f, 11.5781f, 22.3125f, 11.5781f)
                curveTo(23.3906f, 11.5781f, 24.1992f, 12.3867f, 24.1992f, 13.4648f)
                curveTo(24.1992f, 14.5312f, 23.3906f, 15.3516f, 22.3125f, 15.3516f)
                close()
                moveTo(13.8633f, 18.5156f)
                curveTo(17.8008f, 18.5156f, 23.0391f, 18.3164f, 25.2539f, 18.0586f)
                curveTo(26.8477f, 17.8828f, 27.7266f, 17.0039f, 27.7266f, 15.5039f)
                lineTo(27.7266f, 13.4414f)
                curveTo(27.7266f, 11.4609f, 27.3281f, 10.3594f, 26.25f, 8.9531f)
                lineTo(25.2539f, 7.6758f)
                curveTo(24.832f, 5.5664f, 24.0469f, 3.3516f, 23.6484f, 2.4844f)
                curveTo(23.0156f, 1.1602f, 21.8086f, 0.375f, 20.25f, 0.1641f)
                curveTo(19.4648f, 0.0586f, 16.8984f, 0.0f, 13.8633f, 0.0f)
                curveTo(10.8398f, 0.0f, 8.2734f, 0.0703f, 7.4883f, 0.1641f)
                curveTo(5.9297f, 0.3516f, 4.7109f, 1.1602f, 4.0898f, 2.4844f)
                curveTo(3.6797f, 3.3516f, 2.9063f, 5.5664f, 2.4727f, 7.6758f)
                lineTo(1.4883f, 8.9531f)
                curveTo(0.3984f, 10.3594f, 0.0f, 11.4609f, 0.0f, 13.4414f)
                lineTo(0.0f, 15.5039f)
                curveTo(0.0f, 17.0039f, 0.8906f, 17.8828f, 2.4727f, 18.0586f)
                curveTo(4.6992f, 18.3164f, 9.9258f, 18.5156f, 13.8633f, 18.5156f)
                close()
                moveTo(1.5586f, 21.7383f)
                lineTo(2.9297f, 21.7383f)
                curveTo(3.8086f, 21.7383f, 4.4883f, 21.0586f, 4.4883f, 20.1914f)
                lineTo(4.4883f, 17.2734f)
                lineTo(0.0f, 15.1406f)
                lineTo(0.0f, 20.1914f)
                curveTo(0.0f, 21.0586f, 0.6797f, 21.7383f, 1.5586f, 21.7383f)
                close()
                moveTo(24.7969f, 21.7383f)
                lineTo(26.1797f, 21.7383f)
                curveTo(27.0586f, 21.7383f, 27.7266f, 21.0586f, 27.7266f, 20.1914f)
                lineTo(27.7266f, 15.1406f)
                lineTo(23.25f, 17.2734f)
                lineTo(23.25f, 20.1914f)
                curveTo(23.25f, 21.0586f, 23.918f, 21.7383f, 24.7969f, 21.7383f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
