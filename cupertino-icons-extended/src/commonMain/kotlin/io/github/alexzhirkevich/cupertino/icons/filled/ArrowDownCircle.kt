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

public val CupertinoIcons.Filled.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9648f, 5.8008f)
                curveTo(12.5039f, 5.8008f, 12.8789f, 6.1758f, 12.8789f, 6.7148f)
                lineTo(12.8789f, 12.7266f)
                lineTo(12.7734f, 15.3047f)
                lineTo(14.0039f, 13.8398f)
                lineTo(15.4219f, 12.3984f)
                curveTo(15.5859f, 12.2109f, 15.8086f, 12.1289f, 16.0664f, 12.1289f)
                curveTo(16.5703f, 12.1289f, 16.957f, 12.5039f, 16.957f, 13.0078f)
                curveTo(16.957f, 13.2656f, 16.8633f, 13.4766f, 16.6992f, 13.6406f)
                lineTo(12.6797f, 17.6484f)
                curveTo(12.4453f, 17.8828f, 12.2344f, 18.0f, 11.9648f, 18.0f)
                curveTo(11.707f, 18.0f, 11.5078f, 17.8945f, 11.2617f, 17.6484f)
                lineTo(7.2305f, 13.6406f)
                curveTo(7.0664f, 13.4766f, 6.9961f, 13.2656f, 6.9961f, 13.0078f)
                curveTo(6.9961f, 12.5039f, 7.3711f, 12.1289f, 7.875f, 12.1289f)
                curveTo(8.1211f, 12.1289f, 8.3555f, 12.2227f, 8.5195f, 12.3984f)
                lineTo(9.9492f, 13.8398f)
                lineTo(11.1562f, 15.293f)
                lineTo(11.0508f, 12.7266f)
                lineTo(11.0508f, 6.7148f)
                curveTo(11.0508f, 6.1758f, 11.4375f, 5.8008f, 11.9648f, 5.8008f)
                close()
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
