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

public val CupertinoIcons.Outlined.RectanglePortraitArrowtriangle2Outward: ImageVector
    get() {
        if (_rectanglePortraitArrowtriangle2Outward != null) {
            return _rectanglePortraitArrowtriangle2Outward!!
        }
        _rectanglePortraitArrowtriangle2Outward = Builder(name =
                "RectanglePortraitArrowtriangle2Outward", defaultWidth = 29.2998.dp, defaultHeight =
                22.7695.dp, viewportWidth = 29.2998f, viewportHeight = 22.7695f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0327f, 3.6797f)
                lineTo(7.0327f, 19.0898f)
                curveTo(7.0327f, 21.5508f, 8.2515f, 22.7695f, 10.6655f, 22.7695f)
                lineTo(18.6343f, 22.7695f)
                curveTo(21.0366f, 22.7695f, 22.2554f, 21.5508f, 22.2554f, 19.0898f)
                lineTo(22.2554f, 3.6797f)
                curveTo(22.2554f, 1.2188f, 21.0484f, 0.0f, 18.6343f, 0.0f)
                lineTo(10.6655f, 0.0f)
                curveTo(8.2515f, 0.0f, 7.0327f, 1.2188f, 7.0327f, 3.6797f)
                close()
                moveTo(8.9194f, 3.7031f)
                curveTo(8.9194f, 2.5313f, 9.5523f, 1.8867f, 10.771f, 1.8867f)
                lineTo(18.5288f, 1.8867f)
                curveTo(19.7476f, 1.8867f, 20.3687f, 2.5313f, 20.3687f, 3.7031f)
                lineTo(20.3687f, 19.0664f)
                curveTo(20.3687f, 20.2148f, 19.7476f, 20.8828f, 18.5288f, 20.8828f)
                lineTo(10.771f, 20.8828f)
                curveTo(9.5523f, 20.8828f, 8.9194f, 20.2148f, 8.9194f, 19.0664f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.5952f, 14.4023f)
                lineTo(28.8648f, 12.2344f)
                curveTo(29.4507f, 11.8359f, 29.439f, 10.9922f, 28.8648f, 10.6055f)
                lineTo(25.5952f, 8.3906f)
                curveTo(24.8452f, 7.875f, 24.0601f, 8.1563f, 24.0601f, 9.0703f)
                lineTo(24.0601f, 13.7461f)
                curveTo(24.0601f, 14.625f, 24.8804f, 14.8828f, 25.5952f, 14.4023f)
                close()
                moveTo(3.7046f, 14.4023f)
                curveTo(4.4194f, 14.8828f, 5.2398f, 14.625f, 5.2398f, 13.7461f)
                lineTo(5.2398f, 9.0703f)
                curveTo(5.2398f, 8.1563f, 4.4546f, 7.875f, 3.7046f, 8.3906f)
                lineTo(0.4351f, 10.6055f)
                curveTo(-0.1391f, 10.9922f, -0.1509f, 11.8359f, 0.4351f, 12.2344f)
                close()
            }
        }
        .build()
        return _rectanglePortraitArrowtriangle2Outward!!
    }

private var _rectanglePortraitArrowtriangle2Outward: ImageVector? = null
