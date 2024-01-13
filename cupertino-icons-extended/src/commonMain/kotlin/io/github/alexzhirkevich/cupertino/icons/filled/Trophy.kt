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

public val CupertinoIcons.Filled.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 22.9219.dp, defaultHeight = 25.6992.dp,
                viewportWidth = 22.9219f, viewportHeight = 25.6992f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.8672f)
                curveTo(0.0f, 8.707f, 2.3203f, 11.7305f, 6.9492f, 13.1484f)
                curveTo(7.6758f, 14.0391f, 8.4961f, 14.7539f, 9.293f, 15.2578f)
                lineTo(9.293f, 20.3555f)
                lineTo(7.4531f, 20.3555f)
                curveTo(5.8008f, 20.3555f, 4.9453f, 21.3047f, 4.9453f, 22.8633f)
                lineTo(4.9453f, 24.7969f)
                curveTo(4.9453f, 25.3242f, 5.3555f, 25.6875f, 5.8477f, 25.6875f)
                lineTo(17.0742f, 25.6875f)
                curveTo(17.5664f, 25.6875f, 17.9766f, 25.3242f, 17.9766f, 24.7969f)
                lineTo(17.9766f, 22.8633f)
                curveTo(17.9766f, 21.3047f, 17.1094f, 20.3555f, 15.457f, 20.3555f)
                lineTo(13.6289f, 20.3555f)
                lineTo(13.6289f, 15.2578f)
                curveTo(14.4258f, 14.7539f, 15.2461f, 14.0391f, 15.9609f, 13.1484f)
                curveTo(20.6016f, 11.7305f, 22.9219f, 8.707f, 22.9219f, 3.8672f)
                curveTo(22.9219f, 2.6602f, 22.1719f, 1.9219f, 20.918f, 1.9219f)
                lineTo(18.6445f, 1.9219f)
                curveTo(18.457f, 0.7266f, 17.6133f, 0.0f, 16.1953f, 0.0f)
                lineTo(6.7266f, 0.0f)
                curveTo(5.3203f, 0.0f, 4.4648f, 0.7148f, 4.2773f, 1.9219f)
                lineTo(2.0039f, 1.9219f)
                curveTo(0.75f, 1.9219f, 0.0f, 2.6602f, 0.0f, 3.8672f)
                close()
                moveTo(1.6758f, 4.0313f)
                curveTo(1.6758f, 3.8438f, 1.8164f, 3.6914f, 2.0156f, 3.6914f)
                lineTo(4.2188f, 3.6914f)
                lineTo(4.2188f, 5.9883f)
                curveTo(4.2188f, 7.7813f, 4.6875f, 9.4453f, 5.4141f, 10.8867f)
                curveTo(2.9648f, 9.6445f, 1.6758f, 7.3711f, 1.6758f, 4.0313f)
                close()
                moveTo(17.4961f, 10.8867f)
                curveTo(18.2344f, 9.4453f, 18.7031f, 7.7813f, 18.7031f, 5.9883f)
                lineTo(18.7031f, 3.6914f)
                lineTo(20.9062f, 3.6914f)
                curveTo(21.1055f, 3.6914f, 21.2461f, 3.8438f, 21.2461f, 4.0313f)
                curveTo(21.2461f, 7.3711f, 19.957f, 9.6445f, 17.4961f, 10.8867f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
