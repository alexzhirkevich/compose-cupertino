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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 23.6909.dp, defaultHeight =
                24.293.dp, viewportWidth = 23.6909f, viewportHeight = 24.293f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7202f, 14.4609f)
                curveTo(2.7202f, 18.7383f, 5.0171f, 20.3086f, 11.6734f, 24.0586f)
                curveTo(11.978f, 24.2227f, 12.271f, 24.293f, 12.4585f, 24.293f)
                curveTo(12.646f, 24.293f, 12.9507f, 24.2227f, 13.2437f, 24.0586f)
                curveTo(15.0835f, 23.0273f, 16.5718f, 22.1602f, 17.7788f, 21.3633f)
                lineTo(16.3491f, 19.9219f)
                curveTo(15.4702f, 20.4961f, 14.4273f, 21.1172f, 13.1851f, 21.8906f)
                curveTo(12.8452f, 22.1016f, 12.646f, 22.1719f, 12.4585f, 22.1719f)
                curveTo(12.271f, 22.1719f, 12.0835f, 22.1016f, 11.732f, 21.8906f)
                curveTo(6.3179f, 18.6094f, 4.5835f, 17.6484f, 4.5835f, 14.0273f)
                lineTo(4.5835f, 8.1563f)
                lineTo(2.7202f, 6.3047f)
                close()
                moveTo(21.2007f, 18.2578f)
                curveTo(21.9038f, 17.1914f, 22.1968f, 16.0078f, 22.1968f, 14.4609f)
                lineTo(22.1968f, 5.4961f)
                curveTo(22.1968f, 4.2656f, 21.6695f, 3.8789f, 20.6734f, 3.457f)
                curveTo(19.2905f, 2.8828f, 14.8257f, 1.2773f, 13.4429f, 0.7969f)
                curveTo(13.1265f, 0.6914f, 12.7866f, 0.6211f, 12.4585f, 0.6211f)
                curveTo(12.1304f, 0.6211f, 11.7905f, 0.7148f, 11.4859f, 0.7969f)
                curveTo(10.4077f, 1.1367f, 7.7827f, 2.0859f, 5.8023f, 2.8477f)
                lineTo(7.2671f, 4.3242f)
                curveTo(8.8726f, 3.7266f, 10.8413f, 3.0234f, 11.9898f, 2.6133f)
                curveTo(12.1773f, 2.5313f, 12.3296f, 2.5078f, 12.4585f, 2.5078f)
                curveTo(12.5874f, 2.5078f, 12.7398f, 2.543f, 12.9273f, 2.6133f)
                curveTo(14.7202f, 3.2578f, 18.1304f, 4.5586f, 19.9468f, 5.1797f)
                curveTo(20.2632f, 5.2969f, 20.3335f, 5.4609f, 20.3335f, 5.8594f)
                lineTo(20.3335f, 14.0273f)
                curveTo(20.3335f, 15.1641f, 20.1577f, 16.043f, 19.7359f, 16.793f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1499f, 23.7422f)
                curveTo(22.5015f, 24.0938f, 23.0874f, 24.0938f, 23.4273f, 23.7422f)
                curveTo(23.7788f, 23.3906f, 23.7788f, 22.8164f, 23.4273f, 22.4648f)
                lineTo(1.5484f, 0.5977f)
                curveTo(1.1968f, 0.2461f, 0.6226f, 0.2461f, 0.2593f, 0.5977f)
                curveTo(-0.0923f, 0.9375f, -0.0805f, 1.5234f, 0.2593f, 1.875f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
