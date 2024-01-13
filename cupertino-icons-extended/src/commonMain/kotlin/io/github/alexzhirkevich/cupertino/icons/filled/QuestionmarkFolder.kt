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

public val CupertinoIcons.Filled.QuestionmarkFolder: ImageVector
    get() {
        if (_questionmarkFolder != null) {
            return _questionmarkFolder!!
        }
        _questionmarkFolder = Builder(name = "QuestionmarkFolder", defaultWidth = 26.6133.dp,
                defaultHeight = 21.5977.dp, viewportWidth = 26.6133f, viewportHeight =
                21.5977f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.4453f)
                lineTo(23.2852f, 21.4453f)
                curveTo(25.3828f, 21.4453f, 26.6133f, 20.2266f, 26.6133f, 17.8125f)
                lineTo(26.6133f, 5.7773f)
                curveTo(26.6133f, 3.3633f, 25.3711f, 2.1445f, 22.9336f, 2.1445f)
                lineTo(11.6836f, 2.1445f)
                curveTo(10.8867f, 2.1445f, 10.4062f, 1.957f, 9.8203f, 1.4531f)
                lineTo(9.1055f, 0.8672f)
                curveTo(8.332f, 0.2109f, 7.7344f, 0.0f, 6.5742f, 0.0f)
                lineTo(3.2344f, 0.0f)
                curveTo(1.1836f, 0.0f, 0.0f, 1.1719f, 0.0f, 3.5273f)
                lineTo(0.0f, 17.8125f)
                curveTo(0.0f, 20.2383f, 1.2305f, 21.4453f, 3.6797f, 21.4453f)
                close()
                moveTo(13.0898f, 14.0508f)
                curveTo(12.5156f, 14.0508f, 12.1875f, 13.7578f, 12.1875f, 13.1602f)
                curveTo(12.1875f, 13.1133f, 12.1875f, 13.0664f, 12.1875f, 13.0195f)
                curveTo(12.1875f, 11.9062f, 12.7969f, 11.3203f, 13.5938f, 10.7578f)
                curveTo(14.5898f, 10.0664f, 15.0586f, 9.7031f, 15.0586f, 8.9414f)
                curveTo(15.0586f, 8.0859f, 14.3906f, 7.5117f, 13.3711f, 7.5117f)
                curveTo(12.6328f, 7.5117f, 12.0469f, 7.875f, 11.6484f, 8.543f)
                lineTo(11.4492f, 8.8125f)
                curveTo(11.2383f, 9.0703f, 10.9922f, 9.2578f, 10.6172f, 9.2578f)
                curveTo(10.2422f, 9.2578f, 9.832f, 8.9883f, 9.832f, 8.4844f)
                curveTo(9.832f, 8.2852f, 9.8789f, 8.0977f, 9.9375f, 7.9219f)
                curveTo(10.2422f, 6.8906f, 11.5078f, 5.9883f, 13.4414f, 5.9883f)
                curveTo(15.3633f, 5.9883f, 17.0273f, 6.9844f, 17.0273f, 8.8594f)
                curveTo(17.0273f, 10.1953f, 16.2422f, 10.8633f, 15.1523f, 11.5781f)
                curveTo(14.3672f, 12.082f, 14.0039f, 12.4805f, 14.0039f, 13.1133f)
                curveTo(14.0039f, 13.1602f, 14.0039f, 13.207f, 14.0039f, 13.2422f)
                curveTo(14.0039f, 13.6992f, 13.6641f, 14.0508f, 13.0898f, 14.0508f)
                close()
                moveTo(13.0664f, 17.4023f)
                curveTo(12.4219f, 17.4023f, 11.8477f, 16.875f, 11.8477f, 16.2305f)
                curveTo(11.8477f, 15.5859f, 12.4102f, 15.0586f, 13.0664f, 15.0586f)
                curveTo(13.7344f, 15.0586f, 14.2852f, 15.5742f, 14.2852f, 16.2305f)
                curveTo(14.2852f, 16.8867f, 13.7227f, 17.4023f, 13.0664f, 17.4023f)
                close()
            }
        }
        .build()
        return _questionmarkFolder!!
    }

private var _questionmarkFolder: ImageVector? = null
