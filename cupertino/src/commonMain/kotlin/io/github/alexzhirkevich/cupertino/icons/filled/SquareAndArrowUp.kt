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

public val CupertinoIcons.Filled.SquareAndArrowUp: ImageVector
    get() {
        if (_squareAndArrowUp != null) {
            return _squareAndArrowUp!!
        }
        _squareAndArrowUp = Builder(name = "SquareAndArrowUp", defaultWidth = 20.8008.dp,
                defaultHeight = 28.1836.dp, viewportWidth = 20.8008f, viewportHeight =
                28.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 26.4492f)
                lineTo(17.1211f, 26.4492f)
                curveTo(19.5703f, 26.4492f, 20.8008f, 25.2305f, 20.8008f, 22.8164f)
                lineTo(20.8008f, 11.3555f)
                curveTo(20.8008f, 8.9414f, 19.5703f, 7.7227f, 17.1211f, 7.7227f)
                lineTo(11.5664f, 7.7227f)
                lineTo(11.5664f, 16.3945f)
                curveTo(11.5664f, 17.0156f, 11.0273f, 17.5312f, 10.3945f, 17.5312f)
                curveTo(9.7617f, 17.5312f, 9.2344f, 17.0156f, 9.2344f, 16.3945f)
                lineTo(9.2344f, 7.7227f)
                lineTo(3.6797f, 7.7227f)
                curveTo(1.2305f, 7.7227f, 0.0f, 8.9414f, 0.0f, 11.3555f)
                lineTo(0.0f, 22.8164f)
                curveTo(0.0f, 25.2305f, 1.2305f, 26.4492f, 3.6797f, 26.4492f)
                close()
                moveTo(10.3945f, 8.6484f)
                curveTo(10.8984f, 8.6484f, 11.332f, 8.2266f, 11.332f, 7.7344f)
                lineTo(11.332f, 4.3242f)
                lineTo(11.2617f, 2.5664f)
                lineTo(12.0469f, 3.3984f)
                lineTo(13.8281f, 5.2969f)
                curveTo(13.9922f, 5.4844f, 14.2266f, 5.5781f, 14.4609f, 5.5781f)
                curveTo(14.9414f, 5.5781f, 15.3164f, 5.2266f, 15.3164f, 4.7461f)
                curveTo(15.3164f, 4.5f, 15.2109f, 4.3125f, 15.0352f, 4.1367f)
                lineTo(11.0742f, 0.3164f)
                curveTo(10.8398f, 0.082f, 10.6406f, 0.0f, 10.3945f, 0.0f)
                curveTo(10.1602f, 0.0f, 9.9609f, 0.082f, 9.7148f, 0.3164f)
                lineTo(5.7539f, 4.1367f)
                curveTo(5.5781f, 4.3125f, 5.4844f, 4.5f, 5.4844f, 4.7461f)
                curveTo(5.4844f, 5.2266f, 5.8359f, 5.5781f, 6.3281f, 5.5781f)
                curveTo(6.5508f, 5.5781f, 6.8086f, 5.4844f, 6.9727f, 5.2969f)
                lineTo(8.7422f, 3.3984f)
                lineTo(9.5391f, 2.5664f)
                lineTo(9.4688f, 4.3242f)
                lineTo(9.4688f, 7.7344f)
                curveTo(9.4688f, 8.2266f, 9.8906f, 8.6484f, 10.3945f, 8.6484f)
                close()
            }
        }
        .build()
        return _squareAndArrowUp!!
    }

private var _squareAndArrowUp: ImageVector? = null
