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

public val CupertinoIcons.Filled.EnvelopeCircle: ImageVector
    get() {
        if (_envelopeCircle != null) {
            return _envelopeCircle!!
        }
        _envelopeCircle = Builder(name = "EnvelopeCircle", defaultWidth = 23.9062.dp, defaultHeight
                = 23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(9.5977f, 11.9883f)
                lineTo(5.4492f, 16.125f)
                curveTo(5.3672f, 15.9844f, 5.332f, 15.7031f, 5.332f, 15.2695f)
                lineTo(5.332f, 8.6602f)
                curveTo(5.332f, 8.2383f, 5.3672f, 7.957f, 5.4258f, 7.8281f)
                close()
                moveTo(11.9648f, 12.5977f)
                curveTo(11.7656f, 12.5977f, 11.543f, 12.5391f, 11.2969f, 12.3164f)
                lineTo(6.0234f, 7.0313f)
                curveTo(6.1758f, 6.9141f, 6.5156f, 6.7969f, 7.0195f, 6.7969f)
                lineTo(16.8867f, 6.7969f)
                curveTo(17.3906f, 6.7969f, 17.7422f, 6.9141f, 17.8945f, 7.0313f)
                lineTo(12.6211f, 12.3164f)
                curveTo(12.3867f, 12.5273f, 12.1758f, 12.5977f, 11.9648f, 12.5977f)
                close()
                moveTo(14.2852f, 11.9883f)
                lineTo(18.457f, 7.8281f)
                curveTo(18.5156f, 7.957f, 18.5625f, 8.2383f, 18.5625f, 8.6602f)
                lineTo(18.5625f, 15.2695f)
                curveTo(18.5625f, 15.7031f, 18.5156f, 15.9844f, 18.4336f, 16.125f)
                close()
                moveTo(11.9531f, 13.5586f)
                curveTo(12.3867f, 13.5586f, 12.7148f, 13.418f, 13.1836f, 12.9844f)
                lineTo(13.5703f, 12.6328f)
                lineTo(17.8477f, 16.9102f)
                curveTo(17.707f, 17.0391f, 17.3789f, 17.1328f, 16.875f, 17.1328f)
                lineTo(7.0195f, 17.1328f)
                curveTo(6.5273f, 17.1328f, 6.1875f, 17.0391f, 6.0469f, 16.9102f)
                lineTo(10.3359f, 12.6328f)
                lineTo(10.7227f, 12.9844f)
                curveTo(11.1797f, 13.418f, 11.5195f, 13.5586f, 11.9531f, 13.5586f)
                close()
            }
        }
        .build()
        return _envelopeCircle!!
    }

private var _envelopeCircle: ImageVector? = null
