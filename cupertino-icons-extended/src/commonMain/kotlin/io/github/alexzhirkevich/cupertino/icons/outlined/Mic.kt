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

public val CupertinoIcons.Outlined.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 16.7695.dp, defaultHeight = 26.7539.dp,
                viewportWidth = 16.7695f, viewportHeight = 26.7539f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.3867f)
                curveTo(0.0f, 16.9805f, 3.0352f, 20.2031f, 7.5f, 20.5781f)
                lineTo(7.5f, 23.3086f)
                lineTo(3.1523f, 23.3086f)
                curveTo(2.6602f, 23.3086f, 2.2617f, 23.707f, 2.2617f, 24.1992f)
                curveTo(2.2617f, 24.6914f, 2.6602f, 25.0781f, 3.1523f, 25.0781f)
                lineTo(13.6172f, 25.0781f)
                curveTo(14.1094f, 25.0781f, 14.5078f, 24.6914f, 14.5078f, 24.1992f)
                curveTo(14.5078f, 23.707f, 14.1094f, 23.3086f, 13.6172f, 23.3086f)
                lineTo(9.2695f, 23.3086f)
                lineTo(9.2695f, 20.5781f)
                curveTo(13.7461f, 20.2031f, 16.7695f, 16.9805f, 16.7695f, 12.3867f)
                lineTo(16.7695f, 10.0078f)
                curveTo(16.7695f, 9.5156f, 16.3828f, 9.1289f, 15.8906f, 9.1289f)
                curveTo(15.3984f, 9.1289f, 15.0f, 9.5156f, 15.0f, 10.0078f)
                lineTo(15.0f, 12.3164f)
                curveTo(15.0f, 16.3125f, 12.3984f, 18.9609f, 8.3906f, 18.9609f)
                curveTo(4.3711f, 18.9609f, 1.7695f, 16.3125f, 1.7695f, 12.3164f)
                lineTo(1.7695f, 10.0078f)
                curveTo(1.7695f, 9.5156f, 1.3828f, 9.1289f, 0.8789f, 9.1289f)
                curveTo(0.3867f, 9.1289f, 0.0f, 9.5156f, 0.0f, 10.0078f)
                close()
                moveTo(4.125f, 11.9648f)
                curveTo(4.125f, 14.6602f, 5.8594f, 16.5586f, 8.3906f, 16.5586f)
                curveTo(10.9102f, 16.5586f, 12.6445f, 14.6602f, 12.6445f, 11.9648f)
                lineTo(12.6445f, 4.5938f)
                curveTo(12.6445f, 1.8867f, 10.9102f, 0.0f, 8.3906f, 0.0f)
                curveTo(5.8594f, 0.0f, 4.125f, 1.8867f, 4.125f, 4.5938f)
                close()
                moveTo(5.8945f, 11.9648f)
                lineTo(5.8945f, 4.5938f)
                curveTo(5.8945f, 2.8594f, 6.8906f, 1.7461f, 8.3906f, 1.7461f)
                curveTo(9.8906f, 1.7461f, 10.875f, 2.8594f, 10.875f, 4.5938f)
                lineTo(10.875f, 11.9648f)
                curveTo(10.875f, 13.6992f, 9.8906f, 14.8125f, 8.3906f, 14.8125f)
                curveTo(6.8906f, 14.8125f, 5.8945f, 13.6992f, 5.8945f, 11.9648f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
