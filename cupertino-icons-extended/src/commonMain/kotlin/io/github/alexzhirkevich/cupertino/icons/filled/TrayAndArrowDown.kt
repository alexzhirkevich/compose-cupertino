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

public val CupertinoIcons.Filled.TrayAndArrowDown: ImageVector
    get() {
        if (_trayAndArrowDown != null) {
            return _trayAndArrowDown!!
        }
        _trayAndArrowDown = Builder(name = "TrayAndArrowDown", defaultWidth = 27.6328.dp,
                defaultHeight = 29.4727.dp, viewportWidth = 27.6328f, viewportHeight =
                29.4727f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 27.0938f)
                lineTo(23.9531f, 27.0938f)
                curveTo(26.4141f, 27.0938f, 27.6328f, 25.875f, 27.6328f, 23.4609f)
                lineTo(27.6328f, 16.5234f)
                curveTo(27.6328f, 15.457f, 27.4922f, 14.9297f, 26.9648f, 14.2969f)
                lineTo(22.9219f, 9.2813f)
                curveTo(21.5508f, 7.5938f, 20.707f, 6.6094f, 18.6328f, 6.6094f)
                lineTo(16.9102f, 6.6094f)
                lineTo(16.9102f, 8.2617f)
                lineTo(18.7617f, 8.2617f)
                curveTo(19.6172f, 8.2617f, 20.5078f, 9.0117f, 21.082f, 9.7383f)
                lineTo(25.2422f, 14.9766f)
                curveTo(25.7109f, 15.5742f, 25.5469f, 15.8086f, 24.9023f, 15.8086f)
                lineTo(17.6719f, 15.8086f)
                curveTo(17.0156f, 15.8086f, 16.7109f, 16.3125f, 16.7109f, 16.8281f)
                lineTo(16.7109f, 16.875f)
                curveTo(16.7109f, 18.3164f, 15.5859f, 19.8281f, 13.8164f, 19.8281f)
                curveTo(12.0586f, 19.8281f, 10.9336f, 18.3164f, 10.9336f, 16.875f)
                lineTo(10.9336f, 16.8281f)
                curveTo(10.9336f, 16.3125f, 10.6172f, 15.8086f, 9.9609f, 15.8086f)
                lineTo(2.7539f, 15.8086f)
                curveTo(2.0742f, 15.8086f, 1.9453f, 15.5391f, 2.4023f, 14.9766f)
                lineTo(6.5508f, 9.7383f)
                curveTo(7.125f, 9.0117f, 8.0156f, 8.2617f, 8.8711f, 8.2617f)
                lineTo(10.7344f, 8.2617f)
                lineTo(10.7344f, 6.6094f)
                lineTo(9.0117f, 6.6094f)
                curveTo(6.9258f, 6.6094f, 6.0938f, 7.5938f, 4.7227f, 9.2813f)
                lineTo(0.668f, 14.2969f)
                curveTo(0.1523f, 14.9297f, 0.0f, 15.457f, 0.0f, 16.5234f)
                lineTo(0.0f, 23.4609f)
                curveTo(0.0f, 25.875f, 1.2305f, 27.0938f, 3.6797f, 27.0938f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8164f, 15.668f)
                curveTo(14.0625f, 15.668f, 14.2617f, 15.5977f, 14.4961f, 15.3633f)
                lineTo(18.457f, 11.543f)
                curveTo(18.6328f, 11.3672f, 18.7266f, 11.168f, 18.7266f, 10.9219f)
                curveTo(18.7266f, 10.4414f, 18.3633f, 10.1016f, 17.8828f, 10.1016f)
                curveTo(17.6484f, 10.1016f, 17.4023f, 10.1953f, 17.2383f, 10.3828f)
                lineTo(15.4688f, 12.2695f)
                lineTo(14.6719f, 13.1016f)
                lineTo(14.7539f, 11.3438f)
                lineTo(14.7539f, 0.9023f)
                curveTo(14.7539f, 0.4102f, 14.3203f, 0.0f, 13.8164f, 0.0f)
                curveTo(13.3125f, 0.0f, 12.8906f, 0.4102f, 12.8906f, 0.9023f)
                lineTo(12.8906f, 11.3438f)
                lineTo(12.9609f, 13.1016f)
                lineTo(12.1641f, 12.2695f)
                lineTo(10.3945f, 10.3828f)
                curveTo(10.2188f, 10.1953f, 9.9727f, 10.1016f, 9.7383f, 10.1016f)
                curveTo(9.2578f, 10.1016f, 8.9063f, 10.4414f, 8.9063f, 10.9219f)
                curveTo(8.9063f, 11.168f, 9.0f, 11.3672f, 9.1758f, 11.543f)
                lineTo(13.1367f, 15.3633f)
                curveTo(13.3711f, 15.5977f, 13.582f, 15.668f, 13.8164f, 15.668f)
                close()
            }
        }
        .build()
        return _trayAndArrowDown!!
    }

private var _trayAndArrowDown: ImageVector? = null
