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

public val CupertinoIcons.Outlined.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 26.3906.dp, defaultHeight = 26.0153.dp,
                viewportWidth = 26.3906f, viewportHeight = 26.0153f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1953f, 24.4159f)
                curveTo(13.5f, 24.4159f, 13.793f, 24.3924f, 14.1094f, 24.369f)
                lineTo(14.7773f, 25.6463f)
                curveTo(14.918f, 25.9159f, 15.1641f, 26.0448f, 15.4922f, 26.0096f)
                curveTo(15.7852f, 25.951f, 15.9844f, 25.7284f, 16.0312f, 25.4237f)
                lineTo(16.2305f, 24.0057f)
                curveTo(16.8164f, 23.8416f, 17.3906f, 23.619f, 17.9414f, 23.3846f)
                lineTo(18.9961f, 24.3338f)
                curveTo(19.2188f, 24.5448f, 19.5f, 24.5799f, 19.793f, 24.4276f)
                curveTo(20.0508f, 24.2752f, 20.1562f, 24.0057f, 20.0977f, 23.6893f)
                lineTo(19.8047f, 22.2948f)
                curveTo(20.2969f, 21.9549f, 20.7773f, 21.5682f, 21.2109f, 21.1346f)
                lineTo(22.5117f, 21.6737f)
                curveTo(22.8047f, 21.8026f, 23.0859f, 21.7323f, 23.3086f, 21.4744f)
                curveTo(23.5078f, 21.2518f, 23.5195f, 20.9588f, 23.3555f, 20.6893f)
                lineTo(22.5938f, 19.4705f)
                curveTo(22.9453f, 18.9901f, 23.2266f, 18.451f, 23.4961f, 17.8885f)
                lineTo(24.9375f, 17.9588f)
                curveTo(25.2422f, 17.9823f, 25.4883f, 17.8065f, 25.5938f, 17.5252f)
                curveTo(25.6875f, 17.2323f, 25.6055f, 16.951f, 25.3594f, 16.7635f)
                lineTo(24.2344f, 15.8729f)
                curveTo(24.3867f, 15.2987f, 24.5039f, 14.701f, 24.5625f, 14.0682f)
                lineTo(25.9102f, 13.6346f)
                curveTo(26.2148f, 13.5409f, 26.3906f, 13.3182f, 26.3906f, 13.0018f)
                curveTo(26.3906f, 12.6854f, 26.2148f, 12.4627f, 25.9102f, 12.3573f)
                lineTo(24.5625f, 11.9354f)
                curveTo(24.5039f, 11.3026f, 24.3867f, 10.7166f, 24.2344f, 10.1307f)
                lineTo(25.3594f, 9.2401f)
                curveTo(25.5938f, 9.0526f, 25.6875f, 8.783f, 25.5938f, 8.4901f)
                curveTo(25.4883f, 8.2088f, 25.2422f, 8.033f, 24.9375f, 8.0565f)
                lineTo(23.4961f, 8.1033f)
                curveTo(23.2266f, 7.5409f, 22.9453f, 7.0252f, 22.5938f, 6.5213f)
                lineTo(23.3555f, 5.3026f)
                curveTo(23.5195f, 5.0565f, 23.4961f, 4.7635f, 23.3086f, 4.5409f)
                curveTo(23.0859f, 4.283f, 22.8047f, 4.2244f, 22.5117f, 4.3416f)
                lineTo(21.2109f, 4.869f)
                curveTo(20.7773f, 4.4471f, 20.2969f, 4.0487f, 19.8047f, 3.7088f)
                lineTo(20.0977f, 2.326f)
                curveTo(20.168f, 1.9979f, 20.0508f, 1.7284f, 19.793f, 1.5877f)
                curveTo(19.5f, 1.4237f, 19.2188f, 1.4588f, 18.9961f, 1.6815f)
                lineTo(17.9414f, 2.619f)
                curveTo(17.3906f, 2.3729f, 16.8164f, 2.1737f, 16.2305f, 1.9979f)
                lineTo(16.0312f, 0.5916f)
                curveTo(15.9844f, 0.2869f, 15.7734f, 0.0643f, 15.4805f, 0.0057f)
                curveTo(15.1641f, -0.0295f, 14.9062f, 0.0994f, 14.7773f, 0.3573f)
                lineTo(14.1094f, 1.6346f)
                curveTo(13.793f, 1.6112f, 13.5f, 1.5994f, 13.1953f, 1.5994f)
                curveTo(12.8789f, 1.5994f, 12.5977f, 1.6112f, 12.2812f, 1.6346f)
                lineTo(11.6016f, 0.3573f)
                curveTo(11.4727f, 0.0994f, 11.2148f, -0.0295f, 10.8984f, 0.0057f)
                curveTo(10.6055f, 0.0643f, 10.3945f, 0.2869f, 10.3594f, 0.5916f)
                lineTo(10.1484f, 1.9979f)
                curveTo(9.5625f, 2.1737f, 9.0f, 2.3612f, 8.4375f, 2.619f)
                lineTo(7.3828f, 1.6815f)
                curveTo(7.1602f, 1.4588f, 6.8789f, 1.4354f, 6.5859f, 1.5877f)
                curveTo(6.3281f, 1.7284f, 6.2109f, 1.9979f, 6.2813f, 2.326f)
                lineTo(6.5742f, 3.7088f)
                curveTo(6.0938f, 4.0487f, 5.6016f, 4.4471f, 5.168f, 4.869f)
                lineTo(3.8672f, 4.3416f)
                curveTo(3.5742f, 4.2244f, 3.3047f, 4.283f, 3.082f, 4.5409f)
                curveTo(2.8828f, 4.7635f, 2.8594f, 5.0565f, 3.0234f, 5.3026f)
                lineTo(3.7852f, 6.5213f)
                curveTo(3.4453f, 7.0252f, 3.1523f, 7.5409f, 2.8828f, 8.1033f)
                lineTo(1.4531f, 8.0565f)
                curveTo(1.1484f, 8.033f, 0.8906f, 8.2088f, 0.7852f, 8.4901f)
                curveTo(0.6914f, 8.783f, 0.7852f, 9.0526f, 1.0195f, 9.2401f)
                lineTo(2.1445f, 10.1307f)
                curveTo(1.9922f, 10.7166f, 1.875f, 11.3026f, 1.8398f, 11.9237f)
                lineTo(0.4688f, 12.3573f)
                curveTo(0.1641f, 12.4627f, 0.0f, 12.6854f, 0.0f, 13.0018f)
                curveTo(0.0f, 13.3182f, 0.1641f, 13.5409f, 0.4688f, 13.6346f)
                lineTo(1.8398f, 14.0682f)
                curveTo(1.875f, 14.701f, 1.9922f, 15.2987f, 2.1445f, 15.8729f)
                lineTo(1.0195f, 16.7635f)
                curveTo(0.7852f, 16.9393f, 0.7031f, 17.2205f, 0.7852f, 17.5252f)
                curveTo(0.8906f, 17.8065f, 1.1484f, 17.9823f, 1.4531f, 17.9588f)
                lineTo(2.8828f, 17.8885f)
                curveTo(3.1523f, 18.451f, 3.4453f, 18.9901f, 3.7852f, 19.4705f)
                lineTo(3.0234f, 20.6893f)
                curveTo(2.8594f, 20.9588f, 2.8828f, 21.2518f, 3.082f, 21.4744f)
                curveTo(3.3047f, 21.7323f, 3.5742f, 21.8026f, 3.8672f, 21.6737f)
                lineTo(5.168f, 21.1346f)
                curveTo(5.6016f, 21.5682f, 6.0938f, 21.9549f, 6.5742f, 22.2948f)
                lineTo(6.2813f, 23.6893f)
                curveTo(6.2227f, 24.0057f, 6.3281f, 24.2752f, 6.5859f, 24.4276f)
                curveTo(6.8789f, 24.5799f, 7.1602f, 24.5448f, 7.3828f, 24.3338f)
                lineTo(8.4375f, 23.3846f)
                curveTo(9.0f, 23.619f, 9.5625f, 23.8416f, 10.1484f, 24.0057f)
                lineTo(10.3594f, 25.4237f)
                curveTo(10.3945f, 25.7284f, 10.6055f, 25.951f, 10.8984f, 26.0096f)
                curveTo(11.2148f, 26.0448f, 11.4609f, 25.9159f, 11.6016f, 25.6463f)
                lineTo(12.2812f, 24.369f)
                curveTo(12.5859f, 24.3924f, 12.8789f, 24.4159f, 13.1953f, 24.4159f)
                close()
                moveTo(13.1953f, 22.6463f)
                curveTo(7.8281f, 22.6463f, 3.6797f, 18.3573f, 3.6797f, 13.0135f)
                curveTo(3.6797f, 7.658f, 7.8281f, 3.369f, 13.1953f, 3.369f)
                curveTo(18.5625f, 3.369f, 22.7109f, 7.658f, 22.7109f, 13.0135f)
                curveTo(22.7109f, 18.3573f, 18.5625f, 22.6463f, 13.1953f, 22.6463f)
                close()
                moveTo(11.1445f, 11.0799f)
                lineTo(12.4453f, 10.2596f)
                lineTo(8.4727f, 3.4627f)
                lineTo(7.125f, 4.2244f)
                close()
                moveTo(15.9141f, 13.7518f)
                lineTo(23.8242f, 13.7518f)
                lineTo(23.8125f, 12.2401f)
                lineTo(15.9141f, 12.2401f)
                close()
                moveTo(12.457f, 15.7791f)
                lineTo(11.168f, 14.9354f)
                lineTo(7.0078f, 21.744f)
                lineTo(8.3438f, 22.5291f)
                close()
                moveTo(13.1719f, 16.0955f)
                curveTo(14.8594f, 16.0955f, 16.2305f, 14.7244f, 16.2305f, 13.0252f)
                curveTo(16.2305f, 11.326f, 14.8594f, 9.9549f, 13.1719f, 9.9549f)
                curveTo(11.4727f, 9.9549f, 10.1016f, 11.326f, 10.1016f, 13.0252f)
                curveTo(10.1016f, 14.7244f, 11.4727f, 16.0955f, 13.1719f, 16.0955f)
                close()
                moveTo(13.1719f, 14.4432f)
                curveTo(12.3633f, 14.4432f, 11.7539f, 13.8221f, 11.7539f, 13.0252f)
                curveTo(11.7539f, 12.2284f, 12.3633f, 11.6073f, 13.1719f, 11.6073f)
                curveTo(13.9688f, 11.6073f, 14.5781f, 12.2284f, 14.5781f, 13.0252f)
                curveTo(14.5781f, 13.8221f, 13.9688f, 14.4432f, 13.1719f, 14.4432f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
