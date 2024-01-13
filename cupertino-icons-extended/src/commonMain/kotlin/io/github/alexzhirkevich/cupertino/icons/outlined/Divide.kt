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

public val CupertinoIcons.Outlined.Divide: ImageVector
    get() {
        if (_divide != null) {
            return _divide!!
        }
        _divide = Builder(name = "Divide", defaultWidth = 19.3359.dp, defaultHeight = 17.332.dp,
                viewportWidth = 19.3359f, viewportHeight = 17.332f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.668f, 3.5508f)
                curveTo(10.6289f, 3.5508f, 11.4023f, 2.7656f, 11.4023f, 1.8281f)
                curveTo(11.4023f, 0.8672f, 10.6289f, 0.0938f, 9.668f, 0.0938f)
                curveTo(8.7188f, 0.0938f, 7.9453f, 0.8672f, 7.9453f, 1.8281f)
                curveTo(7.9453f, 2.7656f, 8.7188f, 3.5508f, 9.668f, 3.5508f)
                close()
                moveTo(9.668f, 17.332f)
                curveTo(10.6289f, 17.332f, 11.4023f, 16.5586f, 11.4023f, 15.5977f)
                curveTo(11.4023f, 14.6484f, 10.6289f, 13.875f, 9.668f, 13.875f)
                curveTo(8.7188f, 13.875f, 7.9453f, 14.6484f, 7.9453f, 15.5977f)
                curveTo(7.9453f, 16.5586f, 8.7188f, 17.332f, 9.668f, 17.332f)
                close()
                moveTo(1.043f, 9.7266f)
                lineTo(18.293f, 9.7266f)
                curveTo(18.8555f, 9.7266f, 19.3359f, 9.2461f, 19.3359f, 8.6719f)
                curveTo(19.3359f, 8.0977f, 18.8555f, 7.6289f, 18.293f, 7.6289f)
                lineTo(1.043f, 7.6289f)
                curveTo(0.4805f, 7.6289f, 0.0f, 8.0977f, 0.0f, 8.6719f)
                curveTo(0.0f, 9.2461f, 0.4805f, 9.7266f, 1.043f, 9.7266f)
                close()
            }
        }
        .build()
        return _divide!!
    }

private var _divide: ImageVector? = null
