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

public val CupertinoIcons.Filled.PuzzlepieceExtension: ImageVector
    get() {
        if (_puzzlepieceExtension != null) {
            return _puzzlepieceExtension!!
        }
        _puzzlepieceExtension = Builder(name = "PuzzlepieceExtension", defaultWidth = 27.9258.dp,
                defaultHeight = 22.6992.dp, viewportWidth = 27.9258f, viewportHeight =
                22.6992f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.1133f)
                curveTo(0.0f, 21.4336f, 1.1953f, 22.6523f, 3.5039f, 22.6523f)
                lineTo(18.0f, 22.6523f)
                curveTo(20.332f, 22.6523f, 21.5508f, 21.457f, 21.5508f, 19.1602f)
                lineTo(21.5508f, 14.2148f)
                curveTo(21.5508f, 13.9805f, 21.7383f, 13.875f, 21.9727f, 14.0625f)
                curveTo(22.6172f, 14.5547f, 23.3789f, 14.9531f, 24.3867f, 14.9531f)
                curveTo(26.3789f, 14.9531f, 27.9258f, 13.3828f, 27.9258f, 11.3672f)
                curveTo(27.9258f, 9.3633f, 26.3789f, 7.793f, 24.3867f, 7.793f)
                curveTo(23.3789f, 7.793f, 22.6172f, 8.1914f, 21.9727f, 8.6836f)
                curveTo(21.7383f, 8.8711f, 21.5508f, 8.7656f, 21.5508f, 8.5313f)
                lineTo(21.5508f, 3.4922f)
                curveTo(21.5508f, 1.1953f, 20.332f, 0.0f, 18.0f, 0.0f)
                lineTo(3.5039f, 0.0f)
                curveTo(1.1953f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.5391f)
                lineTo(0.0f, 8.5664f)
                curveTo(0.0f, 9.3281f, 0.5977f, 9.832f, 1.3008f, 9.832f)
                curveTo(1.6875f, 9.832f, 2.0977f, 9.668f, 2.4609f, 9.3164f)
                curveTo(3.0117f, 8.8008f, 3.6914f, 8.1445f, 5.0508f, 8.1445f)
                curveTo(6.8203f, 8.1445f, 8.2148f, 9.5508f, 8.2148f, 11.3438f)
                curveTo(8.2148f, 13.1367f, 6.8203f, 14.543f, 5.0508f, 14.543f)
                curveTo(3.6914f, 14.543f, 3.0117f, 13.875f, 2.4609f, 13.3594f)
                curveTo(2.0977f, 13.0195f, 1.6875f, 12.8555f, 1.3008f, 12.8555f)
                curveTo(0.5977f, 12.8555f, 0.0f, 13.3594f, 0.0f, 14.1211f)
                close()
            }
        }
        .build()
        return _puzzlepieceExtension!!
    }

private var _puzzlepieceExtension: ImageVector? = null
