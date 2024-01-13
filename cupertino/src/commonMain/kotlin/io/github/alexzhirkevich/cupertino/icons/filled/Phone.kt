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

public val CupertinoIcons.Filled.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 21.7266.dp, defaultHeight = 22.6055.dp,
                viewportWidth = 21.7266f, viewportHeight = 22.6055f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9531f, 16.6055f)
                curveTo(9.3398f, 19.9922f, 13.4531f, 22.6055f, 16.8164f, 22.6055f)
                curveTo(18.3281f, 22.6055f, 19.6523f, 22.0781f, 20.7188f, 20.9062f)
                curveTo(21.3398f, 20.2148f, 21.7266f, 19.4062f, 21.7266f, 18.6094f)
                curveTo(21.7266f, 18.0234f, 21.5039f, 17.4609f, 20.9531f, 17.0625f)
                lineTo(17.3555f, 14.5078f)
                curveTo(16.8047f, 14.1328f, 16.3477f, 13.9453f, 15.9258f, 13.9453f)
                curveTo(15.3984f, 13.9453f, 14.918f, 14.25f, 14.3789f, 14.7773f)
                lineTo(13.5469f, 15.5977f)
                curveTo(13.418f, 15.7266f, 13.2539f, 15.7852f, 13.1016f, 15.7852f)
                curveTo(12.9258f, 15.7852f, 12.75f, 15.7148f, 12.6328f, 15.6562f)
                curveTo(11.9062f, 15.2695f, 10.6641f, 14.2031f, 9.5039f, 13.0547f)
                curveTo(8.3555f, 11.9062f, 7.2891f, 10.6641f, 6.9141f, 9.9375f)
                curveTo(6.8555f, 9.8086f, 6.7852f, 9.6445f, 6.7852f, 9.4688f)
                curveTo(6.7852f, 9.3164f, 6.832f, 9.1641f, 6.9609f, 9.0352f)
                lineTo(7.793f, 8.1797f)
                curveTo(8.3086f, 7.6406f, 8.625f, 7.1719f, 8.625f, 6.6328f)
                curveTo(8.625f, 6.2109f, 8.4258f, 5.7539f, 8.0391f, 5.2031f)
                lineTo(5.5195f, 1.6523f)
                curveTo(5.1094f, 1.0898f, 4.5352f, 0.8438f, 3.9023f, 0.8438f)
                curveTo(3.1289f, 0.8438f, 2.332f, 1.1953f, 1.6406f, 1.8633f)
                curveTo(0.5039f, 2.9531f, 0.0f, 4.3008f, 0.0f, 5.7891f)
                curveTo(0.0f, 9.1523f, 2.5664f, 13.2305f, 5.9531f, 16.6055f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
