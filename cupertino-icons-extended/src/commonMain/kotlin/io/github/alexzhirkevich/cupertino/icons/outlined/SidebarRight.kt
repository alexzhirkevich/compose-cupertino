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

public val CupertinoIcons.Outlined.SidebarRight: ImageVector
    get() {
        if (_sidebarRight != null) {
            return _sidebarRight!!
        }
        _sidebarRight = Builder(name = "SidebarRight", defaultWidth = 27.6328.dp, defaultHeight =
                21.5977.dp, viewportWidth = 27.6328f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 21.5977f)
                lineTo(23.9531f, 21.5977f)
                curveTo(26.4141f, 21.5977f, 27.6328f, 20.3789f, 27.6328f, 17.9648f)
                lineTo(27.6328f, 3.6563f)
                curveTo(27.6328f, 1.2422f, 26.4141f, 0.0234f, 23.9531f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6563f)
                lineTo(0.0f, 17.9648f)
                curveTo(0.0f, 20.3906f, 1.2305f, 21.5977f, 3.6797f, 21.5977f)
                close()
                moveTo(3.7031f, 19.7109f)
                curveTo(2.5313f, 19.7109f, 1.8867f, 19.0898f, 1.8867f, 17.8711f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(23.9297f, 1.9102f)
                curveTo(25.0898f, 1.9102f, 25.7461f, 2.5313f, 25.7461f, 3.75f)
                lineTo(25.7461f, 17.8711f)
                curveTo(25.7461f, 19.0898f, 25.0898f, 19.7109f, 23.9297f, 19.7109f)
                close()
                moveTo(16.8984f, 20.0742f)
                lineTo(18.7383f, 20.0742f)
                lineTo(18.7383f, 1.5586f)
                lineTo(16.8984f, 1.5586f)
                close()
                moveTo(20.9883f, 6.2578f)
                lineTo(23.4961f, 6.2578f)
                curveTo(23.8594f, 6.2578f, 24.1641f, 5.9414f, 24.1641f, 5.6016f)
                curveTo(24.1641f, 5.25f, 23.8594f, 4.9453f, 23.4961f, 4.9453f)
                lineTo(20.9883f, 4.9453f)
                curveTo(20.6367f, 4.9453f, 20.3203f, 5.25f, 20.3203f, 5.6016f)
                curveTo(20.3203f, 5.9414f, 20.6367f, 6.2578f, 20.9883f, 6.2578f)
                close()
                moveTo(20.9883f, 9.293f)
                lineTo(23.4961f, 9.293f)
                curveTo(23.8594f, 9.293f, 24.1641f, 8.9766f, 24.1641f, 8.625f)
                curveTo(24.1641f, 8.2734f, 23.8594f, 7.9805f, 23.4961f, 7.9805f)
                lineTo(20.9883f, 7.9805f)
                curveTo(20.6367f, 7.9805f, 20.3203f, 8.2734f, 20.3203f, 8.625f)
                curveTo(20.3203f, 8.9766f, 20.6367f, 9.293f, 20.9883f, 9.293f)
                close()
                moveTo(20.9883f, 12.3164f)
                lineTo(23.4961f, 12.3164f)
                curveTo(23.8594f, 12.3164f, 24.1641f, 12.0234f, 24.1641f, 11.6719f)
                curveTo(24.1641f, 11.3203f, 23.8594f, 11.0156f, 23.4961f, 11.0156f)
                lineTo(20.9883f, 11.0156f)
                curveTo(20.6367f, 11.0156f, 20.3203f, 11.3203f, 20.3203f, 11.6719f)
                curveTo(20.3203f, 12.0234f, 20.6367f, 12.3164f, 20.9883f, 12.3164f)
                close()
            }
        }
        .build()
        return _sidebarRight!!
    }

private var _sidebarRight: ImageVector? = null
