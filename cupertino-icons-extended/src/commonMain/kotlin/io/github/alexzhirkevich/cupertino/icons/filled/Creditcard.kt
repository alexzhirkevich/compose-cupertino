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

public val CupertinoIcons.Filled.Creditcard: ImageVector
    get() {
        if (_creditcard != null) {
            return _creditcard!!
        }
        _creditcard = Builder(name = "Creditcard", defaultWidth = 27.5391.dp, defaultHeight =
                20.0273.dp, viewportWidth = 27.5391f, viewportHeight = 20.0273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.793f, 16.3945f)
                curveTo(4.1016f, 16.3945f, 3.6445f, 15.9258f, 3.6445f, 15.2695f)
                lineTo(3.6445f, 13.1016f)
                curveTo(3.6445f, 12.4336f, 4.1016f, 11.9766f, 4.793f, 11.9766f)
                lineTo(7.6641f, 11.9766f)
                curveTo(8.3555f, 11.9766f, 8.8125f, 12.4336f, 8.8125f, 13.1016f)
                lineTo(8.8125f, 15.2695f)
                curveTo(8.8125f, 15.9258f, 8.3555f, 16.3945f, 7.6641f, 16.3945f)
                close()
                moveTo(0.0f, 7.3945f)
                lineTo(0.0f, 4.7344f)
                lineTo(27.5391f, 4.7344f)
                lineTo(27.5391f, 7.3945f)
                close()
                moveTo(3.6797f, 20.0273f)
                lineTo(23.8594f, 20.0273f)
                curveTo(26.3203f, 20.0273f, 27.5391f, 18.8203f, 27.5391f, 16.4062f)
                lineTo(27.5391f, 3.6445f)
                curveTo(27.5391f, 1.2305f, 26.3203f, 0.0117f, 23.8594f, 0.0117f)
                lineTo(3.6797f, 0.0117f)
                curveTo(1.2305f, 0.0117f, 0.0f, 1.2305f, 0.0f, 3.6445f)
                lineTo(0.0f, 16.4062f)
                curveTo(0.0f, 18.8203f, 1.2305f, 20.0273f, 3.6797f, 20.0273f)
                close()
            }
        }
        .build()
        return _creditcard!!
    }

private var _creditcard: ImageVector? = null
