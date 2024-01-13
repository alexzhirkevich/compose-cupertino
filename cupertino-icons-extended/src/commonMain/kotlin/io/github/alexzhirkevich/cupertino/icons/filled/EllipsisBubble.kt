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

public val CupertinoIcons.Filled.EllipsisBubble: ImageVector
    get() {
        if (_ellipsisBubble != null) {
            return _ellipsisBubble!!
        }
        _ellipsisBubble = Builder(name = "EllipsisBubble", defaultWidth = 25.8281.dp, defaultHeight
                = 25.8867.dp, viewportWidth = 25.8281f, viewportHeight = 25.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9258f, 13.1484f)
                curveTo(11.9648f, 13.1484f, 11.1797f, 12.375f, 11.1797f, 11.4141f)
                curveTo(11.1797f, 10.4531f, 11.9648f, 9.6797f, 12.9258f, 9.6797f)
                curveTo(13.875f, 9.6797f, 14.6602f, 10.4531f, 14.6602f, 11.4141f)
                curveTo(14.6602f, 12.375f, 13.875f, 13.1484f, 12.9258f, 13.1484f)
                close()
                moveTo(18.8438f, 13.1484f)
                curveTo(17.8828f, 13.1484f, 17.1094f, 12.375f, 17.1094f, 11.4141f)
                curveTo(17.1094f, 10.4531f, 17.8828f, 9.6797f, 18.8438f, 9.6797f)
                curveTo(19.8047f, 9.6797f, 20.5781f, 10.4531f, 20.5781f, 11.4141f)
                curveTo(20.5781f, 12.375f, 19.8047f, 13.1484f, 18.8438f, 13.1484f)
                close()
                moveTo(6.9609f, 25.8867f)
                curveTo(7.418f, 25.8867f, 7.7578f, 25.6523f, 8.3086f, 25.1367f)
                lineTo(12.5391f, 21.2695f)
                lineTo(20.4609f, 21.2695f)
                curveTo(23.9531f, 21.2695f, 25.8281f, 19.3477f, 25.8281f, 15.9141f)
                lineTo(25.8281f, 6.9375f)
                curveTo(25.8281f, 3.5039f, 23.9531f, 1.5703f, 20.4609f, 1.5703f)
                lineTo(5.3672f, 1.5703f)
                curveTo(1.875f, 1.5703f, 0.0f, 3.4922f, 0.0f, 6.9375f)
                lineTo(0.0f, 15.9141f)
                curveTo(0.0f, 19.3594f, 1.875f, 21.2695f, 5.3672f, 21.2695f)
                lineTo(5.918f, 21.2695f)
                lineTo(5.918f, 24.6797f)
                curveTo(5.918f, 25.4062f, 6.293f, 25.8867f, 6.9609f, 25.8867f)
                close()
                moveTo(6.9961f, 13.1484f)
                curveTo(6.0469f, 13.1484f, 5.2617f, 12.375f, 5.2617f, 11.4141f)
                curveTo(5.2617f, 10.4531f, 6.0469f, 9.6797f, 6.9961f, 9.6797f)
                curveTo(7.957f, 9.6797f, 8.7305f, 10.4531f, 8.7305f, 11.4141f)
                curveTo(8.7305f, 12.375f, 7.957f, 13.1484f, 6.9961f, 13.1484f)
                close()
            }
        }
        .build()
        return _ellipsisBubble!!
    }

private var _ellipsisBubble: ImageVector? = null
