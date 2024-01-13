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

public val CupertinoIcons.Filled.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 16.7695.dp, defaultHeight = 26.5195.dp,
                viewportWidth = 16.7695f, viewportHeight = 26.5195f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.2695f)
                curveTo(0.0f, 16.8633f, 3.0352f, 20.0859f, 7.5f, 20.4609f)
                lineTo(7.5f, 23.1914f)
                lineTo(3.1523f, 23.1914f)
                curveTo(2.6602f, 23.1914f, 2.2617f, 23.5898f, 2.2617f, 24.082f)
                curveTo(2.2617f, 24.5742f, 2.6602f, 24.9609f, 3.1523f, 24.9609f)
                lineTo(13.6172f, 24.9609f)
                curveTo(14.1094f, 24.9609f, 14.5078f, 24.5742f, 14.5078f, 24.082f)
                curveTo(14.5078f, 23.5898f, 14.1094f, 23.1914f, 13.6172f, 23.1914f)
                lineTo(9.2695f, 23.1914f)
                lineTo(9.2695f, 20.4609f)
                curveTo(13.7461f, 20.0859f, 16.7695f, 16.8633f, 16.7695f, 12.2695f)
                lineTo(16.7695f, 9.8906f)
                curveTo(16.7695f, 9.3984f, 16.3828f, 9.0117f, 15.8906f, 9.0117f)
                curveTo(15.3984f, 9.0117f, 15.0f, 9.3984f, 15.0f, 9.8906f)
                lineTo(15.0f, 12.1992f)
                curveTo(15.0f, 16.1953f, 12.3984f, 18.8438f, 8.3906f, 18.8438f)
                curveTo(4.3711f, 18.8438f, 1.7695f, 16.1953f, 1.7695f, 12.1992f)
                lineTo(1.7695f, 9.8906f)
                curveTo(1.7695f, 9.3984f, 1.3828f, 9.0117f, 0.8789f, 9.0117f)
                curveTo(0.3867f, 9.0117f, 0.0f, 9.3984f, 0.0f, 9.8906f)
                close()
                moveTo(8.3906f, 16.3242f)
                curveTo(10.7227f, 16.3242f, 12.293f, 14.5781f, 12.293f, 12.082f)
                lineTo(12.293f, 4.2422f)
                curveTo(12.293f, 1.7344f, 10.7227f, 0.0f, 8.3906f, 0.0f)
                curveTo(6.0469f, 0.0f, 4.4766f, 1.7344f, 4.4766f, 4.2422f)
                lineTo(4.4766f, 12.082f)
                curveTo(4.4766f, 14.5781f, 6.0469f, 16.3242f, 8.3906f, 16.3242f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
