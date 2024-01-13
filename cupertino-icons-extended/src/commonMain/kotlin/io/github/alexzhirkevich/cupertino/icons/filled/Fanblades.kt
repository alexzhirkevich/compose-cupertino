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

public val CupertinoIcons.Filled.Fanblades: ImageVector
    get() {
        if (_fanblades != null) {
            return _fanblades!!
        }
        _fanblades = Builder(name = "Fanblades", defaultWidth = 25.043.dp, defaultHeight =
                25.0664.dp, viewportWidth = 25.043f, viewportHeight = 25.0664f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.6172f)
                curveTo(0.0f, 20.3906f, 3.4102f, 24.2109f, 6.6328f, 24.2109f)
                curveTo(9.5508f, 24.2109f, 10.9922f, 21.5625f, 12.7617f, 16.8867f)
                curveTo(12.8555f, 16.8867f, 12.9609f, 16.875f, 13.0547f, 16.8633f)
                curveTo(13.1953f, 16.8516f, 13.3242f, 16.8398f, 13.4531f, 16.8047f)
                lineTo(13.4531f, 21.7852f)
                curveTo(13.4531f, 23.9297f, 14.543f, 25.0547f, 16.6055f, 25.0547f)
                curveTo(20.3789f, 25.0547f, 24.2109f, 21.6445f, 24.2109f, 18.4219f)
                curveTo(24.2109f, 15.5039f, 21.5508f, 14.0625f, 16.875f, 12.293f)
                curveTo(16.875f, 12.1992f, 16.8633f, 12.0938f, 16.8516f, 12.0f)
                curveTo(16.8398f, 11.8594f, 16.8281f, 11.7305f, 16.793f, 11.5898f)
                lineTo(21.7852f, 11.5898f)
                curveTo(23.918f, 11.5898f, 25.043f, 10.5f, 25.043f, 8.4375f)
                curveTo(25.043f, 4.6641f, 21.6328f, 0.832f, 18.4102f, 0.832f)
                curveTo(15.4922f, 0.832f, 14.0508f, 3.4922f, 12.2812f, 8.168f)
                curveTo(12.1875f, 8.168f, 12.082f, 8.1797f, 11.9883f, 8.1914f)
                curveTo(11.8477f, 8.2031f, 11.7188f, 8.2148f, 11.5898f, 8.25f)
                lineTo(11.5898f, 3.2695f)
                curveTo(11.5898f, 1.125f, 10.5f, 0.0f, 8.4375f, 0.0f)
                curveTo(4.6641f, 0.0f, 0.832f, 3.4102f, 0.832f, 6.6328f)
                curveTo(0.832f, 9.5508f, 3.4922f, 10.9922f, 8.1563f, 12.7617f)
                curveTo(8.168f, 12.8672f, 8.168f, 12.9844f, 8.1797f, 13.0781f)
                curveTo(8.1914f, 13.207f, 8.2266f, 13.3359f, 8.2383f, 13.4648f)
                lineTo(3.2578f, 13.4648f)
                curveTo(1.125f, 13.4648f, 0.0f, 14.543f, 0.0f, 16.6172f)
                close()
                moveTo(9.8086f, 12.5273f)
                curveTo(9.8086f, 11.0273f, 11.0156f, 9.8086f, 12.5156f, 9.8086f)
                curveTo(14.0156f, 9.8086f, 15.2344f, 11.0273f, 15.2344f, 12.5273f)
                curveTo(15.2344f, 14.0273f, 14.0156f, 15.2461f, 12.5156f, 15.2461f)
                curveTo(11.0273f, 15.2461f, 9.8086f, 14.0273f, 9.8086f, 12.5273f)
                close()
                moveTo(10.9102f, 12.5273f)
                curveTo(10.9102f, 13.418f, 11.6133f, 14.1211f, 12.5156f, 14.1211f)
                curveTo(13.4062f, 14.1211f, 14.1094f, 13.418f, 14.1094f, 12.5273f)
                curveTo(14.1094f, 11.6367f, 13.3945f, 10.9219f, 12.5156f, 10.9219f)
                curveTo(11.6133f, 10.9219f, 10.9102f, 11.625f, 10.9102f, 12.5273f)
                close()
            }
        }
        .build()
        return _fanblades!!
    }

private var _fanblades: ImageVector? = null
