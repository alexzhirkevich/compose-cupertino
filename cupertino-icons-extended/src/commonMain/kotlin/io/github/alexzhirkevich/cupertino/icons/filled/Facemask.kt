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

public val CupertinoIcons.Filled.Facemask: ImageVector
    get() {
        if (_facemask != null) {
            return _facemask!!
        }
        _facemask = Builder(name = "Facemask", defaultWidth = 35.8242.dp, defaultHeight =
                18.0117.dp, viewportWidth = 35.8242f, viewportHeight = 18.0117f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.6992f)
                curveTo(0.0f, 11.4727f, 2.7422f, 14.1094f, 6.8555f, 14.1094f)
                lineTo(7.6172f, 14.1094f)
                lineTo(7.6172f, 12.2227f)
                lineTo(6.668f, 12.2227f)
                curveTo(3.8203f, 12.2227f, 1.8867f, 10.3242f, 1.8867f, 7.6992f)
                curveTo(1.8867f, 6.3984f, 2.5781f, 5.6016f, 3.832f, 5.6016f)
                lineTo(7.1367f, 5.6016f)
                lineTo(7.1367f, 3.7148f)
                lineTo(3.832f, 3.7148f)
                curveTo(1.4063f, 3.7148f, 0.0f, 5.2148f, 0.0f, 7.6992f)
                close()
                moveTo(35.8242f, 7.6992f)
                curveTo(35.8242f, 5.2148f, 34.4297f, 3.7148f, 31.9922f, 3.7148f)
                lineTo(28.6875f, 3.7148f)
                lineTo(28.6875f, 5.6016f)
                lineTo(31.9922f, 5.6016f)
                curveTo(33.2461f, 5.6016f, 33.9375f, 6.3984f, 33.9375f, 7.6992f)
                curveTo(33.9375f, 10.3242f, 32.0039f, 12.2227f, 29.1562f, 12.2227f)
                lineTo(28.207f, 12.2227f)
                lineTo(28.207f, 14.1094f)
                lineTo(28.9805f, 14.1094f)
                curveTo(33.082f, 14.1094f, 35.8242f, 11.4727f, 35.8242f, 7.6992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.918f, 17.9766f)
                curveTo(24.8672f, 17.9766f, 29.8125f, 15.2695f, 29.8125f, 11.2969f)
                lineTo(29.8125f, 5.4375f)
                curveTo(29.8125f, 1.9219f, 25.6055f, 0.0f, 17.918f, 0.0f)
                curveTo(10.2188f, 0.0f, 6.0117f, 1.9219f, 6.0117f, 5.4375f)
                lineTo(6.0117f, 11.2969f)
                curveTo(6.0117f, 15.2695f, 10.957f, 17.9766f, 17.918f, 17.9766f)
                close()
                moveTo(11.5664f, 6.4688f)
                curveTo(11.5664f, 5.9414f, 12.0f, 5.4961f, 12.5391f, 5.4961f)
                lineTo(23.2969f, 5.4961f)
                curveTo(23.8477f, 5.4961f, 24.2812f, 5.9414f, 24.2812f, 6.4688f)
                curveTo(24.2812f, 7.0078f, 23.8477f, 7.4531f, 23.2969f, 7.4531f)
                lineTo(12.5391f, 7.4531f)
                curveTo(12.0f, 7.4531f, 11.5664f, 7.0078f, 11.5664f, 6.4688f)
                close()
                moveTo(11.5664f, 10.9922f)
                curveTo(11.5664f, 10.4531f, 12.0f, 10.0078f, 12.5391f, 10.0078f)
                lineTo(23.2969f, 10.0078f)
                curveTo(23.8477f, 10.0078f, 24.2812f, 10.4531f, 24.2812f, 10.9922f)
                curveTo(24.2812f, 11.5312f, 23.8477f, 11.9648f, 23.2969f, 11.9648f)
                lineTo(12.5391f, 11.9648f)
                curveTo(12.0f, 11.9648f, 11.5664f, 11.5312f, 11.5664f, 10.9922f)
                close()
            }
        }
        .build()
        return _facemask!!
    }

private var _facemask: ImageVector? = null
