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

public val CupertinoIcons.Filled.ArrowshapeTurnUpLeft2: ImageVector
    get() {
        if (_arrowshapeTurnUpLeft2 != null) {
            return _arrowshapeTurnUpLeft2!!
        }
        _arrowshapeTurnUpLeft2 = Builder(name = "ArrowshapeTurnUpLeft2", defaultWidth = 31.0898.dp,
                defaultHeight = 21.5273.dp, viewportWidth = 31.0898f, viewportHeight =
                21.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2734f, 21.4922f)
                curveTo(18.0703f, 21.4922f, 18.6445f, 20.9062f, 18.6445f, 20.1211f)
                lineTo(18.6445f, 15.6445f)
                lineTo(18.9844f, 15.6445f)
                curveTo(23.5312f, 15.6445f, 26.3906f, 16.793f, 28.4414f, 20.625f)
                curveTo(28.8516f, 21.375f, 29.3906f, 21.4922f, 29.8828f, 21.4922f)
                curveTo(30.5039f, 21.4922f, 31.0898f, 20.9297f, 31.0898f, 19.9219f)
                curveTo(31.0898f, 11.2617f, 27.4102f, 5.8594f, 18.9844f, 5.8594f)
                lineTo(18.6445f, 5.8594f)
                lineTo(18.6445f, 1.4297f)
                curveTo(18.6445f, 0.6445f, 18.0703f, 0.0f, 17.25f, 0.0f)
                curveTo(16.6758f, 0.0f, 16.2891f, 0.2461f, 15.668f, 0.832f)
                lineTo(6.4219f, 9.4805f)
                curveTo(5.9883f, 9.8789f, 5.8242f, 10.3242f, 5.8242f, 10.7461f)
                curveTo(5.8242f, 11.1445f, 5.9883f, 11.6016f, 6.4219f, 12.0f)
                lineTo(15.668f, 20.7305f)
                curveTo(16.2305f, 21.2578f, 16.6992f, 21.4922f, 17.2734f, 21.4922f)
                close()
                moveTo(11.4492f, 21.5039f)
                curveTo(12.2461f, 21.5039f, 12.8203f, 21.0234f, 12.8203f, 20.4844f)
                lineTo(12.8203f, 20.0859f)
                lineTo(5.2969f, 13.1367f)
                curveTo(4.582f, 12.4805f, 4.1602f, 11.6484f, 4.1602f, 10.7578f)
                curveTo(4.1602f, 9.8672f, 4.5586f, 9.0352f, 5.2969f, 8.3672f)
                lineTo(12.8203f, 1.4766f)
                lineTo(12.8203f, 1.0781f)
                curveTo(12.8203f, 0.5156f, 12.2461f, 0.0117f, 11.4258f, 0.0117f)
                curveTo(10.8516f, 0.0117f, 10.4648f, 0.2578f, 9.8438f, 0.8438f)
                lineTo(0.5859f, 9.4922f)
                curveTo(0.1406f, 9.9258f, 0.0f, 10.3594f, 0.0f, 10.7578f)
                curveTo(0.0f, 11.1445f, 0.1406f, 11.5898f, 0.5859f, 12.0117f)
                lineTo(9.8438f, 20.7422f)
                curveTo(10.3945f, 21.2695f, 10.875f, 21.5039f, 11.4492f, 21.5039f)
                close()
            }
        }
        .build()
        return _arrowshapeTurnUpLeft2!!
    }

private var _arrowshapeTurnUpLeft2: ImageVector? = null
