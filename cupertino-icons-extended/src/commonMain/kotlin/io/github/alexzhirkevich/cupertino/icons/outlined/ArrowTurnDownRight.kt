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

public val CupertinoIcons.Outlined.ArrowTurnDownRight: ImageVector
    get() {
        if (_arrowTurnDownRight != null) {
            return _arrowTurnDownRight!!
        }
        _arrowTurnDownRight = Builder(name = "ArrowTurnDownRight", defaultWidth = 21.9961.dp,
                defaultHeight = 19.6992.dp, viewportWidth = 21.9961f, viewportHeight =
                19.6992f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.1016f, 0.0f)
                curveTo(0.4805f, 0.0f, 0.1992f, 0.3984f, 0.1055f, 0.8672f)
                curveTo(0.0234f, 1.2305f, 0.0f, 1.8047f, 0.0f, 2.4961f)
                curveTo(0.0f, 8.168f, 2.2734f, 10.6055f, 7.8281f, 10.6055f)
                lineTo(16.0195f, 10.6055f)
                lineTo(18.8906f, 10.4414f)
                lineTo(14.9414f, 14.0391f)
                lineTo(12.3398f, 16.6875f)
                curveTo(12.1523f, 16.8867f, 12.0586f, 17.1562f, 12.0586f, 17.4375f)
                curveTo(12.0586f, 18.0234f, 12.5039f, 18.4453f, 13.0898f, 18.4453f)
                curveTo(13.3594f, 18.4453f, 13.6172f, 18.3398f, 13.875f, 18.0938f)
                lineTo(21.6328f, 10.3477f)
                curveTo(21.8789f, 10.1133f, 21.9961f, 9.8438f, 21.9961f, 9.5508f)
                curveTo(21.9961f, 9.2695f, 21.8789f, 8.9883f, 21.6328f, 8.7656f)
                lineTo(13.8516f, 0.9844f)
                curveTo(13.6172f, 0.7617f, 13.3594f, 0.668f, 13.0898f, 0.668f)
                curveTo(12.5039f, 0.668f, 12.0586f, 1.0898f, 12.0586f, 1.6758f)
                curveTo(12.0586f, 1.957f, 12.1641f, 2.2266f, 12.3398f, 2.4141f)
                lineTo(14.9414f, 5.0625f)
                lineTo(18.9023f, 8.6836f)
                lineTo(16.0195f, 8.5078f)
                lineTo(7.9336f, 8.5078f)
                curveTo(3.6328f, 8.5078f, 2.1211f, 6.7383f, 2.1211f, 2.3906f)
                curveTo(2.1211f, 1.8281f, 2.1563f, 1.4531f, 2.1563f, 1.0313f)
                curveTo(2.1563f, 0.4219f, 1.7109f, 0.0f, 1.1016f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowTurnDownRight!!
    }

private var _arrowTurnDownRight: ImageVector? = null
