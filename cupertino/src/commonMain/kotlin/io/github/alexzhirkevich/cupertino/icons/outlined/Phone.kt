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

public val CupertinoIcons.Outlined.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 22.9219.dp, defaultHeight = 22.9805.dp,
                viewportWidth = 22.9219f, viewportHeight = 22.9805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0391f, 22.9805f)
                curveTo(19.0898f, 22.9805f, 20.4375f, 22.4297f, 21.6211f, 21.0938f)
                curveTo(21.7148f, 21.0f, 21.8086f, 20.8945f, 21.8906f, 20.8008f)
                curveTo(22.5938f, 20.0156f, 22.9219f, 19.2422f, 22.9219f, 18.5039f)
                curveTo(22.9219f, 17.6602f, 22.4297f, 16.875f, 21.3867f, 16.1484f)
                lineTo(17.9766f, 13.7812f)
                curveTo(16.9219f, 13.0547f, 15.6914f, 12.9727f, 14.707f, 13.9453f)
                lineTo(13.8047f, 14.8477f)
                curveTo(13.5352f, 15.1172f, 13.3008f, 15.1289f, 13.043f, 14.9648f)
                curveTo(12.4102f, 14.5664f, 11.1328f, 13.4531f, 10.2656f, 12.5859f)
                curveTo(9.3516f, 11.6836f, 8.4727f, 10.6758f, 8.0039f, 9.9375f)
                curveTo(7.8516f, 9.668f, 7.8633f, 9.4453f, 8.1328f, 9.1758f)
                lineTo(9.0234f, 8.2734f)
                curveTo(10.0078f, 7.2891f, 9.9258f, 6.0469f, 9.1992f, 5.0039f)
                lineTo(6.832f, 1.5938f)
                curveTo(6.1055f, 0.5508f, 5.3203f, 0.0703f, 4.4766f, 0.0586f)
                curveTo(3.7383f, 0.0469f, 2.9648f, 0.3867f, 2.1797f, 1.0898f)
                curveTo(2.0742f, 1.1836f, 1.9805f, 1.2656f, 1.8867f, 1.3477f)
                curveTo(0.5508f, 2.543f, 0.0f, 3.8906f, 0.0f, 5.918f)
                curveTo(0.0f, 9.2695f, 2.0625f, 13.3477f, 5.8477f, 17.1328f)
                curveTo(9.6094f, 20.8945f, 13.6992f, 22.9805f, 17.0391f, 22.9805f)
                close()
                moveTo(17.0508f, 21.1758f)
                curveTo(14.0625f, 21.2344f, 10.2305f, 18.9375f, 7.1953f, 15.9141f)
                curveTo(4.1367f, 12.8672f, 1.7344f, 8.9063f, 1.793f, 5.918f)
                curveTo(1.8164f, 4.6289f, 2.2734f, 3.5156f, 3.1875f, 2.7188f)
                curveTo(3.2695f, 2.6484f, 3.3281f, 2.5898f, 3.4102f, 2.5313f)
                curveTo(3.7617f, 2.2266f, 4.1367f, 2.0625f, 4.4766f, 2.0625f)
                curveTo(4.8164f, 2.0625f, 5.1211f, 2.1914f, 5.3438f, 2.543f)
                lineTo(7.6172f, 5.9531f)
                curveTo(7.8633f, 6.3164f, 7.8867f, 6.7266f, 7.5234f, 7.0898f)
                lineTo(6.4922f, 8.1211f)
                curveTo(5.6836f, 8.9297f, 5.7422f, 9.9141f, 6.3281f, 10.6992f)
                curveTo(6.9961f, 11.6016f, 8.1563f, 12.9141f, 9.0586f, 13.8047f)
                curveTo(9.9492f, 14.707f, 11.3672f, 15.9727f, 12.2812f, 16.6523f)
                curveTo(13.0664f, 17.2383f, 14.0508f, 17.2969f, 14.8594f, 16.4883f)
                lineTo(15.8906f, 15.457f)
                curveTo(16.2539f, 15.0938f, 16.6523f, 15.1172f, 17.0273f, 15.3516f)
                lineTo(20.4375f, 17.625f)
                curveTo(20.7891f, 17.8594f, 20.918f, 18.1523f, 20.918f, 18.5039f)
                curveTo(20.918f, 18.8438f, 20.7539f, 19.2188f, 20.4492f, 19.5703f)
                curveTo(20.3789f, 19.6523f, 20.332f, 19.7109f, 20.2617f, 19.793f)
                curveTo(19.4648f, 20.707f, 18.3516f, 21.1523f, 17.0508f, 21.1758f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
