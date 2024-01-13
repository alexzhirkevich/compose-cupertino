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

public val CupertinoIcons.Outlined.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 30.5508.dp, defaultHeight =
                13.9805.dp, viewportWidth = 30.5508f, viewportHeight = 13.9805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.9844f)
                curveTo(0.0f, 11.2266f, 2.6602f, 13.9688f, 6.5625f, 13.9688f)
                curveTo(8.6836f, 13.9688f, 10.4414f, 13.0664f, 12.375f, 11.2031f)
                lineTo(15.2812f, 8.4141f)
                lineTo(18.1758f, 11.2031f)
                curveTo(20.1211f, 13.0664f, 21.8789f, 13.9688f, 23.9883f, 13.9688f)
                curveTo(27.8906f, 13.9688f, 30.5508f, 11.2266f, 30.5508f, 6.9844f)
                curveTo(30.5508f, 2.7422f, 27.8906f, 0.0f, 23.9883f, 0.0f)
                curveTo(21.8789f, 0.0f, 20.1211f, 0.9023f, 18.1758f, 2.7656f)
                lineTo(15.2812f, 5.5547f)
                lineTo(12.375f, 2.7656f)
                curveTo(10.4414f, 0.9023f, 8.6836f, 0.0f, 6.5625f, 0.0f)
                curveTo(2.6602f, 0.0f, 0.0f, 2.7422f, 0.0f, 6.9844f)
                close()
                moveTo(2.1211f, 6.9844f)
                curveTo(2.1211f, 4.0195f, 3.9375f, 2.1211f, 6.5625f, 2.1211f)
                curveTo(8.0625f, 2.1211f, 9.375f, 2.8477f, 10.8867f, 4.2656f)
                lineTo(13.793f, 6.9844f)
                lineTo(10.875f, 9.7031f)
                curveTo(9.3633f, 11.1094f, 8.0625f, 11.8477f, 6.5625f, 11.8477f)
                curveTo(3.9375f, 11.8477f, 2.1211f, 9.9492f, 2.1211f, 6.9844f)
                close()
                moveTo(16.7578f, 6.9844f)
                lineTo(19.6641f, 4.2656f)
                curveTo(21.1758f, 2.8477f, 22.4883f, 2.1211f, 23.9883f, 2.1211f)
                curveTo(26.625f, 2.1211f, 28.4297f, 4.0195f, 28.4297f, 6.9844f)
                curveTo(28.4297f, 9.9492f, 26.625f, 11.8477f, 23.9883f, 11.8477f)
                curveTo(22.4883f, 11.8477f, 21.1875f, 11.1094f, 19.6758f, 9.7031f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
