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

public val CupertinoIcons.Outlined.ExclamationmarkSquare: ImageVector
    get() {
        if (_exclamationmarkSquare != null) {
            return _exclamationmarkSquare!!
        }
        _exclamationmarkSquare = Builder(name = "ExclamationmarkSquare", defaultWidth = 21.5742.dp,
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
                moveTo(10.793f, 12.9023f)
                curveTo(11.3555f, 12.9023f, 11.6719f, 12.5859f, 11.6836f, 11.9766f)
                lineTo(11.8594f, 5.7891f)
                curveTo(11.8711f, 5.1914f, 11.4023f, 4.7461f, 10.7812f, 4.7461f)
                curveTo(10.1484f, 4.7461f, 9.7031f, 5.1797f, 9.7148f, 5.7773f)
                lineTo(9.8672f, 11.9766f)
                curveTo(9.8789f, 12.5742f, 10.207f, 12.9023f, 10.793f, 12.9023f)
                close()
                moveTo(10.793f, 16.7109f)
                curveTo(11.4609f, 16.7109f, 12.0469f, 16.1719f, 12.0469f, 15.4922f)
                curveTo(12.0469f, 14.8125f, 11.4727f, 14.2734f, 10.793f, 14.2734f)
                curveTo(10.1016f, 14.2734f, 9.5273f, 14.8242f, 9.5273f, 15.4922f)
                curveTo(9.5273f, 16.1602f, 10.1133f, 16.7109f, 10.793f, 16.7109f)
                close()
            }
        }
        .build()
        return _exclamationmarkSquare!!
    }

private var _exclamationmarkSquare: ImageVector? = null
