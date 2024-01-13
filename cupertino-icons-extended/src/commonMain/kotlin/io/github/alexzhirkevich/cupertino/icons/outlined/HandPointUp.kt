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

public val CupertinoIcons.Outlined.HandPointUp: ImageVector
    get() {
        if (_handPointUp != null) {
            return _handPointUp!!
        }
        _handPointUp = Builder(name = "HandPointUp", defaultWidth = 19.1378.dp, defaultHeight =
                24.668.dp, viewportWidth = 19.1378f, viewportHeight = 24.668f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8527f, 24.6562f)
                curveTo(15.8097f, 24.6562f, 19.1378f, 21.3281f, 19.1378f, 15.8438f)
                lineTo(19.1378f, 13.2773f)
                curveTo(19.1378f, 10.582f, 17.8605f, 9.0f, 15.6808f, 8.9766f)
                curveTo(15.4113f, 8.1094f, 14.6964f, 7.5938f, 13.7238f, 7.5938f)
                curveTo(13.3722f, 7.5938f, 13.0324f, 7.6523f, 12.6925f, 7.7695f)
                curveTo(12.3995f, 6.8203f, 11.6261f, 6.2461f, 10.6066f, 6.2461f)
                curveTo(10.337f, 6.2461f, 10.0558f, 6.2813f, 9.7745f, 6.3633f)
                lineTo(9.7745f, 2.4609f)
                curveTo(9.7745f, 0.9844f, 8.7902f, 0.0f, 7.4074f, 0.0f)
                curveTo(6.0128f, 0.0f, 5.0167f, 0.9844f, 5.0167f, 2.4609f)
                lineTo(5.0167f, 12.2344f)
                curveTo(5.0167f, 12.3047f, 4.9933f, 12.3398f, 4.9347f, 12.3398f)
                curveTo(4.8878f, 12.3398f, 4.8527f, 12.3164f, 4.8292f, 12.2578f)
                lineTo(4.0558f, 10.3945f)
                curveTo(3.6574f, 9.4805f, 2.9777f, 8.9883f, 2.1456f, 8.9883f)
                curveTo(0.9972f, 8.9883f, 0.0011f, 9.7148f, 0.0011f, 10.9922f)
                curveTo(-0.0106f, 11.3555f, 0.0714f, 11.8242f, 0.212f, 12.2227f)
                lineTo(2.2745f, 18.0234f)
                curveTo(3.8331f, 22.418f, 6.7277f, 24.6562f, 10.8527f, 24.6562f)
                close()
                moveTo(10.9113f, 23.0391f)
                curveTo(7.6417f, 23.0391f, 5.1339f, 21.5273f, 3.7042f, 17.5195f)
                lineTo(1.63f, 11.7422f)
                curveTo(1.5714f, 11.5664f, 1.5363f, 11.4141f, 1.5363f, 11.2031f)
                curveTo(1.5363f, 10.8047f, 1.841f, 10.4531f, 2.3097f, 10.4531f)
                curveTo(2.7081f, 10.4531f, 2.9425f, 10.6875f, 3.1066f, 11.0859f)
                lineTo(4.712f, 14.6484f)
                curveTo(4.9699f, 15.2461f, 5.3214f, 15.4336f, 5.7433f, 15.4336f)
                curveTo(6.2355f, 15.4336f, 6.5753f, 15.0352f, 6.5753f, 14.5078f)
                lineTo(6.5753f, 2.3555f)
                curveTo(6.5753f, 1.8633f, 6.9269f, 1.5117f, 7.4074f, 1.5117f)
                curveTo(7.8878f, 1.5117f, 8.216f, 1.8633f, 8.216f, 2.3555f)
                lineTo(8.216f, 11.0273f)
                curveTo(8.216f, 11.4375f, 8.5675f, 11.7539f, 8.966f, 11.7539f)
                curveTo(9.3761f, 11.7539f, 9.7042f, 11.4375f, 9.7042f, 11.0273f)
                lineTo(9.7042f, 7.9102f)
                curveTo(9.9035f, 7.8164f, 10.173f, 7.7461f, 10.4074f, 7.7461f)
                curveTo(10.9933f, 7.7461f, 11.3449f, 8.1328f, 11.3449f, 8.7539f)
                lineTo(11.3449f, 11.4727f)
                curveTo(11.3449f, 11.9062f, 11.6964f, 12.1992f, 12.0949f, 12.1992f)
                curveTo(12.4816f, 12.1992f, 12.8331f, 11.9062f, 12.8331f, 11.4727f)
                lineTo(12.8331f, 9.2578f)
                curveTo(13.0324f, 9.1641f, 13.3019f, 9.1055f, 13.5245f, 9.1055f)
                curveTo(14.1105f, 9.1055f, 14.462f, 9.4805f, 14.462f, 10.1016f)
                lineTo(14.462f, 11.9297f)
                curveTo(14.462f, 12.3516f, 14.8253f, 12.6445f, 15.2238f, 12.6445f)
                curveTo(15.5988f, 12.6445f, 15.9503f, 12.3516f, 15.9503f, 11.9297f)
                lineTo(15.9503f, 10.582f)
                curveTo(16.9933f, 10.582f, 17.591f, 11.6484f, 17.591f, 13.5117f)
                lineTo(17.591f, 15.6562f)
                curveTo(17.591f, 20.3672f, 15.0597f, 23.0391f, 10.9113f, 23.0391f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
