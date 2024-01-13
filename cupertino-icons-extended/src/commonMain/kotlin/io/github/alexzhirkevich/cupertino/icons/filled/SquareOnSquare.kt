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

public val CupertinoIcons.Filled.SquareOnSquare: ImageVector
    get() {
        if (_squareOnSquare != null) {
            return _squareOnSquare!!
        }
        _squareOnSquare = Builder(name = "SquareOnSquare", defaultWidth = 24.7969.dp, defaultHeight
                = 24.5742.dp, viewportWidth = 24.7969f, viewportHeight = 24.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.5156f)
                curveTo(0.0f, 17.9297f, 1.2188f, 19.1484f, 3.6797f, 19.1484f)
                lineTo(4.0781f, 19.1484f)
                lineTo(4.0781f, 9.082f)
                curveTo(4.0781f, 5.7656f, 6.0234f, 3.8555f, 9.3633f, 3.8555f)
                lineTo(19.1133f, 3.8555f)
                lineTo(19.1133f, 3.6563f)
                curveTo(19.1133f, 1.2422f, 17.8828f, 0.0234f, 15.4453f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2188f, 0.0234f, 0.0f, 1.2422f, 0.0f, 3.6563f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3633f, 24.5742f)
                lineTo(21.1289f, 24.5742f)
                curveTo(23.5664f, 24.5742f, 24.7969f, 23.3555f, 24.7969f, 20.9414f)
                lineTo(24.7969f, 9.082f)
                curveTo(24.7969f, 6.668f, 23.5664f, 5.4492f, 21.1289f, 5.4492f)
                lineTo(9.3633f, 5.4492f)
                curveTo(6.9023f, 5.4492f, 5.6836f, 6.6563f, 5.6836f, 9.082f)
                lineTo(5.6836f, 20.9414f)
                curveTo(5.6836f, 23.3555f, 6.9023f, 24.5742f, 9.3633f, 24.5742f)
                close()
            }
        }
        .build()
        return _squareOnSquare!!
    }

private var _squareOnSquare: ImageVector? = null
