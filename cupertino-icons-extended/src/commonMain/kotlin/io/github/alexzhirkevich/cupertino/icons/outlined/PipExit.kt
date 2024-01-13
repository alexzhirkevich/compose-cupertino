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

public val CupertinoIcons.Outlined.PipExit: ImageVector
    get() {
        if (_pipExit != null) {
            return _pipExit!!
        }
        _pipExit = Builder(name = "PipExit", defaultWidth = 30.3633.dp, defaultHeight = 24.5742.dp,
                viewportWidth = 30.3633f, viewportHeight = 24.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 19.1484f)
                lineTo(12.3516f, 19.1484f)
                lineTo(12.3516f, 17.2617f)
                lineTo(3.7031f, 17.2617f)
                curveTo(2.5313f, 17.2617f, 1.8867f, 16.6289f, 1.8867f, 15.4102f)
                lineTo(1.8867f, 3.7617f)
                curveTo(1.8867f, 2.543f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(20.7422f, 1.9102f)
                curveTo(21.9023f, 1.9102f, 22.5586f, 2.543f, 22.5586f, 3.7617f)
                lineTo(22.5586f, 10.5469f)
                lineTo(24.4453f, 10.5469f)
                lineTo(24.4453f, 3.6563f)
                curveTo(24.4453f, 1.2422f, 23.2148f, 0.0234f, 20.7773f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2188f, 0.0234f, 0.0f, 1.2422f, 0.0f, 3.6563f)
                lineTo(0.0f, 15.5156f)
                curveTo(0.0f, 17.9297f, 1.2188f, 19.1484f, 3.6797f, 19.1484f)
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
                moveTo(4.4766f, 8.8242f)
                curveTo(4.5234f, 9.1758f, 4.9805f, 9.5742f, 5.4375f, 9.1172f)
                lineTo(6.7383f, 7.8281f)
                lineTo(8.6484f, 9.75f)
                curveTo(8.9297f, 10.0312f, 9.3984f, 10.0312f, 9.6797f, 9.75f)
                curveTo(9.9609f, 9.4688f, 9.9609f, 9.0f, 9.6797f, 8.7188f)
                lineTo(7.7578f, 6.7969f)
                lineTo(9.0469f, 5.4961f)
                curveTo(9.5039f, 5.0508f, 9.1172f, 4.5938f, 8.7539f, 4.5469f)
                lineTo(4.5234f, 3.8906f)
                curveTo(4.3125f, 3.8555f, 4.125f, 3.9258f, 3.9844f, 4.0547f)
                curveTo(3.8555f, 4.1836f, 3.7852f, 4.3828f, 3.8203f, 4.582f)
                close()
            }
        }
        .build()
        return _pipExit!!
    }

private var _pipExit: ImageVector? = null
