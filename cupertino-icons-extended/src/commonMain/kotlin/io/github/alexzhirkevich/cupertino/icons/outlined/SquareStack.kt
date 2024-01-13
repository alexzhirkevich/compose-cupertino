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

public val CupertinoIcons.Outlined.SquareStack: ImageVector
    get() {
        if (_squareStack != null) {
            return _squareStack!!
        }
        _squareStack = Builder(name = "SquareStack", defaultWidth = 20.5547.dp, defaultHeight =
                27.2227.dp, viewportWidth = 20.5547f, viewportHeight = 27.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 27.2227f)
                lineTo(17.2266f, 27.2227f)
                curveTo(19.3242f, 27.2227f, 20.5547f, 26.0039f, 20.5547f, 23.5898f)
                lineTo(20.5547f, 10.3008f)
                curveTo(20.5547f, 7.8867f, 19.3125f, 6.668f, 16.875f, 6.668f)
                lineTo(3.6797f, 6.668f)
                curveTo(1.2305f, 6.668f, 0.0f, 7.875f, 0.0f, 10.3008f)
                lineTo(0.0f, 23.5898f)
                curveTo(0.0f, 26.0039f, 1.2305f, 27.2227f, 3.6797f, 27.2227f)
                close()
                moveTo(3.7031f, 25.3359f)
                curveTo(2.5313f, 25.3359f, 1.8867f, 24.7031f, 1.8867f, 23.4844f)
                lineTo(1.8867f, 10.3945f)
                curveTo(1.8867f, 9.1875f, 2.5313f, 8.5547f, 3.7031f, 8.5547f)
                lineTo(16.8398f, 8.5547f)
                curveTo(18.0f, 8.5547f, 18.668f, 9.1875f, 18.668f, 10.3945f)
                lineTo(18.668f, 23.4844f)
                curveTo(18.668f, 24.7031f, 18.0f, 25.3359f, 17.1914f, 25.3359f)
                close()
                moveTo(2.5547f, 4.7813f)
                lineTo(17.9883f, 4.7813f)
                curveTo(17.8125f, 3.7148f, 17.3086f, 3.1289f, 16.1367f, 3.1289f)
                lineTo(4.4063f, 3.1289f)
                curveTo(3.2344f, 3.1289f, 2.7305f, 3.7148f, 2.5547f, 4.7813f)
                close()
                moveTo(4.5938f, 1.5352f)
                lineTo(15.9609f, 1.5352f)
                curveTo(15.8906f, 0.5391f, 15.3164f, 0.0234f, 14.2383f, 0.0234f)
                lineTo(6.3047f, 0.0234f)
                curveTo(5.2266f, 0.0234f, 4.6641f, 0.5391f, 4.5938f, 1.5352f)
                close()
            }
        }
        .build()
        return _squareStack!!
    }

private var _squareStack: ImageVector? = null
