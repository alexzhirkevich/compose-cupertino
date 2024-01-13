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

public val CupertinoIcons.Filled.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 22.853.dp, defaultHeight =
                24.668.dp, viewportWidth = 22.853f, viewportHeight = 24.668f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0625f, 24.668f)
                curveTo(13.043f, 24.668f, 14.4961f, 23.2148f, 14.6602f, 21.5742f)
                lineTo(7.4648f, 21.5742f)
                curveTo(7.6172f, 23.2148f, 9.0703f, 24.668f, 11.0625f, 24.668f)
                close()
                moveTo(1.7695f, 19.9688f)
                lineTo(15.9141f, 19.9688f)
                lineTo(3.6914f, 7.7344f)
                curveTo(3.4336f, 8.8477f, 3.3047f, 10.0781f, 3.2813f, 11.4609f)
                curveTo(3.1875f, 12.8086f, 2.9883f, 14.4727f, 2.2148f, 15.2812f)
                curveTo(1.1953f, 16.3242f, 0.0f, 17.3789f, 0.0f, 18.5508f)
                curveTo(0.0f, 19.4062f, 0.668f, 19.9688f, 1.7695f, 19.9688f)
                close()
                moveTo(11.0625f, 0.0f)
                curveTo(9.3281f, 0.0f, 8.1211f, 1.207f, 7.6758f, 2.7422f)
                curveTo(7.0547f, 2.9531f, 6.5156f, 3.2461f, 6.0586f, 3.6211f)
                lineTo(21.8203f, 19.4062f)
                curveTo(22.0195f, 19.1836f, 22.1133f, 18.8906f, 22.1133f, 18.5508f)
                curveTo(22.1133f, 17.3789f, 20.9297f, 16.3242f, 19.9102f, 15.2812f)
                curveTo(19.1367f, 14.4727f, 18.9258f, 12.8086f, 18.8438f, 11.4609f)
                curveTo(18.75f, 6.9609f, 17.5664f, 3.8672f, 14.4492f, 2.7422f)
                curveTo(14.0039f, 1.207f, 12.7852f, 0.0f, 11.0625f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2578f, 2.3789f)
                lineTo(21.3164f, 23.4023f)
                curveTo(21.668f, 23.7656f, 22.2422f, 23.7656f, 22.5938f, 23.4023f)
                curveTo(22.9336f, 23.0508f, 22.9453f, 22.4883f, 22.5938f, 22.125f)
                lineTo(1.5469f, 1.1016f)
                curveTo(1.1953f, 0.75f, 0.6211f, 0.75f, 0.2578f, 1.1016f)
                curveTo(-0.082f, 1.4414f, -0.082f, 2.0391f, 0.2578f, 2.3789f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
