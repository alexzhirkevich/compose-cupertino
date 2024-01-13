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

public val CupertinoIcons.Outlined.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 27.6328.dp, defaultHeight =
                21.5742.dp, viewportWidth = 27.6328f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0391f, 9.0586f)
                curveTo(4.125f, 9.6094f, 4.8984f, 11.0039f, 5.9063f, 10.3711f)
                lineTo(9.2813f, 8.2617f)
                curveTo(9.9492f, 7.8398f, 9.9141f, 6.8438f, 9.2813f, 6.4453f)
                lineTo(5.9063f, 4.3359f)
                curveTo(4.8984f, 3.7031f, 4.1133f, 5.0859f, 5.0391f, 5.6484f)
                lineTo(7.8633f, 7.3477f)
                close()
                moveTo(9.9844f, 10.3594f)
                curveTo(9.9844f, 10.7695f, 10.3125f, 11.1094f, 10.7344f, 11.1094f)
                lineTo(15.1992f, 11.1094f)
                curveTo(15.6211f, 11.1094f, 15.9492f, 10.7695f, 15.9492f, 10.3594f)
                curveTo(15.9492f, 9.9375f, 15.6211f, 9.5977f, 15.1992f, 9.5977f)
                lineTo(10.7344f, 9.5977f)
                curveTo(10.3125f, 9.5977f, 9.9844f, 9.9375f, 9.9844f, 10.3594f)
                close()
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
                moveTo(3.7031f, 19.6875f)
                curveTo(2.5313f, 19.6875f, 1.8867f, 19.0664f, 1.8867f, 17.8477f)
                lineTo(1.8867f, 3.7383f)
                curveTo(1.8867f, 2.5195f, 2.5313f, 1.8867f, 3.7031f, 1.8867f)
                lineTo(23.9297f, 1.8867f)
                curveTo(25.0898f, 1.8867f, 25.7461f, 2.5195f, 25.7461f, 3.7383f)
                lineTo(25.7461f, 17.8477f)
                curveTo(25.7461f, 19.0664f, 25.0898f, 19.6875f, 23.9297f, 19.6875f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
