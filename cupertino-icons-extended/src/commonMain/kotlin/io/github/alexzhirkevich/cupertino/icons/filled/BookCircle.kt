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

public val CupertinoIcons.Filled.BookCircle: ImageVector
    get() {
        if (_bookCircle != null) {
            return _bookCircle!!
        }
        _bookCircle = Builder(name = "BookCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(8.6367f, 6.7852f)
                curveTo(9.8203f, 6.7852f, 10.8867f, 7.2656f, 11.4492f, 8.0625f)
                curveTo(11.5547f, 8.2148f, 11.5664f, 8.2383f, 11.5664f, 8.3906f)
                lineTo(11.5664f, 16.793f)
                curveTo(11.5664f, 16.9336f, 11.4609f, 17.0273f, 11.332f, 17.0273f)
                curveTo(11.2617f, 17.0273f, 11.2148f, 17.0039f, 11.1445f, 16.9453f)
                curveTo(10.4766f, 16.3828f, 9.6797f, 16.1133f, 8.8477f, 16.1133f)
                curveTo(7.875f, 16.1133f, 6.9375f, 16.4531f, 6.2578f, 17.0391f)
                curveTo(6.1406f, 17.1328f, 6.0117f, 17.1797f, 5.8594f, 17.1797f)
                curveTo(5.6016f, 17.1797f, 5.4258f, 17.0156f, 5.4258f, 16.7695f)
                lineTo(5.4258f, 8.7539f)
                curveTo(5.4258f, 8.543f, 5.4258f, 8.4727f, 5.4961f, 8.3672f)
                curveTo(6.0703f, 7.3594f, 7.3828f, 6.7852f, 8.6367f, 6.7852f)
                close()
                moveTo(15.2812f, 6.7852f)
                curveTo(16.5352f, 6.7852f, 17.8477f, 7.3594f, 18.4219f, 8.3672f)
                curveTo(18.4922f, 8.4609f, 18.5039f, 8.543f, 18.5039f, 8.7539f)
                lineTo(18.5039f, 16.7695f)
                curveTo(18.5039f, 17.0156f, 18.3164f, 17.1797f, 18.0586f, 17.1797f)
                curveTo(17.9062f, 17.1797f, 17.7891f, 17.1328f, 17.6602f, 17.0391f)
                curveTo(16.9922f, 16.4531f, 16.0547f, 16.1133f, 15.0703f, 16.1133f)
                curveTo(14.25f, 16.1133f, 13.4414f, 16.3828f, 12.7734f, 16.9453f)
                curveTo(12.7148f, 17.0039f, 12.6562f, 17.0273f, 12.5859f, 17.0273f)
                curveTo(12.457f, 17.0273f, 12.3633f, 16.9336f, 12.3633f, 16.793f)
                lineTo(12.3633f, 8.3906f)
                curveTo(12.3633f, 8.2383f, 12.3633f, 8.2148f, 12.4688f, 8.0625f)
                curveTo(13.043f, 7.2656f, 14.0977f, 6.7852f, 15.2812f, 6.7852f)
                close()
            }
        }
        .build()
        return _bookCircle!!
    }

private var _bookCircle: ImageVector? = null
