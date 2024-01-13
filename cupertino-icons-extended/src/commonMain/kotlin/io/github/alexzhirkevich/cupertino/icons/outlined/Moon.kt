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

public val CupertinoIcons.Outlined.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 23.5781.dp, defaultHeight = 23.7539.dp,
                viewportWidth = 23.5781f, viewportHeight = 23.7539f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4102f, 15.9141f)
                curveTo(11.9531f, 15.9141f, 7.9453f, 12.0234f, 7.9453f, 5.7773f)
                curveTo(7.9453f, 3.9961f, 8.2383f, 2.4258f, 8.6719f, 1.582f)
                curveTo(8.8477f, 1.2422f, 8.8828f, 1.0781f, 8.8828f, 0.8438f)
                curveTo(8.8828f, 0.457f, 8.5195f, 0.0f, 8.0273f, 0.0f)
                curveTo(7.9336f, 0.0f, 7.7109f, 0.0352f, 7.3828f, 0.1641f)
                curveTo(3.0469f, 1.9219f, 0.0f, 6.4922f, 0.0f, 11.4141f)
                curveTo(0.0f, 18.5273f, 5.168f, 23.707f, 12.2812f, 23.707f)
                curveTo(17.3789f, 23.707f, 21.5156f, 21.0352f, 23.4141f, 16.6523f)
                curveTo(23.5547f, 16.3477f, 23.5781f, 16.0898f, 23.5781f, 15.9609f)
                curveTo(23.5781f, 15.4805f, 23.168f, 15.1523f, 22.8047f, 15.1523f)
                curveTo(22.6172f, 15.1523f, 22.4766f, 15.1641f, 22.1953f, 15.2695f)
                curveTo(21.2461f, 15.6562f, 19.8164f, 15.9141f, 18.4102f, 15.9141f)
                close()
                moveTo(1.8398f, 11.332f)
                curveTo(1.8398f, 7.6875f, 3.7383f, 4.2188f, 6.7734f, 2.3086f)
                curveTo(6.3984f, 3.3984f, 6.1992f, 4.6055f, 6.1992f, 5.9414f)
                curveTo(6.1992f, 13.2656f, 10.6641f, 17.625f, 18.1406f, 17.625f)
                curveTo(19.3477f, 17.625f, 20.3672f, 17.4844f, 21.3398f, 17.1445f)
                curveTo(19.5586f, 20.0859f, 16.125f, 21.8789f, 12.3516f, 21.8789f)
                curveTo(6.2695f, 21.8789f, 1.8398f, 17.4492f, 1.8398f, 11.332f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
