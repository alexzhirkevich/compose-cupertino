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

public val CupertinoIcons.Outlined.CableConnectorHorizontal: ImageVector
    get() {
        if (_cableConnectorHorizontal != null) {
            return _cableConnectorHorizontal!!
        }
        _cableConnectorHorizontal = Builder(name = "CableConnectorHorizontal", defaultWidth =
                28.9922.dp, defaultHeight = 8.33203.dp, viewportWidth = 28.9922f, viewportHeight =
                8.33203f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.1328f)
                lineTo(12.1758f, 5.1328f)
                lineTo(12.1758f, 3.1875f)
                lineTo(0.0f, 3.1875f)
                close()
                moveTo(11.6836f, 8.332f)
                lineTo(21.7266f, 8.332f)
                curveTo(22.7578f, 8.332f, 23.168f, 7.9102f, 23.168f, 6.8906f)
                lineTo(23.168f, 1.4297f)
                curveTo(23.168f, 0.4102f, 22.7578f, 0.0f, 21.7266f, 0.0f)
                lineTo(11.6836f, 0.0f)
                curveTo(10.6523f, 0.0f, 10.2422f, 0.4102f, 10.2422f, 1.4297f)
                lineTo(10.2422f, 6.8906f)
                curveTo(10.2422f, 7.9102f, 10.6523f, 8.332f, 11.6836f, 8.332f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.5273f, 6.6563f)
                lineTo(27.5625f, 6.6563f)
                curveTo(28.582f, 6.6563f, 28.9922f, 6.2344f, 28.9922f, 5.2031f)
                lineTo(28.9922f, 3.1172f)
                curveTo(28.9922f, 2.0977f, 28.582f, 1.6758f, 27.5625f, 1.6758f)
                lineTo(24.5273f, 1.6758f)
                close()
            }
        }
        .build()
        return _cableConnectorHorizontal!!
    }

private var _cableConnectorHorizontal: ImageVector? = null
