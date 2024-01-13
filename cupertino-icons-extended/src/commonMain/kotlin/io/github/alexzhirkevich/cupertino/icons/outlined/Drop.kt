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

public val CupertinoIcons.Outlined.Drop: ImageVector
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
                curveTo(13.3828f, 6.7383f, 11.4141f, 3.6328f, 9.7031f, 0.9844f)
                curveTo(9.293f, 0.3633f, 8.8125f, 0.0f, 8.1211f, 0.0f)
                curveTo(7.4297f, 0.0f, 6.9492f, 0.3633f, 6.5391f, 0.9844f)
                curveTo(4.8281f, 3.6328f, 2.8594f, 6.7383f, 1.6055f, 9.5625f)
                curveTo(0.9258f, 11.1211f, 0.0f, 13.4531f, 0.0f, 15.7969f)
                curveTo(0.0f, 20.5547f, 3.2461f, 23.7305f, 8.1211f, 23.7305f)
                close()
                moveTo(8.1211f, 21.8086f)
                curveTo(4.3945f, 21.8086f, 1.9219f, 19.4062f, 1.9219f, 15.7969f)
                curveTo(1.9219f, 13.875f, 2.6602f, 12.0117f, 3.3164f, 10.4883f)
                curveTo(4.6289f, 7.4063f, 6.3633f, 4.875f, 8.0039f, 2.4023f)
                curveTo(8.0859f, 2.2852f, 8.1797f, 2.2852f, 8.25f, 2.4023f)
                curveTo(9.8789f, 4.875f, 11.625f, 7.4063f, 12.9141f, 10.4766f)
                curveTo(13.582f, 12.0117f, 14.332f, 13.875f, 14.332f, 15.7969f)
                curveTo(14.332f, 19.4062f, 11.8477f, 21.8086f, 8.1211f, 21.8086f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
