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

public val CupertinoIcons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 25.3008.dp, defaultHeight = 22.2305.dp,
                viewportWidth = 25.3008f, viewportHeight = 22.2305f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3398f, 1.418f)
                curveTo(0.0938f, 2.6133f, 0.0f, 4.1719f, 0.0f, 5.2148f)
                curveTo(0.0f, 13.9805f, 5.2148f, 19.7695f, 13.1836f, 19.7695f)
                curveTo(18.3164f, 19.7695f, 20.7305f, 16.7461f, 21.2578f, 15.7734f)
                lineTo(19.793f, 15.7383f)
                curveTo(21.3164f, 17.332f, 21.9961f, 19.043f, 22.7695f, 21.4688f)
                curveTo(22.9453f, 22.0312f, 23.332f, 22.2305f, 23.7422f, 22.2305f)
                curveTo(24.6094f, 22.2305f, 25.3008f, 21.4805f, 25.3008f, 20.4492f)
                curveTo(25.3008f, 18.832f, 22.9805f, 16.0195f, 21.7734f, 14.8828f)
                curveTo(16.6406f, 10.1484f, 8.8242f, 12.9492f, 6.8086f, 7.7227f)
                curveTo(6.6563f, 7.3242f, 7.0781f, 6.9727f, 7.4648f, 7.3711f)
                curveTo(11.5078f, 11.4141f, 16.7109f, 8.0039f, 21.7734f, 12.668f)
                curveTo(22.1719f, 13.0195f, 22.6406f, 12.832f, 22.7109f, 12.4102f)
                curveTo(22.7695f, 12.0703f, 22.8047f, 11.5312f, 22.8047f, 11.0156f)
                curveTo(22.8047f, 5.2969f, 18.8203f, 2.543f, 13.2188f, 2.543f)
                curveTo(11.3438f, 2.543f, 9.1523f, 3.0f, 7.4297f, 3.0f)
                curveTo(5.543f, 3.0f, 3.4219f, 2.8477f, 1.7344f, 1.043f)
                curveTo(1.2539f, 0.5508f, 0.5273f, 0.6211f, 0.3398f, 1.418f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
