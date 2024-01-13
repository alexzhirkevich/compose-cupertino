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

public val CupertinoIcons.Outlined.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 18.1992.dp, defaultHeight = 28.043.dp,
                viewportWidth = 18.1992f, viewportHeight = 28.043f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1055f, 28.043f)
                curveTo(9.3867f, 28.043f, 10.1367f, 26.5547f, 10.1367f, 24.7617f)
                lineTo(10.1367f, 18.3281f)
                lineTo(8.0625f, 18.3281f)
                lineTo(8.0625f, 24.7617f)
                curveTo(8.0625f, 26.5547f, 8.8125f, 28.043f, 9.1055f, 28.043f)
                close()
                moveTo(1.7227f, 19.2891f)
                lineTo(16.4766f, 19.2891f)
                curveTo(17.5312f, 19.2891f, 18.1992f, 18.6328f, 18.1992f, 17.6367f)
                curveTo(18.1992f, 14.1914f, 14.3555f, 10.7109f, 9.1055f, 10.7109f)
                curveTo(3.8438f, 10.7109f, 0.0f, 14.1914f, 0.0f, 17.6367f)
                curveTo(0.0f, 18.6328f, 0.668f, 19.2891f, 1.7227f, 19.2891f)
                close()
                moveTo(2.1914f, 17.5195f)
                curveTo(1.9219f, 17.5195f, 1.8047f, 17.3672f, 1.8516f, 17.0508f)
                curveTo(2.1094f, 14.9414f, 4.8047f, 12.4219f, 9.1055f, 12.4219f)
                curveTo(13.3945f, 12.4219f, 16.0898f, 14.9414f, 16.3477f, 17.0508f)
                curveTo(16.3945f, 17.3672f, 16.2773f, 17.5195f, 16.0078f, 17.5195f)
                close()
                moveTo(1.4883f, 1.9688f)
                curveTo(1.4883f, 2.3086f, 1.6289f, 2.707f, 1.9336f, 3.1055f)
                curveTo(2.5313f, 3.9023f, 3.9492f, 5.0039f, 5.4258f, 5.9766f)
                lineTo(4.9922f, 12.1641f)
                lineTo(6.8672f, 12.1641f)
                lineTo(7.3008f, 5.1094f)
                curveTo(7.3125f, 4.9453f, 7.2891f, 4.8867f, 7.1719f, 4.8281f)
                curveTo(5.4141f, 3.9258f, 4.0547f, 2.8594f, 3.9609f, 2.625f)
                curveTo(3.8672f, 2.4727f, 3.9609f, 2.3789f, 4.0898f, 2.3789f)
                lineTo(14.1094f, 2.3789f)
                curveTo(14.2383f, 2.3789f, 14.332f, 2.4727f, 14.2383f, 2.625f)
                curveTo(14.1445f, 2.8594f, 12.7852f, 3.9258f, 11.0273f, 4.8281f)
                curveTo(10.9219f, 4.8867f, 10.8867f, 4.9453f, 10.9102f, 5.1094f)
                lineTo(11.332f, 12.1641f)
                lineTo(13.207f, 12.1641f)
                lineTo(12.7734f, 5.9766f)
                curveTo(14.2617f, 5.0039f, 15.668f, 3.9023f, 16.2656f, 3.1055f)
                curveTo(16.582f, 2.707f, 16.7227f, 2.3086f, 16.7227f, 1.9688f)
                curveTo(16.7227f, 1.2539f, 16.1719f, 0.7266f, 15.3516f, 0.7266f)
                lineTo(2.8594f, 0.7266f)
                curveTo(2.0273f, 0.7266f, 1.4883f, 1.2539f, 1.4883f, 1.9688f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
