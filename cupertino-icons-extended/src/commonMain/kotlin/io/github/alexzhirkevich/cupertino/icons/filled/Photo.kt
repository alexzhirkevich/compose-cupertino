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

public val CupertinoIcons.Filled.Photo: ImageVector
    get() {
        if (_photo != null) {
            return _photo!!
        }
        _photo = Builder(name = "Photo", defaultWidth = 27.6328.dp, defaultHeight = 21.5742.dp,
                viewportWidth = 27.6328f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7031f, 19.6992f)
                curveTo(2.5664f, 19.6992f, 1.8867f, 19.0195f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 17.1562f)
                lineTo(5.4844f, 14.0156f)
                curveTo(6.0f, 13.5586f, 6.5625f, 13.3242f, 7.0781f, 13.3242f)
                curveTo(7.6523f, 13.3242f, 8.25f, 13.5586f, 8.7656f, 14.0391f)
                lineTo(11.0039f, 16.0547f)
                lineTo(16.6055f, 11.0859f)
                curveTo(17.1797f, 10.5703f, 17.8242f, 10.3359f, 18.4922f, 10.3359f)
                curveTo(19.1367f, 10.3359f, 19.8047f, 10.582f, 20.3555f, 11.0977f)
                lineTo(25.7461f, 16.0898f)
                lineTo(25.7461f, 17.8945f)
                curveTo(25.7461f, 19.0195f, 25.0547f, 19.6992f, 23.9414f, 19.6992f)
                close()
                moveTo(8.7891f, 11.0859f)
                curveTo(7.1953f, 11.0859f, 5.8945f, 9.7852f, 5.8945f, 8.1914f)
                curveTo(5.8945f, 6.6094f, 7.1953f, 5.2969f, 8.7891f, 5.2969f)
                curveTo(10.3711f, 5.2969f, 11.6719f, 6.6094f, 11.6719f, 8.1914f)
                curveTo(11.6719f, 9.7852f, 10.3711f, 11.0859f, 8.7891f, 11.0859f)
                close()
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
            }
        }
        .build()
        return _photo!!
    }

private var _photo: ImageVector? = null
