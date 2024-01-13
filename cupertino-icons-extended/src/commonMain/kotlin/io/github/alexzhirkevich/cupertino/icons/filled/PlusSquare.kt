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

public val CupertinoIcons.Filled.PlusSquare: ImageVector
    get() {
        if (_plusSquare != null) {
            return _plusSquare!!
        }
        _plusSquare = Builder(name = "PlusSquare", defaultWidth = 21.5742.dp, defaultHeight =
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
                moveTo(5.0742f, 10.8047f)
                curveTo(5.0742f, 10.1953f, 5.4961f, 9.7734f, 6.1055f, 9.7734f)
                lineTo(9.7734f, 9.7734f)
                lineTo(9.7734f, 6.1055f)
                curveTo(9.7734f, 5.4961f, 10.1836f, 5.0625f, 10.7812f, 5.0625f)
                curveTo(11.3906f, 5.0625f, 11.8125f, 5.4961f, 11.8125f, 6.1055f)
                lineTo(11.8125f, 9.7734f)
                lineTo(15.4922f, 9.7734f)
                curveTo(16.0898f, 9.7734f, 16.5234f, 10.1953f, 16.5234f, 10.8047f)
                curveTo(16.5234f, 11.4023f, 16.0898f, 11.8008f, 15.4922f, 11.8008f)
                lineTo(11.8125f, 11.8008f)
                lineTo(11.8125f, 15.4805f)
                curveTo(11.8125f, 16.0898f, 11.3906f, 16.5117f, 10.7812f, 16.5117f)
                curveTo(10.1836f, 16.5117f, 9.7734f, 16.0781f, 9.7734f, 15.4805f)
                lineTo(9.7734f, 11.8008f)
                lineTo(6.1055f, 11.8008f)
                curveTo(5.4961f, 11.8008f, 5.0742f, 11.4023f, 5.0742f, 10.8047f)
                close()
            }
        }
        .build()
        return _plusSquare!!
    }

private var _plusSquare: ImageVector? = null
