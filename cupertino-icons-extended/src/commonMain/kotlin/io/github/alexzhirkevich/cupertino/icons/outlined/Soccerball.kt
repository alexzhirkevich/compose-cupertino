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

public val CupertinoIcons.Outlined.Soccerball: ImageVector
    get() {
        if (_soccerball != null) {
            return _soccerball!!
        }
        _soccerball = Builder(name = "Soccerball", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 7.2539f)
                lineTo(7.3828f, 10.7695f)
                lineTo(9.2109f, 16.3945f)
                lineTo(14.6953f, 16.3945f)
                lineTo(16.5234f, 10.7695f)
                close()
                moveTo(16.0664f, 1.875f)
                lineTo(11.9414f, 0.5273f)
                lineTo(7.8047f, 1.875f)
                lineTo(11.9414f, 5.2031f)
                close()
                moveTo(11.3086f, 0.9258f)
                lineTo(11.3086f, 8.6836f)
                lineTo(12.6094f, 8.6836f)
                lineTo(12.6094f, 0.9258f)
                close()
                moveTo(20.1328f, 4.8281f)
                lineTo(18.5977f, 9.9023f)
                lineTo(23.2148f, 12.4922f)
                lineTo(22.3711f, 7.6289f)
                close()
                moveTo(22.8047f, 8.8945f)
                lineTo(22.3125f, 7.6992f)
                lineTo(15.1172f, 10.6055f)
                lineTo(15.6094f, 11.8125f)
                close()
                moveTo(14.6484f, 22.6523f)
                lineTo(18.5625f, 20.9531f)
                lineTo(21.2344f, 17.5664f)
                lineTo(15.8438f, 17.4844f)
                close()
                moveTo(18.9844f, 20.4727f)
                lineTo(14.2148f, 14.3438f)
                lineTo(13.1719f, 15.1406f)
                lineTo(17.9531f, 21.2578f)
                close()
                moveTo(9.2461f, 22.6055f)
                lineTo(8.0508f, 17.4375f)
                lineTo(2.6602f, 17.5195f)
                lineTo(5.332f, 20.9062f)
                close()
                moveTo(4.9102f, 20.4258f)
                lineTo(5.9414f, 21.2109f)
                lineTo(10.7227f, 15.0938f)
                lineTo(9.6797f, 14.2969f)
                close()
                moveTo(3.7734f, 4.8281f)
                lineTo(1.5352f, 7.6289f)
                lineTo(0.6914f, 12.4922f)
                lineTo(5.3086f, 9.9023f)
                close()
                moveTo(1.1016f, 8.8945f)
                lineTo(8.2969f, 11.8125f)
                lineTo(8.7891f, 10.6055f)
                lineTo(1.5938f, 7.6992f)
                close()
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 22.3125f)
                curveTo(6.293f, 22.3125f, 1.5938f, 17.6133f, 1.5938f, 11.9531f)
                curveTo(1.5938f, 6.293f, 6.2813f, 1.5938f, 11.9414f, 1.5938f)
                curveTo(17.6016f, 1.5938f, 22.3125f, 6.293f, 22.3125f, 11.9531f)
                curveTo(22.3125f, 17.6133f, 17.6133f, 22.3125f, 11.9531f, 22.3125f)
                close()
            }
        }
        .build()
        return _soccerball!!
    }

private var _soccerball: ImageVector? = null
