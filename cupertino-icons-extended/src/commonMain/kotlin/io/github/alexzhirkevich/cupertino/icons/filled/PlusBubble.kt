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

public val CupertinoIcons.Filled.PlusBubble: ImageVector
    get() {
        if (_plusBubble != null) {
            return _plusBubble!!
        }
        _plusBubble = Builder(name = "PlusBubble", defaultWidth = 25.8281.dp, defaultHeight =
                25.8867.dp, viewportWidth = 25.8281f, viewportHeight = 25.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(7.1953f, 11.4258f)
                curveTo(7.1953f, 10.8164f, 7.6289f, 10.3945f, 8.2383f, 10.3945f)
                lineTo(11.9062f, 10.3945f)
                lineTo(11.9062f, 6.7266f)
                curveTo(11.9062f, 6.1172f, 12.3164f, 5.6836f, 12.9023f, 5.6836f)
                curveTo(13.5234f, 5.6836f, 13.9336f, 6.1172f, 13.9336f, 6.7266f)
                lineTo(13.9336f, 10.3945f)
                lineTo(17.6133f, 10.3945f)
                curveTo(18.2227f, 10.3945f, 18.6445f, 10.8164f, 18.6445f, 11.4258f)
                curveTo(18.6445f, 12.0234f, 18.2109f, 12.4219f, 17.6133f, 12.4219f)
                lineTo(13.9336f, 12.4219f)
                lineTo(13.9336f, 16.1016f)
                curveTo(13.9336f, 16.7109f, 13.5234f, 17.1328f, 12.9023f, 17.1328f)
                curveTo(12.3164f, 17.1328f, 11.9062f, 16.6992f, 11.9062f, 16.1016f)
                lineTo(11.9062f, 12.4219f)
                lineTo(8.2383f, 12.4219f)
                curveTo(7.6289f, 12.4219f, 7.1953f, 12.0234f, 7.1953f, 11.4258f)
                close()
            }
        }
        .build()
        return _plusBubble!!
    }

private var _plusBubble: ImageVector? = null
