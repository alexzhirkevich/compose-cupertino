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

public val CupertinoIcons.Outlined.EllipsisCircle: ImageVector
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
                moveTo(6.4805f, 13.6523f)
                curveTo(7.418f, 13.6523f, 8.1797f, 12.8906f, 8.1797f, 11.9414f)
                curveTo(8.1797f, 11.0039f, 7.4063f, 10.2422f, 6.4805f, 10.2422f)
                curveTo(5.5313f, 10.2422f, 4.7695f, 11.0039f, 4.7695f, 11.9414f)
                curveTo(4.7695f, 12.8906f, 5.5313f, 13.6523f, 6.4805f, 13.6523f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9414f, 13.6523f)
                curveTo(12.8789f, 13.6523f, 13.6523f, 12.8906f, 13.6523f, 11.9414f)
                curveTo(13.6523f, 11.0039f, 12.8789f, 10.2422f, 11.9414f, 10.2422f)
                curveTo(11.0039f, 10.2422f, 10.2305f, 11.0039f, 10.2305f, 11.9414f)
                curveTo(10.2305f, 12.8906f, 11.0039f, 13.6523f, 11.9414f, 13.6523f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4141f, 13.6523f)
                curveTo(18.3516f, 13.6523f, 19.1133f, 12.8906f, 19.1133f, 11.9414f)
                curveTo(19.1133f, 11.0039f, 18.3516f, 10.2422f, 17.4141f, 10.2422f)
                curveTo(16.4648f, 10.2422f, 15.7031f, 11.0039f, 15.7031f, 11.9414f)
                curveTo(15.7031f, 12.8906f, 16.4648f, 13.6523f, 17.4141f, 13.6523f)
                close()
            }
        }
        .build()
        return _ellipsisCircle!!
    }

private var _ellipsisCircle: ImageVector? = null
