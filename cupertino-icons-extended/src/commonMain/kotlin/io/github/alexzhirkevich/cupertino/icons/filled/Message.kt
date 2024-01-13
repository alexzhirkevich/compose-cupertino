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

public val CupertinoIcons.Filled.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 26.5781.dp, defaultHeight = 24.4336.dp,
                viewportWidth = 26.5781f, viewportHeight = 24.4336f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6406f, 24.4336f)
                curveTo(6.0469f, 24.4336f, 9.5508f, 22.8984f, 11.543f, 21.4688f)
                curveTo(11.7422f, 21.3281f, 11.9062f, 21.2695f, 12.0703f, 21.2695f)
                curveTo(12.2227f, 21.2812f, 12.375f, 21.293f, 12.5273f, 21.293f)
                curveTo(20.9766f, 21.293f, 26.5781f, 16.4883f, 26.5781f, 10.6523f)
                curveTo(26.5781f, 4.7578f, 20.6719f, 0.0f, 13.2891f, 0.0f)
                curveTo(5.9063f, 0.0f, 0.0f, 4.7578f, 0.0f, 10.6523f)
                curveTo(0.0f, 14.4023f, 2.3086f, 17.6953f, 6.0703f, 19.7109f)
                curveTo(6.2461f, 19.8047f, 6.3047f, 19.9805f, 6.2109f, 20.1562f)
                curveTo(5.5547f, 21.2344f, 4.3828f, 22.5234f, 3.9375f, 23.1094f)
                curveTo(3.4805f, 23.6953f, 3.7383f, 24.4336f, 4.6406f, 24.4336f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
