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

@file:Suppress("UnusedReceiverParameter")

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

public val CupertinoIcons.Outlined.PhoneArrowUpRight: ImageVector
    get() {
        if (_phoneArrowUpRight != null) {
            return _phoneArrowUpRight!!
        }
        _phoneArrowUpRight = Builder(name = "PhoneArrowUpRight", defaultWidth = 23.0391.dp,
                defaultHeight = 23.0273.dp, viewportWidth = 23.0391f, viewportHeight =
                23.0273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0391f, 23.0039f)
                curveTo(19.0898f, 23.0039f, 20.4375f, 22.4531f, 21.6211f, 21.1172f)
                curveTo(21.7148f, 21.0234f, 21.8086f, 20.918f, 21.8906f, 20.8242f)
                curveTo(22.5938f, 20.0391f, 22.9219f, 19.2656f, 22.9219f, 18.5273f)
                curveTo(22.9219f, 17.6836f, 22.4297f, 16.8984f, 21.3867f, 16.1719f)
                lineTo(17.9766f, 13.8047f)
                curveTo(16.9219f, 13.0781f, 15.6914f, 12.9961f, 14.707f, 13.9688f)
                lineTo(13.8047f, 14.8711f)
                curveTo(13.5352f, 15.1406f, 13.3008f, 15.1523f, 13.043f, 14.9883f)
                curveTo(12.4102f, 14.5898f, 11.1328f, 13.4766f, 10.2656f, 12.6094f)
                curveTo(9.3516f, 11.707f, 8.4727f, 10.6992f, 8.0039f, 9.9609f)
                curveTo(7.8516f, 9.6914f, 7.8633f, 9.4688f, 8.1328f, 9.1992f)
                lineTo(9.0234f, 8.2969f)
                curveTo(10.0078f, 7.3125f, 9.9258f, 6.0703f, 9.1992f, 5.0273f)
                lineTo(6.832f, 1.6172f)
                curveTo(6.1055f, 0.5742f, 5.3203f, 0.0938f, 4.4766f, 0.082f)
                curveTo(3.7383f, 0.0703f, 2.9648f, 0.4102f, 2.1797f, 1.1133f)
                curveTo(2.0742f, 1.207f, 1.9805f, 1.2891f, 1.8867f, 1.3711f)
                curveTo(0.5508f, 2.5664f, 0.0f, 3.9141f, 0.0f, 5.9414f)
                curveTo(0.0f, 9.293f, 2.0625f, 13.3711f, 5.8477f, 17.1562f)
                curveTo(9.6094f, 20.918f, 13.6992f, 23.0039f, 17.0391f, 23.0039f)
                close()
                moveTo(17.0508f, 21.1992f)
                curveTo(14.0625f, 21.2578f, 10.2305f, 18.9609f, 7.1953f, 15.9375f)
                curveTo(4.1367f, 12.8906f, 1.7344f, 8.9297f, 1.793f, 5.9414f)
                curveTo(1.8164f, 4.6523f, 2.2734f, 3.5391f, 3.1875f, 2.7422f)
                curveTo(3.2695f, 2.6719f, 3.3281f, 2.6133f, 3.4102f, 2.5547f)
                curveTo(3.7617f, 2.25f, 4.1367f, 2.0859f, 4.4766f, 2.0859f)
                curveTo(4.8164f, 2.0859f, 5.1211f, 2.2148f, 5.3438f, 2.5664f)
                lineTo(7.6172f, 5.9766f)
                curveTo(7.8633f, 6.3398f, 7.8867f, 6.75f, 7.5234f, 7.1133f)
                lineTo(6.4922f, 8.1445f)
                curveTo(5.6836f, 8.9531f, 5.7422f, 9.9375f, 6.3281f, 10.7227f)
                curveTo(6.9961f, 11.625f, 8.1563f, 12.9375f, 9.0586f, 13.8281f)
                curveTo(9.9492f, 14.7305f, 11.3672f, 15.9961f, 12.2812f, 16.6758f)
                curveTo(13.0664f, 17.2617f, 14.0508f, 17.3203f, 14.8594f, 16.5117f)
                lineTo(15.8906f, 15.4805f)
                curveTo(16.2539f, 15.1172f, 16.6523f, 15.1406f, 17.0273f, 15.375f)
                lineTo(20.4375f, 17.6484f)
                curveTo(20.7891f, 17.8828f, 20.918f, 18.1758f, 20.918f, 18.5273f)
                curveTo(20.918f, 18.8672f, 20.7539f, 19.2422f, 20.4492f, 19.5938f)
                curveTo(20.3789f, 19.6758f, 20.332f, 19.7344f, 20.2617f, 19.8164f)
                curveTo(19.4648f, 20.7305f, 18.3516f, 21.1758f, 17.0508f, 21.1992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1094f, 9.8086f)
                curveTo(14.3438f, 9.8086f, 14.543f, 9.7266f, 14.7188f, 9.5508f)
                lineTo(19.7695f, 4.4883f)
                lineTo(21.5625f, 2.543f)
                lineTo(21.3633f, 5.9766f)
                lineTo(21.3633f, 7.7227f)
                curveTo(21.3633f, 8.1797f, 21.7148f, 8.5313f, 22.1719f, 8.5547f)
                curveTo(22.6406f, 8.5781f, 23.0391f, 8.2031f, 23.0391f, 7.7227f)
                lineTo(23.0391f, 0.9375f)
                curveTo(23.0391f, 0.3164f, 22.7344f, 0.0f, 22.125f, 0.0f)
                lineTo(15.3164f, 0.0f)
                curveTo(14.8242f, 0.0f, 14.4492f, 0.3984f, 14.4727f, 0.8789f)
                curveTo(14.4961f, 1.3359f, 14.8477f, 1.6758f, 15.3164f, 1.6758f)
                lineTo(17.0859f, 1.6758f)
                lineTo(20.5312f, 1.4883f)
                lineTo(18.5625f, 3.2813f)
                lineTo(13.5117f, 8.3438f)
                curveTo(13.3242f, 8.5313f, 13.2305f, 8.7422f, 13.2305f, 8.9883f)
                curveTo(13.2305f, 9.4453f, 13.6172f, 9.8086f, 14.1094f, 9.8086f)
                close()
            }
        }
        .build()
        return _phoneArrowUpRight!!
    }

private var _phoneArrowUpRight: ImageVector? = null
