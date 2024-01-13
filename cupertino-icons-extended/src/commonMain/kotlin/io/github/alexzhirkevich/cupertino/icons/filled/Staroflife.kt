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

public val CupertinoIcons.Filled.Staroflife: ImageVector
    get() {
        if (_staroflife != null) {
            return _staroflife!!
        }
        _staroflife = Builder(name = "Staroflife", defaultWidth = 22.3828.dp, defaultHeight =
                24.5508.dp, viewportWidth = 22.3828f, viewportHeight = 24.5508f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0977f, 24.5508f)
                lineTo(11.25f, 24.5508f)
                curveTo(12.8789f, 24.5508f, 13.5f, 24.0352f, 13.5f, 22.418f)
                lineTo(13.5f, 14.5195f)
                lineTo(11.9766f, 15.3516f)
                lineTo(18.8438f, 19.3242f)
                curveTo(19.3594f, 19.5938f, 19.7695f, 19.7695f, 20.1445f, 19.7695f)
                curveTo(20.7891f, 19.7695f, 21.2344f, 19.3242f, 21.7734f, 18.5156f)
                lineTo(21.8555f, 18.3867f)
                curveTo(22.207f, 17.8594f, 22.3828f, 17.3789f, 22.3828f, 16.9805f)
                curveTo(22.3828f, 16.3242f, 21.9258f, 15.832f, 21.1172f, 15.3867f)
                lineTo(14.1211f, 11.3438f)
                lineTo(14.1211f, 13.0195f)
                lineTo(21.1055f, 9.1641f)
                curveTo(21.9258f, 8.7305f, 22.3477f, 8.25f, 22.3477f, 7.5938f)
                curveTo(22.3477f, 7.1953f, 22.1719f, 6.7383f, 21.8789f, 6.2109f)
                lineTo(21.7969f, 6.0586f)
                curveTo(21.2695f, 5.2031f, 20.7891f, 4.7695f, 20.1562f, 4.7695f)
                curveTo(19.7812f, 4.7695f, 19.3477f, 4.9453f, 18.832f, 5.2148f)
                lineTo(11.9883f, 9.1875f)
                lineTo(13.5f, 10.0195f)
                lineTo(13.5f, 2.1328f)
                curveTo(13.5f, 0.5156f, 12.8789f, 0.0f, 11.25f, 0.0f)
                lineTo(11.0977f, 0.0f)
                curveTo(9.4688f, 0.0f, 8.8477f, 0.5156f, 8.8477f, 2.1328f)
                lineTo(8.8477f, 10.0195f)
                lineTo(10.3945f, 9.1875f)
                lineTo(3.5273f, 5.2148f)
                curveTo(3.0117f, 4.9219f, 2.5313f, 4.7344f, 2.1328f, 4.7344f)
                curveTo(1.4883f, 4.7344f, 0.9609f, 5.1797f, 0.5508f, 6.082f)
                lineTo(0.4805f, 6.2109f)
                curveTo(0.2227f, 6.75f, 0.0586f, 7.2188f, 0.0586f, 7.6172f)
                curveTo(0.0586f, 8.2383f, 0.4453f, 8.7188f, 1.2656f, 9.1758f)
                lineTo(8.2617f, 13.0195f)
                lineTo(8.2617f, 11.3438f)
                lineTo(1.2539f, 15.3867f)
                curveTo(0.4453f, 15.832f, 0.0f, 16.3125f, 0.0f, 16.957f)
                curveTo(0.0f, 17.3555f, 0.1875f, 17.8359f, 0.4922f, 18.375f)
                lineTo(0.5625f, 18.4805f)
                curveTo(1.0547f, 19.3359f, 1.5234f, 19.7812f, 2.1914f, 19.7812f)
                curveTo(2.5664f, 19.7812f, 3.0117f, 19.5938f, 3.5156f, 19.3242f)
                lineTo(10.3945f, 15.3516f)
                lineTo(8.8477f, 14.5195f)
                lineTo(8.8477f, 22.418f)
                curveTo(8.8477f, 24.0352f, 9.4688f, 24.5508f, 11.0977f, 24.5508f)
                close()
            }
        }
        .build()
        return _staroflife!!
    }

private var _staroflife: ImageVector? = null
