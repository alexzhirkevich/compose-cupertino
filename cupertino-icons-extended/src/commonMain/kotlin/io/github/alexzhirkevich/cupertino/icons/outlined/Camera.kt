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

public val CupertinoIcons.Outlined.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 28.7812.dp, defaultHeight = 23.0977.dp,
                viewportWidth = 28.7812f, viewportHeight = 23.0977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 22.3477f)
                lineTo(25.1016f, 22.3477f)
                curveTo(27.5391f, 22.3477f, 28.7812f, 21.1289f, 28.7812f, 18.7148f)
                lineTo(28.7812f, 6.4453f)
                curveTo(28.7812f, 4.0313f, 27.5391f, 2.8242f, 25.1016f, 2.8242f)
                lineTo(21.75f, 2.8242f)
                curveTo(20.8242f, 2.8242f, 20.543f, 2.6367f, 20.0156f, 2.0508f)
                lineTo(19.0781f, 0.9961f)
                curveTo(18.4922f, 0.3516f, 17.8945f, 0.0f, 16.6875f, 0.0f)
                lineTo(12.0117f, 0.0f)
                curveTo(10.8047f, 0.0f, 10.207f, 0.3516f, 9.6211f, 0.9961f)
                lineTo(8.6836f, 2.0508f)
                curveTo(8.1563f, 2.625f, 7.8633f, 2.8242f, 6.9492f, 2.8242f)
                lineTo(3.6797f, 2.8242f)
                curveTo(1.2305f, 2.8242f, 0.0f, 4.0313f, 0.0f, 6.4453f)
                lineTo(0.0f, 18.7148f)
                curveTo(0.0f, 21.1289f, 1.2305f, 22.3477f, 3.6797f, 22.3477f)
                close()
                moveTo(3.7031f, 20.4609f)
                curveTo(2.5547f, 20.4609f, 1.8867f, 19.8398f, 1.8867f, 18.6211f)
                lineTo(1.8867f, 6.5508f)
                curveTo(1.8867f, 5.332f, 2.5547f, 4.7109f, 3.7031f, 4.7109f)
                lineTo(7.418f, 4.7109f)
                curveTo(8.4727f, 4.7109f, 9.0469f, 4.5117f, 9.6328f, 3.8555f)
                lineTo(10.5469f, 2.8242f)
                curveTo(11.2148f, 2.0742f, 11.5664f, 1.8867f, 12.5977f, 1.8867f)
                lineTo(16.1016f, 1.8867f)
                curveTo(17.1328f, 1.8867f, 17.4844f, 2.0742f, 18.1523f, 2.8242f)
                lineTo(19.0664f, 3.8555f)
                curveTo(19.6523f, 4.5117f, 20.2266f, 4.7109f, 21.2812f, 4.7109f)
                lineTo(25.0664f, 4.7109f)
                curveTo(26.2266f, 4.7109f, 26.8945f, 5.332f, 26.8945f, 6.5508f)
                lineTo(26.8945f, 18.6211f)
                curveTo(26.8945f, 19.8398f, 26.2266f, 20.4609f, 25.0664f, 20.4609f)
                close()
                moveTo(14.3906f, 18.7734f)
                curveTo(17.9297f, 18.7734f, 20.7773f, 15.9375f, 20.7773f, 12.3633f)
                curveTo(20.7773f, 8.8008f, 17.9414f, 5.9648f, 14.3906f, 5.9648f)
                curveTo(10.8398f, 5.9648f, 7.9922f, 8.8008f, 7.9922f, 12.3633f)
                curveTo(7.9922f, 15.9375f, 10.8398f, 18.7734f, 14.3906f, 18.7734f)
                close()
                moveTo(14.3906f, 16.9922f)
                curveTo(11.8477f, 16.9922f, 9.7617f, 14.9414f, 9.7617f, 12.3633f)
                curveTo(9.7617f, 9.7969f, 11.8359f, 7.7344f, 14.3906f, 7.7344f)
                curveTo(16.9453f, 7.7344f, 19.0078f, 9.7969f, 19.0078f, 12.3633f)
                curveTo(19.0078f, 14.9414f, 16.9453f, 16.9922f, 14.3906f, 16.9922f)
                close()
                moveTo(21.2578f, 8.0508f)
                curveTo(21.2578f, 8.8711f, 21.9375f, 9.5156f, 22.7344f, 9.5156f)
                curveTo(23.5195f, 9.5156f, 24.1875f, 8.8594f, 24.1875f, 8.0508f)
                curveTo(24.1875f, 7.2773f, 23.5195f, 6.5977f, 22.7344f, 6.5977f)
                curveTo(21.9375f, 6.5977f, 21.2578f, 7.2773f, 21.2578f, 8.0508f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
