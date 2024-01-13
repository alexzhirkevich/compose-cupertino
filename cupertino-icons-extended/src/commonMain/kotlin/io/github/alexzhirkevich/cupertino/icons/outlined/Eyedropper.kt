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

public val CupertinoIcons.Outlined.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 24.4597.dp, defaultHeight =
                24.8555.dp, viewportWidth = 24.4597f, viewportHeight = 24.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5859f, 10.7227f)
                lineTo(4.957f, 21.3398f)
                curveTo(4.5469f, 21.7617f, 4.0078f, 21.8906f, 3.6094f, 21.457f)
                curveTo(3.1758f, 20.9883f, 3.2695f, 20.543f, 3.7266f, 20.0742f)
                lineTo(14.3203f, 9.4336f)
                lineTo(13.3125f, 8.4375f)
                lineTo(3.8438f, 17.9062f)
                curveTo(0.2227f, 21.5273f, 1.9688f, 20.9648f, 0.0f, 23.7422f)
                lineTo(1.0547f, 24.8555f)
                curveTo(3.7383f, 22.8984f, 3.375f, 24.8203f, 7.0547f, 21.1523f)
                lineTo(16.5586f, 11.707f)
                close()
                moveTo(18.375f, 12.8438f)
                lineTo(18.7031f, 12.4805f)
                curveTo(19.2773f, 11.8828f, 19.3125f, 11.1797f, 18.6914f, 10.5703f)
                lineTo(18.3398f, 10.2305f)
                curveTo(20.1328f, 8.625f, 22.125f, 8.4023f, 23.3555f, 7.1484f)
                curveTo(25.1016f, 5.3906f, 24.5391f, 2.9297f, 23.3086f, 1.6992f)
                curveTo(22.0898f, 0.457f, 19.6523f, -0.0703f, 17.8594f, 1.6523f)
                curveTo(16.5938f, 2.8711f, 16.3828f, 4.875f, 14.7773f, 6.668f)
                lineTo(14.4375f, 6.3164f)
                curveTo(13.8398f, 5.707f, 13.125f, 5.7305f, 12.5273f, 6.3047f)
                lineTo(12.1758f, 6.6328f)
                curveTo(11.4492f, 7.3242f, 11.5898f, 7.9336f, 12.1992f, 8.5547f)
                lineTo(16.4531f, 12.8086f)
                curveTo(17.0742f, 13.4297f, 17.6953f, 13.5586f, 18.375f, 12.8438f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
