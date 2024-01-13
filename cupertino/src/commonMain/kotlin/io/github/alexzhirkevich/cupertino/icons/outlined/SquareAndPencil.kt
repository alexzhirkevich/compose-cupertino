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

public val CupertinoIcons.Outlined.SquareAndPencil: ImageVector
    get() {
        if (_squareAndPencil != null) {
            return _squareAndPencil!!
        }
        _squareAndPencil = Builder(name = "SquareAndPencil", defaultWidth = 23.1855.dp,
                defaultHeight = 24.7675.dp, viewportWidth = 23.1855f, viewportHeight =
                24.7675f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 23.1474f)
                lineTo(17.4375f, 23.1474f)
                curveTo(19.5469f, 23.1474f, 20.7656f, 21.9287f, 20.7656f, 19.5146f)
                lineTo(20.7656f, 6.9872f)
                lineTo(18.8789f, 8.874f)
                lineTo(18.8789f, 19.4208f)
                curveTo(18.8789f, 20.6396f, 18.2227f, 21.2607f, 17.4141f, 21.2607f)
                lineTo(3.7148f, 21.2607f)
                curveTo(2.543f, 21.2607f, 1.8867f, 20.6396f, 1.8867f, 19.4208f)
                lineTo(1.8867f, 6.1201f)
                curveTo(1.8867f, 4.9013f, 2.543f, 4.2685f, 3.7148f, 4.2685f)
                lineTo(14.3906f, 4.2685f)
                lineTo(16.2773f, 2.3818f)
                lineTo(3.6797f, 2.3818f)
                curveTo(1.2422f, 2.3818f, 0.0f, 3.6005f, 0.0f, 6.0146f)
                lineTo(0.0f, 19.5146f)
                curveTo(0.0f, 21.9404f, 1.2422f, 23.1474f, 3.6797f, 23.1474f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9453f, 15.5537f)
                lineTo(10.2305f, 14.5576f)
                lineTo(21.1758f, 3.624f)
                lineTo(19.5703f, 2.0419f)
                lineTo(8.6367f, 12.9755f)
                lineTo(7.582f, 15.1787f)
                curveTo(7.4883f, 15.3779f, 7.7227f, 15.6474f, 7.9453f, 15.5537f)
                close()
                moveTo(22.043f, 2.7685f)
                lineTo(22.8867f, 1.9013f)
                curveTo(23.2852f, 1.4794f, 23.2852f, 0.9169f, 22.8867f, 0.5302f)
                lineTo(22.6172f, 0.249f)
                curveTo(22.2539f, -0.1143f, 21.6797f, -0.0674f, 21.293f, 0.3076f)
                lineTo(20.4375f, 1.1513f)
                close()
            }
        }
        .build()
        return _squareAndPencil!!
    }

private var _squareAndPencil: ImageVector? = null
