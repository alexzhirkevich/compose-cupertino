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

public val CupertinoIcons.Filled.Magazine: ImageVector
    get() {
        if (_magazine != null) {
            return _magazine!!
        }
        _magazine = Builder(name = "Magazine", defaultWidth = 20.5195.dp, defaultHeight =
                27.4805.dp, viewportWidth = 20.5195f, viewportHeight = 27.4805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.1406f)
                curveTo(0.0f, 25.0547f, 0.1992f, 25.6055f, 1.0664f, 26.0273f)
                curveTo(3.0703f, 26.8945f, 5.8359f, 27.4688f, 9.1523f, 27.4688f)
                curveTo(12.4336f, 27.4688f, 16.125f, 26.9766f, 18.7734f, 25.6875f)
                curveTo(20.1797f, 25.0195f, 20.5195f, 24.3984f, 20.5195f, 22.9453f)
                lineTo(20.5195f, 4.957f)
                curveTo(20.5195f, 3.0586f, 19.6758f, 2.1914f, 17.8477f, 2.1914f)
                lineTo(16.7461f, 2.1914f)
                lineTo(16.7461f, 1.7227f)
                curveTo(16.7461f, 0.5625f, 16.1602f, 0.0f, 15.1289f, 0.0f)
                curveTo(14.7773f, 0.0f, 14.3555f, 0.082f, 13.8516f, 0.2461f)
                curveTo(10.3125f, 1.4063f, 7.0781f, 2.1445f, 2.9297f, 2.1445f)
                lineTo(1.9922f, 2.1445f)
                curveTo(0.7266f, 2.1445f, 0.0f, 2.8828f, 0.0f, 4.0313f)
                close()
                moveTo(4.1602f, 11.0273f)
                lineTo(4.1602f, 7.0664f)
                curveTo(4.1602f, 6.9023f, 4.2773f, 6.7617f, 4.4414f, 6.75f)
                curveTo(7.1719f, 6.6445f, 9.6094f, 6.1641f, 12.1055f, 5.25f)
                curveTo(12.2461f, 5.1914f, 12.4922f, 5.25f, 12.4922f, 5.5313f)
                lineTo(12.4922f, 9.668f)
                curveTo(12.4922f, 9.7734f, 12.4336f, 9.8789f, 12.3281f, 9.9141f)
                curveTo(10.1484f, 10.8047f, 7.2773f, 11.3086f, 4.4414f, 11.3086f)
                curveTo(4.2891f, 11.3086f, 4.1602f, 11.2148f, 4.1602f, 11.0273f)
                close()
                moveTo(4.7578f, 25.4648f)
                curveTo(9.3633f, 25.3359f, 13.6406f, 24.0469f, 15.9609f, 22.2773f)
                curveTo(16.5f, 21.8672f, 16.7461f, 21.4453f, 16.7461f, 20.4141f)
                lineTo(16.7461f, 4.0781f)
                lineTo(17.8594f, 4.0781f)
                curveTo(18.375f, 4.0781f, 18.6328f, 4.3594f, 18.6328f, 4.957f)
                lineTo(18.6328f, 22.8164f)
                curveTo(18.6328f, 23.5195f, 18.5273f, 23.7773f, 17.8594f, 24.0703f)
                curveTo(15.5273f, 25.0898f, 12.2461f, 25.7461f, 9.1523f, 25.7461f)
                curveTo(7.6758f, 25.7461f, 6.2813f, 25.6641f, 4.7578f, 25.4648f)
                close()
            }
        }
        .build()
        return _magazine!!
    }

private var _magazine: ImageVector? = null
