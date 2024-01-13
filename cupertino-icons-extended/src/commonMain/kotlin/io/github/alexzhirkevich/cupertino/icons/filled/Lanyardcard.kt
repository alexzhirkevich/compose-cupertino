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

public val CupertinoIcons.Filled.Lanyardcard: ImageVector
    get() {
        if (_lanyardcard != null) {
            return _lanyardcard!!
        }
        _lanyardcard = Builder(name = "Lanyardcard", defaultWidth = 18.2109.dp, defaultHeight =
                25.1367.dp, viewportWidth = 18.2109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.457f)
                curveTo(0.0f, 23.9062f, 1.207f, 25.125f, 3.6328f, 25.125f)
                lineTo(14.5898f, 25.125f)
                curveTo(17.0039f, 25.125f, 18.2109f, 23.9062f, 18.2109f, 21.457f)
                lineTo(18.2109f, 3.6797f)
                curveTo(18.2109f, 1.2422f, 17.0039f, 0.0f, 14.5898f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.207f, 0.0f, 0.0f, 1.2422f, 0.0f, 3.6797f)
                close()
                moveTo(6.1055f, 4.0547f)
                curveTo(5.6719f, 4.0547f, 5.3086f, 3.7031f, 5.3086f, 3.2695f)
                curveTo(5.3086f, 2.8359f, 5.6719f, 2.4844f, 6.1055f, 2.4844f)
                lineTo(12.1055f, 2.4844f)
                curveTo(12.5508f, 2.4844f, 12.9023f, 2.8359f, 12.9023f, 3.2695f)
                curveTo(12.9023f, 3.7031f, 12.5508f, 4.0547f, 12.1055f, 4.0547f)
                close()
            }
        }
        .build()
        return _lanyardcard!!
    }

private var _lanyardcard: ImageVector? = null
