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

public val CupertinoIcons.Filled.PowerCircle: ImageVector
    get() {
        if (_powerCircle != null) {
            return _powerCircle!!
        }
        _powerCircle = Builder(name = "PowerCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9648f, 18.2812f)
                curveTo(8.5078f, 18.2812f, 5.625f, 15.3984f, 5.625f, 11.9531f)
                curveTo(5.625f, 10.207f, 6.3984f, 8.4727f, 7.7109f, 7.3125f)
                curveTo(8.5313f, 6.5273f, 9.668f, 7.7109f, 8.8125f, 8.5078f)
                curveTo(7.8516f, 9.3984f, 7.3125f, 10.6172f, 7.3125f, 11.9531f)
                curveTo(7.3125f, 14.543f, 9.375f, 16.6172f, 11.9648f, 16.6172f)
                curveTo(14.5547f, 16.6172f, 16.6289f, 14.543f, 16.6289f, 11.9531f)
                curveTo(16.6172f, 10.6172f, 16.0664f, 9.3984f, 15.1172f, 8.5195f)
                curveTo(14.2617f, 7.7227f, 15.3984f, 6.5391f, 16.2305f, 7.3125f)
                curveTo(17.5312f, 8.4961f, 18.3047f, 10.2188f, 18.3047f, 11.9531f)
                curveTo(18.3047f, 15.3984f, 15.4219f, 18.2812f, 11.9648f, 18.2812f)
                close()
                moveTo(11.9648f, 12.2227f)
                curveTo(11.4961f, 12.2227f, 11.168f, 11.8828f, 11.168f, 11.4023f)
                lineTo(11.168f, 6.1172f)
                curveTo(11.168f, 5.625f, 11.4961f, 5.2852f, 11.9648f, 5.2852f)
                curveTo(12.4336f, 5.2852f, 12.7734f, 5.625f, 12.7734f, 6.1172f)
                lineTo(12.7734f, 11.4023f)
                curveTo(12.7734f, 11.8828f, 12.4336f, 12.2227f, 11.9648f, 12.2227f)
                close()
            }
        }
        .build()
        return _powerCircle!!
    }

private var _powerCircle: ImageVector? = null
