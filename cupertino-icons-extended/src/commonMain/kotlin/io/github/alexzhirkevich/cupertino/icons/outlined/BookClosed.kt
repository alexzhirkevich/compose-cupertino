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

public val CupertinoIcons.Outlined.BookClosed: ImageVector
    get() {
        if (_bookClosed != null) {
            return _bookClosed!!
        }
        _bookClosed = Builder(name = "BookClosed", defaultWidth = 19.7109.dp, defaultHeight =
                25.1133.dp, viewportWidth = 19.7109f, viewportHeight = 25.1133f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5977f, 25.1133f)
                lineTo(18.7734f, 25.1133f)
                curveTo(19.2891f, 25.1133f, 19.7109f, 24.7031f, 19.7109f, 24.1758f)
                curveTo(19.7109f, 23.7656f, 19.4297f, 23.4023f, 19.0547f, 23.2734f)
                curveTo(17.5781f, 22.6875f, 17.2734f, 20.7773f, 18.7266f, 19.3125f)
                curveTo(19.1719f, 18.8672f, 19.7109f, 18.293f, 19.7109f, 17.1211f)
                lineTo(19.7109f, 3.6797f)
                curveTo(19.7109f, 1.2422f, 18.5039f, 0.0f, 16.0781f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.207f, 0.0f, 0.0f, 1.2305f, 0.0f, 3.6797f)
                lineTo(0.0f, 21.4922f)
                curveTo(0.0f, 23.9062f, 1.2188f, 25.1133f, 3.5977f, 25.1133f)
                close()
                moveTo(1.8867f, 18.3398f)
                lineTo(1.8867f, 3.7148f)
                curveTo(1.8867f, 2.543f, 2.5078f, 1.8867f, 3.7148f, 1.8867f)
                lineTo(15.9844f, 1.8867f)
                curveTo(17.2031f, 1.8867f, 17.8242f, 2.543f, 17.8242f, 3.7148f)
                lineTo(17.8242f, 16.8633f)
                curveTo(17.8242f, 17.4961f, 17.4609f, 17.8594f, 16.8047f, 17.8594f)
                lineTo(3.7969f, 17.8594f)
                curveTo(3.0352f, 17.8594f, 2.4023f, 18.0234f, 1.8867f, 18.3398f)
                close()
                moveTo(3.7031f, 23.2266f)
                curveTo(2.5195f, 23.2266f, 1.8867f, 22.5938f, 1.8867f, 21.4805f)
                curveTo(1.8867f, 20.4258f, 2.6367f, 19.7461f, 3.8086f, 19.7461f)
                lineTo(15.832f, 19.7461f)
                curveTo(15.9844f, 19.7461f, 16.125f, 19.7344f, 16.2422f, 19.7109f)
                curveTo(15.6914f, 20.9297f, 15.7852f, 22.2188f, 16.4062f, 23.2266f)
                close()
                moveTo(3.2695f, 18.8672f)
                lineTo(4.8047f, 18.8672f)
                lineTo(4.8047f, 1.4297f)
                lineTo(3.2695f, 1.4297f)
                close()
            }
        }
        .build()
        return _bookClosed!!
    }

private var _bookClosed: ImageVector? = null
