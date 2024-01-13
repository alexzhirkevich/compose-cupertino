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

public val CupertinoIcons.Outlined.Ipad: ImageVector
    get() {
        if (_ipad != null) {
            return _ipad!!
        }
        _ipad = Builder(name = "Ipad", defaultWidth = 19.582.dp, defaultHeight = 26.4258.dp,
                viewportWidth = 19.582f, viewportHeight = 26.4258f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 23.3086f)
                curveTo(0.0f, 25.1602f, 1.3008f, 26.4023f, 3.2461f, 26.4023f)
                lineTo(16.3359f, 26.4023f)
                curveTo(18.2812f, 26.4023f, 19.582f, 25.1602f, 19.582f, 23.3086f)
                lineTo(19.582f, 3.1055f)
                curveTo(19.582f, 1.2539f, 18.2812f, 0.0f, 16.3359f, 0.0f)
                lineTo(3.2461f, 0.0f)
                curveTo(1.3008f, 0.0f, 0.0f, 1.2539f, 0.0f, 3.1055f)
                close()
                moveTo(1.8867f, 22.9922f)
                lineTo(1.8867f, 3.4219f)
                curveTo(1.8867f, 2.4609f, 2.4727f, 1.8867f, 3.4805f, 1.8867f)
                lineTo(16.1016f, 1.8867f)
                curveTo(17.0977f, 1.8867f, 17.6953f, 2.4609f, 17.6953f, 3.4219f)
                lineTo(17.6953f, 22.9922f)
                curveTo(17.6953f, 23.9531f, 17.0977f, 24.5156f, 16.1016f, 24.5156f)
                lineTo(3.4805f, 24.5156f)
                curveTo(2.4727f, 24.5156f, 1.8867f, 23.9531f, 1.8867f, 22.9922f)
                close()
                moveTo(6.4688f, 23.625f)
                lineTo(13.1133f, 23.625f)
                curveTo(13.4414f, 23.625f, 13.6641f, 23.4023f, 13.6641f, 23.0742f)
                curveTo(13.6641f, 22.7461f, 13.4414f, 22.5352f, 13.1133f, 22.5352f)
                lineTo(6.4688f, 22.5352f)
                curveTo(6.1523f, 22.5352f, 5.9297f, 22.7461f, 5.9297f, 23.0742f)
                curveTo(5.9297f, 23.4023f, 6.1523f, 23.625f, 6.4688f, 23.625f)
                close()
            }
        }
        .build()
        return _ipad!!
    }

private var _ipad: ImageVector? = null
