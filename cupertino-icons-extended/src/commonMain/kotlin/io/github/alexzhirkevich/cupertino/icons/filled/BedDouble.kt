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

public val CupertinoIcons.Filled.BedDouble: ImageVector
    get() {
        if (_bedDouble != null) {
            return _bedDouble!!
        }
        _bedDouble = Builder(name = "BedDouble", defaultWidth = 29.6953.dp, defaultHeight =
                19.793.dp, viewportWidth = 29.6953f, viewportHeight = 19.793f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.7734f)
                curveTo(0.0f, 19.3828f, 0.3867f, 19.7695f, 0.9961f, 19.7695f)
                lineTo(1.6992f, 19.7695f)
                curveTo(2.2969f, 19.7695f, 2.6953f, 19.3828f, 2.6953f, 18.7734f)
                lineTo(2.6953f, 17.0391f)
                curveTo(2.8242f, 17.0742f, 3.2109f, 17.0977f, 3.4922f, 17.0977f)
                lineTo(26.2031f, 17.0977f)
                curveTo(26.4844f, 17.0977f, 26.8711f, 17.0742f, 27.0f, 17.0391f)
                lineTo(27.0f, 18.7734f)
                curveTo(27.0f, 19.3828f, 27.3984f, 19.7695f, 27.9961f, 19.7695f)
                lineTo(28.6992f, 19.7695f)
                curveTo(29.3086f, 19.7695f, 29.6953f, 19.3828f, 29.6953f, 18.7734f)
                lineTo(29.6953f, 11.7891f)
                curveTo(29.6953f, 9.5508f, 28.4531f, 8.3203f, 26.2148f, 8.3203f)
                lineTo(3.4805f, 8.3203f)
                curveTo(1.2422f, 8.3203f, 0.0f, 9.5508f, 0.0f, 11.7891f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8125f, 6.6445f)
                lineTo(5.7891f, 6.6445f)
                lineTo(5.7891f, 4.957f)
                curveTo(5.7891f, 3.8672f, 6.3984f, 3.2695f, 7.5117f, 3.2695f)
                lineTo(11.8828f, 3.2695f)
                curveTo(12.9844f, 3.2695f, 13.5938f, 3.8672f, 13.5938f, 4.957f)
                lineTo(13.5938f, 6.6445f)
                lineTo(16.2539f, 6.6445f)
                lineTo(16.2539f, 4.957f)
                curveTo(16.2539f, 3.8672f, 16.8633f, 3.2695f, 18.0352f, 3.2695f)
                lineTo(22.1367f, 3.2695f)
                curveTo(23.3086f, 3.2695f, 23.918f, 3.8672f, 23.918f, 4.957f)
                lineTo(23.918f, 6.6445f)
                lineTo(26.9062f, 6.6445f)
                lineTo(26.9062f, 3.2813f)
                curveTo(26.9062f, 1.1133f, 25.7344f, 0.0f, 23.625f, 0.0f)
                lineTo(6.082f, 0.0f)
                curveTo(3.9727f, 0.0f, 2.8125f, 1.1133f, 2.8125f, 3.2813f)
                close()
            }
        }
        .build()
        return _bedDouble!!
    }

private var _bedDouble: ImageVector? = null
