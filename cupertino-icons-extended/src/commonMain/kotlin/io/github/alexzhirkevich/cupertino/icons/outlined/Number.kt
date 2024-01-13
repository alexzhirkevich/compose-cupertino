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

public val CupertinoIcons.Outlined.Number: ImageVector
    get() {
        if (_number != null) {
            return _number!!
        }
        _number = Builder(name = "Number", defaultWidth = 21.0117.dp, defaultHeight = 22.8867.dp,
                viewportWidth = 21.0117f, viewportHeight = 22.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3008f, 22.8867f)
                curveTo(4.8633f, 22.8867f, 5.2734f, 22.582f, 5.3906f, 22.0078f)
                lineTo(9.5625f, 1.3359f)
                curveTo(9.5859f, 1.2656f, 9.6094f, 1.1133f, 9.6094f, 0.9609f)
                curveTo(9.6094f, 0.3867f, 9.1875f, 0.0586f, 8.625f, 0.0586f)
                curveTo(7.9688f, 0.0586f, 7.6641f, 0.4219f, 7.5586f, 0.9727f)
                lineTo(3.3867f, 21.6211f)
                curveTo(3.3633f, 21.7383f, 3.3398f, 21.8789f, 3.3398f, 21.9961f)
                curveTo(3.3398f, 22.5703f, 3.7383f, 22.8867f, 4.3008f, 22.8867f)
                close()
                moveTo(11.918f, 22.8867f)
                curveTo(12.4922f, 22.8867f, 12.8906f, 22.582f, 13.0078f, 22.0078f)
                lineTo(17.1914f, 1.3359f)
                curveTo(17.2031f, 1.2656f, 17.2266f, 1.1133f, 17.2266f, 0.9609f)
                curveTo(17.2266f, 0.3867f, 16.8047f, 0.0586f, 16.2539f, 0.0586f)
                curveTo(15.5859f, 0.0586f, 15.293f, 0.4219f, 15.1875f, 0.9727f)
                lineTo(11.0039f, 21.6211f)
                curveTo(10.9805f, 21.7383f, 10.9688f, 21.8789f, 10.9688f, 21.9961f)
                curveTo(10.9688f, 22.5703f, 11.3672f, 22.8867f, 11.918f, 22.8867f)
                close()
                moveTo(2.4609f, 8.0977f)
                lineTo(19.9219f, 8.0977f)
                curveTo(20.5664f, 8.0977f, 21.0117f, 7.6289f, 21.0117f, 6.9961f)
                curveTo(21.0117f, 6.4805f, 20.6602f, 6.0586f, 20.1328f, 6.0586f)
                lineTo(2.6719f, 6.0586f)
                curveTo(2.0391f, 6.0586f, 1.582f, 6.5508f, 1.582f, 7.1953f)
                curveTo(1.582f, 7.7227f, 1.9453f, 8.0977f, 2.4609f, 8.0977f)
                close()
                moveTo(0.8789f, 16.3242f)
                lineTo(18.3398f, 16.3242f)
                curveTo(18.9727f, 16.3242f, 19.4297f, 15.8555f, 19.4297f, 15.2227f)
                curveTo(19.4297f, 14.707f, 19.0664f, 14.2852f, 18.5508f, 14.2852f)
                lineTo(1.0898f, 14.2852f)
                curveTo(0.4453f, 14.2852f, 0.0f, 14.7773f, 0.0f, 15.4219f)
                curveTo(0.0f, 15.9492f, 0.3516f, 16.3242f, 0.8789f, 16.3242f)
                close()
            }
        }
        .build()
        return _number!!
    }

private var _number: ImageVector? = null
