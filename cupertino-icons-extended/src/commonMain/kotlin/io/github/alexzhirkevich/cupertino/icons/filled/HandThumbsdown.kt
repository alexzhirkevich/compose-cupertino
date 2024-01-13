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

public val CupertinoIcons.Filled.HandThumbsdown: ImageVector
    get() {
        if (_handThumbsdown != null) {
            return _handThumbsdown!!
        }
        _handThumbsdown = Builder(name = "HandThumbsdown", defaultWidth = 23.0859.dp, defaultHeight
                = 24.0133.dp, viewportWidth = 23.0859f, viewportHeight = 24.0133f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0859f, 7.4891f)
                curveTo(23.0859f, 4.0203f, 20.9062f, 1.1141f, 18.0117f, 1.1141f)
                lineTo(15.9492f, 1.1141f)
                curveTo(18.0586f, 2.6492f, 18.9961f, 4.9696f, 18.9492f, 7.6063f)
                curveTo(18.9141f, 10.536f, 17.7773f, 12.6336f, 16.7578f, 13.8992f)
                lineTo(18.4453f, 13.8992f)
                curveTo(21.0586f, 13.8992f, 23.0859f, 11.0867f, 23.0859f, 7.4891f)
                close()
                moveTo(17.3789f, 7.5711f)
                curveTo(17.4492f, 3.2938f, 13.9805f, 0.0594f, 8.5313f, 0.0125f)
                lineTo(6.9492f, 8.0E-4f)
                curveTo(5.4258f, -0.0109f, 4.3008f, 0.1063f, 3.668f, 0.2821f)
                curveTo(2.7539f, 0.5047f, 1.875f, 1.0555f, 1.875f, 2.1688f)
                curveTo(1.875f, 2.6141f, 1.9922f, 2.9539f, 2.1328f, 3.2f)
                curveTo(2.2266f, 3.3407f, 2.2148f, 3.4696f, 2.0625f, 3.5282f)
                curveTo(1.3477f, 3.8211f, 0.7383f, 4.5125f, 0.7383f, 5.4266f)
                curveTo(0.7383f, 5.9657f, 0.8906f, 6.4227f, 1.1602f, 6.7508f)
                curveTo(1.2891f, 6.9266f, 1.2656f, 7.0789f, 1.0547f, 7.2078f)
                curveTo(0.5273f, 7.5125f, 0.1523f, 8.1688f, 0.1523f, 8.9305f)
                curveTo(0.1523f, 9.4813f, 0.3281f, 10.0555f, 0.6328f, 10.3367f)
                curveTo(0.832f, 10.5008f, 0.7969f, 10.618f, 0.5977f, 10.7938f)
                curveTo(0.2344f, 11.0985f, 0.0f, 11.6258f, 0.0f, 12.2938f)
                curveTo(0.0f, 13.4188f, 0.8789f, 14.3446f, 2.0391f, 14.3446f)
                lineTo(6.1641f, 14.3446f)
                curveTo(7.207f, 14.3446f, 7.8984f, 14.8836f, 7.8984f, 15.7508f)
                curveTo(7.8984f, 17.3094f, 5.9531f, 20.1805f, 5.9531f, 22.243f)
                curveTo(5.9531f, 23.3446f, 6.6445f, 23.9774f, 7.5703f, 23.9774f)
                curveTo(8.4023f, 23.9774f, 8.8125f, 23.4031f, 9.2578f, 22.5242f)
                curveTo(11.0039f, 19.1375f, 13.3242f, 16.3953f, 15.0938f, 14.0399f)
                curveTo(16.5938f, 12.0477f, 17.332f, 10.3367f, 17.3789f, 7.5711f)
                close()
            }
        }
        .build()
        return _handThumbsdown!!
    }

private var _handThumbsdown: ImageVector? = null
