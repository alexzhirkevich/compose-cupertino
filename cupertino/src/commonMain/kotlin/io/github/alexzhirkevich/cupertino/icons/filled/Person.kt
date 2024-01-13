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

public val CupertinoIcons.Filled.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 19.7227.dp, defaultHeight = 21.457.dp,
                viewportWidth = 19.7227f, viewportHeight = 21.457f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0039f, 21.457f)
                lineTo(17.7188f, 21.457f)
                curveTo(18.9727f, 21.457f, 19.7227f, 20.8711f, 19.7227f, 19.8984f)
                curveTo(19.7227f, 16.875f, 15.9375f, 12.7031f, 9.8555f, 12.7031f)
                curveTo(3.7852f, 12.7031f, 0.0f, 16.875f, 0.0f, 19.8984f)
                curveTo(0.0f, 20.8711f, 0.75f, 21.457f, 2.0039f, 21.457f)
                close()
                moveTo(9.8672f, 10.6055f)
                curveTo(12.375f, 10.6055f, 14.5547f, 8.3555f, 14.5547f, 5.4258f)
                curveTo(14.5547f, 2.5313f, 12.375f, 0.3867f, 9.8672f, 0.3867f)
                curveTo(7.3594f, 0.3867f, 5.1797f, 2.5781f, 5.1797f, 5.4492f)
                curveTo(5.1797f, 8.3555f, 7.3477f, 10.6055f, 9.8672f, 10.6055f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
