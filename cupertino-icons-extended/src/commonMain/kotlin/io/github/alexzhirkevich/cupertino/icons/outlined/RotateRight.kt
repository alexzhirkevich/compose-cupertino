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

public val CupertinoIcons.Outlined.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 23.4727.dp, defaultHeight =
                30.1072.dp, viewportWidth = 23.4727f, viewportHeight = 30.1072f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8477f, 25.8524f)
                lineTo(20.4609f, 25.8524f)
                curveTo(22.4648f, 25.8524f, 23.4727f, 24.8915f, 23.4727f, 22.8407f)
                lineTo(23.4727f, 11.2508f)
                curveTo(23.4727f, 9.2001f, 22.4648f, 8.2391f, 20.4609f, 8.2391f)
                lineTo(8.8477f, 8.2391f)
                curveTo(6.8438f, 8.2391f, 5.8359f, 9.2001f, 5.8359f, 11.2508f)
                lineTo(5.8359f, 22.8407f)
                curveTo(5.8359f, 24.8915f, 6.8438f, 25.8524f, 8.8477f, 25.8524f)
                close()
                moveTo(8.8828f, 23.9657f)
                curveTo(8.0859f, 23.9657f, 7.7227f, 23.6376f, 7.7227f, 22.8173f)
                lineTo(7.7227f, 11.286f)
                curveTo(7.7227f, 10.454f, 8.0859f, 10.1258f, 8.8828f, 10.1258f)
                lineTo(20.4258f, 10.1258f)
                curveTo(21.2344f, 10.1258f, 21.5859f, 10.454f, 21.5859f, 11.286f)
                lineTo(21.5859f, 22.8173f)
                curveTo(21.5859f, 23.6376f, 21.2344f, 23.9657f, 20.4258f, 23.9657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.7266f, 10.4774f)
                curveTo(1.125f, 10.4774f, 1.4648f, 10.1493f, 1.4648f, 9.7508f)
                lineTo(1.4648f, 8.0048f)
                curveTo(1.4648f, 5.4969f, 3.0703f, 3.7391f, 5.6133f, 3.7391f)
                lineTo(5.8359f, 3.7391f)
                lineTo(5.8359f, 5.1688f)
                curveTo(5.8359f, 6.0126f, 6.4922f, 6.2118f, 7.1484f, 5.7313f)
                lineTo(10.1016f, 3.5751f)
                curveTo(10.6055f, 3.2118f, 10.5938f, 2.8016f, 10.1016f, 2.4266f)
                lineTo(7.1484f, 0.2587f)
                curveTo(6.4922f, -0.2218f, 5.8359f, -0.0343f, 5.8359f, 0.8329f)
                lineTo(5.8359f, 2.3798f)
                lineTo(5.6016f, 2.3798f)
                curveTo(2.2266f, 2.3798f, 0.0f, 4.6415f, 0.0f, 7.993f)
                lineTo(0.0f, 9.7508f)
                curveTo(0.0f, 10.1493f, 0.3281f, 10.4774f, 0.7266f, 10.4774f)
                close()
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
