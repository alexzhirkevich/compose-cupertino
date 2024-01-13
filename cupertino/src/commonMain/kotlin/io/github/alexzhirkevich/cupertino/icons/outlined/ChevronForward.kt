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

public val CupertinoIcons.Outlined.ChevronForward: ImageVector
    get() {
        if (_chevronForward != null) {
            return _chevronForward!!
        }
        _chevronForward = Builder(name = "ChevronForward", defaultWidth = 11.4609.dp, defaultHeight
                = 20.3555.dp, viewportWidth = 11.4609f, viewportHeight = 20.3555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4609f, 10.1719f)
                curveTo(11.4609f, 9.8789f, 11.3438f, 9.6094f, 11.1211f, 9.3984f)
                lineTo(1.8398f, 0.3047f)
                curveTo(1.6289f, 0.1055f, 1.3711f, 0.0f, 1.0664f, 0.0f)
                curveTo(0.4688f, 0.0f, 0.0f, 0.457f, 0.0f, 1.0664f)
                curveTo(0.0f, 1.3594f, 0.1172f, 1.6289f, 0.3047f, 1.8281f)
                lineTo(8.8359f, 10.1719f)
                lineTo(0.3047f, 18.5156f)
                curveTo(0.1172f, 18.7148f, 0.0f, 18.9727f, 0.0f, 19.2773f)
                curveTo(0.0f, 19.8867f, 0.4688f, 20.3438f, 1.0664f, 20.3438f)
                curveTo(1.3711f, 20.3438f, 1.6289f, 20.2383f, 1.8398f, 20.0273f)
                lineTo(11.1211f, 10.9453f)
                curveTo(11.3438f, 10.7227f, 11.4609f, 10.4648f, 11.4609f, 10.1719f)
                close()
            }
        }
        .build()
        return _chevronForward!!
    }

private var _chevronForward: ImageVector? = null
