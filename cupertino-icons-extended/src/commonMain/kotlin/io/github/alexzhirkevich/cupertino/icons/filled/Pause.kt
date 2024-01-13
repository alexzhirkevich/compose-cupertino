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

public val CupertinoIcons.Filled.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 14.2969.dp, defaultHeight = 19.0898.dp,
                viewportWidth = 14.2969f, viewportHeight = 19.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5586f, 19.0898f)
                lineTo(4.2305f, 19.0898f)
                curveTo(5.25f, 19.0898f, 5.7891f, 18.5508f, 5.7891f, 17.5195f)
                lineTo(5.7891f, 1.5586f)
                curveTo(5.7891f, 0.4922f, 5.25f, 0.0f, 4.2305f, 0.0f)
                lineTo(1.5586f, 0.0f)
                curveTo(0.5391f, 0.0f, 0.0f, 0.5391f, 0.0f, 1.5586f)
                lineTo(0.0f, 17.5195f)
                curveTo(0.0f, 18.5508f, 0.5391f, 19.0898f, 1.5586f, 19.0898f)
                close()
                moveTo(10.0781f, 19.0898f)
                lineTo(12.7383f, 19.0898f)
                curveTo(13.7695f, 19.0898f, 14.2969f, 18.5508f, 14.2969f, 17.5195f)
                lineTo(14.2969f, 1.5586f)
                curveTo(14.2969f, 0.4922f, 13.7695f, 0.0f, 12.7383f, 0.0f)
                lineTo(10.0781f, 0.0f)
                curveTo(9.0469f, 0.0f, 8.5078f, 0.5391f, 8.5078f, 1.5586f)
                lineTo(8.5078f, 17.5195f)
                curveTo(8.5078f, 18.5508f, 9.0469f, 19.0898f, 10.0781f, 19.0898f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
