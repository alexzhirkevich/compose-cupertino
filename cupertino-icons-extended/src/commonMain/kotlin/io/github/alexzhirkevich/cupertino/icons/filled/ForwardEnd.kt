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

public val CupertinoIcons.Filled.ForwardEnd: ImageVector
    get() {
        if (_forwardEnd != null) {
            return _forwardEnd!!
        }
        _forwardEnd = Builder(name = "ForwardEnd", defaultWidth = 21.8906.dp, defaultHeight =
                19.0898.dp, viewportWidth = 21.8906f, viewportHeight = 19.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6602f, 19.0898f)
                lineTo(20.332f, 19.0898f)
                curveTo(21.3633f, 19.0898f, 21.8906f, 18.5508f, 21.8906f, 17.5195f)
                lineTo(21.8906f, 1.5586f)
                curveTo(21.8906f, 0.4922f, 21.3633f, 0.0f, 20.332f, 0.0f)
                lineTo(17.6602f, 0.0f)
                curveTo(16.6406f, 0.0f, 16.1016f, 0.5391f, 16.1016f, 1.5586f)
                lineTo(16.1016f, 17.5195f)
                curveTo(16.1016f, 18.5508f, 16.6406f, 19.0898f, 17.6602f, 19.0898f)
                close()
                moveTo(1.6875f, 18.7383f)
                curveTo(2.168f, 18.7383f, 2.5547f, 18.5859f, 3.0352f, 18.3047f)
                lineTo(14.9766f, 11.2852f)
                curveTo(15.8086f, 10.793f, 16.1602f, 10.207f, 16.1602f, 9.5391f)
                curveTo(16.1602f, 8.8594f, 15.8086f, 8.2852f, 14.9766f, 7.793f)
                lineTo(3.0352f, 0.7617f)
                curveTo(2.5547f, 0.4805f, 2.168f, 0.3281f, 1.6875f, 0.3281f)
                curveTo(0.7617f, 0.3281f, 0.0f, 1.0313f, 0.0f, 2.3438f)
                lineTo(0.0f, 16.7344f)
                curveTo(0.0f, 18.0469f, 0.7617f, 18.7383f, 1.6875f, 18.7383f)
                close()
            }
        }
        .build()
        return _forwardEnd!!
    }

private var _forwardEnd: ImageVector? = null
