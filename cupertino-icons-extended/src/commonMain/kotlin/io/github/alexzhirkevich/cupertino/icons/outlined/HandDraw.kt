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

public val CupertinoIcons.Outlined.HandDraw: ImageVector
    get() {
        if (_handDraw != null) {
            return _handDraw!!
        }
        _handDraw = Builder(name = "HandDraw", defaultWidth = 26.1551.dp, defaultHeight =
                22.8855.dp, viewportWidth = 26.1551f, viewportHeight = 22.8855f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6953f, 22.2884f)
                curveTo(25.3477f, 20.6009f, 27.3281f, 16.3353f, 25.4531f, 11.1791f)
                lineTo(24.5859f, 8.7767f)
                curveTo(23.6602f, 6.2338f, 21.9141f, 5.1908f, 19.8633f, 5.9056f)
                curveTo(19.3125f, 5.1908f, 18.4688f, 4.9447f, 17.5547f, 5.2728f)
                curveTo(17.2148f, 5.4017f, 16.9219f, 5.5775f, 16.6406f, 5.7884f)
                curveTo(16.043f, 5.015f, 15.1172f, 4.7338f, 14.1562f, 5.0736f)
                curveTo(13.8984f, 5.1673f, 13.6523f, 5.308f, 13.418f, 5.472f)
                lineTo(12.082f, 1.8158f)
                curveTo(11.5781f, 0.4213f, 10.3125f, -0.1647f, 9.0117f, 0.3041f)
                curveTo(7.6992f, 0.7845f, 7.1133f, 2.0384f, 7.6172f, 3.433f)
                lineTo(10.957f, 12.6205f)
                curveTo(10.9805f, 12.6791f, 10.9688f, 12.7259f, 10.9102f, 12.7494f)
                curveTo(10.875f, 12.7728f, 10.8281f, 12.7494f, 10.793f, 12.7142f)
                lineTo(9.4219f, 11.2142f)
                curveTo(8.7422f, 10.4877f, 7.9219f, 10.265f, 7.1367f, 10.5463f)
                curveTo(6.0703f, 10.9447f, 5.3789f, 11.9642f, 5.8242f, 13.1713f)
                curveTo(5.9297f, 13.5111f, 6.1641f, 13.9213f, 6.4336f, 14.2611f)
                lineTo(10.3594f, 19.0072f)
                curveTo(13.3359f, 22.5931f, 16.8047f, 23.7064f, 20.6953f, 22.2884f)
                close()
                moveTo(20.1914f, 20.7533f)
                curveTo(17.1211f, 21.8783f, 14.25f, 21.3041f, 11.5312f, 18.0345f)
                lineTo(7.6055f, 13.3119f)
                curveTo(7.4883f, 13.1713f, 7.4063f, 13.0424f, 7.3359f, 12.8431f)
                curveTo(7.1953f, 12.4681f, 7.3594f, 12.0345f, 7.8047f, 11.8705f)
                curveTo(8.1797f, 11.7416f, 8.4844f, 11.8822f, 8.7773f, 12.1986f)
                lineTo(11.4961f, 14.9994f)
                curveTo(11.9414f, 15.4681f, 12.3398f, 15.515f, 12.7383f, 15.3744f)
                curveTo(13.1953f, 15.2103f, 13.3828f, 14.7181f, 13.1953f, 14.2142f)
                lineTo(9.0469f, 2.8002f)
                curveTo(8.8711f, 2.3314f, 9.082f, 1.8861f, 9.5391f, 1.722f)
                curveTo(9.9844f, 1.558f, 10.418f, 1.7806f, 10.582f, 2.2494f)
                lineTo(13.5469f, 10.3939f)
                curveTo(13.6875f, 10.7806f, 14.1211f, 10.9564f, 14.5078f, 10.8158f)
                curveTo(14.8828f, 10.6752f, 15.0938f, 10.265f, 14.9531f, 9.89f)
                lineTo(13.8867f, 6.9486f)
                curveTo(14.0391f, 6.7963f, 14.2734f, 6.6439f, 14.4844f, 6.5619f)
                curveTo(15.0352f, 6.3627f, 15.4922f, 6.6088f, 15.7031f, 7.183f)
                lineTo(16.6406f, 9.7494f)
                curveTo(16.7812f, 10.1478f, 17.2266f, 10.3002f, 17.6016f, 10.1595f)
                curveTo(17.9531f, 10.0306f, 18.1875f, 9.6439f, 18.0352f, 9.2338f)
                lineTo(17.2734f, 7.1478f)
                curveTo(17.4375f, 6.9955f, 17.6602f, 6.8431f, 17.8828f, 6.7611f)
                curveTo(18.4336f, 6.5619f, 18.8906f, 6.808f, 19.1016f, 7.3822f)
                lineTo(19.7227f, 9.0931f)
                curveTo(19.875f, 9.5033f, 20.3086f, 9.6556f, 20.6836f, 9.515f)
                curveTo(21.0469f, 9.3861f, 21.2695f, 8.9877f, 21.1289f, 8.5892f)
                lineTo(20.6719f, 7.3236f)
                curveTo(21.6445f, 6.972f, 22.5703f, 7.7689f, 23.2031f, 9.5267f)
                lineTo(23.9414f, 11.5306f)
                curveTo(25.5469f, 15.9603f, 24.0938f, 19.3353f, 20.1914f, 20.7533f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7305f, 2.9408f)
                curveTo(2.2852f, 5.0267f, 0.0f, 8.9291f, 0.0f, 13.7338f)
                curveTo(0.0f, 14.1556f, 0.3633f, 14.5189f, 0.7617f, 14.5072f)
                curveTo(1.1719f, 14.4955f, 1.4648f, 14.1791f, 1.4766f, 13.7572f)
                curveTo(1.582f, 9.5502f, 3.3867f, 6.2455f, 6.2578f, 4.3822f)
                close()
            }
        }
        .build()
        return _handDraw!!
    }

private var _handDraw: ImageVector? = null
