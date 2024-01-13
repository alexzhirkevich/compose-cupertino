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

public val CupertinoIcons.Outlined.AirplaneDeparture: ImageVector
    get() {
        if (_airplaneDeparture != null) {
            return _airplaneDeparture!!
        }
        _airplaneDeparture = Builder(name = "AirplaneDeparture", defaultWidth = 30.1366.dp,
                defaultHeight = 20.9648.dp, viewportWidth = 30.1366f, viewportHeight =
                20.9648f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2961f, 20.9648f)
                lineTo(27.5852f, 20.9648f)
                curveTo(28.1008f, 20.9648f, 28.5344f, 20.5312f, 28.5344f, 20.0156f)
                curveTo(28.5344f, 19.5f, 28.1008f, 19.0781f, 27.5852f, 19.0781f)
                lineTo(2.2961f, 19.0781f)
                curveTo(1.7805f, 19.0781f, 1.3586f, 19.5f, 1.3586f, 20.0156f)
                curveTo(1.3586f, 20.5312f, 1.7805f, 20.9648f, 2.2961f, 20.9648f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5852f, 13.1133f)
                lineTo(26.6829f, 7.7578f)
                curveTo(28.9329f, 7.1484f, 30.6204f, 5.4961f, 30.011f, 3.8203f)
                curveTo(29.4485f, 2.2969f, 27.1868f, 1.9219f, 25.1712f, 2.6016f)
                lineTo(18.1282f, 5.0156f)
                curveTo(17.636f, 5.1797f, 17.2844f, 5.168f, 16.7219f, 4.8984f)
                lineTo(6.9016f, 0.2578f)
                curveTo(6.5852f, 0.1172f, 6.2337f, 0.082f, 5.9173f, 0.1758f)
                lineTo(5.1087f, 0.4219f)
                curveTo(4.8274f, 0.5156f, 4.7337f, 0.8438f, 4.9915f, 1.1133f)
                lineTo(11.7063f, 8.2383f)
                lineTo(11.929f, 7.125f)
                lineTo(5.9993f, 9.1641f)
                lineTo(8.2962f, 9.2344f)
                lineTo(1.429f, 6.7969f)
                curveTo(1.1126f, 6.6914f, 0.8313f, 6.7383f, 0.5266f, 7.0195f)
                lineTo(0.1868f, 7.3359f)
                curveTo(-0.0476f, 7.5469f, -0.0593f, 7.8281f, 0.1399f, 8.0391f)
                lineTo(4.2532f, 12.6562f)
                curveTo(4.7923f, 13.2656f, 5.5891f, 13.3828f, 6.5852f, 13.1133f)
                close()
            }
        }
        .build()
        return _airplaneDeparture!!
    }

private var _airplaneDeparture: ImageVector? = null
