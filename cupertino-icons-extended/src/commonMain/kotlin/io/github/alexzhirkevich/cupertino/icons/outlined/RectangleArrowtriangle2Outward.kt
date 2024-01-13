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

public val CupertinoIcons.Outlined.RectangleArrowtriangle2Outward: ImageVector
    get() {
        if (_rectangleArrowtriangle2Outward != null) {
            return _rectangleArrowtriangle2Outward!!
        }
        _rectangleArrowtriangle2Outward = Builder(name = "RectangleArrowtriangle2Outward",
                defaultWidth = 22.1719.dp, defaultHeight = 29.4142.dp, viewportWidth = 22.1719f,
                viewportHeight = 29.4142f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 22.377f)
                lineTo(18.4922f, 22.377f)
                curveTo(20.9531f, 22.377f, 22.1719f, 21.1582f, 22.1719f, 18.7442f)
                lineTo(22.1719f, 10.67f)
                curveTo(22.1719f, 8.2559f, 20.9531f, 7.0371f, 18.4922f, 7.0371f)
                lineTo(3.6797f, 7.0371f)
                curveTo(1.2188f, 7.0371f, 0.0f, 8.2442f, 0.0f, 10.67f)
                lineTo(0.0f, 18.7442f)
                curveTo(0.0f, 21.17f, 1.2188f, 22.377f, 3.6797f, 22.377f)
                close()
                moveTo(3.7031f, 20.4903f)
                curveTo(2.5313f, 20.4903f, 1.8867f, 19.8575f, 1.8867f, 18.6504f)
                lineTo(1.8867f, 10.7637f)
                curveTo(1.8867f, 9.545f, 2.5313f, 8.9239f, 3.7031f, 8.9239f)
                lineTo(18.4688f, 8.9239f)
                curveTo(19.6289f, 8.9239f, 20.2852f, 9.545f, 20.2852f, 10.7637f)
                lineTo(20.2852f, 18.6504f)
                curveTo(20.2852f, 19.8575f, 19.6289f, 20.4903f, 18.4688f, 20.4903f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1094f, 3.6973f)
                lineTo(11.9297f, 0.4395f)
                curveTo(11.543f, -0.1582f, 10.6992f, -0.1347f, 10.3125f, 0.4395f)
                lineTo(8.0977f, 3.6973f)
                curveTo(7.582f, 4.4473f, 7.8633f, 5.2442f, 8.7656f, 5.2442f)
                lineTo(13.4414f, 5.2442f)
                curveTo(14.3203f, 5.2442f, 14.5898f, 4.4239f, 14.1094f, 3.6973f)
                close()
                moveTo(14.1094f, 25.7051f)
                curveTo(14.5898f, 24.9903f, 14.3203f, 24.17f, 13.4414f, 24.17f)
                lineTo(8.7656f, 24.17f)
                curveTo(7.8633f, 24.17f, 7.582f, 24.9551f, 8.0977f, 25.7051f)
                lineTo(10.3125f, 28.9747f)
                curveTo(10.6992f, 29.5489f, 11.543f, 29.5606f, 11.9297f, 28.9747f)
                close()
            }
        }
        .build()
        return _rectangleArrowtriangle2Outward!!
    }

private var _rectangleArrowtriangle2Outward: ImageVector? = null
