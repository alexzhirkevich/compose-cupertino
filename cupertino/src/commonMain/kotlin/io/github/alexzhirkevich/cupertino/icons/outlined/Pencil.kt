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

public val CupertinoIcons.Outlined.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 18.6677.dp, defaultHeight = 18.9746.dp,
                viewportWidth = 18.6677f, viewportHeight = 18.9746f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1978f, 17.9072f)
                lineTo(15.9829f, 5.1338f)
                lineTo(13.9322f, 3.0713f)
                lineTo(1.1353f, 15.8564f)
                lineTo(0.022f, 18.458f)
                curveTo(-0.0835f, 18.7392f, 0.2095f, 19.0674f, 0.4908f, 18.9502f)
                close()
                moveTo(17.0142f, 4.126f)
                lineTo(18.1978f, 2.9658f)
                curveTo(18.7954f, 2.3681f, 18.8189f, 1.7236f, 18.2915f, 1.1846f)
                lineTo(17.8931f, 0.7861f)
                curveTo(17.3658f, 0.2588f, 16.7212f, 0.3174f, 16.1236f, 0.8916f)
                lineTo(14.94f, 2.0635f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
