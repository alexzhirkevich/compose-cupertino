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

public val CupertinoIcons.Outlined.Skew: ImageVector
    get() {
        if (_skew != null) {
            return _skew!!
        }
        _skew = Builder(name = "Skew", defaultWidth = 27.7852.dp, defaultHeight = 25.9102.dp,
                viewportWidth = 27.7852f, viewportHeight = 25.9102f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.6367f)
                curveTo(0.0f, 19.0781f, 1.1836f, 20.2617f, 2.625f, 20.2617f)
                curveTo(3.6445f, 20.2617f, 4.5469f, 19.6523f, 4.9688f, 18.7852f)
                lineTo(22.6406f, 23.9531f)
                curveTo(22.9219f, 25.0781f, 23.9531f, 25.9102f, 25.1719f, 25.9102f)
                curveTo(26.6016f, 25.9102f, 27.7852f, 24.7383f, 27.7852f, 23.2969f)
                curveTo(27.7852f, 22.207f, 27.1055f, 21.2695f, 26.168f, 20.8828f)
                lineTo(25.6641f, 9.0703f)
                curveTo(26.6719f, 8.7188f, 27.3984f, 7.7578f, 27.3984f, 6.6211f)
                curveTo(27.3984f, 5.1797f, 26.2266f, 4.0078f, 24.7969f, 4.0078f)
                curveTo(23.8359f, 4.0078f, 23.0039f, 4.5234f, 22.5352f, 5.2734f)
                lineTo(12.7734f, 2.6016f)
                curveTo(12.7383f, 1.1836f, 11.5781f, 0.0352f, 10.1719f, 0.0352f)
                curveTo(8.7305f, 0.0352f, 7.5469f, 1.2188f, 7.5469f, 2.6602f)
                curveTo(7.5469f, 3.4336f, 7.8867f, 4.125f, 8.4258f, 4.6172f)
                lineTo(2.9883f, 15.0703f)
                curveTo(2.8594f, 15.0352f, 2.7422f, 15.0234f, 2.625f, 15.0234f)
                curveTo(1.1836f, 15.0234f, 0.0f, 16.1953f, 0.0f, 17.6367f)
                close()
                moveTo(4.5234f, 15.8555f)
                lineTo(9.9727f, 5.2383f)
                curveTo(10.8867f, 5.3555f, 11.7656f, 4.9219f, 12.2344f, 4.1953f)
                lineTo(22.2305f, 6.9375f)
                curveTo(22.3125f, 7.957f, 23.0508f, 8.8359f, 24.0234f, 9.1289f)
                lineTo(24.4336f, 20.7773f)
                curveTo(23.6602f, 21.0f, 23.0273f, 21.5742f, 22.7461f, 22.3125f)
                lineTo(5.1563f, 17.1445f)
                curveTo(5.0859f, 16.6406f, 4.875f, 16.2305f, 4.5234f, 15.8555f)
                close()
            }
        }
        .build()
        return _skew!!
    }

private var _skew: ImageVector? = null
