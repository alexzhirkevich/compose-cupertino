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

public val CupertinoIcons.Filled.Wineglass: ImageVector
    get() {
        if (_wineglass != null) {
            return _wineglass!!
        }
        _wineglass = Builder(name = "Wineglass", defaultWidth = 17.1328.dp, defaultHeight =
                27.9258.dp, viewportWidth = 17.1328f, viewportHeight = 27.9258f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5547f, 27.9141f)
                curveTo(12.7969f, 27.9141f, 15.3516f, 26.8594f, 15.3516f, 25.0547f)
                curveTo(15.3516f, 23.4023f, 13.1484f, 22.3711f, 9.4453f, 22.2188f)
                lineTo(9.4453f, 17.1914f)
                curveTo(14.0977f, 16.8633f, 17.1328f, 13.8867f, 17.1328f, 9.5273f)
                curveTo(17.1328f, 7.1133f, 16.1133f, 3.9375f, 14.6367f, 1.6758f)
                curveTo(13.9453f, 0.5977f, 11.707f, 0.0f, 8.5664f, 0.0f)
                curveTo(5.4023f, 0.0f, 3.1758f, 0.5977f, 2.4727f, 1.6758f)
                curveTo(0.9961f, 3.9375f, 0.0f, 7.1133f, 0.0f, 9.5273f)
                curveTo(0.0f, 13.8984f, 3.0352f, 16.8633f, 7.6875f, 17.1914f)
                lineTo(7.6875f, 22.2188f)
                curveTo(3.9727f, 22.3594f, 1.7695f, 23.4023f, 1.7695f, 25.0547f)
                curveTo(1.7695f, 26.8594f, 4.3125f, 27.9141f, 8.5547f, 27.9141f)
                close()
                moveTo(8.5664f, 2.8945f)
                curveTo(5.8945f, 2.8945f, 4.1016f, 2.5898f, 4.1016f, 2.2383f)
                curveTo(4.1016f, 1.8984f, 5.9063f, 1.6055f, 8.5664f, 1.6055f)
                curveTo(11.2266f, 1.6055f, 13.0312f, 1.8984f, 13.0312f, 2.2383f)
                curveTo(13.0312f, 2.5898f, 11.2266f, 2.8945f, 8.5664f, 2.8945f)
                close()
            }
        }
        .build()
        return _wineglass!!
    }

private var _wineglass: ImageVector? = null
