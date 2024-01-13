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

public val CupertinoIcons.Filled.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 21.0593.dp, defaultHeight = 21.8381.dp,
                viewportWidth = 21.0593f, viewportHeight = 21.8381f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2399f, 16.046f)
                lineTo(5.0836f, 19.7608f)
                curveTo(6.6422f, 21.2608f, 8.5289f, 21.296f, 10.0172f, 19.8077f)
                lineTo(11.1656f, 18.6476f)
                lineTo(2.2242f, 9.8937f)
                lineTo(1.0992f, 11.0187f)
                curveTo(-0.3891f, 12.5069f, -0.3891f, 14.4757f, 1.2399f, 16.046f)
                close()
                moveTo(3.3258f, 8.7921f)
                lineTo(12.2672f, 17.5577f)
                lineTo(20.3297f, 9.4835f)
                curveTo(21.3141f, 8.4991f, 21.3024f, 7.1515f, 20.2945f, 6.1671f)
                lineTo(14.7399f, 0.7413f)
                curveTo(13.7438f, -0.2313f, 12.4078f, -0.2548f, 11.4234f, 0.7179f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
