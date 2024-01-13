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

public val CupertinoIcons.Filled.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 18.1992.dp, defaultHeight = 28.043.dp,
                viewportWidth = 18.1992f, viewportHeight = 28.043f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.6367f)
                curveTo(0.0f, 18.6328f, 0.668f, 19.2891f, 1.7227f, 19.2891f)
                lineTo(8.0625f, 19.2891f)
                lineTo(8.0625f, 24.7617f)
                curveTo(8.0625f, 26.5547f, 8.8125f, 28.043f, 9.1055f, 28.043f)
                curveTo(9.3867f, 28.043f, 10.1367f, 26.5547f, 10.1367f, 24.7617f)
                lineTo(10.1367f, 19.2891f)
                lineTo(16.4766f, 19.2891f)
                curveTo(17.5312f, 19.2891f, 18.1992f, 18.6328f, 18.1992f, 17.6367f)
                curveTo(18.1992f, 15.1641f, 16.2188f, 12.5508f, 12.9258f, 11.3555f)
                lineTo(12.5391f, 5.9766f)
                curveTo(14.25f, 5.0039f, 15.6562f, 3.9023f, 16.2656f, 3.1172f)
                curveTo(16.5703f, 2.7188f, 16.7227f, 2.3203f, 16.7227f, 1.9688f)
                curveTo(16.7227f, 1.2539f, 16.1719f, 0.7266f, 15.3516f, 0.7266f)
                lineTo(2.8594f, 0.7266f)
                curveTo(2.0273f, 0.7266f, 1.4883f, 1.2539f, 1.4883f, 1.9688f)
                curveTo(1.4883f, 2.3203f, 1.6289f, 2.7188f, 1.9336f, 3.1172f)
                curveTo(2.543f, 3.9023f, 3.9492f, 5.0039f, 5.6602f, 5.9766f)
                lineTo(5.2734f, 11.3555f)
                curveTo(1.9805f, 12.5508f, 0.0f, 15.1641f, 0.0f, 17.6367f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
