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

public val CupertinoIcons.Outlined.Memories: ImageVector
    get() {
        if (_memories != null) {
            return _memories!!
        }
        _memories = Builder(name = "Memories", defaultWidth = 26.6367.dp, defaultHeight = 23.918.dp,
                viewportWidth = 26.6367f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7305f, 15.7969f)
                curveTo(11.7305f, 16.3359f, 12.3281f, 16.5703f, 12.832f, 16.2656f)
                lineTo(19.1133f, 12.5625f)
                curveTo(19.5703f, 12.2812f, 19.5586f, 11.6367f, 19.1133f, 11.3789f)
                lineTo(12.832f, 7.6523f)
                curveTo(12.3633f, 7.3711f, 11.7305f, 7.5938f, 11.7305f, 8.1211f)
                close()
                moveTo(0.0f, 9.3047f)
                curveTo(0.0f, 9.5391f, 0.0703f, 9.7617f, 0.2109f, 9.9375f)
                lineTo(2.6836f, 12.9727f)
                curveTo(3.0469f, 13.4414f, 3.3516f, 13.6055f, 3.8203f, 13.6055f)
                curveTo(4.125f, 13.6055f, 4.3594f, 13.5234f, 4.6523f, 13.3125f)
                lineTo(7.7109f, 11.0508f)
                curveTo(7.9688f, 10.8633f, 8.1094f, 10.582f, 8.1094f, 10.2773f)
                curveTo(8.1094f, 9.7266f, 7.6758f, 9.3281f, 7.1836f, 9.3281f)
                curveTo(6.9609f, 9.3281f, 6.7617f, 9.3867f, 6.5859f, 9.5273f)
                lineTo(4.7813f, 10.9453f)
                curveTo(5.2734f, 5.8945f, 9.4805f, 1.9922f, 14.6719f, 1.9922f)
                curveTo(20.2031f, 1.9922f, 24.6328f, 6.4219f, 24.6445f, 11.9531f)
                curveTo(24.6562f, 17.4844f, 20.2148f, 21.9141f, 14.6836f, 21.9141f)
                curveTo(11.0273f, 21.9141f, 8.4258f, 19.9805f, 7.1484f, 18.4922f)
                curveTo(6.9023f, 18.1875f, 6.5859f, 18.0703f, 6.3047f, 18.0703f)
                curveTo(5.8125f, 18.0703f, 5.3672f, 18.4453f, 5.3672f, 18.9844f)
                curveTo(5.3672f, 19.2539f, 5.4727f, 19.5469f, 5.7305f, 19.8516f)
                curveTo(7.0195f, 21.3281f, 10.1953f, 23.9062f, 14.6836f, 23.9062f)
                curveTo(21.2227f, 23.9062f, 26.6367f, 18.4805f, 26.6367f, 11.9531f)
                curveTo(26.6367f, 5.4141f, 21.1992f, 0.0f, 14.6719f, 0.0f)
                curveTo(8.6953f, 0.0f, 3.6563f, 4.5352f, 2.8594f, 10.3125f)
                lineTo(1.7695f, 8.8242f)
                curveTo(1.582f, 8.5547f, 1.3125f, 8.3789f, 0.9609f, 8.3789f)
                curveTo(0.4219f, 8.3789f, 0.0f, 8.7656f, 0.0f, 9.3047f)
                close()
            }
        }
        .build()
        return _memories!!
    }

private var _memories: ImageVector? = null
