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

public val CupertinoIcons.Outlined.CableConnector: ImageVector
    get() {
        if (_cableConnector != null) {
            return _cableConnector!!
        }
        _cableConnector = Builder(name = "CableConnector", defaultWidth = 7.62891.dp, defaultHeight
                = 26.7539.dp, viewportWidth = 7.62891f, viewportHeight = 26.7539f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8477f, 26.7422f)
                lineTo(4.8047f, 26.7422f)
                lineTo(4.8047f, 15.4922f)
                lineTo(2.8477f, 15.4922f)
                close()
                moveTo(1.4414f, 17.2734f)
                lineTo(6.1992f, 17.2734f)
                curveTo(7.2188f, 17.2734f, 7.6289f, 16.8633f, 7.6289f, 15.832f)
                lineTo(7.6289f, 6.8203f)
                curveTo(7.6289f, 5.8008f, 7.2188f, 5.3789f, 6.1992f, 5.3789f)
                lineTo(1.4414f, 5.3789f)
                curveTo(0.4102f, 5.3789f, 0.0f, 5.8008f, 0.0f, 6.8203f)
                lineTo(0.0f, 15.832f)
                curveTo(0.0f, 16.8633f, 0.4102f, 17.2734f, 1.4414f, 17.2734f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5352f, 4.0078f)
                lineTo(6.0938f, 4.0078f)
                lineTo(6.0938f, 1.4414f)
                curveTo(6.0938f, 0.4102f, 5.6719f, 0.0f, 4.6523f, 0.0f)
                lineTo(2.9883f, 0.0f)
                curveTo(1.957f, 0.0f, 1.5352f, 0.4102f, 1.5352f, 1.4414f)
                close()
            }
        }
        .build()
        return _cableConnector!!
    }

private var _cableConnector: ImageVector? = null
