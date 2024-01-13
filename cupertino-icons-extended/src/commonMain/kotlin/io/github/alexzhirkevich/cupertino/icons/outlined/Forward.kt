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

public val CupertinoIcons.Outlined.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 32.2734.dp, defaultHeight = 18.4336.dp,
                viewportWidth = 32.2734f, viewportHeight = 18.4336f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6875f, 18.4336f)
                curveTo(2.168f, 18.4336f, 2.5664f, 18.2812f, 3.0352f, 18.0f)
                lineTo(14.9766f, 10.9688f)
                curveTo(15.8086f, 10.4766f, 16.1719f, 9.9023f, 16.1719f, 9.2227f)
                curveTo(16.1719f, 8.5547f, 15.8086f, 7.9805f, 14.9766f, 7.4883f)
                lineTo(3.0352f, 0.457f)
                curveTo(2.5547f, 0.1758f, 2.168f, 0.0234f, 1.6875f, 0.0234f)
                curveTo(0.7734f, 0.0234f, 0.0f, 0.7266f, 0.0f, 2.0273f)
                lineTo(0.0f, 16.4297f)
                curveTo(0.0f, 17.7305f, 0.7734f, 18.4336f, 1.6875f, 18.4336f)
                close()
                moveTo(2.2031f, 16.2656f)
                curveTo(2.0273f, 16.2656f, 1.8867f, 16.1602f, 1.8867f, 15.9141f)
                lineTo(1.8867f, 2.543f)
                curveTo(1.8867f, 2.2969f, 2.0273f, 2.1914f, 2.2031f, 2.1914f)
                curveTo(2.2852f, 2.1914f, 2.3672f, 2.2266f, 2.4844f, 2.2852f)
                lineTo(13.6289f, 8.8945f)
                curveTo(13.793f, 8.9883f, 13.8867f, 9.0703f, 13.8867f, 9.2227f)
                curveTo(13.8867f, 9.3867f, 13.793f, 9.4688f, 13.6289f, 9.5625f)
                lineTo(2.4844f, 16.1719f)
                curveTo(2.3789f, 16.2422f, 2.2852f, 16.2656f, 2.2031f, 16.2656f)
                close()
                moveTo(17.7891f, 18.4336f)
                curveTo(18.2695f, 18.4336f, 18.668f, 18.2812f, 19.1367f, 18.0f)
                lineTo(31.0898f, 10.9688f)
                curveTo(31.9102f, 10.4766f, 32.2734f, 9.9023f, 32.2734f, 9.2227f)
                curveTo(32.2734f, 8.5547f, 31.9102f, 7.9805f, 31.0898f, 7.4883f)
                lineTo(19.1367f, 0.457f)
                curveTo(18.668f, 0.1758f, 18.2695f, 0.0234f, 17.7891f, 0.0234f)
                curveTo(16.875f, 0.0234f, 16.1016f, 0.7266f, 16.1016f, 2.0273f)
                lineTo(16.1016f, 16.4297f)
                curveTo(16.1016f, 17.7305f, 16.875f, 18.4336f, 17.7891f, 18.4336f)
                close()
                moveTo(18.3047f, 16.2656f)
                curveTo(18.1289f, 16.2656f, 17.9883f, 16.1602f, 17.9883f, 15.9141f)
                lineTo(17.9883f, 2.543f)
                curveTo(17.9883f, 2.2969f, 18.1289f, 2.1914f, 18.3047f, 2.1914f)
                curveTo(18.3867f, 2.1914f, 18.4688f, 2.2266f, 18.5859f, 2.2852f)
                lineTo(29.7305f, 8.8945f)
                curveTo(29.8945f, 8.9883f, 29.9883f, 9.0703f, 29.9883f, 9.2227f)
                curveTo(29.9883f, 9.3867f, 29.8945f, 9.4688f, 29.7305f, 9.5625f)
                lineTo(18.5859f, 16.1719f)
                curveTo(18.4805f, 16.2422f, 18.3867f, 16.2656f, 18.3047f, 16.2656f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
