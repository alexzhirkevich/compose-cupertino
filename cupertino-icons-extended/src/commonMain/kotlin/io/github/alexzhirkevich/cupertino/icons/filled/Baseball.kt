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

public val CupertinoIcons.Filled.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 23.9062.dp, defaultHeight = 23.918.dp,
                viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.9531f)
                curveTo(0.0f, 17.4844f, 3.8789f, 22.2188f, 9.0352f, 23.5312f)
                curveTo(9.3984f, 22.5469f, 9.6328f, 21.4805f, 9.7031f, 20.4141f)
                lineTo(9.2109f, 20.3906f)
                curveTo(8.9063f, 20.3789f, 8.6602f, 20.1328f, 8.6602f, 19.8281f)
                curveTo(8.6719f, 19.5234f, 8.918f, 19.2773f, 9.2344f, 19.2891f)
                lineTo(9.7266f, 19.3125f)
                curveTo(9.7148f, 18.6797f, 9.6445f, 18.0586f, 9.5273f, 17.4258f)
                lineTo(9.0352f, 17.5547f)
                curveTo(8.7305f, 17.625f, 8.4375f, 17.4375f, 8.3555f, 17.1445f)
                curveTo(8.2852f, 16.8516f, 8.4609f, 16.5469f, 8.7539f, 16.4766f)
                lineTo(9.2461f, 16.3477f)
                curveTo(9.0586f, 15.7383f, 8.8242f, 15.1289f, 8.5195f, 14.543f)
                lineTo(8.1328f, 14.7539f)
                curveTo(7.8516f, 14.8945f, 7.5469f, 14.8008f, 7.3945f, 14.5312f)
                curveTo(7.2188f, 14.2734f, 7.3125f, 13.9219f, 7.582f, 13.7695f)
                lineTo(7.957f, 13.5703f)
                curveTo(7.582f, 12.9961f, 7.1602f, 12.457f, 6.6914f, 11.9766f)
                lineTo(6.4219f, 12.2695f)
                curveTo(6.1875f, 12.4922f, 5.8711f, 12.4805f, 5.6367f, 12.2578f)
                curveTo(5.4258f, 12.0586f, 5.4023f, 11.707f, 5.625f, 11.4844f)
                lineTo(5.8945f, 11.2031f)
                curveTo(5.4492f, 10.8047f, 4.9688f, 10.4766f, 4.4648f, 10.1602f)
                lineTo(4.207f, 10.6641f)
                curveTo(4.0547f, 10.9453f, 3.7383f, 11.0273f, 3.4688f, 10.875f)
                curveTo(3.1875f, 10.7344f, 3.0938f, 10.3945f, 3.2461f, 10.1133f)
                lineTo(3.5039f, 9.6211f)
                curveTo(2.5547f, 9.1523f, 1.5117f, 8.8242f, 0.4805f, 8.6484f)
                curveTo(0.1641f, 9.7031f, 0.0f, 10.8047f, 0.0f, 11.9531f)
                close()
                moveTo(11.9531f, 23.9062f)
                curveTo(16.9219f, 23.9062f, 21.2578f, 20.7656f, 23.0273f, 16.3945f)
                curveTo(21.9023f, 16.1953f, 20.8008f, 15.8203f, 19.7695f, 15.3281f)
                lineTo(19.5f, 15.8203f)
                curveTo(19.3711f, 16.1016f, 19.0078f, 16.1836f, 18.75f, 16.043f)
                curveTo(18.4922f, 15.8906f, 18.3867f, 15.5508f, 18.5508f, 15.2812f)
                lineTo(18.8086f, 14.8125f)
                curveTo(18.1641f, 14.4258f, 17.5547f, 14.0039f, 16.9805f, 13.5117f)
                lineTo(16.6055f, 13.8867f)
                curveTo(16.3945f, 14.1094f, 16.0547f, 14.0977f, 15.8438f, 13.8867f)
                curveTo(15.6094f, 13.6758f, 15.5977f, 13.3242f, 15.8203f, 13.125f)
                lineTo(16.1953f, 12.7383f)
                curveTo(15.668f, 12.1992f, 15.1992f, 11.5898f, 14.7656f, 10.9219f)
                lineTo(14.2266f, 11.2266f)
                curveTo(13.957f, 11.4023f, 13.6172f, 11.2734f, 13.5f, 11.0273f)
                curveTo(13.3477f, 10.7578f, 13.418f, 10.418f, 13.6875f, 10.2773f)
                lineTo(14.2148f, 9.9727f)
                curveTo(13.8398f, 9.2578f, 13.5469f, 8.5195f, 13.3359f, 7.7695f)
                lineTo(12.6914f, 7.9219f)
                curveTo(12.3867f, 8.0039f, 12.0938f, 7.8398f, 12.0469f, 7.5352f)
                curveTo(11.9531f, 7.2422f, 12.0938f, 6.9375f, 12.4102f, 6.8555f)
                lineTo(13.0781f, 6.6914f)
                curveTo(12.9375f, 6.0f, 12.8672f, 5.2852f, 12.8555f, 4.582f)
                lineTo(12.3281f, 4.5586f)
                curveTo(12.0117f, 4.5586f, 11.7773f, 4.3242f, 11.8008f, 4.0195f)
                curveTo(11.8008f, 3.7031f, 12.0352f, 3.457f, 12.3516f, 3.4453f)
                lineTo(12.8789f, 3.4688f)
                curveTo(12.9844f, 2.3203f, 13.1953f, 1.1836f, 13.6055f, 0.1172f)
                curveTo(13.0547f, 0.0469f, 12.5039f, 0.0f, 11.9414f, 0.0f)
                curveTo(6.9727f, 0.0f, 2.6719f, 3.1289f, 0.8789f, 7.4883f)
                curveTo(1.9922f, 7.6992f, 3.082f, 8.0273f, 4.1016f, 8.543f)
                lineTo(4.3594f, 8.0859f)
                curveTo(4.5f, 7.8047f, 4.8398f, 7.7344f, 5.1211f, 7.8984f)
                curveTo(5.3906f, 8.0273f, 5.4727f, 8.3555f, 5.3203f, 8.625f)
                lineTo(5.0742f, 9.0703f)
                curveTo(5.6719f, 9.4336f, 6.2461f, 9.832f, 6.7852f, 10.3008f)
                lineTo(7.2539f, 9.8203f)
                curveTo(7.4766f, 9.5977f, 7.8164f, 9.6211f, 8.0391f, 9.8555f)
                curveTo(8.2383f, 10.0664f, 8.2734f, 10.3828f, 8.0391f, 10.6172f)
                lineTo(7.582f, 11.0742f)
                curveTo(8.1328f, 11.6484f, 8.6367f, 12.2578f, 9.0703f, 12.9375f)
                lineTo(9.6094f, 12.6445f)
                curveTo(9.8789f, 12.4805f, 10.207f, 12.5977f, 10.3594f, 12.8555f)
                curveTo(10.5117f, 13.1133f, 10.4414f, 13.4531f, 10.1484f, 13.6055f)
                lineTo(9.6211f, 13.8984f)
                curveTo(9.9844f, 14.5898f, 10.2656f, 15.3047f, 10.4883f, 16.0195f)
                lineTo(10.9922f, 15.8906f)
                curveTo(11.3086f, 15.8086f, 11.5898f, 15.9844f, 11.6719f, 16.2891f)
                curveTo(11.7539f, 16.582f, 11.5781f, 16.8867f, 11.2852f, 16.9688f)
                lineTo(10.7578f, 17.1094f)
                curveTo(10.8984f, 17.8477f, 10.9688f, 18.5859f, 10.9805f, 19.3242f)
                lineTo(11.543f, 19.3477f)
                curveTo(11.8477f, 19.3594f, 12.0938f, 19.6055f, 12.082f, 19.8984f)
                curveTo(12.082f, 20.2031f, 11.8359f, 20.4609f, 11.5195f, 20.4492f)
                lineTo(10.9453f, 20.4258f)
                curveTo(10.8633f, 21.5742f, 10.6289f, 22.6992f, 10.2305f, 23.7773f)
                curveTo(10.7812f, 23.8594f, 11.3672f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(23.9062f, 11.9531f)
                curveTo(23.9062f, 6.3984f, 19.9805f, 1.6523f, 14.7891f, 0.3516f)
                curveTo(14.4375f, 1.3477f, 14.1914f, 2.4258f, 14.1211f, 3.4922f)
                lineTo(14.6602f, 3.5156f)
                curveTo(14.9648f, 3.5273f, 15.2109f, 3.7852f, 15.1992f, 4.0898f)
                curveTo(15.1992f, 4.4063f, 14.9648f, 4.6289f, 14.6484f, 4.6172f)
                lineTo(14.1094f, 4.5938f)
                curveTo(14.1211f, 5.1797f, 14.1797f, 5.7773f, 14.2969f, 6.3633f)
                lineTo(14.6602f, 6.2813f)
                curveTo(14.9648f, 6.1992f, 15.2344f, 6.375f, 15.3164f, 6.6797f)
                curveTo(15.3867f, 6.9727f, 15.2461f, 7.2656f, 14.9414f, 7.3477f)
                lineTo(14.5664f, 7.4297f)
                curveTo(14.7656f, 8.0742f, 15.0117f, 8.707f, 15.3281f, 9.3281f)
                lineTo(15.7148f, 9.1172f)
                curveTo(15.9844f, 8.9531f, 16.3125f, 9.0703f, 16.4531f, 9.3281f)
                curveTo(16.6055f, 9.6211f, 16.5234f, 9.9258f, 16.2539f, 10.0781f)
                lineTo(15.8672f, 10.2891f)
                curveTo(16.2422f, 10.8516f, 16.6406f, 11.3672f, 17.0742f, 11.8359f)
                lineTo(17.4492f, 11.4609f)
                curveTo(17.6719f, 11.2383f, 18.0234f, 11.25f, 18.2344f, 11.4492f)
                curveTo(18.457f, 11.6602f, 18.4688f, 12.0117f, 18.2461f, 12.2578f)
                lineTo(17.8828f, 12.6211f)
                curveTo(18.3633f, 13.043f, 18.8672f, 13.418f, 19.418f, 13.7344f)
                lineTo(19.6641f, 13.2539f)
                curveTo(19.793f, 12.9844f, 20.1328f, 12.8906f, 20.4023f, 13.0312f)
                curveTo(20.6719f, 13.1953f, 20.7773f, 13.5234f, 20.625f, 13.8047f)
                lineTo(20.3789f, 14.2734f)
                curveTo(21.3398f, 14.7422f, 22.3711f, 15.0586f, 23.4375f, 15.2227f)
                curveTo(23.7422f, 14.1797f, 23.9062f, 13.0898f, 23.9062f, 11.9531f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
