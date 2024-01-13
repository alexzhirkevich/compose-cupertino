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

public val CupertinoIcons.Filled.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 27.6328.dp, defaultHeight =
                21.5742.dp, viewportWidth = 27.6328f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.875f, 9.1055f)
                lineTo(7.7813f, 7.3359f)
                lineTo(4.875f, 5.5898f)
                curveTo(3.9141f, 5.0039f, 4.7227f, 3.5742f, 5.7773f, 4.2305f)
                lineTo(9.2461f, 6.3984f)
                curveTo(9.9023f, 6.8203f, 9.9375f, 7.8516f, 9.2461f, 8.2852f)
                lineTo(5.7773f, 10.4648f)
                curveTo(4.7227f, 11.1211f, 3.9258f, 9.668f, 4.875f, 9.1055f)
                close()
                moveTo(9.9727f, 10.4414f)
                curveTo(9.9727f, 10.0078f, 10.3125f, 9.6563f, 10.7461f, 9.6563f)
                lineTo(15.3516f, 9.6563f)
                curveTo(15.7969f, 9.6563f, 16.1367f, 10.0078f, 16.1367f, 10.4414f)
                curveTo(16.1367f, 10.875f, 15.7969f, 11.2266f, 15.3516f, 11.2266f)
                lineTo(10.7461f, 11.2266f)
                curveTo(10.3125f, 11.2266f, 9.9727f, 10.875f, 9.9727f, 10.4414f)
                close()
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
