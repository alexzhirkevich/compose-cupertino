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

public val CupertinoIcons.Filled.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 25.875.dp, defaultHeight =
                29.7773.dp, viewportWidth = 25.875f, viewportHeight = 29.7773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2695f, 24.6094f)
                lineTo(7.8281f, 17.1562f)
                lineTo(1.4883f, 10.9922f)
                curveTo(1.2422f, 10.7344f, 1.2422f, 10.4414f, 1.4883f, 10.2539f)
                lineTo(11.5195f, 2.4961f)
                curveTo(12.1289f, 2.0273f, 12.457f, 1.793f, 12.9375f, 1.793f)
                curveTo(13.418f, 1.793f, 13.7344f, 2.0273f, 14.3555f, 2.4961f)
                lineTo(24.3867f, 10.2539f)
                curveTo(24.6328f, 10.4414f, 24.6328f, 10.7461f, 24.3867f, 10.9922f)
                lineTo(18.082f, 17.1562f)
                lineTo(25.6055f, 24.5859f)
                curveTo(25.7812f, 24.2578f, 25.875f, 23.6953f, 25.875f, 22.8984f)
                lineTo(25.875f, 11.0156f)
                curveTo(25.875f, 9.7734f, 25.6641f, 9.1523f, 24.7969f, 8.4375f)
                lineTo(15.3516f, 1.1133f)
                curveTo(14.4844f, 0.4336f, 13.8047f, 0.0f, 12.9375f, 0.0f)
                curveTo(12.0703f, 0.0f, 11.3906f, 0.4336f, 10.5234f, 1.1133f)
                lineTo(1.0664f, 8.4375f)
                curveTo(0.2227f, 9.1406f, 0.0f, 9.7734f, 0.0f, 11.0156f)
                lineTo(0.0f, 22.8984f)
                curveTo(0.0f, 23.7188f, 0.0938f, 24.2812f, 0.2695f, 24.6094f)
                close()
                moveTo(3.3281f, 26.5312f)
                lineTo(22.1953f, 26.5312f)
                curveTo(23.3555f, 26.5312f, 24.1641f, 26.3203f, 24.5977f, 25.8984f)
                lineTo(14.4023f, 15.8203f)
                curveTo(13.8867f, 15.3047f, 13.4414f, 15.082f, 12.9609f, 15.082f)
                curveTo(12.4688f, 15.082f, 12.0234f, 15.3047f, 11.5195f, 15.8203f)
                lineTo(1.2539f, 25.957f)
                curveTo(1.6523f, 26.3438f, 2.3438f, 26.5312f, 3.3281f, 26.5312f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
