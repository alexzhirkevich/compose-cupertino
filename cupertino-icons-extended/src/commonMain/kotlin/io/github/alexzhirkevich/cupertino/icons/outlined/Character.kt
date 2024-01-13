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

public val CupertinoIcons.Outlined.Character: ImageVector
    get() {
        if (_character != null) {
            return _character!!
        }
        _character = Builder(name = "Character", defaultWidth = 14.2266.dp, defaultHeight =
                17.332.dp, viewportWidth = 14.2266f, viewportHeight = 17.332f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.9844f, 17.3086f)
                curveTo(1.6055f, 17.3086f, 1.9102f, 17.0742f, 2.1328f, 16.418f)
                lineTo(3.6445f, 12.2812f)
                lineTo(10.5586f, 12.2812f)
                lineTo(12.0703f, 16.418f)
                curveTo(12.293f, 17.0742f, 12.5977f, 17.3086f, 13.207f, 17.3086f)
                curveTo(13.8281f, 17.3086f, 14.2266f, 16.9336f, 14.2266f, 16.3477f)
                curveTo(14.2266f, 16.1484f, 14.1914f, 15.9609f, 14.0977f, 15.7148f)
                lineTo(8.6016f, 1.0781f)
                curveTo(8.332f, 0.3633f, 7.8516f, 0.0f, 7.1016f, 0.0f)
                curveTo(6.375f, 0.0f, 5.8828f, 0.3516f, 5.625f, 1.0664f)
                lineTo(0.1289f, 15.7266f)
                curveTo(0.0352f, 15.9727f, 0.0f, 16.1602f, 0.0f, 16.3594f)
                curveTo(0.0f, 16.9453f, 0.375f, 17.3086f, 0.9844f, 17.3086f)
                close()
                moveTo(4.2188f, 10.5f)
                lineTo(7.0664f, 2.6133f)
                lineTo(7.125f, 2.6133f)
                lineTo(9.9727f, 10.5f)
                close()
            }
        }
        .build()
        return _character!!
    }

private var _character: ImageVector? = null
