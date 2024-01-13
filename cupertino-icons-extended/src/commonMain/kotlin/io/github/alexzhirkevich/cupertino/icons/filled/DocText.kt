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

public val CupertinoIcons.Filled.DocText: ImageVector
    get() {
        if (_docText != null) {
            return _docText!!
        }
        _docText = Builder(name = "DocText", defaultWidth = 19.7109.dp, defaultHeight = 25.1367.dp,
                viewportWidth = 19.7109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(19.7109f)
                verticalLineToRelative(25.1367f)
                horizontalLineToRelative(-19.7109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2617f, 15.9141f)
                curveTo(4.8047f, 15.9141f, 4.4648f, 15.5859f, 4.4648f, 15.1523f)
                curveTo(4.4648f, 14.7188f, 4.8047f, 14.3789f, 5.2617f, 14.3789f)
                lineTo(14.4844f, 14.3789f)
                curveTo(14.9297f, 14.3789f, 15.2695f, 14.7188f, 15.2695f, 15.1523f)
                curveTo(15.2695f, 15.5859f, 14.9297f, 15.9141f, 14.4844f, 15.9141f)
                close()
                moveTo(5.2617f, 20.3555f)
                curveTo(4.8047f, 20.3555f, 4.4648f, 20.0273f, 4.4648f, 19.5938f)
                curveTo(4.4648f, 19.1602f, 4.8047f, 18.8203f, 5.2617f, 18.8203f)
                lineTo(14.4844f, 18.8203f)
                curveTo(14.9297f, 18.8203f, 15.2695f, 19.1602f, 15.2695f, 19.5938f)
                curveTo(15.2695f, 20.0273f, 14.9297f, 20.3555f, 14.4844f, 20.3555f)
                close()
                moveTo(3.6328f, 25.125f)
                lineTo(16.0781f, 25.125f)
                curveTo(18.5039f, 25.125f, 19.7109f, 23.8945f, 19.7109f, 21.457f)
                lineTo(19.7109f, 10.8164f)
                lineTo(11.2266f, 10.8164f)
                curveTo(9.7266f, 10.8164f, 9.0117f, 10.1016f, 9.0117f, 8.6016f)
                lineTo(9.0117f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.2188f, 0.0f, 0.0f, 1.2422f, 0.0f, 3.6797f)
                lineTo(0.0f, 21.457f)
                curveTo(0.0f, 23.9062f, 1.207f, 25.125f, 3.6328f, 25.125f)
                close()
                moveTo(11.2617f, 9.2109f)
                lineTo(19.5703f, 9.2109f)
                curveTo(19.5f, 8.7305f, 19.1602f, 8.2617f, 18.5977f, 7.6875f)
                lineTo(12.1406f, 1.1133f)
                curveTo(11.5898f, 0.5508f, 11.1094f, 0.2109f, 10.6172f, 0.1289f)
                lineTo(10.6172f, 8.5781f)
                curveTo(10.6172f, 9.0f, 10.8281f, 9.2109f, 11.2617f, 9.2109f)
                close()
            }
        }
        .build()
        return _docText!!
    }

private var _docText: ImageVector? = null
