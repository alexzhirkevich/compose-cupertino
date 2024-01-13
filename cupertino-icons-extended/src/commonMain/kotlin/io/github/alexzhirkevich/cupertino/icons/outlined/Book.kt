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

public val CupertinoIcons.Outlined.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 26.0273.dp, defaultHeight = 21.7852.dp,
                viewportWidth = 26.0273f, viewportHeight = 21.7852f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.8164f)
                curveTo(0.0f, 20.7773f, 0.6328f, 21.1523f, 1.3242f, 21.1523f)
                curveTo(1.7227f, 21.1523f, 2.0625f, 20.918f, 2.5078f, 20.6484f)
                curveTo(3.7969f, 19.7695f, 5.3906f, 19.2305f, 7.0195f, 19.2422f)
                curveTo(8.707f, 19.2539f, 10.3828f, 19.875f, 11.6953f, 21.1406f)
                curveTo(12.2109f, 21.6094f, 12.5859f, 21.7617f, 13.0195f, 21.7617f)
                curveTo(13.4414f, 21.7617f, 13.8281f, 21.6094f, 14.332f, 21.1406f)
                curveTo(15.6445f, 19.8867f, 17.3203f, 19.2539f, 19.0195f, 19.2422f)
                curveTo(20.6484f, 19.2305f, 22.2305f, 19.7695f, 23.5195f, 20.6484f)
                curveTo(23.9648f, 20.918f, 24.3047f, 21.1523f, 24.7148f, 21.1523f)
                curveTo(25.3945f, 21.1523f, 26.0273f, 20.7773f, 26.0273f, 19.8164f)
                lineTo(26.0273f, 3.9141f)
                curveTo(26.0273f, 3.7148f, 26.0156f, 3.5508f, 25.8867f, 3.3516f)
                curveTo(24.8438f, 1.5352f, 22.1953f, 0.0f, 18.9727f, 0.0f)
                curveTo(16.418f, 0.0f, 14.2031f, 1.0195f, 13.0195f, 2.4609f)
                curveTo(11.8359f, 1.0195f, 9.6094f, 0.0f, 7.0664f, 0.0f)
                curveTo(3.832f, 0.0f, 1.1836f, 1.5352f, 0.1406f, 3.3516f)
                curveTo(0.0234f, 3.5508f, 0.0f, 3.7148f, 0.0f, 3.9141f)
                close()
                moveTo(1.8867f, 18.8203f)
                lineTo(1.8867f, 4.1836f)
                curveTo(2.8359f, 2.8125f, 4.8984f, 1.8867f, 7.0664f, 1.8867f)
                curveTo(9.293f, 1.8867f, 11.2383f, 2.8242f, 12.0703f, 4.2539f)
                lineTo(12.0703f, 19.0195f)
                curveTo(10.875f, 18.0703f, 9.0117f, 17.3555f, 7.0664f, 17.3555f)
                curveTo(5.0273f, 17.3555f, 3.1289f, 17.9297f, 1.8867f, 18.8203f)
                close()
                moveTo(13.957f, 19.0195f)
                lineTo(13.957f, 4.2539f)
                curveTo(14.7891f, 2.8242f, 16.7461f, 1.8867f, 18.9727f, 1.8867f)
                curveTo(21.1289f, 1.8867f, 23.1914f, 2.8125f, 24.1406f, 4.1836f)
                lineTo(24.1406f, 18.8203f)
                curveTo(22.8984f, 17.9297f, 21.0f, 17.3555f, 18.9727f, 17.3555f)
                curveTo(17.0156f, 17.3555f, 15.1523f, 18.0703f, 13.957f, 19.0195f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
