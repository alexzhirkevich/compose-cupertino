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

public val CupertinoIcons.Filled.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 22.9473.dp, defaultHeight = 22.9739.dp,
                viewportWidth = 22.9473f, viewportHeight = 22.9739f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7041f, 7.942f)
                lineTo(2.0635f, 12.5826f)
                curveTo(-0.6553f, 15.3014f, -0.6318f, 18.6881f, 1.8057f, 21.1373f)
                curveTo(4.2549f, 23.5748f, 7.6416f, 23.5983f, 10.3604f, 20.8795f)
                lineTo(15.001f, 16.2389f)
                close()
                moveTo(21.1416f, 1.8014f)
                curveTo(18.6924f, -0.6361f, 15.294f, -0.6478f, 12.5987f, 2.0592f)
                lineTo(7.9463f, 6.6998f)
                lineTo(16.2432f, 14.9967f)
                lineTo(20.8838f, 10.3444f)
                curveTo(23.6026f, 7.6373f, 23.5791f, 4.2506f, 21.1416f, 1.8014f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
