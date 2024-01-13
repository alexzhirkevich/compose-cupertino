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

public val CupertinoIcons.Outlined.Externaldrive: ImageVector
    get() {
        if (_externaldrive != null) {
            return _externaldrive!!
        }
        _externaldrive = Builder(name = "Externaldrive", defaultWidth = 27.668.dp, defaultHeight =
                20.0273.dp, viewportWidth = 27.668f, viewportHeight = 20.0273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.7422f)
                curveTo(0.0f, 17.7188f, 2.3086f, 20.0273f, 5.5664f, 20.0273f)
                lineTo(22.1016f, 20.0273f)
                curveTo(25.3594f, 20.0273f, 27.668f, 17.7188f, 27.668f, 14.7422f)
                curveTo(27.668f, 13.8633f, 27.4102f, 13.0781f, 27.1055f, 12.3398f)
                lineTo(23.1562f, 2.8594f)
                curveTo(22.3828f, 0.9844f, 20.7891f, 0.0234f, 18.6914f, 0.0234f)
                lineTo(8.9766f, 0.0234f)
                curveTo(6.8789f, 0.0234f, 5.2852f, 0.9844f, 4.5117f, 2.8594f)
                lineTo(0.5508f, 12.3398f)
                curveTo(0.2578f, 13.0664f, 0.0f, 13.8633f, 0.0f, 14.7422f)
                close()
                moveTo(1.8867f, 14.7422f)
                curveTo(1.8867f, 12.8086f, 3.3516f, 11.3438f, 5.5664f, 11.3438f)
                lineTo(22.1016f, 11.3438f)
                curveTo(24.3164f, 11.3438f, 25.7812f, 12.8086f, 25.7812f, 14.7422f)
                curveTo(25.7812f, 16.9102f, 24.3164f, 18.1406f, 22.1016f, 18.1406f)
                lineTo(5.5664f, 18.1406f)
                curveTo(3.3516f, 18.1406f, 1.8867f, 16.6758f, 1.8867f, 14.7422f)
                close()
                moveTo(3.7852f, 9.7617f)
                lineTo(6.3398f, 3.3398f)
                curveTo(6.7852f, 2.2266f, 7.7461f, 1.6641f, 9.0703f, 1.6641f)
                lineTo(18.5977f, 1.6641f)
                curveTo(19.9219f, 1.6641f, 20.8945f, 2.2266f, 21.3281f, 3.3398f)
                lineTo(23.8828f, 9.7617f)
                curveTo(23.332f, 9.5625f, 22.7461f, 9.457f, 22.1016f, 9.457f)
                lineTo(5.5664f, 9.457f)
                curveTo(4.9219f, 9.457f, 4.3242f, 9.5625f, 3.7852f, 9.7617f)
                close()
                moveTo(20.625f, 14.7422f)
                curveTo(20.625f, 15.5625f, 21.293f, 16.1953f, 22.1016f, 16.1953f)
                curveTo(22.875f, 16.1953f, 23.5547f, 15.5508f, 23.5547f, 14.7422f)
                curveTo(23.5547f, 13.957f, 22.875f, 13.2891f, 22.1016f, 13.2891f)
                curveTo(21.293f, 13.2891f, 20.625f, 13.957f, 20.625f, 14.7422f)
                close()
            }
        }
        .build()
        return _externaldrive!!
    }

private var _externaldrive: ImageVector? = null
