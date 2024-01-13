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

public val CupertinoIcons.Filled.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 23.6909.dp, defaultHeight =
                23.7188.dp, viewportWidth = 23.6909f, viewportHeight = 23.7188f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8491f, 6.1699f)
                lineTo(2.8491f, 14.0215f)
                curveTo(2.8491f, 18.2285f, 5.1109f, 19.7754f, 11.6616f, 23.4668f)
                curveTo(11.9663f, 23.6309f, 12.2476f, 23.6895f, 12.4351f, 23.6895f)
                curveTo(12.6226f, 23.6895f, 12.9155f, 23.6191f, 13.2085f, 23.4668f)
                curveTo(14.9898f, 22.5293f, 16.4429f, 21.709f, 17.6148f, 20.959f)
                close()
                moveTo(21.0366f, 17.8418f)
                curveTo(21.7398f, 16.7637f, 22.021f, 15.5566f, 22.021f, 14.0215f)
                lineTo(22.021f, 5.1856f)
                curveTo(22.021f, 3.9785f, 21.5054f, 3.5918f, 20.521f, 3.1816f)
                curveTo(19.1499f, 2.6191f, 14.7671f, 1.0254f, 13.4077f, 0.5566f)
                curveTo(13.0913f, 0.4512f, 12.7632f, 0.3926f, 12.4351f, 0.3926f)
                curveTo(12.107f, 0.3926f, 11.7788f, 0.4629f, 11.4741f, 0.5566f)
                curveTo(10.396f, 0.9199f, 7.771f, 1.8691f, 5.814f, 2.6074f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1499f, 23.4551f)
                curveTo(22.5015f, 23.8066f, 23.0874f, 23.8066f, 23.4273f, 23.4551f)
                curveTo(23.7788f, 23.1035f, 23.7788f, 22.5293f, 23.4273f, 22.1777f)
                lineTo(1.5484f, 0.3105f)
                curveTo(1.1968f, -0.041f, 0.6226f, -0.041f, 0.2593f, 0.3105f)
                curveTo(-0.0923f, 0.6504f, -0.0805f, 1.2363f, 0.2593f, 1.5879f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
