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

public val CupertinoIcons.Filled.Gearshape: ImageVector
    get() {
        if (_gearshape != null) {
            return _gearshape!!
        }
        _gearshape = Builder(name = "Gearshape", defaultWidth = 24.4922.dp, defaultHeight =
                24.5039.dp, viewportWidth = 24.4922f, viewportHeight = 24.5039f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.168f, 24.4922f)
                lineTo(13.3242f, 24.4922f)
                curveTo(13.9336f, 24.4922f, 14.3789f, 24.1289f, 14.5078f, 23.5312f)
                lineTo(15.1172f, 20.9531f)
                curveTo(15.5742f, 20.8008f, 16.0195f, 20.625f, 16.4062f, 20.4375f)
                lineTo(18.668f, 21.8203f)
                curveTo(19.1719f, 22.1367f, 19.7461f, 22.0898f, 20.168f, 21.668f)
                lineTo(21.6797f, 20.168f)
                curveTo(22.1016f, 19.7461f, 22.1602f, 19.1367f, 21.8203f, 18.6328f)
                lineTo(20.4375f, 16.3945f)
                curveTo(20.6367f, 15.9844f, 20.8125f, 15.5625f, 20.9414f, 15.1406f)
                lineTo(23.543f, 14.5195f)
                curveTo(24.1406f, 14.3906f, 24.4922f, 13.9453f, 24.4922f, 13.3359f)
                lineTo(24.4922f, 11.2148f)
                curveTo(24.4922f, 10.6172f, 24.1406f, 10.1719f, 23.543f, 10.043f)
                lineTo(20.9648f, 9.4219f)
                curveTo(20.8125f, 8.9414f, 20.625f, 8.5078f, 20.4609f, 8.1445f)
                lineTo(21.8438f, 5.8711f)
                curveTo(22.1719f, 5.3672f, 22.1367f, 4.793f, 21.7031f, 4.3711f)
                lineTo(20.168f, 2.8594f)
                curveTo(19.7344f, 2.4609f, 19.2188f, 2.3906f, 18.7031f, 2.6836f)
                lineTo(16.4062f, 4.1016f)
                curveTo(16.0312f, 3.9023f, 15.5977f, 3.7266f, 15.1172f, 3.5742f)
                lineTo(14.5078f, 0.9609f)
                curveTo(14.3789f, 0.3633f, 13.9336f, 0.0f, 13.3242f, 0.0f)
                lineTo(11.168f, 0.0f)
                curveTo(10.5586f, 0.0f, 10.1133f, 0.3633f, 9.9727f, 0.9609f)
                lineTo(9.3633f, 3.5508f)
                curveTo(8.9063f, 3.7031f, 8.4609f, 3.8789f, 8.0625f, 4.0898f)
                lineTo(5.7891f, 2.6836f)
                curveTo(5.2734f, 2.3906f, 4.7461f, 2.4492f, 4.3125f, 2.8594f)
                lineTo(2.7891f, 4.3711f)
                curveTo(2.3555f, 4.793f, 2.3086f, 5.3672f, 2.6484f, 5.8711f)
                lineTo(4.0195f, 8.1445f)
                curveTo(3.8672f, 8.5078f, 3.6797f, 8.9414f, 3.5273f, 9.4219f)
                lineTo(0.9492f, 10.043f)
                curveTo(0.3516f, 10.1719f, 0.0f, 10.6172f, 0.0f, 11.2148f)
                lineTo(0.0f, 13.3359f)
                curveTo(0.0f, 13.9453f, 0.3516f, 14.3906f, 0.9492f, 14.5195f)
                lineTo(3.5508f, 15.1406f)
                curveTo(3.6797f, 15.5625f, 3.8555f, 15.9844f, 4.043f, 16.3945f)
                lineTo(2.6719f, 18.6328f)
                curveTo(2.3203f, 19.1367f, 2.3906f, 19.7461f, 2.8125f, 20.168f)
                lineTo(4.3125f, 21.668f)
                curveTo(4.7344f, 22.0898f, 5.3203f, 22.1367f, 5.8242f, 21.8203f)
                lineTo(8.0742f, 20.4375f)
                curveTo(8.4727f, 20.625f, 8.9063f, 20.8008f, 9.3633f, 20.9531f)
                lineTo(9.9727f, 23.5312f)
                curveTo(10.1133f, 24.1289f, 10.5586f, 24.4922f, 11.168f, 24.4922f)
                close()
                moveTo(12.2461f, 16.3828f)
                curveTo(9.9727f, 16.3828f, 8.1094f, 14.5078f, 8.1094f, 12.2344f)
                curveTo(8.1094f, 9.9727f, 9.9727f, 8.1094f, 12.2461f, 8.1094f)
                curveTo(14.5195f, 8.1094f, 16.3828f, 9.9727f, 16.3828f, 12.2344f)
                curveTo(16.3828f, 14.5078f, 14.5195f, 16.3828f, 12.2461f, 16.3828f)
                close()
            }
        }
        .build()
        return _gearshape!!
    }

private var _gearshape: ImageVector? = null
