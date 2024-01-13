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

public val CupertinoIcons.Filled.CupAndSaucer: ImageVector
    get() {
        if (_cupAndSaucer != null) {
            return _cupAndSaucer!!
        }
        _cupAndSaucer = Builder(name = "CupAndSaucer", defaultWidth = 30.4453.dp, defaultHeight =
                22.793.dp, viewportWidth = 30.4453f, viewportHeight = 22.793f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7539f, 17.1797f)
                lineTo(15.8086f, 17.1797f)
                curveTo(21.668f, 17.1797f, 25.6172f, 13.2305f, 25.6172f, 7.1016f)
                lineTo(25.6172f, 4.7227f)
                curveTo(25.6172f, 1.9336f, 21.4453f, 0.0352f, 15.2812f, 0.0352f)
                curveTo(9.1172f, 0.0352f, 4.9453f, 1.9336f, 4.9453f, 4.7227f)
                lineTo(4.9453f, 7.1016f)
                curveTo(4.9453f, 13.0195f, 8.8828f, 17.1797f, 14.7539f, 17.1797f)
                close()
                moveTo(15.2812f, 7.582f)
                curveTo(10.3828f, 7.582f, 6.7734f, 6.3398f, 6.7734f, 4.7227f)
                curveTo(6.7734f, 3.1172f, 10.3828f, 1.8633f, 15.2812f, 1.8633f)
                curveTo(20.1914f, 1.8633f, 23.8008f, 3.1172f, 23.8008f, 4.7227f)
                curveTo(23.8008f, 6.3398f, 20.1914f, 7.582f, 15.2812f, 7.582f)
                close()
                moveTo(24.3516f, 12.0f)
                lineTo(25.2773f, 12.0f)
                curveTo(27.8906f, 12.0f, 29.4609f, 10.6289f, 29.4609f, 8.3555f)
                curveTo(29.4609f, 6.0938f, 27.8789f, 4.7109f, 25.2773f, 4.7109f)
                lineTo(24.5273f, 4.7109f)
                lineTo(24.5273f, 6.5273f)
                lineTo(25.2773f, 6.5273f)
                curveTo(26.7656f, 6.5273f, 27.6328f, 7.207f, 27.6328f, 8.3555f)
                curveTo(27.6328f, 9.4922f, 26.7656f, 10.1836f, 25.2773f, 10.1836f)
                lineTo(24.3516f, 10.1836f)
                close()
                moveTo(15.2227f, 22.793f)
                curveTo(24.1289f, 22.793f, 30.4453f, 20.2617f, 30.4453f, 16.582f)
                curveTo(30.4453f, 15.1523f, 29.4727f, 13.8984f, 27.7617f, 12.8906f)
                curveTo(27.0586f, 13.1836f, 26.2852f, 13.3477f, 25.4062f, 13.3711f)
                curveTo(23.543f, 16.6172f, 20.1328f, 18.5508f, 15.8086f, 18.5508f)
                lineTo(14.7539f, 18.5508f)
                curveTo(9.9375f, 18.5508f, 6.1758f, 15.9961f, 4.5f, 12.0f)
                curveTo(1.6523f, 13.1016f, 0.0f, 14.6953f, 0.0f, 16.582f)
                curveTo(0.0f, 20.2617f, 6.3281f, 22.793f, 15.2227f, 22.793f)
                close()
            }
        }
        .build()
        return _cupAndSaucer!!
    }

private var _cupAndSaucer: ImageVector? = null
