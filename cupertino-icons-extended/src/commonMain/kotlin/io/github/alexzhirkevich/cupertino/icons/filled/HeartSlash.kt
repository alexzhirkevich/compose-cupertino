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

public val CupertinoIcons.Filled.HeartSlash: ImageVector
    get() {
        if (_heartSlash != null) {
            return _heartSlash!!
        }
        _heartSlash = Builder(name = "HeartSlash", defaultWidth = 24.3604.dp, defaultHeight =
                24.1172.dp, viewportWidth = 24.3604f, viewportHeight = 24.1172f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4463f, 17.2559f)
                curveTo(22.9424f, 14.5137f, 24.3604f, 11.6426f, 24.3604f, 8.7363f)
                curveTo(24.3604f, 4.5879f, 21.5127f, 1.6582f, 17.833f, 1.6582f)
                curveTo(15.5479f, 1.6582f, 13.79f, 2.9238f, 12.7236f, 4.8574f)
                curveTo(11.6807f, 2.9355f, 9.8994f, 1.6582f, 7.6143f, 1.6582f)
                curveTo(6.794f, 1.6582f, 6.0088f, 1.7988f, 5.3057f, 2.0801f)
                close()
                moveTo(17.0947f, 20.3496f)
                lineTo(1.9307f, 5.1738f)
                curveTo(1.3916f, 6.1934f, 1.0869f, 7.4004f, 1.0869f, 8.7363f)
                curveTo(1.0869f, 13.7285f, 5.2705f, 18.6387f, 11.8799f, 22.8574f)
                curveTo(12.126f, 23.0098f, 12.4775f, 23.1738f, 12.7236f, 23.1738f)
                curveTo(12.9697f, 23.1738f, 13.3213f, 23.0098f, 13.5791f, 22.8574f)
                curveTo(14.833f, 22.0488f, 16.0166f, 21.2051f, 17.0947f, 20.3496f)
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
