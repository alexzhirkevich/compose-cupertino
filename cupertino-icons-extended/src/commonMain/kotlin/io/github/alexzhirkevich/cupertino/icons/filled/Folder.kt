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

public val CupertinoIcons.Filled.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 26.6133.dp, defaultHeight = 21.5977.dp,
                viewportWidth = 26.6133f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.8125f)
                curveTo(0.0f, 20.2383f, 1.2305f, 21.4453f, 3.6797f, 21.4453f)
                lineTo(23.2852f, 21.4453f)
                curveTo(25.3828f, 21.4453f, 26.6133f, 20.2266f, 26.6133f, 17.8125f)
                lineTo(26.6133f, 8.2031f)
                lineTo(0.0f, 8.2031f)
                close()
                moveTo(0.0f, 6.668f)
                lineTo(26.6133f, 6.668f)
                lineTo(26.6133f, 5.7773f)
                curveTo(26.6133f, 3.3633f, 25.3711f, 2.1445f, 22.9336f, 2.1445f)
                lineTo(11.6836f, 2.1445f)
                curveTo(10.8867f, 2.1445f, 10.4062f, 1.957f, 9.8203f, 1.4531f)
                lineTo(9.1055f, 0.8672f)
                curveTo(8.332f, 0.2109f, 7.7344f, 0.0f, 6.5742f, 0.0f)
                lineTo(3.2344f, 0.0f)
                curveTo(1.1836f, 0.0f, 0.0f, 1.1719f, 0.0f, 3.5273f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
