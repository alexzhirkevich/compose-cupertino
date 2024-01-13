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

public val CupertinoIcons.Filled.InfoSquare: ImageVector
    get() {
        if (_infoSquare != null) {
            return _infoSquare!!
        }
        _infoSquare = Builder(name = "InfoSquare", defaultWidth = 21.5742.dp, defaultHeight =
                21.5977.dp, viewportWidth = 21.5742f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6836f, 17.5781f)
                curveTo(8.1797f, 17.5781f, 7.793f, 17.2148f, 7.793f, 16.7109f)
                curveTo(7.793f, 16.2422f, 8.1797f, 15.8555f, 8.6836f, 15.8555f)
                lineTo(10.1719f, 15.8555f)
                lineTo(10.1719f, 10.3477f)
                lineTo(8.8828f, 10.3477f)
                curveTo(8.3906f, 10.3477f, 8.0039f, 9.9844f, 8.0039f, 9.4805f)
                curveTo(8.0039f, 9.0117f, 8.3906f, 8.625f, 8.8828f, 8.625f)
                lineTo(11.1562f, 8.625f)
                curveTo(11.7773f, 8.625f, 12.1055f, 9.0703f, 12.1055f, 9.7266f)
                lineTo(12.1055f, 15.8555f)
                lineTo(13.5938f, 15.8555f)
                curveTo(14.0977f, 15.8555f, 14.4844f, 16.2422f, 14.4844f, 16.7109f)
                curveTo(14.4844f, 17.2148f, 14.0977f, 17.5781f, 13.5938f, 17.5781f)
                close()
                moveTo(10.6875f, 6.6328f)
                curveTo(9.8086f, 6.6328f, 9.1055f, 5.9297f, 9.1055f, 5.0391f)
                curveTo(9.1055f, 4.1484f, 9.8086f, 3.4453f, 10.6875f, 3.4453f)
                curveTo(11.5664f, 3.4453f, 12.2578f, 4.1484f, 12.2578f, 5.0391f)
                curveTo(12.2578f, 5.9297f, 11.5664f, 6.6328f, 10.6875f, 6.6328f)
                close()
                moveTo(3.6797f, 21.5977f)
                lineTo(17.8945f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3789f, 21.5742f, 17.9648f)
                lineTo(21.5742f, 3.6563f)
                curveTo(21.5742f, 1.2422f, 20.3555f, 0.0234f, 17.8945f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
            }
        }
        .build()
        return _infoSquare!!
    }

private var _infoSquare: ImageVector? = null
