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

public val CupertinoIcons.Filled.Burst: ImageVector
    get() {
        if (_burst != null) {
            return _burst!!
        }
        _burst = Builder(name = "Burst", defaultWidth = 29.4609.dp, defaultHeight = 27.9258.dp,
                viewportWidth = 29.4609f, viewportHeight = 27.9258f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.4531f, 14.9648f)
                curveTo(29.1328f, 14.6367f, 29.4609f, 14.168f, 29.4609f, 13.6992f)
                curveTo(29.4609f, 13.2305f, 29.1328f, 12.7969f, 28.4531f, 12.5625f)
                lineTo(22.9102f, 10.6523f)
                lineTo(25.2891f, 5.7891f)
                curveTo(25.4062f, 5.543f, 25.4531f, 5.2852f, 25.4531f, 5.0625f)
                curveTo(25.4531f, 4.4063f, 24.9609f, 3.9258f, 24.3047f, 3.9258f)
                curveTo(24.082f, 3.9258f, 23.8359f, 3.9609f, 23.5898f, 4.0898f)
                lineTo(18.5625f, 6.5508f)
                lineTo(15.9375f, 0.9375f)
                curveTo(15.6562f, 0.3164f, 15.1992f, 0.0f, 14.7305f, 0.0f)
                curveTo(14.2617f, 0.0f, 13.8164f, 0.3164f, 13.5234f, 0.9375f)
                lineTo(10.9102f, 6.5508f)
                lineTo(5.8711f, 4.0898f)
                curveTo(5.625f, 3.9609f, 5.3789f, 3.9258f, 5.1563f, 3.9258f)
                curveTo(4.5f, 3.9258f, 4.0078f, 4.4063f, 4.0078f, 5.0625f)
                curveTo(4.0078f, 5.2852f, 4.0547f, 5.543f, 4.1836f, 5.7891f)
                lineTo(6.5508f, 10.6523f)
                lineTo(1.0078f, 12.5625f)
                curveTo(0.3398f, 12.7852f, 0.0f, 13.2422f, 0.0f, 13.7109f)
                curveTo(0.0f, 14.168f, 0.3398f, 14.6367f, 1.0078f, 14.9648f)
                lineTo(6.3281f, 17.5078f)
                lineTo(3.457f, 23.5898f)
                curveTo(3.3164f, 23.8594f, 3.2578f, 24.1172f, 3.2578f, 24.3633f)
                curveTo(3.2578f, 24.9492f, 3.6563f, 25.3711f, 4.2188f, 25.3711f)
                curveTo(4.4531f, 25.3711f, 4.7109f, 25.2891f, 4.9805f, 25.125f)
                lineTo(11.7773f, 21.1055f)
                lineTo(13.6406f, 26.8711f)
                curveTo(13.8516f, 27.5039f, 14.2852f, 27.832f, 14.7305f, 27.832f)
                curveTo(15.1875f, 27.832f, 15.6094f, 27.5039f, 15.8203f, 26.8711f)
                lineTo(17.6953f, 21.1055f)
                lineTo(24.4805f, 25.125f)
                curveTo(24.75f, 25.2891f, 25.0195f, 25.3594f, 25.2422f, 25.3594f)
                curveTo(25.793f, 25.3594f, 26.2148f, 24.9609f, 26.2148f, 24.375f)
                curveTo(26.2148f, 24.1289f, 26.1445f, 23.8594f, 26.0039f, 23.5898f)
                lineTo(23.1328f, 17.5078f)
                close()
            }
        }
        .build()
        return _burst!!
    }

private var _burst: ImageVector? = null
