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

public val CupertinoIcons.Outlined.Pip: ImageVector
    get() {
        if (_pip != null) {
            return _pip!!
        }
        _pip = Builder(name = "Pip", defaultWidth = 30.3633.dp, defaultHeight = 24.5742.dp,
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
                moveTo(15.1992f, 22.6875f)
                curveTo(14.0273f, 22.6875f, 13.3828f, 22.0547f, 13.3828f, 20.8359f)
                lineTo(13.3828f, 13.4414f)
                curveTo(13.3828f, 12.2227f, 14.0273f, 11.6016f, 15.1992f, 11.6016f)
                lineTo(26.6602f, 11.6016f)
                curveTo(27.8203f, 11.6016f, 28.4766f, 12.2227f, 28.4766f, 13.4414f)
                lineTo(28.4766f, 20.8359f)
                curveTo(28.4766f, 22.0547f, 27.8203f, 22.6875f, 26.6602f, 22.6875f)
                close()
            }
        }
        .build()
        return _pip!!
    }

private var _pip: ImageVector? = null
