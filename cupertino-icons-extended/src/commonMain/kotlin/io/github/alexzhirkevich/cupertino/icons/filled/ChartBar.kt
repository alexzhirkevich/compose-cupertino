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

public val CupertinoIcons.Filled.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 29.4492.dp, defaultHeight =
                22.0898.dp, viewportWidth = 29.4492f, viewportHeight = 22.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4375f, 21.9141f)
                lineTo(5.918f, 21.9141f)
                curveTo(7.5352f, 21.9141f, 8.3672f, 21.1406f, 8.3672f, 19.6055f)
                lineTo(8.3672f, 9.1523f)
                curveTo(8.3672f, 7.6172f, 7.5352f, 6.832f, 5.918f, 6.832f)
                lineTo(2.4375f, 6.832f)
                curveTo(0.832f, 6.832f, 0.0f, 7.6172f, 0.0f, 9.1523f)
                lineTo(0.0f, 19.6055f)
                curveTo(0.0f, 21.1406f, 0.832f, 21.9141f, 2.4375f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9727f, 21.9141f)
                lineTo(16.4648f, 21.9141f)
                curveTo(18.082f, 21.9141f, 18.9023f, 21.1406f, 18.9023f, 19.6055f)
                lineTo(18.9023f, 5.7422f)
                curveTo(18.9023f, 4.207f, 18.082f, 3.4219f, 16.4648f, 3.4219f)
                lineTo(12.9727f, 3.4219f)
                curveTo(11.3672f, 3.4219f, 10.5352f, 4.207f, 10.5352f, 5.7422f)
                lineTo(10.5352f, 19.6055f)
                curveTo(10.5352f, 21.1406f, 11.3672f, 21.9141f, 12.9727f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5078f, 21.9141f)
                lineTo(27.0f, 21.9141f)
                curveTo(28.6172f, 21.9141f, 29.4492f, 21.1406f, 29.4492f, 19.6055f)
                lineTo(29.4492f, 2.3203f)
                curveTo(29.4492f, 0.7852f, 28.6172f, 0.0f, 27.0f, 0.0f)
                lineTo(23.5078f, 0.0f)
                curveTo(21.9141f, 0.0f, 21.082f, 0.7852f, 21.082f, 2.3203f)
                lineTo(21.082f, 19.6055f)
                curveTo(21.082f, 21.1406f, 21.9141f, 21.9141f, 23.5078f, 21.9141f)
                close()
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
