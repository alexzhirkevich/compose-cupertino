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

public val CupertinoIcons.Outlined.Cart: ImageVector
    get() {
        if (_cart != null) {
            return _cart!!
        }
        _cart = Builder(name = "Cart", defaultWidth = 27.0469.dp, defaultHeight = 24.6914.dp,
                viewportWidth = 27.0469f, viewportHeight = 24.6914f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5273f, 18.9961f)
                lineTo(23.2031f, 18.9961f)
                curveTo(23.6602f, 18.9961f, 24.0586f, 18.6211f, 24.0586f, 18.1172f)
                curveTo(24.0586f, 17.6133f, 23.6602f, 17.2383f, 23.2031f, 17.2383f)
                lineTo(9.7266f, 17.2383f)
                curveTo(9.0586f, 17.2383f, 8.6484f, 16.7695f, 8.543f, 16.0547f)
                lineTo(6.6211f, 3.0117f)
                curveTo(6.5039f, 2.1094f, 6.1758f, 1.6523f, 4.9805f, 1.6523f)
                lineTo(0.8672f, 1.6523f)
                curveTo(0.3984f, 1.6523f, 0.0f, 2.0625f, 0.0f, 2.5313f)
                curveTo(0.0f, 3.0117f, 0.3984f, 3.4219f, 0.8672f, 3.4219f)
                lineTo(4.8281f, 3.4219f)
                lineTo(6.7031f, 16.2891f)
                curveTo(6.9492f, 17.9531f, 7.8281f, 18.9961f, 9.5273f, 18.9961f)
                close()
                moveTo(7.3711f, 14.8242f)
                lineTo(23.2266f, 14.8242f)
                curveTo(24.9375f, 14.8242f, 25.8164f, 13.7695f, 26.0625f, 12.0938f)
                lineTo(27.0f, 5.8945f)
                curveTo(27.0234f, 5.7422f, 27.0469f, 5.5547f, 27.0469f, 5.4492f)
                curveTo(27.0469f, 4.8867f, 26.625f, 4.5f, 25.9805f, 4.5f)
                lineTo(6.3516f, 4.5f)
                lineTo(6.3633f, 6.2695f)
                lineTo(25.0547f, 6.2695f)
                lineTo(24.2227f, 11.8828f)
                curveTo(24.1289f, 12.6094f, 23.7422f, 13.0664f, 23.0508f, 13.0664f)
                lineTo(7.3477f, 13.0664f)
                close()
                moveTo(10.4531f, 24.6914f)
                curveTo(11.5078f, 24.6914f, 12.3516f, 23.8594f, 12.3516f, 22.793f)
                curveTo(12.3516f, 21.7383f, 11.5078f, 20.8945f, 10.4531f, 20.8945f)
                curveTo(9.3867f, 20.8945f, 8.543f, 21.7383f, 8.543f, 22.793f)
                curveTo(8.543f, 23.8594f, 9.3867f, 24.6914f, 10.4531f, 24.6914f)
                close()
                moveTo(21.4102f, 24.6914f)
                curveTo(22.4766f, 24.6914f, 23.3203f, 23.8594f, 23.3203f, 22.793f)
                curveTo(23.3203f, 21.7383f, 22.4766f, 20.8945f, 21.4102f, 20.8945f)
                curveTo(20.3555f, 20.8945f, 19.5f, 21.7383f, 19.5f, 22.793f)
                curveTo(19.5f, 23.8594f, 20.3555f, 24.6914f, 21.4102f, 24.6914f)
                close()
            }
        }
        .build()
        return _cart!!
    }

private var _cart: ImageVector? = null
