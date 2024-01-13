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

public val CupertinoIcons.Filled.Externaldrive: ImageVector
    get() {
        if (_externaldrive != null) {
            return _externaldrive!!
        }
        _externaldrive = Builder(name = "Externaldrive", defaultWidth = 26.9648.dp, defaultHeight =
                19.6289.dp, viewportWidth = 26.9648f, viewportHeight = 19.6289f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6406f, 19.6289f)
                lineTo(22.3242f, 19.6289f)
                curveTo(25.0664f, 19.6289f, 26.9648f, 17.7422f, 26.9648f, 15.0234f)
                curveTo(26.9648f, 12.3047f, 25.0664f, 10.4062f, 22.3242f, 10.4062f)
                lineTo(4.6406f, 10.4062f)
                curveTo(1.8984f, 10.4062f, 0.0f, 12.3047f, 0.0f, 15.0234f)
                curveTo(0.0f, 17.7422f, 1.8984f, 19.6289f, 4.6406f, 19.6289f)
                close()
                moveTo(4.6406f, 8.8008f)
                lineTo(22.3242f, 8.8008f)
                curveTo(23.4258f, 8.8008f, 24.4336f, 9.0469f, 25.3008f, 9.4922f)
                lineTo(22.5f, 2.7305f)
                curveTo(21.7734f, 0.9609f, 20.2383f, 0.0117f, 18.2109f, 0.0117f)
                lineTo(8.7539f, 0.0117f)
                curveTo(6.7266f, 0.0117f, 5.1914f, 0.9609f, 4.4648f, 2.7305f)
                lineTo(1.6523f, 9.4922f)
                curveTo(2.5313f, 9.0469f, 3.5391f, 8.8008f, 4.6406f, 8.8008f)
                close()
                moveTo(20.6367f, 15.0234f)
                curveTo(20.6367f, 14.2148f, 21.3281f, 13.5234f, 22.1602f, 13.5234f)
                curveTo(22.957f, 13.5234f, 23.6602f, 14.2148f, 23.6602f, 15.0234f)
                curveTo(23.6602f, 15.8555f, 22.957f, 16.5234f, 22.1602f, 16.5234f)
                curveTo(21.3281f, 16.5352f, 20.6367f, 15.8672f, 20.6367f, 15.0234f)
                close()
            }
        }
        .build()
        return _externaldrive!!
    }

private var _externaldrive: ImageVector? = null
