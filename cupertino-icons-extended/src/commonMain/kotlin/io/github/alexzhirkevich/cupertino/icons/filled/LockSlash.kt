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

public val CupertinoIcons.Filled.LockSlash: ImageVector
    get() {
        if (_lockSlash != null) {
            return _lockSlash!!
        }
        _lockSlash = Builder(name = "LockSlash", defaultWidth = 21.9068.dp, defaultHeight =
                24.1406.dp, viewportWidth = 21.9068f, viewportHeight = 24.1406f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7168f, 2.0449f)
                curveTo(12.9082f, 2.0449f, 14.8184f, 3.6035f, 14.8184f, 6.5684f)
                lineTo(14.8184f, 9.6152f)
                lineTo(10.5645f, 9.6152f)
                lineTo(18.7207f, 17.748f)
                lineTo(18.7207f, 12.3926f)
                curveTo(18.7207f, 10.7754f, 18.0059f, 9.8496f, 16.6699f, 9.6621f)
                lineTo(16.6699f, 6.8144f)
                curveTo(16.6699f, 2.4082f, 13.7871f, 0.2754f, 10.7168f, 0.2754f)
                curveTo(8.3027f, 0.2754f, 6.0527f, 1.6113f, 5.1973f, 4.2363f)
                lineTo(6.6973f, 5.7481f)
                curveTo(7.0019f, 3.334f, 8.7246f, 2.0449f, 10.7168f, 2.0449f)
                close()
                moveTo(5.3613f, 23.2559f)
                lineTo(16.084f, 23.2559f)
                curveTo(16.6348f, 23.2559f, 17.1035f, 23.127f, 17.4434f, 22.9043f)
                lineTo(4.3418f, 9.8145f)
                lineTo(4.2363f, 9.8145f)
                curveTo(3.2754f, 10.1309f, 2.7246f, 11.0215f, 2.7246f, 12.3926f)
                lineTo(2.7246f, 20.4668f)
                curveTo(2.7246f, 22.3184f, 3.6387f, 23.2559f, 5.3613f, 23.2559f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3613f, 23.877f)
                curveTo(20.7246f, 24.2285f, 21.2988f, 24.2285f, 21.6387f, 23.877f)
                curveTo(21.9902f, 23.5254f, 22.002f, 22.9512f, 21.6387f, 22.5996f)
                lineTo(1.5527f, 2.5137f)
                curveTo(1.2012f, 2.1621f, 0.6152f, 2.1621f, 0.2637f, 2.5137f)
                curveTo(-0.0879f, 2.8652f, -0.0879f, 3.4512f, 0.2637f, 3.791f)
                close()
            }
        }
        .build()
        return _lockSlash!!
    }

private var _lockSlash: ImageVector? = null
