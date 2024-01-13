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

public val CupertinoIcons.Filled.PersonTextRectangle: ImageVector
    get() {
        if (_personTextRectangle != null) {
            return _personTextRectangle!!
        }
        _personTextRectangle = Builder(name = "PersonTextRectangle", defaultWidth = 27.6328.dp,
                defaultHeight = 21.5742.dp, viewportWidth = 27.6328f, viewportHeight =
                21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
                moveTo(16.582f, 6.9258f)
                curveTo(16.1602f, 6.9258f, 15.8438f, 6.6094f, 15.8438f, 6.1992f)
                curveTo(15.8438f, 5.8008f, 16.1602f, 5.4844f, 16.582f, 5.4844f)
                lineTo(22.9805f, 5.4844f)
                curveTo(23.3906f, 5.4844f, 23.707f, 5.8008f, 23.707f, 6.1992f)
                curveTo(23.707f, 6.6094f, 23.3906f, 6.9258f, 22.9805f, 6.9258f)
                close()
                moveTo(16.582f, 11.5195f)
                curveTo(16.1602f, 11.5195f, 15.8438f, 11.1914f, 15.8438f, 10.7812f)
                curveTo(15.8438f, 10.3828f, 16.1602f, 10.0781f, 16.582f, 10.0781f)
                lineTo(22.9805f, 10.0781f)
                curveTo(23.3906f, 10.0781f, 23.707f, 10.3828f, 23.707f, 10.7812f)
                curveTo(23.707f, 11.1914f, 23.3906f, 11.5195f, 22.9805f, 11.5195f)
                close()
                moveTo(16.582f, 16.1016f)
                curveTo(16.1602f, 16.1016f, 15.8438f, 15.7969f, 15.8438f, 15.3984f)
                curveTo(15.8438f, 14.9883f, 16.1602f, 14.6602f, 16.582f, 14.6602f)
                lineTo(22.9805f, 14.6602f)
                curveTo(23.3906f, 14.6602f, 23.707f, 14.9883f, 23.707f, 15.3984f)
                curveTo(23.707f, 15.7969f, 23.3906f, 16.1016f, 22.9805f, 16.1016f)
                close()
                moveTo(4.3711f, 16.1836f)
                curveTo(3.9844f, 16.1836f, 3.7969f, 15.9258f, 3.7969f, 15.5742f)
                curveTo(3.7969f, 14.4727f, 5.4375f, 11.6367f, 8.9414f, 11.6367f)
                curveTo(12.4453f, 11.6367f, 14.0977f, 14.4727f, 14.0977f, 15.5742f)
                curveTo(14.0977f, 15.9258f, 13.9102f, 16.1836f, 13.5234f, 16.1836f)
                close()
                moveTo(8.9414f, 10.8164f)
                curveTo(7.5234f, 10.8164f, 6.375f, 9.6211f, 6.375f, 8.0156f)
                curveTo(6.375f, 6.5156f, 7.5234f, 5.2734f, 8.9414f, 5.2734f)
                curveTo(10.3711f, 5.2734f, 11.5078f, 6.5156f, 11.5078f, 8.0156f)
                curveTo(11.5078f, 9.6211f, 10.3711f, 10.8281f, 8.9414f, 10.8164f)
                close()
            }
        }
        .build()
        return _personTextRectangle!!
    }

private var _personTextRectangle: ImageVector? = null
