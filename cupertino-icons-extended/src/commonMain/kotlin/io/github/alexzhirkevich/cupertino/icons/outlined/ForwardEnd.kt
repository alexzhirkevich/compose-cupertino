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

public val CupertinoIcons.Outlined.ForwardEnd: ImageVector
    get() {
        if (_forwardEnd != null) {
            return _forwardEnd!!
        }
        _forwardEnd = Builder(name = "ForwardEnd", defaultWidth = 18.1055.dp, defaultHeight =
                19.3711.dp, viewportWidth = 18.1055f, viewportHeight = 19.3711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1094f, 19.3711f)
                curveTo(17.6602f, 19.3711f, 18.1055f, 18.9492f, 18.1055f, 18.3984f)
                lineTo(18.1055f, 0.9961f)
                curveTo(18.1055f, 0.4453f, 17.6602f, 0.0117f, 17.1094f, 0.0117f)
                curveTo(16.5586f, 0.0117f, 16.1016f, 0.4453f, 16.1016f, 0.9961f)
                lineTo(16.1016f, 18.3984f)
                curveTo(16.1016f, 18.9492f, 16.5586f, 19.3711f, 17.1094f, 19.3711f)
                close()
                moveTo(1.6875f, 18.9023f)
                curveTo(2.168f, 18.9023f, 2.5547f, 18.75f, 3.0352f, 18.4688f)
                lineTo(14.9766f, 11.4375f)
                curveTo(15.8086f, 10.9453f, 16.1602f, 10.3594f, 16.1602f, 9.6914f)
                curveTo(16.1602f, 9.0234f, 15.8086f, 8.4375f, 14.9766f, 7.9453f)
                lineTo(3.0352f, 0.9141f)
                curveTo(2.5547f, 0.6328f, 2.168f, 0.4805f, 1.6875f, 0.4805f)
                curveTo(0.7617f, 0.4805f, 0.0f, 1.1836f, 0.0f, 2.4961f)
                lineTo(0.0f, 16.8867f)
                curveTo(0.0f, 18.1992f, 0.7617f, 18.9023f, 1.6875f, 18.9023f)
                close()
                moveTo(2.2031f, 16.7344f)
                curveTo(2.0273f, 16.7344f, 1.875f, 16.6172f, 1.875f, 16.3828f)
                lineTo(1.875f, 3.0f)
                curveTo(1.875f, 2.7656f, 2.0273f, 2.6484f, 2.2031f, 2.6484f)
                curveTo(2.2734f, 2.6484f, 2.3672f, 2.6836f, 2.4844f, 2.7539f)
                lineTo(13.6289f, 9.3633f)
                curveTo(13.793f, 9.457f, 13.875f, 9.5273f, 13.875f, 9.6914f)
                curveTo(13.875f, 9.8438f, 13.7812f, 9.9258f, 13.6289f, 10.0195f)
                lineTo(2.4844f, 16.6289f)
                curveTo(2.3672f, 16.6992f, 2.2734f, 16.7344f, 2.2031f, 16.7344f)
                close()
            }
        }
        .build()
        return _forwardEnd!!
    }

private var _forwardEnd: ImageVector? = null
