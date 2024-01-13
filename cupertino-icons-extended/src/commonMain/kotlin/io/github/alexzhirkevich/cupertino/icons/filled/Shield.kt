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

public val CupertinoIcons.Filled.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 19.1719.dp, defaultHeight = 23.6602.dp,
                viewportWidth = 19.1719f, viewportHeight = 23.6602f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5859f, 23.6602f)
                curveTo(9.7734f, 23.6602f, 10.0664f, 23.5898f, 10.3594f, 23.4375f)
                curveTo(17.0273f, 19.9453f, 19.1719f, 18.1992f, 19.1719f, 13.9922f)
                lineTo(19.1719f, 5.1563f)
                curveTo(19.1719f, 3.9492f, 18.6562f, 3.5625f, 17.6719f, 3.1523f)
                curveTo(16.3008f, 2.5898f, 11.918f, 0.9961f, 10.5586f, 0.5273f)
                curveTo(10.2422f, 0.4219f, 9.9141f, 0.3633f, 9.5859f, 0.3633f)
                curveTo(9.2578f, 0.3633f, 8.9297f, 0.4336f, 8.625f, 0.5273f)
                curveTo(7.2539f, 0.9727f, 2.8711f, 2.6016f, 1.5f, 3.1523f)
                curveTo(0.5273f, 3.5508f, 0.0f, 3.9492f, 0.0f, 5.1563f)
                lineTo(0.0f, 13.9922f)
                curveTo(0.0f, 18.1992f, 2.2617f, 19.7461f, 8.8125f, 23.4375f)
                curveTo(9.1172f, 23.6016f, 9.3984f, 23.6602f, 9.5859f, 23.6602f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
