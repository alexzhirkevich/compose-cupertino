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

public val CupertinoIcons.Outlined.ArrowTurnUpRight: ImageVector
    get() {
        if (_arrowTurnUpRight != null) {
            return _arrowTurnUpRight!!
        }
        _arrowTurnUpRight = Builder(name = "ArrowTurnUpRight", defaultWidth = 21.9961.dp,
                defaultHeight = 18.5273.dp, viewportWidth = 21.9961f, viewportHeight =
                18.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.1016f, 18.5273f)
                curveTo(1.7109f, 18.5273f, 2.1563f, 18.1055f, 2.1563f, 17.4844f)
                curveTo(2.1563f, 17.0742f, 2.1211f, 16.6875f, 2.1211f, 16.1367f)
                curveTo(2.1211f, 11.7891f, 3.6328f, 10.0195f, 7.9336f, 10.0195f)
                lineTo(16.0195f, 10.0195f)
                lineTo(18.9023f, 9.8438f)
                lineTo(14.9414f, 13.4531f)
                lineTo(12.3398f, 16.1016f)
                curveTo(12.1641f, 16.2891f, 12.0586f, 16.5703f, 12.0586f, 16.8516f)
                curveTo(12.0586f, 17.4375f, 12.5039f, 17.8594f, 13.0898f, 17.8594f)
                curveTo(13.3594f, 17.8594f, 13.6172f, 17.7539f, 13.8516f, 17.5312f)
                lineTo(21.6328f, 9.7617f)
                curveTo(21.8789f, 9.5273f, 21.9961f, 9.2578f, 21.9961f, 8.9648f)
                curveTo(21.9961f, 8.6836f, 21.8789f, 8.4023f, 21.6328f, 8.1797f)
                lineTo(13.875f, 0.4336f)
                curveTo(13.6172f, 0.1758f, 13.3594f, 0.082f, 13.0898f, 0.082f)
                curveTo(12.5039f, 0.082f, 12.0586f, 0.5039f, 12.0586f, 1.0898f)
                curveTo(12.0586f, 1.3711f, 12.1523f, 1.6406f, 12.3398f, 1.8281f)
                lineTo(14.9414f, 4.4766f)
                lineTo(18.8906f, 8.0859f)
                lineTo(16.0195f, 7.9219f)
                lineTo(7.8281f, 7.9219f)
                curveTo(2.2734f, 7.9219f, 0.0f, 10.3594f, 0.0f, 16.0312f)
                curveTo(0.0f, 16.7109f, 0.0234f, 17.2969f, 0.1055f, 17.6484f)
                curveTo(0.1992f, 18.1289f, 0.4805f, 18.5273f, 1.1016f, 18.5273f)
                close()
            }
        }
        .build()
        return _arrowTurnUpRight!!
    }

private var _arrowTurnUpRight: ImageVector? = null
