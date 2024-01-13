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

public val CupertinoIcons.Outlined.ArrowUturnLeft: ImageVector
    get() {
        if (_arrowUturnLeft != null) {
            return _arrowUturnLeft!!
        }
        _arrowUturnLeft = Builder(name = "ArrowUturnLeft", defaultWidth = 22.1484.dp, defaultHeight
                = 24.2227.dp, viewportWidth = 22.1484f, viewportHeight = 24.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1484f, 16.7461f)
                curveTo(22.1484f, 12.2695f, 19.1133f, 9.1758f, 13.7695f, 9.1758f)
                lineTo(5.8945f, 9.1758f)
                lineTo(2.2617f, 9.3398f)
                lineTo(2.4727f, 9.8789f)
                lineTo(5.3672f, 7.4063f)
                lineTo(8.7539f, 4.1016f)
                curveTo(8.9297f, 3.9141f, 9.0352f, 3.6914f, 9.0352f, 3.3867f)
                curveTo(9.0352f, 2.7773f, 8.625f, 2.3555f, 7.9922f, 2.3555f)
                curveTo(7.7461f, 2.3555f, 7.4414f, 2.4844f, 7.2422f, 2.6836f)
                lineTo(0.3516f, 9.4453f)
                curveTo(0.1172f, 9.668f, 0.0f, 9.9375f, 0.0f, 10.2305f)
                curveTo(0.0f, 10.5117f, 0.1172f, 10.7812f, 0.3516f, 11.0039f)
                lineTo(7.2422f, 17.7656f)
                curveTo(7.4414f, 17.9766f, 7.7461f, 18.0938f, 7.9922f, 18.0938f)
                curveTo(8.625f, 18.0938f, 9.0352f, 17.6719f, 9.0352f, 17.0625f)
                curveTo(9.0352f, 16.7578f, 8.9297f, 16.5352f, 8.7539f, 16.3477f)
                lineTo(5.3672f, 13.0547f)
                lineTo(2.4727f, 10.5703f)
                lineTo(2.2617f, 11.1094f)
                lineTo(5.8945f, 11.2734f)
                lineTo(13.9453f, 11.2734f)
                curveTo(17.9414f, 11.2734f, 20.0508f, 13.4766f, 20.0508f, 16.6289f)
                curveTo(20.0508f, 19.793f, 17.9414f, 22.1367f, 13.9453f, 22.1367f)
                lineTo(11.25f, 22.1367f)
                curveTo(10.6055f, 22.1367f, 10.1836f, 22.6055f, 10.1836f, 23.1797f)
                curveTo(10.1836f, 23.7539f, 10.6055f, 24.2227f, 11.25f, 24.2227f)
                lineTo(13.957f, 24.2227f)
                curveTo(19.1953f, 24.2227f, 22.1484f, 21.2344f, 22.1484f, 16.7461f)
                close()
            }
        }
        .build()
        return _arrowUturnLeft!!
    }

private var _arrowUturnLeft: ImageVector? = null
