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

public val CupertinoIcons.Outlined.Network: ImageVector
    get() {
        if (_network != null) {
            return _network!!
        }
        _network = Builder(name = "Network", defaultWidth = 23.9062.dp, defaultHeight = 23.918.dp,
                viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.8867f, 6.9844f)
                curveTo(4.7813f, 10.0664f, 8.8594f, 11.8477f, 13.1953f, 11.8359f)
                curveTo(16.6172f, 11.8242f, 19.8633f, 10.6875f, 22.5117f, 8.6016f)
                lineTo(21.8438f, 7.2891f)
                curveTo(19.4297f, 9.3047f, 16.3945f, 10.4062f, 13.1953f, 10.418f)
                curveTo(9.0469f, 10.4297f, 5.168f, 8.625f, 2.543f, 5.5313f)
                close()
                moveTo(0.6328f, 13.6758f)
                curveTo(6.7266f, 18.8789f, 15.4453f, 19.8516f, 22.4766f, 16.1719f)
                lineTo(22.4414f, 14.5664f)
                curveTo(15.6094f, 18.5156f, 6.8789f, 17.5312f, 0.9844f, 12.082f)
                close()
                moveTo(6.4453f, 21.7266f)
                lineTo(8.1211f, 22.1133f)
                curveTo(7.3359f, 20.2266f, 6.9141f, 18.2344f, 6.8789f, 16.1836f)
                curveTo(6.5508f, 10.3594f, 9.0586f, 4.8047f, 13.5352f, 1.1367f)
                lineTo(12.0352f, 0.5508f)
                curveTo(7.5938f, 4.4883f, 5.1445f, 10.2188f, 5.4609f, 16.207f)
                curveTo(5.4844f, 18.082f, 5.8242f, 19.9336f, 6.4453f, 21.7266f)
                close()
                moveTo(14.168f, 22.8867f)
                lineTo(15.4922f, 22.3008f)
                curveTo(13.3008f, 19.207f, 12.1055f, 15.5391f, 12.1055f, 11.707f)
                curveTo(12.1055f, 8.0742f, 13.1602f, 4.6055f, 15.1406f, 1.6523f)
                lineTo(13.7578f, 1.1602f)
                curveTo(11.7539f, 4.3008f, 10.6875f, 7.9453f, 10.6875f, 11.707f)
                curveTo(10.6875f, 15.75f, 11.9062f, 19.6055f, 14.168f, 22.8867f)
                close()
                moveTo(21.0703f, 18.5273f)
                lineTo(22.0195f, 17.4492f)
                curveTo(18.082f, 15.1875f, 15.6211f, 11.0508f, 15.5625f, 6.457f)
                curveTo(15.5391f, 4.8164f, 15.832f, 3.1875f, 16.418f, 1.6875f)
                lineTo(15.0469f, 1.3008f)
                curveTo(14.4258f, 2.9414f, 14.1211f, 4.6758f, 14.1445f, 6.4688f)
                curveTo(14.2031f, 11.4492f, 16.8398f, 15.9961f, 21.0703f, 18.5273f)
                close()
                moveTo(6.8672f, 11.6953f)
                curveTo(7.8633f, 11.6953f, 8.6836f, 10.8633f, 8.6836f, 9.8555f)
                curveTo(8.6836f, 8.8477f, 7.8633f, 8.0273f, 6.8672f, 8.0273f)
                curveTo(5.8477f, 8.0273f, 5.0273f, 8.8477f, 5.0273f, 9.8555f)
                curveTo(5.0273f, 10.8633f, 5.8477f, 11.6953f, 6.8672f, 11.6953f)
                close()
                moveTo(15.8438f, 12.668f)
                curveTo(16.8281f, 12.668f, 17.6367f, 11.8594f, 17.6367f, 10.8516f)
                curveTo(17.6367f, 9.8672f, 16.8281f, 9.0586f, 15.8438f, 9.0586f)
                curveTo(14.8359f, 9.0586f, 14.0273f, 9.8672f, 14.0273f, 10.8516f)
                curveTo(14.0273f, 11.8594f, 14.8359f, 12.668f, 15.8438f, 12.668f)
                close()
                moveTo(12.3516f, 19.4414f)
                curveTo(13.3594f, 19.4414f, 14.168f, 18.6328f, 14.168f, 17.6133f)
                curveTo(14.168f, 16.6055f, 13.3594f, 15.7852f, 12.3516f, 15.7852f)
                curveTo(11.332f, 15.7852f, 10.5117f, 16.6055f, 10.5117f, 17.6133f)
                curveTo(10.5117f, 18.6328f, 11.332f, 19.4414f, 12.3516f, 19.4414f)
                close()
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 22.3125f)
                curveTo(6.293f, 22.3125f, 1.5938f, 17.6133f, 1.5938f, 11.9531f)
                curveTo(1.5938f, 6.293f, 6.2813f, 1.5938f, 11.9414f, 1.5938f)
                curveTo(17.6016f, 1.5938f, 22.3125f, 6.293f, 22.3125f, 11.9531f)
                curveTo(22.3125f, 17.6133f, 17.6133f, 22.3125f, 11.9531f, 22.3125f)
                close()
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null
