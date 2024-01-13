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

public val CupertinoIcons.Outlined.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 23.9062.dp, defaultHeight = 25.2773.dp,
                viewportWidth = 23.9062f, viewportHeight = 25.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 24.5859f)
                curveTo(18.4922f, 24.5859f, 23.9062f, 19.1602f, 23.9062f, 12.6328f)
                curveTo(23.9062f, 9.0352f, 22.2656f, 5.918f, 20.0156f, 3.8672f)
                curveTo(18.9844f, 2.9297f, 17.6602f, 4.3242f, 18.6797f, 5.2969f)
                curveTo(20.6719f, 7.1133f, 21.9023f, 9.7148f, 21.9141f, 12.6328f)
                curveTo(21.9258f, 18.1641f, 17.4844f, 22.5938f, 11.9531f, 22.5938f)
                curveTo(6.4219f, 22.5938f, 2.0039f, 18.1641f, 2.0039f, 12.6328f)
                curveTo(2.0156f, 9.6914f, 3.2461f, 7.1016f, 5.2266f, 5.2852f)
                curveTo(6.2578f, 4.3008f, 4.9219f, 2.918f, 3.8906f, 3.8555f)
                curveTo(1.6289f, 5.9063f, 0.0f, 9.0352f, 0.0f, 12.6328f)
                curveTo(0.0f, 19.1602f, 5.4258f, 24.5859f, 11.9531f, 24.5859f)
                close()
                moveTo(11.9531f, 12.5156f)
                curveTo(12.5156f, 12.5156f, 12.9023f, 12.1055f, 12.9023f, 11.5195f)
                lineTo(12.9023f, 0.9961f)
                curveTo(12.9023f, 0.3984f, 12.5156f, 0.0f, 11.9531f, 0.0f)
                curveTo(11.3906f, 0.0f, 11.0156f, 0.3984f, 11.0156f, 0.9961f)
                lineTo(11.0156f, 11.5195f)
                curveTo(11.0156f, 12.1055f, 11.3906f, 12.5156f, 11.9531f, 12.5156f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
