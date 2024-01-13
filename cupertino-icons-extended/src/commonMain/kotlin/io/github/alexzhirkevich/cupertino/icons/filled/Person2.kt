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

public val CupertinoIcons.Filled.Person2: ImageVector
    get() {
        if (_person2 != null) {
            return _person2!!
        }
        _person2 = Builder(name = "Person2", defaultWidth = 31.9453.dp, defaultHeight = 21.457.dp,
                viewportWidth = 31.9453f, viewportHeight = 21.457f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7188f, 21.457f)
                lineTo(29.4375f, 21.457f)
                curveTo(31.2891f, 21.457f, 31.9453f, 20.9297f, 31.9453f, 19.8984f)
                curveTo(31.9453f, 16.875f, 28.1602f, 12.7031f, 22.0781f, 12.7031f)
                curveTo(16.0078f, 12.7031f, 12.2227f, 16.875f, 12.2227f, 19.8984f)
                curveTo(12.2227f, 20.9297f, 12.8789f, 21.457f, 14.7188f, 21.457f)
                close()
                moveTo(22.0898f, 10.6055f)
                curveTo(24.5977f, 10.6055f, 26.7656f, 8.3555f, 26.7656f, 5.4258f)
                curveTo(26.7656f, 2.5313f, 24.5859f, 0.3867f, 22.0898f, 0.3867f)
                curveTo(19.582f, 0.3867f, 17.3906f, 2.5781f, 17.4023f, 5.4492f)
                curveTo(17.4023f, 8.3555f, 19.5703f, 10.6055f, 22.0898f, 10.6055f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0625f, 21.457f)
                lineTo(10.957f, 21.457f)
                curveTo(9.7383f, 19.6875f, 11.2266f, 16.125f, 13.7578f, 14.1797f)
                curveTo(12.4453f, 13.3125f, 10.7695f, 12.668f, 8.5898f, 12.668f)
                curveTo(3.3047f, 12.668f, 0.0f, 16.5703f, 0.0f, 19.8164f)
                curveTo(0.0f, 20.8711f, 0.5742f, 21.457f, 2.0625f, 21.457f)
                close()
                moveTo(8.5898f, 10.875f)
                curveTo(10.7812f, 10.875f, 12.668f, 8.9063f, 12.668f, 6.3633f)
                curveTo(12.668f, 3.8438f, 10.7695f, 1.9805f, 8.5898f, 1.9805f)
                curveTo(6.4219f, 1.9805f, 4.5f, 3.8906f, 4.5117f, 6.3867f)
                curveTo(4.5117f, 8.9063f, 6.4102f, 10.875f, 8.5898f, 10.875f)
                close()
            }
        }
        .build()
        return _person2!!
    }

private var _person2: ImageVector? = null
