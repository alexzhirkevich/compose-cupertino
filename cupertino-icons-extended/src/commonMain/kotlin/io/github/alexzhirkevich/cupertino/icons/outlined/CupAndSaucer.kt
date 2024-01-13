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

public val CupertinoIcons.Outlined.CupAndSaucer: ImageVector
    get() {
        if (_cupAndSaucer != null) {
            return _cupAndSaucer!!
        }
        _cupAndSaucer = Builder(name = "CupAndSaucer", defaultWidth = 30.4453.dp, defaultHeight =
                22.7461.dp, viewportWidth = 30.4453f, viewportHeight = 22.7461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9453f, 12.9727f)
                curveTo(26.4492f, 13.793f, 28.6289f, 15.1289f, 28.6289f, 16.5352f)
                curveTo(28.6289f, 18.8203f, 22.793f, 20.9297f, 15.2227f, 20.9297f)
                curveTo(7.6523f, 20.9297f, 1.8164f, 18.8203f, 1.8164f, 16.5352f)
                curveTo(1.8164f, 15.1406f, 3.9375f, 13.8281f, 7.3711f, 12.9844f)
                lineTo(6.4805f, 11.3203f)
                curveTo(2.4375f, 12.3867f, 0.0f, 14.25f, 0.0f, 16.5352f)
                curveTo(0.0f, 20.2148f, 6.3281f, 22.7461f, 15.2227f, 22.7461f)
                curveTo(24.1289f, 22.7461f, 30.4453f, 20.2148f, 30.4453f, 16.5352f)
                curveTo(30.4453f, 14.1914f, 27.8672f, 12.2812f, 23.6602f, 11.2383f)
                close()
                moveTo(24.0f, 4.8398f)
                lineTo(24.0f, 7.2891f)
                curveTo(24.0f, 12.3516f, 20.7656f, 15.7969f, 15.7617f, 15.7969f)
                lineTo(14.6719f, 15.7969f)
                curveTo(9.6563f, 15.7969f, 6.4453f, 12.375f, 6.4453f, 7.2891f)
                lineTo(6.4453f, 4.8398f)
                lineTo(4.5586f, 4.8398f)
                lineTo(4.5586f, 7.2891f)
                curveTo(4.5586f, 13.3945f, 8.625f, 17.6836f, 14.6719f, 17.6836f)
                lineTo(15.7617f, 17.6836f)
                curveTo(21.8086f, 17.6836f, 25.8867f, 13.3828f, 25.8867f, 7.2891f)
                lineTo(25.8867f, 4.8398f)
                close()
                moveTo(15.2227f, 9.668f)
                curveTo(21.5742f, 9.668f, 25.8867f, 7.7109f, 25.8867f, 4.8398f)
                curveTo(25.8867f, 1.957f, 21.5859f, 0.0f, 15.2227f, 0.0f)
                curveTo(8.8594f, 0.0f, 4.5586f, 1.957f, 4.5586f, 4.8398f)
                curveTo(4.5586f, 7.7109f, 8.8711f, 9.668f, 15.2227f, 9.668f)
                close()
                moveTo(15.2227f, 7.7813f)
                curveTo(10.1719f, 7.7813f, 6.4453f, 6.5039f, 6.4453f, 4.8398f)
                curveTo(6.4453f, 3.1758f, 10.1719f, 1.8867f, 15.2227f, 1.8867f)
                curveTo(20.2734f, 1.8867f, 24.0f, 3.1758f, 24.0f, 4.8398f)
                curveTo(24.0f, 6.5039f, 20.2734f, 7.7813f, 15.2227f, 7.7813f)
                close()
                moveTo(24.5742f, 12.3516f)
                lineTo(25.5352f, 12.3516f)
                curveTo(28.2305f, 12.3516f, 29.8477f, 10.9336f, 29.8477f, 8.5781f)
                curveTo(29.8477f, 6.2461f, 28.2188f, 4.8164f, 25.5352f, 4.8164f)
                lineTo(24.75f, 4.8164f)
                lineTo(24.75f, 6.7031f)
                lineTo(25.5352f, 6.7031f)
                curveTo(27.0586f, 6.7031f, 27.9609f, 7.4063f, 27.9609f, 8.5781f)
                curveTo(27.9609f, 9.75f, 27.0586f, 10.4648f, 25.5352f, 10.4648f)
                lineTo(24.5742f, 10.4648f)
                close()
            }
        }
        .build()
        return _cupAndSaucer!!
    }

private var _cupAndSaucer: ImageVector? = null
