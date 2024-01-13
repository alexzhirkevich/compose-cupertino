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

public val CupertinoIcons.Outlined.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 19.3359.dp, defaultHeight = 19.3477.dp,
                viewportWidth = 19.3359f, viewportHeight = 19.3477f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.668f)
                curveTo(0.0f, 10.2422f, 0.4805f, 10.7109f, 1.043f, 10.7109f)
                lineTo(8.625f, 10.7109f)
                lineTo(8.625f, 18.293f)
                curveTo(8.625f, 18.8555f, 9.0938f, 19.3359f, 9.668f, 19.3359f)
                curveTo(10.2422f, 19.3359f, 10.7227f, 18.8555f, 10.7227f, 18.293f)
                lineTo(10.7227f, 10.7109f)
                lineTo(18.293f, 10.7109f)
                curveTo(18.8555f, 10.7109f, 19.3359f, 10.2422f, 19.3359f, 9.668f)
                curveTo(19.3359f, 9.0938f, 18.8555f, 8.6133f, 18.293f, 8.6133f)
                lineTo(10.7227f, 8.6133f)
                lineTo(10.7227f, 1.043f)
                curveTo(10.7227f, 0.4805f, 10.2422f, 0.0f, 9.668f, 0.0f)
                curveTo(9.0938f, 0.0f, 8.625f, 0.4805f, 8.625f, 1.043f)
                lineTo(8.625f, 8.6133f)
                lineTo(1.043f, 8.6133f)
                curveTo(0.4805f, 8.6133f, 0.0f, 9.0938f, 0.0f, 9.668f)
                close()
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
