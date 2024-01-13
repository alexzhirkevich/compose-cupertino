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

public val CupertinoIcons.Filled.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 22.6992.dp, defaultHeight = 28.4414.dp,
                viewportWidth = 22.6992f, viewportHeight = 28.4414f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.082f, 5.0273f)
                lineTo(8.2031f, 5.0273f)
                lineTo(8.2031f, 2.9766f)
                curveTo(8.2031f, 2.3906f, 8.6133f, 1.9922f, 9.2461f, 1.9922f)
                lineTo(13.4414f, 1.9922f)
                curveTo(14.0742f, 1.9922f, 14.4844f, 2.3906f, 14.4844f, 2.9766f)
                lineTo(14.4844f, 5.0273f)
                lineTo(16.5938f, 5.0273f)
                lineTo(16.5938f, 2.8594f)
                curveTo(16.5938f, 1.0898f, 15.4336f, 0.0f, 13.5586f, 0.0f)
                lineTo(9.1172f, 0.0f)
                curveTo(7.2422f, 0.0f, 6.082f, 1.0898f, 6.082f, 2.8594f)
                close()
                moveTo(0.8789f, 6.4219f)
                lineTo(21.8203f, 6.4219f)
                curveTo(22.3008f, 6.4219f, 22.6992f, 6.0117f, 22.6992f, 5.5313f)
                curveTo(22.6992f, 5.0508f, 22.3008f, 4.6523f, 21.8203f, 4.6523f)
                lineTo(0.8789f, 4.6523f)
                curveTo(0.4102f, 4.6523f, 0.0f, 5.0508f, 0.0f, 5.5313f)
                curveTo(0.0f, 6.0234f, 0.4102f, 6.4219f, 0.8789f, 6.4219f)
                close()
                moveTo(20.0742f, 6.1758f)
                lineTo(2.6367f, 6.1758f)
                lineTo(3.3984f, 23.543f)
                curveTo(3.457f, 24.9961f, 4.3359f, 25.8047f, 5.7773f, 25.8047f)
                lineTo(16.9219f, 25.8047f)
                curveTo(18.375f, 25.8047f, 19.2539f, 24.9961f, 19.3125f, 23.543f)
                close()
                moveTo(7.6406f, 22.4531f)
                curveTo(7.2188f, 22.4531f, 6.9258f, 22.1836f, 6.9141f, 21.7617f)
                lineTo(6.5508f, 9.0f)
                curveTo(6.5391f, 8.5898f, 6.832f, 8.3086f, 7.2891f, 8.3086f)
                curveTo(7.6992f, 8.3086f, 8.0039f, 8.5781f, 8.0156f, 8.9883f)
                lineTo(8.3672f, 21.7617f)
                curveTo(8.3789f, 22.1719f, 8.0859f, 22.4531f, 7.6406f, 22.4531f)
                close()
                moveTo(11.3555f, 22.4531f)
                curveTo(10.9102f, 22.4531f, 10.5938f, 22.1719f, 10.5938f, 21.7617f)
                lineTo(10.5938f, 9.0f)
                curveTo(10.5938f, 8.5898f, 10.9102f, 8.3086f, 11.3555f, 8.3086f)
                curveTo(11.8008f, 8.3086f, 12.1055f, 8.5898f, 12.1055f, 9.0f)
                lineTo(12.1055f, 21.7617f)
                curveTo(12.1055f, 22.1719f, 11.8008f, 22.4531f, 11.3555f, 22.4531f)
                close()
                moveTo(15.0586f, 22.4531f)
                curveTo(14.6133f, 22.4531f, 14.3203f, 22.1719f, 14.332f, 21.7617f)
                lineTo(14.6836f, 9.0f)
                curveTo(14.6953f, 8.5781f, 15.0f, 8.3086f, 15.4102f, 8.3086f)
                curveTo(15.8555f, 8.3086f, 16.1602f, 8.5898f, 16.1484f, 9.0f)
                lineTo(15.7852f, 21.7617f)
                curveTo(15.7734f, 22.1836f, 15.4805f, 22.4531f, 15.0586f, 22.4531f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
