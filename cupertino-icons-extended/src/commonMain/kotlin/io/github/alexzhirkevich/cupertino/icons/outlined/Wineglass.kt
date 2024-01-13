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

public val CupertinoIcons.Outlined.Wineglass: ImageVector
    get() {
        if (_wineglass != null) {
            return _wineglass!!
        }
        _wineglass = Builder(name = "Wineglass", defaultWidth = 17.1328.dp, defaultHeight =
                27.9258.dp, viewportWidth = 17.1328f, viewportHeight = 27.9258f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5547f, 17.2266f)
                curveTo(13.6992f, 17.2266f, 17.1328f, 14.168f, 17.1328f, 9.5273f)
                curveTo(17.1328f, 7.1133f, 16.1133f, 3.9375f, 14.6367f, 1.6758f)
                curveTo(13.9453f, 0.5977f, 11.707f, 0.0f, 8.5664f, 0.0f)
                curveTo(5.4023f, 0.0f, 3.1758f, 0.5977f, 2.4727f, 1.6758f)
                curveTo(0.9961f, 3.9375f, 0.0f, 7.1133f, 0.0f, 9.5273f)
                curveTo(0.0f, 14.168f, 3.4102f, 17.2266f, 8.5547f, 17.2266f)
                close()
                moveTo(8.5547f, 15.457f)
                curveTo(4.3711f, 15.457f, 1.7695f, 13.1719f, 1.7695f, 9.5273f)
                curveTo(1.7695f, 7.7813f, 2.3789f, 5.5195f, 3.3867f, 3.6211f)
                curveTo(4.4063f, 4.1719f, 6.2578f, 4.4883f, 8.5664f, 4.4883f)
                curveTo(10.8516f, 4.4883f, 12.7031f, 4.1719f, 13.7227f, 3.6211f)
                curveTo(14.7422f, 5.5195f, 15.3633f, 7.7813f, 15.3633f, 9.5273f)
                curveTo(15.3633f, 13.1719f, 12.7383f, 15.457f, 8.5547f, 15.457f)
                close()
                moveTo(8.5664f, 2.8359f)
                curveTo(6.2109f, 2.8359f, 4.1016f, 2.5078f, 4.1016f, 2.2383f)
                curveTo(4.1016f, 1.9922f, 6.2461f, 1.6641f, 8.5664f, 1.6641f)
                curveTo(10.875f, 1.6641f, 13.0312f, 1.9922f, 13.0312f, 2.2383f)
                curveTo(13.0312f, 2.5078f, 10.8984f, 2.8359f, 8.5664f, 2.8359f)
                close()
                moveTo(8.5547f, 25.0781f)
                curveTo(9.0352f, 25.0781f, 9.4453f, 24.668f, 9.4453f, 24.1992f)
                lineTo(9.4453f, 16.3008f)
                lineTo(7.6875f, 16.3008f)
                lineTo(7.6875f, 24.1992f)
                curveTo(7.6875f, 24.6797f, 8.0859f, 25.0781f, 8.5547f, 25.0781f)
                close()
                moveTo(8.5547f, 27.9141f)
                curveTo(12.7969f, 27.9023f, 15.3633f, 26.8594f, 15.3633f, 25.0547f)
                curveTo(15.3633f, 23.2617f, 12.7969f, 22.207f, 8.5547f, 22.207f)
                curveTo(4.3242f, 22.207f, 1.7695f, 23.2617f, 1.7695f, 25.0547f)
                curveTo(1.7695f, 26.8594f, 4.3125f, 27.9023f, 8.5547f, 27.9141f)
                close()
                moveTo(8.5547f, 26.1914f)
                curveTo(5.5664f, 26.1914f, 3.6563f, 25.7109f, 3.6563f, 25.0547f)
                curveTo(3.6563f, 24.4102f, 5.5781f, 23.918f, 8.5547f, 23.918f)
                curveTo(11.543f, 23.918f, 13.4766f, 24.4102f, 13.4766f, 25.0547f)
                curveTo(13.4766f, 25.7109f, 11.543f, 26.1914f, 8.5547f, 26.1914f)
                close()
            }
        }
        .build()
        return _wineglass!!
    }

private var _wineglass: ImageVector? = null
