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

@file:Suppress("UnusedReceiverParameter")

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

public val CupertinoIcons.Outlined.Bag: ImageVector
    get() {
        if (_bag != null) {
            return _bag!!
        }
        _bag = Builder(name = "Bag", defaultWidth = 20.8008.dp, defaultHeight = 26.3086.dp,
                viewportWidth = 20.8008f, viewportHeight = 26.3086f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.3203f)
                curveTo(0.0f, 22.7461f, 1.2305f, 23.9531f, 3.6797f, 23.9531f)
                lineTo(17.4727f, 23.9531f)
                curveTo(19.5703f, 23.9531f, 20.8008f, 22.7344f, 20.8008f, 20.3203f)
                lineTo(20.8008f, 8.1914f)
                curveTo(20.8008f, 5.7773f, 19.5586f, 4.5586f, 17.1211f, 4.5586f)
                lineTo(15.2461f, 4.5586f)
                curveTo(15.1875f, 2.0977f, 13.043f, 0.0f, 10.3945f, 0.0f)
                curveTo(7.7461f, 0.0f, 5.6133f, 2.0977f, 5.543f, 4.5586f)
                lineTo(3.6797f, 4.5586f)
                curveTo(1.2305f, 4.5586f, 0.0f, 5.7656f, 0.0f, 8.1914f)
                close()
                moveTo(1.8867f, 20.2266f)
                lineTo(1.8867f, 8.2852f)
                curveTo(1.8867f, 7.0664f, 2.5313f, 6.4453f, 3.7031f, 6.4453f)
                lineTo(17.0859f, 6.4453f)
                curveTo(18.2461f, 6.4453f, 18.9141f, 7.0664f, 18.9141f, 8.2852f)
                lineTo(18.9141f, 20.2266f)
                curveTo(18.9141f, 21.4453f, 18.2461f, 22.0664f, 17.4375f, 22.0664f)
                lineTo(3.7031f, 22.0664f)
                curveTo(2.5313f, 22.0664f, 1.8867f, 21.4453f, 1.8867f, 20.2266f)
                close()
                moveTo(7.4297f, 4.5586f)
                curveTo(7.4883f, 3.0352f, 8.7422f, 1.7813f, 10.3945f, 1.7813f)
                curveTo(12.0469f, 1.7813f, 13.3125f, 3.0352f, 13.3594f, 4.5586f)
                close()
            }
        }
        .build()
        return _bag!!
    }

private var _bag: ImageVector? = null
