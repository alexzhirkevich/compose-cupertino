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

public val CupertinoIcons.Outlined.Bitcoinsign: ImageVector
    get() {
        if (_bitcoinsign != null) {
            return _bitcoinsign!!
        }
        _bitcoinsign = Builder(name = "Bitcoinsign", defaultWidth = 14.1094.dp, defaultHeight =
                26.8711.dp, viewportWidth = 14.1094f, viewportHeight = 26.8711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4531f, 23.9297f)
                lineTo(7.0898f, 23.9297f)
                curveTo(11.4727f, 23.9297f, 14.1094f, 21.7852f, 14.1094f, 18.1992f)
                curveTo(14.1094f, 15.375f, 12.1758f, 13.418f, 9.3164f, 13.0664f)
                lineTo(9.3164f, 12.9727f)
                curveTo(11.4492f, 12.5859f, 13.043f, 10.5938f, 13.043f, 8.3555f)
                curveTo(13.043f, 5.2734f, 10.6406f, 3.2227f, 7.0664f, 3.2227f)
                lineTo(1.4531f, 3.2227f)
                curveTo(0.5742f, 3.2227f, 0.0f, 3.7969f, 0.0f, 4.6758f)
                lineTo(0.0f, 22.4766f)
                curveTo(0.0f, 23.3555f, 0.5742f, 23.9297f, 1.4531f, 23.9297f)
                close()
                moveTo(2.2383f, 12.2695f)
                lineTo(2.2383f, 5.1914f)
                lineTo(6.5508f, 5.1914f)
                curveTo(9.2109f, 5.1914f, 10.8047f, 6.4102f, 10.8047f, 8.5898f)
                curveTo(10.8047f, 10.9688f, 9.0117f, 12.2695f, 5.9063f, 12.2695f)
                close()
                moveTo(2.2383f, 21.9609f)
                lineTo(2.2383f, 14.25f)
                lineTo(6.4688f, 14.25f)
                curveTo(9.9375f, 14.25f, 11.8359f, 15.5742f, 11.8359f, 18.1055f)
                curveTo(11.8359f, 20.625f, 9.9961f, 21.9609f, 6.7383f, 21.9609f)
                close()
                moveTo(4.3242f, 4.5586f)
                lineTo(4.3242f, 1.1367f)
                curveTo(4.3242f, 0.7148f, 3.9844f, 0.3633f, 3.5625f, 0.3633f)
                curveTo(3.1289f, 0.3633f, 2.7891f, 0.7148f, 2.7891f, 1.1367f)
                lineTo(2.7891f, 4.5586f)
                close()
                moveTo(8.0156f, 4.5586f)
                lineTo(8.0156f, 1.1367f)
                curveTo(8.0156f, 0.7148f, 7.6758f, 0.3633f, 7.2422f, 0.3633f)
                curveTo(6.8203f, 0.3633f, 6.4805f, 0.7148f, 6.4805f, 1.1367f)
                lineTo(6.4805f, 4.5586f)
                close()
                moveTo(4.3242f, 22.6055f)
                lineTo(2.7891f, 22.6055f)
                lineTo(2.7891f, 26.1094f)
                curveTo(2.7891f, 26.5312f, 3.1289f, 26.8711f, 3.5625f, 26.8711f)
                curveTo(3.9844f, 26.8711f, 4.3242f, 26.5312f, 4.3242f, 26.1094f)
                close()
                moveTo(8.0156f, 22.6055f)
                lineTo(6.4805f, 22.6055f)
                lineTo(6.4805f, 26.1094f)
                curveTo(6.4805f, 26.5312f, 6.8203f, 26.8711f, 7.2422f, 26.8711f)
                curveTo(7.6758f, 26.8711f, 8.0156f, 26.5312f, 8.0156f, 26.1094f)
                close()
            }
        }
        .build()
        return _bitcoinsign!!
    }

private var _bitcoinsign: ImageVector? = null
