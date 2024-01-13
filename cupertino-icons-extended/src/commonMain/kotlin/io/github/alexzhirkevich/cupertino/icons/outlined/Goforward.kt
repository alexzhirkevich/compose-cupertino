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

public val CupertinoIcons.Outlined.Goforward: ImageVector
    get() {
        if (_goforward != null) {
            return _goforward!!
        }
        _goforward = Builder(name = "Goforward", defaultWidth = 23.9062.dp, defaultHeight =
                28.455.dp, viewportWidth = 23.9062f, viewportHeight = 28.455f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.2216f)
                curveTo(0.0f, 20.7607f, 5.4258f, 26.1748f, 11.9531f, 26.1748f)
                curveTo(18.4922f, 26.1748f, 23.9062f, 20.7607f, 23.9062f, 14.2216f)
                curveTo(23.9062f, 10.2841f, 21.9141f, 6.7451f, 18.9023f, 4.5537f)
                curveTo(18.3867f, 4.1552f, 17.7422f, 4.2841f, 17.4492f, 4.7646f)
                curveTo(17.1562f, 5.2568f, 17.3086f, 5.8076f, 17.7891f, 6.1708f)
                curveTo(20.2852f, 7.9521f, 21.9023f, 10.8935f, 21.9141f, 14.2216f)
                curveTo(21.9258f, 19.7529f, 17.4844f, 24.1826f, 11.9531f, 24.1826f)
                curveTo(6.4219f, 24.1826f, 2.0039f, 19.7529f, 2.0039f, 14.2216f)
                curveTo(2.0039f, 9.4755f, 5.2617f, 5.538f, 9.6914f, 4.5302f)
                lineTo(9.6914f, 6.206f)
                curveTo(9.6914f, 7.038f, 10.2656f, 7.2607f, 10.9102f, 6.8037f)
                lineTo(14.6484f, 4.1787f)
                curveTo(15.1758f, 3.8154f, 15.1875f, 3.2529f, 14.6484f, 2.8662f)
                lineTo(10.9219f, 0.2412f)
                curveTo(10.2656f, -0.2276f, 9.6914f, -0.0049f, 9.6914f, 0.8388f)
                lineTo(9.6914f, 2.4912f)
                curveTo(4.207f, 3.5693f, 0.0f, 8.456f, 0.0f, 14.2216f)
                close()
            }
        }
        .build()
        return _goforward!!
    }

private var _goforward: ImageVector? = null
