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

public val CupertinoIcons.Filled.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 17.7188.dp, defaultHeight = 19.8633.dp,
                viewportWidth = 17.7188f, viewportHeight = 19.8633f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4063f, 19.8633f)
                curveTo(1.875f, 19.8633f, 2.2734f, 19.6758f, 2.7422f, 19.4062f)
                lineTo(16.4062f, 11.5078f)
                curveTo(17.3789f, 10.9336f, 17.7188f, 10.5586f, 17.7188f, 9.9375f)
                curveTo(17.7188f, 9.3164f, 17.3789f, 8.9414f, 16.4062f, 8.3789f)
                lineTo(2.7422f, 0.4688f)
                curveTo(2.2734f, 0.1992f, 1.875f, 0.0234f, 1.4063f, 0.0234f)
                curveTo(0.5391f, 0.0234f, 0.0f, 0.6797f, 0.0f, 1.6992f)
                lineTo(0.0f, 18.1758f)
                curveTo(0.0f, 19.1953f, 0.5391f, 19.8633f, 1.4063f, 19.8633f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
