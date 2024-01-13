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

public val CupertinoIcons.Outlined.Option: ImageVector
    get() {
        if (_option != null) {
            return _option!!
        }
        _option = Builder(name = "Option", defaultWidth = 23.9297.dp, defaultHeight = 21.4805.dp,
                viewportWidth = 23.9297f, viewportHeight = 21.4805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 0.0f)
                lineTo(1.1016f, 0.0f)
                curveTo(0.4805f, 0.0f, 0.0f, 0.457f, 0.0f, 1.0547f)
                curveTo(0.0f, 1.6523f, 0.4805f, 2.1211f, 1.1016f, 2.1211f)
                lineTo(6.2578f, 2.1211f)
                curveTo(6.6797f, 2.1211f, 6.9844f, 2.3086f, 7.1602f, 2.6953f)
                lineTo(14.8828f, 20.0391f)
                curveTo(15.3164f, 21.0234f, 16.0312f, 21.4805f, 17.1094f, 21.4805f)
                lineTo(22.8281f, 21.4805f)
                curveTo(23.4375f, 21.4805f, 23.9297f, 21.0117f, 23.9297f, 20.4258f)
                curveTo(23.9297f, 19.8398f, 23.4375f, 19.3594f, 22.8281f, 19.3594f)
                lineTo(17.6367f, 19.3594f)
                curveTo(17.168f, 19.3594f, 16.875f, 19.1836f, 16.6875f, 18.7969f)
                lineTo(9.0f, 1.4648f)
                curveTo(8.6016f, 0.5508f, 7.7578f, 0.0f, 6.75f, 0.0f)
                close()
                moveTo(22.8281f, 0.0f)
                lineTo(15.2461f, 0.0f)
                curveTo(14.625f, 0.0f, 14.1445f, 0.4453f, 14.1445f, 1.043f)
                curveTo(14.1445f, 1.6406f, 14.625f, 2.0977f, 15.2461f, 2.0977f)
                lineTo(22.8281f, 2.0977f)
                curveTo(23.4492f, 2.0977f, 23.918f, 1.6406f, 23.918f, 1.043f)
                curveTo(23.918f, 0.4453f, 23.4492f, 0.0f, 22.8281f, 0.0f)
                close()
            }
        }
        .build()
        return _option!!
    }

private var _option: ImageVector? = null
