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

public val CupertinoIcons.Filled.PersonIcloud: ImageVector
    get() {
        if (_personIcloud != null) {
            return _personIcloud!!
        }
        _personIcloud = Builder(name = "PersonIcloud", defaultWidth = 29.4609.dp, defaultHeight =
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
                moveTo(8.9531f, 18.293f)
                curveTo(9.7969f, 16.3945f, 12.0117f, 14.2852f, 15.5508f, 14.2852f)
                curveTo(19.0898f, 14.2852f, 21.3047f, 16.3945f, 22.1484f, 18.293f)
                close()
                moveTo(15.5508f, 12.832f)
                curveTo(13.7812f, 12.8086f, 12.375f, 11.2266f, 12.3633f, 9.3398f)
                curveTo(12.3633f, 7.4766f, 13.7812f, 5.9414f, 15.5508f, 5.9414f)
                curveTo(17.3086f, 5.9414f, 18.7383f, 7.4766f, 18.7383f, 9.3398f)
                curveTo(18.7383f, 11.2266f, 17.3086f, 12.8555f, 15.5508f, 12.832f)
                close()
            }
        }
        .build()
        return _personIcloud!!
    }

private var _personIcloud: ImageVector? = null
