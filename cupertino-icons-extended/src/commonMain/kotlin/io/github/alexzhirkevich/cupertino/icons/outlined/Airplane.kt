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

public val CupertinoIcons.Outlined.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 26.4141.dp, defaultHeight =
                23.8711.dp, viewportWidth = 26.4141f, viewportHeight = 23.8711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.4141f, 11.9297f)
                curveTo(26.4023f, 10.5586f, 24.5391f, 9.5625f, 22.3008f, 9.5625f)
                lineTo(17.5781f, 9.5625f)
                curveTo(16.9219f, 9.5625f, 16.6758f, 9.457f, 16.2891f, 9.0117f)
                lineTo(8.4141f, 0.4219f)
                curveTo(8.168f, 0.1406f, 7.8633f, 0.0f, 7.5117f, 0.0f)
                lineTo(6.1523f, 0.0f)
                curveTo(5.8477f, 0.0f, 5.6719f, 0.2695f, 5.8242f, 0.5977f)
                lineTo(9.8789f, 9.5625f)
                lineTo(3.9258f, 10.2422f)
                lineTo(1.8047f, 6.3516f)
                curveTo(1.6523f, 6.0586f, 1.3945f, 5.9297f, 1.0078f, 5.9297f)
                lineTo(0.5039f, 5.9297f)
                curveTo(0.1992f, 5.9297f, 0.0f, 6.1289f, 0.0f, 6.4336f)
                lineTo(0.0f, 17.4258f)
                curveTo(0.0f, 17.7305f, 0.1992f, 17.918f, 0.5039f, 17.918f)
                lineTo(1.0078f, 17.918f)
                curveTo(1.3945f, 17.918f, 1.6523f, 17.7891f, 1.8047f, 17.5078f)
                lineTo(3.9258f, 13.6172f)
                lineTo(9.8789f, 14.2969f)
                lineTo(5.8242f, 23.2617f)
                curveTo(5.6719f, 23.5781f, 5.8477f, 23.8594f, 6.1523f, 23.8594f)
                lineTo(7.5117f, 23.8594f)
                curveTo(7.8633f, 23.8594f, 8.168f, 23.707f, 8.4141f, 23.4375f)
                lineTo(16.2891f, 14.8359f)
                curveTo(16.6758f, 14.4023f, 16.9219f, 14.2969f, 17.5781f, 14.2969f)
                lineTo(22.3008f, 14.2969f)
                curveTo(24.5391f, 14.2969f, 26.4023f, 13.2891f, 26.4141f, 11.9297f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
