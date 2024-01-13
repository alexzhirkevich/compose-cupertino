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

public val CupertinoIcons.Filled.LinkCircle: ImageVector
    get() {
        if (_linkCircle != null) {
            return _linkCircle!!
        }
        _linkCircle = Builder(name = "LinkCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(6.0586f, 17.6602f)
                curveTo(4.5234f, 16.1367f, 4.6641f, 14.25f, 6.4102f, 12.4922f)
                lineTo(8.5664f, 10.3594f)
                curveTo(8.3789f, 10.9688f, 8.3906f, 11.6602f, 8.5898f, 12.1289f)
                lineTo(7.3477f, 13.3477f)
                curveTo(6.1289f, 14.543f, 6.0f, 15.7969f, 6.9609f, 16.7344f)
                curveTo(7.9102f, 17.6719f, 9.1523f, 17.5312f, 10.3477f, 16.3477f)
                lineTo(12.082f, 14.6016f)
                curveTo(13.3125f, 13.3945f, 13.4648f, 12.1289f, 12.5273f, 11.1797f)
                curveTo(12.2344f, 10.8984f, 11.8125f, 10.6992f, 11.2617f, 10.6289f)
                curveTo(11.4492f, 10.207f, 11.8594f, 9.75f, 12.1992f, 9.5156f)
                curveTo(12.5391f, 9.5742f, 13.0195f, 9.8555f, 13.418f, 10.2891f)
                curveTo(14.9648f, 11.8125f, 14.8125f, 13.6992f, 13.0195f, 15.4922f)
                lineTo(11.2148f, 17.2734f)
                curveTo(9.457f, 19.043f, 7.5586f, 19.1602f, 6.0586f, 17.6602f)
                close()
                moveTo(17.4492f, 6.2344f)
                curveTo(18.9844f, 7.7578f, 18.8438f, 9.6445f, 17.0859f, 11.4141f)
                lineTo(14.9414f, 13.5352f)
                curveTo(15.1289f, 12.9375f, 15.1172f, 12.2344f, 14.918f, 11.7773f)
                lineTo(16.1602f, 10.5469f)
                curveTo(17.3789f, 9.3516f, 17.4961f, 8.0977f, 16.5469f, 7.1602f)
                curveTo(15.5977f, 6.2227f, 14.3555f, 6.3633f, 13.1602f, 7.5469f)
                lineTo(11.4258f, 9.293f)
                curveTo(10.1836f, 10.5117f, 10.043f, 11.7656f, 10.9805f, 12.7266f)
                curveTo(11.2734f, 12.9961f, 11.6953f, 13.1953f, 12.2461f, 13.2773f)
                curveTo(12.0586f, 13.6992f, 11.6367f, 14.1562f, 11.2969f, 14.3906f)
                curveTo(10.9688f, 14.332f, 10.4883f, 14.0391f, 10.0898f, 13.6172f)
                curveTo(8.543f, 12.0938f, 8.6953f, 10.1953f, 10.4883f, 8.4141f)
                lineTo(12.2812f, 6.6211f)
                curveTo(14.0508f, 4.8516f, 15.9375f, 4.7344f, 17.4492f, 6.2344f)
                close()
            }
        }
        .build()
        return _linkCircle!!
    }

private var _linkCircle: ImageVector? = null
