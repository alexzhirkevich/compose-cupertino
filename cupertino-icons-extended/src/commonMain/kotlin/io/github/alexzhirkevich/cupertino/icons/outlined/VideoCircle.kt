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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.VideoCircle: ImageVector
    get() {
        if (_videoCircle != null) {
            return _videoCircle!!
        }
        _videoCircle = Builder(name = "VideoCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0313f, 16.6875f)
                lineTo(13.2305f, 16.6875f)
                curveTo(14.4023f, 16.6875f, 15.0938f, 16.0078f, 15.0938f, 14.8477f)
                lineTo(15.0938f, 9.082f)
                curveTo(15.0938f, 7.9219f, 14.4609f, 7.2539f, 13.2891f, 7.2539f)
                lineTo(7.0313f, 7.2539f)
                curveTo(5.918f, 7.2539f, 5.168f, 7.9219f, 5.168f, 9.082f)
                lineTo(5.168f, 14.8477f)
                curveTo(5.168f, 16.0078f, 5.8711f, 16.6875f, 7.0313f, 16.6875f)
                close()
                moveTo(15.75f, 13.5703f)
                lineTo(18.0352f, 15.5039f)
                curveTo(18.2461f, 15.6797f, 18.4688f, 15.7969f, 18.6797f, 15.7969f)
                curveTo(19.1367f, 15.7969f, 19.4297f, 15.4688f, 19.4297f, 14.9766f)
                lineTo(19.4297f, 8.9414f)
                curveTo(19.4297f, 8.4609f, 19.1367f, 8.1328f, 18.6797f, 8.1328f)
                curveTo(18.4688f, 8.1328f, 18.2344f, 8.25f, 18.0352f, 8.4141f)
                lineTo(15.75f, 10.3594f)
                close()
            }
        }
        .build()
        return _videoCircle!!
    }

private var _videoCircle: ImageVector? = null
