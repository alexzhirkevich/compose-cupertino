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

public val CupertinoIcons.Outlined.ArrowDownRightAndArrowUpLeft: ImageVector
    get() {
        if (_arrowDownRightAndArrowUpLeft != null) {
            return _arrowDownRightAndArrowUpLeft!!
        }
        _arrowDownRightAndArrowUpLeft = Builder(name = "ArrowDownRightAndArrowUpLeft", defaultWidth
                = 22.8398.dp, defaultHeight = 23.4961.dp, viewportWidth = 22.8398f, viewportHeight =
                23.4961f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1094f, 10.6172f)
                lineTo(8.6133f, 10.6172f)
                curveTo(9.8086f, 10.6172f, 10.5f, 9.9141f, 10.5f, 8.7188f)
                lineTo(10.5f, 2.2266f)
                curveTo(10.5f, 1.6172f, 10.043f, 1.1367f, 9.4219f, 1.1367f)
                curveTo(8.8008f, 1.1367f, 8.3555f, 1.6055f, 8.3555f, 2.2266f)
                lineTo(8.3555f, 3.2109f)
                lineTo(8.6016f, 7.3008f)
                lineTo(5.5078f, 4.0547f)
                lineTo(1.9102f, 0.4219f)
                curveTo(1.7109f, 0.2109f, 1.4414f, 0.1055f, 1.1602f, 0.1055f)
                curveTo(0.4922f, 0.1055f, 0.0f, 0.5508f, 0.0f, 1.207f)
                curveTo(0.0f, 1.5117f, 0.1172f, 1.8047f, 0.3281f, 2.0156f)
                lineTo(3.9375f, 5.625f)
                lineTo(7.1836f, 8.707f)
                lineTo(3.0938f, 8.4727f)
                lineTo(2.1094f, 8.4727f)
                curveTo(1.4883f, 8.4727f, 1.0078f, 8.9063f, 1.0078f, 9.5391f)
                curveTo(1.0078f, 10.1602f, 1.4766f, 10.6172f, 2.1094f, 10.6172f)
                close()
                moveTo(13.3477f, 22.5117f)
                curveTo(13.9688f, 22.5117f, 14.4141f, 22.0547f, 14.4141f, 21.4219f)
                lineTo(14.4141f, 20.3086f)
                lineTo(14.168f, 16.2305f)
                lineTo(17.2617f, 19.4766f)
                lineTo(20.9414f, 23.1797f)
                curveTo(21.1406f, 23.3906f, 21.3984f, 23.4961f, 21.6914f, 23.4961f)
                curveTo(22.3477f, 23.4961f, 22.8398f, 23.0508f, 22.8398f, 22.3945f)
                curveTo(22.8398f, 22.0898f, 22.7344f, 21.7969f, 22.5234f, 21.5859f)
                lineTo(18.832f, 17.8945f)
                lineTo(15.5742f, 14.8125f)
                lineTo(19.6758f, 15.0469f)
                lineTo(20.7891f, 15.0469f)
                curveTo(21.4102f, 15.0469f, 21.8906f, 14.6133f, 21.8906f, 13.9922f)
                curveTo(21.8906f, 13.3594f, 21.4219f, 12.9141f, 20.7891f, 12.9141f)
                lineTo(14.1562f, 12.9141f)
                curveTo(12.9609f, 12.9141f, 12.2695f, 13.6055f, 12.2695f, 14.8008f)
                lineTo(12.2695f, 21.4219f)
                curveTo(12.2695f, 22.043f, 12.7148f, 22.5117f, 13.3477f, 22.5117f)
                close()
            }
        }
        .build()
        return _arrowDownRightAndArrowUpLeft!!
    }

private var _arrowDownRightAndArrowUpLeft: ImageVector? = null
