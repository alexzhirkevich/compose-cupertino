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

public val CupertinoIcons.Outlined.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 25.0195.dp, defaultHeight = 20.918.dp,
                viewportWidth = 25.0195f, viewportHeight = 20.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.9961f, 10.8867f)
                curveTo(1.5586f, 10.8867f, 1.9922f, 10.4531f, 1.9922f, 9.8906f)
                lineTo(1.9922f, 8.7773f)
                curveTo(1.9922f, 6.7617f, 3.3633f, 5.4492f, 5.4844f, 5.4492f)
                lineTo(14.625f, 5.4492f)
                lineTo(14.625f, 8.2031f)
                curveTo(14.625f, 8.6719f, 14.9062f, 8.9414f, 15.3867f, 8.9414f)
                curveTo(15.5977f, 8.9414f, 15.8203f, 8.8594f, 15.9844f, 8.7188f)
                lineTo(20.4141f, 5.0508f)
                curveTo(20.7891f, 4.7461f, 20.8125f, 4.2656f, 20.4141f, 3.9375f)
                lineTo(15.9844f, 0.2578f)
                curveTo(15.8203f, 0.1172f, 15.5977f, 0.0469f, 15.3867f, 0.0469f)
                curveTo(14.9062f, 0.0469f, 14.625f, 0.3047f, 14.625f, 0.7852f)
                lineTo(14.625f, 3.5039f)
                lineTo(5.6719f, 3.5039f)
                curveTo(2.2383f, 3.5039f, 0.0f, 5.4609f, 0.0f, 8.6367f)
                lineTo(0.0f, 9.8906f)
                curveTo(0.0f, 10.4531f, 0.4219f, 10.8867f, 0.9961f, 10.8867f)
                close()
                moveTo(24.0234f, 10.0547f)
                curveTo(23.4492f, 10.0547f, 23.0273f, 10.4766f, 23.0273f, 11.0508f)
                lineTo(23.0273f, 12.1641f)
                curveTo(23.0273f, 14.1797f, 21.6562f, 15.4805f, 19.5234f, 15.4805f)
                lineTo(10.3828f, 15.4805f)
                lineTo(10.3828f, 12.7617f)
                curveTo(10.3828f, 12.2812f, 10.1133f, 12.0234f, 9.6328f, 12.0234f)
                curveTo(9.4102f, 12.0234f, 9.1992f, 12.0938f, 9.0234f, 12.2344f)
                lineTo(4.5938f, 15.9023f)
                curveTo(4.2188f, 16.2305f, 4.207f, 16.6992f, 4.5938f, 17.0156f)
                lineTo(9.0234f, 20.6953f)
                curveTo(9.1992f, 20.8359f, 9.4102f, 20.918f, 9.6328f, 20.918f)
                curveTo(10.1133f, 20.918f, 10.3828f, 20.6484f, 10.3828f, 20.1797f)
                lineTo(10.3828f, 17.4375f)
                lineTo(19.3359f, 17.4375f)
                curveTo(22.7812f, 17.4375f, 25.0195f, 15.4805f, 25.0195f, 12.3047f)
                lineTo(25.0195f, 11.0508f)
                curveTo(25.0195f, 10.4766f, 24.5859f, 10.0547f, 24.0234f, 10.0547f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
