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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.ArrowTurnRightUp: ImageVector
    get() {
        if (_arrowTurnRightUp != null) {
            return _arrowTurnRightUp!!
        }
        _arrowTurnRightUp = Builder(name = "ArrowTurnRightUp", defaultWidth = 18.293.dp,
                defaultHeight = 22.1367.dp, viewportWidth = 18.293f, viewportHeight =
                22.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4727f, 22.1367f)
                curveTo(7.8984f, 22.1367f, 10.4531f, 19.9805f, 10.4531f, 14.5312f)
                lineTo(10.4531f, 6.4102f)
                lineTo(10.3594f, 3.2344f)
                lineTo(12.6914f, 5.8008f)
                lineTo(16.5352f, 9.6445f)
                curveTo(16.7227f, 9.832f, 17.0039f, 9.9258f, 17.2734f, 9.9258f)
                curveTo(17.8594f, 9.9258f, 18.293f, 9.4805f, 18.293f, 8.9063f)
                curveTo(18.293f, 8.625f, 18.1875f, 8.3789f, 17.9648f, 8.1445f)
                lineTo(10.1836f, 0.3516f)
                curveTo(9.9609f, 0.1172f, 9.6914f, 0.0f, 9.3984f, 0.0f)
                curveTo(9.1172f, 0.0f, 8.8477f, 0.1172f, 8.625f, 0.3516f)
                lineTo(0.8438f, 8.1445f)
                curveTo(0.6211f, 8.3789f, 0.5156f, 8.625f, 0.5156f, 8.9063f)
                curveTo(0.5156f, 9.4805f, 0.9492f, 9.9258f, 1.5234f, 9.9258f)
                curveTo(1.8047f, 9.9258f, 2.0859f, 9.832f, 2.2734f, 9.6445f)
                lineTo(6.1055f, 5.8008f)
                lineTo(8.4609f, 3.2227f)
                lineTo(8.3555f, 6.4102f)
                lineTo(8.3672f, 14.4258f)
                curveTo(8.3789f, 18.668f, 6.5391f, 20.0859f, 2.3672f, 20.0859f)
                curveTo(1.8281f, 20.0859f, 1.4414f, 20.0625f, 1.043f, 20.0625f)
                curveTo(0.4336f, 20.0625f, 0.0f, 20.4492f, 0.0f, 21.0586f)
                curveTo(0.0f, 21.6562f, 0.4102f, 21.9492f, 0.8789f, 22.0547f)
                curveTo(1.2305f, 22.125f, 1.8047f, 22.1367f, 2.4727f, 22.1367f)
                close()
            }
        }
        .build()
        return _arrowTurnRightUp!!
    }

private var _arrowTurnRightUp: ImageVector? = null
