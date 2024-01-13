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

public val CupertinoIcons.Filled.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 22.1234.dp, defaultHeight =
                22.0777.dp, viewportWidth = 22.1234f, viewportHeight = 22.0777f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5497f, 11.7947f)
                lineTo(10.0927f, 11.8298f)
                curveTo(10.2685f, 11.8298f, 10.3271f, 11.8884f, 10.3271f, 12.0642f)
                lineTo(10.3505f, 20.5369f)
                curveTo(10.3505f, 22.283f, 12.4482f, 22.6931f, 13.2333f, 20.9939f)
                lineTo(21.8935f, 2.3728f)
                curveTo(22.6786f, 0.6619f, 21.331f, -0.4748f, 19.6904f, 0.2986f)
                lineTo(0.9638f, 8.9822f)
                curveTo(-0.5362f, 9.6736f, -0.2432f, 11.783f, 1.5497f, 11.7947f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
