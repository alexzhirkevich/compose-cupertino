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

public val CupertinoIcons.Filled.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 18.0.dp, defaultHeight = 27.2461.dp,
                viewportWidth = 18.0f, viewportHeight = 27.2461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.6875f)
                curveTo(0.0f, 22.9219f, 2.0156f, 24.9844f, 5.168f, 24.9844f)
                curveTo(7.5234f, 24.9844f, 9.2813f, 23.9531f, 10.3945f, 21.9609f)
                lineTo(11.4492f, 20.0742f)
                curveTo(13.9219f, 15.5508f, 18.0f, 14.9648f, 18.0f, 9.1523f)
                curveTo(18.0f, 3.668f, 14.4492f, 0.0f, 9.1289f, 0.0f)
                curveTo(3.6797f, 0.0f, 0.0f, 3.6914f, 0.0f, 9.1992f)
                close()
                moveTo(3.1523f, 14.625f)
                lineTo(3.1523f, 8.7773f)
                curveTo(3.1523f, 5.4844f, 5.4609f, 3.2695f, 9.1172f, 3.2695f)
                curveTo(12.6562f, 3.2695f, 14.8594f, 5.4844f, 14.8594f, 8.7773f)
                curveTo(14.8594f, 9.2578f, 14.4492f, 9.668f, 13.9688f, 9.668f)
                curveTo(13.4883f, 9.668f, 13.0898f, 9.2578f, 13.0898f, 8.7773f)
                curveTo(13.0898f, 6.5156f, 11.625f, 5.0391f, 9.1172f, 5.0391f)
                curveTo(6.4922f, 5.0391f, 4.9219f, 6.5273f, 4.9219f, 8.7773f)
                lineTo(4.9219f, 10.2656f)
                lineTo(8.4609f, 10.2656f)
                curveTo(10.3594f, 10.2656f, 11.6133f, 11.4258f, 11.6133f, 13.1484f)
                curveTo(11.6133f, 13.875f, 11.2969f, 14.7656f, 10.8164f, 15.375f)
                lineTo(9.293f, 17.3086f)
                curveTo(9.0938f, 17.5547f, 8.8359f, 17.6953f, 8.5664f, 17.6953f)
                curveTo(8.0859f, 17.6953f, 7.6758f, 17.2969f, 7.6758f, 16.8164f)
                curveTo(7.6758f, 16.5938f, 7.7578f, 16.3828f, 7.9102f, 16.1836f)
                lineTo(9.3164f, 14.4141f)
                curveTo(9.5977f, 14.0742f, 9.7852f, 13.582f, 9.7852f, 13.2188f)
                curveTo(9.7852f, 12.5156f, 9.2813f, 12.0352f, 8.4844f, 12.0352f)
                lineTo(4.9219f, 12.0352f)
                lineTo(4.9219f, 14.625f)
                curveTo(4.9219f, 15.1055f, 4.5117f, 15.5156f, 4.0313f, 15.5156f)
                curveTo(3.5508f, 15.5156f, 3.1523f, 15.1055f, 3.1523f, 14.625f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
