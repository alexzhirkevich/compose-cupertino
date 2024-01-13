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

public val CupertinoIcons.Outlined.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7578f, 22.4648f)
                lineTo(17.0391f, 20.9648f)
                curveTo(14.4023f, 20.9297f, 12.668f, 16.5586f, 12.1758f, 12.9375f)
                curveTo(16.7578f, 8.7891f, 19.9922f, 3.5625f, 17.5664f, 1.5234f)
                lineTo(16.5703f, 2.6719f)
                curveTo(17.9297f, 3.7969f, 15.457f, 7.8984f, 11.1797f, 11.7891f)
                curveTo(6.9375f, 10.0312f, 2.6602f, 9.3633f, 0.5156f, 11.8359f)
                lineTo(1.6172f, 12.6797f)
                curveTo(3.1523f, 11.0508f, 6.6094f, 11.543f, 10.6641f, 13.2422f)
                curveTo(11.2148f, 17.0625f, 13.2422f, 22.2539f, 16.7578f, 22.4648f)
                close()
                moveTo(13.8633f, 18.7383f)
                curveTo(21.6562f, 14.0156f, 22.7812f, 7.9102f, 22.1719f, 5.918f)
                lineTo(20.707f, 6.3516f)
                curveTo(21.1523f, 7.8398f, 20.1914f, 13.2422f, 12.8789f, 17.5664f)
                close()
                moveTo(10.7109f, 23.5547f)
                lineTo(11.8594f, 22.3359f)
                curveTo(9.9492f, 21.8086f, 5.7539f, 17.8828f, 5.6602f, 11.1562f)
                lineTo(4.125f, 11.2852f)
                curveTo(4.2305f, 17.9531f, 8.2266f, 22.3477f, 10.7109f, 23.5547f)
                close()
                moveTo(15.0234f, 8.1211f)
                lineTo(15.6914f, 6.75f)
                curveTo(12.3867f, 4.5938f, 6.5977f, 2.7891f, 2.0859f, 5.8125f)
                lineTo(2.1914f, 7.418f)
                curveTo(6.2109f, 4.3242f, 11.7305f, 5.9883f, 15.0234f, 8.1211f)
                close()
                moveTo(11.9531f, 0.0f)
                curveTo(5.4258f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4375f, 23.9062f, 11.9648f, 23.9062f)
                curveTo(18.5039f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4922f, 0.0f, 11.9531f, 0.0f)
                close()
                moveTo(11.9531f, 1.5938f)
                curveTo(17.6133f, 1.5938f, 22.3125f, 6.293f, 22.3125f, 11.9531f)
                curveTo(22.3125f, 17.6133f, 17.625f, 22.3125f, 11.9648f, 22.3125f)
                curveTo(6.3047f, 22.3125f, 1.5938f, 17.6133f, 1.5938f, 11.9531f)
                curveTo(1.5938f, 6.293f, 6.293f, 1.5938f, 11.9531f, 1.5938f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
