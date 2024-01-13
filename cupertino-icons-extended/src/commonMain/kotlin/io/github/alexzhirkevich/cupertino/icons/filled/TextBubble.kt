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

public val CupertinoIcons.Filled.TextBubble: ImageVector
    get() {
        if (_textBubble != null) {
            return _textBubble!!
        }
        _textBubble = Builder(name = "TextBubble", defaultWidth = 25.8281.dp, defaultHeight =
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
                moveTo(6.6914f, 8.0859f)
                curveTo(6.3047f, 8.0859f, 5.9883f, 7.7813f, 5.9883f, 7.3828f)
                curveTo(5.9883f, 7.0078f, 6.3047f, 6.6914f, 6.6914f, 6.6914f)
                lineTo(18.9961f, 6.6914f)
                curveTo(19.3828f, 6.6914f, 19.6875f, 7.0078f, 19.6875f, 7.3828f)
                curveTo(19.6875f, 7.7813f, 19.3828f, 8.0859f, 18.9961f, 8.0859f)
                close()
                moveTo(6.6914f, 12.0234f)
                curveTo(6.3047f, 12.0234f, 5.9883f, 11.707f, 5.9883f, 11.3086f)
                curveTo(5.9883f, 10.9336f, 6.3047f, 10.6172f, 6.6914f, 10.6172f)
                lineTo(18.9961f, 10.6172f)
                curveTo(19.3828f, 10.6172f, 19.6875f, 10.9336f, 19.6875f, 11.3086f)
                curveTo(19.6875f, 11.707f, 19.3828f, 12.0234f, 18.9961f, 12.0234f)
                close()
                moveTo(6.6914f, 15.9492f)
                curveTo(6.3047f, 15.9492f, 5.9883f, 15.6445f, 5.9883f, 15.2578f)
                curveTo(5.9883f, 14.8594f, 6.3047f, 14.543f, 6.6914f, 14.543f)
                lineTo(14.6953f, 14.543f)
                curveTo(15.082f, 14.543f, 15.3867f, 14.8594f, 15.3867f, 15.2578f)
                curveTo(15.3867f, 15.6445f, 15.082f, 15.9492f, 14.6953f, 15.9492f)
                close()
            }
        }
        .build()
        return _textBubble!!
    }

private var _textBubble: ImageVector? = null
