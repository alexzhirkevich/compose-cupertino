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

public val CupertinoIcons.Filled.CheckmarkSquare: ImageVector
    get() {
        if (_checkmarkSquare != null) {
            return _checkmarkSquare!!
        }
        _checkmarkSquare = Builder(name = "CheckmarkSquare", defaultWidth = 21.5742.dp,
                defaultHeight = 21.5977.dp, viewportWidth = 21.5742f, viewportHeight =
                21.5977f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
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
                moveTo(9.4805f, 16.5234f)
                curveTo(9.082f, 16.5234f, 8.7539f, 16.3594f, 8.4492f, 15.9492f)
                lineTo(5.5078f, 12.3398f)
                curveTo(5.332f, 12.1055f, 5.2266f, 11.8477f, 5.2266f, 11.5781f)
                curveTo(5.2266f, 11.0508f, 5.6367f, 10.6172f, 6.1758f, 10.6172f)
                curveTo(6.5039f, 10.6172f, 6.7617f, 10.7227f, 7.0547f, 11.1094f)
                lineTo(9.4336f, 14.1797f)
                lineTo(14.4375f, 6.1406f)
                curveTo(14.6602f, 5.7891f, 14.9648f, 5.6016f, 15.2812f, 5.6016f)
                curveTo(15.7852f, 5.6016f, 16.2656f, 5.9531f, 16.2656f, 6.5039f)
                curveTo(16.2656f, 6.7617f, 16.125f, 7.0313f, 15.9727f, 7.2773f)
                lineTo(10.4648f, 15.9492f)
                curveTo(10.2188f, 16.3359f, 9.8789f, 16.5234f, 9.4805f, 16.5234f)
                close()
            }
        }
        .build()
        return _checkmarkSquare!!
    }

private var _checkmarkSquare: ImageVector? = null
