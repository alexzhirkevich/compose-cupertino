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

public val CupertinoIcons.Filled.RectangleStack: ImageVector
    get() {
        if (_rectangleStack != null) {
            return _rectangleStack!!
        }
        _rectangleStack = Builder(name = "RectangleStack", defaultWidth = 24.082.dp, defaultHeight =
                25.4883.dp, viewportWidth = 24.082f, viewportHeight = 25.4883f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5625f, 25.4766f)
                lineTo(20.5195f, 25.4766f)
                curveTo(22.875f, 25.4766f, 24.082f, 24.2812f, 24.082f, 21.9492f)
                lineTo(24.082f, 10.1602f)
                curveTo(24.082f, 7.8281f, 22.875f, 6.6445f, 20.5195f, 6.6445f)
                lineTo(3.5625f, 6.6445f)
                curveTo(1.1836f, 6.6445f, 0.0f, 7.8281f, 0.0f, 10.1602f)
                lineTo(0.0f, 21.9492f)
                curveTo(0.0f, 24.2812f, 1.1836f, 25.4766f, 3.5625f, 25.4766f)
                close()
                moveTo(2.2383f, 4.7578f)
                lineTo(21.8555f, 4.7578f)
                curveTo(21.6797f, 3.6914f, 21.1758f, 3.1055f, 20.0039f, 3.1055f)
                lineTo(4.0898f, 3.1055f)
                curveTo(2.918f, 3.1055f, 2.4141f, 3.6914f, 2.2383f, 4.7578f)
                close()
                moveTo(4.6523f, 1.5117f)
                lineTo(19.4414f, 1.5117f)
                curveTo(19.3711f, 0.5156f, 18.8086f, 0.0f, 17.7188f, 0.0f)
                lineTo(6.3633f, 0.0f)
                curveTo(5.2852f, 0.0f, 4.7227f, 0.5156f, 4.6523f, 1.5117f)
                close()
            }
        }
        .build()
        return _rectangleStack!!
    }

private var _rectangleStack: ImageVector? = null
