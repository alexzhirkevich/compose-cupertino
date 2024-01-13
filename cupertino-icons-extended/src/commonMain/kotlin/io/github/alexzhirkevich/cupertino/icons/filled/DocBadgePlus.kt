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

public val CupertinoIcons.Filled.DocBadgePlus: ImageVector
    get() {
        if (_docBadgePlus != null) {
            return _docBadgePlus!!
        }
        _docBadgePlus = Builder(name = "DocBadgePlus", defaultWidth = 25.6641.dp, defaultHeight =
                29.543.dp, viewportWidth = 25.6641f, viewportHeight = 29.543f).apply {
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
                moveTo(5.9531f, 27.3164f)
                curveTo(5.5195f, 27.3164f, 5.2383f, 27.0234f, 5.2383f, 26.6016f)
                lineTo(5.2383f, 24.3047f)
                lineTo(2.9414f, 24.3047f)
                curveTo(2.5195f, 24.3047f, 2.2266f, 24.0234f, 2.2266f, 23.5898f)
                curveTo(2.2266f, 23.1562f, 2.5195f, 22.8633f, 2.9414f, 22.8633f)
                lineTo(5.2383f, 22.8633f)
                lineTo(5.2383f, 20.5781f)
                curveTo(5.2383f, 20.1562f, 5.5195f, 19.8633f, 5.9531f, 19.8633f)
                curveTo(6.3984f, 19.8633f, 6.6797f, 20.1562f, 6.6797f, 20.5781f)
                lineTo(6.6797f, 22.8633f)
                lineTo(8.9648f, 22.8633f)
                curveTo(9.3984f, 22.8633f, 9.6797f, 23.1562f, 9.6797f, 23.5898f)
                curveTo(9.6797f, 24.0234f, 9.3984f, 24.3047f, 8.9648f, 24.3047f)
                lineTo(6.6797f, 24.3047f)
                lineTo(6.6797f, 26.6016f)
                curveTo(6.6797f, 27.0234f, 6.3984f, 27.3164f, 5.9531f, 27.3164f)
                close()
            }
        }
        .build()
        return _docBadgePlus!!
    }

private var _docBadgePlus: ImageVector? = null
