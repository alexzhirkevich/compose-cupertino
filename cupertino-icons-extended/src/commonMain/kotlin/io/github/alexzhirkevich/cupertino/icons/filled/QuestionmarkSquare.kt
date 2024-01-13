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

public val CupertinoIcons.Filled.QuestionmarkSquare: ImageVector
    get() {
        if (_questionmarkSquare != null) {
            return _questionmarkSquare!!
        }
        _questionmarkSquare = Builder(name = "QuestionmarkSquare", defaultWidth = 21.5742.dp,
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
                moveTo(10.5469f, 13.3008f)
                curveTo(9.9258f, 13.3008f, 9.5859f, 12.9727f, 9.5859f, 12.3398f)
                curveTo(9.5859f, 12.293f, 9.5859f, 12.2344f, 9.5859f, 12.1875f)
                curveTo(9.5859f, 10.9922f, 10.2305f, 10.3594f, 11.0977f, 9.75f)
                curveTo(12.1523f, 9.0117f, 12.6562f, 8.6133f, 12.6562f, 7.793f)
                curveTo(12.6562f, 6.8789f, 11.9414f, 6.2578f, 10.8516f, 6.2578f)
                curveTo(10.0547f, 6.2578f, 9.4219f, 6.6563f, 8.9883f, 7.3594f)
                lineTo(8.7773f, 7.6523f)
                curveTo(8.5547f, 7.9336f, 8.2969f, 8.1328f, 7.875f, 8.1328f)
                curveTo(7.4766f, 8.1328f, 7.043f, 7.8398f, 7.043f, 7.3008f)
                curveTo(7.043f, 7.0898f, 7.0898f, 6.8906f, 7.1484f, 6.7031f)
                curveTo(7.4883f, 5.5898f, 8.8477f, 4.6172f, 10.9219f, 4.6172f)
                curveTo(12.9844f, 4.6172f, 14.7773f, 5.6836f, 14.7773f, 7.6992f)
                curveTo(14.7773f, 9.1523f, 13.9336f, 9.8555f, 12.7617f, 10.6289f)
                curveTo(11.9297f, 11.1797f, 11.5312f, 11.6133f, 11.5312f, 12.293f)
                curveTo(11.5312f, 12.3281f, 11.5312f, 12.3867f, 11.5312f, 12.4336f)
                curveTo(11.5312f, 12.9141f, 11.168f, 13.3008f, 10.5469f, 13.3008f)
                close()
                moveTo(10.5234f, 16.8984f)
                curveTo(9.8203f, 16.8984f, 9.2109f, 16.3359f, 9.2109f, 15.6445f)
                curveTo(9.2109f, 14.9531f, 9.8086f, 14.3789f, 10.5234f, 14.3789f)
                curveTo(11.2383f, 14.3789f, 11.8359f, 14.9414f, 11.8359f, 15.6445f)
                curveTo(11.8359f, 16.3477f, 11.2266f, 16.8984f, 10.5234f, 16.8984f)
                close()
            }
        }
        .build()
        return _questionmarkSquare!!
    }

private var _questionmarkSquare: ImageVector? = null
