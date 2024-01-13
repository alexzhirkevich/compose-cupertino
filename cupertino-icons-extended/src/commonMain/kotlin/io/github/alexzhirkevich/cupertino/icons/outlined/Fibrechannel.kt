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

public val CupertinoIcons.Outlined.Fibrechannel: ImageVector
    get() {
        if (_fibrechannel != null) {
            return _fibrechannel!!
        }
        _fibrechannel = Builder(name = "Fibrechannel", defaultWidth = 29.3906.dp, defaultHeight =
                22.3008.dp, viewportWidth = 29.3906f, viewportHeight = 22.3008f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.9492f)
                curveTo(0.0f, 1.4648f, 0.4219f, 1.8867f, 0.9375f, 1.8867f)
                lineTo(28.4531f, 1.8867f)
                curveTo(28.9688f, 1.8867f, 29.3906f, 1.4648f, 29.3906f, 0.9492f)
                curveTo(29.3906f, 0.4336f, 28.9688f, 0.0f, 28.4531f, 0.0f)
                lineTo(0.9375f, 0.0f)
                curveTo(0.4219f, 0.0f, 0.0f, 0.4336f, 0.0f, 0.9492f)
                close()
                moveTo(3.5273f, 12.1289f)
                lineTo(20.2969f, 12.1289f)
                lineTo(20.2969f, 16.2422f)
                curveTo(20.2969f, 17.0742f, 21.3398f, 17.4961f, 21.9492f, 16.8633f)
                lineTo(26.6484f, 12.082f)
                curveTo(27.3281f, 11.3906f, 27.1055f, 10.1719f, 25.875f, 10.1719f)
                lineTo(9.1055f, 10.1719f)
                lineTo(9.1055f, 6.0586f)
                curveTo(9.1055f, 5.2266f, 8.0625f, 4.8047f, 7.4531f, 5.4375f)
                lineTo(2.7656f, 10.2188f)
                curveTo(2.0742f, 10.9102f, 2.2969f, 12.1289f, 3.5273f, 12.1289f)
                close()
                moveTo(0.0f, 21.3398f)
                curveTo(0.0f, 21.8555f, 0.4219f, 22.2891f, 0.9375f, 22.2891f)
                lineTo(28.4531f, 22.2891f)
                curveTo(28.9688f, 22.2891f, 29.3906f, 21.8555f, 29.3906f, 21.3398f)
                curveTo(29.3906f, 20.8242f, 28.9688f, 20.4023f, 28.4531f, 20.4023f)
                lineTo(0.9375f, 20.4023f)
                curveTo(0.4219f, 20.4023f, 0.0f, 20.8242f, 0.0f, 21.3398f)
                close()
            }
        }
        .build()
        return _fibrechannel!!
    }

private var _fibrechannel: ImageVector? = null
