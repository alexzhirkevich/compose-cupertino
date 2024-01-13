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

public val CupertinoIcons.Outlined.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 25.1484.dp, defaultHeight = 25.1836.dp,
                viewportWidth = 25.1484f, viewportHeight = 25.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.4844f)
                curveTo(0.0f, 16.6875f, 1.0664f, 17.7656f, 3.2344f, 17.7656f)
                lineTo(7.3945f, 17.7656f)
                lineTo(7.3945f, 21.9258f)
                curveTo(7.3945f, 24.0938f, 8.4727f, 25.1602f, 10.6758f, 25.1602f)
                lineTo(14.4727f, 25.1602f)
                curveTo(16.6758f, 25.1602f, 17.7539f, 24.0938f, 17.7539f, 21.9258f)
                lineTo(17.7539f, 17.7656f)
                lineTo(21.9141f, 17.7656f)
                curveTo(24.082f, 17.7656f, 25.1484f, 16.6875f, 25.1484f, 14.4844f)
                lineTo(25.1484f, 10.6875f)
                curveTo(25.1484f, 8.4844f, 24.082f, 7.4063f, 21.9141f, 7.4063f)
                lineTo(17.7539f, 7.4063f)
                lineTo(17.7539f, 3.2344f)
                curveTo(17.7539f, 1.0664f, 16.6758f, 0.0f, 14.4727f, 0.0f)
                lineTo(10.6758f, 0.0f)
                curveTo(8.4727f, 0.0f, 7.3945f, 1.0664f, 7.3945f, 3.2344f)
                lineTo(7.3945f, 7.4063f)
                lineTo(3.2344f, 7.4063f)
                curveTo(1.0664f, 7.4063f, 0.0f, 8.4844f, 0.0f, 10.6875f)
                close()
                moveTo(1.8867f, 14.4492f)
                lineTo(1.8867f, 10.7227f)
                curveTo(1.8867f, 9.7734f, 2.3789f, 9.293f, 3.3398f, 9.293f)
                lineTo(9.2813f, 9.293f)
                lineTo(9.2813f, 3.3398f)
                curveTo(9.2813f, 2.3789f, 9.7617f, 1.8867f, 10.7109f, 1.8867f)
                lineTo(14.4375f, 1.8867f)
                curveTo(15.3867f, 1.8867f, 15.8672f, 2.3789f, 15.8672f, 3.3398f)
                lineTo(15.8672f, 9.293f)
                lineTo(21.8086f, 9.293f)
                curveTo(22.7695f, 9.293f, 23.2617f, 9.7734f, 23.2617f, 10.7227f)
                lineTo(23.2617f, 14.4492f)
                curveTo(23.2617f, 15.3984f, 22.7695f, 15.8789f, 21.8086f, 15.8789f)
                lineTo(15.8672f, 15.8789f)
                lineTo(15.8672f, 21.832f)
                curveTo(15.8672f, 22.793f, 15.3867f, 23.2734f, 14.4375f, 23.2734f)
                lineTo(10.7109f, 23.2734f)
                curveTo(9.7617f, 23.2734f, 9.2813f, 22.793f, 9.2813f, 21.832f)
                lineTo(9.2813f, 15.8789f)
                lineTo(3.3398f, 15.8789f)
                curveTo(2.3789f, 15.8789f, 1.8867f, 15.3984f, 1.8867f, 14.4492f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
