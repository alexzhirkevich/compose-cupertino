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

public val CupertinoIcons.Filled.BellBadge: ImageVector
    get() {
        if (_bellBadge != null) {
            return _bellBadge!!
        }
        _bellBadge = Builder(name = "BellBadge", defaultWidth = 22.1133.dp, defaultHeight =
                24.832.dp, viewportWidth = 22.1133f, viewportHeight = 24.832f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7695f, 20.0508f)
                lineTo(20.3438f, 20.0508f)
                curveTo(21.4453f, 20.0508f, 22.1133f, 19.4883f, 22.1133f, 18.6328f)
                curveTo(22.1133f, 17.4609f, 20.918f, 16.4062f, 19.9102f, 15.3633f)
                curveTo(19.1367f, 14.5547f, 18.9258f, 12.8906f, 18.832f, 11.543f)
                curveTo(18.8203f, 10.7812f, 18.7734f, 10.0547f, 18.7031f, 9.3633f)
                curveTo(18.1172f, 9.5977f, 17.4844f, 9.7266f, 16.8164f, 9.7266f)
                curveTo(13.7109f, 9.7266f, 11.1562f, 7.1719f, 11.1562f, 4.0664f)
                curveTo(11.1562f, 2.6719f, 11.6719f, 1.3945f, 12.5039f, 0.4102f)
                curveTo(12.082f, 0.1992f, 11.5898f, 0.082f, 11.0508f, 0.082f)
                curveTo(9.3281f, 0.082f, 8.1094f, 1.2891f, 7.6758f, 2.8242f)
                curveTo(4.5586f, 3.9492f, 3.3633f, 7.043f, 3.2813f, 11.543f)
                curveTo(3.1875f, 12.8906f, 2.9766f, 14.5547f, 2.2031f, 15.3633f)
                curveTo(1.1836f, 16.4062f, 0.0f, 17.4609f, 0.0f, 18.6328f)
                curveTo(0.0f, 19.4883f, 0.6563f, 20.0508f, 1.7695f, 20.0508f)
                close()
                moveTo(11.0508f, 24.75f)
                curveTo(13.043f, 24.75f, 14.4961f, 23.2969f, 14.6484f, 21.6562f)
                lineTo(7.4648f, 21.6562f)
                curveTo(7.6172f, 23.2969f, 9.0703f, 24.75f, 11.0508f, 24.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8281f, 8.1211f)
                curveTo(19.043f, 8.1211f, 20.8945f, 6.293f, 20.8945f, 4.0664f)
                curveTo(20.8945f, 1.8281f, 19.043f, 0.0f, 16.8281f, 0.0f)
                curveTo(14.5898f, 0.0f, 12.7617f, 1.8281f, 12.7617f, 4.0664f)
                curveTo(12.7617f, 6.293f, 14.5898f, 8.1211f, 16.8281f, 8.1211f)
                close()
            }
        }
        .build()
        return _bellBadge!!
    }

private var _bellBadge: ImageVector? = null
