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

public val CupertinoIcons.Outlined.ChartLineUptrendXyaxis: ImageVector
    get() {
        if (_chartLineUptrendXyaxis != null) {
            return _chartLineUptrendXyaxis!!
        }
        _chartLineUptrendXyaxis = Builder(name = "ChartLineUptrendXyaxis", defaultWidth =
                25.1953.dp, defaultHeight = 21.8086.dp, viewportWidth = 25.1953f, viewportHeight =
                21.8086f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7344f, 14.5664f)
                lineTo(6.8086f, 9.3984f)
                curveTo(6.9141f, 9.293f, 7.0195f, 9.2344f, 7.125f, 9.2344f)
                curveTo(7.2305f, 9.2344f, 7.3359f, 9.293f, 7.4414f, 9.3984f)
                lineTo(11.7539f, 13.8164f)
                curveTo(12.2578f, 14.3438f, 12.7852f, 14.5898f, 13.3359f, 14.5898f)
                curveTo(13.8984f, 14.5898f, 14.4023f, 14.3438f, 14.9297f, 13.8164f)
                lineTo(19.7109f, 9.0117f)
                lineTo(21.6328f, 10.9453f)
                curveTo(22.0547f, 11.3672f, 22.6055f, 11.1094f, 22.7578f, 10.5117f)
                lineTo(24.4922f, 3.6445f)
                curveTo(24.6328f, 3.1055f, 24.1641f, 2.6602f, 23.6367f, 2.8008f)
                lineTo(16.7812f, 4.5234f)
                curveTo(16.1836f, 4.6875f, 15.9258f, 5.2266f, 16.3477f, 5.6484f)
                lineTo(18.2812f, 7.582f)
                lineTo(13.6641f, 12.2578f)
                curveTo(13.5586f, 12.3633f, 13.4414f, 12.4219f, 13.3359f, 12.4219f)
                curveTo(13.2422f, 12.4219f, 13.125f, 12.3633f, 13.0195f, 12.2578f)
                lineTo(8.707f, 7.8398f)
                curveTo(8.1914f, 7.3125f, 7.6758f, 7.0664f, 7.125f, 7.0664f)
                curveTo(6.5742f, 7.0664f, 6.082f, 7.3008f, 5.543f, 7.8398f)
                lineTo(0.3047f, 13.1484f)
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
        return _chartLineUptrendXyaxis!!
    }

private var _chartLineUptrendXyaxis: ImageVector? = null
