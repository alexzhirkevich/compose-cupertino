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

public val CupertinoIcons.Filled.Level: ImageVector
    get() {
        if (_level != null) {
            return _level!!
        }
        _level = Builder(name = "Level", defaultWidth = 28.6642.dp, defaultHeight = 12.7148.dp,
                viewportWidth = 28.6642f, viewportHeight = 12.7148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1875f, 12.7148f)
                lineTo(4.7813f, 12.7148f)
                lineTo(4.7813f, 0.0117f)
                lineTo(3.1641f, 0.0117f)
                curveTo(1.0781f, 0.0117f, 0.0f, 1.0898f, 0.0f, 3.1641f)
                lineTo(0.0117f, 9.5625f)
                curveTo(0.0117f, 11.6484f, 1.0781f, 12.7148f, 3.1875f, 12.7148f)
                close()
                moveTo(5.9063f, 12.7148f)
                lineTo(22.7578f, 12.7148f)
                lineTo(22.7578f, 0.0117f)
                lineTo(20.7422f, 0.0117f)
                curveTo(20.4844f, 3.3633f, 17.8711f, 5.5664f, 14.3438f, 5.5664f)
                curveTo(10.8164f, 5.5664f, 8.2031f, 3.3633f, 7.9336f, 0.0117f)
                lineTo(5.9063f, 0.0117f)
                close()
                moveTo(23.8828f, 12.7148f)
                lineTo(25.4766f, 12.7148f)
                curveTo(27.5742f, 12.7148f, 28.6289f, 11.6484f, 28.6406f, 9.5625f)
                lineTo(28.6641f, 3.1641f)
                curveTo(28.6758f, 1.0898f, 27.5859f, 0.0117f, 25.4883f, 0.0117f)
                lineTo(23.8828f, 0.0117f)
                close()
                moveTo(14.3438f, 4.4883f)
                curveTo(17.1797f, 4.4883f, 19.2891f, 2.7188f, 19.4883f, 0.0117f)
                lineTo(17.6719f, 0.0117f)
                curveTo(17.5195f, 1.7578f, 16.1719f, 2.9063f, 14.3438f, 2.9063f)
                curveTo(12.5039f, 2.9063f, 11.168f, 1.7578f, 11.0156f, 0.0117f)
                lineTo(9.1875f, 0.0117f)
                curveTo(9.3867f, 2.7188f, 11.4961f, 4.4883f, 14.3438f, 4.4883f)
                close()
            }
        }
        .build()
        return _level!!
    }

private var _level: ImageVector? = null
