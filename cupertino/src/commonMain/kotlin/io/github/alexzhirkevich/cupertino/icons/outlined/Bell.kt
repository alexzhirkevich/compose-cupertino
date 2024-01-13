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

public val CupertinoIcons.Outlined.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 22.1133.dp, defaultHeight = 24.2227.dp,
                viewportWidth = 22.1133f, viewportHeight = 24.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.5508f)
                curveTo(0.0f, 19.4062f, 0.6563f, 19.9688f, 1.7695f, 19.9688f)
                lineTo(6.7148f, 19.9688f)
                curveTo(6.8086f, 22.2305f, 8.5781f, 24.2109f, 11.0508f, 24.2109f)
                curveTo(13.5352f, 24.2109f, 15.3047f, 22.2422f, 15.3984f, 19.9688f)
                lineTo(20.3438f, 19.9688f)
                curveTo(21.4453f, 19.9688f, 22.1133f, 19.4062f, 22.1133f, 18.5508f)
                curveTo(22.1133f, 17.3789f, 20.918f, 16.3242f, 19.9102f, 15.2812f)
                curveTo(19.1367f, 14.4727f, 18.9258f, 12.8086f, 18.832f, 11.4609f)
                curveTo(18.75f, 6.8438f, 17.5547f, 3.8672f, 14.4375f, 2.7422f)
                curveTo(14.0391f, 1.207f, 12.7852f, 0.0f, 11.0508f, 0.0f)
                curveTo(9.3281f, 0.0f, 8.0625f, 1.207f, 7.6758f, 2.7422f)
                curveTo(4.5586f, 3.8672f, 3.3633f, 6.8438f, 3.2813f, 11.4609f)
                curveTo(3.1875f, 12.8086f, 2.9766f, 14.4727f, 2.2031f, 15.2812f)
                curveTo(1.1836f, 16.3242f, 0.0f, 17.3789f, 0.0f, 18.5508f)
                close()
                moveTo(2.2734f, 18.1992f)
                lineTo(2.2734f, 18.0586f)
                curveTo(2.4844f, 17.7188f, 3.1875f, 17.0273f, 3.7969f, 16.3477f)
                curveTo(4.6406f, 15.4102f, 5.0391f, 13.8984f, 5.1445f, 11.6133f)
                curveTo(5.2383f, 6.4922f, 6.7617f, 4.8633f, 8.7656f, 4.3125f)
                curveTo(9.0586f, 4.2422f, 9.2227f, 4.1016f, 9.2344f, 3.7969f)
                curveTo(9.2695f, 2.5781f, 9.9727f, 1.7227f, 11.0508f, 1.7227f)
                curveTo(12.1406f, 1.7227f, 12.832f, 2.5781f, 12.8789f, 3.7969f)
                curveTo(12.8906f, 4.1016f, 13.043f, 4.2422f, 13.3359f, 4.3125f)
                curveTo(15.3516f, 4.8633f, 16.875f, 6.4922f, 16.9688f, 11.6133f)
                curveTo(17.0742f, 13.8984f, 17.4727f, 15.4102f, 18.3047f, 16.3477f)
                curveTo(18.9258f, 17.0273f, 19.6172f, 17.7188f, 19.8281f, 18.0586f)
                lineTo(19.8281f, 18.1992f)
                close()
                moveTo(8.543f, 19.9688f)
                lineTo(13.5703f, 19.9688f)
                curveTo(13.4766f, 21.5625f, 12.4688f, 22.5586f, 11.0508f, 22.5586f)
                curveTo(9.6445f, 22.5586f, 8.625f, 21.5625f, 8.543f, 19.9688f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
