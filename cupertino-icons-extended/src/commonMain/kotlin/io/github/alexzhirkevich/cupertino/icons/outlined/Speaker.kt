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

public val CupertinoIcons.Outlined.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 14.1914.dp, defaultHeight = 20.6836.dp,
                viewportWidth = 14.1914f, viewportHeight = 20.6836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.3906f, 15.1055f)
                lineTo(5.7422f, 15.1055f)
                curveTo(5.8477f, 15.1055f, 5.9414f, 15.1406f, 6.0234f, 15.2109f)
                lineTo(11.3086f, 19.9453f)
                curveTo(11.8711f, 20.4492f, 12.3047f, 20.6836f, 12.8672f, 20.6836f)
                curveTo(13.6289f, 20.6836f, 14.1914f, 20.1328f, 14.1914f, 19.3711f)
                lineTo(14.1914f, 1.3945f)
                curveTo(14.1914f, 0.6328f, 13.6289f, 0.0117f, 12.8438f, 0.0117f)
                curveTo(12.2812f, 0.0117f, 11.9297f, 0.2695f, 11.3086f, 0.8203f)
                lineTo(6.0234f, 5.5078f)
                curveTo(5.9414f, 5.5781f, 5.8477f, 5.6133f, 5.7422f, 5.6133f)
                lineTo(2.3906f, 5.6133f)
                curveTo(0.7969f, 5.6133f, 0.0f, 6.4219f, 0.0f, 8.1211f)
                lineTo(0.0f, 12.6094f)
                curveTo(0.0f, 14.3086f, 0.7969f, 15.1055f, 2.3906f, 15.1055f)
                close()
                moveTo(2.4727f, 13.3945f)
                curveTo(2.0273f, 13.3945f, 1.8281f, 13.1953f, 1.8281f, 12.7617f)
                lineTo(1.8281f, 7.9688f)
                curveTo(1.8281f, 7.5234f, 2.0273f, 7.3242f, 2.4727f, 7.3242f)
                lineTo(6.2227f, 7.3242f)
                curveTo(6.5273f, 7.3242f, 6.75f, 7.2656f, 7.0195f, 7.0195f)
                lineTo(12.0117f, 2.4844f)
                curveTo(12.0703f, 2.4258f, 12.1406f, 2.3906f, 12.2109f, 2.3906f)
                curveTo(12.293f, 2.3906f, 12.3633f, 2.4492f, 12.3633f, 2.5547f)
                lineTo(12.3633f, 18.1289f)
                curveTo(12.3633f, 18.2344f, 12.293f, 18.3047f, 12.2109f, 18.3047f)
                curveTo(12.1523f, 18.3047f, 12.082f, 18.2695f, 12.0234f, 18.2109f)
                lineTo(7.0195f, 13.6992f)
                curveTo(6.75f, 13.4648f, 6.5273f, 13.3945f, 6.2227f, 13.3945f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
