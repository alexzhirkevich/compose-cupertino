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

public val CupertinoIcons.Outlined.Questionmark: ImageVector
    get() {
        if (_questionmark != null) {
            return _questionmark!!
        }
        _questionmark = Builder(name = "Questionmark", defaultWidth = 12.7383.dp, defaultHeight =
                22.4414.dp, viewportWidth = 12.7383f, viewportHeight = 22.4414f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8008f, 16.0312f)
                curveTo(6.6211f, 16.0312f, 6.9961f, 15.4688f, 6.9961f, 14.7188f)
                curveTo(6.9961f, 14.5898f, 6.9961f, 14.4492f, 6.9961f, 14.3203f)
                curveTo(7.0195f, 12.7734f, 7.5703f, 12.1289f, 9.4453f, 10.8398f)
                curveTo(11.4609f, 9.4805f, 12.7383f, 7.9102f, 12.7383f, 5.6484f)
                curveTo(12.7383f, 2.1328f, 9.8789f, 0.1172f, 6.3164f, 0.1172f)
                curveTo(3.668f, 0.1172f, 1.3477f, 1.3711f, 0.3516f, 3.6328f)
                curveTo(0.1055f, 4.1836f, 0.0f, 4.7227f, 0.0f, 5.168f)
                curveTo(0.0f, 5.8359f, 0.3867f, 6.3047f, 1.1016f, 6.3047f)
                curveTo(1.6992f, 6.3047f, 2.0977f, 5.9531f, 2.2734f, 5.3789f)
                curveTo(2.8711f, 3.1523f, 4.3477f, 2.3086f, 6.2344f, 2.3086f)
                curveTo(8.5195f, 2.3086f, 10.3125f, 3.5977f, 10.3125f, 5.6367f)
                curveTo(10.3125f, 7.3125f, 9.2695f, 8.25f, 7.7695f, 9.3047f)
                curveTo(5.9297f, 10.582f, 4.582f, 11.9531f, 4.582f, 14.0156f)
                curveTo(4.582f, 14.2617f, 4.582f, 14.5078f, 4.582f, 14.7539f)
                curveTo(4.582f, 15.5039f, 4.9922f, 16.0312f, 5.8008f, 16.0312f)
                close()
                moveTo(5.8008f, 22.4414f)
                curveTo(6.7383f, 22.4414f, 7.4766f, 21.6914f, 7.4766f, 20.7773f)
                curveTo(7.4766f, 19.8516f, 6.7383f, 19.1133f, 5.8008f, 19.1133f)
                curveTo(4.8867f, 19.1133f, 4.1367f, 19.8516f, 4.1367f, 20.7773f)
                curveTo(4.1367f, 21.6914f, 4.8867f, 22.4414f, 5.8008f, 22.4414f)
                close()
            }
        }
        .build()
        return _questionmark!!
    }

private var _questionmark: ImageVector? = null
