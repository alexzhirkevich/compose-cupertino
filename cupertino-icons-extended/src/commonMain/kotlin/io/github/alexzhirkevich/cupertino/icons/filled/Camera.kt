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

public val CupertinoIcons.Filled.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 28.7812.dp, defaultHeight = 23.0977.dp,
                viewportWidth = 28.7812f, viewportHeight = 23.0977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 22.3477f)
                lineTo(25.1016f, 22.3477f)
                curveTo(27.5391f, 22.3477f, 28.7812f, 21.1289f, 28.7812f, 18.7148f)
                lineTo(28.7812f, 6.4453f)
                curveTo(28.7812f, 4.0313f, 27.5391f, 2.8242f, 25.1016f, 2.8242f)
                lineTo(21.75f, 2.8242f)
                curveTo(20.8242f, 2.8242f, 20.543f, 2.6367f, 20.0156f, 2.0508f)
                lineTo(19.0781f, 0.9961f)
                curveTo(18.4922f, 0.3516f, 17.8945f, 0.0f, 16.6875f, 0.0f)
                lineTo(12.0117f, 0.0f)
                curveTo(10.8047f, 0.0f, 10.207f, 0.3516f, 9.6211f, 0.9961f)
                lineTo(8.6836f, 2.0508f)
                curveTo(8.1563f, 2.625f, 7.8633f, 2.8242f, 6.9492f, 2.8242f)
                lineTo(3.6797f, 2.8242f)
                curveTo(1.2305f, 2.8242f, 0.0f, 4.0313f, 0.0f, 6.4453f)
                lineTo(0.0f, 18.7148f)
                curveTo(0.0f, 21.1289f, 1.2305f, 22.3477f, 3.6797f, 22.3477f)
                close()
                moveTo(14.3906f, 18.8906f)
                curveTo(10.8398f, 18.8906f, 7.9922f, 16.0547f, 7.9922f, 12.4805f)
                curveTo(7.9922f, 8.918f, 10.8398f, 6.082f, 14.3906f, 6.082f)
                curveTo(17.9414f, 6.082f, 20.7773f, 8.918f, 20.7773f, 12.4805f)
                curveTo(20.7773f, 16.0547f, 17.9297f, 18.8906f, 14.3906f, 18.8906f)
                close()
                moveTo(14.3906f, 17.1094f)
                curveTo(16.9453f, 17.1094f, 19.0078f, 15.0586f, 19.0078f, 12.4805f)
                curveTo(19.0078f, 9.9141f, 16.9453f, 7.8516f, 14.3906f, 7.8516f)
                curveTo(11.8359f, 7.8516f, 9.7617f, 9.9141f, 9.7617f, 12.4805f)
                curveTo(9.7617f, 15.0586f, 11.8477f, 17.1094f, 14.3906f, 17.1094f)
                close()
                moveTo(21.5625f, 8.168f)
                curveTo(21.5625f, 7.3711f, 22.2656f, 6.668f, 23.0859f, 6.668f)
                curveTo(23.8945f, 6.668f, 24.5859f, 7.3711f, 24.5859f, 8.168f)
                curveTo(24.5859f, 9.0f, 23.8945f, 9.668f, 23.0859f, 9.6797f)
                curveTo(22.2656f, 9.6797f, 21.5625f, 9.0117f, 21.5625f, 8.168f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
