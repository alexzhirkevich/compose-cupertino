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

public val CupertinoIcons.Filled.HandPointUpLeft: ImageVector
    get() {
        if (_handPointUpLeft != null) {
            return _handPointUpLeft!!
        }
        _handPointUpLeft = Builder(name = "HandPointUpLeft", defaultWidth = 19.6983.dp,
                defaultHeight = 21.85.dp, viewportWidth = 19.6983f, viewportHeight = 21.85f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4281f, 21.2785f)
                curveTo(19.2093f, 19.5442f, 20.8031f, 15.5715f, 18.9398f, 10.4504f)
                lineTo(18.1781f, 8.341f)
                curveTo(17.4749f, 6.4074f, 16.1156f, 5.5637f, 15.0609f, 5.9387f)
                curveTo(14.8265f, 6.0324f, 14.7445f, 6.2082f, 14.8265f, 6.4309f)
                lineTo(15.1663f, 7.3684f)
                curveTo(15.3304f, 7.8137f, 15.1781f, 8.1067f, 14.9085f, 8.2121f)
                curveTo(14.6273f, 8.3059f, 14.3226f, 8.177f, 14.1585f, 7.7317f)
                lineTo(13.9359f, 7.1223f)
                curveTo(13.5257f, 5.9738f, 12.5179f, 5.4934f, 11.5335f, 5.8567f)
                curveTo(11.0882f, 6.0207f, 10.9593f, 6.2785f, 11.0999f, 6.6535f)
                lineTo(11.557f, 7.9309f)
                curveTo(11.721f, 8.3762f, 11.5804f, 8.6692f, 11.3109f, 8.7746f)
                curveTo(11.0179f, 8.8801f, 10.7132f, 8.7395f, 10.5609f, 8.2942f)
                lineTo(10.1273f, 7.1223f)
                curveTo(9.6585f, 5.8332f, 8.6976f, 5.5051f, 7.7366f, 5.8567f)
                curveTo(7.3148f, 6.009f, 7.1624f, 6.2902f, 7.3031f, 6.6535f)
                lineTo(8.2054f, 9.1496f)
                curveTo(8.3695f, 9.5949f, 8.2288f, 9.8879f, 7.9593f, 9.9934f)
                curveTo(7.6781f, 10.0988f, 7.3734f, 9.9582f, 7.2093f, 9.5129f)
                lineTo(4.1624f, 1.1574f)
                curveTo(3.8695f, 0.3371f, 3.1429f, 0.009f, 2.4515f, 0.2551f)
                curveTo(1.7132f, 0.5246f, 1.3968f, 1.2395f, 1.6898f, 2.0598f)
                lineTo(6.1429f, 14.2942f)
                curveTo(6.2601f, 14.5988f, 6.1195f, 14.8215f, 5.932f, 14.8918f)
                curveTo(5.7445f, 14.9621f, 5.557f, 14.9035f, 5.3109f, 14.6457f)
                lineTo(2.2991f, 11.4113f)
                curveTo(1.8538f, 10.9426f, 1.3968f, 10.8254f, 0.9046f, 11.0129f)
                curveTo(0.1429f, 11.2824f, -0.1501f, 11.9738f, 0.0726f, 12.6067f)
                curveTo(0.1663f, 12.8528f, 0.2952f, 13.0403f, 0.4242f, 13.1926f)
                lineTo(4.139f, 17.8684f)
                curveTo(7.2796f, 21.8059f, 10.9124f, 22.5559f, 14.4281f, 21.2785f)
                close()
            }
        }
        .build()
        return _handPointUpLeft!!
    }

private var _handPointUpLeft: ImageVector? = null
