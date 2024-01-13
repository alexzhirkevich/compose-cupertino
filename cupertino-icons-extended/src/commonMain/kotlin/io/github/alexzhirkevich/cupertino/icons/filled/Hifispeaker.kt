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

public val CupertinoIcons.Filled.Hifispeaker: ImageVector
    get() {
        if (_hifispeaker != null) {
            return _hifispeaker!!
        }
        _hifispeaker = Builder(name = "Hifispeaker", defaultWidth = 17.9648.dp, defaultHeight =
                24.2695.dp, viewportWidth = 17.9648f, viewportHeight = 24.2695f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.3281f)
                lineTo(0.0f, 20.9297f)
                curveTo(0.0f, 23.1445f, 1.1016f, 24.2578f, 3.293f, 24.2578f)
                lineTo(14.6836f, 24.2578f)
                curveTo(16.875f, 24.2578f, 17.9648f, 23.1445f, 17.9648f, 20.9297f)
                lineTo(17.9648f, 3.3281f)
                curveTo(17.9648f, 1.1133f, 16.875f, 0.0f, 14.6836f, 0.0f)
                lineTo(3.293f, 0.0f)
                curveTo(1.1016f, 0.0f, 0.0f, 1.1133f, 0.0f, 3.3281f)
                close()
                moveTo(8.9883f, 20.8594f)
                curveTo(6.2578f, 20.8594f, 4.0547f, 18.6797f, 4.0547f, 15.9375f)
                curveTo(4.0547f, 13.1836f, 6.2578f, 10.9922f, 8.9883f, 11.0039f)
                curveTo(11.7188f, 11.0156f, 13.9219f, 13.1836f, 13.9219f, 15.9375f)
                curveTo(13.9219f, 18.6797f, 11.7188f, 20.8594f, 8.9883f, 20.8594f)
                close()
                moveTo(8.9883f, 8.8711f)
                curveTo(7.4648f, 8.8711f, 6.2461f, 7.6523f, 6.2461f, 6.1289f)
                curveTo(6.2461f, 4.5938f, 7.4648f, 3.3867f, 8.9883f, 3.3984f)
                curveTo(10.5f, 3.4102f, 11.7188f, 4.6055f, 11.7305f, 6.1289f)
                curveTo(11.7539f, 7.6523f, 10.5f, 8.8711f, 8.9883f, 8.8711f)
                close()
                moveTo(8.9883f, 18.0234f)
                curveTo(10.1602f, 18.0234f, 11.0742f, 17.0859f, 11.0742f, 15.9375f)
                curveTo(11.0742f, 14.7422f, 10.1602f, 13.8281f, 8.9883f, 13.8281f)
                curveTo(7.8047f, 13.8281f, 6.9023f, 14.7422f, 6.9023f, 15.9375f)
                curveTo(6.9023f, 17.0859f, 7.8398f, 18.0234f, 8.9883f, 18.0234f)
                close()
                moveTo(8.9883f, 7.5234f)
                curveTo(9.7617f, 7.5234f, 10.3828f, 6.8906f, 10.3828f, 6.1289f)
                curveTo(10.3828f, 5.3555f, 9.75f, 4.7344f, 8.9883f, 4.7344f)
                curveTo(8.2031f, 4.7344f, 7.5938f, 5.3203f, 7.5938f, 6.1289f)
                curveTo(7.5938f, 6.8906f, 8.2031f, 7.5234f, 8.9883f, 7.5234f)
                close()
            }
        }
        .build()
        return _hifispeaker!!
    }

private var _hifispeaker: ImageVector? = null
