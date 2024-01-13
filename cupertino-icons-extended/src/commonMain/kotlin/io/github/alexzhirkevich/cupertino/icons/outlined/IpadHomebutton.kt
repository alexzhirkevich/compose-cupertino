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

public val CupertinoIcons.Outlined.IpadHomebutton: ImageVector
    get() {
        if (_ipadHomebutton != null) {
            return _ipadHomebutton!!
        }
        _ipadHomebutton = Builder(name = "IpadHomebutton", defaultWidth = 19.582.dp, defaultHeight =
                26.4258.dp, viewportWidth = 19.582f, viewportHeight = 26.4258f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2461f, 26.4023f)
                lineTo(16.3359f, 26.4023f)
                curveTo(18.2812f, 26.4023f, 19.582f, 25.1602f, 19.582f, 23.3086f)
                lineTo(19.582f, 3.1055f)
                curveTo(19.582f, 1.2539f, 18.2812f, 0.0f, 16.3359f, 0.0f)
                lineTo(3.2461f, 0.0f)
                curveTo(1.3008f, 0.0f, 0.0f, 1.2539f, 0.0f, 3.1055f)
                lineTo(0.0f, 23.3086f)
                curveTo(0.0f, 25.1602f, 1.3008f, 26.4023f, 3.2461f, 26.4023f)
                close()
                moveTo(1.8867f, 22.4297f)
                lineTo(1.8867f, 3.9844f)
                lineTo(17.6953f, 3.9844f)
                lineTo(17.6953f, 22.4297f)
                close()
                moveTo(9.8086f, 25.2422f)
                curveTo(9.2344f, 25.2422f, 8.7891f, 24.7852f, 8.7891f, 24.2227f)
                curveTo(8.7891f, 23.6719f, 9.2344f, 23.2148f, 9.8086f, 23.2148f)
                curveTo(10.3594f, 23.2148f, 10.8164f, 23.6719f, 10.8164f, 24.2227f)
                curveTo(10.8164f, 24.7852f, 10.3594f, 25.2422f, 9.8086f, 25.2422f)
                close()
                moveTo(9.7852f, 2.7891f)
                curveTo(9.4336f, 2.7891f, 9.1523f, 2.4961f, 9.1523f, 2.1445f)
                curveTo(9.1523f, 1.8047f, 9.4336f, 1.5f, 9.7852f, 1.5f)
                curveTo(10.1367f, 1.5f, 10.4297f, 1.8047f, 10.4297f, 2.1445f)
                curveTo(10.4297f, 2.4961f, 10.1367f, 2.7891f, 9.7852f, 2.7891f)
                close()
            }
        }
        .build()
        return _ipadHomebutton!!
    }

private var _ipadHomebutton: ImageVector? = null
