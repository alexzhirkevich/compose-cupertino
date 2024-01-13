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

public val CupertinoIcons.Filled.PaperclipCircle: ImageVector
    get() {
        if (_paperclipCircle != null) {
            return _paperclipCircle!!
        }
        _paperclipCircle = Builder(name = "PaperclipCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(6.6211f, 18.0586f)
                curveTo(5.0039f, 16.4531f, 5.0039f, 13.9805f, 6.668f, 12.3164f)
                lineTo(13.3711f, 5.6133f)
                curveTo(14.6484f, 4.3359f, 16.3945f, 4.3242f, 17.6133f, 5.5078f)
                curveTo(18.8086f, 6.7148f, 18.7734f, 8.4492f, 17.4844f, 9.7266f)
                lineTo(10.9453f, 16.2656f)
                curveTo(10.1836f, 17.0273f, 9.0703f, 17.0742f, 8.3672f, 16.3359f)
                curveTo(7.6758f, 15.6211f, 7.6992f, 14.4609f, 8.4375f, 13.7344f)
                lineTo(12.9727f, 9.1758f)
                curveTo(13.2539f, 8.9063f, 13.6406f, 8.8828f, 13.9219f, 9.1641f)
                curveTo(14.2148f, 9.4336f, 14.1797f, 9.8203f, 13.8984f, 10.1016f)
                lineTo(9.3516f, 14.6367f)
                curveTo(9.1289f, 14.8594f, 9.1172f, 15.1523f, 9.3398f, 15.3516f)
                curveTo(9.5625f, 15.5508f, 9.8086f, 15.5508f, 10.043f, 15.3164f)
                lineTo(16.5469f, 8.8242f)
                curveTo(17.2734f, 8.0859f, 17.332f, 7.1133f, 16.6758f, 6.4688f)
                curveTo(16.043f, 5.8359f, 15.0352f, 5.8711f, 14.3203f, 6.5977f)
                lineTo(7.6641f, 13.2539f)
                curveTo(6.5391f, 14.3906f, 6.5039f, 15.9727f, 7.6289f, 17.0742f)
                curveTo(8.7188f, 18.1641f, 10.3125f, 18.1523f, 11.4375f, 17.0273f)
                lineTo(16.3125f, 12.1523f)
                curveTo(16.5703f, 11.8945f, 17.0273f, 11.8828f, 17.2969f, 12.1406f)
                curveTo(17.5547f, 12.375f, 17.5312f, 12.8555f, 17.2852f, 13.1016f)
                lineTo(12.3398f, 18.0352f)
                curveTo(10.6875f, 19.6758f, 8.3438f, 19.7344f, 6.6211f, 18.0586f)
                close()
            }
        }
        .build()
        return _paperclipCircle!!
    }

private var _paperclipCircle: ImageVector? = null
