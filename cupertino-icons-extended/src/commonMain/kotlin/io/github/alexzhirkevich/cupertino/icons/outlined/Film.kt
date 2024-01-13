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

public val CupertinoIcons.Outlined.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 27.6328.dp, defaultHeight = 21.6211.dp,
                viewportWidth = 27.6328f, viewportHeight = 21.6211f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.3789f, 21.6211f)
                lineTo(25.2539f, 21.6211f)
                curveTo(26.707f, 21.6211f, 27.6328f, 20.6953f, 27.6328f, 19.2773f)
                lineTo(27.6328f, 2.3672f)
                curveTo(27.6328f, 0.9609f, 26.707f, 0.0352f, 25.2539f, 0.0352f)
                lineTo(2.3789f, 0.0352f)
                curveTo(0.9375f, 0.0352f, 0.0f, 0.9609f, 0.0f, 2.3672f)
                lineTo(0.0f, 19.2773f)
                curveTo(0.0f, 20.6953f, 0.9375f, 21.6211f, 2.3789f, 21.6211f)
                close()
                moveTo(2.3906f, 19.7344f)
                curveTo(2.0156f, 19.7344f, 1.7695f, 19.4766f, 1.7695f, 19.125f)
                lineTo(1.7695f, 17.8008f)
                curveTo(1.7695f, 17.4727f, 2.0039f, 17.2383f, 2.3438f, 17.2383f)
                lineTo(3.8555f, 17.2383f)
                curveTo(4.1953f, 17.2383f, 4.418f, 17.4727f, 4.418f, 17.8008f)
                lineTo(4.418f, 19.1602f)
                curveTo(4.418f, 19.4883f, 4.1953f, 19.7344f, 3.8555f, 19.7344f)
                close()
                moveTo(2.3438f, 15.8555f)
                curveTo(2.0039f, 15.8555f, 1.7695f, 15.5977f, 1.7695f, 15.293f)
                lineTo(1.7695f, 13.957f)
                curveTo(1.7695f, 13.6055f, 1.9922f, 13.3828f, 2.3438f, 13.3828f)
                lineTo(3.8555f, 13.3828f)
                curveTo(4.1953f, 13.3828f, 4.418f, 13.6055f, 4.418f, 13.957f)
                lineTo(4.418f, 15.293f)
                curveTo(4.418f, 15.5977f, 4.1953f, 15.8555f, 3.8555f, 15.8555f)
                close()
                moveTo(2.3438f, 12.0586f)
                curveTo(2.0039f, 12.0586f, 1.7695f, 11.8125f, 1.7695f, 11.5078f)
                lineTo(1.7695f, 10.1719f)
                curveTo(1.7695f, 9.8203f, 1.9922f, 9.5977f, 2.3438f, 9.5977f)
                lineTo(3.8555f, 9.5977f)
                curveTo(4.1953f, 9.5977f, 4.418f, 9.8203f, 4.418f, 10.1719f)
                lineTo(4.418f, 11.5078f)
                curveTo(4.418f, 11.8125f, 4.1953f, 12.0586f, 3.8555f, 12.0586f)
                close()
                moveTo(2.3438f, 8.2969f)
                curveTo(2.0039f, 8.2969f, 1.7695f, 8.0391f, 1.7695f, 7.7461f)
                lineTo(1.7695f, 6.3984f)
                curveTo(1.7695f, 6.0586f, 1.9922f, 5.8242f, 2.3438f, 5.8242f)
                lineTo(3.8555f, 5.8242f)
                curveTo(4.1953f, 5.8242f, 4.418f, 6.0586f, 4.418f, 6.3984f)
                lineTo(4.418f, 7.7461f)
                curveTo(4.418f, 8.0391f, 4.1953f, 8.2969f, 3.8555f, 8.2969f)
                close()
                moveTo(2.3438f, 4.418f)
                curveTo(2.0039f, 4.418f, 1.7695f, 4.1719f, 1.7695f, 3.8672f)
                lineTo(1.7695f, 2.543f)
                curveTo(1.7695f, 2.168f, 2.0156f, 1.9219f, 2.3906f, 1.9219f)
                lineTo(3.8555f, 1.9219f)
                curveTo(4.1953f, 1.9219f, 4.418f, 2.1563f, 4.418f, 2.4961f)
                lineTo(4.418f, 3.8672f)
                curveTo(4.418f, 4.1719f, 4.1953f, 4.418f, 3.8555f, 4.418f)
                close()
                moveTo(6.6328f, 19.7344f)
                curveTo(6.2813f, 19.7344f, 6.0703f, 19.5234f, 6.0703f, 19.1719f)
                lineTo(6.0703f, 12.3398f)
                curveTo(6.0703f, 12.0f, 6.2813f, 11.7891f, 6.6328f, 11.7891f)
                lineTo(21.0117f, 11.7891f)
                curveTo(21.3516f, 11.7891f, 21.5625f, 12.0f, 21.5625f, 12.3398f)
                lineTo(21.5625f, 19.1719f)
                curveTo(21.5625f, 19.5234f, 21.3516f, 19.7344f, 21.0117f, 19.7344f)
                close()
                moveTo(6.6328f, 9.8906f)
                curveTo(6.2813f, 9.8906f, 6.0703f, 9.6914f, 6.0703f, 9.3398f)
                lineTo(6.0703f, 2.4609f)
                curveTo(6.0703f, 2.1094f, 6.2813f, 1.9219f, 6.6328f, 1.9219f)
                lineTo(21.0117f, 1.9219f)
                curveTo(21.3516f, 1.9219f, 21.5625f, 2.1094f, 21.5625f, 2.4609f)
                lineTo(21.5625f, 9.3398f)
                curveTo(21.5625f, 9.6914f, 21.3516f, 9.8906f, 21.0117f, 9.8906f)
                close()
                moveTo(23.7773f, 19.7344f)
                curveTo(23.4375f, 19.7344f, 23.2148f, 19.4883f, 23.2148f, 19.1602f)
                lineTo(23.2148f, 17.8008f)
                curveTo(23.2148f, 17.4727f, 23.4375f, 17.2383f, 23.7773f, 17.2383f)
                lineTo(25.2891f, 17.2383f)
                curveTo(25.6406f, 17.2383f, 25.8633f, 17.4727f, 25.8633f, 17.8008f)
                lineTo(25.8633f, 19.125f)
                curveTo(25.8633f, 19.4766f, 25.6289f, 19.7344f, 25.2422f, 19.7344f)
                close()
                moveTo(23.7773f, 15.8555f)
                curveTo(23.4375f, 15.8555f, 23.2148f, 15.5977f, 23.2148f, 15.293f)
                lineTo(23.2148f, 13.957f)
                curveTo(23.2148f, 13.6055f, 23.4375f, 13.3828f, 23.7773f, 13.3828f)
                lineTo(25.2891f, 13.3828f)
                curveTo(25.6406f, 13.3828f, 25.8633f, 13.6055f, 25.8633f, 13.957f)
                lineTo(25.8633f, 15.293f)
                curveTo(25.8633f, 15.5977f, 25.6406f, 15.8555f, 25.2891f, 15.8555f)
                close()
                moveTo(23.7773f, 12.0586f)
                curveTo(23.4375f, 12.0586f, 23.2148f, 11.8125f, 23.2148f, 11.5078f)
                lineTo(23.2148f, 10.1719f)
                curveTo(23.2148f, 9.8203f, 23.4375f, 9.5977f, 23.7773f, 9.5977f)
                lineTo(25.2891f, 9.5977f)
                curveTo(25.6406f, 9.5977f, 25.8633f, 9.8203f, 25.8633f, 10.1719f)
                lineTo(25.8633f, 11.5078f)
                curveTo(25.8633f, 11.8125f, 25.6406f, 12.0586f, 25.2891f, 12.0586f)
                close()
                moveTo(23.7773f, 8.2969f)
                curveTo(23.4375f, 8.2969f, 23.2148f, 8.0391f, 23.2148f, 7.7461f)
                lineTo(23.2148f, 6.3984f)
                curveTo(23.2148f, 6.0586f, 23.4375f, 5.8242f, 23.7773f, 5.8242f)
                lineTo(25.2891f, 5.8242f)
                curveTo(25.6406f, 5.8242f, 25.8633f, 6.0586f, 25.8633f, 6.3984f)
                lineTo(25.8633f, 7.7461f)
                curveTo(25.8633f, 8.0391f, 25.6406f, 8.2969f, 25.2891f, 8.2969f)
                close()
                moveTo(23.7773f, 4.418f)
                curveTo(23.4375f, 4.418f, 23.2148f, 4.1719f, 23.2148f, 3.8672f)
                lineTo(23.2148f, 2.4961f)
                curveTo(23.2148f, 2.1563f, 23.4375f, 1.9219f, 23.7773f, 1.9219f)
                lineTo(25.2422f, 1.9219f)
                curveTo(25.6289f, 1.9219f, 25.8633f, 2.168f, 25.8633f, 2.543f)
                lineTo(25.8633f, 3.8672f)
                curveTo(25.8633f, 4.1719f, 25.6406f, 4.418f, 25.2891f, 4.418f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
