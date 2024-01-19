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

public val CupertinoIcons.Outlined.Minus: ImageVector
    get() {
        if (_minus != null) {
            return _minus!!
        }
        _minus = Builder(name = "Minus", defaultWidth = 19.3359.dp, defaultHeight = 2.12109.dp,
                viewportWidth = 19.3359f, viewportHeight = 2.12109f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.043f, 2.1211f)
                lineTo(18.293f, 2.1211f)
                curveTo(18.8555f, 2.1211f, 19.3359f, 1.6406f, 19.3359f, 1.0664f)
                curveTo(19.3359f, 0.4922f, 18.8555f, 0.0234f, 18.293f, 0.0234f)
                lineTo(1.043f, 0.0234f)
                curveTo(0.4805f, 0.0234f, 0.0f, 0.4922f, 0.0f, 1.0664f)
                curveTo(0.0f, 1.6406f, 0.4805f, 2.1211f, 1.043f, 2.1211f)
                close()
            }
        }
        .build()
        return _minus!!
    }

private var _minus: ImageVector? = null
