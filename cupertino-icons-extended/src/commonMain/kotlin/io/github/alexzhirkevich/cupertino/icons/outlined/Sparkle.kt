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

public val CupertinoIcons.Outlined.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 22.8281.dp, defaultHeight = 22.8164.dp,
                viewportWidth = 22.8281f, viewportHeight = 22.8164f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4141f, 22.8047f)
                curveTo(11.8477f, 22.8047f, 12.1992f, 22.4883f, 12.2695f, 22.0195f)
                curveTo(13.2773f, 14.2148f, 14.3789f, 13.1016f, 22.0078f, 12.2578f)
                curveTo(22.4883f, 12.2109f, 22.8281f, 11.8594f, 22.8281f, 11.4023f)
                curveTo(22.8281f, 10.9453f, 22.4883f, 10.5938f, 22.0078f, 10.5352f)
                curveTo(14.3789f, 9.7031f, 13.2773f, 8.5898f, 12.2695f, 0.7734f)
                curveTo(12.1992f, 0.3047f, 11.8477f, 0.0f, 11.4141f, 0.0f)
                curveTo(10.9805f, 0.0f, 10.6289f, 0.3047f, 10.5586f, 0.7734f)
                curveTo(9.5508f, 8.5898f, 8.4492f, 9.7031f, 0.8203f, 10.5352f)
                curveTo(0.3398f, 10.5938f, 0.0f, 10.9453f, 0.0f, 11.4023f)
                curveTo(0.0f, 11.8594f, 0.3398f, 12.2109f, 0.8203f, 12.2578f)
                curveTo(8.4492f, 13.2656f, 9.4805f, 14.2266f, 10.5586f, 22.0195f)
                curveTo(10.6289f, 22.4883f, 10.9805f, 22.8047f, 11.4141f, 22.8047f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
