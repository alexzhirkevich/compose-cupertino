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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.AirplaneArrival: ImageVector
    get() {
        if (_airplaneArrival != null) {
            return _airplaneArrival!!
        }
        _airplaneArrival = Builder(name = "AirplaneArrival", defaultWidth = 28.0226.dp,
                defaultHeight = 27.199.dp, viewportWidth = 28.0226f, viewportHeight =
                27.199f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3607f, 24.0819f)
                lineTo(26.6497f, 24.0819f)
                curveTo(27.1653f, 24.0819f, 27.5872f, 23.6483f, 27.5872f, 23.1327f)
                curveTo(27.5872f, 22.6171f, 27.1653f, 22.1952f, 26.6497f, 22.1952f)
                lineTo(1.3607f, 22.1952f)
                curveTo(0.845f, 22.1952f, 0.4232f, 22.6171f, 0.4232f, 23.1327f)
                curveTo(0.4232f, 23.6483f, 0.845f, 24.0819f, 1.3607f, 24.0819f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0716f, 11.7421f)
                lineTo(23.1458f, 17.1444f)
                curveTo(25.3958f, 17.7538f, 27.681f, 17.1561f, 27.9974f, 15.41f)
                curveTo(28.2552f, 13.8046f, 26.4974f, 12.3514f, 24.3997f, 11.9413f)
                lineTo(17.0989f, 10.4882f)
                curveTo(16.595f, 10.3944f, 16.3021f, 10.1952f, 15.9505f, 9.6913f)
                lineTo(9.7513f, 0.7733f)
                curveTo(9.5521f, 0.4921f, 9.2825f, 0.3046f, 8.9544f, 0.2225f)
                lineTo(8.1224f, 0.0116f)
                curveTo(7.8294f, -0.0587f, 7.6068f, 0.1991f, 7.6888f, 0.5624f)
                lineTo(9.9388f, 10.0897f)
                lineTo(10.6771f, 9.2225f)
                lineTo(4.5247f, 8.0155f)
                lineTo(6.4935f, 9.2343f)
                lineTo(1.7591f, 3.703f)
                curveTo(1.5247f, 3.4335f, 1.2786f, 3.3514f, 0.8568f, 3.4452f)
                lineTo(0.4114f, 3.5389f)
                curveTo(0.095f, 3.5975f, -0.0456f, 3.8436f, 0.013f, 4.1249f)
                lineTo(1.2552f, 10.1952f)
                curveTo(1.4193f, 10.9686f, 2.0638f, 11.4725f, 3.0716f, 11.7421f)
                close()
            }
        }
        .build()
        return _airplaneArrival!!
    }

private var _airplaneArrival: ImageVector? = null
