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

public val CupertinoIcons.Filled.VideoCircle: ImageVector
    get() {
        if (_videoCircle != null) {
            return _videoCircle!!
        }
        _videoCircle = Builder(name = "VideoCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(6.9141f, 16.8398f)
                curveTo(5.707f, 16.8398f, 4.9922f, 16.1367f, 4.9922f, 14.9531f)
                lineTo(4.9922f, 9.0f)
                curveTo(4.9922f, 7.793f, 5.7539f, 7.1016f, 6.9141f, 7.1016f)
                lineTo(13.3594f, 7.1016f)
                curveTo(14.5781f, 7.1016f, 15.2109f, 7.793f, 15.2109f, 9.0f)
                lineTo(15.2109f, 14.9531f)
                curveTo(15.2109f, 16.1367f, 14.5078f, 16.8398f, 13.3008f, 16.8398f)
                close()
                moveTo(15.8906f, 13.6172f)
                lineTo(15.8906f, 10.3242f)
                lineTo(18.2578f, 8.3086f)
                curveTo(18.457f, 8.1445f, 18.7148f, 8.0273f, 18.9258f, 8.0273f)
                curveTo(19.3828f, 8.0273f, 19.6875f, 8.3555f, 19.6875f, 8.8594f)
                lineTo(19.6875f, 15.082f)
                curveTo(19.6875f, 15.5977f, 19.3828f, 15.9258f, 18.9258f, 15.9258f)
                curveTo(18.7148f, 15.9258f, 18.4688f, 15.8086f, 18.2578f, 15.6328f)
                close()
            }
        }
        .build()
        return _videoCircle!!
    }

private var _videoCircle: ImageVector? = null
