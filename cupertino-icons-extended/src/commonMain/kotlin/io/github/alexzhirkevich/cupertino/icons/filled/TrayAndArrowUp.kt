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

public val CupertinoIcons.Filled.TrayAndArrowUp: ImageVector
    get() {
        if (_trayAndArrowUp != null) {
            return _trayAndArrowUp!!
        }
        _trayAndArrowUp = Builder(name = "TrayAndArrowUp", defaultWidth = 27.6328.dp, defaultHeight
                = 29.6133.dp, viewportWidth = 27.6328f, viewportHeight = 29.6133f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 27.1641f)
                lineTo(23.9531f, 27.1641f)
                curveTo(26.4141f, 27.1641f, 27.6328f, 25.9453f, 27.6328f, 23.5312f)
                lineTo(27.6328f, 17.0625f)
                curveTo(27.6328f, 15.9961f, 27.4922f, 15.4922f, 26.9648f, 14.8359f)
                lineTo(23.0391f, 9.7969f)
                curveTo(21.6211f, 7.9805f, 21.0586f, 7.6172f, 18.9727f, 7.6172f)
                lineTo(16.9102f, 7.6172f)
                lineTo(16.9102f, 9.2695f)
                lineTo(19.1133f, 9.2695f)
                curveTo(19.9688f, 9.2695f, 20.5312f, 9.4102f, 21.1875f, 10.2656f)
                lineTo(25.2422f, 15.5156f)
                curveTo(25.6992f, 16.1133f, 25.5469f, 16.3477f, 24.9023f, 16.3477f)
                lineTo(17.6719f, 16.3477f)
                curveTo(17.0156f, 16.3477f, 16.7109f, 16.8516f, 16.7109f, 17.3672f)
                lineTo(16.7109f, 17.4141f)
                curveTo(16.7109f, 18.8555f, 15.5859f, 20.3672f, 13.8164f, 20.3672f)
                curveTo(12.0586f, 20.3672f, 10.9336f, 18.8555f, 10.9336f, 17.4141f)
                lineTo(10.9336f, 17.3672f)
                curveTo(10.9336f, 16.8516f, 10.6172f, 16.3477f, 9.9609f, 16.3477f)
                lineTo(2.7539f, 16.3477f)
                curveTo(2.0742f, 16.3477f, 1.9688f, 16.0664f, 2.4023f, 15.5156f)
                lineTo(6.4219f, 10.3008f)
                curveTo(7.1016f, 9.4219f, 7.6641f, 9.2695f, 8.5195f, 9.2695f)
                lineTo(10.7344f, 9.2695f)
                lineTo(10.7344f, 7.6172f)
                lineTo(8.6602f, 7.6172f)
                curveTo(6.5742f, 7.6172f, 6.0352f, 7.9805f, 4.582f, 9.832f)
                lineTo(0.668f, 14.8359f)
                curveTo(0.1523f, 15.4922f, 0.0f, 15.9961f, 0.0f, 17.0625f)
                lineTo(0.0f, 23.5312f)
                curveTo(0.0f, 25.9453f, 1.2305f, 27.1641f, 3.6797f, 27.1641f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8164f, 17.2734f)
                curveTo(14.3203f, 17.2734f, 14.7539f, 16.8516f, 14.7539f, 16.3594f)
                lineTo(14.7539f, 4.3242f)
                lineTo(14.6719f, 2.5781f)
                lineTo(15.4688f, 3.3984f)
                lineTo(17.2383f, 5.2969f)
                curveTo(17.4023f, 5.4844f, 17.6484f, 5.5781f, 17.8828f, 5.5781f)
                curveTo(18.3633f, 5.5781f, 18.7266f, 5.2266f, 18.7266f, 4.7578f)
                curveTo(18.7266f, 4.5f, 18.6328f, 4.3125f, 18.457f, 4.1367f)
                lineTo(14.4961f, 0.3164f)
                curveTo(14.2617f, 0.082f, 14.0625f, 0.0f, 13.8164f, 0.0f)
                curveTo(13.582f, 0.0f, 13.3711f, 0.082f, 13.1367f, 0.3164f)
                lineTo(9.1758f, 4.1367f)
                curveTo(9.0f, 4.3125f, 8.9063f, 4.5f, 8.9063f, 4.7578f)
                curveTo(8.9063f, 5.2266f, 9.2578f, 5.5781f, 9.7383f, 5.5781f)
                curveTo(9.9727f, 5.5781f, 10.2188f, 5.4844f, 10.3945f, 5.2969f)
                lineTo(12.1641f, 3.3984f)
                lineTo(12.9609f, 2.5664f)
                lineTo(12.8906f, 4.3242f)
                lineTo(12.8906f, 16.3594f)
                curveTo(12.8906f, 16.8516f, 13.3125f, 17.2734f, 13.8164f, 17.2734f)
                close()
            }
        }
        .build()
        return _trayAndArrowUp!!
    }

private var _trayAndArrowUp: ImageVector? = null
