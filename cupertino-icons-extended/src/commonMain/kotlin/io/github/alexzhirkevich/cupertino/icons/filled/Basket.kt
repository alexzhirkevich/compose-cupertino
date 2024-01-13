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

public val CupertinoIcons.Filled.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 27.4453.dp, defaultHeight = 26.1689.dp,
                viewportWidth = 27.4453f, viewportHeight = 26.1689f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.4536f)
                curveTo(0.0f, 11.5669f, 0.6797f, 12.2466f, 1.793f, 12.2466f)
                lineTo(25.6406f, 12.2466f)
                curveTo(26.7539f, 12.2466f, 27.4453f, 11.5669f, 27.4453f, 10.4536f)
                lineTo(27.4453f, 9.8794f)
                curveTo(27.4453f, 8.7778f, 26.7539f, 8.0747f, 25.6406f, 8.0747f)
                lineTo(1.793f, 8.0747f)
                curveTo(0.6797f, 8.0747f, 0.0f, 8.7778f, 0.0f, 9.8794f)
                close()
                moveTo(7.4531f, 25.1138f)
                lineTo(19.9922f, 25.1138f)
                curveTo(22.6992f, 25.1138f, 23.543f, 23.5317f, 23.8828f, 21.8325f)
                lineTo(25.5117f, 13.852f)
                lineTo(1.9453f, 13.852f)
                lineTo(3.5625f, 21.8325f)
                curveTo(3.9023f, 23.5317f, 4.7461f, 25.1138f, 7.4531f, 25.1138f)
                close()
                moveTo(8.2148f, 23.0981f)
                curveTo(7.7695f, 23.1685f, 7.4414f, 22.9341f, 7.3711f, 22.5356f)
                lineTo(6.3633f, 16.6411f)
                curveTo(6.293f, 16.2427f, 6.5508f, 15.9263f, 6.9961f, 15.8442f)
                curveTo(7.4414f, 15.7856f, 7.7813f, 16.0083f, 7.8516f, 16.4067f)
                lineTo(8.8477f, 22.3013f)
                curveTo(8.9063f, 22.6997f, 8.6719f, 23.0161f, 8.2148f, 23.0981f)
                close()
                moveTo(11.9297f, 23.0864f)
                curveTo(11.4844f, 23.1099f, 11.1562f, 22.8403f, 11.1328f, 22.4302f)
                lineTo(10.7461f, 16.606f)
                curveTo(10.7227f, 16.1958f, 11.0156f, 15.9028f, 11.4492f, 15.8677f)
                curveTo(11.9062f, 15.8325f, 12.2109f, 16.1138f, 12.2461f, 16.5239f)
                lineTo(12.6328f, 22.3481f)
                curveTo(12.6562f, 22.7583f, 12.3633f, 23.063f, 11.9297f, 23.0864f)
                close()
                moveTo(15.5391f, 23.0864f)
                curveTo(15.0938f, 23.063f, 14.8008f, 22.7583f, 14.8242f, 22.3481f)
                lineTo(15.2109f, 16.5239f)
                curveTo(15.2461f, 16.1138f, 15.5508f, 15.8325f, 16.0078f, 15.8677f)
                curveTo(16.4414f, 15.9028f, 16.7344f, 16.1958f, 16.7109f, 16.606f)
                lineTo(16.3242f, 22.4302f)
                curveTo(16.3008f, 22.8403f, 15.9727f, 23.1099f, 15.5391f, 23.0864f)
                close()
                moveTo(19.2305f, 23.0981f)
                curveTo(18.7734f, 23.0161f, 18.5391f, 22.6997f, 18.5977f, 22.3013f)
                lineTo(19.5938f, 16.4067f)
                curveTo(19.6641f, 16.0083f, 20.0039f, 15.7856f, 20.4492f, 15.8442f)
                curveTo(20.8945f, 15.9263f, 21.1523f, 16.2661f, 21.082f, 16.6645f)
                lineTo(20.0742f, 22.5356f)
                curveTo(20.0039f, 22.9341f, 19.6641f, 23.1685f, 19.2305f, 23.0981f)
                close()
                moveTo(3.7734f, 8.5786f)
                lineTo(6.1172f, 8.5786f)
                lineTo(10.2422f, 1.4185f)
                curveTo(10.5586f, 0.856f, 10.3008f, 0.3638f, 9.8672f, 0.1294f)
                curveTo(9.4453f, -0.0933f, 8.8828f, -0.0581f, 8.5664f, 0.4692f)
                close()
                moveTo(21.3281f, 8.5786f)
                lineTo(23.6719f, 8.5786f)
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
