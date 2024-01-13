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

public val CupertinoIcons.Outlined.QuestionmarkSquare: ImageVector
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
                moveTo(3.7031f, 19.7109f)
                curveTo(2.5313f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(17.8711f, 1.9102f)
                curveTo(19.0312f, 1.9102f, 19.6875f, 2.5313f, 19.6875f, 3.75f)
                lineTo(19.6875f, 17.8711f)
                curveTo(19.6875f, 19.0898f, 19.0312f, 19.7109f, 17.8711f, 19.7109f)
                close()
                moveTo(10.5586f, 13.2188f)
                curveTo(11.1562f, 13.2188f, 11.5078f, 12.8438f, 11.5078f, 12.3867f)
                curveTo(11.5078f, 12.3398f, 11.5078f, 12.2812f, 11.5078f, 12.2461f)
                curveTo(11.5078f, 11.5898f, 11.8945f, 11.168f, 12.7031f, 10.6289f)
                curveTo(13.8398f, 9.8789f, 14.6484f, 9.1992f, 14.6484f, 7.793f)
                curveTo(14.6484f, 5.8477f, 12.9141f, 4.793f, 10.9219f, 4.793f)
                curveTo(8.918f, 4.793f, 7.5938f, 5.7539f, 7.2656f, 6.832f)
                curveTo(7.207f, 7.0195f, 7.1719f, 7.207f, 7.1719f, 7.4063f)
                curveTo(7.1719f, 7.9336f, 7.582f, 8.2148f, 7.9688f, 8.2148f)
                curveTo(8.3789f, 8.2148f, 8.625f, 8.0273f, 8.8359f, 7.7461f)
                lineTo(9.0469f, 7.4648f)
                curveTo(9.457f, 6.7852f, 10.0781f, 6.3867f, 10.8516f, 6.3867f)
                curveTo(11.918f, 6.3867f, 12.6094f, 6.9961f, 12.6094f, 7.8867f)
                curveTo(12.6094f, 8.6836f, 12.1172f, 9.0703f, 11.0977f, 9.7852f)
                curveTo(10.2539f, 10.3711f, 9.6211f, 10.9922f, 9.6211f, 12.1406f)
                curveTo(9.6211f, 12.1875f, 9.6211f, 12.2461f, 9.6211f, 12.293f)
                curveTo(9.6211f, 12.9023f, 9.9609f, 13.2188f, 10.5586f, 13.2188f)
                close()
                moveTo(10.5352f, 16.7109f)
                curveTo(11.2148f, 16.7109f, 11.8008f, 16.1719f, 11.8008f, 15.4922f)
                curveTo(11.8008f, 14.8125f, 11.2266f, 14.2734f, 10.5352f, 14.2734f)
                curveTo(9.8438f, 14.2734f, 9.2695f, 14.8242f, 9.2695f, 15.4922f)
                curveTo(9.2695f, 16.1602f, 9.8555f, 16.7109f, 10.5352f, 16.7109f)
                close()
            }
        }
        .build()
        return _questionmarkSquare!!
    }

private var _questionmarkSquare: ImageVector? = null
