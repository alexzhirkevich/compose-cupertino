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

public val CupertinoIcons.Filled.IcloudAndArrowDown: ImageVector
    get() {
        if (_icloudAndArrowDown != null) {
            return _icloudAndArrowDown!!
        }
        _icloudAndArrowDown = Builder(name = "IcloudAndArrowDown", defaultWidth = 29.4609.dp,
                defaultHeight = 28.0898.dp, viewportWidth = 29.4609f, viewportHeight =
                28.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3633f, 21.1289f)
                lineTo(13.6406f, 21.1289f)
                lineTo(13.6406f, 13.9453f)
                curveTo(13.6406f, 13.3242f, 14.1797f, 12.7969f, 14.8125f, 12.7969f)
                curveTo(15.4453f, 12.7969f, 15.9727f, 13.3242f, 15.9727f, 13.9453f)
                lineTo(15.9727f, 21.1289f)
                lineTo(23.8242f, 21.1289f)
                curveTo(27.1992f, 21.1289f, 29.4609f, 19.0195f, 29.4609f, 16.2422f)
                curveTo(29.4609f, 13.9453f, 28.043f, 11.8359f, 25.7578f, 10.8867f)
                curveTo(25.7812f, 5.6602f, 22.0195f, 1.8867f, 17.2266f, 1.8867f)
                curveTo(14.0508f, 1.8867f, 11.7891f, 3.5859f, 10.3828f, 5.6367f)
                curveTo(7.7227f, 4.9219f, 4.3594f, 6.9844f, 4.3008f, 10.2773f)
                curveTo(1.6523f, 10.6992f, 0.0f, 13.0312f, 0.0f, 15.7383f)
                curveTo(0.0f, 18.7266f, 2.5195f, 21.1289f, 6.3633f, 21.1289f)
                close()
                moveTo(14.8125f, 28.0898f)
                curveTo(15.0469f, 28.0898f, 15.2461f, 28.0078f, 15.4805f, 27.7734f)
                lineTo(19.4414f, 23.9531f)
                curveTo(19.6172f, 23.7773f, 19.7227f, 23.5898f, 19.7227f, 23.332f)
                curveTo(19.7227f, 22.8633f, 19.3477f, 22.5117f, 18.8672f, 22.5117f)
                curveTo(18.6445f, 22.5117f, 18.3984f, 22.6055f, 18.2344f, 22.793f)
                lineTo(16.4531f, 24.6914f)
                lineTo(15.668f, 25.5117f)
                lineTo(15.7383f, 23.7656f)
                lineTo(15.7383f, 21.1172f)
                curveTo(15.7383f, 20.625f, 15.3164f, 20.2031f, 14.8125f, 20.2031f)
                curveTo(14.3086f, 20.2031f, 13.875f, 20.625f, 13.875f, 21.1172f)
                lineTo(13.875f, 23.7656f)
                lineTo(13.9453f, 25.5234f)
                lineTo(13.1602f, 24.6914f)
                lineTo(11.3789f, 22.793f)
                curveTo(11.2148f, 22.6055f, 10.957f, 22.5117f, 10.7344f, 22.5117f)
                curveTo(10.2422f, 22.5117f, 9.8906f, 22.8633f, 9.8906f, 23.332f)
                curveTo(9.8906f, 23.5898f, 9.9961f, 23.7773f, 10.1719f, 23.9531f)
                lineTo(14.1328f, 27.7734f)
                curveTo(14.3672f, 28.0078f, 14.5664f, 28.0898f, 14.8125f, 28.0898f)
                close()
            }
        }
        .build()
        return _icloudAndArrowDown!!
    }

private var _icloudAndArrowDown: ImageVector? = null
