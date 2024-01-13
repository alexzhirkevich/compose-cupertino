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

public val CupertinoIcons.Filled.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) {
            return _pauseCircle!!
        }
        _pauseCircle = Builder(name = "PauseCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(8.543f, 16.6641f)
                curveTo(7.9453f, 16.6641f, 7.6758f, 16.3359f, 7.6758f, 15.8672f)
                lineTo(7.6758f, 8.0156f)
                curveTo(7.6758f, 7.5586f, 7.9453f, 7.2305f, 8.543f, 7.2305f)
                lineTo(9.7266f, 7.2305f)
                curveTo(10.3359f, 7.2305f, 10.6055f, 7.5586f, 10.6055f, 8.0156f)
                lineTo(10.6055f, 15.8672f)
                curveTo(10.6055f, 16.3359f, 10.3359f, 16.6641f, 9.7266f, 16.6641f)
                close()
                moveTo(14.2031f, 16.6641f)
                curveTo(13.5938f, 16.6641f, 13.3242f, 16.3359f, 13.3242f, 15.8672f)
                lineTo(13.3242f, 8.0156f)
                curveTo(13.3242f, 7.5586f, 13.5938f, 7.2305f, 14.2031f, 7.2305f)
                lineTo(15.3867f, 7.2305f)
                curveTo(15.9727f, 7.2305f, 16.2422f, 7.5586f, 16.2422f, 8.0156f)
                lineTo(16.2422f, 15.8672f)
                curveTo(16.2422f, 16.3359f, 15.9727f, 16.6641f, 15.3867f, 16.6641f)
                close()
            }
        }
        .build()
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
