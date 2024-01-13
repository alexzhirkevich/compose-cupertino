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

public val CupertinoIcons.Outlined.BedDouble: ImageVector
    get() {
        if (_bedDouble != null) {
            return _bedDouble!!
        }
        _bedDouble = Builder(name = "BedDouble", defaultWidth = 29.6953.dp, defaultHeight =
                19.793.dp, viewportWidth = 29.6953f, viewportHeight = 19.793f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.9961f, 19.7695f)
                lineTo(1.6992f, 19.7695f)
                curveTo(2.2969f, 19.7695f, 2.6953f, 19.3828f, 2.6953f, 18.7734f)
                lineTo(2.6953f, 17.0391f)
                curveTo(2.8242f, 17.0742f, 3.2109f, 17.0977f, 3.4922f, 17.0977f)
                lineTo(26.2031f, 17.0977f)
                curveTo(26.4844f, 17.0977f, 26.8711f, 17.0742f, 27.0f, 17.0391f)
                lineTo(27.0f, 18.7734f)
                curveTo(27.0f, 19.3828f, 27.3984f, 19.7695f, 27.9961f, 19.7695f)
                lineTo(28.6992f, 19.7695f)
                curveTo(29.3086f, 19.7695f, 29.6953f, 19.3828f, 29.6953f, 18.7734f)
                lineTo(29.6953f, 10.7461f)
                curveTo(29.6953f, 8.5078f, 28.4766f, 7.3008f, 26.2383f, 7.3008f)
                lineTo(3.457f, 7.3008f)
                curveTo(1.2188f, 7.3008f, 0.0f, 8.5078f, 0.0f, 10.7461f)
                lineTo(0.0f, 18.7734f)
                curveTo(0.0f, 19.3828f, 0.3867f, 19.7695f, 0.9961f, 19.7695f)
                close()
                moveTo(2.3438f, 15.3867f)
                curveTo(2.0977f, 15.3867f, 1.9453f, 15.2109f, 1.9453f, 14.9297f)
                lineTo(1.9453f, 10.4766f)
                curveTo(1.9453f, 9.5859f, 2.5313f, 9.0117f, 3.4453f, 9.0117f)
                lineTo(26.2617f, 9.0117f)
                curveTo(27.1641f, 9.0117f, 27.75f, 9.5859f, 27.75f, 10.4766f)
                lineTo(27.75f, 14.9297f)
                curveTo(27.75f, 15.2109f, 27.5977f, 15.3867f, 27.3516f, 15.3867f)
                close()
                moveTo(3.0469f, 7.5469f)
                lineTo(6.1289f, 7.5469f)
                lineTo(6.1289f, 5.1328f)
                curveTo(6.1289f, 4.043f, 6.7383f, 3.4453f, 7.8516f, 3.4453f)
                lineTo(11.9648f, 3.4453f)
                curveTo(13.0664f, 3.4453f, 13.6758f, 4.043f, 13.6758f, 5.1328f)
                lineTo(13.6758f, 7.5469f)
                lineTo(16.0195f, 7.5469f)
                lineTo(16.0195f, 5.1328f)
                curveTo(16.0195f, 4.043f, 16.6289f, 3.4453f, 17.7305f, 3.4453f)
                lineTo(21.8438f, 3.4453f)
                curveTo(22.957f, 3.4453f, 23.5664f, 4.043f, 23.5664f, 5.1328f)
                lineTo(23.5664f, 7.5469f)
                lineTo(26.6484f, 7.5469f)
                lineTo(26.6484f, 3.2813f)
                curveTo(26.6484f, 1.1133f, 25.4883f, 0.0f, 23.3789f, 0.0f)
                lineTo(6.3164f, 0.0f)
                curveTo(4.2188f, 0.0f, 3.0469f, 1.1133f, 3.0469f, 3.2813f)
                close()
            }
        }
        .build()
        return _bedDouble!!
    }

private var _bedDouble: ImageVector? = null
