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

public val CupertinoIcons.Filled.Homepod: ImageVector
    get() {
        if (_homepod != null) {
            return _homepod!!
        }
        _homepod = Builder(name = "Homepod", defaultWidth = 18.8555.dp, defaultHeight = 24.082.dp,
                viewportWidth = 18.8555f, viewportHeight = 24.082f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4219f, 24.082f)
                curveTo(15.8789f, 24.082f, 18.8555f, 21.7852f, 18.8555f, 16.5586f)
                lineTo(18.8555f, 7.6406f)
                curveTo(18.8555f, 5.4375f, 18.3281f, 3.9492f, 17.4961f, 2.8945f)
                curveTo(17.2148f, 2.543f, 16.7578f, 2.5195f, 16.418f, 2.8008f)
                curveTo(15.293f, 3.7852f, 12.3516f, 4.6289f, 9.4219f, 4.6289f)
                curveTo(6.4922f, 4.6289f, 3.5508f, 3.7852f, 2.4375f, 2.8008f)
                curveTo(2.0859f, 2.5195f, 1.6406f, 2.543f, 1.3594f, 2.8945f)
                curveTo(0.5273f, 3.9492f, 0.0f, 5.4375f, 0.0f, 7.6406f)
                lineTo(0.0f, 16.5586f)
                curveTo(0.0f, 21.7852f, 2.9648f, 24.082f, 9.4219f, 24.082f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4219f, 3.0234f)
                curveTo(12.5273f, 3.0234f, 14.8477f, 2.3672f, 14.8477f, 1.5234f)
                curveTo(14.8477f, 0.6563f, 12.5273f, 0.0117f, 9.4219f, 0.0117f)
                curveTo(6.3164f, 0.0117f, 4.0078f, 0.6563f, 4.0078f, 1.5234f)
                curveTo(4.0078f, 2.3672f, 6.3164f, 3.0234f, 9.4219f, 3.0234f)
                close()
            }
        }
        .build()
        return _homepod!!
    }

private var _homepod: ImageVector? = null
