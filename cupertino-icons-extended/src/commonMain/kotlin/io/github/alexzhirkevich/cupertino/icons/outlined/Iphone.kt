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

public val CupertinoIcons.Outlined.Iphone: ImageVector
    get() {
        if (_iphone != null) {
            return _iphone!!
        }
        _iphone = Builder(name = "Iphone", defaultWidth = 15.0586.dp, defaultHeight = 24.832.dp,
                viewportWidth = 15.0586f, viewportHeight = 24.832f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1875f, 24.8086f)
                lineTo(11.8711f, 24.8086f)
                curveTo(13.7812f, 24.8086f, 15.0586f, 23.5898f, 15.0586f, 21.7617f)
                lineTo(15.0586f, 3.0469f)
                curveTo(15.0586f, 1.2188f, 13.7812f, 0.0f, 11.8711f, 0.0f)
                lineTo(3.1875f, 0.0f)
                curveTo(1.2773f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.0469f)
                lineTo(0.0f, 21.7617f)
                curveTo(0.0f, 23.5898f, 1.2773f, 24.8086f, 3.1875f, 24.8086f)
                close()
                moveTo(3.4336f, 22.9219f)
                curveTo(2.4375f, 22.9219f, 1.8867f, 22.3945f, 1.8867f, 21.457f)
                lineTo(1.8867f, 3.3516f)
                curveTo(1.8867f, 2.4141f, 2.4375f, 1.8867f, 3.4336f, 1.8867f)
                lineTo(4.9336f, 1.8867f)
                curveTo(5.1211f, 1.8867f, 5.2148f, 1.9805f, 5.2148f, 2.1563f)
                lineTo(5.2148f, 2.4258f)
                curveTo(5.2148f, 2.918f, 5.543f, 3.2461f, 6.0234f, 3.2461f)
                lineTo(9.0469f, 3.2461f)
                curveTo(9.5391f, 3.2461f, 9.8555f, 2.918f, 9.8555f, 2.4258f)
                lineTo(9.8555f, 2.1563f)
                curveTo(9.8555f, 1.9805f, 9.9492f, 1.8867f, 10.1367f, 1.8867f)
                lineTo(11.6367f, 1.8867f)
                curveTo(12.6211f, 1.8867f, 13.1719f, 2.4141f, 13.1719f, 3.3516f)
                lineTo(13.1719f, 21.457f)
                curveTo(13.1719f, 22.3945f, 12.6211f, 22.9219f, 11.6367f, 22.9219f)
                close()
                moveTo(5.0508f, 22.0664f)
                lineTo(10.0312f, 22.0664f)
                curveTo(10.3477f, 22.0664f, 10.5703f, 21.8438f, 10.5703f, 21.5156f)
                curveTo(10.5703f, 21.1875f, 10.3477f, 20.9766f, 10.0312f, 20.9766f)
                lineTo(5.0508f, 20.9766f)
                curveTo(4.7344f, 20.9766f, 4.5f, 21.1875f, 4.5f, 21.5156f)
                curveTo(4.5f, 21.8438f, 4.7344f, 22.0664f, 5.0508f, 22.0664f)
                close()
            }
        }
        .build()
        return _iphone!!
    }

private var _iphone: ImageVector? = null
