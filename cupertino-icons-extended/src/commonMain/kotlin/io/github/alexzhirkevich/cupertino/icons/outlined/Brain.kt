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

public val CupertinoIcons.Outlined.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 30.8438.dp, defaultHeight = 25.9805.dp,
                viewportWidth = 30.8438f, viewportHeight = 25.9805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.1289f)
                curveTo(0.0f, 16.4062f, 2.9297f, 19.2422f, 7.3242f, 19.2422f)
                curveTo(11.6484f, 19.2422f, 14.543f, 16.6992f, 14.543f, 12.8672f)
                curveTo(14.543f, 11.2617f, 13.9805f, 9.9727f, 13.043f, 9.1758f)
                curveTo(12.6094f, 8.8125f, 12.3633f, 8.6953f, 11.9531f, 8.6953f)
                curveTo(11.4141f, 8.6953f, 11.0391f, 9.0234f, 11.0391f, 9.5039f)
                curveTo(11.0391f, 10.0898f, 11.3789f, 10.2422f, 11.918f, 10.7344f)
                curveTo(12.4102f, 11.2148f, 12.6914f, 11.9414f, 12.6914f, 12.832f)
                curveTo(12.6914f, 15.5508f, 10.5586f, 17.3672f, 7.3594f, 17.3672f)
                curveTo(4.0781f, 17.3672f, 1.8867f, 15.2695f, 1.8867f, 12.1172f)
                curveTo(1.8867f, 10.3125f, 2.8008f, 8.6016f, 4.3008f, 7.6406f)
                lineTo(3.3633f, 6.0117f)
                curveTo(1.2773f, 7.3125f, 0.0f, 9.6445f, 0.0f, 12.1289f)
                close()
                moveTo(3.1641f, 6.0234f)
                curveTo(3.1641f, 8.6367f, 4.9805f, 10.5f, 7.8516f, 10.5f)
                curveTo(8.3555f, 10.5f, 8.7891f, 10.0664f, 8.7891f, 9.5625f)
                curveTo(8.7891f, 9.0469f, 8.3555f, 8.6133f, 7.8516f, 8.6133f)
                curveTo(6.1172f, 8.6133f, 5.0508f, 7.5234f, 5.0508f, 6.0234f)
                curveTo(5.0508f, 4.3594f, 6.4219f, 3.1875f, 8.2617f, 3.1875f)
                curveTo(9.1172f, 3.1875f, 10.0312f, 3.457f, 10.875f, 4.0313f)
                lineTo(11.9766f, 2.4961f)
                curveTo(10.8047f, 1.6758f, 9.5039f, 1.3008f, 8.2734f, 1.3008f)
                curveTo(5.4375f, 1.3008f, 3.1641f, 3.2461f, 3.1641f, 6.0234f)
                close()
                moveTo(9.4102f, 5.707f)
                curveTo(9.3867f, 6.3164f, 9.7969f, 6.7266f, 10.3359f, 6.7266f)
                curveTo(10.8516f, 6.7266f, 11.25f, 6.3867f, 11.2734f, 5.7891f)
                curveTo(11.3555f, 3.5625f, 12.9727f, 1.9336f, 15.2461f, 1.9336f)
                curveTo(16.6172f, 1.9336f, 17.8125f, 2.6602f, 18.293f, 3.7383f)
                curveTo(18.3867f, 3.9023f, 18.5156f, 3.9141f, 18.7383f, 3.8555f)
                curveTo(19.125f, 3.75f, 19.5586f, 3.6914f, 19.9805f, 3.6914f)
                curveTo(22.0781f, 3.7148f, 24.0703f, 5.2852f, 24.0703f, 7.8164f)
                curveTo(24.0703f, 13.3125f, 16.3359f, 12.5625f, 16.3359f, 17.9297f)
                curveTo(16.3359f, 20.4844f, 18.3633f, 22.0781f, 20.9883f, 22.0781f)
                curveTo(21.2695f, 22.0781f, 21.5742f, 22.0664f, 21.8789f, 22.0547f)
                curveTo(22.1484f, 24.0469f, 23.4023f, 25.9805f, 25.4297f, 25.9805f)
                curveTo(28.3594f, 25.9805f, 29.7891f, 22.418f, 29.7891f, 18.9492f)
                curveTo(29.7891f, 17.4375f, 29.707f, 16.418f, 29.6016f, 15.457f)
                lineTo(27.7148f, 15.9844f)
                curveTo(27.8203f, 16.9219f, 27.9141f, 17.8008f, 27.9141f, 18.9258f)
                curveTo(27.9141f, 21.7734f, 26.8359f, 24.0938f, 25.4297f, 24.0938f)
                curveTo(23.9766f, 24.0938f, 23.3906f, 22.1602f, 23.3906f, 20.6133f)
                curveTo(23.3906f, 20.4961f, 23.3203f, 20.4141f, 23.1562f, 20.4258f)
                curveTo(22.8281f, 20.4258f, 22.3828f, 20.4258f, 22.0898f, 20.4258f)
                curveTo(19.7578f, 20.4258f, 18.2227f, 19.7109f, 18.2227f, 17.8945f)
                curveTo(18.2227f, 13.6055f, 25.957f, 14.5781f, 25.957f, 7.8164f)
                curveTo(25.957f, 4.207f, 23.2852f, 1.8047f, 20.2266f, 1.8047f)
                curveTo(19.9922f, 1.8047f, 19.6641f, 1.8398f, 19.3359f, 1.9219f)
                curveTo(18.3984f, 0.7617f, 16.8984f, 0.0586f, 15.2578f, 0.0586f)
                curveTo(11.9297f, 0.0586f, 9.5508f, 2.3906f, 9.4102f, 5.707f)
                close()
                moveTo(23.1914f, 17.2031f)
                curveTo(23.1914f, 17.7305f, 23.6133f, 18.1055f, 24.1406f, 18.1406f)
                curveTo(28.1602f, 18.3984f, 30.8438f, 16.0312f, 30.8438f, 12.2227f)
                curveTo(30.8438f, 9.1172f, 28.6289f, 6.7383f, 25.3008f, 6.293f)
                lineTo(25.0078f, 8.168f)
                curveTo(27.375f, 8.2031f, 28.957f, 9.8203f, 28.957f, 12.2227f)
                curveTo(28.957f, 14.8711f, 27.0234f, 16.4883f, 24.1406f, 16.2656f)
                curveTo(23.6133f, 16.2188f, 23.1914f, 16.6875f, 23.1914f, 17.2031f)
                close()
                moveTo(17.168f, 18.7266f)
                curveTo(16.4766f, 18.9727f, 15.668f, 19.0898f, 14.9062f, 19.0898f)
                curveTo(12.9258f, 19.0898f, 10.9102f, 18.3164f, 10.1367f, 17.1211f)
                lineTo(8.5781f, 18.3867f)
                curveTo(9.8086f, 19.9219f, 12.0352f, 20.9766f, 14.707f, 20.9766f)
                curveTo(15.668f, 20.9766f, 16.7461f, 20.8359f, 17.8125f, 20.5195f)
                close()
                moveTo(13.4062f, 10.4531f)
                lineTo(14.0391f, 12.2344f)
                curveTo(16.9922f, 11.6602f, 18.3164f, 9.8086f, 18.3164f, 7.0664f)
                curveTo(18.3164f, 6.5508f, 17.8828f, 6.1289f, 17.3672f, 6.1289f)
                curveTo(16.8516f, 6.1289f, 16.4297f, 6.5508f, 16.4297f, 7.0664f)
                curveTo(16.4297f, 8.9883f, 15.6094f, 10.1367f, 13.4062f, 10.4531f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
