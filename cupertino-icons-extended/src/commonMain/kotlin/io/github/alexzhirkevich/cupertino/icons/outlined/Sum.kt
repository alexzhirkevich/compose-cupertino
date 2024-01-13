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

public val CupertinoIcons.Outlined.Sum: ImageVector
    get() {
        if (_sum != null) {
            return _sum!!
        }
        _sum = Builder(name = "Sum", defaultWidth = 13.5469.dp, defaultHeight = 21.5742.dp,
                viewportWidth = 13.5469f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5703f, 21.5742f)
                lineTo(12.4805f, 21.5742f)
                curveTo(13.0781f, 21.5742f, 13.5352f, 21.1992f, 13.5352f, 20.5898f)
                curveTo(13.5352f, 19.9922f, 13.0781f, 19.5938f, 12.4805f, 19.5938f)
                lineTo(2.4727f, 19.5938f)
                lineTo(2.4727f, 19.4883f)
                lineTo(8.8125f, 11.8008f)
                curveTo(9.1172f, 11.4258f, 9.2813f, 11.0508f, 9.2813f, 10.6758f)
                curveTo(9.2813f, 10.2891f, 9.1172f, 9.9023f, 8.8008f, 9.5391f)
                lineTo(2.4844f, 2.0859f)
                lineTo(2.4844f, 1.9805f)
                lineTo(12.4805f, 1.9805f)
                curveTo(13.0898f, 1.9805f, 13.5469f, 1.582f, 13.5469f, 0.9844f)
                curveTo(13.5469f, 0.375f, 13.0898f, 0.0f, 12.4805f, 0.0f)
                lineTo(1.582f, 0.0f)
                curveTo(0.5742f, 0.0f, 0.0117f, 0.6914f, 0.0117f, 1.4648f)
                curveTo(0.0117f, 1.8633f, 0.1641f, 2.2852f, 0.4688f, 2.6367f)
                lineTo(7.2305f, 10.6055f)
                lineTo(7.2305f, 10.7344f)
                lineTo(0.4453f, 18.9375f)
                curveTo(0.1523f, 19.2891f, 0.0f, 19.7109f, 0.0f, 20.1094f)
                curveTo(0.0f, 20.8828f, 0.5625f, 21.5742f, 1.5703f, 21.5742f)
                close()
            }
        }
        .build()
        return _sum!!
    }

private var _sum: ImageVector? = null
