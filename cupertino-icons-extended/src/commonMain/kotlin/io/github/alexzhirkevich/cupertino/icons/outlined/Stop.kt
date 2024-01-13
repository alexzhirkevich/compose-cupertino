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

public val CupertinoIcons.Outlined.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 19.0898.dp, defaultHeight = 19.1133.dp,
                viewportWidth = 19.0898f, viewportHeight = 19.1133f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.5117f)
                curveTo(0.0f, 18.1406f, 0.9844f, 19.1016f, 2.625f, 19.1016f)
                lineTo(16.4648f, 19.1016f)
                curveTo(18.1172f, 19.1016f, 19.0898f, 18.1406f, 19.0898f, 16.5117f)
                lineTo(19.0898f, 2.5898f)
                curveTo(19.0898f, 0.9609f, 18.1172f, 0.0f, 16.4648f, 0.0f)
                lineTo(2.625f, 0.0f)
                curveTo(0.9844f, 0.0f, 0.0f, 0.9609f, 0.0f, 2.5898f)
                close()
                moveTo(1.8867f, 16.0664f)
                lineTo(1.8867f, 3.0352f)
                curveTo(1.8867f, 2.3203f, 2.3086f, 1.8867f, 3.0117f, 1.8867f)
                lineTo(16.0781f, 1.8867f)
                curveTo(16.793f, 1.8867f, 17.2031f, 2.3203f, 17.2031f, 3.0352f)
                lineTo(17.2031f, 16.0664f)
                curveTo(17.2031f, 16.7812f, 16.793f, 17.2148f, 16.0781f, 17.2148f)
                lineTo(3.0117f, 17.2148f)
                curveTo(2.3086f, 17.2148f, 1.8867f, 16.7812f, 1.8867f, 16.0664f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
