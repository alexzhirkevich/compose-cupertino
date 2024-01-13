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

public val CupertinoIcons.Filled.HeadphonesCircle: ImageVector
    get() {
        if (_headphonesCircle != null) {
            return _headphonesCircle!!
        }
        _headphonesCircle = Builder(name = "HeadphonesCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(5.4258f, 11.9531f)
                curveTo(5.4258f, 7.7578f, 8.0508f, 4.9336f, 11.9648f, 4.9336f)
                curveTo(15.8906f, 4.9336f, 18.5273f, 7.7695f, 18.5273f, 11.9531f)
                curveTo(18.5273f, 14.1914f, 17.9883f, 15.9141f, 17.0508f, 17.5664f)
                curveTo(16.8164f, 17.9531f, 16.3945f, 18.1055f, 15.9844f, 17.9531f)
                curveTo(15.6562f, 18.3047f, 15.1758f, 18.4219f, 14.625f, 18.2578f)
                curveTo(13.8164f, 18.0469f, 13.4531f, 17.3672f, 13.6758f, 16.5703f)
                lineTo(14.5547f, 13.5586f)
                curveTo(14.7891f, 12.75f, 15.4805f, 12.3633f, 16.2656f, 12.5977f)
                curveTo(16.5f, 12.668f, 16.6992f, 12.7734f, 16.8516f, 12.9023f)
                curveTo(16.875f, 12.5977f, 16.8867f, 12.2812f, 16.8867f, 11.9531f)
                curveTo(16.8867f, 8.7305f, 14.918f, 6.5742f, 11.9648f, 6.5742f)
                curveTo(9.0234f, 6.5742f, 7.0664f, 8.7188f, 7.0664f, 11.9531f)
                curveTo(7.0664f, 12.2812f, 7.0664f, 12.5859f, 7.1016f, 12.8789f)
                curveTo(7.2539f, 12.7617f, 7.4414f, 12.668f, 7.6523f, 12.5977f)
                curveTo(8.4609f, 12.3633f, 9.1523f, 12.75f, 9.3867f, 13.5586f)
                lineTo(10.2539f, 16.5586f)
                curveTo(10.4883f, 17.3555f, 10.1133f, 18.0469f, 9.3047f, 18.2578f)
                curveTo(8.7656f, 18.4336f, 8.2734f, 18.3047f, 7.9453f, 17.9531f)
                curveTo(7.5352f, 18.1055f, 7.1133f, 17.9531f, 6.8906f, 17.5664f)
                curveTo(5.9648f, 15.9609f, 5.4258f, 14.2266f, 5.4258f, 11.9531f)
                close()
            }
        }
        .build()
        return _headphonesCircle!!
    }

private var _headphonesCircle: ImageVector? = null
