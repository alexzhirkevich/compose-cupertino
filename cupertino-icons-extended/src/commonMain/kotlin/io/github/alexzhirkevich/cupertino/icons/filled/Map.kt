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

public val CupertinoIcons.Filled.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.375.dp, defaultHeight = 22.9805.dp,
                viewportWidth = 24.375f, viewportHeight = 22.9805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.2344f)
                curveTo(0.0f, 22.0898f, 0.4922f, 22.582f, 1.3359f, 22.582f)
                curveTo(1.6406f, 22.582f, 1.9336f, 22.4883f, 2.3203f, 22.2773f)
                lineTo(7.2422f, 19.6172f)
                lineTo(7.2422f, 0.1992f)
                curveTo(7.0313f, 0.3047f, 6.7969f, 0.4219f, 6.5859f, 0.5391f)
                lineTo(1.0313f, 3.7266f)
                curveTo(0.3281f, 4.1133f, 0.0f, 4.6758f, 0.0f, 5.4609f)
                close()
                moveTo(8.8477f, 19.3945f)
                lineTo(14.7539f, 22.7109f)
                curveTo(14.9297f, 22.8047f, 15.1172f, 22.8867f, 15.293f, 22.9336f)
                lineTo(15.293f, 3.8086f)
                lineTo(9.5039f, 0.2695f)
                curveTo(9.3047f, 0.1406f, 9.0703f, 0.0469f, 8.8477f, 0.0f)
                close()
                moveTo(16.8867f, 22.8984f)
                curveTo(17.0039f, 22.8633f, 17.1328f, 22.8164f, 17.2383f, 22.7461f)
                lineTo(23.3438f, 19.2773f)
                curveTo(24.0469f, 18.8906f, 24.375f, 18.3281f, 24.375f, 17.543f)
                lineTo(24.375f, 1.7578f)
                curveTo(24.375f, 0.8906f, 23.8828f, 0.4102f, 23.0391f, 0.4102f)
                curveTo(22.7344f, 0.4102f, 22.4414f, 0.5039f, 22.0547f, 0.7148f)
                lineTo(16.8867f, 3.5859f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
