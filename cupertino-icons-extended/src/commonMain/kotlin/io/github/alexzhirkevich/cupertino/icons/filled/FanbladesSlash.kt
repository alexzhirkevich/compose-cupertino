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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Filled.FanbladesSlash: ImageVector
    get() {
        if (_fanbladesSlash != null) {
            return _fanbladesSlash!!
        }
        _fanbladesSlash = Builder(name = "FanbladesSlash", defaultWidth = 25.207.dp, defaultHeight =
                25.2305.dp, viewportWidth = 25.207f, viewportHeight = 25.2305f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5039f, 0.832f)
                curveTo(15.4219f, 0.832f, 13.6758f, 3.7734f, 12.1523f, 8.9531f)
                lineTo(14.9648f, 11.7539f)
                lineTo(21.8789f, 11.7539f)
                curveTo(24.0352f, 11.7539f, 25.207f, 10.5938f, 25.207f, 8.5078f)
                curveTo(25.1953f, 4.7578f, 21.8086f, 0.832f, 18.5039f, 0.832f)
                close()
                moveTo(6.7148f, 24.3633f)
                curveTo(9.7969f, 24.3633f, 11.4961f, 21.4453f, 13.0664f, 16.3008f)
                lineTo(10.2188f, 13.4648f)
                lineTo(3.3516f, 13.4648f)
                curveTo(1.1602f, 13.4648f, 0.0f, 14.5898f, 0.0f, 16.6992f)
                curveTo(0.0117f, 20.4609f, 3.3984f, 24.3633f, 6.7148f, 24.3633f)
                close()
                moveTo(8.5313f, 0.0f)
                curveTo(7.125f, 0.0f, 5.6953f, 0.4922f, 4.4883f, 1.2773f)
                lineTo(11.7656f, 8.5547f)
                lineTo(11.7656f, 3.3516f)
                curveTo(11.7656f, 1.1953f, 10.6055f, 0.0f, 8.5313f, 0.0f)
                close()
                moveTo(0.8555f, 6.7148f)
                curveTo(0.8555f, 10.0898f, 4.3711f, 11.8008f, 10.3594f, 13.5938f)
                lineTo(1.3711f, 4.5938f)
                curveTo(1.043f, 5.2734f, 0.8555f, 5.9883f, 0.8555f, 6.7148f)
                close()
                moveTo(24.375f, 18.5039f)
                curveTo(24.375f, 15.1289f, 20.8477f, 13.418f, 14.8242f, 11.625f)
                lineTo(23.8594f, 20.6602f)
                curveTo(24.1875f, 19.9688f, 24.375f, 19.2305f, 24.375f, 18.5039f)
                close()
                moveTo(16.7109f, 25.2188f)
                curveTo(18.1172f, 25.207f, 19.5234f, 24.75f, 20.7305f, 23.9648f)
                lineTo(13.4648f, 16.6992f)
                lineTo(13.4648f, 21.8789f)
                curveTo(13.4648f, 24.0352f, 14.625f, 25.2188f, 16.7109f, 25.2188f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.7227f, 24.0117f)
                curveTo(23.0742f, 24.3633f, 23.6484f, 24.3516f, 24.0f, 24.0f)
                curveTo(24.3398f, 23.6484f, 24.3516f, 23.0742f, 24.0f, 22.7227f)
                lineTo(2.4961f, 1.2305f)
                curveTo(2.1445f, 0.8789f, 1.5703f, 0.8672f, 1.207f, 1.2305f)
                curveTo(0.8672f, 1.5703f, 0.8672f, 2.1563f, 1.207f, 2.5078f)
                close()
            }
        }
        .build()
        return _fanbladesSlash!!
    }

private var _fanbladesSlash: ImageVector? = null
