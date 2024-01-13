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

public val CupertinoIcons.Outlined.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 26.9297.dp, defaultHeight = 21.2461.dp,
                viewportWidth = 26.9297f, viewportHeight = 21.2461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.6406f)
                curveTo(0.0f, 17.2266f, 0.4336f, 17.6133f, 1.0781f, 17.6133f)
                lineTo(3.75f, 17.6133f)
                curveTo(5.6953f, 17.6133f, 6.8086f, 17.0625f, 8.2266f, 15.4219f)
                lineTo(15.3281f, 7.1367f)
                curveTo(16.3359f, 5.9648f, 17.1797f, 5.5313f, 18.4688f, 5.5313f)
                lineTo(20.8594f, 5.5313f)
                lineTo(20.8594f, 8.1797f)
                curveTo(20.8594f, 8.6484f, 21.1289f, 8.918f, 21.6094f, 8.918f)
                curveTo(21.832f, 8.918f, 22.043f, 8.8359f, 22.2188f, 8.6953f)
                lineTo(26.6484f, 5.0273f)
                curveTo(27.0234f, 4.7227f, 27.0234f, 4.2422f, 26.6484f, 3.9141f)
                lineTo(22.2188f, 0.2344f)
                curveTo(22.043f, 0.0938f, 21.832f, 0.0234f, 21.6094f, 0.0234f)
                curveTo(21.1289f, 0.0234f, 20.8594f, 0.2813f, 20.8594f, 0.75f)
                lineTo(20.8594f, 3.5742f)
                lineTo(18.4102f, 3.5742f)
                curveTo(16.4531f, 3.5742f, 15.3281f, 4.125f, 13.9219f, 5.7656f)
                lineTo(6.832f, 14.0508f)
                curveTo(5.8125f, 15.2344f, 5.0039f, 15.668f, 3.8086f, 15.668f)
                lineTo(1.0781f, 15.668f)
                curveTo(0.4453f, 15.668f, 0.0f, 16.0547f, 0.0f, 16.6406f)
                close()
                moveTo(0.0f, 4.5586f)
                curveTo(0.0f, 5.1328f, 0.4453f, 5.5313f, 1.0781f, 5.5313f)
                lineTo(3.8086f, 5.5313f)
                curveTo(5.0156f, 5.5313f, 5.8242f, 5.9648f, 6.832f, 7.1484f)
                lineTo(13.9219f, 15.4336f)
                curveTo(15.3281f, 17.0625f, 16.4531f, 17.6133f, 18.4102f, 17.6133f)
                lineTo(20.8594f, 17.6133f)
                lineTo(20.8594f, 20.5195f)
                curveTo(20.8594f, 20.9883f, 21.1289f, 21.2461f, 21.6094f, 21.2461f)
                curveTo(21.832f, 21.2461f, 22.043f, 21.1758f, 22.2188f, 21.0352f)
                lineTo(26.6484f, 17.3672f)
                curveTo(27.0234f, 17.0508f, 27.0234f, 16.582f, 26.6484f, 16.2539f)
                lineTo(22.2188f, 12.5742f)
                curveTo(22.043f, 12.4336f, 21.832f, 12.3516f, 21.6094f, 12.3516f)
                curveTo(21.1289f, 12.3516f, 20.8594f, 12.6211f, 20.8594f, 13.0898f)
                lineTo(20.8594f, 15.668f)
                lineTo(18.4688f, 15.668f)
                curveTo(17.1797f, 15.668f, 16.3359f, 15.2344f, 15.3281f, 14.0508f)
                lineTo(8.2266f, 5.7656f)
                curveTo(6.8086f, 4.1367f, 5.6953f, 3.5859f, 3.75f, 3.5859f)
                lineTo(1.0781f, 3.5859f)
                curveTo(0.4336f, 3.5859f, 0.0f, 3.9727f, 0.0f, 4.5586f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
