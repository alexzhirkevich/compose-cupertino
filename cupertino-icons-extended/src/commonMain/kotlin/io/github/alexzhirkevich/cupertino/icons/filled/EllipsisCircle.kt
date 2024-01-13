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

public val CupertinoIcons.Filled.EllipsisCircle: ImageVector
    get() {
        if (_ellipsisCircle != null) {
            return _ellipsisCircle!!
        }
        _ellipsisCircle = Builder(name = "EllipsisCircle", defaultWidth = 23.9062.dp, defaultHeight
                = 23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(6.3164f, 13.7109f)
                curveTo(5.3438f, 13.7109f, 4.5469f, 12.9258f, 4.5469f, 11.9414f)
                curveTo(4.5469f, 10.9688f, 5.3438f, 10.1836f, 6.3164f, 10.1836f)
                curveTo(7.2773f, 10.1836f, 8.0742f, 10.9688f, 8.0742f, 11.9414f)
                curveTo(8.0742f, 12.9258f, 7.2891f, 13.7109f, 6.3164f, 13.7109f)
                close()
                moveTo(11.9531f, 13.7109f)
                curveTo(10.9805f, 13.7109f, 10.1836f, 12.9258f, 10.1836f, 11.9414f)
                curveTo(10.1836f, 10.9688f, 10.9805f, 10.1836f, 11.9531f, 10.1836f)
                curveTo(12.9258f, 10.1836f, 13.7109f, 10.9688f, 13.7109f, 11.9414f)
                curveTo(13.7109f, 12.9258f, 12.9258f, 13.7109f, 11.9531f, 13.7109f)
                close()
                moveTo(17.6016f, 13.7109f)
                curveTo(16.6172f, 13.7109f, 15.832f, 12.9258f, 15.832f, 11.9414f)
                curveTo(15.832f, 10.9688f, 16.6172f, 10.1836f, 17.6016f, 10.1836f)
                curveTo(18.5625f, 10.1836f, 19.3594f, 10.9688f, 19.3594f, 11.9414f)
                curveTo(19.3594f, 12.9258f, 18.5625f, 13.7109f, 17.6016f, 13.7109f)
                close()
            }
        }
        .build()
        return _ellipsisCircle!!
    }

private var _ellipsisCircle: ImageVector? = null
