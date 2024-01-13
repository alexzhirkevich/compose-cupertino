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

public val CupertinoIcons.Filled.HeartCircle: ImageVector
    get() {
        if (_heartCircle != null) {
            return _heartCircle!!
        }
        _heartCircle = Builder(name = "HeartCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(9.0469f, 6.6094f)
                curveTo(10.3477f, 6.6094f, 11.3438f, 7.3477f, 11.9531f, 8.4492f)
                curveTo(12.5508f, 7.3477f, 13.5703f, 6.6094f, 14.8594f, 6.6094f)
                curveTo(16.8984f, 6.6094f, 18.3867f, 8.1563f, 18.3867f, 10.3008f)
                curveTo(18.3867f, 13.4648f, 15.0117f, 16.3594f, 12.5508f, 17.9648f)
                curveTo(12.3633f, 18.1055f, 12.1289f, 18.2578f, 11.9766f, 18.2578f)
                curveTo(11.8242f, 18.2578f, 11.5547f, 18.0938f, 11.3438f, 17.9648f)
                curveTo(8.8711f, 16.3945f, 5.5195f, 13.4648f, 5.5195f, 10.3008f)
                curveTo(5.5195f, 8.1563f, 6.9961f, 6.6094f, 9.0469f, 6.6094f)
                close()
            }
        }
        .build()
        return _heartCircle!!
    }

private var _heartCircle: ImageVector? = null
