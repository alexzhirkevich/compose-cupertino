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

public val CupertinoIcons.Outlined.Grid: ImageVector
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid = Builder(name = "Grid", defaultWidth = 22.6641.dp, defaultHeight = 22.2773.dp,
                viewportWidth = 22.6641f, viewportHeight = 22.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0078f, 22.207f)
                curveTo(7.5469f, 22.207f, 7.8867f, 21.8555f, 7.8867f, 21.2812f)
                lineTo(7.8867f, 0.9375f)
                curveTo(7.8867f, 0.3633f, 7.5469f, 0.0f, 7.0078f, 0.0f)
                curveTo(6.4453f, 0.0f, 6.1172f, 0.3633f, 6.1172f, 0.9375f)
                lineTo(6.1172f, 21.2812f)
                curveTo(6.1172f, 21.8555f, 6.4453f, 22.207f, 7.0078f, 22.207f)
                close()
                moveTo(15.5977f, 22.207f)
                curveTo(16.1367f, 22.207f, 16.4766f, 21.8555f, 16.4766f, 21.2812f)
                lineTo(16.4766f, 0.9375f)
                curveTo(16.4766f, 0.3633f, 16.1367f, 0.0f, 15.5977f, 0.0f)
                curveTo(15.0352f, 0.0f, 14.707f, 0.3633f, 14.707f, 0.9375f)
                lineTo(14.707f, 21.2812f)
                curveTo(14.707f, 21.8555f, 15.0352f, 22.207f, 15.5977f, 22.207f)
                close()
                moveTo(0.9375f, 16.1953f)
                lineTo(21.7266f, 16.1953f)
                curveTo(22.3125f, 16.1953f, 22.6641f, 15.8555f, 22.6641f, 15.3047f)
                curveTo(22.6641f, 14.7539f, 22.3125f, 14.4258f, 21.7266f, 14.4258f)
                lineTo(0.9375f, 14.4258f)
                curveTo(0.3516f, 14.4258f, 0.0f, 14.7539f, 0.0f, 15.3047f)
                curveTo(0.0f, 15.8555f, 0.3516f, 16.1953f, 0.9375f, 16.1953f)
                close()
                moveTo(0.9375f, 7.8281f)
                lineTo(21.7266f, 7.8281f)
                curveTo(22.3125f, 7.8281f, 22.6641f, 7.4883f, 22.6641f, 6.9492f)
                curveTo(22.6641f, 6.3984f, 22.3125f, 6.0586f, 21.7266f, 6.0586f)
                lineTo(0.9375f, 6.0586f)
                curveTo(0.3516f, 6.0586f, 0.0f, 6.3984f, 0.0f, 6.9492f)
                curveTo(0.0f, 7.4883f, 0.3516f, 7.8281f, 0.9375f, 7.8281f)
                close()
            }
        }
        .build()
        return _grid!!
    }

private var _grid: ImageVector? = null
