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

public val CupertinoIcons.Filled.Pip: ImageVector
    get() {
        if (_pip != null) {
            return _pip!!
        }
        _pip = Builder(name = "Pip", defaultWidth = 30.3633.dp, defaultHeight = 24.5742.dp,
                viewportWidth = 30.3633f, viewportHeight = 24.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1758f, 8.1094f)
                lineTo(24.4453f, 8.1094f)
                lineTo(24.4453f, 3.6563f)
                curveTo(24.4453f, 1.2422f, 23.2148f, 0.0234f, 20.7773f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2188f, 0.0234f, 0.0f, 1.2422f, 0.0f, 3.6563f)
                lineTo(0.0f, 15.5156f)
                curveTo(0.0f, 17.9297f, 1.2188f, 19.1484f, 3.6797f, 19.1484f)
                lineTo(9.8906f, 19.1484f)
                lineTo(9.8906f, 13.3477f)
                curveTo(9.8906f, 10.043f, 11.8359f, 8.1094f, 15.1758f, 8.1094f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1758f, 24.5742f)
                lineTo(26.6953f, 24.5742f)
                curveTo(29.1328f, 24.5742f, 30.3633f, 23.3555f, 30.3633f, 20.9414f)
                lineTo(30.3633f, 13.3477f)
                curveTo(30.3633f, 10.9336f, 29.1328f, 9.7148f, 26.6953f, 9.7148f)
                lineTo(15.1758f, 9.7148f)
                curveTo(12.7266f, 9.7148f, 11.4961f, 10.9219f, 11.4961f, 13.3477f)
                lineTo(11.4961f, 20.9414f)
                curveTo(11.4961f, 23.3555f, 12.7266f, 24.5742f, 15.1758f, 24.5742f)
                close()
            }
        }
        .build()
        return _pip!!
    }

private var _pip: ImageVector? = null
