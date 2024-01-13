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

public val CupertinoIcons.Filled.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 26.9883.dp, defaultHeight = 21.5273.dp,
                viewportWidth = 26.9883f, viewportHeight = 21.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6094f, 0.0f)
                curveTo(4.0313f, 0.0f, 1.3477f, 1.1953f, 0.1406f, 3.2695f)
                curveTo(0.0117f, 3.5039f, 0.0f, 3.6563f, 0.0f, 4.0898f)
                lineTo(0.0f, 20.625f)
                curveTo(0.0f, 21.1641f, 0.3398f, 21.4922f, 0.9258f, 21.4922f)
                curveTo(1.207f, 21.4922f, 1.4766f, 21.4102f, 1.6875f, 21.2109f)
                curveTo(3.1641f, 19.9453f, 5.1211f, 19.2891f, 7.0781f, 19.2891f)
                curveTo(8.9063f, 19.2891f, 10.6055f, 19.9336f, 11.8477f, 21.0f)
                curveTo(11.9766f, 21.1055f, 12.1289f, 21.1641f, 12.2578f, 21.1641f)
                curveTo(12.5156f, 21.1641f, 12.7266f, 20.9766f, 12.7266f, 20.6719f)
                lineTo(12.7266f, 3.3398f)
                curveTo(12.7266f, 3.0352f, 12.7031f, 2.9648f, 12.4805f, 2.6484f)
                curveTo(11.332f, 0.9961f, 9.082f, 0.0f, 6.6094f, 0.0f)
                close()
                moveTo(20.3789f, 0.0f)
                curveTo(17.9062f, 0.0f, 15.6562f, 0.9961f, 14.5078f, 2.6484f)
                curveTo(14.2852f, 2.9648f, 14.2617f, 3.0352f, 14.2617f, 3.3398f)
                lineTo(14.2617f, 20.6719f)
                curveTo(14.2617f, 20.9766f, 14.4727f, 21.1641f, 14.7305f, 21.1641f)
                curveTo(14.8594f, 21.1641f, 15.0234f, 21.1055f, 15.1406f, 21.0f)
                curveTo(16.3828f, 19.9336f, 18.082f, 19.2891f, 19.9102f, 19.2891f)
                curveTo(21.8672f, 19.2891f, 23.8242f, 19.9453f, 25.3008f, 21.2109f)
                curveTo(25.5117f, 21.4102f, 25.7812f, 21.4922f, 26.0625f, 21.4922f)
                curveTo(26.6484f, 21.4922f, 26.9883f, 21.1641f, 26.9883f, 20.625f)
                lineTo(26.9883f, 4.0898f)
                curveTo(26.9883f, 3.6563f, 26.9766f, 3.4922f, 26.8477f, 3.2695f)
                curveTo(25.6406f, 1.1953f, 22.957f, 0.0f, 20.3789f, 0.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
