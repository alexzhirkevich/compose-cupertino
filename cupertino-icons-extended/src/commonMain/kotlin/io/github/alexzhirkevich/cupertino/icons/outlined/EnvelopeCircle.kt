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

public val CupertinoIcons.Outlined.EnvelopeCircle: ImageVector
    get() {
        if (_envelopeCircle != null) {
            return _envelopeCircle!!
        }
        _envelopeCircle = Builder(name = "EnvelopeCircle", defaultWidth = 23.9062.dp, defaultHeight
                = 23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6563f, 11.9648f)
                lineTo(5.6133f, 7.9453f)
                curveTo(5.5547f, 8.0508f, 5.5195f, 8.332f, 5.5195f, 8.7422f)
                lineTo(5.5195f, 15.1641f)
                curveTo(5.5195f, 15.5625f, 5.5547f, 15.8555f, 5.6367f, 15.9844f)
                close()
                moveTo(11.9531f, 12.5742f)
                curveTo(12.1523f, 12.5742f, 12.3633f, 12.5039f, 12.5859f, 12.2812f)
                lineTo(17.707f, 7.1602f)
                curveTo(17.5547f, 7.043f, 17.2148f, 6.9375f, 16.7227f, 6.9375f)
                lineTo(7.1602f, 6.9375f)
                curveTo(6.668f, 6.9375f, 6.3398f, 7.043f, 6.1875f, 7.1602f)
                lineTo(11.3086f, 12.2812f)
                curveTo(11.543f, 12.5156f, 11.7539f, 12.5742f, 11.9531f, 12.5742f)
                close()
                moveTo(14.2031f, 11.9648f)
                lineTo(18.2227f, 15.9844f)
                curveTo(18.3047f, 15.8555f, 18.3516f, 15.5625f, 18.3516f, 15.1641f)
                lineTo(18.3516f, 8.7422f)
                curveTo(18.3516f, 8.332f, 18.3047f, 8.0508f, 18.2461f, 7.9453f)
                close()
                moveTo(11.9414f, 13.5f)
                curveTo(11.5195f, 13.5f, 11.1914f, 13.3477f, 10.7461f, 12.9375f)
                lineTo(10.3711f, 12.5977f)
                lineTo(6.2109f, 16.7461f)
                curveTo(6.3516f, 16.875f, 6.6797f, 16.957f, 7.1602f, 16.957f)
                lineTo(16.7109f, 16.957f)
                curveTo(17.2031f, 16.957f, 17.5195f, 16.875f, 17.6602f, 16.7461f)
                lineTo(13.5117f, 12.5977f)
                lineTo(13.1367f, 12.9375f)
                curveTo(12.6797f, 13.3477f, 12.3633f, 13.5f, 11.9414f, 13.5f)
                close()
            }
        }
        .build()
        return _envelopeCircle!!
    }

private var _envelopeCircle: ImageVector? = null
