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

public val CupertinoIcons.Filled.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 29.2969.dp, defaultHeight = 24.2227.dp,
                viewportWidth = 29.2969f, viewportHeight = 24.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0117f, 20.25f)
                lineTo(26.2852f, 20.25f)
                curveTo(28.2891f, 20.25f, 29.2969f, 19.3008f, 29.2969f, 17.2383f)
                lineTo(29.2969f, 3.8086f)
                curveTo(29.2969f, 1.7578f, 28.2891f, 0.8086f, 26.2852f, 0.8086f)
                lineTo(3.0117f, 0.8086f)
                curveTo(1.0078f, 0.8086f, 0.0f, 1.7578f, 0.0f, 3.8086f)
                lineTo(0.0f, 17.2383f)
                curveTo(0.0f, 19.3008f, 1.0078f, 20.25f, 3.0117f, 20.25f)
                close()
                moveTo(8.7539f, 24.2227f)
                lineTo(20.543f, 24.2227f)
                curveTo(21.0586f, 24.2227f, 21.4922f, 23.8008f, 21.4922f, 23.2734f)
                curveTo(21.4922f, 22.7461f, 21.0586f, 22.3242f, 20.543f, 22.3242f)
                lineTo(8.7539f, 22.3242f)
                curveTo(8.2383f, 22.3242f, 7.8047f, 22.7461f, 7.8047f, 23.2734f)
                curveTo(7.8047f, 23.8008f, 8.2383f, 24.2227f, 8.7539f, 24.2227f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
