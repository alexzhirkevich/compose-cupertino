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

public val CupertinoIcons.Filled.Paperplane: ImageVector
    get() {
        if (_paperplane != null) {
            return _paperplane!!
        }
        _paperplane = Builder(name = "Paperplane", defaultWidth = 24.5508.dp, defaultHeight =
                25.6758.dp, viewportWidth = 24.5508f, viewportHeight = 25.6758f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6719f, 25.6758f)
                curveTo(15.5156f, 25.6758f, 16.1133f, 24.9492f, 16.5469f, 23.8242f)
                lineTo(24.2227f, 3.7734f)
                curveTo(24.4336f, 3.2344f, 24.5508f, 2.7539f, 24.5508f, 2.3555f)
                curveTo(24.5508f, 1.5938f, 24.082f, 1.125f, 23.3203f, 1.125f)
                curveTo(22.9219f, 1.125f, 22.4414f, 1.2422f, 21.9023f, 1.4531f)
                lineTo(1.7461f, 9.1758f)
                curveTo(0.7617f, 9.5508f, 0.0f, 10.1484f, 0.0f, 11.0039f)
                curveTo(0.0f, 12.082f, 0.8203f, 12.4453f, 1.9453f, 12.7852f)
                lineTo(8.2734f, 14.707f)
                curveTo(9.0234f, 14.9414f, 9.4453f, 14.918f, 9.9492f, 14.4492f)
                lineTo(22.8047f, 2.4375f)
                curveTo(22.957f, 2.2969f, 23.1328f, 2.3203f, 23.25f, 2.4258f)
                curveTo(23.3672f, 2.543f, 23.3789f, 2.7188f, 23.2383f, 2.8711f)
                lineTo(11.2734f, 15.7734f)
                curveTo(10.8164f, 16.2539f, 10.7812f, 16.6523f, 11.0039f, 17.4375f)
                lineTo(12.8672f, 23.625f)
                curveTo(13.2188f, 24.8086f, 13.582f, 25.6758f, 14.6719f, 25.6758f)
                close()
            }
        }
        .build()
        return _paperplane!!
    }

private var _paperplane: ImageVector? = null
