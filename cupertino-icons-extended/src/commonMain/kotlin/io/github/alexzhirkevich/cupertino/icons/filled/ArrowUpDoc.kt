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

public val CupertinoIcons.Filled.ArrowUpDoc: ImageVector
    get() {
        if (_arrowUpDoc != null) {
            return _arrowUpDoc!!
        }
        _arrowUpDoc = Builder(name = "ArrowUpDoc", defaultWidth = 19.7109.dp, defaultHeight =
                25.1367.dp, viewportWidth = 19.7109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(9.8555f, 22.0781f)
                curveTo(9.3867f, 22.0781f, 9.0f, 21.7031f, 9.0f, 21.2461f)
                lineTo(9.0f, 17.0977f)
                lineTo(9.0703f, 15.2461f)
                lineTo(8.0859f, 16.2539f)
                lineTo(7.0664f, 17.2969f)
                curveTo(6.9023f, 17.4609f, 6.668f, 17.5547f, 6.457f, 17.5547f)
                curveTo(5.9883f, 17.5547f, 5.6602f, 17.2266f, 5.6602f, 16.7812f)
                curveTo(5.6602f, 16.5234f, 5.7656f, 16.3242f, 5.9414f, 16.1719f)
                lineTo(9.2227f, 13.1484f)
                curveTo(9.457f, 12.9375f, 9.6445f, 12.8555f, 9.8555f, 12.8555f)
                curveTo(10.0664f, 12.8555f, 10.2539f, 12.9375f, 10.4883f, 13.1484f)
                lineTo(13.7695f, 16.1719f)
                curveTo(13.9453f, 16.3242f, 14.0508f, 16.5234f, 14.0508f, 16.7812f)
                curveTo(14.0508f, 17.2266f, 13.7109f, 17.5547f, 13.2539f, 17.5547f)
                curveTo(13.0312f, 17.5547f, 12.8086f, 17.4609f, 12.6445f, 17.2969f)
                lineTo(11.625f, 16.2539f)
                lineTo(10.6406f, 15.2461f)
                lineTo(10.7227f, 17.0977f)
                lineTo(10.7227f, 21.2461f)
                curveTo(10.7227f, 21.7031f, 10.3242f, 22.0781f, 9.8555f, 22.0781f)
                close()
            }
        }
        .build()
        return _arrowUpDoc!!
    }

private var _arrowUpDoc: ImageVector? = null
