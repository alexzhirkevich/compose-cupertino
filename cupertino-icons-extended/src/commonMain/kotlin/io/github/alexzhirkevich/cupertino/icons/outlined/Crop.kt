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

public val CupertinoIcons.Outlined.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 25.6992.dp, defaultHeight = 26.3789.dp,
                viewportWidth = 25.6992f, viewportHeight = 26.3789f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.6992f, 19.8633f)
                curveTo(25.6992f, 19.3125f, 25.3359f, 18.9727f, 24.7617f, 18.9727f)
                lineTo(7.8633f, 18.9727f)
                curveTo(7.6055f, 18.9727f, 7.5234f, 18.8906f, 7.5234f, 18.6328f)
                lineTo(7.5234f, 1.7344f)
                curveTo(7.5234f, 1.1484f, 7.1484f, 0.75f, 6.5742f, 0.75f)
                curveTo(6.0117f, 0.75f, 5.6367f, 1.1484f, 5.6367f, 1.7344f)
                lineTo(5.6367f, 19.8164f)
                curveTo(5.6367f, 20.3789f, 6.0f, 20.7422f, 6.5625f, 20.7422f)
                lineTo(24.7617f, 20.7422f)
                curveTo(25.3359f, 20.7422f, 25.6992f, 20.4023f, 25.6992f, 19.8633f)
                close()
                moveTo(0.0f, 7.2656f)
                curveTo(0.0f, 7.8281f, 0.3633f, 8.1563f, 0.9258f, 8.1563f)
                lineTo(17.8359f, 8.1563f)
                curveTo(18.0938f, 8.1563f, 18.1758f, 8.25f, 18.1758f, 8.4961f)
                lineTo(18.1758f, 25.3945f)
                curveTo(18.1758f, 25.9805f, 18.5508f, 26.3789f, 19.1133f, 26.3789f)
                curveTo(19.6875f, 26.3789f, 20.0625f, 25.9805f, 20.0625f, 25.3945f)
                lineTo(20.0625f, 7.3242f)
                curveTo(20.0625f, 6.7617f, 19.6992f, 6.3867f, 19.1367f, 6.3867f)
                lineTo(0.9258f, 6.3867f)
                curveTo(0.3633f, 6.3867f, 0.0f, 6.7266f, 0.0f, 7.2656f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
