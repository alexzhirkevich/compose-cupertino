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

public val CupertinoIcons.Filled.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 16.2422.dp, defaultHeight = 23.7539.dp,
                viewportWidth = 16.2422f, viewportHeight = 23.7539f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1211f, 23.7305f)
                curveTo(12.9961f, 23.7305f, 16.2422f, 20.5547f, 16.2422f, 15.7969f)
                curveTo(16.2422f, 13.4531f, 15.3281f, 11.1211f, 14.6367f, 9.5625f)
                curveTo(13.3828f, 6.7383f, 11.2266f, 3.6328f, 9.4102f, 0.8203f)
                curveTo(9.0586f, 0.293f, 8.6016f, 0.0f, 8.1211f, 0.0f)
                curveTo(7.6523f, 0.0f, 7.1836f, 0.293f, 6.832f, 0.8203f)
                curveTo(5.0156f, 3.6328f, 2.8594f, 6.7383f, 1.6055f, 9.5625f)
                curveTo(0.9258f, 11.1211f, 0.0f, 13.4531f, 0.0f, 15.7969f)
                curveTo(0.0f, 20.5547f, 3.2461f, 23.7305f, 8.1211f, 23.7305f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
