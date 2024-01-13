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

public val CupertinoIcons.Outlined.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 27.7266.dp, defaultHeight = 21.7852.dp,
                viewportWidth = 27.7266f, viewportHeight = 21.7852f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4961f, 7.3711f)
                curveTo(5.4023f, 7.7813f, 5.5781f, 7.9453f, 6.0234f, 7.9219f)
                curveTo(7.8984f, 7.793f, 10.125f, 7.6875f, 13.8633f, 7.6875f)
                curveTo(17.6133f, 7.6875f, 19.8398f, 7.793f, 21.7148f, 7.9219f)
                curveTo(22.1484f, 7.9453f, 22.3242f, 7.7813f, 22.2305f, 7.3711f)
                curveTo(21.9492f, 6.1289f, 21.4102f, 4.5117f, 21.0352f, 3.8672f)
                curveTo(20.7305f, 3.3398f, 20.3906f, 3.1055f, 19.7812f, 3.0234f)
                curveTo(18.9375f, 2.9063f, 17.0156f, 2.8242f, 13.8633f, 2.8242f)
                curveTo(10.7227f, 2.8242f, 8.8008f, 2.9063f, 7.9453f, 3.0234f)
                curveTo(7.3359f, 3.1055f, 6.9961f, 3.3398f, 6.6914f, 3.8672f)
                curveTo(6.3164f, 4.5117f, 5.7891f, 6.1289f, 5.4961f, 7.3711f)
                close()
                moveTo(5.4141f, 15.3516f)
                curveTo(6.4805f, 15.3516f, 7.3008f, 14.5312f, 7.3008f, 13.4648f)
                curveTo(7.3008f, 12.3867f, 6.4805f, 11.5781f, 5.4141f, 11.5781f)
                curveTo(4.3477f, 11.5781f, 3.5273f, 12.3867f, 3.5273f, 13.4648f)
                curveTo(3.5273f, 14.5312f, 4.3477f, 15.3516f, 5.4141f, 15.3516f)
                close()
                moveTo(10.7695f, 14.8828f)
                lineTo(16.9688f, 14.8828f)
                curveTo(17.7656f, 14.8828f, 18.3164f, 14.332f, 18.3164f, 13.5234f)
                curveTo(18.3164f, 12.7266f, 17.7656f, 12.1758f, 16.9688f, 12.1758f)
                lineTo(10.7695f, 12.1758f)
                curveTo(9.9609f, 12.1758f, 9.4102f, 12.7266f, 9.4102f, 13.5234f)
                curveTo(9.4102f, 14.332f, 9.9609f, 14.8828f, 10.7695f, 14.8828f)
                close()
                moveTo(22.3125f, 15.3516f)
                curveTo(23.3906f, 15.3516f, 24.1992f, 14.5312f, 24.1992f, 13.4648f)
                curveTo(24.1992f, 12.3867f, 23.3906f, 11.5781f, 22.3125f, 11.5781f)
                curveTo(21.2461f, 11.5781f, 20.4375f, 12.3867f, 20.4375f, 13.4648f)
                curveTo(20.4375f, 14.5312f, 21.2461f, 15.3516f, 22.3125f, 15.3516f)
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
                moveTo(13.8633f, 16.9805f)
                curveTo(9.8789f, 16.9805f, 4.7695f, 16.793f, 2.8828f, 16.5586f)
                curveTo(1.8867f, 16.4414f, 1.5352f, 15.9258f, 1.5352f, 15.0352f)
                lineTo(1.5352f, 13.4414f)
                curveTo(1.5352f, 11.8359f, 1.793f, 11.0859f, 2.707f, 9.8906f)
                lineTo(3.9023f, 8.3203f)
                curveTo(4.2188f, 6.6211f, 4.9805f, 4.2539f, 5.4844f, 3.1758f)
                curveTo(5.8594f, 2.3672f, 6.5977f, 1.8633f, 7.6641f, 1.7344f)
                curveTo(8.4141f, 1.6406f, 10.793f, 1.5352f, 13.8633f, 1.5352f)
                curveTo(16.9453f, 1.5352f, 19.3594f, 1.6406f, 20.0391f, 1.7344f)
                curveTo(21.1406f, 1.875f, 21.8672f, 2.3789f, 22.2539f, 3.1758f)
                curveTo(22.7578f, 4.2539f, 23.5195f, 6.6211f, 23.8242f, 8.3203f)
                lineTo(25.0312f, 9.8906f)
                curveTo(25.9336f, 11.0859f, 26.1914f, 11.8359f, 26.1914f, 13.4414f)
                lineTo(26.1914f, 15.0352f)
                curveTo(26.1914f, 15.9258f, 25.8398f, 16.4414f, 24.8438f, 16.5586f)
                curveTo(22.9688f, 16.793f, 17.8477f, 16.9805f, 13.8633f, 16.9805f)
                close()
                moveTo(2.1563f, 21.7383f)
                lineTo(3.5273f, 21.7383f)
                curveTo(4.4063f, 21.7383f, 5.0859f, 21.0586f, 5.0859f, 20.1914f)
                lineTo(5.0859f, 17.4023f)
                lineTo(0.5977f, 16.7578f)
                lineTo(0.5977f, 20.1914f)
                curveTo(0.5977f, 21.0586f, 1.2773f, 21.7383f, 2.1563f, 21.7383f)
                close()
                moveTo(24.1992f, 21.7383f)
                lineTo(25.582f, 21.7383f)
                curveTo(26.4609f, 21.7383f, 27.1289f, 21.0586f, 27.1289f, 20.1914f)
                lineTo(27.1289f, 16.7578f)
                lineTo(22.6523f, 17.4023f)
                lineTo(22.6523f, 20.1914f)
                curveTo(22.6523f, 21.0586f, 23.3203f, 21.7383f, 24.1992f, 21.7383f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
