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

public val CupertinoIcons.Filled.InfoCircle: ImageVector
    get() {
        if (_infoCircle != null) {
            return _infoCircle!!
        }
        _infoCircle = Builder(name = "InfoCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(9.8438f, 18.7383f)
                curveTo(9.3398f, 18.7383f, 8.9531f, 18.375f, 8.9531f, 17.8711f)
                curveTo(8.9531f, 17.4023f, 9.3398f, 17.0156f, 9.8438f, 17.0156f)
                lineTo(11.332f, 17.0156f)
                lineTo(11.332f, 11.5078f)
                lineTo(10.043f, 11.5078f)
                curveTo(9.5508f, 11.5078f, 9.1641f, 11.1445f, 9.1641f, 10.6406f)
                curveTo(9.1641f, 10.1719f, 9.5508f, 9.7852f, 10.043f, 9.7852f)
                lineTo(12.3164f, 9.7852f)
                curveTo(12.9375f, 9.7852f, 13.2656f, 10.2305f, 13.2656f, 10.8867f)
                lineTo(13.2656f, 17.0156f)
                lineTo(14.7539f, 17.0156f)
                curveTo(15.2578f, 17.0156f, 15.6445f, 17.4023f, 15.6445f, 17.8711f)
                curveTo(15.6445f, 18.375f, 15.2578f, 18.7383f, 14.7539f, 18.7383f)
                close()
                moveTo(11.8477f, 7.793f)
                curveTo(10.9688f, 7.793f, 10.2656f, 7.0898f, 10.2656f, 6.1992f)
                curveTo(10.2656f, 5.3086f, 10.9688f, 4.6055f, 11.8477f, 4.6055f)
                curveTo(12.7266f, 4.6055f, 13.418f, 5.3086f, 13.418f, 6.1992f)
                curveTo(13.418f, 7.0898f, 12.7266f, 7.793f, 11.8477f, 7.793f)
                close()
            }
        }
        .build()
        return _infoCircle!!
    }

private var _infoCircle: ImageVector? = null
