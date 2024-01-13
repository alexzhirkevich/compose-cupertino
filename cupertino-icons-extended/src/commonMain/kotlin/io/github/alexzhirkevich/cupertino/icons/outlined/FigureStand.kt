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

public val CupertinoIcons.Outlined.FigureStand: ImageVector
    get() {
        if (_figureStand != null) {
            return _figureStand!!
        }
        _figureStand = Builder(name = "FigureStand", defaultWidth = 11.0391.dp, defaultHeight =
                26.332.dp, viewportWidth = 11.0391f, viewportHeight = 26.332f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.7969f)
                curveTo(0.0f, 16.3828f, 0.457f, 16.8398f, 1.043f, 16.8398f)
                curveTo(1.6172f, 16.8398f, 2.0742f, 16.3828f, 2.0742f, 15.7969f)
                lineTo(2.0742f, 11.2852f)
                curveTo(2.0742f, 11.0742f, 2.25f, 10.9102f, 2.4609f, 10.9102f)
                curveTo(2.6719f, 10.9102f, 2.8359f, 11.0742f, 2.8359f, 11.2852f)
                lineTo(2.8359f, 24.9492f)
                curveTo(2.8359f, 25.582f, 3.3516f, 26.0859f, 3.9844f, 26.0859f)
                curveTo(4.6172f, 26.0859f, 5.1328f, 25.582f, 5.1328f, 24.9492f)
                lineTo(5.1328f, 16.6406f)
                curveTo(5.1328f, 16.4297f, 5.3086f, 16.2422f, 5.5195f, 16.2422f)
                curveTo(5.7305f, 16.2422f, 5.918f, 16.4297f, 5.918f, 16.6406f)
                lineTo(5.918f, 24.9492f)
                curveTo(5.918f, 25.582f, 6.4219f, 26.0859f, 7.0547f, 26.0859f)
                curveTo(7.6875f, 26.0859f, 8.2031f, 25.582f, 8.2031f, 24.9492f)
                lineTo(8.2031f, 11.2852f)
                curveTo(8.2031f, 11.0742f, 8.3672f, 10.9102f, 8.5781f, 10.9102f)
                curveTo(8.7891f, 10.9102f, 8.9648f, 11.0742f, 8.9648f, 11.2852f)
                lineTo(8.9648f, 15.7969f)
                curveTo(8.9648f, 16.3828f, 9.4219f, 16.8398f, 9.9961f, 16.8398f)
                curveTo(10.582f, 16.8398f, 11.0391f, 16.3828f, 11.0391f, 15.7969f)
                lineTo(11.0391f, 10.7578f)
                curveTo(11.0391f, 8.168f, 9.1406f, 6.457f, 6.3633f, 6.457f)
                lineTo(4.6758f, 6.457f)
                curveTo(1.8984f, 6.457f, 0.0f, 8.168f, 0.0f, 10.7578f)
                close()
                moveTo(5.5195f, 5.1094f)
                curveTo(6.9375f, 5.1094f, 8.0742f, 3.9727f, 8.0742f, 2.5547f)
                curveTo(8.0742f, 1.1367f, 6.9375f, 0.0f, 5.5195f, 0.0f)
                curveTo(4.1016f, 0.0f, 2.9648f, 1.1367f, 2.9648f, 2.5547f)
                curveTo(2.9648f, 3.9727f, 4.1016f, 5.1094f, 5.5195f, 5.1094f)
                close()
            }
        }
        .build()
        return _figureStand!!
    }

private var _figureStand: ImageVector? = null
