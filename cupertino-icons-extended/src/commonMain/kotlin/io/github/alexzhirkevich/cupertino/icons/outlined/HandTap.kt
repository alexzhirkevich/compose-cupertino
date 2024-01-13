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

public val CupertinoIcons.Outlined.HandTap: ImageVector
    get() {
        if (_handTap != null) {
            return _handTap!!
        }
        _handTap = Builder(name = "HandTap", defaultWidth = 22.2879.dp, defaultHeight = 29.8008.dp,
                viewportWidth = 22.2879f, viewportHeight = 29.8008f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8281f, 25.7461f)
                curveTo(21.4805f, 24.0586f, 23.4609f, 19.793f, 21.5859f, 14.6367f)
                lineTo(20.7188f, 12.2344f)
                curveTo(19.793f, 9.6914f, 18.0469f, 8.6484f, 15.9961f, 9.3633f)
                curveTo(15.4453f, 8.6484f, 14.6016f, 8.4023f, 13.6875f, 8.7305f)
                curveTo(13.3477f, 8.8594f, 13.0547f, 9.0352f, 12.7734f, 9.2461f)
                curveTo(12.1758f, 8.4727f, 11.25f, 8.1914f, 10.2891f, 8.5313f)
                curveTo(10.0312f, 8.625f, 9.7852f, 8.7656f, 9.5508f, 8.9297f)
                lineTo(8.2148f, 5.2734f)
                curveTo(7.7109f, 3.8789f, 6.457f, 3.293f, 5.1563f, 3.7617f)
                curveTo(3.832f, 4.2422f, 3.2461f, 5.4961f, 3.75f, 6.8906f)
                lineTo(7.0898f, 16.0781f)
                curveTo(7.1133f, 16.1367f, 7.1016f, 16.1836f, 7.043f, 16.207f)
                curveTo(7.0078f, 16.2305f, 6.9609f, 16.207f, 6.9258f, 16.1719f)
                lineTo(5.5547f, 14.6719f)
                curveTo(4.875f, 13.9453f, 4.0547f, 13.7227f, 3.2695f, 14.0039f)
                curveTo(2.2031f, 14.4023f, 1.5117f, 15.4219f, 1.957f, 16.6289f)
                curveTo(2.0625f, 16.9688f, 2.2969f, 17.3789f, 2.5664f, 17.7188f)
                lineTo(6.4922f, 22.4648f)
                curveTo(9.4688f, 26.0508f, 12.9375f, 27.1641f, 16.8281f, 25.7461f)
                close()
                moveTo(16.3242f, 24.2109f)
                curveTo(13.2539f, 25.3359f, 10.3828f, 24.7617f, 7.6641f, 21.4922f)
                lineTo(3.7383f, 16.7695f)
                curveTo(3.6211f, 16.6289f, 3.5391f, 16.5f, 3.4688f, 16.3008f)
                curveTo(3.3281f, 15.9258f, 3.4922f, 15.4922f, 3.9375f, 15.3281f)
                curveTo(4.3125f, 15.1992f, 4.6172f, 15.3398f, 4.9102f, 15.6562f)
                lineTo(7.6289f, 18.457f)
                curveTo(8.0742f, 18.9258f, 8.4727f, 18.9727f, 8.8711f, 18.832f)
                curveTo(9.3281f, 18.668f, 9.5156f, 18.1758f, 9.3398f, 17.6719f)
                lineTo(5.1797f, 6.2578f)
                curveTo(5.0039f, 5.7891f, 5.2148f, 5.3438f, 5.6719f, 5.1797f)
                curveTo(6.1172f, 5.0156f, 6.5508f, 5.2383f, 6.7148f, 5.707f)
                lineTo(9.6797f, 13.8516f)
                curveTo(9.8203f, 14.2383f, 10.2539f, 14.4141f, 10.6406f, 14.2734f)
                curveTo(11.0156f, 14.1328f, 11.2266f, 13.7227f, 11.0859f, 13.3477f)
                lineTo(10.0195f, 10.4062f)
                curveTo(10.1719f, 10.2539f, 10.4062f, 10.1016f, 10.6172f, 10.0195f)
                curveTo(11.168f, 9.8203f, 11.625f, 10.0664f, 11.8359f, 10.6406f)
                lineTo(12.7734f, 13.207f)
                curveTo(12.9141f, 13.6055f, 13.3594f, 13.7578f, 13.7344f, 13.6172f)
                curveTo(14.0859f, 13.4883f, 14.3203f, 13.1016f, 14.168f, 12.6914f)
                lineTo(13.418f, 10.6055f)
                curveTo(13.5703f, 10.4531f, 13.793f, 10.3008f, 14.0156f, 10.2188f)
                curveTo(14.5664f, 10.0195f, 15.0234f, 10.2656f, 15.2344f, 10.8398f)
                lineTo(15.8555f, 12.5508f)
                curveTo(16.0078f, 12.9609f, 16.4414f, 13.1133f, 16.8164f, 12.9727f)
                curveTo(17.1797f, 12.8438f, 17.4023f, 12.4453f, 17.2617f, 12.0469f)
                lineTo(16.8047f, 10.7812f)
                curveTo(17.7773f, 10.4297f, 18.7031f, 11.2266f, 19.3359f, 12.9844f)
                lineTo(20.0742f, 14.9883f)
                curveTo(21.6797f, 19.418f, 20.2266f, 22.793f, 16.3242f, 24.2109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8594f, 0.0f)
                curveTo(2.625f, 0.0f, 0.0f, 2.625f, 0.0f, 5.8594f)
                curveTo(0.0f, 7.2539f, 0.4922f, 8.543f, 1.3008f, 9.5508f)
                curveTo(1.5f, 9.7969f, 1.7344f, 9.8906f, 1.957f, 9.8906f)
                curveTo(2.5313f, 9.8906f, 3.0234f, 9.2109f, 2.5313f, 8.625f)
                curveTo(1.8984f, 7.875f, 1.5352f, 6.9141f, 1.5352f, 5.8594f)
                curveTo(1.5352f, 3.4688f, 3.4688f, 1.5352f, 5.8594f, 1.5352f)
                curveTo(8.25f, 1.5352f, 10.1719f, 3.4688f, 10.1719f, 5.8594f)
                curveTo(10.1719f, 5.9297f, 10.1719f, 6.0f, 10.1719f, 6.1055f)
                curveTo(10.1836f, 6.6328f, 10.5469f, 6.8672f, 10.9219f, 6.8672f)
                curveTo(11.2852f, 6.8672f, 11.6602f, 6.6094f, 11.6953f, 6.1992f)
                curveTo(11.707f, 6.1172f, 11.707f, 6.0117f, 11.707f, 5.8594f)
                curveTo(11.707f, 2.625f, 9.0938f, 0.0f, 5.8594f, 0.0f)
                close()
            }
        }
        .build()
        return _handTap!!
    }

private var _handTap: ImageVector? = null
