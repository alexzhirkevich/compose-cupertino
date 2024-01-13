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

public val CupertinoIcons.Filled.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = Builder(name = "Newspaper", defaultWidth = 26.1797.dp, defaultHeight =
                25.1367.dp, viewportWidth = 26.1797f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.4258f)
                lineTo(0.0f, 21.8906f)
                curveTo(0.0f, 22.7461f, 0.6211f, 23.2969f, 1.4414f, 23.2969f)
                curveTo(2.2617f, 23.2852f, 2.8828f, 22.7461f, 2.8828f, 21.8906f)
                lineTo(2.8828f, 9.2227f)
                lineTo(2.3086f, 9.2227f)
                curveTo(0.8789f, 9.2227f, 0.0f, 10.0312f, 0.0f, 11.4258f)
                close()
                moveTo(3.9609f, 25.125f)
                lineTo(22.5f, 25.125f)
                curveTo(24.9609f, 25.125f, 26.1797f, 23.918f, 26.1797f, 21.5039f)
                lineTo(26.1797f, 3.6328f)
                curveTo(26.1797f, 1.2188f, 24.9609f, 0.0f, 22.5f, 0.0f)
                lineTo(8.8477f, 0.0f)
                curveTo(6.3984f, 0.0f, 5.168f, 1.2188f, 5.168f, 3.6328f)
                lineTo(5.168f, 22.6641f)
                curveTo(5.168f, 23.918f, 4.875f, 24.6211f, 3.9609f, 25.125f)
                close()
                moveTo(9.8672f, 6.9844f)
                curveTo(9.4453f, 6.9844f, 9.1289f, 6.6563f, 9.1289f, 6.2461f)
                curveTo(9.1289f, 5.8477f, 9.4453f, 5.543f, 9.8672f, 5.543f)
                lineTo(21.5039f, 5.543f)
                curveTo(21.9141f, 5.543f, 22.2305f, 5.8477f, 22.2305f, 6.2461f)
                curveTo(22.2305f, 6.6563f, 21.9141f, 6.9844f, 21.5039f, 6.9844f)
                close()
                moveTo(9.8672f, 11.1094f)
                curveTo(9.4453f, 11.1094f, 9.1289f, 10.793f, 9.1289f, 10.3945f)
                curveTo(9.1289f, 9.9844f, 9.4453f, 9.668f, 9.8672f, 9.668f)
                lineTo(21.5039f, 9.668f)
                curveTo(21.9141f, 9.668f, 22.2305f, 9.9844f, 22.2305f, 10.3945f)
                curveTo(22.2305f, 10.793f, 21.9141f, 11.1094f, 21.5039f, 11.1094f)
                close()
                moveTo(17.1328f, 15.2461f)
                curveTo(16.7109f, 15.2461f, 16.4062f, 14.9414f, 16.4062f, 14.543f)
                curveTo(16.4062f, 14.1211f, 16.7109f, 13.8047f, 17.1328f, 13.8047f)
                lineTo(21.5039f, 13.8047f)
                curveTo(21.9141f, 13.8047f, 22.2188f, 14.1211f, 22.2188f, 14.543f)
                curveTo(22.2188f, 14.9414f, 21.9141f, 15.2461f, 21.5039f, 15.2461f)
                close()
                moveTo(17.1328f, 19.4648f)
                curveTo(16.7109f, 19.4648f, 16.4062f, 19.1602f, 16.4062f, 18.7617f)
                curveTo(16.4062f, 18.3516f, 16.7109f, 18.0234f, 17.1328f, 18.0234f)
                lineTo(21.5039f, 18.0234f)
                curveTo(21.9141f, 18.0234f, 22.2188f, 18.3516f, 22.2188f, 18.7617f)
                curveTo(22.2188f, 19.1602f, 21.9141f, 19.4648f, 21.5039f, 19.4648f)
                close()
                moveTo(10.5f, 19.5234f)
                curveTo(9.6328f, 19.5234f, 9.1172f, 19.0078f, 9.1172f, 18.1523f)
                lineTo(9.1172f, 15.1875f)
                curveTo(9.1172f, 14.3203f, 9.6328f, 13.8047f, 10.5f, 13.8047f)
                lineTo(13.4297f, 13.8047f)
                curveTo(14.2852f, 13.8047f, 14.8008f, 14.3203f, 14.8008f, 15.1875f)
                lineTo(14.8008f, 18.1523f)
                curveTo(14.8008f, 19.0078f, 14.2852f, 19.5234f, 13.4297f, 19.5234f)
                close()
            }
        }
        .build()
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
