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

public val CupertinoIcons.Outlined.ServerRack: ImageVector
    get() {
        if (_serverRack != null) {
            return _serverRack!!
        }
        _serverRack = Builder(name = "ServerRack", defaultWidth = 27.6328.dp, defaultHeight =
                21.5742.dp, viewportWidth = 27.6328f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6211f, 5.7773f)
                curveTo(22.4297f, 5.7539f, 23.1094f, 5.0859f, 23.1094f, 4.2773f)
                curveTo(23.1094f, 3.457f, 22.4297f, 2.7656f, 21.6211f, 2.7656f)
                curveTo(20.8242f, 2.7656f, 20.1328f, 3.457f, 20.1328f, 4.2773f)
                curveTo(20.1328f, 5.0859f, 20.8242f, 5.7891f, 21.6211f, 5.7773f)
                close()
                moveTo(21.6211f, 12.2695f)
                curveTo(22.4297f, 12.2461f, 23.1094f, 11.5781f, 23.1094f, 10.7695f)
                curveTo(23.1094f, 9.9492f, 22.4297f, 9.2578f, 21.6211f, 9.2578f)
                curveTo(20.8242f, 9.2578f, 20.1328f, 9.9492f, 20.1328f, 10.7695f)
                curveTo(20.1328f, 11.5781f, 20.8242f, 12.2812f, 21.6211f, 12.2695f)
                close()
                moveTo(21.6211f, 18.7617f)
                curveTo(22.4297f, 18.7383f, 23.1094f, 18.0703f, 23.1094f, 17.2617f)
                curveTo(23.1094f, 16.4414f, 22.4297f, 15.75f, 21.6211f, 15.75f)
                curveTo(20.8242f, 15.75f, 20.1328f, 16.4414f, 20.1328f, 17.2617f)
                curveTo(20.1328f, 18.0703f, 20.8242f, 18.7734f, 21.6211f, 18.7617f)
                close()
                moveTo(26.6133f, 8.4258f)
                lineTo(26.6133f, 6.6563f)
                lineTo(1.0547f, 6.6563f)
                lineTo(1.0547f, 8.4258f)
                close()
                moveTo(26.6133f, 14.9414f)
                lineTo(26.6133f, 13.1719f)
                lineTo(1.0547f, 13.1719f)
                lineTo(1.0547f, 14.9414f)
                close()
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
                moveTo(3.7031f, 19.6875f)
                curveTo(2.5313f, 19.6875f, 1.8867f, 19.0664f, 1.8867f, 17.8477f)
                lineTo(1.8867f, 3.7383f)
                curveTo(1.8867f, 2.5195f, 2.5313f, 1.8867f, 3.7031f, 1.8867f)
                lineTo(23.9297f, 1.8867f)
                curveTo(25.0898f, 1.8867f, 25.7461f, 2.5195f, 25.7461f, 3.7383f)
                lineTo(25.7461f, 17.8477f)
                curveTo(25.7461f, 19.0664f, 25.0898f, 19.6875f, 23.9297f, 19.6875f)
                close()
            }
        }
        .build()
        return _serverRack!!
    }

private var _serverRack: ImageVector? = null
