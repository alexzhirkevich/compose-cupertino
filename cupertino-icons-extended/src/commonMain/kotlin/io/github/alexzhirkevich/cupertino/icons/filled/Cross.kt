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

public val CupertinoIcons.Filled.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 24.3516.dp, defaultHeight = 24.3633.dp,
                viewportWidth = 24.3516f, viewportHeight = 24.3633f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.5078f)
                curveTo(0.0f, 15.8555f, 0.9258f, 16.7578f, 2.2852f, 16.7578f)
                lineTo(7.582f, 16.7578f)
                lineTo(7.582f, 22.0664f)
                curveTo(7.582f, 23.4258f, 8.4844f, 24.3398f, 9.832f, 24.3398f)
                lineTo(14.5195f, 24.3398f)
                curveTo(15.8672f, 24.3398f, 16.7695f, 23.4258f, 16.7695f, 22.0664f)
                lineTo(16.7695f, 16.7578f)
                lineTo(22.0781f, 16.7578f)
                curveTo(23.4375f, 16.7578f, 24.3516f, 15.8555f, 24.3516f, 14.5078f)
                lineTo(24.3516f, 9.8203f)
                curveTo(24.3516f, 8.4727f, 23.4375f, 7.5703f, 22.0781f, 7.5703f)
                lineTo(16.7695f, 7.5703f)
                lineTo(16.7695f, 2.2734f)
                curveTo(16.7695f, 0.9141f, 15.8672f, 0.0f, 14.5195f, 0.0f)
                lineTo(9.832f, 0.0f)
                curveTo(8.4844f, 0.0f, 7.582f, 0.9141f, 7.582f, 2.2734f)
                lineTo(7.582f, 7.5703f)
                lineTo(2.2734f, 7.5703f)
                curveTo(0.9141f, 7.5703f, 0.0f, 8.4727f, 0.0f, 9.8203f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
