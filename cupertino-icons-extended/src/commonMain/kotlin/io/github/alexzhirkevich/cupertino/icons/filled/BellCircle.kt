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

public val CupertinoIcons.Filled.BellCircle: ImageVector
    get() {
        if (_bellCircle != null) {
            return _bellCircle!!
        }
        _bellCircle = Builder(name = "BellCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(6.6563f, 16.3242f)
                curveTo(6.0234f, 16.3242f, 5.6602f, 15.9961f, 5.6602f, 15.5273f)
                curveTo(5.6602f, 14.8477f, 6.3398f, 14.2617f, 6.9141f, 13.6641f)
                curveTo(7.3594f, 13.1836f, 7.4531f, 12.2344f, 7.5117f, 11.4844f)
                curveTo(7.5586f, 8.8945f, 8.25f, 7.1367f, 10.0195f, 6.4805f)
                curveTo(10.3008f, 5.6133f, 10.9805f, 4.9219f, 11.9648f, 4.9219f)
                curveTo(12.9492f, 4.9219f, 13.6406f, 5.6133f, 13.9102f, 6.4805f)
                curveTo(15.6797f, 7.1367f, 16.3711f, 8.8945f, 16.4297f, 11.4844f)
                curveTo(16.4766f, 12.2344f, 16.5586f, 13.1836f, 17.0156f, 13.6641f)
                curveTo(17.6133f, 14.25f, 18.2695f, 14.8477f, 18.2695f, 15.5273f)
                curveTo(18.2695f, 15.9961f, 17.9062f, 16.3242f, 17.2852f, 16.3242f)
                close()
                moveTo(11.9648f, 19.125f)
                curveTo(10.8281f, 19.125f, 10.0078f, 18.3047f, 9.9258f, 17.3438f)
                lineTo(14.0039f, 17.3438f)
                curveTo(13.9336f, 18.3047f, 13.1016f, 19.125f, 11.9648f, 19.125f)
                close()
            }
        }
        .build()
        return _bellCircle!!
    }

private var _bellCircle: ImageVector? = null
