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

public val CupertinoIcons.Outlined.Paperplane: ImageVector
    get() {
        if (_paperplane != null) {
            return _paperplane!!
        }
        _paperplane = Builder(name = "Paperplane", defaultWidth = 24.5508.dp, defaultHeight =
                25.9102.dp, viewportWidth = 24.5508f, viewportHeight = 25.9102f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6719f, 25.9102f)
                curveTo(15.5156f, 25.9102f, 16.1133f, 25.1836f, 16.5469f, 24.0586f)
                lineTo(24.2227f, 4.0078f)
                curveTo(24.4336f, 3.4688f, 24.5508f, 2.9883f, 24.5508f, 2.5898f)
                curveTo(24.5508f, 1.8281f, 24.082f, 1.3594f, 23.3203f, 1.3594f)
                curveTo(22.9219f, 1.3594f, 22.4414f, 1.4766f, 21.9023f, 1.6875f)
                lineTo(1.7461f, 9.4102f)
                curveTo(0.7617f, 9.7852f, 0.0f, 10.3828f, 0.0f, 11.2383f)
                curveTo(0.0f, 12.3164f, 0.8203f, 12.6797f, 1.9453f, 13.0195f)
                lineTo(10.4062f, 15.5039f)
                lineTo(12.8672f, 23.8594f)
                curveTo(13.2188f, 25.043f, 13.582f, 25.9102f, 14.6719f, 25.9102f)
                close()
                moveTo(10.9336f, 13.7227f)
                lineTo(2.8477f, 11.25f)
                curveTo(2.6602f, 11.1914f, 2.6016f, 11.1445f, 2.6016f, 11.0625f)
                curveTo(2.6016f, 10.9805f, 2.6484f, 10.9219f, 2.8242f, 10.8516f)
                lineTo(18.668f, 4.8516f)
                curveTo(19.6055f, 4.5f, 20.5078f, 4.0313f, 21.375f, 3.6328f)
                curveTo(20.6016f, 4.2656f, 19.6406f, 5.0156f, 18.9961f, 5.6602f)
                close()
                moveTo(14.8594f, 23.332f)
                curveTo(14.7656f, 23.332f, 14.7188f, 23.25f, 14.6602f, 23.0625f)
                lineTo(12.1875f, 14.9766f)
                lineTo(20.25f, 6.9141f)
                curveTo(20.8828f, 6.2813f, 21.668f, 5.2969f, 22.2891f, 4.5f)
                curveTo(21.8906f, 5.3906f, 21.4102f, 6.293f, 21.0586f, 7.2422f)
                lineTo(15.0586f, 23.0859f)
                curveTo(14.9883f, 23.2617f, 14.9414f, 23.332f, 14.8594f, 23.332f)
                close()
            }
        }
        .build()
        return _paperplane!!
    }

private var _paperplane: ImageVector? = null
