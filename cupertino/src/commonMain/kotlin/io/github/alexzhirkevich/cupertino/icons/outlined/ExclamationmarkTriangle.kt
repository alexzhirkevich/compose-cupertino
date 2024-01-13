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

public val CupertinoIcons.Outlined.ExclamationmarkTriangle: ImageVector
    get() {
        if (_exclamationmarkTriangle != null) {
            return _exclamationmarkTriangle!!
        }
        _exclamationmarkTriangle = Builder(name = "ExclamationmarkTriangle", defaultWidth =
                24.5625.dp, defaultHeight = 22.3945.dp, viewportWidth = 24.5625f, viewportHeight =
                22.3945f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1992f, 22.2656f)
                lineTo(21.3633f, 22.2656f)
                curveTo(23.3555f, 22.2656f, 24.5625f, 20.8828f, 24.5625f, 19.0898f)
                curveTo(24.5625f, 18.5391f, 24.3984f, 17.9648f, 24.1055f, 17.4492f)
                lineTo(15.0117f, 1.6055f)
                curveTo(14.4023f, 0.5391f, 13.3594f, 0.0f, 12.2812f, 0.0f)
                curveTo(11.2031f, 0.0f, 10.1484f, 0.5391f, 9.5508f, 1.6055f)
                lineTo(0.457f, 17.4492f)
                curveTo(0.1406f, 17.9766f, 0.0f, 18.5391f, 0.0f, 19.0898f)
                curveTo(0.0f, 20.8828f, 1.207f, 22.2656f, 3.1992f, 22.2656f)
                close()
                moveTo(3.2109f, 20.4258f)
                curveTo(2.3906f, 20.4258f, 1.8984f, 19.793f, 1.8984f, 19.0781f)
                curveTo(1.8984f, 18.8555f, 1.9453f, 18.5742f, 2.0742f, 18.3281f)
                lineTo(11.1562f, 2.4961f)
                curveTo(11.4023f, 2.0625f, 11.8477f, 1.875f, 12.2812f, 1.875f)
                curveTo(12.7148f, 1.875f, 13.1484f, 2.0625f, 13.3945f, 2.4961f)
                lineTo(22.4766f, 18.3398f)
                curveTo(22.6055f, 18.5859f, 22.6641f, 18.8555f, 22.6641f, 19.0781f)
                curveTo(22.6641f, 19.793f, 22.1484f, 20.4258f, 21.3398f, 20.4258f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2812f, 14.3672f)
                curveTo(12.8438f, 14.3672f, 13.1719f, 14.0391f, 13.1836f, 13.4297f)
                lineTo(13.3477f, 7.2539f)
                curveTo(13.3594f, 6.6563f, 12.8906f, 6.2109f, 12.2695f, 6.2109f)
                curveTo(11.6367f, 6.2109f, 11.1914f, 6.6445f, 11.2031f, 7.2422f)
                lineTo(11.3555f, 13.4297f)
                curveTo(11.3672f, 14.0273f, 11.6953f, 14.3672f, 12.2812f, 14.3672f)
                close()
                moveTo(12.2812f, 18.1758f)
                curveTo(12.9609f, 18.1758f, 13.5469f, 17.6367f, 13.5469f, 16.957f)
                curveTo(13.5469f, 16.2656f, 12.9727f, 15.7383f, 12.2812f, 15.7383f)
                curveTo(11.5898f, 15.7383f, 11.0156f, 16.2773f, 11.0156f, 16.957f)
                curveTo(11.0156f, 17.625f, 11.6016f, 18.1758f, 12.2812f, 18.1758f)
                close()
            }
        }
        .build()
        return _exclamationmarkTriangle!!
    }

private var _exclamationmarkTriangle: ImageVector? = null
