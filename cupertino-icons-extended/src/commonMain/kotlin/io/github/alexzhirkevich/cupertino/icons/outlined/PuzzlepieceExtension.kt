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

public val CupertinoIcons.Outlined.PuzzlepieceExtension: ImageVector
    get() {
        if (_puzzlepieceExtension != null) {
            return _puzzlepieceExtension!!
        }
        _puzzlepieceExtension = Builder(name = "PuzzlepieceExtension", defaultWidth = 28.6875.dp,
                defaultHeight = 22.6992.dp, viewportWidth = 28.6875f, viewportHeight =
                22.6992f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.125f)
                curveTo(0.0f, 21.4453f, 1.2305f, 22.6523f, 3.5859f, 22.6523f)
                lineTo(17.9883f, 22.6523f)
                curveTo(20.332f, 22.6523f, 21.5625f, 21.4453f, 21.5625f, 19.125f)
                lineTo(21.5625f, 14.9883f)
                curveTo(21.5625f, 14.8008f, 21.6914f, 14.707f, 21.9141f, 14.8594f)
                curveTo(22.6523f, 15.3867f, 23.5078f, 15.7617f, 24.4922f, 15.7617f)
                curveTo(26.707f, 15.7617f, 28.6875f, 13.9805f, 28.6875f, 11.3672f)
                curveTo(28.6875f, 8.7656f, 26.707f, 6.9844f, 24.4922f, 6.9844f)
                curveTo(23.5078f, 6.9844f, 22.6523f, 7.3594f, 21.9141f, 7.8867f)
                curveTo(21.6914f, 8.0391f, 21.5625f, 7.9453f, 21.5625f, 7.7578f)
                lineTo(21.5625f, 3.5273f)
                curveTo(21.5625f, 1.207f, 20.332f, 0.0f, 17.9883f, 0.0f)
                lineTo(3.5859f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.207f, 0.0f, 3.5273f)
                lineTo(0.0f, 8.707f)
                curveTo(0.0f, 9.6914f, 0.6445f, 10.2773f, 1.4531f, 10.2773f)
                curveTo(1.8984f, 10.2773f, 2.3555f, 10.0898f, 2.8125f, 9.668f)
                curveTo(3.3867f, 9.1523f, 4.0313f, 8.8359f, 4.7227f, 8.8359f)
                curveTo(6.0586f, 8.8359f, 7.1836f, 9.832f, 7.1836f, 11.3438f)
                curveTo(7.1836f, 12.8555f, 6.0586f, 13.8516f, 4.7227f, 13.8516f)
                curveTo(4.0313f, 13.8516f, 3.3867f, 13.5234f, 2.8125f, 13.0078f)
                curveTo(2.3555f, 12.5977f, 1.8984f, 12.4102f, 1.4531f, 12.4102f)
                curveTo(0.6445f, 12.4102f, 0.0f, 12.9961f, 0.0f, 13.9688f)
                close()
                moveTo(1.8867f, 19.0312f)
                lineTo(1.8867f, 15.1289f)
                curveTo(1.8867f, 14.5781f, 2.168f, 14.7891f, 2.3906f, 14.9297f)
                curveTo(3.1055f, 15.3867f, 3.8906f, 15.7266f, 4.8164f, 15.7266f)
                curveTo(7.0195f, 15.7266f, 9.0117f, 13.957f, 9.0117f, 11.3438f)
                curveTo(9.0117f, 8.7305f, 7.0195f, 6.9609f, 4.8164f, 6.9609f)
                curveTo(3.8906f, 6.9609f, 3.1055f, 7.3008f, 2.3906f, 7.7578f)
                curveTo(2.168f, 7.8984f, 1.8867f, 8.1094f, 1.8867f, 7.5586f)
                lineTo(1.8867f, 3.6211f)
                curveTo(1.8867f, 2.5078f, 2.5313f, 1.8867f, 3.6211f, 1.8867f)
                lineTo(17.9531f, 1.8867f)
                curveTo(19.043f, 1.8867f, 19.6758f, 2.5078f, 19.6758f, 3.6211f)
                lineTo(19.6758f, 8.707f)
                curveTo(19.6758f, 9.6914f, 20.3203f, 10.3125f, 21.1289f, 10.3125f)
                curveTo(21.5742f, 10.3125f, 22.0312f, 10.125f, 22.4883f, 9.7031f)
                curveTo(23.0625f, 9.1875f, 23.707f, 8.8594f, 24.3984f, 8.8594f)
                curveTo(25.7344f, 8.8594f, 26.8594f, 9.8555f, 26.8594f, 11.3672f)
                curveTo(26.8594f, 12.8906f, 25.7344f, 13.8867f, 24.3984f, 13.8867f)
                curveTo(23.707f, 13.8867f, 23.0625f, 13.5586f, 22.4883f, 13.043f)
                curveTo(22.0312f, 12.6211f, 21.5742f, 12.4336f, 21.1289f, 12.4336f)
                curveTo(20.3203f, 12.4336f, 19.6758f, 13.0547f, 19.6758f, 14.0391f)
                lineTo(19.6758f, 19.0312f)
                curveTo(19.6758f, 20.1562f, 19.043f, 20.7656f, 17.9531f, 20.7656f)
                lineTo(3.6211f, 20.7656f)
                curveTo(2.5313f, 20.7656f, 1.8867f, 20.1562f, 1.8867f, 19.0312f)
                close()
            }
        }
        .build()
        return _puzzlepieceExtension!!
    }

private var _puzzlepieceExtension: ImageVector? = null
