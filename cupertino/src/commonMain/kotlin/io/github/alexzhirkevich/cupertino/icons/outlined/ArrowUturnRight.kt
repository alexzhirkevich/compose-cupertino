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

public val CupertinoIcons.Outlined.ArrowUturnRight: ImageVector
    get() {
        if (_arrowUturnRight != null) {
            return _arrowUturnRight!!
        }
        _arrowUturnRight = Builder(name = "ArrowUturnRight", defaultWidth = 22.1484.dp,
                defaultHeight = 24.2227.dp, viewportWidth = 22.1484f, viewportHeight =
                24.2227f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.7461f)
                curveTo(0.0f, 21.2344f, 2.9414f, 24.2227f, 8.1914f, 24.2227f)
                lineTo(10.8984f, 24.2227f)
                curveTo(11.543f, 24.2227f, 11.9648f, 23.7539f, 11.9648f, 23.1797f)
                curveTo(11.9648f, 22.6055f, 11.543f, 22.1367f, 10.8984f, 22.1367f)
                lineTo(8.2031f, 22.1367f)
                curveTo(4.207f, 22.1367f, 2.0859f, 19.793f, 2.0859f, 16.6289f)
                curveTo(2.0859f, 13.4766f, 4.207f, 11.2734f, 8.2031f, 11.2734f)
                lineTo(16.2422f, 11.2734f)
                lineTo(19.8867f, 11.1094f)
                lineTo(19.6758f, 10.5703f)
                lineTo(16.7695f, 13.0547f)
                lineTo(13.3945f, 16.3477f)
                curveTo(13.207f, 16.5352f, 13.1133f, 16.7578f, 13.1133f, 17.0625f)
                curveTo(13.1133f, 17.6719f, 13.5234f, 18.0938f, 14.1445f, 18.0938f)
                curveTo(14.4023f, 18.0938f, 14.707f, 17.9766f, 14.9062f, 17.7656f)
                lineTo(21.7969f, 11.0039f)
                curveTo(22.0312f, 10.7812f, 22.1484f, 10.5117f, 22.1484f, 10.2305f)
                curveTo(22.1484f, 9.9375f, 22.0312f, 9.668f, 21.7969f, 9.4453f)
                lineTo(14.9062f, 2.6836f)
                curveTo(14.707f, 2.4844f, 14.4023f, 2.3555f, 14.1445f, 2.3555f)
                curveTo(13.5234f, 2.3555f, 13.1133f, 2.7773f, 13.1133f, 3.3867f)
                curveTo(13.1133f, 3.6914f, 13.207f, 3.9141f, 13.3945f, 4.1016f)
                lineTo(16.7695f, 7.4063f)
                lineTo(19.6758f, 9.8789f)
                lineTo(19.8867f, 9.3398f)
                lineTo(16.2422f, 9.1758f)
                lineTo(8.3789f, 9.1758f)
                curveTo(3.0234f, 9.1758f, 0.0f, 12.2695f, 0.0f, 16.7461f)
                close()
            }
        }
        .build()
        return _arrowUturnRight!!
    }

private var _arrowUturnRight: ImageVector? = null
