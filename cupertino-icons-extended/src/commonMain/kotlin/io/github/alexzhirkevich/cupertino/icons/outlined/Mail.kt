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

public val CupertinoIcons.Outlined.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 27.6328.dp, defaultHeight = 21.5742.dp,
                viewportWidth = 27.6328f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5664f, 7.1016f)
                lineTo(13.125f, 7.1016f)
                curveTo(13.582f, 7.1016f, 13.9453f, 6.7266f, 13.9453f, 6.2695f)
                curveTo(13.9453f, 5.8125f, 13.582f, 5.4609f, 13.125f, 5.4609f)
                lineTo(5.5664f, 5.4609f)
                curveTo(5.0977f, 5.4609f, 4.7578f, 5.8125f, 4.7578f, 6.2695f)
                curveTo(4.7578f, 6.7266f, 5.0977f, 7.1016f, 5.5664f, 7.1016f)
                close()
                moveTo(5.5664f, 10.2305f)
                lineTo(11.0977f, 10.2305f)
                curveTo(11.5547f, 10.2305f, 11.918f, 9.8672f, 11.918f, 9.4102f)
                curveTo(11.918f, 8.9531f, 11.5547f, 8.5898f, 11.0977f, 8.5898f)
                lineTo(5.5664f, 8.5898f)
                curveTo(5.0977f, 8.5898f, 4.7578f, 8.9531f, 4.7578f, 9.4102f)
                curveTo(4.7578f, 9.8672f, 5.0977f, 10.2305f, 5.5664f, 10.2305f)
                close()
                moveTo(20.0742f, 10.5469f)
                curveTo(21.6211f, 10.5469f, 22.875f, 9.293f, 22.875f, 7.7344f)
                curveTo(22.875f, 6.1758f, 21.6211f, 4.9219f, 20.0742f, 4.9219f)
                curveTo(18.5273f, 4.9219f, 17.2617f, 6.1758f, 17.2617f, 7.7344f)
                curveTo(17.2617f, 9.293f, 18.5273f, 10.5469f, 20.0742f, 10.5469f)
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
        return _mail!!
    }

private var _mail: ImageVector? = null
