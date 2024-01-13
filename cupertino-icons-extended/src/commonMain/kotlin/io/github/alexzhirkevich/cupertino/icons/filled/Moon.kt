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

public val CupertinoIcons.Filled.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 23.1211.dp, defaultHeight = 23.2617.dp,
                viewportWidth = 23.1211f, viewportHeight = 23.2617f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1289f, 15.7031f)
                curveTo(11.7891f, 15.7031f, 7.7344f, 11.7305f, 7.7344f, 5.3789f)
                curveTo(7.7344f, 4.0664f, 8.0508f, 2.1914f, 8.4727f, 1.2188f)
                curveTo(8.5781f, 0.9492f, 8.6016f, 0.7852f, 8.6016f, 0.668f)
                curveTo(8.6016f, 0.3516f, 8.3672f, 0.0f, 7.9102f, 0.0f)
                curveTo(7.7813f, 0.0f, 7.5f, 0.0352f, 7.2422f, 0.1289f)
                curveTo(2.9063f, 1.8633f, 0.0f, 6.5273f, 0.0f, 11.4375f)
                curveTo(0.0f, 18.3281f, 5.25f, 23.25f, 12.1172f, 23.25f)
                curveTo(17.168f, 23.25f, 21.5391f, 20.1914f, 22.9922f, 16.3711f)
                curveTo(23.0977f, 16.1016f, 23.1211f, 15.8203f, 23.1211f, 15.7148f)
                curveTo(23.1211f, 15.2812f, 22.7578f, 14.9883f, 22.4297f, 14.9883f)
                curveTo(22.2773f, 14.9883f, 22.1484f, 15.0234f, 21.9258f, 15.0938f)
                curveTo(21.0234f, 15.3867f, 19.5703f, 15.7031f, 18.1289f, 15.7031f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
