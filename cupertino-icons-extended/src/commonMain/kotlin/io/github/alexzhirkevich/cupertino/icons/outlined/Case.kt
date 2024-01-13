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

public val CupertinoIcons.Outlined.Case: ImageVector
    get() {
        if (_case != null) {
            return _case!!
        }
        _case = Builder(name = "Case", defaultWidth = 27.1289.dp, defaultHeight = 25.0195.dp,
                viewportWidth = 27.1289f, viewportHeight = 25.0195f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(3.6445f, 20.8359f)
                curveTo(2.4961f, 20.8359f, 1.8867f, 20.2383f, 1.8867f, 19.043f)
                lineTo(1.8867f, 7.8281f)
                curveTo(1.8867f, 6.6211f, 2.4961f, 6.0352f, 3.6445f, 6.0352f)
                lineTo(23.4844f, 6.0352f)
                curveTo(24.6328f, 6.0352f, 25.2422f, 6.6211f, 25.2422f, 7.8281f)
                lineTo(25.2422f, 19.043f)
                curveTo(25.2422f, 20.2383f, 24.6328f, 20.8359f, 23.4844f, 20.8359f)
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
        return _case!!
    }

private var _case: ImageVector? = null
