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

public val CupertinoIcons.Outlined.BellBadge: ImageVector
    get() {
        if (_bellBadge != null) {
            return _bellBadge!!
        }
        _bellBadge = Builder(name = "BellBadge", defaultWidth = 22.1133.dp, defaultHeight =
                24.3867.dp, viewportWidth = 22.1133f, viewportHeight = 24.3867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.6328f)
                curveTo(0.0f, 19.4883f, 0.6563f, 20.0508f, 1.7695f, 20.0508f)
                lineTo(6.7148f, 20.0508f)
                curveTo(6.8086f, 22.3125f, 8.5781f, 24.293f, 11.0508f, 24.293f)
                curveTo(13.5352f, 24.293f, 15.3047f, 22.3125f, 15.3984f, 20.0508f)
                lineTo(20.3438f, 20.0508f)
                curveTo(21.4453f, 20.0508f, 22.1133f, 19.4883f, 22.1133f, 18.6328f)
                curveTo(22.1133f, 17.4609f, 20.918f, 16.4062f, 19.9102f, 15.3633f)
                curveTo(19.1367f, 14.5547f, 18.9258f, 12.8906f, 18.832f, 11.543f)
                curveTo(18.8203f, 10.7695f, 18.7617f, 10.0547f, 18.6914f, 9.3633f)
                curveTo(18.1406f, 9.5391f, 17.4141f, 9.6445f, 16.8398f, 9.6211f)
                curveTo(16.9102f, 10.2422f, 16.957f, 10.9102f, 16.9688f, 11.6953f)
                curveTo(17.0742f, 13.9805f, 17.4727f, 15.4922f, 18.3047f, 16.4297f)
                curveTo(18.9258f, 17.1094f, 19.6172f, 17.8008f, 19.8281f, 18.1406f)
                lineTo(19.8281f, 18.2812f)
                lineTo(2.2734f, 18.2812f)
                lineTo(2.2734f, 18.1406f)
                curveTo(2.4844f, 17.8008f, 3.1875f, 17.1094f, 3.7969f, 16.4297f)
                curveTo(4.6406f, 15.4922f, 5.0391f, 13.9805f, 5.1445f, 11.6953f)
                curveTo(5.2383f, 6.5742f, 6.7617f, 4.9453f, 8.7656f, 4.3945f)
                curveTo(9.0586f, 4.3242f, 9.2227f, 4.1836f, 9.2344f, 3.8789f)
                curveTo(9.2695f, 2.6602f, 9.9727f, 1.8047f, 11.0508f, 1.8047f)
                curveTo(11.2617f, 1.8047f, 11.4609f, 1.8281f, 11.625f, 1.8984f)
                curveTo(11.8477f, 1.3594f, 12.1406f, 0.8555f, 12.5156f, 0.4102f)
                curveTo(12.082f, 0.1992f, 11.5898f, 0.082f, 11.0508f, 0.082f)
                curveTo(9.3281f, 0.082f, 8.0625f, 1.2891f, 7.6758f, 2.8242f)
                curveTo(4.5586f, 3.9492f, 3.3633f, 6.9258f, 3.2813f, 11.543f)
                curveTo(3.1875f, 12.8906f, 2.9766f, 14.5547f, 2.2031f, 15.3633f)
                curveTo(1.1836f, 16.4062f, 0.0f, 17.4609f, 0.0f, 18.6328f)
                close()
                moveTo(8.543f, 20.0508f)
                lineTo(13.5703f, 20.0508f)
                curveTo(13.4766f, 21.6445f, 12.4688f, 22.6406f, 11.0508f, 22.6406f)
                curveTo(9.6445f, 22.6406f, 8.625f, 21.6445f, 8.543f, 20.0508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8281f, 8.1211f)
                curveTo(19.043f, 8.1211f, 20.8945f, 6.293f, 20.8945f, 4.0664f)
                curveTo(20.8945f, 1.8281f, 19.043f, 0.0f, 16.8281f, 0.0f)
                curveTo(14.5898f, 0.0f, 12.7617f, 1.8281f, 12.7617f, 4.0664f)
                curveTo(12.7617f, 6.293f, 14.5898f, 8.1211f, 16.8281f, 8.1211f)
                close()
            }
        }
        .build()
        return _bellBadge!!
    }

private var _bellBadge: ImageVector? = null
