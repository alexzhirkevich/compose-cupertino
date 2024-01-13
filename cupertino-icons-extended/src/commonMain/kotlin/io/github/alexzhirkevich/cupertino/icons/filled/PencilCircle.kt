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

public val CupertinoIcons.Filled.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) {
            return _pencilCircle!!
        }
        _pencilCircle = Builder(name = "PencilCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(8.0859f, 17.2031f)
                lineTo(6.4102f, 17.8359f)
                curveTo(6.1523f, 17.9297f, 5.8594f, 17.6719f, 5.9883f, 17.3672f)
                lineTo(6.668f, 15.7734f)
                lineTo(14.5664f, 7.875f)
                lineTo(16.0078f, 9.3164f)
                close()
                moveTo(16.7344f, 8.5898f)
                lineTo(15.293f, 7.1602f)
                lineTo(16.1836f, 6.2695f)
                curveTo(16.582f, 5.8945f, 17.0273f, 5.8477f, 17.3906f, 6.2109f)
                lineTo(17.6602f, 6.4922f)
                curveTo(18.0352f, 6.8555f, 18.0117f, 7.3125f, 17.6133f, 7.7109f)
                close()
            }
        }
        .build()
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
