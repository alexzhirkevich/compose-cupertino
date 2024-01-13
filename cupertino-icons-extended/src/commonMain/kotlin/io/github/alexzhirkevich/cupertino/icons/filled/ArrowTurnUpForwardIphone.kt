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

public val CupertinoIcons.Filled.ArrowTurnUpForwardIphone: ImageVector
    get() {
        if (_arrowTurnUpForwardIphone != null) {
            return _arrowTurnUpForwardIphone!!
        }
        _arrowTurnUpForwardIphone = Builder(name = "ArrowTurnUpForwardIphone", defaultWidth =
                31.793.dp, defaultHeight = 24.832.dp, viewportWidth = 31.793f, viewportHeight =
                24.832f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9219f, 24.8086f)
                lineTo(28.6055f, 24.8086f)
                curveTo(30.5156f, 24.8086f, 31.793f, 23.5898f, 31.793f, 21.7617f)
                lineTo(31.793f, 3.0469f)
                curveTo(31.793f, 1.2188f, 30.5156f, 0.0f, 28.6055f, 0.0f)
                lineTo(19.9219f, 0.0f)
                curveTo(18.0117f, 0.0f, 16.7227f, 1.2188f, 16.7227f, 3.0469f)
                lineTo(16.7227f, 21.7617f)
                curveTo(16.7227f, 23.5898f, 18.0117f, 24.8086f, 19.9219f, 24.8086f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.043f, 22.0195f)
                curveTo(1.6523f, 22.0195f, 2.0859f, 21.5977f, 2.0859f, 20.9883f)
                lineTo(2.0859f, 19.207f)
                curveTo(2.0859f, 14.8477f, 4.7461f, 13.4414f, 8.1563f, 13.4414f)
                lineTo(8.9297f, 13.4414f)
                lineTo(12.1758f, 13.3359f)
                lineTo(12.1758f, 12.6797f)
                lineTo(8.9883f, 15.5859f)
                lineTo(7.6992f, 16.6875f)
                curveTo(7.4297f, 16.9102f, 7.3594f, 17.2031f, 7.3594f, 17.4844f)
                curveTo(7.3594f, 18.0586f, 7.8047f, 18.4922f, 8.3789f, 18.4922f)
                curveTo(8.6602f, 18.4922f, 8.9063f, 18.3867f, 9.1641f, 18.1406f)
                lineTo(14.1211f, 13.1953f)
                curveTo(14.3555f, 12.9727f, 14.4844f, 12.7031f, 14.4844f, 12.4102f)
                curveTo(14.4844f, 12.1172f, 14.3555f, 11.8477f, 14.1211f, 11.625f)
                lineTo(9.1406f, 6.6563f)
                curveTo(8.9063f, 6.4219f, 8.6602f, 6.3281f, 8.3789f, 6.3281f)
                curveTo(7.8047f, 6.3281f, 7.3594f, 6.75f, 7.3594f, 7.3359f)
                curveTo(7.3594f, 7.6172f, 7.4297f, 7.9102f, 7.6992f, 8.1328f)
                lineTo(8.9883f, 9.2344f)
                lineTo(12.1758f, 12.1406f)
                lineTo(12.1758f, 11.4844f)
                lineTo(8.9297f, 11.3789f)
                lineTo(8.1563f, 11.3789f)
                curveTo(3.9961f, 11.3789f, 0.0f, 13.2891f, 0.0f, 19.207f)
                lineTo(0.0f, 20.9883f)
                curveTo(0.0f, 21.5977f, 0.4336f, 22.0195f, 1.043f, 22.0195f)
                close()
            }
        }
        .build()
        return _arrowTurnUpForwardIphone!!
    }

private var _arrowTurnUpForwardIphone: ImageVector? = null
