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

public val CupertinoIcons.Outlined.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.9961.dp, defaultHeight = 24.9023.dp,
                viewportWidth = 24.9961f, viewportHeight = 24.9023f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.6719f)
                curveTo(0.0f, 6.375f, 0.4688f, 6.832f, 1.1953f, 6.832f)
                lineTo(4.2422f, 6.832f)
                lineTo(4.2422f, 21.2109f)
                curveTo(4.2422f, 23.6719f, 5.4492f, 24.8906f, 7.9102f, 24.8906f)
                lineTo(21.3047f, 24.8906f)
                curveTo(23.5312f, 24.8906f, 24.9961f, 23.3672f, 24.9961f, 21.0586f)
                lineTo(24.9961f, 17.8711f)
                curveTo(24.9961f, 17.168f, 24.5273f, 16.7109f, 23.8008f, 16.7109f)
                lineTo(22.8281f, 16.7109f)
                lineTo(22.8281f, 3.6797f)
                curveTo(22.8281f, 1.2305f, 21.6094f, 0.0f, 19.1953f, 0.0f)
                lineTo(3.0703f, 0.0f)
                curveTo(1.2422f, 0.0f, 0.0f, 1.2422f, 0.0f, 3.1992f)
                close()
                moveTo(6.1289f, 21.2227f)
                lineTo(6.1289f, 3.1992f)
                curveTo(6.1289f, 2.7188f, 6.082f, 2.2734f, 5.9883f, 1.8867f)
                lineTo(19.0898f, 1.8867f)
                curveTo(20.3086f, 1.8867f, 20.9414f, 2.5313f, 20.9414f, 3.7031f)
                lineTo(20.9414f, 16.7109f)
                lineTo(10.875f, 16.7109f)
                curveTo(10.1484f, 16.7109f, 9.668f, 17.168f, 9.668f, 17.8711f)
                lineTo(9.668f, 21.2227f)
                curveTo(9.668f, 22.2891f, 8.9297f, 23.0039f, 7.9102f, 23.0039f)
                curveTo(6.8672f, 23.0039f, 6.1289f, 22.2539f, 6.1289f, 21.2227f)
                close()
                moveTo(1.8867f, 4.9453f)
                lineTo(1.8867f, 3.1992f)
                curveTo(1.8867f, 2.3789f, 2.3906f, 1.8867f, 3.0703f, 1.8867f)
                curveTo(3.7734f, 1.8867f, 4.2422f, 2.3789f, 4.2422f, 3.1992f)
                lineTo(4.2422f, 4.9453f)
                close()
                moveTo(11.0977f, 23.0039f)
                curveTo(11.3906f, 22.4883f, 11.5547f, 21.8555f, 11.5547f, 21.0938f)
                lineTo(11.5547f, 18.5977f)
                lineTo(23.1094f, 18.5977f)
                lineTo(23.1094f, 21.0586f)
                curveTo(23.1094f, 22.2188f, 22.3828f, 23.0039f, 21.3047f, 23.0039f)
                close()
                moveTo(9.5039f, 10.9336f)
                lineTo(13.7109f, 10.9336f)
                curveTo(14.1328f, 10.9336f, 14.4375f, 10.6289f, 14.4375f, 10.2305f)
                curveTo(14.4375f, 9.8203f, 14.1328f, 9.4922f, 13.7109f, 9.4922f)
                lineTo(9.5039f, 9.4922f)
                curveTo(9.082f, 9.4922f, 8.7656f, 9.8203f, 8.7656f, 10.2305f)
                curveTo(8.7656f, 10.6289f, 9.082f, 10.9336f, 9.5039f, 10.9336f)
                close()
                moveTo(9.5039f, 6.8438f)
                lineTo(17.5664f, 6.8438f)
                curveTo(17.9883f, 6.8438f, 18.293f, 6.5273f, 18.293f, 6.1172f)
                curveTo(18.293f, 5.7188f, 17.9883f, 5.4023f, 17.5664f, 5.4023f)
                lineTo(9.5039f, 5.4023f)
                curveTo(9.082f, 5.4023f, 8.7656f, 5.7188f, 8.7656f, 6.1172f)
                curveTo(8.7656f, 6.5273f, 9.082f, 6.8438f, 9.5039f, 6.8438f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
