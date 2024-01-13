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

public val CupertinoIcons.Outlined.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 32.0273.dp, defaultHeight = 20.0977.dp,
                viewportWidth = 32.0273f, viewportHeight = 20.0977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0195f, 20.0977f)
                curveTo(25.4883f, 20.0977f, 32.0273f, 12.4453f, 32.0273f, 10.0547f)
                curveTo(32.0273f, 7.6523f, 25.4766f, 0.0117f, 16.0195f, 0.0117f)
                curveTo(6.6797f, 0.0117f, 0.0f, 7.6523f, 0.0f, 10.0547f)
                curveTo(0.0f, 12.4453f, 6.668f, 20.0977f, 16.0195f, 20.0977f)
                close()
                moveTo(16.0195f, 18.2461f)
                curveTo(8.2969f, 18.2461f, 2.0508f, 11.707f, 2.0508f, 10.0547f)
                curveTo(2.0508f, 8.6602f, 8.2969f, 1.8633f, 16.0195f, 1.8633f)
                curveTo(23.707f, 1.8633f, 29.9766f, 8.6602f, 29.9766f, 10.0547f)
                curveTo(29.9766f, 11.707f, 23.707f, 18.2461f, 16.0195f, 18.2461f)
                close()
                moveTo(16.0195f, 16.6172f)
                curveTo(19.6641f, 16.6172f, 22.5938f, 13.6289f, 22.5938f, 10.0547f)
                curveTo(22.5938f, 6.3867f, 19.6641f, 3.4922f, 16.0195f, 3.4922f)
                curveTo(12.3516f, 3.4922f, 9.4102f, 6.3867f, 9.4219f, 10.0547f)
                curveTo(9.4453f, 13.6289f, 12.3516f, 16.6172f, 16.0195f, 16.6172f)
                close()
                moveTo(16.0195f, 12.2344f)
                curveTo(14.8008f, 12.2344f, 13.8164f, 11.25f, 13.8164f, 10.0547f)
                curveTo(13.8164f, 8.8477f, 14.8008f, 7.875f, 16.0195f, 7.875f)
                curveTo(17.2266f, 7.875f, 18.2109f, 8.8477f, 18.2109f, 10.0547f)
                curveTo(18.2109f, 11.25f, 17.2266f, 12.2344f, 16.0195f, 12.2344f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
