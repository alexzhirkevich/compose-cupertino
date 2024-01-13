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

public val CupertinoIcons.Filled.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 15.9961.dp, defaultHeight = 23.6133.dp,
                viewportWidth = 15.9961f, viewportHeight = 23.6133f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6367f, 22.9922f)
                lineTo(13.3594f, 22.9922f)
                curveTo(15.082f, 22.9922f, 15.9961f, 22.0547f, 15.9961f, 20.2031f)
                lineTo(15.9961f, 12.1289f)
                curveTo(15.9961f, 10.2773f, 15.082f, 9.3516f, 13.3594f, 9.3516f)
                lineTo(2.6367f, 9.3516f)
                curveTo(0.9141f, 9.3516f, 0.0f, 10.2773f, 0.0f, 12.1289f)
                lineTo(0.0f, 20.2031f)
                curveTo(0.0f, 22.0547f, 0.9141f, 22.9922f, 2.6367f, 22.9922f)
                close()
                moveTo(2.0508f, 10.2539f)
                lineTo(3.9141f, 10.2539f)
                lineTo(3.9141f, 6.293f)
                curveTo(3.9141f, 3.3398f, 5.8008f, 1.7695f, 7.9922f, 1.7695f)
                curveTo(10.1836f, 1.7695f, 12.0938f, 3.3398f, 12.0938f, 6.293f)
                lineTo(12.0938f, 10.2539f)
                lineTo(13.9453f, 10.2539f)
                lineTo(13.9453f, 6.5508f)
                curveTo(13.9453f, 2.1445f, 11.0625f, 0.0f, 7.9922f, 0.0f)
                curveTo(4.9336f, 0.0f, 2.0508f, 2.1445f, 2.0508f, 6.5508f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
