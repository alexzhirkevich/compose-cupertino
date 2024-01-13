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

public val CupertinoIcons.Outlined.Safari: ImageVector
    get() {
        if (_safari != null) {
            return _safari!!
        }
        _safari = Builder(name = "Safari", defaultWidth = 23.9062.dp, defaultHeight = 23.918.dp,
                viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.043f, 17.8594f)
                lineTo(13.7695f, 14.5781f)
                curveTo(14.1445f, 14.3906f, 14.4023f, 14.1328f, 14.5898f, 13.7695f)
                lineTo(17.8594f, 7.0547f)
                curveTo(18.2344f, 6.2578f, 17.6602f, 5.6367f, 16.8398f, 6.0469f)
                lineTo(10.1367f, 9.3164f)
                curveTo(9.7734f, 9.4805f, 9.5273f, 9.7266f, 9.3281f, 10.125f)
                lineTo(6.0352f, 16.8516f)
                curveTo(5.6602f, 17.625f, 6.2695f, 18.2344f, 7.043f, 17.8594f)
                close()
                moveTo(11.9531f, 13.3945f)
                curveTo(11.1562f, 13.3945f, 10.5234f, 12.75f, 10.5234f, 11.9648f)
                curveTo(10.5234f, 11.168f, 11.1562f, 10.5234f, 11.9531f, 10.5234f)
                curveTo(12.75f, 10.5234f, 13.3945f, 11.168f, 13.3945f, 11.9648f)
                curveTo(13.3945f, 12.75f, 12.75f, 13.3945f, 11.9531f, 13.3945f)
                close()
            }
        }
        .build()
        return _safari!!
    }

private var _safari: ImageVector? = null
