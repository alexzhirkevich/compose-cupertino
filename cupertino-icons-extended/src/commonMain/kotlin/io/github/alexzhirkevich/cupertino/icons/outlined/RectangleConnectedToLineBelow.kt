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

public val CupertinoIcons.Outlined.RectangleConnectedToLineBelow: ImageVector
    get() {
        if (_rectangleConnectedToLineBelow != null) {
            return _rectangleConnectedToLineBelow!!
        }
        _rectangleConnectedToLineBelow = Builder(name = "RectangleConnectedToLineBelow",
                defaultWidth = 21.375.dp, defaultHeight = 26.9648.dp, viewportWidth = 21.375f,
                viewportHeight = 26.9648f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 18.9141f)
                lineTo(17.6953f, 18.9141f)
                curveTo(20.1445f, 18.9141f, 21.375f, 17.6953f, 21.375f, 15.293f)
                lineTo(21.375f, 5.0039f)
                curveTo(21.375f, 2.5898f, 20.1445f, 1.3711f, 17.6953f, 1.3711f)
                lineTo(3.6797f, 1.3711f)
                curveTo(1.2188f, 1.3711f, 0.0f, 2.5898f, 0.0f, 5.0039f)
                lineTo(0.0f, 15.293f)
                curveTo(0.0f, 17.6953f, 1.2188f, 18.9141f, 3.6797f, 18.9141f)
                close()
                moveTo(3.7031f, 17.0273f)
                curveTo(2.5547f, 17.0273f, 1.8867f, 16.4062f, 1.8867f, 15.1875f)
                lineTo(1.8867f, 5.1094f)
                curveTo(1.8867f, 3.8906f, 2.5547f, 3.2578f, 3.7031f, 3.2578f)
                lineTo(17.6602f, 3.2578f)
                curveTo(18.8203f, 3.2578f, 19.4883f, 3.8906f, 19.4883f, 5.1094f)
                lineTo(19.4883f, 15.1875f)
                curveTo(19.4883f, 16.4062f, 18.8203f, 17.0273f, 17.6602f, 17.0273f)
                close()
                moveTo(9.7383f, 24.3047f)
                lineTo(11.625f, 24.3047f)
                lineTo(11.625f, 17.707f)
                lineTo(9.7383f, 17.707f)
                close()
                moveTo(0.9375f, 25.2422f)
                lineTo(20.4258f, 25.2422f)
                curveTo(20.9414f, 25.2422f, 21.375f, 24.8203f, 21.375f, 24.3047f)
                curveTo(21.375f, 23.7773f, 20.9414f, 23.3555f, 20.4258f, 23.3555f)
                lineTo(0.9375f, 23.3555f)
                curveTo(0.4219f, 23.3555f, 0.0f, 23.7773f, 0.0f, 24.3047f)
                curveTo(0.0f, 24.8203f, 0.4219f, 25.2422f, 0.9375f, 25.2422f)
                close()
                moveTo(10.6875f, 26.9648f)
                curveTo(12.1406f, 26.9648f, 13.3359f, 25.7695f, 13.3359f, 24.3164f)
                curveTo(13.3359f, 22.8633f, 12.1406f, 21.668f, 10.6875f, 21.668f)
                curveTo(9.2344f, 21.668f, 8.0391f, 22.8633f, 8.0391f, 24.3164f)
                curveTo(8.0391f, 25.7695f, 9.2344f, 26.9648f, 10.6875f, 26.9648f)
                close()
            }
        }
        .build()
        return _rectangleConnectedToLineBelow!!
    }

private var _rectangleConnectedToLineBelow: ImageVector? = null
