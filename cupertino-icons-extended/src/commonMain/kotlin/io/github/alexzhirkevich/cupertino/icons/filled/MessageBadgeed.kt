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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Filled.MessageBadgeed: ImageVector
    get() {
        if (_messageBadgeed != null) {
            return _messageBadgeed!!
        }
        _messageBadgeed = Builder(name = "MessageBadgeed", defaultWidth = 26.5781.dp, defaultHeight
                = 24.5508.dp, viewportWidth = 26.5781f, viewportHeight = 24.5508f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6406f, 24.4922f)
                curveTo(6.0469f, 24.4922f, 9.5508f, 22.957f, 11.543f, 21.5273f)
                curveTo(11.7422f, 21.3867f, 11.9062f, 21.3281f, 12.0703f, 21.3281f)
                curveTo(12.2227f, 21.3398f, 12.375f, 21.3516f, 12.5273f, 21.3516f)
                curveTo(20.9766f, 21.3516f, 26.5781f, 16.5469f, 26.5781f, 10.7109f)
                curveTo(26.5781f, 9.8789f, 26.4492f, 9.0938f, 26.2266f, 8.3203f)
                curveTo(25.2305f, 9.1992f, 23.9297f, 9.7266f, 22.5234f, 9.7266f)
                curveTo(19.4062f, 9.7266f, 16.8516f, 7.1719f, 16.8516f, 4.0547f)
                curveTo(16.8516f, 2.8242f, 17.2617f, 1.6758f, 17.9531f, 0.7383f)
                curveTo(16.5f, 0.3047f, 14.9297f, 0.0586f, 13.2891f, 0.0586f)
                curveTo(5.9063f, 0.0586f, 0.0f, 4.8164f, 0.0f, 10.7109f)
                curveTo(0.0f, 14.4609f, 2.3086f, 17.7539f, 6.0703f, 19.7695f)
                curveTo(6.2461f, 19.8633f, 6.3047f, 20.0391f, 6.2109f, 20.2148f)
                curveTo(5.5547f, 21.293f, 4.3828f, 22.582f, 3.9375f, 23.168f)
                curveTo(3.4805f, 23.7539f, 3.7383f, 24.4922f, 4.6406f, 24.4922f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5234f, 8.1211f)
                curveTo(24.7383f, 8.1211f, 26.5781f, 6.293f, 26.5781f, 4.0547f)
                curveTo(26.5781f, 1.8281f, 24.7383f, 0.0f, 22.5234f, 0.0f)
                curveTo(20.2852f, 0.0f, 18.457f, 1.8281f, 18.457f, 4.0547f)
                curveTo(18.457f, 6.293f, 20.2852f, 8.1211f, 22.5234f, 8.1211f)
                close()
            }
        }
        .build()
        return _messageBadgeed!!
    }

private var _messageBadgeed: ImageVector? = null
