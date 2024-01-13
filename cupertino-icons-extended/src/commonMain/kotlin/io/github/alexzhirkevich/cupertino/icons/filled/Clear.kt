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

public val CupertinoIcons.Filled.Clear: ImageVector
    get() {
        if (_clear != null) {
            return _clear!!
        }
        _clear = Builder(name = "Clear", defaultWidth = 21.5742.dp, defaultHeight = 21.5977.dp,
                viewportWidth = 21.5742f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(17.8945f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3789f, 21.5742f, 17.9648f)
                lineTo(21.5742f, 3.6563f)
                curveTo(21.5742f, 1.2422f, 20.3555f, 0.0234f, 17.8945f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(6.8555f, 15.7148f)
                curveTo(6.3164f, 15.7148f, 5.8945f, 15.2812f, 5.8945f, 14.7422f)
                curveTo(5.8945f, 14.4844f, 5.9883f, 14.2383f, 6.1758f, 14.0625f)
                lineTo(9.4219f, 10.8047f)
                lineTo(6.1758f, 7.5586f)
                curveTo(5.9883f, 7.3711f, 5.8945f, 7.1367f, 5.8945f, 6.8789f)
                curveTo(5.8945f, 6.3281f, 6.3164f, 5.918f, 6.8555f, 5.918f)
                curveTo(7.125f, 5.918f, 7.3359f, 6.0117f, 7.5234f, 6.1875f)
                lineTo(10.793f, 9.4453f)
                lineTo(14.0859f, 6.1758f)
                curveTo(14.2852f, 5.9766f, 14.5078f, 5.8945f, 14.7539f, 5.8945f)
                curveTo(15.293f, 5.8945f, 15.7266f, 6.3164f, 15.7266f, 6.8555f)
                curveTo(15.7266f, 7.125f, 15.6445f, 7.3359f, 15.4453f, 7.5469f)
                lineTo(12.1758f, 10.8047f)
                lineTo(15.4336f, 14.0508f)
                curveTo(15.6211f, 14.2266f, 15.7148f, 14.4727f, 15.7148f, 14.7422f)
                curveTo(15.7148f, 15.2812f, 15.2812f, 15.7148f, 14.7305f, 15.7148f)
                curveTo(14.4727f, 15.7148f, 14.2148f, 15.6211f, 14.0391f, 15.4336f)
                lineTo(10.793f, 12.1758f)
                lineTo(7.5586f, 15.4336f)
                curveTo(7.3711f, 15.6211f, 7.125f, 15.7148f, 6.8555f, 15.7148f)
                close()
            }
        }
        .build()
        return _clear!!
    }

private var _clear: ImageVector? = null
