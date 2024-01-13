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

public val CupertinoIcons.Outlined.Mappin: ImageVector
    get() {
        if (_mappin != null) {
            return _mappin!!
        }
        _mappin = Builder(name = "Mappin", defaultWidth = 8.80078.dp, defaultHeight = 25.7461.dp,
                viewportWidth = 8.80078f, viewportHeight = 25.7461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1406f, 4.6641f)
                curveTo(2.332f, 4.6641f, 1.6289f, 3.9609f, 1.6289f, 3.1406f)
                curveTo(1.6289f, 2.332f, 2.332f, 1.6406f, 3.1406f, 1.6406f)
                curveTo(3.9609f, 1.6406f, 4.6406f, 2.332f, 4.6406f, 3.1406f)
                curveTo(4.6406f, 3.9609f, 3.9609f, 4.6641f, 3.1406f, 4.6641f)
                close()
                moveTo(0.0f, 4.418f)
                curveTo(0.0f, 6.4805f, 1.3945f, 8.2031f, 3.3047f, 8.6836f)
                lineTo(3.3047f, 19.5586f)
                curveTo(3.3047f, 23.0156f, 3.9258f, 24.9023f, 4.3945f, 24.9023f)
                curveTo(4.875f, 24.9023f, 5.4844f, 23.0273f, 5.4844f, 19.5586f)
                lineTo(5.4844f, 8.6836f)
                curveTo(7.3945f, 8.2148f, 8.8008f, 6.4805f, 8.8008f, 4.418f)
                curveTo(8.8008f, 1.9922f, 6.8438f, 0.0f, 4.3945f, 0.0f)
                curveTo(1.957f, 0.0f, 0.0f, 1.9922f, 0.0f, 4.418f)
                close()
            }
        }
        .build()
        return _mappin!!
    }

private var _mappin: ImageVector? = null
