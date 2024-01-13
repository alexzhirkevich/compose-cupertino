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

public val CupertinoIcons.Filled.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 28.7695.dp, defaultHeight = 19.043.dp,
                viewportWidth = 28.7695f, viewportHeight = 19.043f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7617f, 19.0312f)
                lineTo(16.3477f, 19.0312f)
                curveTo(18.7031f, 19.0312f, 20.1094f, 17.6719f, 20.1094f, 15.3164f)
                lineTo(20.1094f, 3.7031f)
                curveTo(20.1094f, 1.3594f, 18.8203f, 0.0f, 16.4648f, 0.0f)
                lineTo(3.7617f, 0.0f)
                curveTo(1.5117f, 0.0f, 0.0f, 1.3594f, 0.0f, 3.7031f)
                lineTo(0.0f, 15.3164f)
                curveTo(0.0f, 17.6719f, 1.4063f, 19.0312f, 3.7617f, 19.0312f)
                close()
                moveTo(21.7031f, 12.9727f)
                lineTo(25.9688f, 16.6641f)
                curveTo(26.3672f, 17.0156f, 26.8359f, 17.2383f, 27.2578f, 17.2383f)
                curveTo(28.1719f, 17.2383f, 28.7695f, 16.5703f, 28.7695f, 15.6094f)
                lineTo(28.7695f, 3.4219f)
                curveTo(28.7695f, 2.4609f, 28.1719f, 1.793f, 27.2578f, 1.793f)
                curveTo(26.8359f, 1.793f, 26.3672f, 2.0156f, 25.9688f, 2.3672f)
                lineTo(21.7031f, 6.0469f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
