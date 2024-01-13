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

public val CupertinoIcons.Outlined.Macwindow: ImageVector
    get() {
        if (_macwindow != null) {
            return _macwindow!!
        }
        _macwindow = Builder(name = "Macwindow", defaultWidth = 27.6328.dp, defaultHeight =
                21.5977.dp, viewportWidth = 27.6328f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4414f, 4.0195f)
                curveTo(9.8672f, 4.0195f, 9.3984f, 3.5273f, 9.3984f, 2.9766f)
                curveTo(9.3984f, 2.4258f, 9.8672f, 1.9336f, 10.4414f, 1.9336f)
                curveTo(11.0156f, 1.9336f, 11.4844f, 2.4258f, 11.4844f, 2.9766f)
                curveTo(11.4844f, 3.5273f, 11.0156f, 4.0195f, 10.4414f, 4.0195f)
                close()
                moveTo(7.0781f, 4.0195f)
                curveTo(6.5039f, 4.0195f, 6.0352f, 3.5273f, 6.0352f, 2.9766f)
                curveTo(6.0352f, 2.4258f, 6.5039f, 1.9336f, 7.0781f, 1.9336f)
                curveTo(7.6523f, 1.9336f, 8.1328f, 2.4258f, 8.1328f, 2.9766f)
                curveTo(8.1328f, 3.5273f, 7.6523f, 4.0195f, 7.0781f, 4.0195f)
                close()
                moveTo(3.7148f, 4.0195f)
                curveTo(3.1406f, 4.0195f, 2.6719f, 3.5273f, 2.6719f, 2.9766f)
                curveTo(2.6719f, 2.4258f, 3.1406f, 1.9336f, 3.7148f, 1.9336f)
                curveTo(4.2891f, 1.9336f, 4.7695f, 2.4258f, 4.7695f, 2.9766f)
                curveTo(4.7695f, 3.5273f, 4.2891f, 4.0195f, 3.7148f, 4.0195f)
                close()
                moveTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                lineTo(23.9531f, 21.5977f)
                curveTo(26.4141f, 21.5977f, 27.6328f, 20.3789f, 27.6328f, 17.9648f)
                lineTo(27.6328f, 3.6563f)
                curveTo(27.6328f, 1.2422f, 26.4141f, 0.0234f, 23.9531f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                close()
                moveTo(1.8867f, 17.8711f)
                lineTo(1.8867f, 5.9297f)
                lineTo(25.7461f, 5.9297f)
                lineTo(25.7461f, 17.8711f)
                curveTo(25.7461f, 19.0898f, 25.0898f, 19.7109f, 23.9297f, 19.7109f)
                lineTo(3.7031f, 19.7109f)
                curveTo(2.5313f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                close()
            }
        }
        .build()
        return _macwindow!!
    }

private var _macwindow: ImageVector? = null
