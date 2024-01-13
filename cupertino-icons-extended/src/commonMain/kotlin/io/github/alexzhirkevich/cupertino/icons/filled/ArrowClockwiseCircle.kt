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

public val CupertinoIcons.Filled.ArrowClockwiseCircle: ImageVector
    get() {
        if (_arrowClockwiseCircle != null) {
            return _arrowClockwiseCircle!!
        }
        _arrowClockwiseCircle = Builder(name = "ArrowClockwiseCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(6.5625f, 12.5156f)
                curveTo(6.5625f, 9.5508f, 9.0f, 7.2305f, 11.7188f, 7.2305f)
                curveTo(11.8242f, 7.2305f, 11.9531f, 7.2422f, 12.0469f, 7.2539f)
                lineTo(11.2031f, 6.3867f)
                curveTo(11.0742f, 6.2461f, 10.9805f, 6.0352f, 10.9805f, 5.8242f)
                curveTo(10.9805f, 5.3906f, 11.3086f, 5.0508f, 11.7539f, 5.0508f)
                curveTo(11.9648f, 5.0508f, 12.1758f, 5.1445f, 12.3047f, 5.2969f)
                lineTo(14.625f, 7.6523f)
                curveTo(14.9062f, 7.957f, 14.9297f, 8.4844f, 14.625f, 8.7773f)
                lineTo(12.2812f, 11.1211f)
                curveTo(12.1523f, 11.25f, 11.9531f, 11.3555f, 11.7539f, 11.3555f)
                curveTo(11.3203f, 11.3555f, 10.9805f, 11.0156f, 10.9805f, 10.582f)
                curveTo(10.9805f, 10.3711f, 11.0742f, 10.1719f, 11.2148f, 10.0312f)
                lineTo(12.3867f, 8.8711f)
                curveTo(12.2695f, 8.8477f, 12.1055f, 8.8359f, 11.9531f, 8.8359f)
                curveTo(9.8906f, 8.8359f, 8.2383f, 10.5f, 8.2383f, 12.5625f)
                curveTo(8.2383f, 14.6367f, 9.8906f, 16.3008f, 11.9531f, 16.3008f)
                curveTo(14.0156f, 16.3008f, 15.668f, 14.6367f, 15.668f, 12.5625f)
                curveTo(15.668f, 12.1055f, 16.0547f, 11.7305f, 16.5117f, 11.7305f)
                curveTo(16.957f, 11.7305f, 17.3438f, 12.1055f, 17.3438f, 12.5625f)
                curveTo(17.3438f, 15.5391f, 14.9414f, 17.9648f, 11.9531f, 17.9648f)
                curveTo(8.9648f, 17.9648f, 6.5625f, 15.5391f, 6.5625f, 12.5156f)
                close()
            }
        }
        .build()
        return _arrowClockwiseCircle!!
    }

private var _arrowClockwiseCircle: ImageVector? = null
