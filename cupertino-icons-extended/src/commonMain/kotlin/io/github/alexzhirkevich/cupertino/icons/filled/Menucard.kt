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

public val CupertinoIcons.Filled.Menucard: ImageVector
    get() {
        if (_menucard != null) {
            return _menucard!!
        }
        _menucard = Builder(name = "Menucard", defaultWidth = 18.7266.dp, defaultHeight =
                26.6004.dp, viewportWidth = 18.7266f, viewportHeight = 26.6004f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2148f, 24.2631f)
                lineTo(15.0352f, 26.5248f)
                curveTo(17.332f, 26.935f, 18.7266f, 25.6576f, 18.7266f, 23.1381f)
                lineTo(18.7266f, 8.9936f)
                curveTo(18.7266f, 6.6967f, 17.5547f, 5.8646f, 15.2695f, 5.4662f)
                lineTo(2.8242f, 3.2631f)
                curveTo(1.1133f, 2.9701f, 0.0f, 3.8959f, 0.0f, 5.5834f)
                lineTo(0.0f, 21.7084f)
                curveTo(0.0f, 23.1615f, 0.7383f, 24.0053f, 2.2148f, 24.2631f)
                close()
                moveTo(4.3242f, 9.767f)
                curveTo(3.9258f, 9.6967f, 3.6914f, 9.392f, 3.6914f, 8.9701f)
                curveTo(3.6914f, 8.4662f, 4.0781f, 8.1381f, 4.6406f, 8.2318f)
                lineTo(13.8984f, 9.849f)
                curveTo(14.3203f, 9.9428f, 14.5547f, 10.1771f, 14.5547f, 10.6459f)
                curveTo(14.5547f, 11.1498f, 14.2031f, 11.5014f, 13.6289f, 11.4076f)
                close()
                moveTo(4.3242f, 14.4779f)
                curveTo(3.9258f, 14.4076f, 3.6914f, 14.1029f, 3.6914f, 13.6811f)
                curveTo(3.6914f, 13.1889f, 4.0781f, 12.8607f, 4.6406f, 12.9545f)
                lineTo(13.8984f, 14.5717f)
                curveTo(14.3203f, 14.6537f, 14.5547f, 14.8998f, 14.5547f, 15.3568f)
                curveTo(14.5547f, 15.8725f, 14.2031f, 16.224f, 13.6289f, 16.1303f)
                close()
                moveTo(5.4141f, 2.1029f)
                lineTo(15.5508f, 3.8842f)
                curveTo(16.5469f, 4.0717f, 17.3789f, 4.3412f, 18.0586f, 4.7162f)
                lineTo(18.0586f, 3.8022f)
                curveTo(18.0586f, 1.3412f, 16.4062f, 0.1576f, 13.6289f, 0.6498f)
                close()
            }
        }
        .build()
        return _menucard!!
    }

private var _menucard: ImageVector? = null
