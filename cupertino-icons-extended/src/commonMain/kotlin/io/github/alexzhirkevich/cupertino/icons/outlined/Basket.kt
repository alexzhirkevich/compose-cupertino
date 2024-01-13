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

public val CupertinoIcons.Outlined.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 27.4453.dp, defaultHeight = 26.1689.dp,
                viewportWidth = 27.4453f, viewportHeight = 26.1689f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.5786f)
                curveTo(0.0f, 12.6802f, 0.6797f, 13.3716f, 1.793f, 13.3716f)
                lineTo(25.6406f, 13.3716f)
                curveTo(26.7539f, 13.3716f, 27.4453f, 12.6802f, 27.4453f, 11.5786f)
                lineTo(27.4453f, 9.8794f)
                curveTo(27.4453f, 8.7778f, 26.7539f, 8.0747f, 25.6406f, 8.0747f)
                lineTo(1.793f, 8.0747f)
                curveTo(0.6797f, 8.0747f, 0.0f, 8.7778f, 0.0f, 9.8794f)
                close()
                moveTo(2.25f, 9.938f)
                lineTo(25.1836f, 9.938f)
                curveTo(25.4414f, 9.938f, 25.5938f, 10.0903f, 25.5938f, 10.3481f)
                lineTo(25.5938f, 11.0981f)
                curveTo(25.5938f, 11.356f, 25.4414f, 11.52f, 25.1836f, 11.52f)
                lineTo(2.25f, 11.52f)
                curveTo(1.9922f, 11.52f, 1.8516f, 11.356f, 1.8516f, 11.0981f)
                lineTo(1.8516f, 10.3481f)
                curveTo(1.8516f, 10.0903f, 1.9922f, 9.938f, 2.25f, 9.938f)
                close()
                moveTo(7.4531f, 25.1138f)
                lineTo(19.9922f, 25.1138f)
                curveTo(22.6992f, 25.1138f, 23.5312f, 23.5317f, 23.8828f, 21.8325f)
                lineTo(25.7461f, 12.9028f)
                lineTo(23.9062f, 12.5864f)
                lineTo(22.1602f, 21.1177f)
                curveTo(21.8438f, 22.6177f, 21.375f, 23.2388f, 19.6641f, 23.2388f)
                lineTo(7.7813f, 23.2388f)
                curveTo(6.0703f, 23.2388f, 5.6016f, 22.6177f, 5.2852f, 21.1177f)
                lineTo(3.5391f, 12.5864f)
                lineTo(1.6992f, 12.9028f)
                lineTo(3.5625f, 21.8325f)
                curveTo(3.9141f, 23.5317f, 4.7461f, 25.1138f, 7.4531f, 25.1138f)
                close()
                moveTo(8.7305f, 21.9614f)
                curveTo(9.1641f, 21.8911f, 9.3984f, 21.5747f, 9.3398f, 21.1997f)
                lineTo(8.3672f, 15.0708f)
                curveTo(8.2969f, 14.6841f, 7.9688f, 14.4731f, 7.5469f, 14.5317f)
                curveTo(7.1133f, 14.6138f, 6.8672f, 14.9185f, 6.9375f, 15.2935f)
                lineTo(7.9102f, 21.4224f)
                curveTo(7.9805f, 21.8091f, 8.2969f, 22.0317f, 8.7305f, 21.9614f)
                close()
                moveTo(12.0938f, 21.8911f)
                curveTo(12.5156f, 21.8677f, 12.7969f, 21.5864f, 12.7734f, 21.1997f)
                lineTo(12.3984f, 15.1294f)
                curveTo(12.3633f, 14.731f, 12.0703f, 14.4614f, 11.6367f, 14.4966f)
                curveTo(11.2148f, 14.5317f, 10.9336f, 14.813f, 10.957f, 15.2114f)
                lineTo(11.332f, 21.27f)
                curveTo(11.3555f, 21.6685f, 11.6719f, 21.9263f, 12.0938f, 21.8911f)
                close()
                moveTo(15.3633f, 21.8911f)
                curveTo(15.7852f, 21.9263f, 16.1016f, 21.6685f, 16.125f, 21.27f)
                lineTo(16.5f, 15.2114f)
                curveTo(16.5234f, 14.813f, 16.2422f, 14.5317f, 15.8203f, 14.4966f)
                curveTo(15.3867f, 14.4614f, 15.0938f, 14.731f, 15.0586f, 15.1294f)
                lineTo(14.6836f, 21.1997f)
                curveTo(14.6602f, 21.5864f, 14.9414f, 21.8677f, 15.3633f, 21.8911f)
                close()
                moveTo(18.7148f, 21.9614f)
                curveTo(19.1367f, 22.0317f, 19.4648f, 21.8091f, 19.5352f, 21.4224f)
                lineTo(20.5195f, 15.2935f)
                curveTo(20.5781f, 14.9185f, 20.332f, 14.6138f, 19.8984f, 14.5317f)
                curveTo(19.4766f, 14.4731f, 19.1484f, 14.6841f, 19.0781f, 15.0708f)
                lineTo(18.1055f, 21.1997f)
                curveTo(18.0469f, 21.5747f, 18.2812f, 21.8911f, 18.7148f, 21.9614f)
                close()
                moveTo(3.7852f, 8.5552f)
                lineTo(6.1406f, 8.5552f)
                lineTo(10.2422f, 1.4185f)
                curveTo(10.5586f, 0.856f, 10.3008f, 0.3638f, 9.8672f, 0.1294f)
                curveTo(9.4453f, -0.0933f, 8.8828f, -0.0581f, 8.5664f, 0.4692f)
                close()
                moveTo(21.3047f, 8.5552f)
                lineTo(23.6602f, 8.5552f)
                lineTo(18.8789f, 0.4692f)
                curveTo(18.5742f, -0.0464f, 18.0117f, -0.0815f, 17.5781f, 0.1294f)
                curveTo(17.1562f, 0.3638f, 16.8867f, 0.856f, 17.2031f, 1.4185f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
