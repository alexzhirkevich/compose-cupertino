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

public val CupertinoIcons.Outlined.ArrowDownToLine: ImageVector
    get() {
        if (_arrowDownToLine != null) {
            return _arrowDownToLine!!
        }
        _arrowDownToLine = Builder(name = "ArrowDownToLine", defaultWidth = 17.7656.dp,
                defaultHeight = 24.293.dp, viewportWidth = 17.7656f, viewportHeight =
                24.293f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7656f, 13.2891f)
                curveTo(17.7656f, 12.7148f, 17.3438f, 12.2695f, 16.7578f, 12.2695f)
                curveTo(16.4766f, 12.2695f, 16.207f, 12.3633f, 16.0195f, 12.5508f)
                lineTo(13.3477f, 15.1758f)
                lineTo(9.1523f, 19.7812f)
                lineTo(9.8086f, 20.0156f)
                lineTo(9.9258f, 16.5234f)
                lineTo(9.9258f, 1.0781f)
                curveTo(9.9258f, 0.4805f, 9.4922f, 0.0469f, 8.8828f, 0.0469f)
                curveTo(8.2734f, 0.0469f, 7.8398f, 0.4805f, 7.8398f, 1.0781f)
                lineTo(7.8398f, 16.5234f)
                lineTo(7.957f, 20.0156f)
                lineTo(8.625f, 19.7812f)
                lineTo(4.418f, 15.1758f)
                lineTo(1.7461f, 12.5508f)
                curveTo(1.5703f, 12.3633f, 1.2891f, 12.2695f, 1.0078f, 12.2695f)
                curveTo(0.4219f, 12.2695f, 0.0f, 12.7148f, 0.0f, 13.2891f)
                curveTo(0.0f, 13.5703f, 0.1055f, 13.8164f, 0.3281f, 14.0508f)
                lineTo(8.0977f, 21.8438f)
                curveTo(8.3203f, 22.0781f, 8.5898f, 22.1953f, 8.8828f, 22.1953f)
                curveTo(9.1758f, 22.1953f, 9.4453f, 22.0781f, 9.668f, 21.8438f)
                lineTo(17.4492f, 14.0508f)
                curveTo(17.6719f, 13.8164f, 17.7656f, 13.5703f, 17.7656f, 13.2891f)
                close()
                moveTo(17.7656f, 23.2383f)
                curveTo(17.7656f, 22.6289f, 17.3555f, 22.1953f, 16.7578f, 22.1953f)
                lineTo(1.0313f, 22.1953f)
                curveTo(0.4219f, 22.1953f, 0.0f, 22.6289f, 0.0f, 23.2383f)
                curveTo(0.0f, 23.8477f, 0.4219f, 24.293f, 1.0313f, 24.293f)
                lineTo(16.7578f, 24.293f)
                curveTo(17.3555f, 24.293f, 17.7656f, 23.8477f, 17.7656f, 23.2383f)
                close()
            }
        }
        .build()
        return _arrowDownToLine!!
    }

private var _arrowDownToLine: ImageVector? = null
