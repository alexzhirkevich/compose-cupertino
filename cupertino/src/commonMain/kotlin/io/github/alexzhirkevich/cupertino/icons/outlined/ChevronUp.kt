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

public val CupertinoIcons.Outlined.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = Builder(name = "ChevronUp", defaultWidth = 20.3555.dp, defaultHeight =
                12.4102.dp, viewportWidth = 20.3555f, viewportHeight = 12.4102f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3164f, 9.6328f)
                curveTo(0.1172f, 9.8203f, 0.0f, 10.0898f, 0.0f, 10.3945f)
                curveTo(0.0f, 11.0039f, 0.457f, 11.4609f, 1.0664f, 11.4609f)
                curveTo(1.3711f, 11.4609f, 1.6523f, 11.3555f, 1.8281f, 11.1562f)
                lineTo(10.8047f, 1.9922f)
                lineTo(9.5508f, 1.9922f)
                lineTo(18.5273f, 11.1562f)
                curveTo(18.7148f, 11.3555f, 18.9961f, 11.4609f, 19.2891f, 11.4609f)
                curveTo(19.8984f, 11.4609f, 20.3555f, 11.0039f, 20.3555f, 10.3945f)
                curveTo(20.3555f, 10.0898f, 20.2383f, 9.8203f, 20.0391f, 9.6328f)
                lineTo(10.9688f, 0.3516f)
                curveTo(10.7695f, 0.1289f, 10.4766f, 0.0f, 10.1836f, 0.0f)
                curveTo(9.8789f, 0.0f, 9.5977f, 0.1289f, 9.3867f, 0.3516f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
