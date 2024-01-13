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

public val CupertinoIcons.Filled.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 28.9301.dp, defaultHeight = 27.1897.dp,
                viewportWidth = 28.9301f, viewportHeight = 27.1897f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6863f, 26.2687f)
                curveTo(3.7292f, 27.3116f, 4.948f, 27.2296f, 6.0027f, 26.0226f)
                lineTo(17.1472f, 13.3312f)
                lineTo(13.7019f, 9.8858f)
                lineTo(0.9753f, 20.9952f)
                curveTo(-0.2434f, 22.0616f, -0.3137f, 23.2687f, 0.7292f, 24.3233f)
                close()
                moveTo(23.5222f, 16.1788f)
                curveTo(24.0261f, 16.6593f, 24.6003f, 16.6944f, 25.0808f, 16.214f)
                lineTo(28.6082f, 12.7101f)
                curveTo(29.0652f, 12.253f, 29.03f, 11.6437f, 28.5378f, 11.1632f)
                lineTo(27.6941f, 10.3077f)
                curveTo(27.2371f, 9.8624f, 26.9441f, 9.7921f, 26.4519f, 9.8272f)
                lineTo(25.0808f, 9.9913f)
                lineTo(24.2019f, 9.1124f)
                lineTo(24.6003f, 7.4601f)
                curveTo(24.7996f, 6.6515f, 24.4949f, 5.796f, 23.6394f, 4.9405f)
                lineTo(21.2839f, 2.6085f)
                curveTo(18.0261f, -0.6376f, 12.0261f, -1.0009f, 8.6628f, 2.3507f)
                curveTo(8.1003f, 2.9132f, 8.2058f, 3.546f, 8.5691f, 3.9444f)
                curveTo(8.8503f, 4.214f, 9.2839f, 4.3546f, 9.6941f, 4.2257f)
                curveTo(11.9675f, 3.546f, 13.948f, 3.4171f, 15.6589f, 4.4366f)
                lineTo(14.7566f, 6.8038f)
                curveTo(14.3699f, 7.7999f, 14.5808f, 8.503f, 15.2136f, 9.1476f)
                lineTo(17.8269f, 11.7608f)
                curveTo(18.3074f, 12.2413f, 18.8113f, 12.3819f, 19.573f, 12.2296f)
                lineTo(21.4597f, 11.8429f)
                lineTo(22.3269f, 12.7218f)
                lineTo(22.198f, 14.0929f)
                curveTo(22.1628f, 14.6085f, 22.2097f, 14.9132f, 22.6785f, 15.3468f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
