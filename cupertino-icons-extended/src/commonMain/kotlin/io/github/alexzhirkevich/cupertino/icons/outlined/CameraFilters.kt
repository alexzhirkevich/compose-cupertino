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

public val CupertinoIcons.Outlined.CameraFilters: ImageVector
    get() {
        if (_cameraFilters != null) {
            return _cameraFilters!!
        }
        _cameraFilters = Builder(name = "CameraFilters", defaultWidth = 25.8398.dp, defaultHeight =
                24.6211.dp, viewportWidth = 25.8398f, viewportHeight = 24.6211f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 24.6211f)
                curveTo(12.8086f, 24.6211f, 16.5f, 20.918f, 16.5f, 16.3594f)
                curveTo(16.5f, 11.8242f, 12.7969f, 8.1211f, 8.25f, 8.1211f)
                curveTo(3.7031f, 8.1211f, 0.0f, 11.8242f, 0.0f, 16.3594f)
                curveTo(0.0f, 20.918f, 3.7031f, 24.6211f, 8.25f, 24.6211f)
                close()
                moveTo(8.25f, 22.7461f)
                curveTo(4.7227f, 22.7461f, 1.875f, 19.8984f, 1.875f, 16.3594f)
                curveTo(1.875f, 12.8555f, 4.7227f, 9.9961f, 8.25f, 9.9961f)
                curveTo(11.7656f, 9.9961f, 14.625f, 12.8438f, 14.625f, 16.3594f)
                curveTo(14.625f, 19.8867f, 11.7656f, 22.7461f, 8.25f, 22.7461f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6016f, 24.6211f)
                curveTo(22.1367f, 24.6211f, 25.8398f, 20.918f, 25.8398f, 16.3594f)
                curveTo(25.8398f, 11.8242f, 22.1367f, 8.1211f, 17.6016f, 8.1211f)
                curveTo(13.043f, 8.1211f, 9.3398f, 11.8242f, 9.3398f, 16.3594f)
                curveTo(9.3398f, 20.918f, 13.043f, 24.6211f, 17.6016f, 24.6211f)
                close()
                moveTo(17.6016f, 22.7461f)
                curveTo(14.0742f, 22.7461f, 11.2148f, 19.8984f, 11.2148f, 16.3594f)
                curveTo(11.2148f, 12.8555f, 14.0742f, 9.9961f, 17.6016f, 9.9961f)
                curveTo(21.1055f, 9.9961f, 23.9648f, 12.8438f, 23.9648f, 16.3594f)
                curveTo(23.9648f, 19.8867f, 21.1289f, 22.7461f, 17.6016f, 22.7461f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9258f, 16.5703f)
                curveTo(17.4727f, 16.5703f, 21.1641f, 12.8789f, 21.1641f, 8.3203f)
                curveTo(21.1641f, 3.7734f, 17.4727f, 0.0703f, 12.9258f, 0.0703f)
                curveTo(8.3672f, 0.0703f, 4.6641f, 3.7734f, 4.6641f, 8.3203f)
                curveTo(4.6641f, 12.8789f, 8.3672f, 16.5703f, 12.9258f, 16.5703f)
                close()
                moveTo(12.9258f, 14.6953f)
                curveTo(9.3984f, 14.6953f, 6.5391f, 11.8477f, 6.5391f, 8.3203f)
                curveTo(6.5391f, 4.8047f, 9.3984f, 1.9453f, 12.9258f, 1.9453f)
                curveTo(16.4297f, 1.9453f, 19.2891f, 4.8047f, 19.2891f, 8.3203f)
                curveTo(19.2891f, 11.8477f, 16.4414f, 14.6953f, 12.9258f, 14.6953f)
                close()
            }
        }
        .build()
        return _cameraFilters!!
    }

private var _cameraFilters: ImageVector? = null
