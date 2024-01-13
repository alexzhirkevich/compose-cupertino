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

public val CupertinoIcons.Filled.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 15.6797.dp, defaultHeight =
                27.9961.dp, viewportWidth = 15.6797f, viewportHeight = 27.9961f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.1367f, 23.8711f)
                lineTo(11.5547f, 23.8711f)
                curveTo(11.9414f, 23.8711f, 12.2344f, 23.5664f, 12.2344f, 23.1797f)
                curveTo(12.2344f, 22.8047f, 11.9414f, 22.5f, 11.5547f, 22.5f)
                lineTo(4.1367f, 22.5f)
                curveTo(3.75f, 22.5f, 3.4453f, 22.8047f, 3.4453f, 23.1797f)
                curveTo(3.4453f, 23.5664f, 3.75f, 23.8711f, 4.1367f, 23.8711f)
                close()
                moveTo(7.8398f, 27.2695f)
                curveTo(9.6563f, 27.2695f, 11.168f, 26.3789f, 11.2852f, 25.0312f)
                lineTo(4.4063f, 25.0312f)
                curveTo(4.4883f, 26.3789f, 6.0117f, 27.2695f, 7.8398f, 27.2695f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.2188f)
                curveTo(0.0f, 11.7188f, 2.9648f, 12.832f, 3.4453f, 20.6484f)
                curveTo(3.4688f, 21.0703f, 3.7266f, 21.3398f, 4.1719f, 21.3398f)
                lineTo(11.5078f, 21.3398f)
                curveTo(11.9648f, 21.3398f, 12.2109f, 21.0703f, 12.2461f, 20.6484f)
                curveTo(12.7266f, 12.832f, 15.6797f, 11.7188f, 15.6797f, 7.2188f)
                curveTo(15.6797f, 3.1758f, 12.2227f, 0.0f, 7.8398f, 0.0f)
                curveTo(3.457f, 0.0f, 0.0f, 3.1758f, 0.0f, 7.2188f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
