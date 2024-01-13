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

public val CupertinoIcons.Outlined.Puzzlepiece: ImageVector
    get() {
        if (_puzzlepiece != null) {
            return _puzzlepiece!!
        }
        _puzzlepiece = Builder(name = "Puzzlepiece", defaultWidth = 34.5.dp, defaultHeight =
                22.6992.dp, viewportWidth = 34.5f, viewportHeight = 22.6992f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6992f, 22.6523f)
                lineTo(14.5898f, 22.6523f)
                curveTo(15.5625f, 22.6523f, 16.1836f, 22.0078f, 16.1836f, 21.1992f)
                curveTo(16.1836f, 20.7539f, 15.9961f, 20.2969f, 15.5742f, 19.8398f)
                curveTo(15.0586f, 19.2773f, 14.7422f, 18.6211f, 14.7422f, 17.9414f)
                curveTo(14.7422f, 16.582f, 15.7148f, 15.4688f, 17.25f, 15.4688f)
                curveTo(18.7852f, 15.4688f, 19.7578f, 16.582f, 19.7578f, 17.9414f)
                curveTo(19.7578f, 18.6211f, 19.4297f, 19.2773f, 18.9141f, 19.8398f)
                curveTo(18.5039f, 20.2969f, 18.3164f, 20.7539f, 18.3164f, 21.1992f)
                curveTo(18.3164f, 22.0078f, 18.9375f, 22.6523f, 19.9102f, 22.6523f)
                lineTo(23.7891f, 22.6523f)
                curveTo(26.1445f, 22.6523f, 27.375f, 21.4453f, 27.375f, 19.125f)
                lineTo(27.375f, 14.9883f)
                curveTo(27.375f, 14.8008f, 27.5039f, 14.707f, 27.7148f, 14.8594f)
                curveTo(28.4648f, 15.3867f, 29.3203f, 15.7617f, 30.293f, 15.7617f)
                curveTo(32.5078f, 15.7617f, 34.5f, 13.9805f, 34.5f, 11.3672f)
                curveTo(34.5f, 8.7656f, 32.5078f, 6.9844f, 30.293f, 6.9844f)
                curveTo(29.3203f, 6.9844f, 28.4648f, 7.3594f, 27.7148f, 7.8867f)
                curveTo(27.5039f, 8.0391f, 27.375f, 7.9453f, 27.375f, 7.7578f)
                lineTo(27.375f, 3.5273f)
                curveTo(27.375f, 1.207f, 26.1445f, 0.0f, 23.7891f, 0.0f)
                lineTo(19.9102f, 0.0f)
                curveTo(18.9375f, 0.0f, 18.3164f, 0.6445f, 18.3164f, 1.4531f)
                curveTo(18.3164f, 1.8984f, 18.5039f, 2.3555f, 18.9141f, 2.8125f)
                curveTo(19.4297f, 3.3867f, 19.7578f, 4.0313f, 19.7578f, 4.7227f)
                curveTo(19.7578f, 6.0586f, 18.7617f, 7.1836f, 17.25f, 7.1836f)
                curveTo(15.7383f, 7.1836f, 14.7422f, 6.0586f, 14.7422f, 4.7227f)
                curveTo(14.7422f, 4.0313f, 15.0586f, 3.3867f, 15.5742f, 2.8125f)
                curveTo(15.9961f, 2.3555f, 16.1836f, 1.8984f, 16.1836f, 1.4531f)
                curveTo(16.1836f, 0.6445f, 15.5625f, 0.0f, 14.5898f, 0.0f)
                lineTo(10.6992f, 0.0f)
                curveTo(8.3555f, 0.0f, 7.125f, 1.207f, 7.125f, 3.5273f)
                lineTo(7.125f, 7.7578f)
                curveTo(7.125f, 7.9453f, 6.9961f, 8.0391f, 6.7852f, 7.8867f)
                curveTo(6.0352f, 7.3594f, 5.1797f, 6.9844f, 4.1953f, 6.9844f)
                curveTo(1.9922f, 6.9844f, 0.0f, 8.7656f, 0.0f, 11.3672f)
                curveTo(0.0f, 13.9805f, 1.9922f, 15.7617f, 4.1953f, 15.7617f)
                curveTo(5.1797f, 15.7617f, 6.0352f, 15.3867f, 6.7852f, 14.8594f)
                curveTo(6.9961f, 14.707f, 7.125f, 14.8008f, 7.125f, 14.9883f)
                lineTo(7.125f, 19.125f)
                curveTo(7.125f, 21.4453f, 8.3555f, 22.6523f, 10.6992f, 22.6523f)
                close()
                moveTo(10.7344f, 20.7656f)
                curveTo(9.6563f, 20.7656f, 9.0117f, 20.1562f, 9.0117f, 19.0312f)
                lineTo(9.0117f, 14.0391f)
                curveTo(9.0117f, 13.0547f, 8.3672f, 12.4336f, 7.5586f, 12.4336f)
                curveTo(7.1133f, 12.4336f, 6.6563f, 12.6211f, 6.1992f, 13.043f)
                curveTo(5.625f, 13.5586f, 4.9805f, 13.8867f, 4.2891f, 13.8867f)
                curveTo(2.9531f, 13.8867f, 1.8281f, 12.8906f, 1.8281f, 11.3672f)
                curveTo(1.8281f, 9.8555f, 2.9531f, 8.8594f, 4.2891f, 8.8594f)
                curveTo(4.9805f, 8.8594f, 5.625f, 9.1875f, 6.1992f, 9.7031f)
                curveTo(6.6563f, 10.125f, 7.1133f, 10.3125f, 7.5586f, 10.3125f)
                curveTo(8.3672f, 10.3125f, 9.0117f, 9.6914f, 9.0117f, 8.707f)
                lineTo(9.0117f, 3.6211f)
                curveTo(9.0117f, 2.5078f, 9.6563f, 1.8867f, 10.7344f, 1.8867f)
                lineTo(13.4297f, 1.8867f)
                curveTo(13.9805f, 1.8867f, 13.8047f, 2.168f, 13.6641f, 2.3906f)
                curveTo(13.207f, 3.1055f, 12.8672f, 3.8906f, 12.8672f, 4.8164f)
                curveTo(12.8672f, 7.0195f, 14.6367f, 9.0117f, 17.25f, 9.0117f)
                curveTo(19.8633f, 9.0117f, 21.6328f, 7.0195f, 21.6328f, 4.8164f)
                curveTo(21.6328f, 3.8906f, 21.293f, 3.1055f, 20.8359f, 2.3906f)
                curveTo(20.6953f, 2.168f, 20.5195f, 1.8867f, 21.0703f, 1.8867f)
                lineTo(23.7656f, 1.8867f)
                curveTo(24.8438f, 1.8867f, 25.4883f, 2.5078f, 25.4883f, 3.6211f)
                lineTo(25.4883f, 8.707f)
                curveTo(25.4883f, 9.6914f, 26.1328f, 10.3125f, 26.9414f, 10.3125f)
                curveTo(27.3867f, 10.3125f, 27.8438f, 10.125f, 28.3008f, 9.7031f)
                curveTo(28.8633f, 9.1875f, 29.5195f, 8.8594f, 30.1992f, 8.8594f)
                curveTo(31.5469f, 8.8594f, 32.6719f, 9.8555f, 32.6719f, 11.3672f)
                curveTo(32.6719f, 12.8906f, 31.5469f, 13.8867f, 30.1992f, 13.8867f)
                curveTo(29.5195f, 13.8867f, 28.8633f, 13.5586f, 28.3008f, 13.043f)
                curveTo(27.8438f, 12.6211f, 27.3867f, 12.4336f, 26.9414f, 12.4336f)
                curveTo(26.1328f, 12.4336f, 25.4883f, 13.0547f, 25.4883f, 14.0391f)
                lineTo(25.4883f, 19.0312f)
                curveTo(25.4883f, 20.1562f, 24.8438f, 20.7656f, 23.7656f, 20.7656f)
                lineTo(21.0703f, 20.7656f)
                curveTo(20.5195f, 20.7656f, 20.6953f, 20.4844f, 20.8359f, 20.2617f)
                curveTo(21.293f, 19.5469f, 21.6328f, 18.7617f, 21.6328f, 17.8477f)
                curveTo(21.6328f, 15.6094f, 19.8867f, 13.6406f, 17.25f, 13.6406f)
                curveTo(14.6133f, 13.6406f, 12.8672f, 15.6094f, 12.8672f, 17.8477f)
                curveTo(12.8672f, 18.7617f, 13.207f, 19.5469f, 13.6641f, 20.2617f)
                curveTo(13.8047f, 20.4844f, 13.9805f, 20.7656f, 13.4297f, 20.7656f)
                close()
            }
        }
        .build()
        return _puzzlepiece!!
    }

private var _puzzlepiece: ImageVector? = null
