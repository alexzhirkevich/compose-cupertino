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

public val CupertinoIcons.Outlined.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 19.5234.dp, defaultHeight = 27.4805.dp,
                viewportWidth = 19.5234f, viewportHeight = 27.4805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2109f, 25.3477f)
                curveTo(15.3984f, 25.3477f, 19.5234f, 21.1641f, 19.5234f, 14.8594f)
                curveTo(19.5234f, 4.3711f, 10.5938f, 0.0f, 4.3945f, 0.0f)
                curveTo(3.293f, 0.0f, 2.5898f, 0.3867f, 2.5898f, 1.1367f)
                curveTo(2.5898f, 1.4297f, 2.7188f, 1.7344f, 2.9648f, 2.0156f)
                curveTo(4.3594f, 3.6797f, 5.7539f, 5.6602f, 5.7773f, 7.9688f)
                curveTo(5.7773f, 8.4961f, 5.7188f, 8.9648f, 5.3438f, 9.6211f)
                lineTo(5.9297f, 9.5039f)
                curveTo(5.4023f, 7.7813f, 3.9844f, 6.5625f, 2.7422f, 6.5625f)
                curveTo(2.2617f, 6.5625f, 1.9336f, 6.9141f, 1.9336f, 7.4414f)
                curveTo(1.9336f, 7.7461f, 2.0156f, 8.4609f, 2.0156f, 8.9766f)
                curveTo(2.0156f, 11.6016f, 0.0f, 13.1367f, 0.0f, 17.3672f)
                curveTo(0.0f, 22.1602f, 3.668f, 25.3477f, 9.2109f, 25.3477f)
                close()
                moveTo(9.3281f, 23.707f)
                curveTo(4.7344f, 23.707f, 1.6523f, 21.1523f, 1.6523f, 17.3672f)
                curveTo(1.6523f, 13.5234f, 3.7266f, 12.2227f, 3.7266f, 9.1758f)
                curveTo(3.7266f, 8.7188f, 3.6328f, 8.3086f, 3.5273f, 7.957f)
                lineTo(3.2578f, 8.4258f)
                curveTo(4.2188f, 9.0f, 4.875f, 10.043f, 5.25f, 11.6484f)
                curveTo(5.2969f, 11.8945f, 5.4375f, 12.0117f, 5.6133f, 12.0117f)
                curveTo(6.5625f, 12.0117f, 7.2422f, 9.6563f, 7.2422f, 8.168f)
                curveTo(7.2422f, 5.4727f, 6.082f, 2.918f, 4.1953f, 1.1719f)
                lineTo(3.8789f, 1.5469f)
                curveTo(12.3047f, 1.7227f, 17.8008f, 7.3125f, 17.8008f, 14.8008f)
                curveTo(17.8008f, 20.1211f, 14.4023f, 23.707f, 9.3281f, 23.707f)
                close()
                moveTo(9.4805f, 22.0547f)
                curveTo(12.2695f, 22.0547f, 13.6289f, 20.0039f, 13.6289f, 17.6836f)
                curveTo(13.6289f, 15.3984f, 12.293f, 12.8438f, 9.7266f, 11.6367f)
                curveTo(9.6211f, 11.6016f, 9.5508f, 11.6602f, 9.5625f, 11.7656f)
                curveTo(9.7617f, 13.6875f, 9.4688f, 15.4688f, 8.8477f, 16.3125f)
                curveTo(8.5547f, 15.6328f, 8.2031f, 15.0469f, 7.6641f, 14.5664f)
                curveTo(7.582f, 14.4961f, 7.5117f, 14.5312f, 7.4883f, 14.6367f)
                curveTo(7.3008f, 15.9609f, 5.8359f, 16.6992f, 5.8359f, 18.7617f)
                curveTo(5.8359f, 20.7305f, 7.2891f, 22.0547f, 9.4805f, 22.0547f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
