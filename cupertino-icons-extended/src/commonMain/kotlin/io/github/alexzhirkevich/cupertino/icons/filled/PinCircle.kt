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

public val CupertinoIcons.Filled.PinCircle: ImageVector
    get() {
        if (_pinCircle != null) {
            return _pinCircle!!
        }
        _pinCircle = Builder(name = "PinCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(7.207f, 14.25f)
                curveTo(7.207f, 12.9609f, 8.2383f, 11.5781f, 9.9609f, 10.9688f)
                lineTo(10.1602f, 8.1328f)
                curveTo(9.293f, 7.6406f, 8.5664f, 7.0781f, 8.25f, 6.668f)
                curveTo(8.0742f, 6.4453f, 7.9805f, 6.2227f, 7.9805f, 6.0234f)
                curveTo(7.9805f, 5.6484f, 8.2734f, 5.3789f, 8.707f, 5.3789f)
                lineTo(15.2227f, 5.3789f)
                curveTo(15.6562f, 5.3789f, 15.9492f, 5.6484f, 15.9492f, 6.0234f)
                curveTo(15.9492f, 6.2227f, 15.8555f, 6.4453f, 15.6914f, 6.6563f)
                curveTo(15.375f, 7.0664f, 14.6484f, 7.6406f, 13.7695f, 8.1328f)
                lineTo(13.957f, 10.9688f)
                curveTo(15.6914f, 11.5781f, 16.7227f, 12.9609f, 16.7227f, 14.25f)
                curveTo(16.7227f, 14.7773f, 16.3711f, 15.1172f, 15.832f, 15.1172f)
                lineTo(12.7148f, 15.1172f)
                lineTo(12.7148f, 17.2617f)
                curveTo(12.7148f, 18.5742f, 12.1875f, 19.6758f, 11.9648f, 19.6758f)
                curveTo(11.7422f, 19.6758f, 11.2148f, 18.5742f, 11.2148f, 17.2617f)
                lineTo(11.2148f, 15.1172f)
                lineTo(8.0859f, 15.1172f)
                curveTo(7.5469f, 15.1172f, 7.207f, 14.7773f, 7.207f, 14.25f)
                close()
            }
        }
        .build()
        return _pinCircle!!
    }

private var _pinCircle: ImageVector? = null
