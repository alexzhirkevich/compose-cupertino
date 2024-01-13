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

public val CupertinoIcons.Outlined.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 20.7596.dp, defaultHeight =
                23.707.dp, viewportWidth = 20.7596f, viewportHeight = 23.707f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3824f, 23.6953f)
                curveTo(10.898f, 23.6953f, 11.2027f, 23.332f, 11.2027f, 22.8281f)
                lineTo(11.2027f, 20.2852f)
                lineTo(13.2183f, 21.4336f)
                curveTo(13.6519f, 21.668f, 14.0972f, 21.6328f, 14.3433f, 21.1992f)
                curveTo(14.5543f, 20.8359f, 14.4254f, 20.3789f, 13.98f, 20.1328f)
                lineTo(11.2027f, 18.5508f)
                lineTo(11.2027f, 17.0625f)
                lineTo(10.9683f, 12.8789f)
                lineTo(14.4957f, 15.1641f)
                lineTo(15.7965f, 15.9023f)
                lineTo(15.773f, 19.1016f)
                curveTo(15.7613f, 19.6055f, 16.0894f, 19.9688f, 16.4996f, 19.9688f)
                curveTo(17.0035f, 19.9688f, 17.2613f, 19.5938f, 17.2613f, 19.1016f)
                lineTo(17.273f, 16.7578f)
                lineTo(19.4879f, 18.0469f)
                curveTo(19.9449f, 18.3164f, 20.3785f, 18.1992f, 20.6246f, 17.7773f)
                curveTo(20.8707f, 17.332f, 20.7418f, 16.875f, 20.3082f, 16.6289f)
                lineTo(18.0933f, 15.3516f)
                lineTo(20.109f, 14.168f)
                curveTo(20.5308f, 13.9102f, 20.7183f, 13.5117f, 20.4722f, 13.0898f)
                curveTo(20.2379f, 12.7148f, 19.7925f, 12.6094f, 19.359f, 12.8672f)
                lineTo(16.605f, 14.4844f)
                lineTo(15.3043f, 13.7461f)
                lineTo(11.5191f, 11.8477f)
                lineTo(15.316f, 9.9492f)
                lineTo(16.5933f, 9.1992f)
                lineTo(19.3472f, 10.8164f)
                curveTo(19.7808f, 11.0742f, 20.2613f, 10.9688f, 20.484f, 10.6055f)
                curveTo(20.7183f, 10.1836f, 20.5308f, 9.7734f, 20.109f, 9.5156f)
                lineTo(18.0933f, 8.3438f)
                lineTo(20.3082f, 7.0664f)
                curveTo(20.7535f, 6.8086f, 20.8824f, 6.3633f, 20.6363f, 5.918f)
                curveTo(20.3902f, 5.4961f, 19.9332f, 5.3789f, 19.4996f, 5.6484f)
                lineTo(17.273f, 6.9141f)
                lineTo(17.2496f, 4.582f)
                curveTo(17.2496f, 4.0781f, 17.0035f, 3.7266f, 16.5113f, 3.7266f)
                curveTo(16.0777f, 3.7266f, 15.7613f, 4.0781f, 15.773f, 4.582f)
                lineTo(15.7847f, 7.7695f)
                lineTo(14.4957f, 8.5195f)
                lineTo(10.9683f, 10.8164f)
                lineTo(11.2027f, 6.6211f)
                lineTo(11.2027f, 5.1328f)
                lineTo(13.98f, 3.5625f)
                curveTo(14.4254f, 3.3047f, 14.5543f, 2.8594f, 14.3433f, 2.4844f)
                curveTo(14.0972f, 2.0625f, 13.6519f, 2.0156f, 13.2183f, 2.2617f)
                lineTo(11.2027f, 3.4102f)
                lineTo(11.2027f, 0.8555f)
                curveTo(11.2027f, 0.3516f, 10.898f, 0.0f, 10.3824f, 0.0f)
                curveTo(9.8902f, 0.0f, 9.5738f, 0.3516f, 9.5738f, 0.8555f)
                lineTo(9.5738f, 3.4102f)
                lineTo(7.523f, 2.2617f)
                curveTo(7.0894f, 2.0156f, 6.6676f, 2.0625f, 6.4097f, 2.4844f)
                curveTo(6.1988f, 2.8594f, 6.3394f, 3.3047f, 6.7847f, 3.5508f)
                lineTo(9.5738f, 5.1328f)
                lineTo(9.5738f, 6.6211f)
                lineTo(9.7964f, 10.8164f)
                lineTo(6.2691f, 8.5195f)
                lineTo(4.9683f, 7.7695f)
                lineTo(4.9918f, 4.582f)
                curveTo(5.0035f, 4.0781f, 4.6871f, 3.7266f, 4.2652f, 3.7266f)
                curveTo(3.7613f, 3.7266f, 3.5035f, 4.0898f, 3.5035f, 4.582f)
                lineTo(3.4918f, 6.9141f)
                lineTo(1.2652f, 5.6484f)
                curveTo(0.8433f, 5.3906f, 0.3629f, 5.4961f, 0.1285f, 5.918f)
                curveTo(-0.1293f, 6.3633f, 0.0113f, 6.8203f, 0.4566f, 7.0664f)
                lineTo(2.6597f, 8.3438f)
                lineTo(0.6558f, 9.5156f)
                curveTo(0.234f, 9.7734f, 0.0465f, 10.1484f, 0.2808f, 10.6055f)
                curveTo(0.4918f, 10.9805f, 0.9722f, 11.0742f, 1.4175f, 10.8164f)
                lineTo(4.1597f, 9.2109f)
                lineTo(5.4488f, 9.9492f)
                lineTo(9.2339f, 11.8477f)
                lineTo(5.4488f, 13.7461f)
                lineTo(4.1597f, 14.4961f)
                lineTo(1.4058f, 12.8672f)
                curveTo(0.9722f, 12.6094f, 0.5035f, 12.7148f, 0.3043f, 13.0781f)
                curveTo(0.0582f, 13.5352f, 0.234f, 13.9102f, 0.6558f, 14.168f)
                lineTo(2.6714f, 15.3516f)
                lineTo(0.4566f, 16.6289f)
                curveTo(0.023f, 16.875f, -0.1176f, 17.3438f, 0.1285f, 17.7656f)
                curveTo(0.3863f, 18.2109f, 0.8433f, 18.3047f, 1.2652f, 18.0469f)
                lineTo(3.4918f, 16.7812f)
                lineTo(3.5035f, 19.1016f)
                curveTo(3.5035f, 19.5938f, 3.7613f, 19.9688f, 4.2535f, 19.9688f)
                curveTo(4.6754f, 19.9688f, 5.0035f, 19.6055f, 4.9918f, 19.1016f)
                lineTo(4.9801f, 15.9023f)
                lineTo(6.2691f, 15.1758f)
                lineTo(9.7964f, 12.8789f)
                lineTo(9.5738f, 17.0625f)
                lineTo(9.5738f, 18.5508f)
                lineTo(6.7847f, 20.1328f)
                curveTo(6.3394f, 20.3789f, 6.1988f, 20.8359f, 6.4097f, 21.1992f)
                curveTo(6.6676f, 21.6328f, 7.0894f, 21.668f, 7.523f, 21.4336f)
                lineTo(9.5738f, 20.2734f)
                lineTo(9.5738f, 22.8281f)
                curveTo(9.5738f, 23.332f, 9.8902f, 23.6953f, 10.3824f, 23.6953f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
