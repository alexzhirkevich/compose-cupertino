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

public val CupertinoIcons.Filled.ShazamLogo: ImageVector
    get() {
        if (_shazamLogo != null) {
            return _shazamLogo!!
        }
        _shazamLogo = Builder(name = "ShazamLogo", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(11.0039f, 6.8789f)
                curveTo(10.9805f, 6.9023f, 9.1641f, 8.6133f, 8.2266f, 9.6797f)
                curveTo(7.7813f, 10.1602f, 7.5469f, 10.793f, 7.6055f, 11.4492f)
                curveTo(7.6523f, 12.1406f, 7.9688f, 12.7852f, 8.5195f, 13.2891f)
                curveTo(9.2813f, 13.9219f, 10.7461f, 14.0625f, 11.6602f, 13.2422f)
                curveTo(12.2344f, 12.75f, 12.8672f, 12.0234f, 12.8906f, 12.0234f)
                curveTo(13.3477f, 11.5078f, 14.1328f, 11.4844f, 14.625f, 11.9648f)
                curveTo(15.1055f, 12.4102f, 15.1406f, 13.1836f, 14.6836f, 13.6875f)
                curveTo(14.6602f, 13.6992f, 13.9336f, 14.4844f, 13.2891f, 15.0469f)
                curveTo(12.4102f, 15.8672f, 11.25f, 16.2539f, 10.0664f, 16.2539f)
                curveTo(8.9297f, 16.2539f, 7.793f, 15.8789f, 6.9375f, 15.1289f)
                curveTo(5.8594f, 14.2031f, 5.2266f, 12.9492f, 5.1328f, 11.6016f)
                curveTo(5.0508f, 10.2773f, 5.4961f, 9.0f, 6.4219f, 8.0039f)
                curveTo(7.418f, 6.9023f, 9.2227f, 5.1914f, 9.2813f, 5.0977f)
                curveTo(9.7734f, 4.6406f, 10.5469f, 4.6875f, 11.0156f, 5.1563f)
                curveTo(11.5078f, 5.6367f, 11.4844f, 6.3867f, 11.0039f, 6.8789f)
                close()
                moveTo(12.8906f, 17.2969f)
                curveTo(12.9023f, 17.2734f, 14.7305f, 15.5742f, 15.6562f, 14.5312f)
                curveTo(16.1016f, 14.0273f, 16.3477f, 13.3945f, 16.2773f, 12.75f)
                curveTo(16.2422f, 12.0469f, 15.9141f, 11.4023f, 15.3633f, 10.8984f)
                curveTo(14.6016f, 10.2773f, 13.1367f, 10.125f, 12.2344f, 10.9453f)
                curveTo(11.6602f, 11.4141f, 11.0156f, 12.1641f, 11.0039f, 12.1758f)
                curveTo(10.5469f, 12.668f, 9.7617f, 12.7031f, 9.2695f, 12.2227f)
                curveTo(8.7773f, 11.7891f, 8.7422f, 11.0156f, 9.2109f, 10.5f)
                curveTo(9.2227f, 10.4883f, 9.9492f, 9.7031f, 10.5938f, 9.1406f)
                curveTo(11.4844f, 8.3203f, 12.6328f, 7.9336f, 13.8164f, 7.9336f)
                curveTo(14.9648f, 7.9336f, 16.0898f, 8.3086f, 16.9805f, 9.0586f)
                curveTo(18.0352f, 9.9609f, 18.668f, 11.2383f, 18.7617f, 12.5859f)
                curveTo(18.832f, 13.9219f, 18.3867f, 15.1875f, 17.4727f, 16.1836f)
                curveTo(16.4766f, 17.2734f, 14.6836f, 18.9961f, 14.6016f, 19.0898f)
                curveTo(14.1094f, 19.5469f, 13.3477f, 19.5234f, 12.8672f, 19.0312f)
                curveTo(12.3867f, 18.5508f, 12.3984f, 17.8008f, 12.8906f, 17.2969f)
                close()
            }
        }
        .build()
        return _shazamLogo!!
    }

private var _shazamLogo: ImageVector? = null
