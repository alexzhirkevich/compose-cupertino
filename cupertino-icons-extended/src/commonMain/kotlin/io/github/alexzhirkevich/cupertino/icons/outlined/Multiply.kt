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

public val CupertinoIcons.Outlined.Multiply: ImageVector
    get() {
        if (_multiply != null) {
            return _multiply!!
        }
        _multiply = Builder(name = "Multiply", defaultWidth = 15.5918.dp, defaultHeight =
                15.6182.dp, viewportWidth = 15.5918f, viewportHeight = 15.6182f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3032f, 15.315f)
                curveTo(0.7017f, 15.7251f, 1.3931f, 15.7134f, 1.7915f, 15.315f)
                lineTo(7.7915f, 9.3032f)
                lineTo(13.8032f, 15.315f)
                curveTo(14.2017f, 15.7134f, 14.8814f, 15.7251f, 15.2798f, 15.315f)
                curveTo(15.7017f, 14.9048f, 15.69f, 14.2251f, 15.2798f, 13.8267f)
                lineTo(9.2798f, 7.815f)
                lineTo(15.2798f, 1.815f)
                curveTo(15.69f, 1.4165f, 15.7017f, 0.7251f, 15.2798f, 0.3267f)
                curveTo(14.8814f, -0.0835f, 14.2017f, -0.0718f, 13.8032f, 0.3267f)
                lineTo(7.7915f, 6.3384f)
                lineTo(1.7915f, 0.3267f)
                curveTo(1.3931f, -0.0718f, 0.7017f, -0.0835f, 0.3032f, 0.3267f)
                curveTo(-0.1069f, 0.7251f, -0.0952f, 1.4165f, 0.3032f, 1.815f)
                lineTo(6.315f, 7.815f)
                lineTo(0.3032f, 13.8267f)
                curveTo(-0.0952f, 14.2251f, -0.1069f, 14.9048f, 0.3032f, 15.315f)
                close()
            }
        }
        .build()
        return _multiply!!
    }

private var _multiply: ImageVector? = null
