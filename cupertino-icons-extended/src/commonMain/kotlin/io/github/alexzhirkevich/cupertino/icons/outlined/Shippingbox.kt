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

public val CupertinoIcons.Outlined.Shippingbox: ImageVector
    get() {
        if (_shippingbox != null) {
            return _shippingbox!!
        }
        _shippingbox = Builder(name = "Shippingbox", defaultWidth = 23.6602.dp, defaultHeight =
                25.793.dp, viewportWidth = 23.6602f, viewportHeight = 25.793f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6406f, 20.2852f)
                lineTo(10.8633f, 25.5117f)
                curveTo(11.5195f, 25.8867f, 12.1406f, 25.8867f, 12.8086f, 25.5117f)
                lineTo(22.0195f, 20.2852f)
                curveTo(23.0977f, 19.6641f, 23.6602f, 19.0547f, 23.6602f, 17.3789f)
                lineTo(23.6602f, 8.0977f)
                curveTo(23.6602f, 6.8789f, 23.2148f, 6.1289f, 22.2305f, 5.5547f)
                lineTo(13.9336f, 0.8438f)
                curveTo(12.5156f, 0.0352f, 11.1445f, 0.0352f, 9.7266f, 0.8438f)
                lineTo(1.4414f, 5.5547f)
                curveTo(0.4453f, 6.1289f, 0.0f, 6.8789f, 0.0f, 8.0977f)
                lineTo(0.0f, 17.3789f)
                curveTo(0.0f, 19.0547f, 0.5742f, 19.6641f, 1.6406f, 20.2852f)
                close()
                moveTo(2.6953f, 18.7383f)
                curveTo(2.0156f, 18.3516f, 1.7813f, 17.9648f, 1.7813f, 17.3203f)
                lineTo(1.7813f, 8.4727f)
                lineTo(10.9102f, 13.6875f)
                lineTo(10.9102f, 23.4141f)
                close()
                moveTo(20.9766f, 18.7383f)
                lineTo(12.75f, 23.4141f)
                lineTo(12.75f, 13.6875f)
                lineTo(21.8789f, 8.4727f)
                lineTo(21.8789f, 17.3203f)
                curveTo(21.8789f, 17.9648f, 21.6445f, 18.3516f, 20.9766f, 18.7383f)
                close()
                moveTo(11.8359f, 12.0469f)
                lineTo(2.7891f, 6.9258f)
                lineTo(6.4102f, 4.8516f)
                lineTo(15.457f, 9.9961f)
                close()
                moveTo(17.3438f, 8.9297f)
                lineTo(8.2617f, 3.7969f)
                lineTo(10.5117f, 2.5195f)
                curveTo(11.4141f, 2.0039f, 12.2461f, 1.9922f, 13.1602f, 2.5195f)
                lineTo(20.8828f, 6.9258f)
                close()
            }
        }
        .build()
        return _shippingbox!!
    }

private var _shippingbox: ImageVector? = null
