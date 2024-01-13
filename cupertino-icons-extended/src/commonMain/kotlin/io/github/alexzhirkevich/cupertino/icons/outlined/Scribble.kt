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

public val CupertinoIcons.Outlined.Scribble: ImageVector
    get() {
        if (_scribble != null) {
            return _scribble!!
        }
        _scribble = Builder(name = "Scribble", defaultWidth = 23.8372.dp, defaultHeight =
                21.9896.dp, viewportWidth = 23.8372f, viewportHeight = 21.9896f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2593f, 14.1413f)
                curveTo(0.6226f, 14.5046f, 1.1616f, 14.4929f, 1.5132f, 14.1413f)
                lineTo(3.5757f, 12.0788f)
                curveTo(10.771f, 4.8835f, 14.8609f, 0.6999f, 16.3023f, 2.1296f)
                curveTo(17.3101f, 3.1374f, 14.8374f, 5.9851f, 11.7905f, 9.5827f)
                curveTo(8.6148f, 13.3327f, 5.1109f, 17.2233f, 7.4898f, 19.614f)
                curveTo(9.5523f, 21.6882f, 12.8921f, 19.0397f, 15.9976f, 16.028f)
                curveTo(18.353f, 13.7429f, 20.1812f, 11.9733f, 20.8023f, 12.5827f)
                curveTo(21.3296f, 13.11f, 20.5796f, 14.153f, 19.689f, 15.6882f)
                curveTo(18.564f, 17.6335f, 17.1343f, 19.7194f, 18.4937f, 21.0788f)
                curveTo(19.5366f, 22.1218f, 21.3062f, 21.5124f, 23.4859f, 19.2741f)
                curveTo(23.9312f, 18.8405f, 23.9429f, 18.3015f, 23.5796f, 17.9382f)
                curveTo(23.2163f, 17.5866f, 22.689f, 17.5983f, 22.3257f, 17.9499f)
                curveTo(20.6265f, 19.5319f, 19.8999f, 19.9655f, 19.6187f, 19.6843f)
                curveTo(19.2905f, 19.3561f, 19.7593f, 18.653f, 21.0132f, 16.5905f)
                curveTo(22.5952f, 14.0007f, 23.1695f, 12.4538f, 22.0913f, 11.3757f)
                curveTo(20.6148f, 9.8874f, 18.4234f, 11.235f, 14.732f, 14.7507f)
                curveTo(11.1109f, 18.1843f, 9.5054f, 19.11f, 8.7437f, 18.36f)
                curveTo(7.8179f, 17.4577f, 9.0366f, 15.4186f, 13.1148f, 10.7311f)
                curveTo(17.6851f, 5.4577f, 19.4546f, 2.7741f, 17.5445f, 0.8757f)
                curveTo(15.189f, -1.4681f, 12.564f, 0.5827f, 2.3335f, 10.8249f)
                lineTo(0.2593f, 12.8874f)
                curveTo(-0.0923f, 13.239f, -0.0805f, 13.778f, 0.2593f, 14.1413f)
                close()
            }
        }
        .build()
        return _scribble!!
    }

private var _scribble: ImageVector? = null
