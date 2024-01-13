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

public val CupertinoIcons.Filled.XmarkApp: ImageVector
    get() {
        if (_xmarkApp != null) {
            return _xmarkApp!!
        }
        _xmarkApp = Builder(name = "XmarkApp", defaultWidth = 21.3281.dp, defaultHeight =
                21.3398.dp, viewportWidth = 21.3281f, viewportHeight = 21.3398f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.957f, 1.3828f)
                curveTo(18.7617f, 0.1875f, 17.0742f, 0.0f, 15.0703f, 0.0f)
                lineTo(6.2227f, 0.0f)
                curveTo(4.2539f, 0.0f, 2.5664f, 0.1875f, 1.3711f, 1.3828f)
                curveTo(0.1758f, 2.5781f, 0.0f, 4.2539f, 0.0f, 6.2109f)
                lineTo(0.0f, 15.0703f)
                curveTo(0.0f, 17.0742f, 0.1758f, 18.7383f, 1.3711f, 19.9336f)
                curveTo(2.5664f, 21.1289f, 4.2539f, 21.3164f, 6.2461f, 21.3164f)
                lineTo(15.0703f, 21.3164f)
                curveTo(17.0742f, 21.3164f, 18.7617f, 21.1289f, 19.957f, 19.9336f)
                curveTo(21.1523f, 18.7383f, 21.3281f, 17.0742f, 21.3281f, 15.0703f)
                lineTo(21.3281f, 6.2461f)
                curveTo(21.3281f, 4.2422f, 21.1523f, 2.5664f, 19.957f, 1.3828f)
                close()
                moveTo(6.7266f, 15.5859f)
                curveTo(6.1992f, 15.5859f, 5.7656f, 15.1523f, 5.7656f, 14.6133f)
                curveTo(5.7656f, 14.3555f, 5.8594f, 14.1094f, 6.0469f, 13.9336f)
                lineTo(9.3047f, 10.6758f)
                lineTo(6.0469f, 7.4297f)
                curveTo(5.8594f, 7.2422f, 5.7656f, 7.0078f, 5.7656f, 6.75f)
                curveTo(5.7656f, 6.1992f, 6.1992f, 5.7891f, 6.7266f, 5.7891f)
                curveTo(6.9961f, 5.7891f, 7.2188f, 5.8828f, 7.3945f, 6.0586f)
                lineTo(10.6641f, 9.3164f)
                lineTo(13.957f, 6.0469f)
                curveTo(14.1562f, 5.8477f, 14.3789f, 5.7656f, 14.6367f, 5.7656f)
                curveTo(15.1641f, 5.7656f, 15.5977f, 6.1875f, 15.5977f, 6.7266f)
                curveTo(15.5977f, 6.9961f, 15.5156f, 7.207f, 15.3164f, 7.418f)
                lineTo(12.0469f, 10.6758f)
                lineTo(15.3047f, 13.9219f)
                curveTo(15.4922f, 14.0977f, 15.5859f, 14.3438f, 15.5859f, 14.6133f)
                curveTo(15.5859f, 15.1523f, 15.1523f, 15.5859f, 14.6133f, 15.5859f)
                curveTo(14.3438f, 15.5859f, 14.0859f, 15.4922f, 13.9102f, 15.3047f)
                lineTo(10.6641f, 12.0469f)
                lineTo(7.4297f, 15.3047f)
                curveTo(7.2539f, 15.4922f, 6.9961f, 15.5859f, 6.7266f, 15.5859f)
                close()
            }
        }
        .build()
        return _xmarkApp!!
    }

private var _xmarkApp: ImageVector? = null
