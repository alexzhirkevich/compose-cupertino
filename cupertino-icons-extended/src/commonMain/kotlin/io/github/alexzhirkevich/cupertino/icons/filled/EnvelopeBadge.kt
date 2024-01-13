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

public val CupertinoIcons.Filled.EnvelopeBadge: ImageVector
    get() {
        if (_envelopeBadge != null) {
            return _envelopeBadge!!
        }
        _envelopeBadge = Builder(name = "EnvelopeBadge", defaultWidth = 28.043.dp, defaultHeight =
                24.5273.dp, viewportWidth = 28.043f, viewportHeight = 24.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 22.3711f)
                lineTo(22.5469f, 22.3711f)
                curveTo(23.5312f, 22.3711f, 24.2109f, 22.1836f, 24.5977f, 21.8086f)
                lineTo(16.1484f, 13.4414f)
                lineTo(15.375f, 14.2266f)
                curveTo(14.5781f, 15.0117f, 13.8047f, 15.3516f, 12.9609f, 15.3516f)
                curveTo(12.1055f, 15.3516f, 11.332f, 15.0117f, 10.5469f, 14.2266f)
                lineTo(9.7617f, 13.4414f)
                lineTo(1.3359f, 21.7969f)
                curveTo(1.7813f, 22.1836f, 2.5547f, 22.3711f, 3.6797f, 22.3711f)
                close()
                moveTo(0.293f, 20.4844f)
                lineTo(8.5781f, 12.293f)
                lineTo(0.2695f, 4.1016f)
                curveTo(0.0938f, 4.4297f, 0.0f, 4.9922f, 0.0f, 5.8008f)
                lineTo(0.0f, 18.7383f)
                curveTo(0.0f, 19.5703f, 0.0938f, 20.1562f, 0.293f, 20.4844f)
                close()
                moveTo(18.6328f, 2.1797f)
                lineTo(3.3281f, 2.1797f)
                curveTo(2.3438f, 2.1797f, 1.6523f, 2.3672f, 1.2539f, 2.7539f)
                lineTo(11.5195f, 12.8906f)
                curveTo(12.0234f, 13.3945f, 12.4688f, 13.6289f, 12.9609f, 13.6289f)
                curveTo(13.4414f, 13.6289f, 13.8867f, 13.3828f, 14.4023f, 12.8906f)
                lineTo(19.6289f, 7.7227f)
                curveTo(18.7969f, 6.75f, 18.293f, 5.4727f, 18.293f, 4.0781f)
                curveTo(18.293f, 3.4102f, 18.4102f, 2.7773f, 18.6328f, 2.1797f)
                close()
                moveTo(20.8594f, 8.8125f)
                lineTo(17.3438f, 12.293f)
                lineTo(25.5938f, 20.4609f)
                curveTo(25.7812f, 20.1328f, 25.875f, 19.5586f, 25.875f, 18.7383f)
                lineTo(25.875f, 9.4219f)
                curveTo(25.2891f, 9.6328f, 24.6445f, 9.7617f, 23.9766f, 9.7617f)
                curveTo(22.8281f, 9.7617f, 21.75f, 9.4102f, 20.8594f, 8.8125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9648f, 8.1563f)
                curveTo(26.2031f, 8.1563f, 28.043f, 6.3047f, 28.043f, 4.0781f)
                curveTo(28.043f, 1.8516f, 26.2031f, 0.0f, 23.9648f, 0.0f)
                curveTo(21.7266f, 0.0f, 19.8984f, 1.8398f, 19.8984f, 4.0781f)
                curveTo(19.8984f, 6.3164f, 21.7266f, 8.1563f, 23.9648f, 8.1563f)
                close()
                moveTo(23.9648f, 6.3047f)
                curveTo(22.7461f, 6.3047f, 21.75f, 5.2969f, 21.75f, 4.0781f)
                curveTo(21.75f, 2.8594f, 22.7461f, 1.8516f, 23.9648f, 1.8516f)
                curveTo(25.1836f, 1.8516f, 26.1914f, 2.8711f, 26.1914f, 4.0781f)
                curveTo(26.1914f, 5.2852f, 25.1836f, 6.3047f, 23.9648f, 6.3047f)
                close()
            }
        }
        .build()
        return _envelopeBadge!!
    }

private var _envelopeBadge: ImageVector? = null
