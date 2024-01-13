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

public val CupertinoIcons.Filled.GlobeDesk: ImageVector
    get() {
        if (_globeDesk != null) {
            return _globeDesk!!
        }
        _globeDesk = Builder(name = "GlobeDesk", defaultWidth = 22.8047.dp, defaultHeight =
                26.3789.dp, viewportWidth = 22.8047f, viewportHeight = 26.3789f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8359f, 5.2969f)
                lineTo(7.1719f, 3.9609f)
                lineTo(3.5039f, 0.3047f)
                curveTo(3.1406f, -0.0703f, 2.5313f, -0.0703f, 2.168f, 0.3047f)
                curveTo(1.8047f, 0.668f, 1.8047f, 1.2656f, 2.168f, 1.6406f)
                close()
                moveTo(20.8711f, 18.9844f)
                lineTo(19.5586f, 17.6367f)
                curveTo(17.6953f, 19.5234f, 15.1055f, 20.6602f, 12.2109f, 20.6602f)
                curveTo(6.4336f, 20.6602f, 1.8867f, 16.1133f, 1.8867f, 10.3359f)
                curveTo(1.8867f, 7.4531f, 3.0234f, 4.8633f, 4.8867f, 3.0117f)
                lineTo(3.5156f, 1.7227f)
                curveTo(1.3359f, 3.9141f, 0.0f, 6.9492f, 0.0f, 10.3359f)
                curveTo(0.0f, 17.1445f, 5.4023f, 22.5469f, 12.2109f, 22.5469f)
                curveTo(15.6211f, 22.5469f, 18.668f, 21.1875f, 20.8711f, 18.9844f)
                close()
                moveTo(18.4688f, 15.2695f)
                lineTo(17.0742f, 16.5352f)
                lineTo(21.1992f, 20.6602f)
                curveTo(21.5625f, 21.0234f, 22.1602f, 21.0234f, 22.5234f, 20.6602f)
                curveTo(22.8984f, 20.2969f, 22.8984f, 19.6875f, 22.5234f, 19.3242f)
                close()
                moveTo(11.2617f, 22.0547f)
                lineTo(11.2617f, 25.1719f)
                lineTo(13.1484f, 25.1719f)
                lineTo(13.1484f, 22.0547f)
                close()
                moveTo(8.0039f, 26.3789f)
                lineTo(16.4414f, 26.3789f)
                curveTo(16.957f, 26.3789f, 17.3789f, 25.957f, 17.3789f, 25.4414f)
                curveTo(17.3789f, 24.9258f, 16.957f, 24.4922f, 16.4414f, 24.4922f)
                lineTo(8.0039f, 24.4922f)
                curveTo(7.4883f, 24.4922f, 7.0547f, 24.9258f, 7.0547f, 25.4414f)
                curveTo(7.0547f, 25.957f, 7.4883f, 26.3789f, 8.0039f, 26.3789f)
                close()
                moveTo(12.2109f, 18.9492f)
                curveTo(16.957f, 18.9492f, 20.8125f, 15.0938f, 20.8125f, 10.3359f)
                curveTo(20.8125f, 5.5898f, 16.957f, 1.7344f, 12.2109f, 1.7344f)
                curveTo(7.4531f, 1.7344f, 3.5977f, 5.5898f, 3.5977f, 10.3359f)
                curveTo(3.5977f, 15.0938f, 7.4531f, 18.9492f, 12.2109f, 18.9492f)
                close()
            }
        }
        .build()
        return _globeDesk!!
    }

private var _globeDesk: ImageVector? = null
