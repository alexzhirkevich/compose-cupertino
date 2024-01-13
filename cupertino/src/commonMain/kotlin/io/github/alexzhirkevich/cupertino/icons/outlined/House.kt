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

public val CupertinoIcons.Outlined.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 27.9727.dp, defaultHeight = 26.5957.dp,
                viewportWidth = 27.9727f, viewportHeight = 26.5957f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6055f, 23.4053f)
                lineTo(17.3672f, 23.4053f)
                lineTo(17.3672f, 14.874f)
                curveTo(17.3672f, 14.335f, 17.0156f, 13.9834f, 16.4766f, 13.9834f)
                lineTo(11.5078f, 13.9834f)
                curveTo(10.957f, 13.9834f, 10.6055f, 14.335f, 10.6055f, 14.874f)
                close()
                moveTo(6.0234f, 24.6123f)
                lineTo(21.8789f, 24.6123f)
                curveTo(23.543f, 24.6123f, 24.5156f, 23.6631f, 24.5156f, 22.0225f)
                lineTo(24.5156f, 9.0732f)
                lineTo(22.6289f, 7.7842f)
                lineTo(22.6289f, 21.542f)
                curveTo(22.6289f, 22.3037f, 22.2188f, 22.7256f, 21.4805f, 22.7256f)
                lineTo(6.4219f, 22.7256f)
                curveTo(5.6719f, 22.7256f, 5.2617f, 22.3037f, 5.2617f, 21.542f)
                lineTo(5.2617f, 7.7959f)
                lineTo(3.375f, 9.0732f)
                lineTo(3.375f, 22.0225f)
                curveTo(3.375f, 23.6631f, 4.3477f, 24.6123f, 6.0234f, 24.6123f)
                close()
                moveTo(0.0f, 11.5693f)
                curveTo(0.0f, 12.0498f, 0.375f, 12.5068f, 1.0078f, 12.5068f)
                curveTo(1.3359f, 12.5068f, 1.6055f, 12.3311f, 1.8516f, 12.1318f)
                lineTo(13.582f, 2.2881f)
                curveTo(13.8398f, 2.0537f, 14.1562f, 2.0537f, 14.4141f, 2.2881f)
                lineTo(26.1445f, 12.1318f)
                curveTo(26.3789f, 12.3311f, 26.6484f, 12.5068f, 26.9766f, 12.5068f)
                curveTo(27.5273f, 12.5068f, 27.9727f, 12.167f, 27.9727f, 11.6045f)
                curveTo(27.9727f, 11.2529f, 27.8555f, 11.0186f, 27.6094f, 10.8076f)
                lineTo(15.4102f, 0.5537f)
                curveTo(14.543f, -0.1846f, 13.4648f, -0.1846f, 12.5859f, 0.5537f)
                lineTo(0.375f, 10.8076f)
                curveTo(0.1172f, 11.0186f, 0.0f, 11.2998f, 0.0f, 11.5693f)
                close()
                moveTo(21.5742f, 6.2842f)
                lineTo(24.5156f, 8.7685f)
                lineTo(24.5156f, 3.3545f)
                curveTo(24.5156f, 2.8389f, 24.1875f, 2.5107f, 23.6719f, 2.5107f)
                lineTo(22.418f, 2.5107f)
                curveTo(21.9141f, 2.5107f, 21.5742f, 2.8389f, 21.5742f, 3.3545f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
