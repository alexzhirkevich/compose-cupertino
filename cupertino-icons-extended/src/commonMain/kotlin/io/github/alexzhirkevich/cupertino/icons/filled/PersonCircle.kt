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

public val CupertinoIcons.Filled.PersonCircle: ImageVector
    get() {
        if (_personCircle != null) {
            return _personCircle!!
        }
        _personCircle = Builder(name = "PersonCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(6.4336f, 18.1055f)
                curveTo(5.9414f, 18.1055f, 5.7188f, 17.7891f, 5.7188f, 17.3438f)
                curveTo(5.7188f, 16.0312f, 7.7109f, 12.5977f, 11.9531f, 12.5977f)
                curveTo(16.1953f, 12.5977f, 18.1875f, 16.0312f, 18.1875f, 17.3438f)
                curveTo(18.1875f, 17.7891f, 17.9648f, 18.1055f, 17.4727f, 18.1055f)
                close()
                moveTo(11.9531f, 11.6016f)
                curveTo(10.2422f, 11.5898f, 8.8477f, 10.1484f, 8.8477f, 8.2031f)
                curveTo(8.8477f, 6.3984f, 10.2422f, 4.8984f, 11.9531f, 4.8984f)
                curveTo(13.6641f, 4.8984f, 15.0586f, 6.3984f, 15.0586f, 8.2031f)
                curveTo(15.0586f, 10.1484f, 13.6641f, 11.6133f, 11.9531f, 11.6016f)
                close()
            }
        }
        .build()
        return _personCircle!!
    }

private var _personCircle: ImageVector? = null
