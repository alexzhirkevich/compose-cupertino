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

public val CupertinoIcons.Filled.PlusCircle: ImageVector
    get() {
        if (_plusCircle != null) {
            return _plusCircle!!
        }
        _plusCircle = Builder(name = "PlusCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(6.2344f, 11.9648f)
                curveTo(6.2344f, 11.3555f, 6.6563f, 10.9336f, 7.2656f, 10.9336f)
                lineTo(10.9336f, 10.9336f)
                lineTo(10.9336f, 7.2656f)
                curveTo(10.9336f, 6.6563f, 11.3438f, 6.2227f, 11.9414f, 6.2227f)
                curveTo(12.5508f, 6.2227f, 12.9727f, 6.6563f, 12.9727f, 7.2656f)
                lineTo(12.9727f, 10.9336f)
                lineTo(16.6523f, 10.9336f)
                curveTo(17.25f, 10.9336f, 17.6836f, 11.3555f, 17.6836f, 11.9648f)
                curveTo(17.6836f, 12.5625f, 17.25f, 12.9609f, 16.6523f, 12.9609f)
                lineTo(12.9727f, 12.9609f)
                lineTo(12.9727f, 16.6406f)
                curveTo(12.9727f, 17.25f, 12.5508f, 17.6719f, 11.9414f, 17.6719f)
                curveTo(11.3438f, 17.6719f, 10.9336f, 17.2383f, 10.9336f, 16.6406f)
                lineTo(10.9336f, 12.9609f)
                lineTo(7.2656f, 12.9609f)
                curveTo(6.6563f, 12.9609f, 6.2344f, 12.5625f, 6.2344f, 11.9648f)
                close()
            }
        }
        .build()
        return _plusCircle!!
    }

private var _plusCircle: ImageVector? = null
