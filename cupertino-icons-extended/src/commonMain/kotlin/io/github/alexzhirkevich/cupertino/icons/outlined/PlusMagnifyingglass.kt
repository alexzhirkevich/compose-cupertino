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

public val CupertinoIcons.Outlined.PlusMagnifyingglass: ImageVector
    get() {
        if (_plusMagnifyingglass != null) {
            return _plusMagnifyingglass!!
        }
        _plusMagnifyingglass = Builder(name = "PlusMagnifyingglass", defaultWidth = 22.8984.dp,
                defaultHeight = 23.1211.dp, viewportWidth = 22.8984f, viewportHeight =
                23.1211f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.3516f)
                curveTo(0.0f, 14.5078f, 4.1953f, 18.7031f, 9.3516f, 18.7031f)
                curveTo(11.3906f, 18.7031f, 13.2539f, 18.0469f, 14.7891f, 16.9453f)
                lineTo(20.5547f, 22.7227f)
                curveTo(20.8242f, 22.9922f, 21.1758f, 23.1211f, 21.5508f, 23.1211f)
                curveTo(22.3477f, 23.1211f, 22.8984f, 22.5234f, 22.8984f, 21.7383f)
                curveTo(22.8984f, 21.3633f, 22.7578f, 21.0234f, 22.5117f, 20.7773f)
                lineTo(16.7812f, 15.0117f)
                curveTo(17.9883f, 13.4414f, 18.7031f, 11.4844f, 18.7031f, 9.3516f)
                curveTo(18.7031f, 4.1953f, 14.5078f, 0.0f, 9.3516f, 0.0f)
                curveTo(4.1953f, 0.0f, 0.0f, 4.1953f, 0.0f, 9.3516f)
                close()
                moveTo(2.0039f, 9.3516f)
                curveTo(2.0039f, 5.2969f, 5.2969f, 2.0039f, 9.3516f, 2.0039f)
                curveTo(13.4062f, 2.0039f, 16.6992f, 5.2969f, 16.6992f, 9.3516f)
                curveTo(16.6992f, 13.4062f, 13.4062f, 16.6992f, 9.3516f, 16.6992f)
                curveTo(5.2969f, 16.6992f, 2.0039f, 13.4062f, 2.0039f, 9.3516f)
                close()
                moveTo(5.4844f, 9.3516f)
                curveTo(5.4844f, 9.832f, 5.8594f, 10.207f, 6.3398f, 10.207f)
                lineTo(8.4961f, 10.207f)
                lineTo(8.4961f, 12.3633f)
                curveTo(8.4961f, 12.8438f, 8.8711f, 13.2188f, 9.3516f, 13.2188f)
                curveTo(9.832f, 13.2188f, 10.2188f, 12.8438f, 10.2188f, 12.3633f)
                lineTo(10.2188f, 10.207f)
                lineTo(12.3633f, 10.207f)
                curveTo(12.8438f, 10.207f, 13.2188f, 9.832f, 13.2188f, 9.3516f)
                curveTo(13.2188f, 8.8711f, 12.8438f, 8.4844f, 12.3633f, 8.4844f)
                lineTo(10.2188f, 8.4844f)
                lineTo(10.2188f, 6.3398f)
                curveTo(10.2188f, 5.8594f, 9.832f, 5.4844f, 9.3516f, 5.4844f)
                curveTo(8.8711f, 5.4844f, 8.4961f, 5.8594f, 8.4961f, 6.3398f)
                lineTo(8.4961f, 8.4844f)
                lineTo(6.3398f, 8.4844f)
                curveTo(5.8594f, 8.4844f, 5.4844f, 8.8711f, 5.4844f, 9.3516f)
                close()
            }
        }
        .build()
        return _plusMagnifyingglass!!
    }

private var _plusMagnifyingglass: ImageVector? = null
