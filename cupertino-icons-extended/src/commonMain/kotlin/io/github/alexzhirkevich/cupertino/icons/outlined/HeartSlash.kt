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

public val CupertinoIcons.Outlined.HeartSlash: ImageVector
    get() {
        if (_heartSlash != null) {
            return _heartSlash!!
        }
        _heartSlash = Builder(name = "HeartSlash", defaultWidth = 24.3604.dp, defaultHeight =
                24.1172.dp, viewportWidth = 24.3604f, viewportHeight = 24.1172f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.458f, 17.2441f)
                curveTo(22.9424f, 14.5137f, 24.3604f, 11.6309f, 24.3604f, 8.7363f)
                curveTo(24.3604f, 4.5879f, 21.5127f, 1.6582f, 17.7158f, 1.6582f)
                curveTo(15.5479f, 1.6582f, 13.79f, 2.6895f, 12.7236f, 4.2715f)
                curveTo(11.6807f, 2.7012f, 9.8994f, 1.6582f, 7.7315f, 1.6582f)
                curveTo(6.876f, 1.6582f, 6.0674f, 1.8105f, 5.3291f, 2.0918f)
                lineTo(6.8994f, 3.6621f)
                curveTo(7.1455f, 3.5801f, 7.4268f, 3.5449f, 7.708f, 3.5449f)
                curveTo(9.9111f, 3.5449f, 11.1768f, 4.916f, 11.9268f, 6.0879f)
                curveTo(12.2432f, 6.5566f, 12.4424f, 6.6856f, 12.7236f, 6.6856f)
                curveTo(13.0049f, 6.6856f, 13.1807f, 6.5449f, 13.5205f, 6.0879f)
                curveTo(14.3291f, 4.9394f, 15.5479f, 3.5449f, 17.7393f, 3.5449f)
                curveTo(20.458f, 3.5449f, 22.4736f, 5.6191f, 22.4736f, 8.7363f)
                curveTo(22.4736f, 11.1035f, 21.1143f, 13.5762f, 19.0752f, 15.8613f)
                close()
                moveTo(17.1064f, 20.3496f)
                lineTo(15.7588f, 19.002f)
                curveTo(14.8799f, 19.7168f, 13.9189f, 20.4199f, 12.9697f, 21.0527f)
                curveTo(12.8525f, 21.1348f, 12.7705f, 21.1934f, 12.7236f, 21.1934f)
                curveTo(12.6768f, 21.1934f, 12.5947f, 21.1348f, 12.4893f, 21.0527f)
                curveTo(7.5791f, 17.7949f, 2.9736f, 13.0957f, 2.9736f, 8.7363f)
                curveTo(2.9736f, 7.9512f, 3.126f, 7.2363f, 3.3955f, 6.6387f)
                lineTo(1.9424f, 5.1738f)
                curveTo(1.3916f, 6.1934f, 1.0869f, 7.4004f, 1.0869f, 8.7363f)
                curveTo(1.0869f, 13.7285f, 5.2705f, 18.6387f, 11.8799f, 22.8574f)
                curveTo(12.126f, 23.0098f, 12.4775f, 23.1738f, 12.7236f, 23.1738f)
                curveTo(12.9697f, 23.1738f, 13.3213f, 23.0098f, 13.5791f, 22.8574f)
                curveTo(14.833f, 22.0488f, 16.0283f, 21.2051f, 17.1064f, 20.3496f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4072f, 22.6699f)
                curveTo(21.7588f, 23.0332f, 22.3447f, 23.0332f, 22.6846f, 22.6699f)
                curveTo(23.0244f, 22.3184f, 23.0361f, 21.7559f, 22.6846f, 21.3926f)
                lineTo(1.5439f, 0.2637f)
                curveTo(1.1924f, -0.0879f, 0.6064f, -0.0879f, 0.2549f, 0.2637f)
                curveTo(-0.085f, 0.6035f, -0.085f, 1.2012f, 0.2549f, 1.541f)
                close()
            }
        }
        .build()
        return _heartSlash!!
    }

private var _heartSlash: ImageVector? = null
