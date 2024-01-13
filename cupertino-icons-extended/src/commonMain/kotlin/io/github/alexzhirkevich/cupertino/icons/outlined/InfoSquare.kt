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

public val CupertinoIcons.Outlined.InfoSquare: ImageVector
    get() {
        if (_infoSquare != null) {
            return _infoSquare!!
        }
        _infoSquare = Builder(name = "InfoSquare", defaultWidth = 21.5742.dp, defaultHeight =
                21.5977.dp, viewportWidth = 21.5742f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(17.8945f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3789f, 21.5742f, 17.9648f)
                lineTo(21.5742f, 3.6563f)
                curveTo(21.5742f, 1.2422f, 20.3555f, 0.0234f, 17.8945f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(3.7031f, 19.7109f)
                curveTo(2.5313f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(17.8711f, 1.9102f)
                curveTo(19.0312f, 1.9102f, 19.6875f, 2.5313f, 19.6875f, 3.75f)
                lineTo(19.6875f, 17.8711f)
                curveTo(19.6875f, 19.0898f, 19.0312f, 19.7109f, 17.8711f, 19.7109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7539f, 17.3555f)
                lineTo(13.5234f, 17.3555f)
                curveTo(14.0039f, 17.3555f, 14.3789f, 17.0039f, 14.3789f, 16.5234f)
                curveTo(14.3789f, 16.0664f, 14.0039f, 15.7031f, 13.5234f, 15.7031f)
                lineTo(12.0703f, 15.7031f)
                lineTo(12.0703f, 9.7383f)
                curveTo(12.0703f, 9.1055f, 11.7539f, 8.6836f, 11.1562f, 8.6836f)
                lineTo(8.9531f, 8.6836f)
                curveTo(8.4727f, 8.6836f, 8.0977f, 9.0469f, 8.0977f, 9.5039f)
                curveTo(8.0977f, 9.9844f, 8.4727f, 10.3359f, 8.9531f, 10.3359f)
                lineTo(10.207f, 10.3359f)
                lineTo(10.207f, 15.7031f)
                lineTo(8.7539f, 15.7031f)
                curveTo(8.2734f, 15.7031f, 7.8984f, 16.0664f, 7.8984f, 16.5234f)
                curveTo(7.8984f, 17.0039f, 8.2734f, 17.3555f, 8.7539f, 17.3555f)
                close()
                moveTo(10.6992f, 6.7383f)
                curveTo(11.5547f, 6.7383f, 12.2227f, 6.0586f, 12.2227f, 5.2031f)
                curveTo(12.2227f, 4.3477f, 11.5547f, 3.668f, 10.6992f, 3.668f)
                curveTo(9.8555f, 3.668f, 9.1758f, 4.3477f, 9.1758f, 5.2031f)
                curveTo(9.1758f, 6.0586f, 9.8555f, 6.7383f, 10.6992f, 6.7383f)
                close()
            }
        }
        .build()
        return _infoSquare!!
    }

private var _infoSquare: ImageVector? = null
