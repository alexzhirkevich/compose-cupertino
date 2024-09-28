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

@file:Suppress("UnusedReceiverParameter")

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

public val CupertinoIcons.Outlined.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 32.2617.dp, defaultHeight =
                18.4336.dp, viewportWidth = 32.2617f, viewportHeight = 18.4336f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4727f, 18.4336f)
                curveTo(15.3867f, 18.4336f, 16.1602f, 17.7305f, 16.1602f, 16.4297f)
                lineTo(16.1602f, 2.0273f)
                curveTo(16.1602f, 0.7266f, 15.3867f, 0.0234f, 14.4727f, 0.0234f)
                curveTo(13.9922f, 0.0234f, 13.6055f, 0.1758f, 13.125f, 0.457f)
                lineTo(1.1836f, 7.4883f)
                curveTo(0.3516f, 7.9805f, 0.0f, 8.5547f, 0.0f, 9.2227f)
                curveTo(0.0f, 9.9023f, 0.3516f, 10.4766f, 1.1836f, 10.9688f)
                lineTo(13.125f, 18.0f)
                curveTo(13.5938f, 18.2812f, 13.9922f, 18.4336f, 14.4727f, 18.4336f)
                close()
                moveTo(13.957f, 16.2656f)
                curveTo(13.875f, 16.2656f, 13.7812f, 16.2422f, 13.6758f, 16.1719f)
                lineTo(2.5313f, 9.5625f)
                curveTo(2.3672f, 9.4688f, 2.2734f, 9.3867f, 2.2734f, 9.2227f)
                curveTo(2.2734f, 9.0703f, 2.3672f, 8.9883f, 2.5313f, 8.8945f)
                lineTo(13.6758f, 2.2852f)
                curveTo(13.793f, 2.2266f, 13.875f, 2.1914f, 13.957f, 2.1914f)
                curveTo(14.1328f, 2.1914f, 14.2734f, 2.2969f, 14.2734f, 2.543f)
                lineTo(14.2734f, 15.9141f)
                curveTo(14.2734f, 16.1602f, 14.1328f, 16.2656f, 13.957f, 16.2656f)
                close()
                moveTo(30.5742f, 18.4336f)
                curveTo(31.4883f, 18.4336f, 32.2617f, 17.7305f, 32.2617f, 16.4297f)
                lineTo(32.2617f, 2.0273f)
                curveTo(32.2617f, 0.7266f, 31.4883f, 0.0234f, 30.5742f, 0.0234f)
                curveTo(30.0938f, 0.0234f, 29.707f, 0.1758f, 29.2266f, 0.457f)
                lineTo(17.2852f, 7.4883f)
                curveTo(16.4531f, 7.9805f, 16.1016f, 8.5547f, 16.1016f, 9.2227f)
                curveTo(16.1016f, 9.9023f, 16.4531f, 10.4766f, 17.2852f, 10.9688f)
                lineTo(29.2266f, 18.0f)
                curveTo(29.6953f, 18.2812f, 30.0938f, 18.4336f, 30.5742f, 18.4336f)
                close()
                moveTo(30.0586f, 16.2656f)
                curveTo(29.9883f, 16.2656f, 29.8945f, 16.2422f, 29.7773f, 16.1719f)
                lineTo(18.6328f, 9.5625f)
                curveTo(18.4688f, 9.4688f, 18.3867f, 9.3867f, 18.3867f, 9.2227f)
                curveTo(18.3867f, 9.0703f, 18.4688f, 8.9883f, 18.6328f, 8.8945f)
                lineTo(29.7773f, 2.2852f)
                curveTo(29.8945f, 2.2266f, 29.9883f, 2.1914f, 30.0586f, 2.1914f)
                curveTo(30.2344f, 2.1914f, 30.375f, 2.2969f, 30.375f, 2.543f)
                lineTo(30.375f, 15.9141f)
                curveTo(30.375f, 16.1602f, 30.2344f, 16.2656f, 30.0586f, 16.2656f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null
