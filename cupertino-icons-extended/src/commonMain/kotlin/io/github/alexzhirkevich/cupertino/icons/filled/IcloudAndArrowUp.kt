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

public val CupertinoIcons.Filled.IcloudAndArrowUp: ImageVector
    get() {
        if (_icloudAndArrowUp != null) {
            return _icloudAndArrowUp!!
        }
        _icloudAndArrowUp = Builder(name = "IcloudAndArrowUp", defaultWidth = 29.4609.dp,
                defaultHeight = 26.1445.dp, viewportWidth = 29.4609f, viewportHeight =
                26.1445f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 14.7656f)
                curveTo(0.0f, 17.7539f, 2.5195f, 20.1562f, 6.3633f, 20.1562f)
                lineTo(13.875f, 20.1562f)
                lineTo(13.875f, 25.2422f)
                curveTo(13.875f, 25.7344f, 14.3086f, 26.1445f, 14.8125f, 26.1445f)
                curveTo(15.3164f, 26.1445f, 15.7383f, 25.7344f, 15.7383f, 25.2422f)
                lineTo(15.7383f, 20.1562f)
                lineTo(23.8242f, 20.1562f)
                curveTo(27.1992f, 20.1562f, 29.4609f, 18.0469f, 29.4609f, 15.2695f)
                curveTo(29.4609f, 12.9727f, 28.043f, 10.8633f, 25.7578f, 9.9141f)
                curveTo(25.7812f, 4.6875f, 22.0195f, 0.9141f, 17.2266f, 0.9141f)
                curveTo(14.0508f, 0.9141f, 11.7891f, 2.6133f, 10.3828f, 4.6641f)
                curveTo(7.7227f, 3.9492f, 4.3594f, 6.0117f, 4.3008f, 9.3047f)
                curveTo(1.6523f, 9.7266f, 0.0f, 12.0586f, 0.0f, 14.7656f)
                close()
                moveTo(13.875f, 19.6758f)
                lineTo(13.875f, 13.6406f)
                lineTo(13.9453f, 11.8945f)
                lineTo(13.3477f, 12.5273f)
                lineTo(11.3789f, 14.6133f)
                curveTo(11.2148f, 14.8008f, 10.957f, 14.8945f, 10.7344f, 14.8945f)
                curveTo(10.2422f, 14.8945f, 9.8906f, 14.543f, 9.8906f, 14.0742f)
                curveTo(9.8906f, 13.8164f, 9.9961f, 13.6289f, 10.1719f, 13.4531f)
                lineTo(14.1328f, 9.6328f)
                curveTo(14.3672f, 9.3984f, 14.5664f, 9.3164f, 14.8125f, 9.3164f)
                curveTo(15.0469f, 9.3164f, 15.2461f, 9.3984f, 15.4805f, 9.6328f)
                lineTo(19.4414f, 13.4531f)
                curveTo(19.6172f, 13.6289f, 19.7227f, 13.8164f, 19.7227f, 14.0742f)
                curveTo(19.7227f, 14.543f, 19.3477f, 14.8945f, 18.8672f, 14.8945f)
                curveTo(18.6445f, 14.8945f, 18.3984f, 14.8008f, 18.2344f, 14.6133f)
                lineTo(16.2656f, 12.5273f)
                lineTo(15.668f, 11.8945f)
                lineTo(15.7383f, 13.6406f)
                lineTo(15.7383f, 19.6758f)
                curveTo(15.7383f, 20.1914f, 15.3164f, 20.6016f, 14.8125f, 20.6016f)
                curveTo(14.2969f, 20.6016f, 13.875f, 20.1914f, 13.875f, 19.6758f)
                close()
            }
        }
        .build()
        return _icloudAndArrowUp!!
    }

private var _icloudAndArrowUp: ImageVector? = null
