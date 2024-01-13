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

public val CupertinoIcons.Filled.Capslock: ImageVector
    get() {
        if (_capslock != null) {
            return _capslock!!
        }
        _capslock = Builder(name = "Capslock", defaultWidth = 24.6328.dp, defaultHeight =
                24.8555.dp, viewportWidth = 24.6328f, viewportHeight = 24.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.168f, 17.4023f)
                lineTo(16.4648f, 17.4023f)
                curveTo(17.8125f, 17.4023f, 18.4453f, 16.7695f, 18.4453f, 15.4219f)
                lineTo(18.4453f, 12.8203f)
                lineTo(22.8867f, 12.8203f)
                curveTo(23.8594f, 12.8203f, 24.6328f, 12.2461f, 24.6328f, 11.3438f)
                curveTo(24.6328f, 10.793f, 24.3516f, 10.3594f, 23.8242f, 9.9023f)
                lineTo(13.7695f, 1.0313f)
                curveTo(13.2773f, 0.6094f, 12.8438f, 0.3281f, 12.3164f, 0.3281f)
                curveTo(11.7891f, 0.3281f, 11.3555f, 0.6094f, 10.8633f, 1.0313f)
                lineTo(0.8086f, 9.9141f)
                curveTo(0.2578f, 10.3945f, 0.0f, 10.793f, 0.0f, 11.3438f)
                curveTo(0.0f, 12.2461f, 0.7734f, 12.8203f, 1.7461f, 12.8203f)
                lineTo(6.1875f, 12.8203f)
                lineTo(6.1875f, 15.4219f)
                curveTo(6.1875f, 16.7695f, 6.8203f, 17.4023f, 8.168f, 17.4023f)
                close()
                moveTo(8.0508f, 24.8555f)
                lineTo(16.582f, 24.8555f)
                curveTo(17.7539f, 24.8555f, 18.4453f, 24.1641f, 18.4453f, 23.0039f)
                lineTo(18.4453f, 21.1992f)
                curveTo(18.4453f, 20.0391f, 17.7539f, 19.3477f, 16.582f, 19.3477f)
                lineTo(8.0508f, 19.3477f)
                curveTo(6.8789f, 19.3477f, 6.1875f, 20.0391f, 6.1875f, 21.1992f)
                lineTo(6.1875f, 23.0039f)
                curveTo(6.1875f, 24.1641f, 6.8789f, 24.8555f, 8.0508f, 24.8555f)
                close()
            }
        }
        .build()
        return _capslock!!
    }

private var _capslock: ImageVector? = null
