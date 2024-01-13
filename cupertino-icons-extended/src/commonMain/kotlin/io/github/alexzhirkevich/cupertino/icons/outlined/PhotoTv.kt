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

public val CupertinoIcons.Outlined.PhotoTv: ImageVector
    get() {
        if (_photoTv != null) {
            return _photoTv!!
        }
        _photoTv = Builder(name = "PhotoTv", defaultWidth = 29.2969.dp, defaultHeight = 24.2227.dp,
                viewportWidth = 29.2969f, viewportHeight = 24.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.9492f, 16.6875f)
                lineTo(20.9766f, 10.1484f)
                curveTo(20.4609f, 9.668f, 19.8516f, 9.4336f, 19.207f, 9.4336f)
                curveTo(18.5742f, 9.4336f, 17.9883f, 9.6563f, 17.4492f, 10.1367f)
                lineTo(11.4258f, 15.5156f)
                lineTo(11.9414f, 15.5156f)
                lineTo(9.0469f, 12.9023f)
                curveTo(8.5664f, 12.457f, 8.0273f, 12.2344f, 7.4766f, 12.2344f)
                curveTo(6.9375f, 12.2344f, 6.4336f, 12.457f, 5.9648f, 12.8906f)
                lineTo(1.4883f, 16.9336f)
                curveTo(1.4883f, 18.5039f, 2.0977f, 19.3008f, 3.3047f, 19.3008f)
                lineTo(25.6172f, 19.3008f)
                curveTo(27.1055f, 19.3008f, 27.9492f, 18.3633f, 27.9492f, 16.6875f)
                close()
                moveTo(9.5508f, 10.2891f)
                curveTo(11.0508f, 10.2891f, 12.293f, 9.0469f, 12.293f, 7.5f)
                curveTo(12.293f, 6.0f, 11.0508f, 4.7461f, 9.5508f, 4.7461f)
                curveTo(8.0273f, 4.7461f, 6.7734f, 6.0f, 6.7734f, 7.5f)
                curveTo(6.7734f, 9.0469f, 8.0273f, 10.2891f, 9.5508f, 10.2891f)
                close()
                moveTo(3.0117f, 20.25f)
                lineTo(26.2852f, 20.25f)
                curveTo(28.2656f, 20.25f, 29.2969f, 19.2305f, 29.2969f, 17.2383f)
                lineTo(29.2969f, 3.8086f)
                curveTo(29.2969f, 1.8281f, 28.2656f, 0.8086f, 26.2852f, 0.8086f)
                lineTo(3.0117f, 0.8086f)
                curveTo(1.0313f, 0.8086f, 0.0f, 1.8281f, 0.0f, 3.8086f)
                lineTo(0.0f, 17.2383f)
                curveTo(0.0f, 19.2305f, 1.0313f, 20.25f, 3.0117f, 20.25f)
                close()
                moveTo(3.0469f, 18.3633f)
                curveTo(2.2734f, 18.3633f, 1.8867f, 17.9766f, 1.8867f, 17.2148f)
                lineTo(1.8867f, 3.8438f)
                curveTo(1.8867f, 3.0703f, 2.2734f, 2.6953f, 3.0469f, 2.6953f)
                lineTo(26.25f, 2.6953f)
                curveTo(27.0234f, 2.6953f, 27.4102f, 3.0703f, 27.4102f, 3.8438f)
                lineTo(27.4102f, 17.2148f)
                curveTo(27.4102f, 17.9766f, 27.0234f, 18.3633f, 26.25f, 18.3633f)
                close()
                moveTo(8.7539f, 24.2227f)
                lineTo(20.543f, 24.2227f)
                curveTo(21.0586f, 24.2227f, 21.4922f, 23.8008f, 21.4922f, 23.2734f)
                curveTo(21.4922f, 22.7461f, 21.0586f, 22.3242f, 20.543f, 22.3242f)
                lineTo(8.7539f, 22.3242f)
                curveTo(8.2383f, 22.3242f, 7.8047f, 22.7461f, 7.8047f, 23.2734f)
                curveTo(7.8047f, 23.8008f, 8.2383f, 24.2227f, 8.7539f, 24.2227f)
                close()
            }
        }
        .build()
        return _photoTv!!
    }

private var _photoTv: ImageVector? = null
