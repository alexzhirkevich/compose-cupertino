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

public val CupertinoIcons.Outlined.Creditcard: ImageVector
    get() {
        if (_creditcard != null) {
            return _creditcard!!
        }
        _creditcard = Builder(name = "Creditcard", defaultWidth = 27.5391.dp, defaultHeight =
                20.0273.dp, viewportWidth = 27.5391f, viewportHeight = 20.0273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2617f, 15.9258f)
                lineTo(8.1328f, 15.9258f)
                curveTo(8.8242f, 15.9258f, 9.2813f, 15.457f, 9.2813f, 14.8008f)
                lineTo(9.2813f, 12.6328f)
                curveTo(9.2813f, 11.9648f, 8.8242f, 11.5078f, 8.1328f, 11.5078f)
                lineTo(5.2617f, 11.5078f)
                curveTo(4.5703f, 11.5078f, 4.1133f, 11.9648f, 4.1133f, 12.6328f)
                lineTo(4.1133f, 14.8008f)
                curveTo(4.1133f, 15.457f, 4.5703f, 15.9258f, 5.2617f, 15.9258f)
                close()
                moveTo(0.9492f, 7.3359f)
                lineTo(26.6016f, 7.3359f)
                lineTo(26.6016f, 4.6758f)
                lineTo(0.9492f, 4.6758f)
                close()
                moveTo(3.6797f, 20.0273f)
                lineTo(23.8594f, 20.0273f)
                curveTo(26.3203f, 20.0273f, 27.5391f, 18.8203f, 27.5391f, 16.4062f)
                lineTo(27.5391f, 3.6445f)
                curveTo(27.5391f, 1.2305f, 26.3203f, 0.0117f, 23.8594f, 0.0117f)
                lineTo(3.6797f, 0.0117f)
                curveTo(1.2305f, 0.0117f, 0.0f, 1.2305f, 0.0f, 3.6445f)
                lineTo(0.0f, 16.4062f)
                curveTo(0.0f, 18.8203f, 1.2305f, 20.0273f, 3.6797f, 20.0273f)
                close()
                moveTo(3.7031f, 18.1406f)
                curveTo(2.5313f, 18.1406f, 1.8867f, 17.5195f, 1.8867f, 16.3008f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.8984f, 3.7031f, 1.8984f)
                lineTo(23.8359f, 1.8984f)
                curveTo(24.9844f, 1.8984f, 25.6523f, 2.5313f, 25.6523f, 3.75f)
                lineTo(25.6523f, 16.3008f)
                curveTo(25.6523f, 17.5195f, 24.9844f, 18.1406f, 23.8359f, 18.1406f)
                close()
            }
        }
        .build()
        return _creditcard!!
    }

private var _creditcard: ImageVector? = null
