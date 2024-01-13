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

public val CupertinoIcons.Outlined.Alt: ImageVector
    get() {
        if (_alt != null) {
            return _alt!!
        }
        _alt = Builder(name = "Alt", defaultWidth = 23.9297.dp, defaultHeight = 21.4805.dp,
                viewportWidth = 23.9297f, viewportHeight = 21.4805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.1016f, 21.4805f)
                lineTo(6.75f, 21.4805f)
                curveTo(7.7578f, 21.4805f, 8.6016f, 20.9297f, 9.0f, 20.0156f)
                lineTo(16.6875f, 2.6836f)
                curveTo(16.875f, 2.2969f, 17.168f, 2.1211f, 17.6367f, 2.1211f)
                lineTo(22.8281f, 2.1211f)
                curveTo(23.4375f, 2.1211f, 23.9297f, 1.6406f, 23.9297f, 1.0547f)
                curveTo(23.9297f, 0.4688f, 23.4375f, 0.0f, 22.8281f, 0.0f)
                lineTo(17.1094f, 0.0f)
                curveTo(16.0312f, 0.0f, 15.3164f, 0.457f, 14.8828f, 1.4414f)
                lineTo(7.1602f, 18.7852f)
                curveTo(6.9844f, 19.1719f, 6.6797f, 19.3594f, 6.2578f, 19.3594f)
                lineTo(1.1016f, 19.3594f)
                curveTo(0.4805f, 19.3594f, 0.0f, 19.8281f, 0.0f, 20.4258f)
                curveTo(0.0f, 21.0234f, 0.4805f, 21.4805f, 1.1016f, 21.4805f)
                close()
                moveTo(15.2461f, 21.4805f)
                lineTo(22.8281f, 21.4805f)
                curveTo(23.4492f, 21.4805f, 23.918f, 21.0352f, 23.918f, 20.4375f)
                curveTo(23.918f, 19.8398f, 23.4492f, 19.3828f, 22.8281f, 19.3828f)
                lineTo(15.2461f, 19.3828f)
                curveTo(14.625f, 19.3828f, 14.1445f, 19.8398f, 14.1445f, 20.4375f)
                curveTo(14.1445f, 21.0352f, 14.625f, 21.4805f, 15.2461f, 21.4805f)
                close()
            }
        }
        .build()
        return _alt!!
    }

private var _alt: ImageVector? = null
