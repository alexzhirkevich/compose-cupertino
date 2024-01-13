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

public val CupertinoIcons.Outlined.SidebarLeft: ImageVector
    get() {
        if (_sidebarLeft != null) {
            return _sidebarLeft!!
        }
        _sidebarLeft = Builder(name = "SidebarLeft", defaultWidth = 27.6328.dp, defaultHeight =
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
                moveTo(8.9297f, 20.0742f)
                lineTo(10.7695f, 20.0742f)
                lineTo(10.7695f, 1.5586f)
                lineTo(8.9297f, 1.5586f)
                close()
                moveTo(6.6797f, 6.2578f)
                curveTo(7.0313f, 6.2578f, 7.3477f, 5.9414f, 7.3477f, 5.6016f)
                curveTo(7.3477f, 5.25f, 7.0313f, 4.9453f, 6.6797f, 4.9453f)
                lineTo(4.1602f, 4.9453f)
                curveTo(3.8086f, 4.9453f, 3.5039f, 5.25f, 3.5039f, 5.6016f)
                curveTo(3.5039f, 5.9414f, 3.8086f, 6.2578f, 4.1602f, 6.2578f)
                close()
                moveTo(6.6797f, 9.293f)
                curveTo(7.0313f, 9.293f, 7.3477f, 8.9766f, 7.3477f, 8.625f)
                curveTo(7.3477f, 8.2734f, 7.0313f, 7.9805f, 6.6797f, 7.9805f)
                lineTo(4.1602f, 7.9805f)
                curveTo(3.8086f, 7.9805f, 3.5039f, 8.2734f, 3.5039f, 8.625f)
                curveTo(3.5039f, 8.9766f, 3.8086f, 9.293f, 4.1602f, 9.293f)
                close()
                moveTo(6.6797f, 12.3164f)
                curveTo(7.0313f, 12.3164f, 7.3477f, 12.0234f, 7.3477f, 11.6719f)
                curveTo(7.3477f, 11.3203f, 7.0313f, 11.0156f, 6.6797f, 11.0156f)
                lineTo(4.1602f, 11.0156f)
                curveTo(3.8086f, 11.0156f, 3.5039f, 11.3203f, 3.5039f, 11.6719f)
                curveTo(3.5039f, 12.0234f, 3.8086f, 12.3164f, 4.1602f, 12.3164f)
                close()
            }
        }
        .build()
        return _sidebarLeft!!
    }

private var _sidebarLeft: ImageVector? = null
