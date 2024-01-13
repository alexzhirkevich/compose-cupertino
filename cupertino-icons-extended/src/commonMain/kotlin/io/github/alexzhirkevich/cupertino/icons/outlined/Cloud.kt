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

public val CupertinoIcons.Outlined.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 28.0078.dp, defaultHeight = 18.7148.dp,
                viewportWidth = 28.0078f, viewportHeight = 18.7148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7422f, 18.5508f)
                lineTo(21.0f, 18.5508f)
                curveTo(24.9492f, 18.5508f, 28.0078f, 15.5625f, 28.0078f, 11.7422f)
                curveTo(28.0078f, 7.8867f, 24.8789f, 4.9805f, 20.625f, 4.9805f)
                curveTo(19.0664f, 1.8867f, 16.207f, 0.0f, 12.7266f, 0.0f)
                curveTo(8.1797f, 0.0f, 4.3359f, 3.5273f, 3.9258f, 8.2031f)
                curveTo(1.582f, 8.8711f, 0.0f, 10.8398f, 0.0f, 13.3359f)
                curveTo(0.0f, 16.2188f, 2.0977f, 18.5508f, 5.7422f, 18.5508f)
                close()
                moveTo(5.7188f, 16.6641f)
                curveTo(3.3164f, 16.6641f, 1.8867f, 15.3633f, 1.8867f, 13.3945f)
                curveTo(1.8867f, 11.707f, 2.9648f, 10.4883f, 4.8633f, 9.9844f)
                curveTo(5.5195f, 9.8203f, 5.7656f, 9.5156f, 5.8125f, 8.8359f)
                curveTo(6.0938f, 4.8633f, 9.0703f, 1.8867f, 12.7266f, 1.8867f)
                curveTo(15.5508f, 1.8867f, 17.7305f, 3.457f, 19.043f, 6.1523f)
                curveTo(19.3242f, 6.7266f, 19.6641f, 6.9258f, 20.3789f, 6.9258f)
                curveTo(24.0469f, 6.9258f, 26.1094f, 9.1406f, 26.1094f, 11.7891f)
                curveTo(26.1094f, 14.5195f, 23.9297f, 16.6641f, 21.1289f, 16.6641f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
