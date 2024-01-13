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

public val CupertinoIcons.Filled.BoltHorizontal: ImageVector
    get() {
        if (_boltHorizontal != null) {
            return _boltHorizontal!!
        }
        _boltHorizontal = Builder(name = "BoltHorizontal", defaultWidth = 32.2991.dp, defaultHeight
                = 15.5039.dp, viewportWidth = 32.2991f, viewportHeight = 15.5039f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.4001f, 12.7383f)
                curveTo(-0.7132f, 14.168f, 0.7165f, 15.3281f, 2.0056f, 14.5781f)
                lineTo(10.5017f, 9.7266f)
                lineTo(20.5798f, 15.1289f)
                curveTo(21.0486f, 15.3633f, 21.447f, 15.5039f, 21.8337f, 15.5039f)
                curveTo(22.3728f, 15.5039f, 22.865f, 15.2578f, 23.3337f, 14.6602f)
                lineTo(31.9587f, 3.7617f)
                curveTo(32.8962f, 2.5781f, 31.7478f, 1.1133f, 30.3298f, 1.9102f)
                lineTo(21.8337f, 6.7969f)
                lineTo(11.7439f, 1.3945f)
                curveTo(11.2868f, 1.1367f, 10.865f, 1.0195f, 10.49f, 1.0195f)
                curveTo(9.9392f, 1.0195f, 9.4704f, 1.2656f, 9.0017f, 1.8633f)
                close()
            }
        }
        .build()
        return _boltHorizontal!!
    }

private var _boltHorizontal: ImageVector? = null
