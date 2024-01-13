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

public val CupertinoIcons.Filled.BackwardEnd: ImageVector
    get() {
        if (_backwardEnd != null) {
            return _backwardEnd!!
        }
        _backwardEnd = Builder(name = "BackwardEnd", defaultWidth = 21.8906.dp, defaultHeight =
                19.0898.dp, viewportWidth = 21.8906f, viewportHeight = 19.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5586f, 19.0898f)
                lineTo(4.2305f, 19.0898f)
                curveTo(5.25f, 19.0898f, 5.7891f, 18.5508f, 5.7891f, 17.5195f)
                lineTo(5.7891f, 1.5586f)
                curveTo(5.7891f, 0.4922f, 5.25f, 0.0f, 4.2305f, 0.0f)
                lineTo(1.5586f, 0.0f)
                curveTo(0.5391f, 0.0f, 0.0f, 0.5391f, 0.0f, 1.5586f)
                lineTo(0.0f, 17.5195f)
                curveTo(0.0f, 18.5508f, 0.5391f, 19.0898f, 1.5586f, 19.0898f)
                close()
                moveTo(20.2031f, 18.7383f)
                curveTo(21.1289f, 18.7383f, 21.8906f, 18.0469f, 21.8906f, 16.7344f)
                lineTo(21.8906f, 2.3438f)
                curveTo(21.8906f, 1.0313f, 21.1289f, 0.3281f, 20.2031f, 0.3281f)
                curveTo(19.7227f, 0.3281f, 19.3359f, 0.4805f, 18.8555f, 0.7617f)
                lineTo(6.9141f, 7.793f)
                curveTo(6.082f, 8.2852f, 5.7305f, 8.8594f, 5.7305f, 9.5391f)
                curveTo(5.7305f, 10.207f, 6.082f, 10.793f, 6.9141f, 11.2852f)
                lineTo(18.8555f, 18.3047f)
                curveTo(19.3359f, 18.5859f, 19.7227f, 18.7383f, 20.2031f, 18.7383f)
                close()
            }
        }
        .build()
        return _backwardEnd!!
    }

private var _backwardEnd: ImageVector? = null
