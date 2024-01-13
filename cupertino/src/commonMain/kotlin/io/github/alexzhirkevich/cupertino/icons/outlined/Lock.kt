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

public val CupertinoIcons.Outlined.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 15.9961.dp, defaultHeight = 23.5898.dp,
                viewportWidth = 15.9961f, viewportHeight = 23.5898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6367f, 22.9805f)
                lineTo(13.3594f, 22.9805f)
                curveTo(15.082f, 22.9805f, 15.9961f, 22.043f, 15.9961f, 20.1914f)
                lineTo(15.9961f, 12.1172f)
                curveTo(15.9961f, 10.2773f, 15.082f, 9.3398f, 13.3594f, 9.3398f)
                lineTo(2.6367f, 9.3398f)
                curveTo(0.9141f, 9.3398f, 0.0f, 10.2773f, 0.0f, 12.1172f)
                lineTo(0.0f, 20.1914f)
                curveTo(0.0f, 22.043f, 0.9141f, 22.9805f, 2.6367f, 22.9805f)
                close()
                moveTo(2.6953f, 21.2109f)
                curveTo(2.1914f, 21.2109f, 1.8984f, 20.8945f, 1.8984f, 20.3203f)
                lineTo(1.8984f, 11.9883f)
                curveTo(1.8984f, 11.4141f, 2.1914f, 11.1094f, 2.6953f, 11.1094f)
                lineTo(13.3008f, 11.1094f)
                curveTo(13.8164f, 11.1094f, 14.0977f, 11.4141f, 14.0977f, 11.9883f)
                lineTo(14.0977f, 20.3203f)
                curveTo(14.0977f, 20.8945f, 13.8164f, 21.2109f, 13.3008f, 21.2109f)
                close()
                moveTo(2.0508f, 10.2422f)
                lineTo(3.9141f, 10.2422f)
                lineTo(3.9141f, 6.293f)
                curveTo(3.9141f, 3.3281f, 5.8008f, 1.7695f, 7.9922f, 1.7695f)
                curveTo(10.1836f, 1.7695f, 12.0938f, 3.3281f, 12.0938f, 6.293f)
                lineTo(12.0938f, 10.2422f)
                lineTo(13.9453f, 10.2422f)
                lineTo(13.9453f, 6.5391f)
                curveTo(13.9453f, 2.1328f, 11.0625f, 0.0f, 7.9922f, 0.0f)
                curveTo(4.9336f, 0.0f, 2.0508f, 2.1328f, 2.0508f, 6.5391f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
