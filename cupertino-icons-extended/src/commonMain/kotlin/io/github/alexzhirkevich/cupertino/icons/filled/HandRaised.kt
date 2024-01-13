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

public val CupertinoIcons.Filled.HandRaised: ImageVector
    get() {
        if (_handRaised != null) {
            return _handRaised!!
        }
        _handRaised = Builder(name = "HandRaised", defaultWidth = 18.6797.dp, defaultHeight =
                25.8867.dp, viewportWidth = 18.6797f, viewportHeight = 25.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.8281f)
                curveTo(0.0f, 21.9961f, 3.3867f, 25.0547f, 8.0391f, 25.0547f)
                curveTo(11.7656f, 25.0547f, 14.0742f, 23.4961f, 15.6094f, 20.3672f)
                curveTo(16.5117f, 18.6328f, 17.2031f, 16.5469f, 17.9414f, 14.1328f)
                curveTo(18.2461f, 13.1484f, 18.6797f, 11.8945f, 18.6797f, 11.332f)
                curveTo(18.6797f, 10.6992f, 18.2227f, 10.2773f, 17.5547f, 10.2773f)
                curveTo(16.8164f, 10.2773f, 16.3711f, 10.7461f, 15.832f, 11.8594f)
                lineTo(14.2031f, 15.2812f)
                curveTo(14.0391f, 15.6562f, 13.8516f, 15.7969f, 13.6641f, 15.7969f)
                curveTo(13.418f, 15.7969f, 13.2539f, 15.6562f, 13.2539f, 15.2461f)
                lineTo(13.2539f, 2.9531f)
                curveTo(13.2539f, 2.2617f, 12.6914f, 1.6992f, 12.0f, 1.6992f)
                curveTo(11.3086f, 1.6992f, 10.7461f, 2.2617f, 10.7461f, 2.9531f)
                lineTo(10.7461f, 11.7422f)
                curveTo(10.4297f, 11.625f, 10.0781f, 11.5312f, 9.7031f, 11.4609f)
                lineTo(9.7031f, 1.2656f)
                curveTo(9.7031f, 0.5742f, 9.1406f, 0.0f, 8.4492f, 0.0f)
                curveTo(7.7578f, 0.0f, 7.1836f, 0.5742f, 7.1836f, 1.2656f)
                lineTo(7.1836f, 11.332f)
                curveTo(6.8203f, 11.3555f, 6.4453f, 11.4141f, 6.082f, 11.4727f)
                lineTo(6.082f, 2.2617f)
                curveTo(6.082f, 1.5703f, 5.5195f, 1.0078f, 4.8281f, 1.0078f)
                curveTo(4.1367f, 1.0078f, 3.5742f, 1.5703f, 3.5742f, 2.2617f)
                lineTo(3.5742f, 12.2695f)
                curveTo(3.1875f, 12.457f, 2.8359f, 12.6562f, 2.5195f, 12.8672f)
                lineTo(2.5195f, 5.9063f)
                curveTo(2.5195f, 5.2148f, 1.957f, 4.6523f, 1.2656f, 4.6523f)
                curveTo(0.5742f, 4.6523f, 0.0f, 5.2148f, 0.0f, 5.9063f)
                close()
            }
        }
        .build()
        return _handRaised!!
    }

private var _handRaised: ImageVector? = null
