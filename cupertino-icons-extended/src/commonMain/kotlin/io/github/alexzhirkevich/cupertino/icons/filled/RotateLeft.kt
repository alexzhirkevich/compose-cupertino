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

public val CupertinoIcons.Filled.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = Builder(name = "RotateLeft", defaultWidth = 23.4844.dp, defaultHeight =
                30.1072.dp, viewportWidth = 23.4844f, viewportHeight = 30.1072f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0117f, 25.8524f)
                lineTo(14.625f, 25.8524f)
                curveTo(16.6289f, 25.8524f, 17.6367f, 24.8915f, 17.6367f, 22.8407f)
                lineTo(17.6367f, 11.2508f)
                curveTo(17.6367f, 9.2001f, 16.6289f, 8.2391f, 14.625f, 8.2391f)
                lineTo(3.0117f, 8.2391f)
                curveTo(1.0078f, 8.2391f, 0.0f, 9.2001f, 0.0f, 11.2508f)
                lineTo(0.0f, 22.8407f)
                curveTo(0.0f, 24.8915f, 1.0078f, 25.8524f, 3.0117f, 25.8524f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.7461f, 10.4774f)
                curveTo(23.1445f, 10.4774f, 23.4844f, 10.1493f, 23.4844f, 9.7508f)
                lineTo(23.4844f, 7.993f)
                curveTo(23.4844f, 4.6415f, 21.2461f, 2.3798f, 17.8828f, 2.3798f)
                lineTo(17.6367f, 2.3798f)
                lineTo(17.6367f, 0.8329f)
                curveTo(17.6367f, -0.0343f, 16.9805f, -0.2218f, 16.3242f, 0.2587f)
                lineTo(13.3711f, 2.4266f)
                curveTo(12.8672f, 2.7899f, 12.8672f, 3.2118f, 13.3711f, 3.5751f)
                lineTo(16.3242f, 5.7313f)
                curveTo(16.9805f, 6.2118f, 17.6367f, 6.0126f, 17.6367f, 5.1688f)
                lineTo(17.6367f, 3.7391f)
                lineTo(17.8711f, 3.7391f)
                curveTo(20.4141f, 3.7391f, 22.0195f, 5.4969f, 22.0195f, 8.0048f)
                lineTo(22.0195f, 9.7508f)
                curveTo(22.0195f, 10.1493f, 22.3477f, 10.4774f, 22.7461f, 10.4774f)
                close()
            }
        }
        .build()
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
