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

public val CupertinoIcons.Filled.Lifepreserver: ImageVector
    get() {
        if (_lifepreserver != null) {
            return _lifepreserver!!
        }
        _lifepreserver = Builder(name = "Lifepreserver", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9648f, 16.3008f)
                curveTo(9.5508f, 16.3008f, 7.6172f, 14.3555f, 7.6172f, 11.9531f)
                curveTo(7.6172f, 9.5508f, 9.5508f, 7.6055f, 11.9648f, 7.6055f)
                curveTo(14.3672f, 7.6055f, 16.3008f, 9.5508f, 16.3008f, 11.9531f)
                curveTo(16.3008f, 14.3555f, 14.3672f, 16.3008f, 11.9648f, 16.3008f)
                close()
                moveTo(3.9141f, 6.082f)
                curveTo(4.5117f, 5.2383f, 5.2266f, 4.5117f, 6.0586f, 3.9141f)
                lineTo(8.3789f, 6.2344f)
                curveTo(7.5234f, 6.7852f, 6.7617f, 7.5234f, 6.2227f, 8.3906f)
                close()
                moveTo(19.9922f, 6.0938f)
                lineTo(17.6719f, 8.4023f)
                curveTo(17.1445f, 7.5352f, 16.3828f, 6.7969f, 15.5273f, 6.2461f)
                lineTo(17.8477f, 3.9258f)
                curveTo(18.6797f, 4.5234f, 19.3945f, 5.2617f, 19.9922f, 6.0938f)
                close()
                moveTo(19.9922f, 17.7891f)
                curveTo(19.4062f, 18.6211f, 18.6797f, 19.3594f, 17.8594f, 19.957f)
                lineTo(15.5273f, 17.6367f)
                curveTo(16.3945f, 17.0859f, 17.1445f, 16.3477f, 17.6836f, 15.4805f)
                close()
                moveTo(3.9258f, 17.8008f)
                lineTo(6.2344f, 15.4922f)
                curveTo(6.7734f, 16.3594f, 7.5234f, 17.0977f, 8.3789f, 17.6484f)
                lineTo(6.0586f, 19.9688f)
                curveTo(5.2383f, 19.3711f, 4.5117f, 18.6445f, 3.9258f, 17.8008f)
                close()
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
            }
        }
        .build()
        return _lifepreserver!!
    }

private var _lifepreserver: ImageVector? = null
