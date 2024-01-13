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

public val CupertinoIcons.Filled.KeyIcloud: ImageVector
    get() {
        if (_keyIcloud != null) {
            return _keyIcloud!!
        }
        _keyIcloud = Builder(name = "KeyIcloud", defaultWidth = 29.4609.dp, defaultHeight =
                22.2773.dp, viewportWidth = 29.4609f, viewportHeight = 22.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.1562f, 20.3672f)
                curveTo(26.6953f, 20.3672f, 29.4609f, 17.7773f, 29.4609f, 14.5547f)
                curveTo(29.4609f, 12.0938f, 28.043f, 9.9609f, 25.7578f, 9.0f)
                curveTo(25.7812f, 3.7734f, 22.0195f, 0.0f, 17.2266f, 0.0f)
                curveTo(14.0508f, 0.0f, 11.7891f, 1.6992f, 10.3828f, 3.75f)
                curveTo(7.5f, 2.9063f, 4.3594f, 5.0977f, 4.3008f, 8.3789f)
                curveTo(1.6523f, 8.8008f, 0.0f, 11.168f, 0.0f, 14.0273f)
                curveTo(0.0f, 17.4727f, 3.0117f, 20.3672f, 7.0195f, 20.3672f)
                close()
                moveTo(8.0859f, 11.543f)
                curveTo(8.0859f, 9.5391f, 9.6914f, 7.9453f, 11.6836f, 7.9453f)
                curveTo(13.1836f, 7.9453f, 14.5195f, 8.8359f, 15.0586f, 10.2539f)
                lineTo(20.625f, 10.2539f)
                curveTo(20.7539f, 10.2539f, 20.8594f, 10.2891f, 20.9883f, 10.4062f)
                lineTo(21.9258f, 11.3438f)
                curveTo(22.0195f, 11.4492f, 22.0312f, 11.625f, 21.9258f, 11.7422f)
                lineTo(20.1445f, 13.5234f)
                curveTo(20.0273f, 13.6523f, 19.8516f, 13.6523f, 19.7344f, 13.5234f)
                lineTo(18.6328f, 12.4102f)
                lineTo(17.1211f, 13.9453f)
                curveTo(17.0273f, 14.0625f, 16.8516f, 14.0508f, 16.7227f, 13.9219f)
                lineTo(15.1992f, 12.4219f)
                curveTo(14.5078f, 14.168f, 13.2188f, 15.1289f, 11.6836f, 15.1289f)
                curveTo(9.6914f, 15.1289f, 8.0859f, 13.5352f, 8.0859f, 11.543f)
                close()
                moveTo(9.8086f, 11.5312f)
                curveTo(9.8086f, 12.1406f, 10.3125f, 12.6328f, 10.9219f, 12.6328f)
                curveTo(11.5547f, 12.6328f, 12.0352f, 12.1406f, 12.0352f, 11.5312f)
                curveTo(12.0352f, 10.9219f, 11.5547f, 10.4297f, 10.9219f, 10.4297f)
                curveTo(10.3125f, 10.4297f, 9.8086f, 10.9102f, 9.8086f, 11.5312f)
                close()
            }
        }
        .build()
        return _keyIcloud!!
    }

private var _keyIcloud: ImageVector? = null
