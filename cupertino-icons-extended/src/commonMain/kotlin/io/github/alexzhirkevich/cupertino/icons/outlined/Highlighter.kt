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

public val CupertinoIcons.Outlined.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 24.2812.dp, defaultHeight =
                28.0317.dp, viewportWidth = 24.2812f, viewportHeight = 28.0317f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7422f, 19.9631f)
                lineTo(9.6328f, 18.3576f)
                curveTo(9.9258f, 18.2404f, 10.0664f, 18.135f, 10.2422f, 17.9592f)
                lineTo(21.457f, 6.8264f)
                curveTo(22.5586f, 5.7365f, 22.5469f, 4.4592f, 21.4336f, 3.3342f)
                lineTo(18.9727f, 0.8498f)
                curveTo(17.8477f, -0.2635f, 16.5703f, -0.2869f, 15.4688f, 0.8029f)
                lineTo(4.2422f, 11.9358f)
                curveTo(4.0664f, 12.0998f, 3.9609f, 12.2287f, 3.8438f, 12.5217f)
                lineTo(2.2031f, 16.4123f)
                curveTo(1.957f, 16.9983f, 2.0156f, 17.5842f, 2.4609f, 18.0295f)
                lineTo(4.125f, 19.7053f)
                curveTo(4.5586f, 20.1389f, 5.1445f, 20.2209f, 5.7422f, 19.9631f)
                close()
                moveTo(5.5664f, 18.1467f)
                curveTo(5.332f, 18.2287f, 5.1563f, 18.2287f, 4.9453f, 18.0178f)
                lineTo(4.1484f, 17.2209f)
                curveTo(3.9375f, 17.01f, 3.9375f, 16.8225f, 4.0313f, 16.6115f)
                lineTo(5.4844f, 13.2014f)
                lineTo(16.6523f, 2.1154f)
                curveTo(16.9922f, 1.799f, 17.3906f, 1.7756f, 17.707f, 2.092f)
                lineTo(20.1797f, 4.5881f)
                curveTo(20.4961f, 4.9162f, 20.4727f, 5.3147f, 20.1445f, 5.6428f)
                lineTo(8.9766f, 16.7287f)
                close()
                moveTo(1.1719f, 20.549f)
                lineTo(2.5898f, 20.549f)
                curveTo(2.918f, 20.549f, 3.0586f, 20.4904f, 3.3164f, 20.2795f)
                lineTo(4.418f, 19.4358f)
                lineTo(2.7305f, 17.7131f)
                lineTo(0.832f, 19.717f)
                curveTo(0.4805f, 20.0803f, 0.6563f, 20.549f, 1.1719f, 20.549f)
                close()
                moveTo(4.418f, 13.2014f)
                lineTo(9.2109f, 18.0178f)
                lineTo(10.3125f, 16.9279f)
                lineTo(5.5195f, 12.0998f)
                close()
                moveTo(14.1445f, 3.5568f)
                lineTo(18.9375f, 8.3733f)
                lineTo(20.0391f, 7.2951f)
                lineTo(15.2461f, 2.467f)
                close()
                moveTo(0.9375f, 24.7326f)
                lineTo(23.332f, 24.7326f)
                curveTo(23.8477f, 24.7326f, 24.2812f, 24.299f, 24.2812f, 23.7834f)
                curveTo(24.2812f, 23.2678f, 23.8477f, 22.8459f, 23.332f, 22.8459f)
                lineTo(0.9375f, 22.8459f)
                curveTo(0.4219f, 22.8459f, 0.0f, 23.2678f, 0.0f, 23.7834f)
                curveTo(0.0f, 24.299f, 0.4219f, 24.7326f, 0.9375f, 24.7326f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
