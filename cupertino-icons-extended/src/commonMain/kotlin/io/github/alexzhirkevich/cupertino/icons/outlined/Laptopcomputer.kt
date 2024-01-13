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

public val CupertinoIcons.Outlined.Laptopcomputer: ImageVector
    get() {
        if (_laptopcomputer != null) {
            return _laptopcomputer!!
        }
        _laptopcomputer = Builder(name = "Laptopcomputer", defaultWidth = 33.7969.dp, defaultHeight
                = 19.0898.dp, viewportWidth = 33.7969f, viewportHeight = 19.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.7539f)
                curveTo(0.0f, 18.4922f, 0.5977f, 19.0898f, 1.3242f, 19.0898f)
                lineTo(32.4727f, 19.0898f)
                curveTo(33.1992f, 19.0898f, 33.7969f, 18.4922f, 33.7969f, 17.7539f)
                curveTo(33.7969f, 17.0156f, 33.1992f, 16.418f, 32.4727f, 16.418f)
                lineTo(29.9062f, 16.418f)
                lineTo(29.9062f, 2.5078f)
                curveTo(29.9062f, 0.8672f, 29.0273f, 0.0234f, 27.3984f, 0.0234f)
                lineTo(6.3984f, 0.0234f)
                curveTo(4.8516f, 0.0234f, 3.8906f, 0.8672f, 3.8906f, 2.5078f)
                lineTo(3.8906f, 16.418f)
                lineTo(1.3242f, 16.418f)
                curveTo(0.5977f, 16.418f, 0.0f, 17.0156f, 0.0f, 17.7539f)
                close()
                moveTo(5.7773f, 16.418f)
                lineTo(5.7773f, 3.0352f)
                curveTo(5.7773f, 2.2852f, 6.1523f, 1.9102f, 6.9023f, 1.9102f)
                lineTo(26.8945f, 1.9102f)
                curveTo(27.6445f, 1.9102f, 28.0195f, 2.2852f, 28.0195f, 3.0352f)
                lineTo(28.0195f, 16.418f)
                close()
            }
        }
        .build()
        return _laptopcomputer!!
    }

private var _laptopcomputer: ImageVector? = null
