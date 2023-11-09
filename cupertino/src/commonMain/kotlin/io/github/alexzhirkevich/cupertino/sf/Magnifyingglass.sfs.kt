/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.sf

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _magnifyingglass : ImageVector?=null

public val SFSymbols.Default.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingglass != null) {
            return _magnifyingglass!!
        }
        _magnifyingglass = Builder(name = "Magnifyingglass", defaultWidth = 19.082.dp, defaultHeight
                = 19.2676.dp, viewportWidth = 19.082f, viewportHeight = 19.2676f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(19.082f)
                verticalLineToRelative(19.2676f)
                horizontalLineToRelative(-19.082f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.85f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 7.793f)
                curveTo(0.0f, 12.0898f, 3.4961f, 15.5859f, 7.793f, 15.5859f)
                curveTo(9.4922f, 15.5859f, 11.0449f, 15.0391f, 12.3242f, 14.1211f)
                lineTo(17.1289f, 18.9355f)
                curveTo(17.3535f, 19.1602f, 17.6465f, 19.2676f, 17.959f, 19.2676f)
                curveTo(18.623f, 19.2676f, 19.082f, 18.7695f, 19.082f, 18.1152f)
                curveTo(19.082f, 17.8027f, 18.9648f, 17.5195f, 18.7598f, 17.3145f)
                lineTo(13.9844f, 12.5098f)
                curveTo(14.9902f, 11.2012f, 15.5859f, 9.5703f, 15.5859f, 7.793f)
                curveTo(15.5859f, 3.4961f, 12.0898f, 0.0f, 7.793f, 0.0f)
                curveTo(3.4961f, 0.0f, 0.0f, 3.4961f, 0.0f, 7.793f)
                close()
                moveTo(1.6699f, 7.793f)
                curveTo(1.6699f, 4.4141f, 4.4141f, 1.6699f, 7.793f, 1.6699f)
                curveTo(11.1719f, 1.6699f, 13.916f, 4.4141f, 13.916f, 7.793f)
                curveTo(13.916f, 11.1719f, 11.1719f, 13.916f, 7.793f, 13.916f)
                curveTo(4.4141f, 13.916f, 1.6699f, 11.1719f, 1.6699f, 7.793f)
                close()
            }
        }
        .build()
        return _magnifyingglass!!
    }