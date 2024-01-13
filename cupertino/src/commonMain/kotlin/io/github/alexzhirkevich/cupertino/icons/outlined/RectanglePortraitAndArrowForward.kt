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

public val CupertinoIcons.Outlined.RectanglePortraitAndArrowForward: ImageVector
    get() {
        if (_rectanglePortraitAndArrowForward != null) {
            return _rectanglePortraitAndArrowForward!!
        }
        _rectanglePortraitAndArrowForward = Builder(name = "RectanglePortraitAndArrowForward",
                defaultWidth = 27.1992.dp, defaultHeight = 25.1367.dp, viewportWidth = 27.1992f,
                viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6328f, 25.125f)
                lineTo(16.0781f, 25.125f)
                curveTo(18.5039f, 25.125f, 19.7109f, 23.9062f, 19.7109f, 21.457f)
                lineTo(19.7109f, 16.0195f)
                lineTo(17.8242f, 16.0195f)
                lineTo(17.8242f, 21.4219f)
                curveTo(17.8242f, 22.5938f, 17.2031f, 23.2383f, 15.9844f, 23.2383f)
                lineTo(3.7266f, 23.2383f)
                curveTo(2.5078f, 23.2383f, 1.8867f, 22.5938f, 1.8867f, 21.4219f)
                lineTo(1.8867f, 3.7148f)
                curveTo(1.8867f, 2.543f, 2.5078f, 1.8867f, 3.7266f, 1.8867f)
                lineTo(15.9844f, 1.8867f)
                curveTo(17.2031f, 1.8867f, 17.8242f, 2.543f, 17.8242f, 3.7148f)
                lineTo(17.8242f, 9.1055f)
                lineTo(19.7109f, 9.1055f)
                lineTo(19.7109f, 3.6797f)
                curveTo(19.7109f, 1.2422f, 18.5039f, 0.0f, 16.0781f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.207f, 0.0f, 0.0f, 1.2422f, 0.0f, 3.6797f)
                lineTo(0.0f, 21.457f)
                curveTo(0.0f, 23.9062f, 1.207f, 25.125f, 3.6328f, 25.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8398f, 13.4883f)
                lineTo(22.875f, 13.4883f)
                lineTo(24.6328f, 13.418f)
                lineTo(23.8008f, 14.2148f)
                lineTo(21.9141f, 15.9844f)
                curveTo(21.7266f, 16.1484f, 21.6328f, 16.3945f, 21.6328f, 16.6172f)
                curveTo(21.6328f, 17.1094f, 21.9727f, 17.4727f, 22.4531f, 17.4727f)
                curveTo(22.6992f, 17.4727f, 22.8867f, 17.3789f, 23.0742f, 17.2031f)
                lineTo(26.8945f, 13.2422f)
                curveTo(27.1289f, 13.0078f, 27.1992f, 12.7969f, 27.1992f, 12.5625f)
                curveTo(27.1992f, 12.3164f, 27.1289f, 12.1172f, 26.8945f, 11.8828f)
                lineTo(23.0742f, 7.9219f)
                curveTo(22.8867f, 7.7461f, 22.6992f, 7.6406f, 22.4531f, 7.6406f)
                curveTo(21.9727f, 7.6406f, 21.6328f, 7.9922f, 21.6328f, 8.4844f)
                curveTo(21.6328f, 8.7188f, 21.7266f, 8.9648f, 21.9141f, 9.1289f)
                lineTo(23.8008f, 10.9102f)
                lineTo(24.6328f, 11.707f)
                lineTo(22.875f, 11.625f)
                lineTo(10.8398f, 11.625f)
                curveTo(10.3477f, 11.625f, 9.9375f, 12.0586f, 9.9375f, 12.5625f)
                curveTo(9.9375f, 13.0664f, 10.3477f, 13.4883f, 10.8398f, 13.4883f)
                close()
            }
        }
        .build()
        return _rectanglePortraitAndArrowForward!!
    }

private var _rectanglePortraitAndArrowForward: ImageVector? = null
