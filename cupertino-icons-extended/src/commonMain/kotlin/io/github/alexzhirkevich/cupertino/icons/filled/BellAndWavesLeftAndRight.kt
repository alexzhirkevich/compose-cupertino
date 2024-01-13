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

public val CupertinoIcons.Filled.BellAndWavesLeftAndRight: ImageVector
    get() {
        if (_bellAndWavesLeftAndRight != null) {
            return _bellAndWavesLeftAndRight!!
        }
        _bellAndWavesLeftAndRight = Builder(name = "BellAndWavesLeftAndRight", defaultWidth =
                41.8008.dp, defaultHeight = 24.668.dp, viewportWidth = 41.8008f, viewportHeight =
                24.668f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6133f, 19.9688f)
                lineTo(30.1875f, 19.9688f)
                curveTo(31.2891f, 19.9688f, 31.957f, 19.4062f, 31.957f, 18.5508f)
                curveTo(31.957f, 17.3789f, 30.7617f, 16.3242f, 29.7539f, 15.2812f)
                curveTo(28.9805f, 14.4727f, 28.7695f, 12.8086f, 28.6758f, 11.4609f)
                curveTo(28.5938f, 6.9609f, 27.3984f, 3.8672f, 24.2812f, 2.7422f)
                curveTo(23.8359f, 1.207f, 22.6289f, 0.0f, 20.8945f, 0.0f)
                curveTo(19.1719f, 0.0f, 17.9531f, 1.207f, 17.5195f, 2.7422f)
                curveTo(14.4023f, 3.8672f, 13.207f, 6.9609f, 13.125f, 11.4609f)
                curveTo(13.0312f, 12.8086f, 12.8203f, 14.4727f, 12.0469f, 15.2812f)
                curveTo(11.0273f, 16.3242f, 9.8438f, 17.3789f, 9.8438f, 18.5508f)
                curveTo(9.8438f, 19.4062f, 10.5f, 19.9688f, 11.6133f, 19.9688f)
                close()
                moveTo(20.8945f, 24.668f)
                curveTo(22.8867f, 24.668f, 24.3398f, 23.2148f, 24.4922f, 21.5742f)
                lineTo(17.3086f, 21.5742f)
                curveTo(17.4609f, 23.2148f, 18.9141f, 24.668f, 20.8945f, 24.668f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8047f, 17.0039f)
                curveTo(8.1797f, 16.582f, 8.0273f, 16.0547f, 7.6523f, 15.5508f)
                curveTo(6.9492f, 14.6719f, 6.6094f, 13.5469f, 6.6094f, 12.3281f)
                curveTo(6.6094f, 11.1094f, 6.9492f, 9.9727f, 7.6523f, 9.1055f)
                curveTo(8.0273f, 8.6016f, 8.1797f, 8.0742f, 7.8047f, 7.6523f)
                curveTo(7.418f, 7.207f, 6.7148f, 7.207f, 6.3047f, 7.7344f)
                curveTo(5.2852f, 9.0f, 4.6992f, 10.6055f, 4.6992f, 12.3281f)
                curveTo(4.6992f, 14.0508f, 5.2852f, 15.6562f, 6.3047f, 16.9219f)
                curveTo(6.7148f, 17.4492f, 7.418f, 17.4375f, 7.8047f, 17.0039f)
                close()
                moveTo(33.9844f, 17.0039f)
                curveTo(34.3828f, 17.4375f, 35.0742f, 17.4492f, 35.4961f, 16.9219f)
                curveTo(36.5156f, 15.6562f, 37.1016f, 14.0508f, 37.1016f, 12.3281f)
                curveTo(37.1016f, 10.6055f, 36.5156f, 9.0f, 35.4961f, 7.7344f)
                curveTo(35.0742f, 7.207f, 34.3828f, 7.207f, 33.9844f, 7.6523f)
                curveTo(33.6211f, 8.0742f, 33.7734f, 8.6016f, 34.1484f, 9.1055f)
                curveTo(34.8398f, 9.9727f, 35.1914f, 11.1094f, 35.1914f, 12.3281f)
                curveTo(35.1914f, 13.5469f, 34.8398f, 14.6719f, 34.1484f, 15.5508f)
                curveTo(33.7734f, 16.0547f, 33.6211f, 16.582f, 33.9844f, 17.0039f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5234f, 20.3438f)
                curveTo(4.8984f, 19.9219f, 4.7813f, 19.3711f, 4.3594f, 18.8906f)
                curveTo(2.7891f, 17.1445f, 1.9102f, 14.8477f, 1.9102f, 12.3281f)
                curveTo(1.9102f, 9.8086f, 2.7891f, 7.5117f, 4.3594f, 5.7656f)
                curveTo(4.7813f, 5.2852f, 4.8984f, 4.7344f, 4.5234f, 4.3125f)
                curveTo(4.1484f, 3.8672f, 3.4922f, 3.8789f, 3.0469f, 4.3711f)
                curveTo(1.1016f, 6.4805f, 0.0f, 9.293f, 0.0f, 12.3281f)
                curveTo(0.0f, 15.3633f, 1.1016f, 18.1641f, 3.0469f, 20.2852f)
                curveTo(3.4922f, 20.7773f, 4.1484f, 20.7773f, 4.5234f, 20.3438f)
                close()
                moveTo(37.2773f, 20.3438f)
                curveTo(37.6523f, 20.7773f, 38.3086f, 20.7773f, 38.7539f, 20.2852f)
                curveTo(40.6992f, 18.1641f, 41.8008f, 15.3633f, 41.8008f, 12.3281f)
                curveTo(41.8008f, 9.293f, 40.6992f, 6.4805f, 38.7539f, 4.3711f)
                curveTo(38.3086f, 3.8789f, 37.6523f, 3.8672f, 37.2773f, 4.3125f)
                curveTo(36.9023f, 4.7344f, 37.0195f, 5.2852f, 37.4414f, 5.7656f)
                curveTo(39.0117f, 7.5117f, 39.8906f, 9.8086f, 39.8906f, 12.3281f)
                curveTo(39.8906f, 14.8477f, 39.0117f, 17.1445f, 37.4414f, 18.8906f)
                curveTo(37.0195f, 19.3711f, 36.9023f, 19.9219f, 37.2773f, 20.3438f)
                close()
            }
        }
        .build()
        return _bellAndWavesLeftAndRight!!
    }

private var _bellAndWavesLeftAndRight: ImageVector? = null
