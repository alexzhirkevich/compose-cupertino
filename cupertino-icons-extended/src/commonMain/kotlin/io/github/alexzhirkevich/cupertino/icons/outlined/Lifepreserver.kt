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

public val CupertinoIcons.Outlined.Lifepreserver: ImageVector
    get() {
        if (_lifepreserver != null) {
            return _lifepreserver!!
        }
        _lifepreserver = Builder(name = "Lifepreserver", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 18.2227f)
                curveTo(15.4102f, 18.2227f, 18.2227f, 15.4102f, 18.2227f, 11.9531f)
                curveTo(18.2227f, 8.4961f, 15.4102f, 5.6836f, 11.9531f, 5.6836f)
                curveTo(8.4961f, 5.6836f, 5.6836f, 8.4961f, 5.6836f, 11.9531f)
                curveTo(5.6836f, 15.4102f, 8.4961f, 18.2227f, 11.9531f, 18.2227f)
                close()
                moveTo(11.9531f, 16.2422f)
                curveTo(9.5859f, 16.2422f, 7.6641f, 14.3203f, 7.6641f, 11.9531f)
                curveTo(7.6641f, 9.5859f, 9.5859f, 7.6641f, 11.9531f, 7.6641f)
                curveTo(14.3203f, 7.6641f, 16.2422f, 9.5859f, 16.2422f, 11.9531f)
                curveTo(16.2422f, 14.3203f, 14.3203f, 16.2422f, 11.9531f, 16.2422f)
                close()
                moveTo(2.6133f, 18.8555f)
                lineTo(5.1328f, 21.375f)
                lineTo(9.7852f, 16.7227f)
                lineTo(7.2656f, 14.2031f)
                close()
                moveTo(2.4961f, 5.0391f)
                lineTo(7.2656f, 9.8086f)
                lineTo(9.7852f, 7.2891f)
                lineTo(5.0156f, 2.5195f)
                close()
                moveTo(21.4336f, 5.0625f)
                lineTo(18.9141f, 2.543f)
                lineTo(14.168f, 7.2891f)
                lineTo(16.6875f, 9.8086f)
                close()
                moveTo(21.3281f, 18.832f)
                lineTo(16.6992f, 14.2031f)
                lineTo(14.168f, 16.7344f)
                lineTo(18.7969f, 21.3633f)
                close()
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
        }
        .build()
        return _lifepreserver!!
    }

private var _lifepreserver: ImageVector? = null
