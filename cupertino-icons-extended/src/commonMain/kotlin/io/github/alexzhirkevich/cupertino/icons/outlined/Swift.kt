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

public val CupertinoIcons.Outlined.Swift: ImageVector
    get() {
        if (_swift != null) {
            return _swift!!
        }
        _swift = Builder(name = "Swift", defaultWidth = 26.0039.dp, defaultHeight = 23.332.dp,
                viewportWidth = 26.0039f, viewportHeight = 23.332f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.9062f)
                curveTo(1.9688f, 18.1172f, 7.1133f, 23.0625f, 14.0391f, 23.0625f)
                curveTo(18.457f, 23.0625f, 19.6641f, 21.0117f, 22.2305f, 21.0117f)
                curveTo(24.3633f, 21.0117f, 25.207f, 22.4414f, 25.5352f, 23.0039f)
                curveTo(25.6289f, 23.1797f, 25.7812f, 23.2969f, 25.8867f, 22.957f)
                curveTo(25.9453f, 22.7109f, 26.0039f, 22.3828f, 26.0039f, 21.9844f)
                curveTo(26.0039f, 20.8594f, 25.6641f, 18.7148f, 23.7891f, 16.3594f)
                curveTo(24.1992f, 15.1992f, 24.2461f, 13.9219f, 24.2461f, 13.1719f)
                curveTo(24.2461f, 9.7617f, 22.3242f, 3.832f, 15.9609f, 0.0f)
                curveTo(17.2852f, 1.875f, 19.0664f, 4.7109f, 19.0664f, 8.6602f)
                curveTo(19.0664f, 10.0898f, 18.668f, 11.6602f, 18.3516f, 12.4453f)
                curveTo(14.8945f, 10.4414f, 8.2852f, 4.9336f, 5.6367f, 2.1211f)
                curveTo(7.7578f, 5.3789f, 10.2773f, 8.332f, 13.0664f, 11.4258f)
                curveTo(9.3164f, 9.0586f, 5.8242f, 6.3984f, 2.5664f, 3.4805f)
                curveTo(5.6836f, 8.0156f, 9.6328f, 12.4805f, 14.8359f, 16.6875f)
                curveTo(13.3477f, 17.5078f, 11.8125f, 18.1641f, 9.1992f, 18.1641f)
                curveTo(6.0117f, 18.1641f, 2.1211f, 16.6172f, 0.0f, 14.9062f)
                close()
            }
        }
        .build()
        return _swift!!
    }

private var _swift: ImageVector? = null
