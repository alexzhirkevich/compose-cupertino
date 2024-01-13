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

public val CupertinoIcons.Filled.BubbleRight: ImageVector
    get() {
        if (_bubbleRight != null) {
            return _bubbleRight!!
        }
        _bubbleRight = Builder(name = "BubbleRight", defaultWidth = 24.8203.dp, defaultHeight =
                25.8867.dp, viewportWidth = 24.8203f, viewportHeight = 25.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9297f, 25.8867f)
                curveTo(18.5859f, 25.8867f, 18.9727f, 25.4062f, 18.9727f, 24.6797f)
                lineTo(18.9727f, 21.2695f)
                lineTo(20.2852f, 21.2695f)
                curveTo(22.9922f, 21.2695f, 24.8203f, 19.418f, 24.8203f, 16.6055f)
                lineTo(24.8203f, 6.4453f)
                curveTo(24.8203f, 3.6211f, 22.9922f, 1.957f, 20.2852f, 1.957f)
                lineTo(4.5352f, 1.957f)
                curveTo(1.7109f, 1.957f, 0.0f, 3.6328f, 0.0f, 6.4453f)
                lineTo(0.0f, 16.6055f)
                curveTo(0.0f, 19.4062f, 1.7109f, 21.2695f, 4.5352f, 21.2695f)
                lineTo(12.3398f, 21.2695f)
                lineTo(16.582f, 25.1367f)
                curveTo(17.1328f, 25.6523f, 17.4609f, 25.8867f, 17.9297f, 25.8867f)
                close()
            }
        }
        .build()
        return _bubbleRight!!
    }

private var _bubbleRight: ImageVector? = null
