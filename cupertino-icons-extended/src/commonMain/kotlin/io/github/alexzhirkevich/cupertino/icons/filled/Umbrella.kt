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

public val CupertinoIcons.Filled.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 23.3672.dp, defaultHeight =
                27.7148.dp, viewportWidth = 23.3672f, viewportHeight = 27.7148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7109f, 3.5039f)
                lineTo(12.6562f, 3.5039f)
                lineTo(12.6562f, 0.9844f)
                curveTo(12.6562f, 0.4453f, 12.2227f, 0.0f, 11.6836f, 0.0f)
                curveTo(11.1445f, 0.0f, 10.7109f, 0.4453f, 10.7109f, 0.9844f)
                close()
                moveTo(0.9727f, 14.8711f)
                curveTo(1.3125f, 14.8711f, 1.6406f, 14.6484f, 1.8984f, 14.2617f)
                curveTo(2.6836f, 13.0781f, 3.5039f, 12.5859f, 4.6172f, 12.5859f)
                curveTo(5.707f, 12.5859f, 6.4453f, 13.0781f, 7.1133f, 14.25f)
                curveTo(7.3711f, 14.6836f, 7.6172f, 14.8711f, 7.9453f, 14.8711f)
                curveTo(8.2852f, 14.8711f, 8.543f, 14.6836f, 8.7773f, 14.25f)
                curveTo(9.4102f, 13.1719f, 10.5586f, 12.5156f, 11.6836f, 12.5156f)
                curveTo(12.8086f, 12.5156f, 13.957f, 13.1719f, 14.5898f, 14.25f)
                curveTo(14.8242f, 14.6836f, 15.0703f, 14.8711f, 15.4219f, 14.8711f)
                curveTo(15.75f, 14.8711f, 15.9961f, 14.6836f, 16.2422f, 14.25f)
                curveTo(16.9219f, 13.0781f, 17.6602f, 12.5859f, 18.75f, 12.5859f)
                curveTo(19.8633f, 12.5859f, 20.6836f, 13.0781f, 21.457f, 14.2617f)
                curveTo(21.7148f, 14.6484f, 22.043f, 14.8711f, 22.3945f, 14.8711f)
                curveTo(22.9805f, 14.8711f, 23.3672f, 14.3906f, 23.3672f, 13.7578f)
                curveTo(23.3672f, 9.1055f, 19.6992f, 2.5781f, 11.6836f, 2.5781f)
                curveTo(3.668f, 2.5781f, 0.0f, 9.1055f, 0.0f, 13.7578f)
                curveTo(0.0f, 14.3906f, 0.3867f, 14.8711f, 0.9727f, 14.8711f)
                close()
                moveTo(8.9297f, 27.0938f)
                curveTo(11.0508f, 27.0938f, 12.6562f, 25.4883f, 12.6562f, 23.3555f)
                lineTo(12.6562f, 11.9531f)
                lineTo(10.7109f, 11.9531f)
                lineTo(10.7109f, 23.3555f)
                curveTo(10.7109f, 24.375f, 9.9727f, 25.1133f, 8.9297f, 25.1133f)
                curveTo(7.9102f, 25.1133f, 7.1836f, 24.375f, 7.1836f, 23.3555f)
                curveTo(7.1836f, 22.6758f, 6.7734f, 22.2188f, 6.1758f, 22.2188f)
                curveTo(5.5898f, 22.2188f, 5.2031f, 22.6758f, 5.2031f, 23.3555f)
                curveTo(5.2031f, 25.4883f, 6.8203f, 27.0938f, 8.9297f, 27.0938f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
