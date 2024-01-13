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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.Ellipsis: ImageVector
    get() {
        if (_ellipsis != null) {
            return _ellipsis!!
        }
        _ellipsis = Builder(name = "Ellipsis", defaultWidth = 22.1016.dp, defaultHeight =
                4.69922.dp, viewportWidth = 22.1016f, viewportHeight = 4.69922f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.3438f, 4.6992f)
                curveTo(3.668f, 4.6992f, 4.7227f, 3.6563f, 4.7227f, 2.3555f)
                curveTo(4.7227f, 1.0547f, 3.668f, 0.0117f, 2.3438f, 0.0117f)
                curveTo(1.0547f, 0.0117f, 0.0f, 1.0547f, 0.0f, 2.3555f)
                curveTo(0.0f, 3.6563f, 1.0547f, 4.6992f, 2.3438f, 4.6992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0508f, 4.6992f)
                curveTo(12.3516f, 4.6992f, 13.3945f, 3.6563f, 13.3945f, 2.3555f)
                curveTo(13.3945f, 1.0547f, 12.3516f, 0.0117f, 11.0508f, 0.0117f)
                curveTo(9.7617f, 0.0117f, 8.7188f, 1.0547f, 8.7188f, 2.3555f)
                curveTo(8.7188f, 3.6563f, 9.7617f, 4.6992f, 11.0508f, 4.6992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7578f, 4.6992f)
                curveTo(21.0586f, 4.6992f, 22.1016f, 3.6563f, 22.1016f, 2.3555f)
                curveTo(22.1016f, 1.0547f, 21.0586f, 0.0117f, 19.7578f, 0.0117f)
                curveTo(18.4336f, 0.0117f, 17.3906f, 1.0547f, 17.3906f, 2.3555f)
                curveTo(17.3906f, 3.6563f, 18.4336f, 4.6992f, 19.7578f, 4.6992f)
                close()
            }
        }
        .build()
        return _ellipsis!!
    }

private var _ellipsis: ImageVector? = null
