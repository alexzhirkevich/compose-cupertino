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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.PhoneCircle: ImageVector
    get() {
        if (_phoneCircle != null) {
            return _phoneCircle!!
        }
        _phoneCircle = Builder(name = "PhoneCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0938f, 14.6953f)
                curveTo(11.8242f, 17.4375f, 15.3047f, 19.1719f, 17.3672f, 17.1211f)
                curveTo(17.4492f, 17.0391f, 17.5078f, 16.9688f, 17.5664f, 16.8867f)
                curveTo(18.1055f, 16.2891f, 18.2461f, 15.5039f, 17.5664f, 14.9766f)
                curveTo(17.0273f, 14.5898f, 16.4531f, 14.1797f, 15.4805f, 13.5117f)
                curveTo(14.8008f, 13.0312f, 14.3555f, 13.1484f, 13.8281f, 13.6758f)
                lineTo(13.3594f, 14.1328f)
                curveTo(13.2305f, 14.2617f, 12.9961f, 14.25f, 12.8438f, 14.1562f)
                curveTo(12.4219f, 13.9102f, 11.7422f, 13.3594f, 11.0859f, 12.7031f)
                curveTo(10.4414f, 12.0586f, 9.8672f, 11.332f, 9.6328f, 10.9453f)
                curveTo(9.5508f, 10.8164f, 9.5039f, 10.6055f, 9.6563f, 10.4531f)
                lineTo(10.1133f, 9.9609f)
                curveTo(10.6406f, 9.4102f, 10.7578f, 8.9883f, 10.2656f, 8.2969f)
                lineTo(8.8242f, 6.2578f)
                curveTo(8.332f, 5.5664f, 7.6172f, 5.707f, 6.832f, 6.2813f)
                curveTo(6.7734f, 6.3281f, 6.7266f, 6.375f, 6.6797f, 6.4219f)
                curveTo(4.6055f, 8.4844f, 6.3633f, 11.9648f, 9.0938f, 14.6953f)
                close()
            }
        }
        .build()
        return _phoneCircle!!
    }

private var _phoneCircle: ImageVector? = null
