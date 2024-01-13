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

public val CupertinoIcons.Outlined.Yensign: ImageVector
    get() {
        if (_yensign != null) {
            return _yensign!!
        }
        _yensign = Builder(name = "Yensign", defaultWidth = 16.0781.dp, defaultHeight = 21.7148.dp,
                viewportWidth = 16.0781f, viewportHeight = 21.7148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0391f, 21.7031f)
                curveTo(8.6953f, 21.7031f, 9.1406f, 21.2344f, 9.1406f, 20.5664f)
                lineTo(9.1406f, 12.5273f)
                lineTo(15.8438f, 1.7227f)
                curveTo(16.0195f, 1.4531f, 16.0781f, 1.2422f, 16.0781f, 0.9844f)
                curveTo(16.0781f, 0.4219f, 15.6094f, 0.0f, 14.9883f, 0.0f)
                curveTo(14.5664f, 0.0f, 14.2383f, 0.1758f, 14.0039f, 0.5859f)
                lineTo(8.0859f, 10.5f)
                lineTo(8.0039f, 10.5f)
                lineTo(2.0859f, 0.5859f)
                curveTo(1.8398f, 0.1758f, 1.5117f, 0.0f, 1.0898f, 0.0f)
                curveTo(0.4805f, 0.0f, 0.0f, 0.4219f, 0.0f, 0.9844f)
                curveTo(0.0f, 1.2422f, 0.0703f, 1.4531f, 0.2344f, 1.7227f)
                lineTo(6.9492f, 12.5273f)
                lineTo(6.9492f, 20.5664f)
                curveTo(6.9492f, 21.2344f, 7.3945f, 21.7031f, 8.0391f, 21.7031f)
                close()
                moveTo(2.4141f, 12.7969f)
                lineTo(13.7695f, 12.7969f)
                curveTo(14.2148f, 12.7969f, 14.5078f, 12.4688f, 14.5078f, 12.0352f)
                curveTo(14.5078f, 11.6016f, 14.2148f, 11.2734f, 13.7695f, 11.2734f)
                lineTo(2.4141f, 11.2734f)
                curveTo(1.9688f, 11.2734f, 1.6758f, 11.6016f, 1.6758f, 12.0352f)
                curveTo(1.6758f, 12.4688f, 1.9688f, 12.7969f, 2.4141f, 12.7969f)
                close()
                moveTo(2.4141f, 16.8164f)
                lineTo(13.7695f, 16.8164f)
                curveTo(14.2148f, 16.8164f, 14.5078f, 16.4883f, 14.5078f, 16.0547f)
                curveTo(14.5078f, 15.6211f, 14.2266f, 15.2812f, 13.7695f, 15.2812f)
                lineTo(2.4141f, 15.2812f)
                curveTo(1.9688f, 15.2812f, 1.6758f, 15.6211f, 1.6758f, 16.0547f)
                curveTo(1.6758f, 16.4766f, 1.9688f, 16.8164f, 2.4141f, 16.8164f)
                close()
            }
        }
        .build()
        return _yensign!!
    }

private var _yensign: ImageVector? = null
