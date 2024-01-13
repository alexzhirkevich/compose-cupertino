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

public val CupertinoIcons.Filled.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 28.0078.dp, defaultHeight = 18.7148.dp,
                viewportWidth = 28.0078f, viewportHeight = 18.7148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7422f, 18.5391f)
                lineTo(21.0117f, 18.5391f)
                curveTo(24.9609f, 18.5391f, 28.0078f, 15.5508f, 28.0078f, 11.7305f)
                curveTo(28.0078f, 7.8516f, 24.8438f, 4.9805f, 20.6367f, 4.9922f)
                curveTo(19.0898f, 1.8867f, 16.2188f, 0.0f, 12.7266f, 0.0f)
                curveTo(8.1445f, 0.0f, 4.3242f, 3.5859f, 3.9375f, 8.1914f)
                curveTo(1.6055f, 8.8477f, 0.0f, 10.8398f, 0.0f, 13.3242f)
                curveTo(0.0f, 16.3828f, 2.2852f, 18.5391f, 5.7422f, 18.5391f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
