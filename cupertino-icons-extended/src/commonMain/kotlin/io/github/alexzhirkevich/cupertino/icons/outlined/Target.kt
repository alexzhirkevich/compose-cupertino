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

public val CupertinoIcons.Outlined.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 23.9062.dp, defaultHeight = 23.918.dp,
                viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9648f, 14.9883f)
                curveTo(13.6289f, 14.9883f, 15.0f, 13.6289f, 15.0f, 11.9414f)
                curveTo(15.0f, 10.2773f, 13.6289f, 8.918f, 11.9648f, 8.918f)
                curveTo(10.2891f, 8.918f, 8.918f, 10.2773f, 8.918f, 11.9414f)
                curveTo(8.918f, 13.6289f, 10.2891f, 14.9883f, 11.9648f, 14.9883f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 19.3828f)
                curveTo(16.0195f, 19.3828f, 19.3828f, 16.0078f, 19.3828f, 11.9531f)
                curveTo(19.3828f, 7.8867f, 16.0078f, 4.5117f, 11.9531f, 4.5117f)
                curveTo(7.8867f, 4.5117f, 4.5234f, 7.8867f, 4.5234f, 11.9531f)
                curveTo(4.5234f, 16.0078f, 7.8984f, 19.3828f, 11.9531f, 19.3828f)
                close()
                moveTo(11.9531f, 17.4961f)
                curveTo(8.9414f, 17.4961f, 6.4102f, 14.9648f, 6.4102f, 11.9531f)
                curveTo(6.4102f, 8.918f, 8.9297f, 6.3984f, 11.9531f, 6.3984f)
                curveTo(14.9648f, 6.3984f, 17.4961f, 8.9297f, 17.4961f, 11.9531f)
                curveTo(17.4961f, 14.9766f, 14.9766f, 17.4961f, 11.9531f, 17.4961f)
                close()
            }
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
                curveTo(17.4727f, 1.9922f, 21.9023f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9258f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
