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

public val CupertinoIcons.Outlined.Rosette: ImageVector
    get() {
        if (_rosette != null) {
            return _rosette!!
        }
        _rosette = Builder(name = "Rosette", defaultWidth = 18.6328.dp, defaultHeight = 26.3789.dp,
                viewportWidth = 18.6328f, viewportHeight = 26.3789f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.3633f)
                curveTo(0.0f, 12.1172f, 1.2188f, 14.6133f, 3.1406f, 16.3242f)
                lineTo(3.1523f, 25.1719f)
                curveTo(3.1523f, 25.875f, 3.5156f, 26.168f, 3.9961f, 26.168f)
                curveTo(4.4063f, 26.168f, 4.7109f, 25.9336f, 5.0273f, 25.6172f)
                lineTo(8.8359f, 21.8203f)
                curveTo(9.0469f, 21.6328f, 9.1875f, 21.5625f, 9.3281f, 21.5625f)
                curveTo(9.4688f, 21.5625f, 9.6211f, 21.6328f, 9.8203f, 21.8203f)
                lineTo(13.6289f, 25.6172f)
                curveTo(13.957f, 25.9453f, 14.2734f, 26.168f, 14.6602f, 26.168f)
                curveTo(15.1641f, 26.168f, 15.5156f, 25.875f, 15.5156f, 25.1719f)
                lineTo(15.5156f, 16.2891f)
                curveTo(17.4141f, 14.5898f, 18.6211f, 12.1055f, 18.6328f, 9.3633f)
                curveTo(18.6445f, 4.207f, 14.4258f, 0.0f, 9.3164f, 0.0f)
                curveTo(4.1953f, 0.0f, 0.0f, 4.207f, 0.0f, 9.3633f)
                close()
                moveTo(1.9102f, 9.3633f)
                curveTo(1.9102f, 5.2031f, 5.1563f, 1.8633f, 9.3281f, 1.8633f)
                curveTo(13.4883f, 1.8633f, 16.7344f, 5.2031f, 16.7461f, 9.3633f)
                curveTo(16.7578f, 13.5117f, 13.4883f, 16.8516f, 9.3281f, 16.8398f)
                curveTo(5.1563f, 16.8281f, 1.9102f, 13.5117f, 1.9102f, 9.3633f)
                close()
            }
        }
        .build()
        return _rosette!!
    }

private var _rosette: ImageVector? = null
