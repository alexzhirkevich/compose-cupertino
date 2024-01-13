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

public val CupertinoIcons.Filled.PersonWave2: ImageVector
    get() {
        if (_personWave2 != null) {
            return _personWave2!!
        }
        _personWave2 = Builder(name = "PersonWave2", defaultWidth = 26.5547.dp, defaultHeight =
                27.3644.dp, viewportWidth = 26.5547f, viewportHeight = 27.3644f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5078f, 24.4107f)
                lineTo(17.2266f, 24.4107f)
                curveTo(19.0664f, 24.4107f, 19.7227f, 23.8834f, 19.7227f, 22.8521f)
                curveTo(19.7227f, 19.8287f, 15.9375f, 15.6568f, 9.8672f, 15.6568f)
                curveTo(3.7852f, 15.6568f, 0.0f, 19.8287f, 0.0f, 22.8521f)
                curveTo(0.0f, 23.8834f, 0.6563f, 24.4107f, 2.5078f, 24.4107f)
                close()
                moveTo(9.8672f, 13.5591f)
                curveTo(12.3867f, 13.5591f, 14.5547f, 11.3091f, 14.5547f, 8.3794f)
                curveTo(14.5547f, 5.4849f, 12.375f, 3.3404f, 9.8672f, 3.3404f)
                curveTo(7.3594f, 3.3404f, 5.1797f, 5.5318f, 5.1797f, 8.4029f)
                curveTo(5.1797f, 11.3091f, 7.3594f, 13.5591f, 9.8672f, 13.5591f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5508f, 13.2076f)
                curveTo(18.9375f, 13.4771f, 19.4883f, 13.3951f, 19.8047f, 12.938f)
                curveTo(20.707f, 11.7544f, 21.2461f, 10.0084f, 21.2461f, 8.2154f)
                curveTo(21.2461f, 6.4224f, 20.707f, 4.688f, 19.8047f, 3.4927f)
                curveTo(19.4883f, 3.0357f, 18.9375f, 2.9537f, 18.5508f, 3.2232f)
                curveTo(18.0703f, 3.5513f, 18.0f, 4.1373f, 18.3633f, 4.6177f)
                curveTo(19.043f, 5.5552f, 19.4297f, 6.856f, 19.4297f, 8.2154f)
                curveTo(19.4297f, 9.5748f, 19.0312f, 10.8638f, 18.3633f, 11.813f)
                curveTo(18.0117f, 12.3052f, 18.0703f, 12.8677f, 18.5508f, 13.2076f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8867f, 16.2662f)
                curveTo(23.3203f, 16.5591f, 23.8594f, 16.4537f, 24.1758f, 16.0084f)
                curveTo(25.6758f, 13.9459f, 26.5547f, 11.1099f, 26.5547f, 8.2154f)
                curveTo(26.5547f, 5.3208f, 25.6875f, 2.4615f, 24.1758f, 0.4224f)
                curveTo(23.8594f, -0.0229f, 23.3203f, -0.1284f, 22.8867f, 0.1646f)
                curveTo(22.4531f, 0.4576f, 22.3828f, 1.0084f, 22.7227f, 1.4888f)
                curveTo(24.0117f, 3.2935f, 24.7383f, 5.7193f, 24.7383f, 8.2154f)
                curveTo(24.7383f, 10.7115f, 23.9883f, 13.1255f, 22.7227f, 14.9419f)
                curveTo(22.3945f, 15.4224f, 22.4531f, 15.9732f, 22.8867f, 16.2662f)
                close()
            }
        }
        .build()
        return _personWave2!!
    }

private var _personWave2: ImageVector? = null
