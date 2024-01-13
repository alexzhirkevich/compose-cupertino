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

public val CupertinoIcons.Outlined.BackwardEnd: ImageVector
    get() {
        if (_backwardEnd != null) {
            return _backwardEnd!!
        }
        _backwardEnd = Builder(name = "BackwardEnd", defaultWidth = 18.1055.dp, defaultHeight =
                19.3711.dp, viewportWidth = 18.1055f, viewportHeight = 19.3711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.9961f, 19.3711f)
                curveTo(1.5586f, 19.3711f, 2.0039f, 18.9492f, 2.0039f, 18.3984f)
                lineTo(2.0039f, 0.9961f)
                curveTo(2.0039f, 0.4453f, 1.5586f, 0.0117f, 0.9961f, 0.0117f)
                curveTo(0.4453f, 0.0117f, 0.0f, 0.4453f, 0.0f, 0.9961f)
                lineTo(0.0f, 18.3984f)
                curveTo(0.0f, 18.9492f, 0.4453f, 19.3711f, 0.9961f, 19.3711f)
                close()
                moveTo(16.418f, 18.9023f)
                curveTo(17.3438f, 18.9023f, 18.1055f, 18.1992f, 18.1055f, 16.8867f)
                lineTo(18.1055f, 2.4961f)
                curveTo(18.1055f, 1.1836f, 17.3438f, 0.4805f, 16.418f, 0.4805f)
                curveTo(15.9375f, 0.4805f, 15.5508f, 0.6328f, 15.0703f, 0.9141f)
                lineTo(3.1289f, 7.9453f)
                curveTo(2.2969f, 8.4375f, 1.9453f, 9.0234f, 1.9453f, 9.6914f)
                curveTo(1.9453f, 10.3594f, 2.2969f, 10.9453f, 3.1289f, 11.4375f)
                lineTo(15.0703f, 18.4688f)
                curveTo(15.5508f, 18.75f, 15.9375f, 18.9023f, 16.418f, 18.9023f)
                close()
                moveTo(15.9141f, 16.7344f)
                curveTo(15.832f, 16.7344f, 15.7383f, 16.6992f, 15.6211f, 16.6289f)
                lineTo(4.4883f, 10.0195f)
                curveTo(4.3242f, 9.9258f, 4.2305f, 9.8438f, 4.2305f, 9.6914f)
                curveTo(4.2305f, 9.5273f, 4.3125f, 9.457f, 4.4883f, 9.3633f)
                lineTo(15.6211f, 2.7539f)
                curveTo(15.7383f, 2.6836f, 15.832f, 2.6484f, 15.9141f, 2.6484f)
                curveTo(16.0781f, 2.6484f, 16.2305f, 2.7656f, 16.2305f, 3.0f)
                lineTo(16.2305f, 16.3828f)
                curveTo(16.2305f, 16.6172f, 16.0781f, 16.7344f, 15.9141f, 16.7344f)
                close()
            }
        }
        .build()
        return _backwardEnd!!
    }

private var _backwardEnd: ImageVector? = null
