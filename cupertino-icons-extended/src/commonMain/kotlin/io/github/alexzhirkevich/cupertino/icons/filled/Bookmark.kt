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

public val CupertinoIcons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 15.7969.dp, defaultHeight =
                25.1836.dp, viewportWidth = 15.7969f, viewportHeight = 25.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2422f, 25.1367f)
                curveTo(1.8164f, 25.1367f, 2.1563f, 24.8086f, 3.2109f, 23.7891f)
                lineTo(7.793f, 19.2773f)
                curveTo(7.8516f, 19.2188f, 7.957f, 19.2188f, 8.0039f, 19.2773f)
                lineTo(12.5859f, 23.7891f)
                curveTo(13.6406f, 24.8086f, 13.9805f, 25.1367f, 14.5547f, 25.1367f)
                curveTo(15.3398f, 25.1367f, 15.7969f, 24.6211f, 15.7969f, 23.707f)
                lineTo(15.7969f, 3.3633f)
                curveTo(15.7969f, 1.1367f, 14.6836f, 0.0f, 12.4805f, 0.0f)
                lineTo(3.3164f, 0.0f)
                curveTo(1.1133f, 0.0f, 0.0f, 1.1367f, 0.0f, 3.3633f)
                lineTo(0.0f, 23.707f)
                curveTo(0.0f, 24.6211f, 0.457f, 25.1367f, 1.2422f, 25.1367f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
