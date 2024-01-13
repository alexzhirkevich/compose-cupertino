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

public val CupertinoIcons.Filled.DeleteRight: ImageVector
    get() {
        if (_deleteRight != null) {
            return _deleteRight!!
        }
        _deleteRight = Builder(name = "DeleteRight", defaultWidth = 25.3945.dp, defaultHeight =
                21.5977.dp, viewportWidth = 25.3945f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(13.8516f, 21.5859f)
                curveTo(15.2227f, 21.5859f, 16.4062f, 21.1641f, 17.3672f, 20.1562f)
                lineTo(24.2812f, 13.0195f)
                curveTo(25.0547f, 12.2344f, 25.3945f, 11.5195f, 25.3945f, 10.793f)
                curveTo(25.3945f, 10.0547f, 25.0547f, 9.3516f, 24.2812f, 8.5664f)
                lineTo(17.3789f, 1.3945f)
                curveTo(16.418f, 0.375f, 15.2344f, 0.0234f, 13.8633f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2422f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2422f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(6.6328f, 15.7266f)
                curveTo(6.0938f, 15.7266f, 5.6719f, 15.293f, 5.6719f, 14.7422f)
                curveTo(5.6719f, 14.4844f, 5.7656f, 14.25f, 5.9531f, 14.0625f)
                lineTo(9.1992f, 10.8164f)
                lineTo(5.9531f, 7.5586f)
                curveTo(5.7656f, 7.3711f, 5.6719f, 7.1367f, 5.6719f, 6.8789f)
                curveTo(5.6719f, 6.3398f, 6.0938f, 5.918f, 6.6328f, 5.918f)
                curveTo(6.9023f, 5.918f, 7.1133f, 6.0234f, 7.3008f, 6.1992f)
                lineTo(10.5703f, 9.457f)
                lineTo(13.8633f, 6.1875f)
                curveTo(14.0625f, 5.9883f, 14.2852f, 5.8945f, 14.5312f, 5.8945f)
                curveTo(15.0703f, 5.8945f, 15.5039f, 6.3281f, 15.5039f, 6.8555f)
                curveTo(15.5039f, 7.125f, 15.4219f, 7.3359f, 15.2227f, 7.5469f)
                lineTo(11.9531f, 10.8164f)
                lineTo(15.2109f, 14.0508f)
                curveTo(15.3984f, 14.2383f, 15.4922f, 14.4727f, 15.4922f, 14.7422f)
                curveTo(15.4922f, 15.293f, 15.0586f, 15.7266f, 14.5078f, 15.7266f)
                curveTo(14.25f, 15.7266f, 13.9922f, 15.6211f, 13.8164f, 15.4453f)
                lineTo(10.5703f, 12.1758f)
                lineTo(7.3359f, 15.4453f)
                curveTo(7.1484f, 15.6211f, 6.9023f, 15.7266f, 6.6328f, 15.7266f)
                close()
            }
        }
        .build()
        return _deleteRight!!
    }

private var _deleteRight: ImageVector? = null
