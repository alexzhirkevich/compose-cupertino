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

public val CupertinoIcons.Filled.Fuelpump: ImageVector
    get() {
        if (_fuelpump != null) {
            return _fuelpump!!
        }
        _fuelpump = Builder(name = "Fuelpump", defaultWidth = 23.5312.dp, defaultHeight =
                26.1445.dp, viewportWidth = 23.5312f, viewportHeight = 26.1445f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2148f, 25.2656f)
                lineTo(17.2148f, 2.9766f)
                curveTo(17.2148f, 1.0547f, 16.1602f, 0.0f, 14.25f, 0.0f)
                lineTo(4.8047f, 0.0f)
                curveTo(2.8711f, 0.0f, 1.8516f, 1.0547f, 1.8516f, 2.9766f)
                lineTo(1.8516f, 25.2656f)
                close()
                moveTo(5.1914f, 12.2344f)
                curveTo(4.3359f, 12.2344f, 3.8203f, 11.7656f, 3.8203f, 10.9805f)
                lineTo(3.8203f, 3.2461f)
                curveTo(3.8203f, 2.4609f, 4.3359f, 1.9805f, 5.1914f, 1.9805f)
                lineTo(13.8633f, 1.9805f)
                curveTo(14.7188f, 1.9805f, 15.2461f, 2.4609f, 15.2461f, 3.2461f)
                lineTo(15.2461f, 10.9805f)
                curveTo(15.2461f, 11.7656f, 14.7188f, 12.2344f, 13.8633f, 12.2344f)
                close()
                moveTo(0.0f, 25.1836f)
                curveTo(0.0f, 25.7109f, 0.4102f, 26.1445f, 0.9258f, 26.1445f)
                lineTo(18.1172f, 26.1445f)
                curveTo(18.6328f, 26.1445f, 19.0664f, 25.7109f, 19.0664f, 25.1836f)
                curveTo(19.0664f, 24.6797f, 18.6328f, 24.2578f, 18.1172f, 24.2578f)
                lineTo(0.9258f, 24.2578f)
                curveTo(0.4219f, 24.2578f, 0.0f, 24.668f, 0.0f, 25.1836f)
                close()
                moveTo(16.3125f, 15.4336f)
                lineTo(17.332f, 15.4336f)
                curveTo(17.8711f, 15.4336f, 18.2109f, 15.7383f, 18.2109f, 16.3242f)
                lineTo(18.2109f, 20.2031f)
                curveTo(18.2109f, 21.8672f, 19.2188f, 22.875f, 20.8828f, 22.875f)
                curveTo(22.5352f, 22.875f, 23.5312f, 21.8672f, 23.5312f, 20.2031f)
                lineTo(23.5312f, 5.8477f)
                curveTo(23.5312f, 5.1445f, 23.3438f, 4.6055f, 23.0039f, 4.0664f)
                lineTo(21.3984f, 1.4648f)
                curveTo(20.8008f, 0.5156f, 19.4062f, 1.3711f, 20.0039f, 2.332f)
                lineTo(21.375f, 4.5586f)
                curveTo(21.5039f, 4.7695f, 21.4922f, 5.0156f, 21.3516f, 5.2266f)
                lineTo(19.8164f, 7.3711f)
                curveTo(19.3125f, 8.0625f, 19.3828f, 8.7188f, 19.9102f, 9.3398f)
                lineTo(21.8789f, 11.625f)
                lineTo(21.8789f, 20.2031f)
                curveTo(21.8789f, 20.8359f, 21.5039f, 21.2227f, 20.8828f, 21.2227f)
                curveTo(20.2383f, 21.2227f, 19.8633f, 20.8359f, 19.8633f, 20.2031f)
                lineTo(19.8633f, 16.3242f)
                curveTo(19.8633f, 14.707f, 18.9023f, 13.7812f, 17.332f, 13.7812f)
                lineTo(16.3125f, 13.7812f)
                close()
            }
        }
        .build()
        return _fuelpump!!
    }

private var _fuelpump: ImageVector? = null
