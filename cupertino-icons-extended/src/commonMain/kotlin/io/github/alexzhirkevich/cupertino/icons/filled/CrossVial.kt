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

public val CupertinoIcons.Filled.CrossVial: ImageVector
    get() {
        if (_crossVial != null) {
            return _crossVial!!
        }
        _crossVial = Builder(name = "CrossVial", defaultWidth = 16.0664.dp, defaultHeight =
                28.0898.dp, viewportWidth = 16.0664f, viewportHeight = 28.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.1016f, 5.3789f)
                lineTo(11.9531f, 5.3789f)
                curveTo(13.2305f, 5.3789f, 13.9922f, 4.6055f, 13.9922f, 3.3047f)
                lineTo(13.9922f, 2.0742f)
                curveTo(13.9922f, 0.7734f, 13.2305f, 0.0f, 11.9531f, 0.0f)
                lineTo(4.1016f, 0.0f)
                curveTo(2.8359f, 0.0f, 2.0742f, 0.7734f, 2.0742f, 2.0742f)
                lineTo(2.0742f, 3.3047f)
                curveTo(2.0742f, 4.6055f, 2.8359f, 5.3789f, 4.1016f, 5.3789f)
                close()
                moveTo(4.2539f, 7.5117f)
                lineTo(11.8125f, 7.5117f)
                lineTo(11.8125f, 4.7344f)
                lineTo(4.2539f, 4.7344f)
                close()
                moveTo(3.7852f, 28.0547f)
                lineTo(12.2812f, 28.0547f)
                curveTo(14.5664f, 28.0547f, 16.0664f, 26.543f, 16.0664f, 24.2109f)
                lineTo(16.0664f, 10.9219f)
                curveTo(16.0664f, 8.5898f, 14.5664f, 7.0781f, 12.2812f, 7.0781f)
                lineTo(3.7852f, 7.0781f)
                curveTo(1.5f, 7.0781f, 0.0f, 8.5898f, 0.0f, 10.9219f)
                lineTo(0.0f, 24.2109f)
                curveTo(0.0f, 26.543f, 1.5f, 28.0547f, 3.7852f, 28.0547f)
                close()
                moveTo(3.5156f, 18.4219f)
                lineTo(3.5156f, 16.7109f)
                curveTo(3.5156f, 16.1953f, 3.8555f, 15.8789f, 4.3477f, 15.8789f)
                lineTo(6.3398f, 15.8789f)
                lineTo(6.3398f, 13.8984f)
                curveTo(6.3398f, 13.3945f, 6.6563f, 13.0664f, 7.1719f, 13.0664f)
                lineTo(8.8828f, 13.0664f)
                curveTo(9.3984f, 13.0664f, 9.7148f, 13.3945f, 9.7148f, 13.8984f)
                lineTo(9.7148f, 15.8789f)
                lineTo(11.707f, 15.8789f)
                curveTo(12.1875f, 15.8789f, 12.5508f, 16.1953f, 12.5508f, 16.7109f)
                lineTo(12.5508f, 18.4219f)
                curveTo(12.5508f, 18.9375f, 12.1875f, 19.2539f, 11.707f, 19.2539f)
                lineTo(9.7148f, 19.2539f)
                lineTo(9.7148f, 21.2344f)
                curveTo(9.7148f, 21.7383f, 9.3984f, 22.0781f, 8.8828f, 22.0781f)
                lineTo(7.1719f, 22.0781f)
                curveTo(6.6563f, 22.0781f, 6.3398f, 21.7383f, 6.3398f, 21.2344f)
                lineTo(6.3398f, 19.2539f)
                lineTo(4.3477f, 19.2539f)
                curveTo(3.8555f, 19.2539f, 3.5156f, 18.9375f, 3.5156f, 18.4219f)
                close()
            }
        }
        .build()
        return _crossVial!!
    }

private var _crossVial: ImageVector? = null
