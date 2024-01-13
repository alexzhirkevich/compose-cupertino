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

public val CupertinoIcons.Outlined.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 22.2455.dp, defaultHeight = 22.174.dp,
                viewportWidth = 22.2455f, viewportHeight = 22.174f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0001f, 8.9718f)
                curveTo(-0.6171f, 9.7218f, -0.1718f, 11.8897f, 1.6095f, 11.9014f)
                lineTo(10.1524f, 11.9366f)
                curveTo(10.2931f, 11.9366f, 10.3282f, 11.9718f, 10.3282f, 12.1124f)
                lineTo(10.3516f, 20.585f)
                curveTo(10.3634f, 22.4366f, 12.5665f, 22.7647f, 13.3516f, 21.0655f)
                lineTo(22.0118f, 2.4444f)
                curveTo(22.8087f, 0.71f, 21.4493f, -0.5204f, 19.7266f, 0.2882f)
                close()
                moveTo(3.0391f, 10.0733f)
                curveTo(2.9923f, 10.0733f, 2.9806f, 10.0264f, 3.0391f, 10.003f)
                lineTo(19.879f, 2.2921f)
                curveTo(19.961f, 2.2569f, 19.9962f, 2.2803f, 19.961f, 2.3741f)
                lineTo(12.2032f, 19.2022f)
                curveTo(12.1915f, 19.2491f, 12.1446f, 19.2374f, 12.1446f, 19.1905f)
                lineTo(12.2032f, 10.9054f)
                curveTo(12.2032f, 10.3897f, 11.8399f, 10.0264f, 11.3126f, 10.0264f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
