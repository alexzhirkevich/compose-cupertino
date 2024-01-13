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

public val CupertinoIcons.Filled.ExclamationmarkTriangle: ImageVector
    get() {
        if (_exclamationmarkTriangle != null) {
            return _exclamationmarkTriangle!!
        }
        _exclamationmarkTriangle = Builder(name = "ExclamationmarkTriangle", defaultWidth =
                24.5625.dp, defaultHeight = 22.3945.dp, viewportWidth = 24.5625f, viewportHeight =
                22.3945f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1992f, 22.2656f)
                lineTo(21.3633f, 22.2656f)
                curveTo(23.3555f, 22.2656f, 24.5625f, 20.8828f, 24.5625f, 19.0898f)
                curveTo(24.5625f, 18.5391f, 24.3984f, 17.9648f, 24.1055f, 17.4492f)
                lineTo(15.0117f, 1.6055f)
                curveTo(14.4023f, 0.5391f, 13.3594f, 0.0f, 12.2812f, 0.0f)
                curveTo(11.2031f, 0.0f, 10.1484f, 0.5391f, 9.5508f, 1.6055f)
                lineTo(0.457f, 17.4492f)
                curveTo(0.1406f, 17.9766f, 0.0f, 18.5391f, 0.0f, 19.0898f)
                curveTo(0.0f, 20.8828f, 1.207f, 22.2656f, 3.1992f, 22.2656f)
                close()
                moveTo(12.293f, 14.4375f)
                curveTo(11.6836f, 14.4375f, 11.3438f, 14.0859f, 11.332f, 13.4648f)
                lineTo(11.1797f, 7.0898f)
                curveTo(11.168f, 6.4688f, 11.625f, 6.0234f, 12.2812f, 6.0234f)
                curveTo(12.9141f, 6.0234f, 13.4062f, 6.4805f, 13.3945f, 7.1016f)
                lineTo(13.2188f, 13.4648f)
                curveTo(13.207f, 14.0977f, 12.8672f, 14.4375f, 12.293f, 14.4375f)
                close()
                moveTo(12.293f, 18.3633f)
                curveTo(11.5898f, 18.3633f, 10.9805f, 17.8008f, 10.9805f, 17.1094f)
                curveTo(10.9805f, 16.4062f, 11.5781f, 15.8438f, 12.293f, 15.8438f)
                curveTo(12.9961f, 15.8438f, 13.5938f, 16.3945f, 13.5938f, 17.1094f)
                curveTo(13.5938f, 17.8125f, 12.9844f, 18.3633f, 12.293f, 18.3633f)
                close()
            }
        }
        .build()
        return _exclamationmarkTriangle!!
    }

private var _exclamationmarkTriangle: ImageVector? = null
