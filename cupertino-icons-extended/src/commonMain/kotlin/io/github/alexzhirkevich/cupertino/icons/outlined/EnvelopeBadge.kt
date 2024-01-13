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

public val CupertinoIcons.Outlined.EnvelopeBadge: ImageVector
    get() {
        if (_envelopeBadge != null) {
            return _envelopeBadge!!
        }
        _envelopeBadge = Builder(name = "EnvelopeBadge", defaultWidth = 28.043.dp, defaultHeight =
                24.5039.dp, viewportWidth = 28.043f, viewportHeight = 24.5039f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 22.3594f)
                lineTo(22.5469f, 22.3594f)
                curveTo(24.6562f, 22.3594f, 25.875f, 21.1406f, 25.875f, 18.7266f)
                lineTo(25.875f, 9.3984f)
                curveTo(25.3125f, 9.6094f, 24.7148f, 9.7148f, 24.082f, 9.7266f)
                lineTo(24.082f, 18.7383f)
                curveTo(24.082f, 19.9453f, 23.4141f, 20.5664f, 22.2656f, 20.5664f)
                lineTo(3.6094f, 20.5664f)
                curveTo(2.4375f, 20.5664f, 1.793f, 19.9453f, 1.793f, 18.7266f)
                lineTo(1.793f, 5.7891f)
                curveTo(1.793f, 4.582f, 2.4375f, 3.9609f, 3.6094f, 3.9609f)
                lineTo(18.3164f, 3.9609f)
                curveTo(18.3164f, 3.3281f, 18.4336f, 2.7188f, 18.6445f, 2.168f)
                lineTo(3.3281f, 2.168f)
                curveTo(1.2188f, 2.168f, 0.0f, 3.375f, 0.0f, 5.7891f)
                lineTo(0.0f, 18.7266f)
                curveTo(0.0f, 21.1523f, 1.2305f, 22.3594f, 3.6797f, 22.3594f)
                close()
                moveTo(12.9609f, 15.3867f)
                curveTo(13.7812f, 15.3867f, 14.5781f, 15.0469f, 15.3984f, 14.2383f)
                lineTo(20.9062f, 8.8242f)
                curveTo(20.4258f, 8.5195f, 19.9922f, 8.1211f, 19.6289f, 7.6758f)
                lineTo(14.3789f, 12.8555f)
                curveTo(13.875f, 13.3594f, 13.418f, 13.582f, 12.9609f, 13.582f)
                curveTo(12.4922f, 13.582f, 12.0469f, 13.3594f, 11.543f, 12.8555f)
                lineTo(2.168f, 3.5977f)
                lineTo(0.9375f, 4.8164f)
                lineTo(10.5234f, 14.2383f)
                curveTo(11.3438f, 15.0469f, 12.1289f, 15.3867f, 12.9609f, 15.3867f)
                close()
                moveTo(23.7773f, 21.0352f)
                lineTo(24.9961f, 19.8047f)
                lineTo(16.5352f, 11.4375f)
                lineTo(15.3164f, 12.6562f)
                close()
                moveTo(2.2969f, 20.8711f)
                lineTo(10.3359f, 12.9141f)
                lineTo(9.1172f, 11.6953f)
                lineTo(1.0898f, 19.6406f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9766f, 8.1328f)
                curveTo(26.2031f, 8.1328f, 28.043f, 6.293f, 28.043f, 4.0664f)
                curveTo(28.043f, 1.8398f, 26.2031f, 0.0f, 23.9766f, 0.0f)
                curveTo(21.75f, 0.0f, 19.9219f, 1.8398f, 19.9219f, 4.0664f)
                curveTo(19.9219f, 6.293f, 21.75f, 8.1328f, 23.9766f, 8.1328f)
                close()
            }
        }
        .build()
        return _envelopeBadge!!
    }

private var _envelopeBadge: ImageVector? = null
