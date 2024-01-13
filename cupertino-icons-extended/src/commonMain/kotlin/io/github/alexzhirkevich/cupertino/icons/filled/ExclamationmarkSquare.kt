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

public val CupertinoIcons.Filled.ExclamationmarkSquare: ImageVector
    get() {
        if (_exclamationmarkSquare != null) {
            return _exclamationmarkSquare!!
        }
        _exclamationmarkSquare = Builder(name = "ExclamationmarkSquare", defaultWidth = 21.5742.dp,
                defaultHeight = 21.5977.dp, viewportWidth = 21.5742f, viewportHeight =
                21.5977f).apply {
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
                moveTo(10.793f, 12.9727f)
                curveTo(10.1836f, 12.9727f, 9.8555f, 12.6328f, 9.8438f, 12.0117f)
                lineTo(9.6797f, 5.625f)
                curveTo(9.668f, 5.0039f, 10.125f, 4.5586f, 10.7812f, 4.5586f)
                curveTo(11.4258f, 4.5586f, 11.9062f, 5.0156f, 11.8945f, 5.6367f)
                lineTo(11.7305f, 12.0117f)
                curveTo(11.7188f, 12.6445f, 11.3789f, 12.9727f, 10.793f, 12.9727f)
                close()
                moveTo(10.793f, 16.8984f)
                curveTo(10.0898f, 16.8984f, 9.4805f, 16.3359f, 9.4805f, 15.6445f)
                curveTo(9.4805f, 14.9531f, 10.0781f, 14.3789f, 10.793f, 14.3789f)
                curveTo(11.5078f, 14.3789f, 12.1055f, 14.9414f, 12.1055f, 15.6445f)
                curveTo(12.1055f, 16.3477f, 11.4961f, 16.8984f, 10.793f, 16.8984f)
                close()
            }
        }
        .build()
        return _exclamationmarkSquare!!
    }

private var _exclamationmarkSquare: ImageVector? = null
