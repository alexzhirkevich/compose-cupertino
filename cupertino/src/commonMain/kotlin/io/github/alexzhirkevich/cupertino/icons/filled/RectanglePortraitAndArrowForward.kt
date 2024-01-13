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

public val CupertinoIcons.Filled.RectanglePortraitAndArrowForward: ImageVector
    get() {
        if (_rectanglePortraitAndArrowForward != null) {
            return _rectanglePortraitAndArrowForward!!
        }
        _rectanglePortraitAndArrowForward = Builder(name = "RectanglePortraitAndArrowForward",
                defaultWidth = 27.4336.dp, defaultHeight = 25.1367.dp, viewportWidth = 27.4336f,
                viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6328f, 25.1367f)
                lineTo(16.0781f, 25.1367f)
                curveTo(18.5039f, 25.1367f, 19.7109f, 23.9062f, 19.7109f, 21.457f)
                lineTo(19.7109f, 13.7227f)
                lineTo(11.0508f, 13.7227f)
                curveTo(10.4297f, 13.7227f, 9.9023f, 13.1953f, 9.9023f, 12.5625f)
                curveTo(9.9023f, 11.9297f, 10.4297f, 11.3906f, 11.0508f, 11.3906f)
                lineTo(19.7109f, 11.3906f)
                lineTo(19.7109f, 3.6797f)
                curveTo(19.7109f, 1.2422f, 18.5039f, 0.0117f, 16.0781f, 0.0117f)
                lineTo(3.6328f, 0.0117f)
                curveTo(1.207f, 0.0117f, 0.0f, 1.2422f, 0.0f, 3.6797f)
                lineTo(0.0f, 21.457f)
                curveTo(0.0f, 23.9062f, 1.207f, 25.1367f, 3.6328f, 25.1367f)
                close()
                moveTo(18.7969f, 12.5625f)
                curveTo(18.7969f, 13.0664f, 19.207f, 13.4883f, 19.6992f, 13.4883f)
                lineTo(23.1094f, 13.4883f)
                lineTo(24.8672f, 13.418f)
                lineTo(24.0352f, 14.2148f)
                lineTo(22.1484f, 15.9844f)
                curveTo(21.9609f, 16.1484f, 21.8672f, 16.3945f, 21.8672f, 16.6172f)
                curveTo(21.8672f, 17.1094f, 22.207f, 17.4727f, 22.6875f, 17.4727f)
                curveTo(22.9336f, 17.4727f, 23.1211f, 17.3789f, 23.3086f, 17.2031f)
                lineTo(27.1289f, 13.2422f)
                curveTo(27.3633f, 13.0078f, 27.4336f, 12.7969f, 27.4336f, 12.5625f)
                curveTo(27.4336f, 12.3164f, 27.3633f, 12.1172f, 27.1289f, 11.8828f)
                lineTo(23.3086f, 7.9219f)
                curveTo(23.1211f, 7.7461f, 22.9336f, 7.6406f, 22.6875f, 7.6406f)
                curveTo(22.207f, 7.6406f, 21.8672f, 7.9922f, 21.8672f, 8.4844f)
                curveTo(21.8672f, 8.7188f, 21.9609f, 8.9648f, 22.1484f, 9.1289f)
                lineTo(24.0352f, 10.9102f)
                lineTo(24.8672f, 11.707f)
                lineTo(23.1094f, 11.625f)
                lineTo(19.6992f, 11.625f)
                curveTo(19.207f, 11.625f, 18.7969f, 12.0586f, 18.7969f, 12.5625f)
                close()
            }
        }
        .build()
        return _rectanglePortraitAndArrowForward!!
    }

private var _rectanglePortraitAndArrowForward: ImageVector? = null
