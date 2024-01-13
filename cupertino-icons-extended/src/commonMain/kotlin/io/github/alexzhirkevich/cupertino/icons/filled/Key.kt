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

public val CupertinoIcons.Filled.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 14.9648.dp, defaultHeight = 29.0939.dp,
                viewportWidth = 14.9648f, viewportHeight = 29.0939f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4883f, 0.1739f)
                curveTo(3.3164f, 0.1739f, 0.0f, 3.4903f, 0.0f, 7.6387f)
                curveTo(0.0f, 10.7676f, 1.875f, 13.5333f, 4.8047f, 14.6465f)
                lineTo(4.8047f, 26.2129f)
                curveTo(4.8047f, 26.5059f, 4.8984f, 26.7286f, 5.1094f, 26.9512f)
                lineTo(7.0664f, 28.92f)
                curveTo(7.2656f, 29.1192f, 7.6641f, 29.1778f, 7.9102f, 28.9317f)
                lineTo(11.625f, 25.2169f)
                curveTo(11.8711f, 24.959f, 11.8594f, 24.6192f, 11.625f, 24.3731f)
                lineTo(9.3164f, 22.0997f)
                lineTo(12.4805f, 18.9473f)
                curveTo(12.7031f, 18.7129f, 12.7031f, 18.3731f, 12.457f, 18.1153f)
                lineTo(9.3281f, 14.9629f)
                curveTo(12.9492f, 13.5215f, 14.9648f, 10.8497f, 14.9648f, 7.6387f)
                curveTo(14.9648f, 3.5137f, 11.625f, 0.1739f, 7.4883f, 0.1739f)
                close()
                moveTo(7.4883f, 7.334f)
                curveTo(6.3398f, 7.334f, 5.4023f, 6.4083f, 5.4023f, 5.2481f)
                curveTo(5.4023f, 4.0879f, 6.3164f, 3.1622f, 7.4883f, 3.1622f)
                curveTo(8.6367f, 3.1622f, 9.5742f, 4.0997f, 9.5742f, 5.2481f)
                curveTo(9.5742f, 6.4083f, 8.6367f, 7.334f, 7.4883f, 7.334f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
