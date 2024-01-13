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

public val CupertinoIcons.Filled.Suitcase: ImageVector
    get() {
        if (_suitcase != null) {
            return _suitcase!!
        }
        _suitcase = Builder(name = "Suitcase", defaultWidth = 27.1289.dp, defaultHeight =
                25.0195.dp, viewportWidth = 27.1289f, viewportHeight = 25.0195f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3711f, 4.1602f)
                lineTo(6.2578f, 4.1602f)
                lineTo(6.2578f, 22.7109f)
                lineTo(4.3711f, 22.7109f)
                close()
                moveTo(20.8594f, 4.1602f)
                lineTo(22.7461f, 4.1602f)
                lineTo(22.7461f, 22.7109f)
                lineTo(20.8594f, 22.7109f)
                close()
                moveTo(3.6211f, 22.7109f)
                lineTo(23.5078f, 22.7109f)
                curveTo(25.9336f, 22.7109f, 27.1289f, 21.5273f, 27.1289f, 19.1367f)
                lineTo(27.1289f, 7.7344f)
                curveTo(27.1289f, 5.332f, 25.9336f, 4.1602f, 23.5078f, 4.1602f)
                lineTo(3.6211f, 4.1602f)
                curveTo(1.207f, 4.1602f, 0.0f, 5.332f, 0.0f, 7.7344f)
                lineTo(0.0f, 19.1367f)
                curveTo(0.0f, 21.5273f, 1.207f, 22.7109f, 3.6211f, 22.7109f)
                close()
                moveTo(7.6172f, 5.1797f)
                lineTo(9.4336f, 5.1797f)
                lineTo(9.4336f, 3.1055f)
                curveTo(9.4336f, 2.2148f, 9.9609f, 1.7109f, 10.875f, 1.7109f)
                lineTo(16.2539f, 1.7109f)
                curveTo(17.168f, 1.7109f, 17.6836f, 2.2148f, 17.6836f, 3.1055f)
                lineTo(17.6836f, 5.1563f)
                lineTo(19.5f, 5.1563f)
                lineTo(19.5f, 3.2344f)
                curveTo(19.5f, 1.0313f, 18.3398f, 0.0f, 16.2188f, 0.0f)
                lineTo(10.8984f, 0.0f)
                curveTo(8.8945f, 0.0f, 7.6172f, 1.0313f, 7.6172f, 3.2344f)
                close()
            }
        }
        .build()
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
