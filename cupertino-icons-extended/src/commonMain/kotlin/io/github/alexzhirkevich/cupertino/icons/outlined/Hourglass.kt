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

public val CupertinoIcons.Outlined.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 13.7344.dp, defaultHeight =
                21.5742.dp, viewportWidth = 13.7344f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9102f, 21.5508f)
                lineTo(11.8242f, 21.5508f)
                curveTo(13.0078f, 21.5508f, 13.7344f, 20.8828f, 13.7344f, 19.6289f)
                lineTo(13.7344f, 19.3945f)
                curveTo(13.7344f, 16.5703f, 10.7461f, 13.5703f, 9.1055f, 11.9414f)
                curveTo(8.3086f, 11.1445f, 8.3672f, 10.3242f, 9.1055f, 9.5859f)
                curveTo(10.7461f, 7.9688f, 13.7344f, 4.9805f, 13.7344f, 2.1328f)
                lineTo(13.7344f, 1.9336f)
                curveTo(13.7344f, 0.6797f, 13.0078f, 0.0f, 11.8242f, 0.0f)
                lineTo(1.9102f, 0.0f)
                curveTo(0.7266f, 0.0f, 0.0f, 0.6797f, 0.0f, 1.9336f)
                lineTo(0.0f, 2.1328f)
                curveTo(0.0f, 4.9805f, 3.0f, 7.9688f, 4.6289f, 9.5859f)
                curveTo(5.3789f, 10.3242f, 5.4375f, 11.1445f, 4.6289f, 11.9414f)
                curveTo(3.0f, 13.5703f, 0.0f, 16.5703f, 0.0f, 19.3945f)
                lineTo(0.0f, 19.6289f)
                curveTo(0.0f, 20.8828f, 0.7266f, 21.5508f, 1.9102f, 21.5508f)
                close()
                moveTo(2.8125f, 19.957f)
                curveTo(2.3086f, 19.957f, 2.1914f, 19.3711f, 2.5313f, 19.0547f)
                lineTo(6.2695f, 15.4922f)
                curveTo(6.4102f, 15.3633f, 6.4688f, 15.3047f, 6.4688f, 15.1172f)
                lineTo(6.4688f, 9.9258f)
                curveTo(6.4688f, 9.3867f, 6.3633f, 9.1172f, 5.9648f, 8.7773f)
                curveTo(5.1797f, 8.1094f, 4.0781f, 7.1484f, 3.3516f, 6.3867f)
                curveTo(3.0469f, 6.082f, 3.2109f, 5.707f, 3.5742f, 5.707f)
                lineTo(10.1602f, 5.707f)
                curveTo(10.5234f, 5.707f, 10.6875f, 6.082f, 10.3828f, 6.3867f)
                curveTo(9.668f, 7.1484f, 8.5664f, 8.1094f, 7.7695f, 8.7773f)
                curveTo(7.3711f, 9.1172f, 7.2773f, 9.3867f, 7.2773f, 9.9258f)
                lineTo(7.2773f, 15.1172f)
                curveTo(7.2773f, 15.3047f, 7.3242f, 15.3633f, 7.4648f, 15.4922f)
                lineTo(11.2031f, 19.0547f)
                curveTo(11.543f, 19.3711f, 11.4258f, 19.957f, 10.9219f, 19.957f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
