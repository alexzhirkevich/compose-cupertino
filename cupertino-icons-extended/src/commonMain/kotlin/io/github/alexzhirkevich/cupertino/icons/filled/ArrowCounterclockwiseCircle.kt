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

public val CupertinoIcons.Filled.ArrowCounterclockwiseCircle: ImageVector
    get() {
        if (_arrowCounterclockwiseCircle != null) {
            return _arrowCounterclockwiseCircle!!
        }
        _arrowCounterclockwiseCircle = Builder(name = "ArrowCounterclockwiseCircle", defaultWidth =
                23.9062.dp, defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
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
                moveTo(17.3438f, 12.5273f)
                curveTo(17.3438f, 15.5508f, 14.9414f, 17.9766f, 11.9531f, 17.9766f)
                curveTo(8.9648f, 17.9766f, 6.5625f, 15.5508f, 6.5625f, 12.5742f)
                curveTo(6.5625f, 12.1172f, 6.9492f, 11.7422f, 7.3945f, 11.7422f)
                curveTo(7.8633f, 11.7422f, 8.2383f, 12.1172f, 8.2383f, 12.5742f)
                curveTo(8.2383f, 14.6367f, 9.8906f, 16.3008f, 11.9531f, 16.3008f)
                curveTo(14.0273f, 16.3008f, 15.668f, 14.6367f, 15.668f, 12.5742f)
                curveTo(15.668f, 10.5f, 14.0273f, 8.8477f, 11.9531f, 8.8477f)
                curveTo(11.8008f, 8.8477f, 11.6484f, 8.8594f, 11.5312f, 8.8828f)
                lineTo(12.6914f, 10.0312f)
                curveTo(12.832f, 10.1836f, 12.9258f, 10.3711f, 12.9258f, 10.582f)
                curveTo(12.9258f, 11.0156f, 12.5977f, 11.3555f, 12.1523f, 11.3555f)
                curveTo(11.9648f, 11.3555f, 11.7539f, 11.25f, 11.625f, 11.1211f)
                lineTo(9.2813f, 8.7891f)
                curveTo(8.9883f, 8.4961f, 9.0f, 7.957f, 9.2813f, 7.6641f)
                lineTo(11.6016f, 5.3086f)
                curveTo(11.7422f, 5.1563f, 11.9414f, 5.0508f, 12.1523f, 5.0508f)
                curveTo(12.5977f, 5.0508f, 12.9258f, 5.4023f, 12.9258f, 5.8359f)
                curveTo(12.9258f, 6.0469f, 12.832f, 6.2578f, 12.7148f, 6.3867f)
                lineTo(11.8711f, 7.2539f)
                curveTo(11.9531f, 7.2422f, 12.082f, 7.2305f, 12.1875f, 7.2305f)
                curveTo(14.9062f, 7.2305f, 17.3438f, 9.5625f, 17.3438f, 12.5273f)
                close()
            }
        }
        .build()
        return _arrowCounterclockwiseCircle!!
    }

private var _arrowCounterclockwiseCircle: ImageVector? = null
