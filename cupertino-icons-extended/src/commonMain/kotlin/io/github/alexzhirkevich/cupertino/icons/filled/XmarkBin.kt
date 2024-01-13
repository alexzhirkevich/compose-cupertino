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

public val CupertinoIcons.Filled.XmarkBin: ImageVector
    get() {
        if (_xmarkBin != null) {
            return _xmarkBin!!
        }
        _xmarkBin = Builder(name = "XmarkBin", defaultWidth = 27.8789.dp, defaultHeight =
                21.5977.dp, viewportWidth = 27.8789f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7813f, 21.5977f)
                lineTo(20.0859f, 21.5977f)
                curveTo(22.3945f, 21.5977f, 23.3203f, 20.3789f, 23.6602f, 18.1055f)
                lineTo(25.3242f, 6.9492f)
                lineTo(2.543f, 6.9492f)
                lineTo(4.2188f, 18.1055f)
                curveTo(4.5586f, 20.3906f, 5.4844f, 21.5977f, 7.7813f, 21.5977f)
                close()
                moveTo(1.9922f, 5.3555f)
                lineTo(25.8867f, 5.3555f)
                curveTo(27.2109f, 5.3555f, 27.8789f, 4.5703f, 27.8789f, 3.2578f)
                lineTo(27.8789f, 2.1211f)
                curveTo(27.8789f, 0.8086f, 27.2109f, 0.0234f, 25.8867f, 0.0234f)
                lineTo(1.9922f, 0.0234f)
                curveTo(0.7383f, 0.0234f, 0.0f, 0.8086f, 0.0f, 2.1211f)
                lineTo(0.0f, 3.2578f)
                curveTo(0.0f, 4.5703f, 0.668f, 5.3555f, 1.9922f, 5.3555f)
                close()
                moveTo(10.4414f, 18.3516f)
                curveTo(9.9258f, 18.3516f, 9.4922f, 17.9062f, 9.4922f, 17.4023f)
                curveTo(9.4922f, 17.1328f, 9.6211f, 16.9219f, 9.7852f, 16.7578f)
                lineTo(12.6211f, 13.8984f)
                lineTo(9.7852f, 11.0273f)
                curveTo(9.6211f, 10.8633f, 9.4922f, 10.6523f, 9.4922f, 10.3828f)
                curveTo(9.4922f, 9.8789f, 9.9258f, 9.4688f, 10.4414f, 9.4688f)
                curveTo(10.6875f, 9.4688f, 10.875f, 9.5859f, 11.0742f, 9.75f)
                lineTo(13.9336f, 12.5977f)
                lineTo(16.8164f, 9.7383f)
                curveTo(17.0156f, 9.5625f, 17.2148f, 9.4453f, 17.4492f, 9.4453f)
                curveTo(17.9766f, 9.4453f, 18.3984f, 9.8672f, 18.3984f, 10.3828f)
                curveTo(18.3984f, 10.6406f, 18.2812f, 10.8164f, 18.1055f, 11.0156f)
                lineTo(15.2578f, 13.8984f)
                lineTo(18.0938f, 16.7461f)
                curveTo(18.2578f, 16.9219f, 18.3867f, 17.1211f, 18.3867f, 17.4023f)
                curveTo(18.3867f, 17.9062f, 17.9531f, 18.3516f, 17.4492f, 18.3516f)
                curveTo(17.1797f, 18.3516f, 16.9688f, 18.2109f, 16.793f, 18.0586f)
                lineTo(13.9336f, 15.1992f)
                lineTo(11.0859f, 18.0586f)
                curveTo(10.9102f, 18.2227f, 10.6875f, 18.3516f, 10.4414f, 18.3516f)
                close()
            }
        }
        .build()
        return _xmarkBin!!
    }

private var _xmarkBin: ImageVector? = null
