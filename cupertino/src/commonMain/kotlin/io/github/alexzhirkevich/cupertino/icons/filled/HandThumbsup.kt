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

public val CupertinoIcons.Filled.HandThumbsup: ImageVector
    get() {
        if (_handThumbsup != null) {
            return _handThumbsup!!
        }
        _handThumbsup = Builder(name = "HandThumbsup", defaultWidth = 23.0977.dp, defaultHeight =
                24.668.dp, viewportWidth = 23.0977f, viewportHeight = 24.668f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.4883f)
                curveTo(0.0f, 19.957f, 2.168f, 22.8633f, 5.0742f, 22.8633f)
                lineTo(7.1367f, 22.8633f)
                curveTo(5.0273f, 21.3281f, 4.1602f, 19.0078f, 4.1602f, 16.3711f)
                curveTo(4.1719f, 13.4414f, 5.3086f, 11.3438f, 6.3164f, 10.0781f)
                lineTo(4.6406f, 10.0781f)
                curveTo(2.0273f, 10.0781f, 0.0f, 12.8906f, 0.0f, 16.4883f)
                close()
                moveTo(5.7773f, 16.3945f)
                curveTo(5.7773f, 20.6719f, 9.1172f, 23.9766f, 14.5664f, 23.9766f)
                lineTo(16.1602f, 23.9766f)
                curveTo(17.6719f, 23.9766f, 18.7969f, 23.8711f, 19.4297f, 23.6953f)
                curveTo(20.3438f, 23.4727f, 21.2227f, 22.9102f, 21.2227f, 21.8086f)
                curveTo(21.2227f, 21.3516f, 21.1055f, 21.0234f, 20.9648f, 20.7773f)
                curveTo(20.8711f, 20.625f, 20.8945f, 20.5078f, 21.0352f, 20.4492f)
                curveTo(21.7617f, 20.1445f, 22.3594f, 19.4648f, 22.3594f, 18.5391f)
                curveTo(22.3594f, 18.0117f, 22.207f, 17.543f, 21.9492f, 17.2266f)
                curveTo(21.8203f, 17.0508f, 21.832f, 16.8867f, 22.0547f, 16.7695f)
                curveTo(22.5703f, 16.4648f, 22.9453f, 15.8086f, 22.9453f, 15.0469f)
                curveTo(22.9453f, 14.4961f, 22.7695f, 13.9219f, 22.4648f, 13.6406f)
                curveTo(22.2773f, 13.4766f, 22.3125f, 13.3594f, 22.5f, 13.1836f)
                curveTo(22.8633f, 12.8789f, 23.0977f, 12.3516f, 23.0977f, 11.6836f)
                curveTo(23.0977f, 10.5586f, 22.2188f, 9.6328f, 21.0586f, 9.6328f)
                lineTo(16.9336f, 9.6328f)
                curveTo(15.8906f, 9.6328f, 15.1992f, 9.0938f, 15.1992f, 8.2266f)
                curveTo(15.1992f, 6.668f, 17.1562f, 3.7852f, 17.1562f, 1.7227f)
                curveTo(17.1562f, 0.6328f, 16.4531f, 0.0f, 15.5391f, 0.0f)
                curveTo(14.6953f, 0.0f, 14.2852f, 0.5742f, 13.8398f, 1.4531f)
                curveTo(12.0938f, 4.8398f, 9.7734f, 7.582f, 8.0039f, 9.9258f)
                curveTo(6.5039f, 11.918f, 5.7773f, 13.6406f, 5.7773f, 16.3945f)
                close()
            }
        }
        .build()
        return _handThumbsup!!
    }

private var _handThumbsup: ImageVector? = null
