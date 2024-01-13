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

public val CupertinoIcons.Filled.Bandage: ImageVector
    get() {
        if (_bandage != null) {
            return _bandage!!
        }
        _bandage = Builder(name = "Bandage", defaultWidth = 24.0715.dp, defaultHeight = 24.0914.dp,
                viewportWidth = 24.0715f, viewportHeight = 24.0914f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7692f, 22.3055f)
                curveTo(4.1833f, 24.7547f, 7.5114f, 24.6609f, 10.2653f, 22.1062f)
                lineTo(12.2926f, 20.2078f)
                curveTo(11.2731f, 20.5008f, 10.2419f, 20.3015f, 9.0934f, 19.1648f)
                lineTo(4.8278f, 14.8875f)
                curveTo(3.6794f, 13.7508f, 3.5739f, 12.8015f, 3.8669f, 11.782f)
                lineTo(1.9684f, 13.8094f)
                curveTo(-0.598f, 16.575f, -0.6449f, 19.868f, 1.7692f, 22.3055f)
                close()
                moveTo(10.195f, 17.9695f)
                curveTo(11.3669f, 19.1414f, 12.5036f, 19.1765f, 13.6989f, 17.9695f)
                lineTo(17.9645f, 13.6922f)
                curveTo(19.1833f, 12.4851f, 19.1598f, 11.3719f, 17.988f, 10.2f)
                lineTo(13.8747f, 6.0867f)
                curveTo(12.7028f, 4.9148f, 11.5895f, 4.8914f, 10.3825f, 6.1101f)
                lineTo(6.1051f, 10.3758f)
                curveTo(4.9098f, 11.5828f, 4.9333f, 12.7078f, 6.1051f, 13.8797f)
                close()
                moveTo(8.7887f, 12.825f)
                curveTo(8.3434f, 12.3797f, 8.3434f, 11.7f, 8.7887f, 11.2547f)
                curveTo(9.234f, 10.8094f, 9.9137f, 10.8211f, 10.3591f, 11.2664f)
                curveTo(10.7692f, 11.6883f, 10.7809f, 12.3797f, 10.3591f, 12.8015f)
                curveTo(9.8903f, 13.2703f, 9.2106f, 13.2469f, 8.7887f, 12.825f)
                close()
                moveTo(11.2731f, 10.3523f)
                curveTo(10.8278f, 9.907f, 10.8278f, 9.2156f, 11.2497f, 8.782f)
                curveTo(11.695f, 8.3367f, 12.3747f, 8.3367f, 12.82f, 8.782f)
                curveTo(13.2536f, 9.2156f, 13.2653f, 9.8953f, 12.8083f, 10.3523f)
                curveTo(12.3864f, 10.7625f, 11.6833f, 10.7625f, 11.2731f, 10.3523f)
                close()
                moveTo(15.2926f, 12.825f)
                curveTo(14.8591f, 13.2469f, 14.1676f, 13.2469f, 13.7223f, 12.8015f)
                curveTo(13.3122f, 12.3914f, 13.3122f, 11.6883f, 13.7223f, 11.2664f)
                curveTo(14.1794f, 10.8094f, 14.8591f, 10.8211f, 15.2926f, 11.2547f)
                curveTo(15.738f, 11.7f, 15.738f, 12.3797f, 15.2926f, 12.825f)
                close()
                moveTo(11.2497f, 15.2859f)
                curveTo(10.8278f, 14.864f, 10.8044f, 14.1844f, 11.2731f, 13.7273f)
                curveTo(11.695f, 13.2937f, 12.3864f, 13.3055f, 12.8083f, 13.7273f)
                curveTo(13.2536f, 14.1609f, 13.2653f, 14.864f, 12.82f, 15.2859f)
                curveTo(12.363f, 15.7312f, 11.695f, 15.7312f, 11.2497f, 15.2859f)
                close()
                moveTo(20.2145f, 12.3211f)
                lineTo(22.1012f, 10.2703f)
                curveTo(24.6559f, 7.4929f, 24.7262f, 4.2117f, 22.3122f, 1.7742f)
                curveTo(19.8864f, -0.675f, 16.57f, -0.5695f, 13.8044f, 1.9734f)
                lineTo(11.7653f, 3.8601f)
                curveTo(12.7731f, 3.5672f, 13.863f, 3.8015f, 15.0114f, 4.95f)
                lineTo(19.277f, 9.2156f)
                curveTo(20.4255f, 10.3523f, 20.5075f, 11.3015f, 20.2145f, 12.3211f)
                close()
            }
        }
        .build()
        return _bandage!!
    }

private var _bandage: ImageVector? = null
