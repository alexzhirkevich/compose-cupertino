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

public val CupertinoIcons.Outlined.HeartTextSquare: ImageVector
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
                moveTo(3.7031f, 19.7109f)
                curveTo(2.5313f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(17.8711f, 1.9102f)
                curveTo(19.0312f, 1.9102f, 19.6875f, 2.5313f, 19.6875f, 3.75f)
                lineTo(19.6875f, 17.8711f)
                curveTo(19.6875f, 19.0898f, 19.0312f, 19.7109f, 17.8711f, 19.7109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8945f, 3.8789f)
                curveTo(4.9336f, 3.8789f, 4.2188f, 4.6289f, 4.2188f, 5.6602f)
                curveTo(4.2188f, 7.1836f, 5.8594f, 8.5195f, 7.0195f, 9.3281f)
                curveTo(7.1367f, 9.4102f, 7.2539f, 9.4688f, 7.3242f, 9.4688f)
                curveTo(7.4063f, 9.4688f, 7.5f, 9.3984f, 7.6055f, 9.3281f)
                curveTo(8.7891f, 8.6016f, 10.3945f, 7.1836f, 10.3945f, 5.6602f)
                curveTo(10.3945f, 4.6289f, 9.6797f, 3.8789f, 8.6953f, 3.8789f)
                curveTo(8.0977f, 3.8789f, 7.5938f, 4.2422f, 7.3125f, 4.7813f)
                curveTo(7.0195f, 4.2422f, 6.5391f, 3.8789f, 5.8945f, 3.8789f)
                close()
                moveTo(4.957f, 13.1367f)
                lineTo(16.5f, 13.1367f)
                curveTo(16.9102f, 13.1367f, 17.2266f, 12.8203f, 17.2266f, 12.4102f)
                curveTo(17.2266f, 12.0117f, 16.9102f, 11.6953f, 16.5f, 11.6953f)
                lineTo(4.957f, 11.6953f)
                curveTo(4.5352f, 11.6953f, 4.2188f, 12.0117f, 4.2188f, 12.4102f)
                curveTo(4.2188f, 12.8203f, 4.5352f, 13.1367f, 4.957f, 13.1367f)
                close()
                moveTo(4.957f, 17.1445f)
                lineTo(13.418f, 17.1445f)
                curveTo(13.8281f, 17.1445f, 14.1445f, 16.8281f, 14.1445f, 16.4297f)
                curveTo(14.1445f, 16.0195f, 13.8281f, 15.7031f, 13.418f, 15.7031f)
                lineTo(4.957f, 15.7031f)
                curveTo(4.5352f, 15.7031f, 4.2188f, 16.0195f, 4.2188f, 16.4297f)
                curveTo(4.2188f, 16.8281f, 4.5352f, 17.1445f, 4.957f, 17.1445f)
                close()
            }
        }
        .build()
        return _heartTextSquare!!
    }

private var _heartTextSquare: ImageVector? = null
