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

public val CupertinoIcons.Outlined.PhoneBadgePlus: ImageVector
    get() {
        if (_phoneBadgePlus != null) {
            return _phoneBadgePlus!!
        }
        _phoneBadgePlus = Builder(name = "PhoneBadgePlus", defaultWidth = 24.4219.dp, defaultHeight
                = 26.0039.dp, viewportWidth = 24.4219f, viewportHeight = 26.0039f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8867f, 17.6602f)
                lineTo(19.4766f, 15.293f)
                curveTo(18.4219f, 14.5664f, 17.1914f, 14.4844f, 16.207f, 15.457f)
                lineTo(15.4219f, 16.2422f)
                curveTo(15.1289f, 16.5352f, 14.6953f, 16.5703f, 14.332f, 16.3359f)
                curveTo(13.9102f, 16.0781f, 12.6328f, 14.9648f, 11.7656f, 14.0977f)
                curveTo(10.8516f, 13.1953f, 9.9727f, 12.1875f, 9.6445f, 11.6602f)
                curveTo(9.4219f, 11.2852f, 9.457f, 10.8633f, 9.75f, 10.5703f)
                lineTo(10.5234f, 9.7852f)
                curveTo(11.5078f, 8.8008f, 11.4258f, 7.5586f, 10.6992f, 6.5156f)
                lineTo(8.332f, 3.1055f)
                curveTo(7.6055f, 2.0625f, 6.8203f, 1.582f, 5.9766f, 1.5703f)
                curveTo(5.2383f, 1.5586f, 4.4648f, 1.8984f, 3.6797f, 2.6016f)
                lineTo(3.3867f, 2.8594f)
                curveTo(2.0508f, 4.0547f, 1.5f, 5.4023f, 1.5f, 7.4297f)
                curveTo(1.5f, 9.0117f, 1.9805f, 10.7695f, 3.1406f, 13.0547f)
                curveTo(3.6914f, 12.8203f, 4.3008f, 12.6445f, 4.9219f, 12.5508f)
                curveTo(3.7734f, 10.3477f, 3.2695f, 8.7891f, 3.293f, 7.4297f)
                curveTo(3.3164f, 6.1406f, 3.7734f, 5.0273f, 4.6875f, 4.2305f)
                curveTo(4.7695f, 4.1602f, 4.8281f, 4.1016f, 4.9102f, 4.043f)
                curveTo(5.2617f, 3.7383f, 5.6367f, 3.5742f, 5.9766f, 3.5742f)
                curveTo(6.3164f, 3.5742f, 6.6211f, 3.7031f, 6.8438f, 4.0547f)
                lineTo(9.1172f, 7.4648f)
                curveTo(9.3633f, 7.8281f, 9.3867f, 8.2383f, 9.0234f, 8.6016f)
                lineTo(7.9922f, 9.6328f)
                curveTo(7.2188f, 10.4062f, 7.3008f, 11.4609f, 8.0742f, 12.3633f)
                curveTo(8.8359f, 13.2539f, 9.8672f, 14.2617f, 10.9219f, 15.3164f)
                curveTo(11.8828f, 16.3008f, 12.7383f, 17.1445f, 13.6289f, 17.8945f)
                curveTo(14.543f, 18.6797f, 15.5977f, 18.7617f, 16.3594f, 18.0f)
                lineTo(17.3906f, 16.9688f)
                curveTo(17.7539f, 16.6055f, 18.1523f, 16.6289f, 18.5273f, 16.8633f)
                lineTo(21.9375f, 19.1367f)
                curveTo(22.2891f, 19.3711f, 22.418f, 19.6641f, 22.418f, 20.0156f)
                curveTo(22.418f, 20.3555f, 22.2539f, 20.7305f, 21.9492f, 21.082f)
                curveTo(21.8789f, 21.1641f, 21.832f, 21.2227f, 21.7617f, 21.3047f)
                curveTo(20.9648f, 22.2188f, 19.8516f, 22.6641f, 18.5508f, 22.6875f)
                curveTo(17.1445f, 22.7109f, 15.5625f, 22.2773f, 13.4414f, 21.1055f)
                curveTo(13.3594f, 21.7266f, 13.1719f, 22.3242f, 12.9258f, 22.875f)
                curveTo(15.2695f, 24.0586f, 16.9922f, 24.4922f, 18.5391f, 24.4922f)
                curveTo(20.5898f, 24.4922f, 21.9375f, 23.9414f, 23.1211f, 22.6055f)
                curveTo(23.2148f, 22.5117f, 23.2969f, 22.4062f, 23.3906f, 22.3125f)
                curveTo(24.0938f, 21.5273f, 24.4219f, 20.7539f, 24.4219f, 20.0156f)
                curveTo(24.4219f, 19.1719f, 23.9297f, 18.3867f, 22.8867f, 17.6602f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9531f, 26.0039f)
                curveTo(9.1875f, 26.0039f, 11.918f, 23.3086f, 11.918f, 20.0508f)
                curveTo(11.918f, 16.793f, 9.2227f, 14.0977f, 5.9531f, 14.0977f)
                curveTo(2.6953f, 14.0977f, 0.0f, 16.793f, 0.0f, 20.0508f)
                curveTo(0.0f, 23.332f, 2.6953f, 26.0039f, 5.9531f, 26.0039f)
                close()
                moveTo(5.9531f, 23.7773f)
                curveTo(5.5195f, 23.7773f, 5.2383f, 23.4961f, 5.2383f, 23.0625f)
                lineTo(5.2383f, 20.7773f)
                lineTo(2.9531f, 20.7773f)
                curveTo(2.5195f, 20.7773f, 2.2266f, 20.4961f, 2.2266f, 20.0508f)
                curveTo(2.2266f, 19.6172f, 2.5195f, 19.3359f, 2.9531f, 19.3359f)
                lineTo(5.2383f, 19.3359f)
                lineTo(5.2383f, 17.0508f)
                curveTo(5.2383f, 16.6172f, 5.5195f, 16.3242f, 5.9531f, 16.3242f)
                curveTo(6.3984f, 16.3242f, 6.6797f, 16.6172f, 6.6797f, 17.0508f)
                lineTo(6.6797f, 19.3359f)
                lineTo(8.9648f, 19.3359f)
                curveTo(9.3984f, 19.3359f, 9.6797f, 19.6172f, 9.6797f, 20.0508f)
                curveTo(9.6797f, 20.4961f, 9.3984f, 20.7773f, 8.9648f, 20.7773f)
                lineTo(6.6797f, 20.7773f)
                lineTo(6.6797f, 23.0625f)
                curveTo(6.6797f, 23.4961f, 6.3984f, 23.7773f, 5.9531f, 23.7773f)
                close()
            }
        }
        .build()
        return _phoneBadgePlus!!
    }

private var _phoneBadgePlus: ImageVector? = null
