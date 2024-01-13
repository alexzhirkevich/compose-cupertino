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

public val CupertinoIcons.Filled.DocBadgeArrowUp: ImageVector
    get() {
        if (_docBadgeArrowUp != null) {
            return _docBadgeArrowUp!!
        }
        _docBadgeArrowUp = Builder(name = "DocBadgeArrowUp", defaultWidth = 25.6641.dp,
                defaultHeight = 29.543.dp, viewportWidth = 25.6641f, viewportHeight =
                29.543f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9531f, 16.0195f)
                curveTo(10.1016f, 16.0195f, 13.5117f, 19.4297f, 13.5117f, 23.5898f)
                curveTo(13.5117f, 24.9375f, 13.1484f, 26.2266f, 12.4922f, 27.3281f)
                lineTo(22.0312f, 27.3281f)
                curveTo(24.457f, 27.3281f, 25.6641f, 26.0977f, 25.6641f, 23.6602f)
                lineTo(25.6641f, 13.0195f)
                lineTo(17.1797f, 13.0195f)
                curveTo(15.6797f, 13.0195f, 14.9648f, 12.3047f, 14.9648f, 10.8047f)
                lineTo(14.9648f, 2.2031f)
                lineTo(9.5859f, 2.2031f)
                curveTo(7.1719f, 2.2031f, 5.9531f, 3.4453f, 5.9531f, 5.8828f)
                close()
                moveTo(17.2148f, 11.4141f)
                lineTo(25.5234f, 11.4141f)
                curveTo(25.4531f, 10.9336f, 25.1133f, 10.4648f, 24.5508f, 9.8906f)
                lineTo(18.0938f, 3.3164f)
                curveTo(17.543f, 2.7539f, 17.0625f, 2.4141f, 16.5703f, 2.332f)
                lineTo(16.5703f, 10.7812f)
                curveTo(16.5703f, 11.2031f, 16.7812f, 11.4141f, 17.2148f, 11.4141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9531f, 29.543f)
                curveTo(9.1875f, 29.543f, 11.9062f, 26.8359f, 11.9062f, 23.5898f)
                curveTo(11.9062f, 20.3203f, 9.2227f, 17.6367f, 5.9531f, 17.6367f)
                curveTo(2.6953f, 17.6367f, 0.0f, 20.3203f, 0.0f, 23.5898f)
                curveTo(0.0f, 26.8594f, 2.6953f, 29.543f, 5.9531f, 29.543f)
                close()
                moveTo(5.9766f, 19.8047f)
                curveTo(6.1758f, 19.8047f, 6.3281f, 19.8984f, 6.5273f, 20.0742f)
                lineTo(9.5625f, 22.8984f)
                curveTo(9.7383f, 23.0508f, 9.8086f, 23.2266f, 9.8086f, 23.4492f)
                curveTo(9.8086f, 23.8477f, 9.5039f, 24.1641f, 9.1055f, 24.1406f)
                curveTo(8.9063f, 24.1289f, 8.7188f, 24.0469f, 8.5664f, 23.9062f)
                lineTo(7.4531f, 22.7812f)
                lineTo(6.6914f, 21.9844f)
                lineTo(6.75f, 23.4844f)
                lineTo(6.75f, 26.5898f)
                curveTo(6.75f, 27.0f, 6.3984f, 27.3398f, 5.9766f, 27.3398f)
                curveTo(5.5547f, 27.3398f, 5.1914f, 27.0f, 5.1914f, 26.5898f)
                lineTo(5.1914f, 23.4844f)
                lineTo(5.2617f, 21.9844f)
                lineTo(4.4883f, 22.7812f)
                lineTo(3.375f, 23.9062f)
                curveTo(3.2344f, 24.0469f, 3.0352f, 24.1523f, 2.8359f, 24.1406f)
                curveTo(2.4258f, 24.1406f, 2.0977f, 23.8477f, 2.1211f, 23.4492f)
                curveTo(2.1328f, 23.2266f, 2.2031f, 23.0508f, 2.3789f, 22.8984f)
                lineTo(5.4023f, 20.0742f)
                curveTo(5.6133f, 19.8867f, 5.7773f, 19.8047f, 5.9766f, 19.8047f)
                close()
            }
        }
        .build()
        return _docBadgeArrowUp!!
    }

private var _docBadgeArrowUp: ImageVector? = null
