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

public val CupertinoIcons.Outlined.Space: ImageVector
    get() {
        if (_space != null) {
            return _space!!
        }
        _space = Builder(name = "Space", defaultWidth = 28.6172.dp, defaultHeight = 14.9414.dp,
                viewportWidth = 28.6172f, viewportHeight = 14.9414f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.4336f)
                curveTo(0.0f, 13.9805f, 0.8672f, 14.9414f, 2.5078f, 14.9414f)
                lineTo(26.1094f, 14.9414f)
                curveTo(27.75f, 14.9414f, 28.6172f, 13.9805f, 28.6172f, 12.4336f)
                lineTo(28.6172f, 8.3906f)
                curveTo(28.6172f, 7.8516f, 28.1836f, 7.418f, 27.6445f, 7.418f)
                curveTo(27.0938f, 7.418f, 26.6602f, 7.8516f, 26.6602f, 8.3906f)
                lineTo(26.6602f, 12.3867f)
                curveTo(26.6602f, 12.8203f, 26.3438f, 13.125f, 25.9219f, 13.125f)
                lineTo(2.6953f, 13.125f)
                curveTo(2.2617f, 13.125f, 1.957f, 12.832f, 1.957f, 12.3867f)
                lineTo(1.957f, 8.3906f)
                curveTo(1.957f, 7.8516f, 1.5234f, 7.418f, 0.9727f, 7.418f)
                curveTo(0.4336f, 7.418f, 0.0f, 7.8516f, 0.0f, 8.3906f)
                close()
            }
        }
        .build()
        return _space!!
    }

private var _space: ImageVector? = null
