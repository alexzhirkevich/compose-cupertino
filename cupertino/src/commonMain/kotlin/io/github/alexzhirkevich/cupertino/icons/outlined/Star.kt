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

public val CupertinoIcons.Outlined.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 26.0251.dp, defaultHeight = 26.543.dp,
                viewportWidth = 26.0251f, viewportHeight = 26.543f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9933f, 24.6562f)
                curveTo(5.4738f, 25.0312f, 6.0832f, 24.9023f, 6.8097f, 24.375f)
                lineTo(13.0089f, 19.8164f)
                lineTo(19.2199f, 24.375f)
                curveTo(19.9464f, 24.9023f, 20.5441f, 25.0312f, 21.0363f, 24.6562f)
                curveTo(21.5168f, 24.293f, 21.6222f, 23.6953f, 21.3293f, 22.8398f)
                lineTo(18.88f, 15.5508f)
                lineTo(25.1378f, 11.0508f)
                curveTo(25.8644f, 10.5352f, 26.1574f, 9.9961f, 25.9699f, 9.4102f)
                curveTo(25.7824f, 8.8477f, 25.2316f, 8.5664f, 24.3293f, 8.5781f)
                lineTo(16.6535f, 8.625f)
                lineTo(14.3214f, 1.3008f)
                curveTo(14.0402f, 0.4336f, 13.6183f, 0.0f, 13.0089f, 0.0f)
                curveTo(12.4113f, 0.0f, 11.9894f, 0.4336f, 11.7082f, 1.3008f)
                lineTo(9.3761f, 8.625f)
                lineTo(1.7004f, 8.5781f)
                curveTo(0.798f, 8.5664f, 0.2472f, 8.8477f, 0.0597f, 9.4102f)
                curveTo(-0.1395f, 9.9961f, 0.1652f, 10.5352f, 0.8918f, 11.0508f)
                lineTo(7.1496f, 15.5508f)
                lineTo(4.7003f, 22.8398f)
                curveTo(4.4074f, 23.6953f, 4.5128f, 24.293f, 4.9933f, 24.6562f)
                close()
                moveTo(6.6808f, 22.3359f)
                curveTo(6.6574f, 22.3125f, 6.6691f, 22.3008f, 6.6808f, 22.2305f)
                lineTo(9.0128f, 15.5273f)
                curveTo(9.1769f, 15.0703f, 9.0832f, 14.707f, 8.673f, 14.4258f)
                lineTo(2.8371f, 10.3945f)
                curveTo(2.7785f, 10.3594f, 2.7668f, 10.3359f, 2.7785f, 10.3008f)
                curveTo(2.7902f, 10.2656f, 2.8136f, 10.2656f, 2.8839f, 10.2656f)
                lineTo(9.9738f, 10.3945f)
                curveTo(10.4543f, 10.4062f, 10.7589f, 10.207f, 10.9113f, 9.7266f)
                lineTo(12.9503f, 2.9414f)
                curveTo(12.9621f, 2.8711f, 12.9855f, 2.8477f, 13.0089f, 2.8477f)
                curveTo(13.0441f, 2.8477f, 13.0675f, 2.8711f, 13.0793f, 2.9414f)
                lineTo(15.1183f, 9.7266f)
                curveTo(15.2707f, 10.207f, 15.5753f, 10.4062f, 16.0558f, 10.3945f)
                lineTo(23.1457f, 10.2656f)
                curveTo(23.216f, 10.2656f, 23.2394f, 10.2656f, 23.2511f, 10.3008f)
                curveTo(23.2628f, 10.3359f, 23.2394f, 10.3594f, 23.1925f, 10.3945f)
                lineTo(17.3566f, 14.4258f)
                curveTo(16.9464f, 14.707f, 16.8527f, 15.0703f, 17.0168f, 15.5273f)
                lineTo(19.3488f, 22.2305f)
                curveTo(19.3605f, 22.3008f, 19.3722f, 22.3125f, 19.3488f, 22.3359f)
                curveTo(19.3253f, 22.3711f, 19.2902f, 22.3477f, 19.2433f, 22.3125f)
                lineTo(13.6066f, 18.0117f)
                curveTo(13.2316f, 17.7188f, 12.798f, 17.7188f, 12.423f, 18.0117f)
                lineTo(6.7863f, 22.3125f)
                curveTo(6.7394f, 22.3477f, 6.7042f, 22.3711f, 6.6808f, 22.3359f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
