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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Filled.HandTap: ImageVector
    get() {
        if (_handTap != null) {
            return _handTap!!
        }
        _handTap = Builder(name = "HandTap", defaultWidth = 22.5203.dp, defaultHeight = 29.8008.dp,
                viewportWidth = 22.5203f, viewportHeight = 29.8008f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 25.2539f)
                curveTo(22.0312f, 23.5195f, 23.625f, 19.5469f, 21.7617f, 14.4258f)
                lineTo(21.0f, 12.3164f)
                curveTo(20.2969f, 10.3828f, 18.9375f, 9.5391f, 17.8828f, 9.9141f)
                curveTo(17.6367f, 10.0078f, 17.5547f, 10.1836f, 17.6367f, 10.4062f)
                lineTo(17.9883f, 11.3438f)
                curveTo(18.1406f, 11.7891f, 18.0f, 12.082f, 17.7305f, 12.1875f)
                curveTo(17.4492f, 12.2812f, 17.1445f, 12.1523f, 16.9805f, 11.707f)
                lineTo(16.7578f, 11.0977f)
                curveTo(16.3477f, 9.9492f, 15.3398f, 9.4688f, 14.3555f, 9.832f)
                curveTo(13.9102f, 9.9961f, 13.7812f, 10.2539f, 13.9102f, 10.6289f)
                lineTo(14.3789f, 11.9062f)
                curveTo(14.543f, 12.3516f, 14.3906f, 12.6445f, 14.1328f, 12.75f)
                curveTo(13.8398f, 12.8555f, 13.5352f, 12.7148f, 13.3711f, 12.2695f)
                lineTo(12.9492f, 11.0977f)
                curveTo(12.4805f, 9.8086f, 11.5195f, 9.4805f, 10.5586f, 9.832f)
                curveTo(10.1367f, 9.9844f, 9.9844f, 10.2656f, 10.125f, 10.6289f)
                lineTo(11.0273f, 13.125f)
                curveTo(11.1914f, 13.5703f, 11.0391f, 13.8633f, 10.7812f, 13.9688f)
                curveTo(10.4883f, 14.0742f, 10.1836f, 13.9336f, 10.0312f, 13.4883f)
                lineTo(6.9844f, 5.1328f)
                curveTo(6.6914f, 4.3125f, 5.9648f, 3.9844f, 5.2734f, 4.2305f)
                curveTo(4.5352f, 4.5f, 4.2188f, 5.2148f, 4.5117f, 6.0352f)
                lineTo(8.9648f, 18.2695f)
                curveTo(9.082f, 18.5742f, 8.9414f, 18.7969f, 8.7539f, 18.8672f)
                curveTo(8.5664f, 18.9375f, 8.3672f, 18.8789f, 8.1328f, 18.6211f)
                lineTo(5.1211f, 15.3867f)
                curveTo(4.6758f, 14.918f, 4.2188f, 14.8008f, 3.7148f, 14.9883f)
                curveTo(2.9648f, 15.2578f, 2.6719f, 15.9492f, 2.8945f, 16.582f)
                curveTo(2.9883f, 16.8281f, 3.1172f, 17.0156f, 3.2461f, 17.168f)
                lineTo(6.9609f, 21.8438f)
                curveTo(10.1016f, 25.7812f, 13.7344f, 26.5312f, 17.25f, 25.2539f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8594f, 0.0f)
                curveTo(2.625f, 0.0f, 0.0f, 2.625f, 0.0f, 5.8594f)
                curveTo(0.0f, 7.2539f, 0.4922f, 8.543f, 1.3008f, 9.5508f)
                curveTo(1.5f, 9.7969f, 1.7344f, 9.8906f, 1.957f, 9.8906f)
                curveTo(2.5313f, 9.8906f, 3.0234f, 9.2109f, 2.5313f, 8.625f)
                curveTo(1.8984f, 7.875f, 1.5352f, 6.9141f, 1.5352f, 5.8594f)
                curveTo(1.5352f, 3.4688f, 3.4688f, 1.5352f, 5.8594f, 1.5352f)
                curveTo(8.25f, 1.5352f, 10.1719f, 3.4688f, 10.1719f, 5.8594f)
                curveTo(10.1719f, 5.9297f, 10.1719f, 6.0f, 10.1719f, 6.1055f)
                curveTo(10.1836f, 6.6328f, 10.5469f, 6.8672f, 10.9219f, 6.8672f)
                curveTo(11.2852f, 6.8672f, 11.6602f, 6.6094f, 11.6953f, 6.1992f)
                curveTo(11.707f, 6.1172f, 11.707f, 6.0117f, 11.707f, 5.8594f)
                curveTo(11.707f, 2.625f, 9.0938f, 0.0f, 5.8594f, 0.0f)
                close()
            }
        }
        .build()
        return _handTap!!
    }

private var _handTap: ImageVector? = null
