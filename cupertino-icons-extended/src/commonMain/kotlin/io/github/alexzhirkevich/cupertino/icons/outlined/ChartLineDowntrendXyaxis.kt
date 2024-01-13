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

public val CupertinoIcons.Outlined.ChartLineDowntrendXyaxis: ImageVector
    get() {
        if (_chartLineDowntrendXyaxis != null) {
            return _chartLineDowntrendXyaxis!!
        }
        _chartLineDowntrendXyaxis = Builder(name = "ChartLineDowntrendXyaxis", defaultWidth =
                25.1953.dp, defaultHeight = 21.8086.dp, viewportWidth = 25.1953f, viewportHeight =
                21.8086f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7344f, 3.6445f)
                lineTo(0.3047f, 5.0625f)
                lineTo(5.543f, 10.3711f)
                curveTo(6.082f, 10.9102f, 6.5742f, 11.1445f, 7.125f, 11.1445f)
                curveTo(7.6758f, 11.1445f, 8.1914f, 10.8984f, 8.707f, 10.3711f)
                lineTo(13.0195f, 5.9531f)
                curveTo(13.125f, 5.8477f, 13.2422f, 5.7891f, 13.3359f, 5.7891f)
                curveTo(13.4414f, 5.7891f, 13.5586f, 5.8477f, 13.6641f, 5.9531f)
                lineTo(18.2812f, 10.6289f)
                lineTo(16.3477f, 12.5625f)
                curveTo(15.9258f, 12.9844f, 16.1836f, 13.5234f, 16.7812f, 13.6758f)
                lineTo(23.6367f, 15.4102f)
                curveTo(24.1641f, 15.5508f, 24.6328f, 15.1055f, 24.4922f, 14.5664f)
                lineTo(22.7578f, 7.6992f)
                curveTo(22.6055f, 7.1016f, 22.0547f, 6.8438f, 21.6328f, 7.2656f)
                lineTo(19.7109f, 9.1992f)
                lineTo(14.9297f, 4.3945f)
                curveTo(14.4023f, 3.8672f, 13.8984f, 3.6211f, 13.3359f, 3.6211f)
                curveTo(12.7852f, 3.6211f, 12.2578f, 3.8672f, 11.7539f, 4.3945f)
                lineTo(7.4414f, 8.8125f)
                curveTo(7.3359f, 8.918f, 7.2305f, 8.9766f, 7.125f, 8.9766f)
                curveTo(7.0195f, 8.9766f, 6.9141f, 8.918f, 6.8086f, 8.8125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.8828f)
                curveTo(0.0f, 21.4453f, 0.375f, 21.8086f, 0.9375f, 21.8086f)
                lineTo(24.2461f, 21.8086f)
                curveTo(24.7617f, 21.8086f, 25.1953f, 21.3984f, 25.1953f, 20.8711f)
                curveTo(25.1953f, 20.3555f, 24.7617f, 19.9336f, 24.2461f, 19.9336f)
                lineTo(2.2148f, 19.9336f)
                curveTo(1.9688f, 19.9336f, 1.8867f, 19.8516f, 1.8867f, 19.6055f)
                lineTo(1.8867f, 1.0781f)
                curveTo(1.8867f, 0.5742f, 1.4648f, 0.1406f, 0.9492f, 0.1406f)
                curveTo(0.4219f, 0.1406f, 0.0f, 0.5742f, 0.0f, 1.0781f)
                close()
            }
        }
        .build()
        return _chartLineDowntrendXyaxis!!
    }

private var _chartLineDowntrendXyaxis: ImageVector? = null
