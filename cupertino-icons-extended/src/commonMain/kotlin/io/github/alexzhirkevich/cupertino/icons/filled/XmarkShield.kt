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

public val CupertinoIcons.Filled.XmarkShield: ImageVector
    get() {
        if (_xmarkShield != null) {
            return _xmarkShield!!
        }
        _xmarkShield = Builder(name = "XmarkShield", defaultWidth = 19.1719.dp, defaultHeight =
                23.6602.dp, viewportWidth = 19.1719f, viewportHeight = 23.6602f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5859f, 23.6602f)
                curveTo(9.7734f, 23.6602f, 10.0664f, 23.5898f, 10.3594f, 23.4375f)
                curveTo(17.0273f, 19.9453f, 19.1719f, 18.1992f, 19.1719f, 13.9922f)
                lineTo(19.1719f, 5.1563f)
                curveTo(19.1719f, 3.9492f, 18.6562f, 3.5625f, 17.6719f, 3.1523f)
                curveTo(16.3008f, 2.5898f, 11.918f, 0.9961f, 10.5586f, 0.5273f)
                curveTo(10.2422f, 0.4219f, 9.9141f, 0.3633f, 9.5859f, 0.3633f)
                curveTo(9.2578f, 0.3633f, 8.9297f, 0.4336f, 8.625f, 0.5273f)
                curveTo(7.2539f, 0.9727f, 2.8711f, 2.6016f, 1.5f, 3.1523f)
                curveTo(0.5273f, 3.5508f, 0.0f, 3.9492f, 0.0f, 5.1563f)
                lineTo(0.0f, 13.9922f)
                curveTo(0.0f, 18.1992f, 2.2617f, 19.7461f, 8.8125f, 23.4375f)
                curveTo(9.1172f, 23.6016f, 9.3984f, 23.6602f, 9.5859f, 23.6602f)
                close()
                moveTo(5.6484f, 16.5f)
                curveTo(5.1094f, 16.5f, 4.6875f, 16.0664f, 4.6875f, 15.5156f)
                curveTo(4.6875f, 15.2578f, 4.7813f, 15.0234f, 4.9688f, 14.8359f)
                lineTo(8.2148f, 11.5898f)
                lineTo(4.9688f, 8.332f)
                curveTo(4.7813f, 8.1563f, 4.6875f, 7.9102f, 4.6875f, 7.6523f)
                curveTo(4.6875f, 7.1133f, 5.1094f, 6.7031f, 5.6484f, 6.7031f)
                curveTo(5.918f, 6.7031f, 6.1289f, 6.7969f, 6.3164f, 6.9727f)
                lineTo(9.5859f, 10.2305f)
                lineTo(12.8789f, 6.9609f)
                curveTo(13.0781f, 6.7617f, 13.2891f, 6.6797f, 13.5469f, 6.6797f)
                curveTo(14.0859f, 6.6797f, 14.5195f, 7.1016f, 14.5195f, 7.6289f)
                curveTo(14.5195f, 7.8984f, 14.4375f, 8.1211f, 14.2383f, 8.3203f)
                lineTo(10.9688f, 11.5898f)
                lineTo(14.2266f, 14.8242f)
                curveTo(14.4141f, 15.0117f, 14.5078f, 15.2461f, 14.5078f, 15.5156f)
                curveTo(14.5078f, 16.0664f, 14.0742f, 16.5f, 13.5234f, 16.5f)
                curveTo(13.2539f, 16.5f, 13.0078f, 16.4062f, 12.832f, 16.2188f)
                lineTo(9.5859f, 12.9609f)
                lineTo(6.3516f, 16.2188f)
                curveTo(6.1641f, 16.4062f, 5.918f, 16.5f, 5.6484f, 16.5f)
                close()
            }
        }
        .build()
        return _xmarkShield!!
    }

private var _xmarkShield: ImageVector? = null
