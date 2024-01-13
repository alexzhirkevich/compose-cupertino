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

public val CupertinoIcons.Outlined.ArrowTurnUpLeft: ImageVector
    get() {
        if (_arrowTurnUpLeft != null) {
            return _arrowTurnUpLeft!!
        }
        _arrowTurnUpLeft = Builder(name = "ArrowTurnUpLeft", defaultWidth = 21.9961.dp,
                defaultHeight = 18.5273.dp, viewportWidth = 21.9961f, viewportHeight =
                18.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8945f, 18.5273f)
                curveTo(21.5156f, 18.5273f, 21.7969f, 18.1289f, 21.9023f, 17.6484f)
                curveTo(21.9727f, 17.2969f, 21.9961f, 16.7109f, 21.9961f, 16.0312f)
                curveTo(21.9961f, 10.3594f, 19.7344f, 7.9219f, 14.168f, 7.9219f)
                lineTo(5.9766f, 7.9219f)
                lineTo(3.1055f, 8.0859f)
                lineTo(7.0547f, 4.4766f)
                lineTo(9.6563f, 1.8281f)
                curveTo(9.8438f, 1.6406f, 9.9375f, 1.3711f, 9.9375f, 1.0898f)
                curveTo(9.9375f, 0.5039f, 9.4922f, 0.082f, 8.918f, 0.082f)
                curveTo(8.6367f, 0.082f, 8.3789f, 0.1758f, 8.1211f, 0.4336f)
                lineTo(0.3633f, 8.1797f)
                curveTo(0.1289f, 8.4023f, 0.0f, 8.6836f, 0.0f, 8.9648f)
                curveTo(0.0f, 9.2578f, 0.1289f, 9.5273f, 0.3633f, 9.7617f)
                lineTo(8.1445f, 17.5312f)
                curveTo(8.3906f, 17.7539f, 8.6367f, 17.8594f, 8.918f, 17.8594f)
                curveTo(9.4922f, 17.8594f, 9.9375f, 17.4375f, 9.9375f, 16.8516f)
                curveTo(9.9375f, 16.5703f, 9.8438f, 16.2891f, 9.6563f, 16.1016f)
                lineTo(7.0547f, 13.4531f)
                lineTo(3.0938f, 9.8438f)
                lineTo(5.9766f, 10.0195f)
                lineTo(14.0625f, 10.0195f)
                curveTo(18.3633f, 10.0195f, 19.875f, 11.7891f, 19.875f, 16.1367f)
                curveTo(19.875f, 16.6875f, 19.8516f, 17.0742f, 19.8516f, 17.4844f)
                curveTo(19.8516f, 18.1055f, 20.2852f, 18.5273f, 20.8945f, 18.5273f)
                close()
            }
        }
        .build()
        return _arrowTurnUpLeft!!
    }

private var _arrowTurnUpLeft: ImageVector? = null
