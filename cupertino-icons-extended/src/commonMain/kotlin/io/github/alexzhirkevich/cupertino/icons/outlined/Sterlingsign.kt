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

public val CupertinoIcons.Outlined.Sterlingsign: ImageVector
    get() {
        if (_sterlingsign != null) {
            return _sterlingsign!!
        }
        _sterlingsign = Builder(name = "Sterlingsign", defaultWidth = 16.0078.dp, defaultHeight =
                21.3164.dp, viewportWidth = 16.0078f, viewportHeight = 21.3164f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0078f, 21.2695f)
                lineTo(14.9883f, 21.2695f)
                curveTo(15.5742f, 21.2695f, 16.0078f, 20.8828f, 16.0078f, 20.2969f)
                curveTo(16.0078f, 19.6992f, 15.5742f, 19.3359f, 14.9883f, 19.3359f)
                lineTo(3.7148f, 19.3359f)
                lineTo(3.7148f, 19.2773f)
                curveTo(5.3906f, 18.7148f, 6.6094f, 16.6641f, 6.6094f, 14.1211f)
                curveTo(6.6094f, 11.2031f, 5.3672f, 9.5273f, 5.3672f, 6.5625f)
                curveTo(5.3672f, 3.8438f, 7.2539f, 1.9922f, 10.5234f, 1.9922f)
                curveTo(12.5156f, 1.9922f, 13.418f, 2.5313f, 14.0625f, 2.5313f)
                curveTo(14.6602f, 2.5313f, 14.9414f, 2.1797f, 14.9414f, 1.6641f)
                curveTo(14.9414f, 1.1719f, 14.6484f, 0.832f, 13.9922f, 0.5625f)
                curveTo(12.9609f, 0.1523f, 11.7539f, 0.0f, 10.3477f, 0.0f)
                curveTo(5.8477f, 0.0f, 3.0703f, 2.625f, 3.0703f, 6.7266f)
                curveTo(3.0703f, 9.3633f, 4.4063f, 12.0234f, 4.4063f, 14.2148f)
                curveTo(4.4063f, 16.8633f, 2.8008f, 18.5977f, 0.9258f, 19.125f)
                curveTo(0.2813f, 19.3242f, 0.0f, 19.6641f, 0.0f, 20.2617f)
                curveTo(0.0f, 20.8477f, 0.4219f, 21.2695f, 1.0078f, 21.2695f)
                close()
                moveTo(0.1523f, 10.6406f)
                curveTo(0.1523f, 11.1211f, 0.5391f, 11.4961f, 1.0195f, 11.4961f)
                lineTo(12.4805f, 11.4961f)
                curveTo(12.9609f, 11.4961f, 13.3359f, 11.1211f, 13.3359f, 10.6406f)
                curveTo(13.3359f, 10.1602f, 12.9609f, 9.7852f, 12.4805f, 9.7852f)
                lineTo(1.0195f, 9.7852f)
                curveTo(0.5391f, 9.7852f, 0.1523f, 10.1602f, 0.1523f, 10.6406f)
                close()
            }
        }
        .build()
        return _sterlingsign!!
    }

private var _sterlingsign: ImageVector? = null
