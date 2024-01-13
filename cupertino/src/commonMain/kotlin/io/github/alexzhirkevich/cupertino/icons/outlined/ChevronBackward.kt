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

public val CupertinoIcons.Outlined.ChevronBackward: ImageVector
    get() {
        if (_chevronBackward != null) {
            return _chevronBackward!!
        }
        _chevronBackward = Builder(name = "ChevronBackward", defaultWidth = 11.4609.dp,
                defaultHeight = 20.3555.dp, viewportWidth = 11.4609f, viewportHeight =
                20.3555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.1719f)
                curveTo(0.0f, 10.4648f, 0.1055f, 10.7227f, 0.3281f, 10.9453f)
                lineTo(9.6211f, 20.0273f)
                curveTo(9.8203f, 20.2383f, 10.0781f, 20.3438f, 10.3828f, 20.3438f)
                curveTo(10.9922f, 20.3438f, 11.4609f, 19.8867f, 11.4609f, 19.2773f)
                curveTo(11.4609f, 18.9727f, 11.332f, 18.7148f, 11.1445f, 18.5156f)
                lineTo(2.6133f, 10.1719f)
                lineTo(11.1445f, 1.8281f)
                curveTo(11.332f, 1.6289f, 11.4609f, 1.3594f, 11.4609f, 1.0664f)
                curveTo(11.4609f, 0.457f, 10.9922f, 0.0f, 10.3828f, 0.0f)
                curveTo(10.0781f, 0.0f, 9.8203f, 0.1055f, 9.6211f, 0.3047f)
                lineTo(0.3281f, 9.3984f)
                curveTo(0.1055f, 9.6094f, 0.0f, 9.8789f, 0.0f, 10.1719f)
                close()
            }
        }
        .build()
        return _chevronBackward!!
    }

private var _chevronBackward: ImageVector? = null
