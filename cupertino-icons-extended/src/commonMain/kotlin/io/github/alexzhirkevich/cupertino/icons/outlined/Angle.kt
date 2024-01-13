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

public val CupertinoIcons.Outlined.Angle: ImageVector
    get() {
        if (_angle != null) {
            return _angle!!
        }
        _angle = Builder(name = "Angle", defaultWidth = 26.1914.dp, defaultHeight = 19.7227.dp,
                viewportWidth = 26.1914f, viewportHeight = 19.7227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.7852f)
                curveTo(0.0f, 19.3008f, 0.4336f, 19.7227f, 0.9375f, 19.7227f)
                lineTo(25.2422f, 19.7227f)
                curveTo(25.7578f, 19.7227f, 26.1914f, 19.3008f, 26.1914f, 18.7852f)
                curveTo(26.1914f, 18.2695f, 25.7578f, 17.8359f, 25.2422f, 17.8359f)
                lineTo(3.2227f, 17.8359f)
                lineTo(19.3711f, 1.6875f)
                curveTo(19.7344f, 1.3242f, 19.7344f, 0.7148f, 19.3711f, 0.3516f)
                curveTo(19.0078f, -0.0117f, 18.4102f, -0.0117f, 18.0352f, 0.3516f)
                lineTo(0.2695f, 18.1172f)
                curveTo(0.1172f, 18.2812f, 0.0f, 18.5273f, 0.0f, 18.7852f)
                close()
                moveTo(13.6641f, 18.75f)
                lineTo(15.5508f, 18.75f)
                curveTo(15.5508f, 14.7422f, 13.9219f, 11.1094f, 11.2969f, 8.4727f)
                lineTo(9.9492f, 9.7969f)
                curveTo(12.2461f, 12.0938f, 13.6641f, 15.2578f, 13.6641f, 18.75f)
                close()
            }
        }
        .build()
        return _angle!!
    }

private var _angle: ImageVector? = null
