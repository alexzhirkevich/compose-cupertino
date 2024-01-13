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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Filled.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 25.875.dp, defaultHeight = 20.2148.dp,
                viewportWidth = 25.875f, viewportHeight = 20.2148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9609f, 11.4727f)
                curveTo(13.4414f, 11.4727f, 13.8867f, 11.25f, 14.4023f, 10.7344f)
                lineTo(24.5977f, 0.6445f)
                curveTo(24.1641f, 0.2227f, 23.3555f, 0.0234f, 22.1953f, 0.0234f)
                lineTo(3.3281f, 0.0234f)
                curveTo(2.3438f, 0.0234f, 1.6523f, 0.2109f, 1.2656f, 0.5977f)
                lineTo(11.5195f, 10.7344f)
                curveTo(12.0234f, 11.2383f, 12.4688f, 11.4727f, 12.9609f, 11.4727f)
                close()
                moveTo(0.293f, 18.3281f)
                lineTo(8.5781f, 10.1367f)
                lineTo(0.2695f, 1.9453f)
                curveTo(0.0938f, 2.2734f, 0.0f, 2.8359f, 0.0f, 3.6445f)
                lineTo(0.0f, 16.582f)
                curveTo(0.0f, 17.4141f, 0.0938f, 18.0f, 0.293f, 18.3281f)
                close()
                moveTo(3.6797f, 20.2148f)
                lineTo(22.5469f, 20.2148f)
                curveTo(23.5312f, 20.2148f, 24.2109f, 20.0273f, 24.5977f, 19.6523f)
                lineTo(16.1484f, 11.2852f)
                lineTo(15.375f, 12.0703f)
                curveTo(14.5664f, 12.8438f, 13.8047f, 13.1953f, 12.9609f, 13.1953f)
                curveTo(12.1055f, 13.1953f, 11.3438f, 12.8438f, 10.5469f, 12.0703f)
                lineTo(9.7617f, 11.2852f)
                lineTo(1.3359f, 19.6406f)
                curveTo(1.7813f, 20.0273f, 2.5547f, 20.2148f, 3.6797f, 20.2148f)
                close()
                moveTo(25.5938f, 18.3164f)
                curveTo(25.7812f, 17.9766f, 25.875f, 17.4023f, 25.875f, 16.582f)
                lineTo(25.875f, 3.6445f)
                curveTo(25.875f, 2.8594f, 25.7812f, 2.2969f, 25.6172f, 1.9805f)
                lineTo(17.332f, 10.1367f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
