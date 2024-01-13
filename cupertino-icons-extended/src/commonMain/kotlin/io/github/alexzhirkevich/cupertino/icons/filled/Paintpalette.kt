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

public val CupertinoIcons.Filled.Paintpalette: ImageVector
    get() {
        if (_paintpalette != null) {
            return _paintpalette!!
        }
        _paintpalette = Builder(name = "Paintpalette", defaultWidth = 28.2305.dp, defaultHeight =
                23.707.dp, viewportWidth = 28.2305f, viewportHeight = 23.707f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8086f, 8.4023f)
                curveTo(20.918f, 8.4023f, 20.1914f, 7.6992f, 20.1914f, 6.8086f)
                curveTo(20.1914f, 5.9297f, 20.918f, 5.2031f, 21.8086f, 5.2031f)
                curveTo(22.6875f, 5.2031f, 23.3906f, 5.9297f, 23.3906f, 6.8086f)
                curveTo(23.3906f, 7.6992f, 22.6875f, 8.4023f, 21.8086f, 8.4023f)
                close()
                moveTo(16.2891f, 7.3711f)
                curveTo(15.2109f, 7.3711f, 14.2969f, 6.4922f, 14.2969f, 5.4023f)
                curveTo(14.2969f, 4.3125f, 15.2109f, 3.4336f, 16.2891f, 3.4336f)
                curveTo(17.3906f, 3.4336f, 18.2578f, 4.3125f, 18.2578f, 5.4023f)
                curveTo(18.2578f, 6.4922f, 17.3906f, 7.3711f, 16.2891f, 7.3711f)
                close()
                moveTo(10.043f, 9.2227f)
                curveTo(8.6602f, 9.2227f, 7.5586f, 8.1445f, 7.5586f, 6.7617f)
                curveTo(7.5586f, 5.4141f, 8.6602f, 4.3359f, 10.043f, 4.3359f)
                curveTo(11.3789f, 4.3359f, 12.4922f, 5.4141f, 12.4922f, 6.7617f)
                curveTo(12.4922f, 8.1445f, 11.3906f, 9.2227f, 10.043f, 9.2227f)
                close()
                moveTo(5.543f, 13.3711f)
                curveTo(4.4766f, 13.3711f, 3.5859f, 12.4805f, 3.5859f, 11.4023f)
                curveTo(3.5859f, 10.3711f, 4.5117f, 9.4688f, 5.543f, 9.4688f)
                curveTo(6.6211f, 9.4688f, 7.4883f, 10.3242f, 7.4883f, 11.4023f)
                curveTo(7.4883f, 12.4805f, 6.6211f, 13.3711f, 5.543f, 13.3711f)
                close()
                moveTo(15.1641f, 23.4727f)
                curveTo(20.0977f, 23.4727f, 23.3906f, 21.7266f, 23.3906f, 19.1484f)
                curveTo(23.3906f, 16.8398f, 21.4219f, 16.3242f, 21.4219f, 14.9648f)
                curveTo(21.4219f, 13.0898f, 28.2305f, 12.7148f, 28.2305f, 7.8984f)
                curveTo(28.2305f, 3.1406f, 23.3203f, 0.0f, 16.0312f, 0.0f)
                curveTo(6.457f, 0.0f, 0.0f, 4.7813f, 0.0f, 11.9414f)
                curveTo(0.0f, 18.832f, 6.1289f, 23.4727f, 15.1641f, 23.4727f)
                close()
                moveTo(14.9062f, 18.9961f)
                curveTo(13.1953f, 18.9961f, 11.7891f, 17.6016f, 11.7891f, 15.8789f)
                curveTo(11.7891f, 14.168f, 13.1953f, 12.7617f, 14.9062f, 12.7617f)
                curveTo(16.6289f, 12.7617f, 18.0352f, 14.168f, 18.0352f, 15.8789f)
                curveTo(18.0352f, 17.6016f, 16.6289f, 18.9961f, 14.9062f, 18.9961f)
                close()
            }
        }
        .build()
        return _paintpalette!!
    }

private var _paintpalette: ImageVector? = null
