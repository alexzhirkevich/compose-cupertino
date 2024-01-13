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

public val CupertinoIcons.Outlined.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 16.5117.dp, defaultHeight = 26.3838.dp,
                viewportWidth = 16.5117f, viewportHeight = 26.3838f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5547f, 25.7017f)
                lineTo(16.207f, 12.0025f)
                curveTo(16.4062f, 11.7564f, 16.5117f, 11.522f, 16.5117f, 11.2525f)
                curveTo(16.5117f, 10.8071f, 16.1602f, 10.4673f, 15.668f, 10.4673f)
                lineTo(9.0469f, 10.4673f)
                lineTo(12.5391f, 1.3501f)
                curveTo(13.0078f, 0.1431f, 11.7188f, -0.5132f, 10.957f, 0.4946f)
                lineTo(0.3047f, 14.1821f)
                curveTo(0.1055f, 14.44f, 0.0f, 14.6743f, 0.0f, 14.9321f)
                curveTo(0.0f, 15.3892f, 0.3516f, 15.729f, 0.8438f, 15.729f)
                lineTo(7.4648f, 15.729f)
                lineTo(3.9727f, 24.8345f)
                curveTo(3.5039f, 26.0415f, 4.793f, 26.6978f, 5.5547f, 25.7017f)
                close()
                moveTo(6.2461f, 22.5493f)
                lineTo(10.1719f, 13.9829f)
                lineTo(2.9297f, 13.9829f)
                lineTo(10.582f, 3.8228f)
                lineTo(10.2539f, 3.647f)
                lineTo(6.3398f, 12.2134f)
                lineTo(13.5703f, 12.2134f)
                lineTo(5.918f, 22.3735f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
