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

public val CupertinoIcons.Filled.Safari: ImageVector
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
                moveTo(6.9141f, 18.0586f)
                curveTo(6.1055f, 18.4453f, 5.4844f, 17.8125f, 5.8594f, 17.0156f)
                lineTo(9.2578f, 10.0781f)
                curveTo(9.457f, 9.668f, 9.7148f, 9.4102f, 10.0898f, 9.2344f)
                lineTo(17.0039f, 5.8594f)
                curveTo(17.8594f, 5.4492f, 18.457f, 6.082f, 18.0586f, 6.9023f)
                lineTo(14.6836f, 13.8281f)
                curveTo(14.4961f, 14.2031f, 14.2266f, 14.4844f, 13.8398f, 14.6602f)
                close()
                moveTo(11.9648f, 13.4531f)
                curveTo(12.7852f, 13.4531f, 13.4531f, 12.7852f, 13.4531f, 11.9648f)
                curveTo(13.4531f, 11.1445f, 12.7852f, 10.4883f, 11.9648f, 10.4883f)
                curveTo(11.1562f, 10.4883f, 10.4883f, 11.1445f, 10.4883f, 11.9648f)
                curveTo(10.4883f, 12.7852f, 11.1562f, 13.4531f, 11.9648f, 13.4531f)
                close()
            }
        }
        .build()
        return _safari!!
    }

private var _safari: ImageVector? = null
