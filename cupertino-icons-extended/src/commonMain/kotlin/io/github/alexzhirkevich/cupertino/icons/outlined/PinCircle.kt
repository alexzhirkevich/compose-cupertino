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

public val CupertinoIcons.Outlined.PinCircle: ImageVector
    get() {
        if (_pinCircle != null) {
            return _pinCircle!!
        }
        _pinCircle = Builder(name = "PinCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3359f, 14.1797f)
                curveTo(7.3359f, 14.6953f, 7.6641f, 15.0117f, 8.1914f, 15.0117f)
                lineTo(11.2266f, 15.0117f)
                lineTo(11.2266f, 17.1094f)
                curveTo(11.2266f, 18.3867f, 11.7422f, 19.4414f, 11.9531f, 19.4414f)
                curveTo(12.1641f, 19.4414f, 12.6797f, 18.3867f, 12.6797f, 17.1094f)
                lineTo(12.6797f, 15.0117f)
                lineTo(15.7031f, 15.0117f)
                curveTo(16.2305f, 15.0117f, 16.5703f, 14.6953f, 16.5703f, 14.1797f)
                curveTo(16.5703f, 12.9375f, 15.5625f, 11.6016f, 13.8867f, 11.0039f)
                lineTo(13.6992f, 8.25f)
                curveTo(14.5547f, 7.7695f, 15.2578f, 7.2188f, 15.5625f, 6.8203f)
                curveTo(15.7266f, 6.6094f, 15.8086f, 6.3984f, 15.8086f, 6.2109f)
                curveTo(15.8086f, 5.8477f, 15.5273f, 5.5898f, 15.1055f, 5.5898f)
                lineTo(8.8008f, 5.5898f)
                curveTo(8.3789f, 5.5898f, 8.0977f, 5.8477f, 8.0977f, 6.2109f)
                curveTo(8.0977f, 6.3984f, 8.1797f, 6.6211f, 8.3555f, 6.832f)
                curveTo(8.6602f, 7.2305f, 9.3633f, 7.7813f, 10.207f, 8.25f)
                lineTo(10.0078f, 11.0039f)
                curveTo(8.3438f, 11.6016f, 7.3359f, 12.9375f, 7.3359f, 14.1797f)
                close()
            }
        }
        .build()
        return _pinCircle!!
    }

private var _pinCircle: ImageVector? = null
