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

public val CupertinoIcons.Filled.HeartTextSquare: ImageVector
    get() {
        if (_heartTextSquare != null) {
            return _heartTextSquare!!
        }
        _heartTextSquare = Builder(name = "HeartTextSquare", defaultWidth = 21.5742.dp,
                defaultHeight = 21.5977.dp, viewportWidth = 21.5742f, viewportHeight =
                21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(17.8945f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3789f, 21.5742f, 17.9648f)
                lineTo(21.5742f, 3.6563f)
                curveTo(21.5742f, 1.2422f, 20.3555f, 0.0234f, 17.8945f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(5.2734f, 3.1758f)
                curveTo(5.9063f, 3.1758f, 6.3867f, 3.5391f, 6.6797f, 4.0781f)
                curveTo(6.9727f, 3.5391f, 7.4766f, 3.1758f, 8.0625f, 3.1758f)
                curveTo(9.0586f, 3.1758f, 9.7734f, 3.9258f, 9.7734f, 4.957f)
                curveTo(9.7734f, 6.4805f, 8.168f, 7.8984f, 6.9844f, 8.6367f)
                curveTo(6.8789f, 8.6953f, 6.7734f, 8.7656f, 6.6914f, 8.7656f)
                curveTo(6.6211f, 8.7656f, 6.5039f, 8.707f, 6.3984f, 8.6367f)
                curveTo(5.2383f, 7.8164f, 3.5977f, 6.4805f, 3.5977f, 4.957f)
                curveTo(3.5977f, 3.9258f, 4.3125f, 3.1758f, 5.2734f, 3.1758f)
                close()
                moveTo(4.3359f, 14.0039f)
                curveTo(3.9023f, 14.0039f, 3.5977f, 13.6875f, 3.5977f, 13.2773f)
                curveTo(3.5977f, 12.8789f, 3.9023f, 12.5625f, 4.3359f, 12.5625f)
                lineTo(16.1133f, 12.5625f)
                curveTo(16.5234f, 12.5625f, 16.8281f, 12.8789f, 16.8281f, 13.2773f)
                curveTo(16.8281f, 13.6875f, 16.5234f, 14.0039f, 16.1133f, 14.0039f)
                close()
                moveTo(4.3359f, 18.0117f)
                curveTo(3.9023f, 18.0117f, 3.5977f, 17.6953f, 3.5977f, 17.2969f)
                curveTo(3.5977f, 16.8867f, 3.9023f, 16.5703f, 4.3359f, 16.5703f)
                lineTo(13.0195f, 16.5703f)
                curveTo(13.4414f, 16.5703f, 13.7461f, 16.8867f, 13.7461f, 17.2969f)
                curveTo(13.7461f, 17.6953f, 13.4414f, 18.0117f, 13.0195f, 18.0117f)
                close()
            }
        }
        .build()
        return _heartTextSquare!!
    }

private var _heartTextSquare: ImageVector? = null
