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

public val CupertinoIcons.Outlined.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 22.3366.dp, defaultHeight =
                25.4423.dp, viewportWidth = 22.3366f, viewportHeight = 25.4423f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0991f, 13.4301f)
                lineTo(10.4858f, 22.0434f)
                curveTo(8.2475f, 24.2934f, 5.2358f, 24.0708f, 3.3139f, 22.1255f)
                curveTo(1.3803f, 20.2036f, 1.1577f, 17.2153f, 3.396f, 14.9653f)
                lineTo(15.1499f, 3.2231f)
                curveTo(16.4975f, 1.8755f, 18.478f, 1.688f, 19.7671f, 2.9653f)
                curveTo(21.0444f, 4.2661f, 20.8569f, 6.2348f, 19.521f, 7.5825f)
                lineTo(8.0366f, 19.0669f)
                curveTo(7.4624f, 19.6645f, 6.7593f, 19.4887f, 6.3608f, 19.0903f)
                curveTo(5.9624f, 18.6801f, 5.7983f, 18.0005f, 6.3725f, 17.4028f)
                lineTo(14.3999f, 9.3989f)
                curveTo(14.7514f, 9.0356f, 14.7749f, 8.52f, 14.435f, 8.1802f)
                curveTo(14.0952f, 7.852f, 13.5796f, 7.8755f, 13.228f, 8.227f)
                lineTo(5.1772f, 16.2778f)
                curveTo(3.9819f, 17.4731f, 4.0288f, 19.3012f, 5.0835f, 20.3559f)
                curveTo(6.2319f, 21.5044f, 7.9663f, 21.4809f, 9.1733f, 20.2739f)
                lineTo(20.7046f, 8.7427f)
                curveTo(22.896f, 6.5512f, 22.8022f, 3.6684f, 20.8921f, 1.7583f)
                curveTo(19.0288f, -0.105f, 16.0991f, -0.2456f, 13.9077f, 1.9458f)
                lineTo(2.0952f, 13.77f)
                curveTo(-0.7993f, 16.6645f, -0.5767f, 20.8012f, 2.0366f, 23.4145f)
                curveTo(4.6499f, 26.0161f, 8.7866f, 26.2387f, 11.6811f, 23.3559f)
                lineTo(20.353f, 14.6841f)
                curveTo(20.6928f, 14.3442f, 20.6928f, 13.7231f, 20.3413f, 13.4067f)
                curveTo(20.0014f, 13.0434f, 19.4507f, 13.0903f, 19.0991f, 13.4301f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
