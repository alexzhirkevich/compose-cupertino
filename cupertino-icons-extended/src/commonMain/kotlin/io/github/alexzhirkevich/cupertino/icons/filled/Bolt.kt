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

package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 16.5117.dp, defaultHeight = 26.3734.dp,
                viewportWidth = 16.5117f, viewportHeight = 26.3734f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.5402f)
                curveTo(0.0f, 14.9972f, 0.3516f, 15.3371f, 0.8438f, 15.3371f)
                lineTo(7.4648f, 15.3371f)
                lineTo(3.9727f, 24.8293f)
                curveTo(3.5156f, 26.0363f, 4.7695f, 26.6808f, 5.5547f, 25.6965f)
                lineTo(16.207f, 12.384f)
                curveTo(16.4062f, 12.1379f, 16.5117f, 11.9035f, 16.5117f, 11.634f)
                curveTo(16.5117f, 11.1887f, 16.1602f, 10.8371f, 15.668f, 10.8371f)
                lineTo(9.0469f, 10.8371f)
                lineTo(12.5391f, 1.3449f)
                curveTo(12.9961f, 0.1379f, 11.7422f, -0.5067f, 10.957f, 0.4894f)
                lineTo(0.3047f, 13.7902f)
                curveTo(0.1055f, 14.048f, 0.0f, 14.2824f, 0.0f, 14.5402f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
