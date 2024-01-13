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

public val CupertinoIcons.Outlined.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) {
            return _arrowClockwise!!
        }
        _arrowClockwise = Builder(name = "ArrowClockwise", defaultWidth = 20.707.dp, defaultHeight =
                28.043.dp, viewportWidth = 20.707f, viewportHeight = 28.043f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.8594f)
                curveTo(0.0f, 20.6133f, 4.6172f, 25.2305f, 10.3594f, 25.2305f)
                curveTo(16.1016f, 25.2305f, 20.707f, 20.6133f, 20.707f, 14.8594f)
                curveTo(20.707f, 14.2969f, 20.3086f, 13.8867f, 19.7344f, 13.8867f)
                curveTo(19.1836f, 13.8867f, 18.8203f, 14.2969f, 18.8203f, 14.8594f)
                curveTo(18.8203f, 19.5703f, 15.0586f, 23.3438f, 10.3594f, 23.3438f)
                curveTo(5.6602f, 23.3438f, 1.8867f, 19.5703f, 1.8867f, 14.8594f)
                curveTo(1.8867f, 10.1602f, 5.6602f, 6.3984f, 10.3594f, 6.3984f)
                curveTo(11.25f, 6.3984f, 12.082f, 6.4688f, 12.7734f, 6.6328f)
                lineTo(9.2695f, 10.1016f)
                curveTo(9.0938f, 10.2891f, 9.0f, 10.5234f, 9.0f, 10.7695f)
                curveTo(9.0f, 11.3086f, 9.3984f, 11.707f, 9.9258f, 11.707f)
                curveTo(10.2188f, 11.707f, 10.4414f, 11.6133f, 10.6055f, 11.4375f)
                lineTo(15.4336f, 6.5859f)
                curveTo(15.6445f, 6.3867f, 15.7266f, 6.1523f, 15.7266f, 5.8828f)
                curveTo(15.7266f, 5.625f, 15.6211f, 5.3672f, 15.4336f, 5.1797f)
                lineTo(10.6055f, 0.2813f)
                curveTo(10.4414f, 0.0938f, 10.207f, 0.0f, 9.9258f, 0.0f)
                curveTo(9.3984f, 0.0f, 9.0f, 0.4219f, 9.0f, 0.9609f)
                curveTo(9.0f, 1.207f, 9.0938f, 1.4414f, 9.2578f, 1.6289f)
                lineTo(12.375f, 4.7109f)
                curveTo(11.7656f, 4.5938f, 11.0742f, 4.5117f, 10.3594f, 4.5117f)
                curveTo(4.6172f, 4.5117f, 0.0f, 9.1172f, 0.0f, 14.8594f)
                close()
            }
        }
        .build()
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
