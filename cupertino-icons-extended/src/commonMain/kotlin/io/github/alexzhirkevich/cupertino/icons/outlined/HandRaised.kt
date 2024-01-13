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

public val CupertinoIcons.Outlined.HandRaised: ImageVector
    get() {
        if (_handRaised != null) {
            return _handRaised!!
        }
        _handRaised = Builder(name = "HandRaised", defaultWidth = 19.1367.dp, defaultHeight =
                26.6836.dp, viewportWidth = 19.1367f, viewportHeight = 26.6836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2852f, 25.5117f)
                curveTo(12.3984f, 25.5117f, 15.3047f, 23.2852f, 16.8633f, 18.8906f)
                lineTo(18.9258f, 13.0898f)
                curveTo(19.0664f, 12.6914f, 19.1367f, 12.3047f, 19.1367f, 11.9531f)
                curveTo(19.1367f, 10.7109f, 18.1992f, 9.8438f, 17.0039f, 9.8438f)
                curveTo(16.1953f, 9.8438f, 15.4688f, 10.3242f, 15.0703f, 11.25f)
                lineTo(14.3086f, 13.125f)
                curveTo(14.2852f, 13.1719f, 14.25f, 13.207f, 14.2031f, 13.207f)
                curveTo(14.1445f, 13.207f, 14.1211f, 13.1602f, 14.1211f, 13.1016f)
                lineTo(14.1211f, 3.7031f)
                curveTo(14.1211f, 2.332f, 13.2656f, 1.4648f, 11.9531f, 1.4648f)
                curveTo(11.4727f, 1.4648f, 11.0391f, 1.6406f, 10.7109f, 1.9453f)
                curveTo(10.5586f, 0.7383f, 9.7852f, 0.0f, 8.625f, 0.0f)
                curveTo(7.4883f, 0.0f, 6.6914f, 0.7617f, 6.5156f, 1.9219f)
                curveTo(6.2227f, 1.6289f, 5.8008f, 1.4648f, 5.3789f, 1.4648f)
                curveTo(4.1602f, 1.4648f, 3.3516f, 2.3203f, 3.3516f, 3.6211f)
                lineTo(3.3516f, 4.9219f)
                curveTo(3.0352f, 4.5938f, 2.5547f, 4.418f, 2.0625f, 4.418f)
                curveTo(0.8438f, 4.418f, 0.0f, 5.3086f, 0.0f, 6.6328f)
                lineTo(0.0f, 16.6992f)
                curveTo(0.0f, 22.1836f, 3.3281f, 25.5117f, 8.2852f, 25.5117f)
                close()
                moveTo(8.2266f, 23.8945f)
                curveTo(4.0781f, 23.8945f, 1.5469f, 21.2227f, 1.5469f, 16.5117f)
                lineTo(1.5469f, 6.7969f)
                curveTo(1.5469f, 6.293f, 1.8633f, 5.9531f, 2.3555f, 5.9531f)
                curveTo(2.8359f, 5.9531f, 3.1875f, 6.293f, 3.1875f, 6.7969f)
                lineTo(3.1875f, 12.7852f)
                curveTo(3.1875f, 13.2188f, 3.5391f, 13.5117f, 3.9141f, 13.5117f)
                curveTo(4.3125f, 13.5117f, 4.6758f, 13.2188f, 4.6758f, 12.7852f)
                lineTo(4.6758f, 3.832f)
                curveTo(4.6758f, 3.3281f, 4.9922f, 2.9766f, 5.4727f, 2.9766f)
                curveTo(5.9648f, 2.9766f, 6.3047f, 3.3281f, 6.3047f, 3.832f)
                lineTo(6.3047f, 12.1875f)
                curveTo(6.3047f, 12.6211f, 6.6563f, 12.9141f, 7.043f, 12.9141f)
                curveTo(7.4414f, 12.9141f, 7.793f, 12.6211f, 7.793f, 12.1875f)
                lineTo(7.793f, 2.3789f)
                curveTo(7.793f, 1.875f, 8.1328f, 1.5117f, 8.625f, 1.5117f)
                curveTo(9.0938f, 1.5117f, 9.4336f, 1.875f, 9.4336f, 2.3789f)
                lineTo(9.4336f, 12.1875f)
                curveTo(9.4336f, 12.5977f, 9.7617f, 12.9141f, 10.1719f, 12.9141f)
                curveTo(10.5703f, 12.9141f, 10.9219f, 12.5977f, 10.9219f, 12.1875f)
                lineTo(10.9219f, 3.832f)
                curveTo(10.9219f, 3.3281f, 11.2617f, 2.9766f, 11.7422f, 2.9766f)
                curveTo(12.2227f, 2.9766f, 12.5625f, 3.3281f, 12.5625f, 3.832f)
                lineTo(12.5625f, 15.3633f)
                curveTo(12.5625f, 15.9492f, 12.9023f, 16.2891f, 13.3945f, 16.2891f)
                curveTo(13.8164f, 16.2891f, 14.168f, 16.1016f, 14.4375f, 15.5156f)
                lineTo(16.125f, 11.7539f)
                curveTo(16.3477f, 11.25f, 16.7812f, 11.0742f, 17.1914f, 11.2266f)
                curveTo(17.6484f, 11.3906f, 17.7891f, 11.8242f, 17.5781f, 12.3984f)
                lineTo(15.4336f, 18.3867f)
                curveTo(14.0039f, 22.3828f, 11.4961f, 23.8945f, 8.2266f, 23.8945f)
                close()
            }
        }
        .build()
        return _handRaised!!
    }

private var _handRaised: ImageVector? = null
