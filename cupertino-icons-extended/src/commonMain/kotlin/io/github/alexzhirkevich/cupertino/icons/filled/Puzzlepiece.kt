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

public val CupertinoIcons.Filled.Puzzlepiece: ImageVector
    get() {
        if (_puzzlepiece != null) {
            return _puzzlepiece!!
        }
        _puzzlepiece = Builder(name = "Puzzlepiece", defaultWidth = 33.9375.dp, defaultHeight =
                22.6055.dp, viewportWidth = 33.9375f, viewportHeight = 22.6055f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.2852f)
                curveTo(0.0f, 13.6758f, 1.6875f, 14.9883f, 3.5859f, 14.9883f)
                curveTo(4.3828f, 14.9883f, 4.9805f, 14.7656f, 5.6953f, 14.3203f)
                curveTo(6.3633f, 13.9102f, 6.8438f, 14.1562f, 6.8438f, 14.7305f)
                lineTo(6.8438f, 19.0664f)
                curveTo(6.8438f, 21.375f, 8.0625f, 22.5586f, 10.3945f, 22.5586f)
                lineTo(13.5234f, 22.5586f)
                curveTo(14.0859f, 22.5586f, 14.332f, 22.0898f, 13.9336f, 21.4219f)
                curveTo(13.4766f, 20.707f, 13.2539f, 20.1094f, 13.2539f, 19.3125f)
                curveTo(13.2539f, 17.4141f, 14.5781f, 15.7266f, 16.9688f, 15.7266f)
                curveTo(19.3594f, 15.7266f, 20.6719f, 17.4141f, 20.6719f, 19.3125f)
                curveTo(20.6719f, 20.1094f, 20.4492f, 20.707f, 20.0039f, 21.4219f)
                curveTo(19.6055f, 22.0898f, 19.8398f, 22.5586f, 20.4141f, 22.5586f)
                lineTo(23.543f, 22.5586f)
                curveTo(25.875f, 22.5586f, 27.0938f, 21.375f, 27.0938f, 19.0664f)
                lineTo(27.0938f, 14.7305f)
                curveTo(27.0938f, 14.1562f, 27.5742f, 13.9102f, 28.2305f, 14.3203f)
                curveTo(28.957f, 14.7656f, 29.5547f, 14.9883f, 30.3398f, 14.9883f)
                curveTo(32.25f, 14.9883f, 33.9375f, 13.6758f, 33.9375f, 11.2852f)
                curveTo(33.9375f, 8.8828f, 32.25f, 7.5703f, 30.3398f, 7.5703f)
                curveTo(29.5547f, 7.5703f, 28.957f, 7.793f, 28.2305f, 8.2383f)
                curveTo(27.5742f, 8.6484f, 27.0938f, 8.4023f, 27.0938f, 7.8281f)
                lineTo(27.0938f, 3.4922f)
                curveTo(27.0938f, 1.1953f, 25.875f, 0.0f, 23.543f, 0.0f)
                lineTo(20.4141f, 0.0f)
                curveTo(19.8398f, 0.0f, 19.6055f, 0.4805f, 20.0039f, 1.1484f)
                curveTo(20.4492f, 1.8633f, 20.6719f, 2.4609f, 20.6719f, 3.2578f)
                curveTo(20.6719f, 5.1563f, 19.3594f, 6.8438f, 16.9688f, 6.8438f)
                curveTo(14.5781f, 6.8438f, 13.2539f, 5.1563f, 13.2539f, 3.2578f)
                curveTo(13.2539f, 2.4609f, 13.4766f, 1.8633f, 13.9336f, 1.1484f)
                curveTo(14.332f, 0.4805f, 14.0859f, 0.0f, 13.5234f, 0.0f)
                lineTo(10.3945f, 0.0f)
                curveTo(8.0625f, 0.0f, 6.8438f, 1.1953f, 6.8438f, 3.4922f)
                lineTo(6.8438f, 7.8281f)
                curveTo(6.8438f, 8.4023f, 6.3633f, 8.6484f, 5.6953f, 8.2383f)
                curveTo(4.9805f, 7.793f, 4.3828f, 7.5703f, 3.5859f, 7.5703f)
                curveTo(1.6875f, 7.5703f, 0.0f, 8.8828f, 0.0f, 11.2852f)
                close()
            }
        }
        .build()
        return _puzzlepiece!!
    }

private var _puzzlepiece: ImageVector? = null
