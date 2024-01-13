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

public val CupertinoIcons.Outlined.MenubarRectangle: ImageVector
    get() {
        if (_menubarRectangle != null) {
            return _menubarRectangle!!
        }
        _menubarRectangle = Builder(name = "MenubarRectangle", defaultWidth = 27.6328.dp,
                defaultHeight = 21.5742.dp, viewportWidth = 27.6328f, viewportHeight =
                21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2539f, 3.9492f)
                lineTo(1.2539f, 5.6016f)
                lineTo(26.3789f, 5.6016f)
                lineTo(26.3789f, 3.9492f)
                close()
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
                moveTo(3.7031f, 19.6875f)
                curveTo(2.5313f, 19.6875f, 1.8867f, 19.0664f, 1.8867f, 17.8477f)
                lineTo(1.8867f, 3.7383f)
                curveTo(1.8867f, 2.5195f, 2.5313f, 1.8867f, 3.7031f, 1.8867f)
                lineTo(23.9297f, 1.8867f)
                curveTo(25.0898f, 1.8867f, 25.7461f, 2.5195f, 25.7461f, 3.7383f)
                lineTo(25.7461f, 17.8477f)
                curveTo(25.7461f, 19.0664f, 25.0898f, 19.6875f, 23.9297f, 19.6875f)
                close()
            }
        }
        .build()
        return _menubarRectangle!!
    }

private var _menubarRectangle: ImageVector? = null
