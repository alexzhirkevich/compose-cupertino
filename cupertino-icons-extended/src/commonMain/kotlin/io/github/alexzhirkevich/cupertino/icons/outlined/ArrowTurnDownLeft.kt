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

public val CupertinoIcons.Outlined.ArrowTurnDownLeft: ImageVector
    get() {
        if (_arrowTurnDownLeft != null) {
            return _arrowTurnDownLeft!!
        }
        _arrowTurnDownLeft = Builder(name = "ArrowTurnDownLeft", defaultWidth = 21.9961.dp,
                defaultHeight = 19.6992.dp, viewportWidth = 21.9961f, viewportHeight =
                19.6992f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8945f, 0.0f)
                curveTo(20.2852f, 0.0f, 19.8516f, 0.4219f, 19.8516f, 1.0313f)
                curveTo(19.8516f, 1.4531f, 19.875f, 1.8281f, 19.875f, 2.3906f)
                curveTo(19.875f, 6.7383f, 18.3633f, 8.5078f, 14.0625f, 8.5078f)
                lineTo(5.9766f, 8.5078f)
                lineTo(3.0938f, 8.6836f)
                lineTo(7.0547f, 5.0625f)
                lineTo(9.6563f, 2.4141f)
                curveTo(9.8438f, 2.2266f, 9.9375f, 1.957f, 9.9375f, 1.6758f)
                curveTo(9.9375f, 1.0898f, 9.4922f, 0.668f, 8.918f, 0.668f)
                curveTo(8.6367f, 0.668f, 8.3906f, 0.7617f, 8.1445f, 0.9844f)
                lineTo(0.3633f, 8.7656f)
                curveTo(0.1289f, 8.9883f, 0.0f, 9.2695f, 0.0f, 9.5508f)
                curveTo(0.0f, 9.8438f, 0.1289f, 10.1133f, 0.3633f, 10.3477f)
                lineTo(8.1211f, 18.0938f)
                curveTo(8.3789f, 18.3398f, 8.6367f, 18.4453f, 8.918f, 18.4453f)
                curveTo(9.4922f, 18.4453f, 9.9375f, 18.0234f, 9.9375f, 17.4375f)
                curveTo(9.9375f, 17.1562f, 9.8438f, 16.8867f, 9.6563f, 16.6875f)
                lineTo(7.0547f, 14.0391f)
                lineTo(3.1055f, 10.4414f)
                lineTo(5.9766f, 10.6055f)
                lineTo(14.168f, 10.6055f)
                curveTo(19.7344f, 10.6055f, 21.9961f, 8.168f, 21.9961f, 2.4961f)
                curveTo(21.9961f, 1.8047f, 21.9727f, 1.2305f, 21.9023f, 0.8672f)
                curveTo(21.7969f, 0.3984f, 21.5156f, 0.0f, 20.8945f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowTurnDownLeft!!
    }

private var _arrowTurnDownLeft: ImageVector? = null
