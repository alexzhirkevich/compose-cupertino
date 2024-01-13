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

public val CupertinoIcons.Outlined.Xmark: ImageVector
    get() {
        if (_xmark != null) {
            return _xmark!!
        }
        _xmark = Builder(name = "Xmark", defaultWidth = 18.583.dp, defaultHeight = 18.5948.dp,
                viewportWidth = 18.583f, viewportHeight = 18.5948f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3032f, 18.2915f)
                curveTo(0.7134f, 18.69f, 1.3931f, 18.69f, 1.7915f, 18.2915f)
                lineTo(9.2915f, 10.7915f)
                lineTo(16.7915f, 18.2915f)
                curveTo(17.19f, 18.69f, 17.8814f, 18.7017f, 18.2798f, 18.2915f)
                curveTo(18.6782f, 17.8814f, 18.6782f, 17.2134f, 18.2798f, 16.815f)
                lineTo(10.7798f, 9.3032f)
                lineTo(18.2798f, 1.8032f)
                curveTo(18.6782f, 1.4048f, 18.69f, 0.7251f, 18.2798f, 0.3267f)
                curveTo(17.8696f, -0.0835f, 17.19f, -0.0835f, 16.7915f, 0.3267f)
                lineTo(9.2915f, 7.8267f)
                lineTo(1.7915f, 0.3267f)
                curveTo(1.3931f, -0.0835f, 0.7017f, -0.0952f, 0.3032f, 0.3267f)
                curveTo(-0.0952f, 0.7368f, -0.0952f, 1.4048f, 0.3032f, 1.8032f)
                lineTo(7.8032f, 9.3032f)
                lineTo(0.3032f, 16.815f)
                curveTo(-0.0952f, 17.2134f, -0.1069f, 17.8931f, 0.3032f, 18.2915f)
                close()
            }
        }
        .build()
        return _xmark!!
    }

private var _xmark: ImageVector? = null
