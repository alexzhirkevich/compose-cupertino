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

public val CupertinoIcons.Outlined.Eyes: ImageVector
    get() {
        if (_eyes != null) {
            return _eyes!!
        }
        _eyes = Builder(name = "Eyes", defaultWidth = 27.3984.dp, defaultHeight = 21.3633.dp,
                viewportWidth = 27.3984f, viewportHeight = 21.3633f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4219f, 21.3633f)
                curveTo(9.9844f, 21.3633f, 12.832f, 17.0273f, 12.832f, 10.6758f)
                curveTo(12.832f, 4.3125f, 9.9844f, 0.0f, 6.4219f, 0.0f)
                curveTo(2.8477f, 0.0f, 0.0f, 4.3125f, 0.0f, 10.6758f)
                curveTo(0.0f, 17.0273f, 2.8477f, 21.3633f, 6.4219f, 21.3633f)
                close()
                moveTo(6.4219f, 19.7109f)
                curveTo(3.8555f, 19.7227f, 1.6875f, 16.043f, 1.6875f, 10.6758f)
                curveTo(1.6875f, 5.3438f, 3.8555f, 1.6758f, 6.4219f, 1.6523f)
                curveTo(9.0117f, 1.6406f, 11.1797f, 5.3086f, 11.1797f, 10.6758f)
                curveTo(11.1797f, 16.0078f, 9.0117f, 19.6875f, 6.4219f, 19.7109f)
                close()
                moveTo(3.8906f, 14.8125f)
                curveTo(5.8477f, 14.8125f, 7.1484f, 13.4531f, 7.1484f, 11.3906f)
                curveTo(7.1484f, 9.3633f, 5.8477f, 7.9922f, 3.8906f, 7.9922f)
                curveTo(1.9219f, 7.9922f, 0.6211f, 9.3633f, 0.6211f, 11.3906f)
                curveTo(0.6211f, 13.4531f, 1.9219f, 14.8125f, 3.8906f, 14.8125f)
                close()
                moveTo(2.9648f, 10.9922f)
                curveTo(2.543f, 10.9336f, 2.2852f, 10.4297f, 2.3789f, 9.9141f)
                curveTo(2.4844f, 9.4102f, 2.8828f, 9.0352f, 3.2813f, 9.1172f)
                curveTo(3.7031f, 9.1992f, 3.9609f, 9.6797f, 3.8555f, 10.1836f)
                curveTo(3.7617f, 10.6992f, 3.375f, 11.0625f, 2.9648f, 10.9922f)
                close()
                moveTo(20.9766f, 21.3633f)
                curveTo(24.5508f, 21.3633f, 27.3984f, 17.0273f, 27.3984f, 10.6758f)
                curveTo(27.3984f, 4.3125f, 24.5508f, 0.0f, 20.9766f, 0.0f)
                curveTo(17.4141f, 0.0f, 14.5664f, 4.3125f, 14.5664f, 10.6758f)
                curveTo(14.5664f, 17.0273f, 17.4141f, 21.3633f, 20.9766f, 21.3633f)
                close()
                moveTo(20.9766f, 19.6992f)
                curveTo(18.3984f, 19.6992f, 16.2188f, 16.0312f, 16.2188f, 10.6758f)
                curveTo(16.2188f, 5.3438f, 18.3867f, 1.6758f, 20.9766f, 1.6641f)
                curveTo(23.543f, 1.6641f, 25.7227f, 5.332f, 25.7227f, 10.6758f)
                curveTo(25.7227f, 16.0195f, 23.543f, 19.6875f, 20.9766f, 19.6992f)
                close()
                moveTo(18.4336f, 14.8125f)
                curveTo(20.3906f, 14.8125f, 21.7148f, 13.4531f, 21.7148f, 11.3906f)
                curveTo(21.7148f, 9.3633f, 20.3906f, 7.9922f, 18.4336f, 7.9922f)
                curveTo(16.4766f, 7.9922f, 15.1641f, 9.3633f, 15.1641f, 11.3906f)
                curveTo(15.1641f, 13.4531f, 16.4766f, 14.8125f, 18.4336f, 14.8125f)
                close()
                moveTo(17.5078f, 10.9922f)
                curveTo(17.0977f, 10.9219f, 16.8281f, 10.4297f, 16.9336f, 9.9141f)
                curveTo(17.0391f, 9.4102f, 17.4258f, 9.0352f, 17.8359f, 9.1172f)
                curveTo(18.2578f, 9.1875f, 18.5039f, 9.6797f, 18.3984f, 10.1836f)
                curveTo(18.3047f, 10.6992f, 17.918f, 11.0625f, 17.5078f, 10.9922f)
                close()
            }
        }
        .build()
        return _eyes!!
    }

private var _eyes: ImageVector? = null
