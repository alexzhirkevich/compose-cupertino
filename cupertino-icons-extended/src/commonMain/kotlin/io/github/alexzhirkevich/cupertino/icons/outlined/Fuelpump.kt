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

public val CupertinoIcons.Outlined.Fuelpump: ImageVector
    get() {
        if (_fuelpump != null) {
            return _fuelpump!!
        }
        _fuelpump = Builder(name = "Fuelpump", defaultWidth = 24.7266.dp, defaultHeight =
                26.1445.dp, viewportWidth = 24.7266f, viewportHeight = 26.1445f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4102f, 25.2656f)
                lineTo(18.4102f, 2.9766f)
                curveTo(18.4102f, 1.0547f, 17.3555f, 0.0f, 15.4336f, 0.0f)
                lineTo(4.8047f, 0.0f)
                curveTo(2.8711f, 0.0f, 1.8516f, 1.0547f, 1.8516f, 2.9766f)
                lineTo(1.8516f, 25.2656f)
                lineTo(3.7266f, 25.2656f)
                lineTo(3.7383f, 3.0f)
                curveTo(3.7383f, 2.2734f, 4.0898f, 1.8867f, 4.8398f, 1.8867f)
                lineTo(15.3984f, 1.8867f)
                curveTo(16.125f, 1.8867f, 16.5117f, 2.2617f, 16.5117f, 3.0f)
                lineTo(16.5117f, 25.2656f)
                close()
                moveTo(0.0f, 25.1836f)
                curveTo(0.0f, 25.7109f, 0.4102f, 26.1445f, 0.9258f, 26.1445f)
                lineTo(19.3125f, 26.1445f)
                curveTo(19.8281f, 26.1445f, 20.25f, 25.7109f, 20.25f, 25.1836f)
                curveTo(20.25f, 24.6797f, 19.8281f, 24.2578f, 19.3125f, 24.2578f)
                lineTo(0.9258f, 24.2578f)
                curveTo(0.4219f, 24.2578f, 0.0f, 24.668f, 0.0f, 25.1836f)
                close()
                moveTo(6.375f, 12.9023f)
                lineTo(13.8633f, 12.9023f)
                curveTo(14.6484f, 12.9023f, 15.1875f, 12.4336f, 15.1875f, 11.7188f)
                lineTo(15.1875f, 4.6172f)
                curveTo(15.1875f, 3.9023f, 14.6367f, 3.4102f, 13.8633f, 3.4102f)
                lineTo(6.375f, 3.4102f)
                curveTo(5.6016f, 3.4102f, 5.0742f, 3.9023f, 5.0742f, 4.6172f)
                lineTo(5.0742f, 11.7188f)
                curveTo(5.0742f, 12.4336f, 5.6016f, 12.9023f, 6.375f, 12.9023f)
                close()
                moveTo(17.5078f, 15.4336f)
                lineTo(18.5273f, 15.4336f)
                curveTo(19.0664f, 15.4336f, 19.3945f, 15.7383f, 19.3945f, 16.3242f)
                lineTo(19.3945f, 20.2031f)
                curveTo(19.3945f, 21.8672f, 20.4023f, 22.875f, 22.0664f, 22.875f)
                curveTo(23.7305f, 22.875f, 24.7266f, 21.8672f, 24.7266f, 20.2031f)
                lineTo(24.7266f, 5.8477f)
                curveTo(24.7266f, 5.1445f, 24.5391f, 4.6055f, 24.1992f, 4.0664f)
                lineTo(22.5938f, 1.4648f)
                curveTo(21.9961f, 0.5156f, 20.6016f, 1.3711f, 21.1875f, 2.332f)
                lineTo(22.5703f, 4.5586f)
                curveTo(22.6992f, 4.7695f, 22.6875f, 5.0156f, 22.5469f, 5.2266f)
                lineTo(21.0117f, 7.3711f)
                curveTo(20.5078f, 8.0625f, 20.5781f, 8.7188f, 21.1055f, 9.3398f)
                lineTo(23.0742f, 11.625f)
                lineTo(23.0742f, 20.2031f)
                curveTo(23.0742f, 20.8359f, 22.6875f, 21.2227f, 22.0664f, 21.2227f)
                curveTo(21.4336f, 21.2227f, 21.0586f, 20.8359f, 21.0586f, 20.2031f)
                lineTo(21.0586f, 16.3242f)
                curveTo(21.0586f, 14.707f, 20.0977f, 13.7812f, 18.5273f, 13.7812f)
                lineTo(17.5078f, 13.7812f)
                close()
            }
        }
        .build()
        return _fuelpump!!
    }

private var _fuelpump: ImageVector? = null
