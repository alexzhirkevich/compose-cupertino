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

public val CupertinoIcons.Outlined.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 25.875.dp, defaultHeight =
                30.1758.dp, viewportWidth = 25.875f, viewportHeight = 30.1758f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 26.8477f)
                lineTo(22.1953f, 26.8477f)
                curveTo(24.6445f, 26.8477f, 25.875f, 25.6289f, 25.875f, 23.2148f)
                lineTo(25.875f, 11.5547f)
                curveTo(25.875f, 9.8672f, 25.5234f, 9.1172f, 24.4102f, 8.2383f)
                lineTo(15.3516f, 1.1133f)
                curveTo(14.5078f, 0.4336f, 13.8047f, 0.0f, 12.9375f, 0.0f)
                curveTo(12.0703f, 0.0f, 11.3672f, 0.4336f, 10.5234f, 1.1133f)
                lineTo(1.4648f, 8.2383f)
                curveTo(0.3516f, 9.1172f, 0.0f, 9.8672f, 0.0f, 11.5547f)
                lineTo(0.0f, 23.2148f)
                curveTo(0.0f, 25.6406f, 1.2305f, 26.8477f, 3.6797f, 26.8477f)
                close()
                moveTo(3.6094f, 25.0547f)
                curveTo(2.4375f, 25.0547f, 1.793f, 24.4336f, 1.793f, 23.2148f)
                lineTo(1.793f, 11.2383f)
                curveTo(1.793f, 10.3945f, 2.0156f, 9.9844f, 2.5781f, 9.5508f)
                lineTo(11.5312f, 2.5664f)
                curveTo(12.1055f, 2.1211f, 12.4219f, 1.875f, 12.9375f, 1.875f)
                curveTo(13.4414f, 1.875f, 13.7695f, 2.1211f, 14.3438f, 2.5664f)
                lineTo(23.2969f, 9.5508f)
                curveTo(23.8594f, 9.9844f, 24.082f, 10.3945f, 24.082f, 11.2383f)
                lineTo(24.082f, 23.2148f)
                curveTo(24.082f, 24.4336f, 23.4141f, 25.0547f, 22.2656f, 25.0547f)
                close()
                moveTo(1.3242f, 24.6328f)
                lineTo(2.5547f, 25.8516f)
                lineTo(11.543f, 16.9922f)
                curveTo(12.0352f, 16.4883f, 12.4922f, 16.2656f, 12.9609f, 16.2656f)
                curveTo(13.418f, 16.2656f, 13.875f, 16.4883f, 14.3789f, 16.9922f)
                lineTo(23.3672f, 25.8516f)
                lineTo(24.5859f, 24.6328f)
                lineTo(15.3984f, 15.6094f)
                curveTo(14.5781f, 14.7891f, 13.7812f, 14.4609f, 12.9609f, 14.4609f)
                curveTo(12.1289f, 14.4609f, 11.3438f, 14.7891f, 10.5234f, 15.6094f)
                close()
                moveTo(8.6953f, 17.7305f)
                lineTo(9.9258f, 16.5234f)
                lineTo(2.6016f, 9.2813f)
                lineTo(1.3828f, 10.5f)
                close()
                moveTo(15.9961f, 16.5234f)
                lineTo(17.2148f, 17.7305f)
                lineTo(24.5273f, 10.5f)
                lineTo(23.3086f, 9.2813f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
