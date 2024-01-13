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

public val CupertinoIcons.Filled.DeleteLeft: ImageVector
    get() {
        if (_deleteLeft != null) {
            return _deleteLeft!!
        }
        _deleteLeft = Builder(name = "DeleteLeft", defaultWidth = 25.3945.dp, defaultHeight =
                21.5977.dp, viewportWidth = 25.3945f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7148f, 21.5977f)
                curveTo(24.1641f, 21.5977f, 25.3945f, 20.3906f, 25.3945f, 17.9648f)
                lineTo(25.3945f, 3.6563f)
                curveTo(25.3945f, 1.2305f, 24.1641f, 0.0234f, 21.7148f, 0.0234f)
                lineTo(11.5312f, 0.0234f)
                curveTo(10.1602f, 0.0234f, 8.9766f, 0.375f, 8.0156f, 1.3945f)
                lineTo(1.1133f, 8.5664f)
                curveTo(0.3516f, 9.3516f, 0.0f, 10.0547f, 0.0f, 10.793f)
                curveTo(0.0f, 11.5195f, 0.3398f, 12.2344f, 1.1133f, 13.0195f)
                lineTo(8.0273f, 20.1562f)
                curveTo(9.0f, 21.1641f, 10.1719f, 21.5859f, 11.543f, 21.5859f)
                close()
                moveTo(10.9102f, 15.7266f)
                curveTo(10.3711f, 15.7266f, 9.9375f, 15.293f, 9.9375f, 14.7422f)
                curveTo(9.9375f, 14.4844f, 10.043f, 14.25f, 10.2188f, 14.0625f)
                lineTo(13.4766f, 10.8164f)
                lineTo(10.2188f, 7.5586f)
                curveTo(10.043f, 7.3711f, 9.9375f, 7.1367f, 9.9375f, 6.8789f)
                curveTo(9.9375f, 6.3398f, 10.3711f, 5.918f, 10.9102f, 5.918f)
                curveTo(11.1797f, 5.918f, 11.3906f, 6.0234f, 11.5781f, 6.1992f)
                lineTo(14.8477f, 9.457f)
                lineTo(18.1406f, 6.1875f)
                curveTo(18.3398f, 5.9883f, 18.5508f, 5.8945f, 18.8086f, 5.8945f)
                curveTo(19.3477f, 5.8945f, 19.7695f, 6.3281f, 19.7695f, 6.8555f)
                curveTo(19.7695f, 7.125f, 19.6992f, 7.3359f, 19.4883f, 7.5469f)
                lineTo(16.2305f, 10.8164f)
                lineTo(19.4766f, 14.0508f)
                curveTo(19.6758f, 14.2383f, 19.7578f, 14.4727f, 19.7578f, 14.7422f)
                curveTo(19.7578f, 15.293f, 19.3359f, 15.7266f, 18.7852f, 15.7266f)
                curveTo(18.5156f, 15.7266f, 18.2695f, 15.6211f, 18.0938f, 15.4453f)
                lineTo(14.8477f, 12.1758f)
                lineTo(11.6133f, 15.4453f)
                curveTo(11.4258f, 15.6211f, 11.1797f, 15.7266f, 10.9102f, 15.7266f)
                close()
            }
        }
        .build()
        return _deleteLeft!!
    }

private var _deleteLeft: ImageVector? = null
