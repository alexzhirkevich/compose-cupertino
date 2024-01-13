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

public val CupertinoIcons.Outlined.PaperclipCircle: ImageVector
    get() {
        if (_paperclipCircle != null) {
            return _paperclipCircle!!
        }
        _paperclipCircle = Builder(name = "PaperclipCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7617f, 17.8477f)
                curveTo(8.4258f, 19.4766f, 10.6992f, 19.418f, 12.3047f, 17.8242f)
                lineTo(17.0977f, 13.043f)
                curveTo(17.332f, 12.8086f, 17.3555f, 12.3516f, 17.0977f, 12.1172f)
                curveTo(16.8516f, 11.8711f, 16.4062f, 11.8711f, 16.1602f, 12.1289f)
                lineTo(11.4258f, 16.8516f)
                curveTo(10.3359f, 17.9531f, 8.7891f, 17.9531f, 7.7344f, 16.9102f)
                curveTo(6.6445f, 15.8438f, 6.6797f, 14.3086f, 7.7695f, 13.1953f)
                lineTo(14.2266f, 6.7383f)
                curveTo(14.918f, 6.0469f, 15.8906f, 6.0117f, 16.5117f, 6.6211f)
                curveTo(17.1445f, 7.2539f, 17.0859f, 8.1914f, 16.3828f, 8.8945f)
                lineTo(10.0781f, 15.1992f)
                curveTo(9.8672f, 15.4336f, 9.6094f, 15.4219f, 9.3984f, 15.2344f)
                curveTo(9.1758f, 15.0469f, 9.1875f, 14.7539f, 9.4102f, 14.543f)
                lineTo(13.8164f, 10.1367f)
                curveTo(14.0859f, 9.8672f, 14.1094f, 9.4922f, 13.8398f, 9.2344f)
                curveTo(13.5703f, 8.9648f, 13.1953f, 8.9766f, 12.9258f, 9.2461f)
                lineTo(8.5195f, 13.6641f)
                curveTo(7.8047f, 14.3789f, 7.7695f, 15.4922f, 8.4492f, 16.1836f)
                curveTo(9.1406f, 16.8867f, 10.207f, 16.8633f, 10.9453f, 16.125f)
                lineTo(17.2852f, 9.7852f)
                curveTo(18.5273f, 8.543f, 18.5742f, 6.8555f, 17.4141f, 5.6953f)
                curveTo(16.2305f, 4.5352f, 14.543f, 4.5586f, 13.3008f, 5.8008f)
                lineTo(6.7969f, 12.293f)
                curveTo(5.1914f, 13.8984f, 5.1914f, 16.3008f, 6.7617f, 17.8477f)
                close()
            }
        }
        .build()
        return _paperclipCircle!!
    }

private var _paperclipCircle: ImageVector? = null
