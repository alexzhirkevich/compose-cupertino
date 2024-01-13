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

public val CupertinoIcons.Filled.Shippingbox: ImageVector
    get() {
        if (_shippingbox != null) {
            return _shippingbox!!
        }
        _shippingbox = Builder(name = "Shippingbox", defaultWidth = 23.7773.dp, defaultHeight =
                25.7695.dp, viewportWidth = 23.7773f, viewportHeight = 25.7695f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6914f, 25.7695f)
                curveTo(12.7734f, 25.7461f, 12.8438f, 25.7109f, 12.9258f, 25.6641f)
                lineTo(22.1016f, 20.4375f)
                curveTo(23.1914f, 19.8164f, 23.7773f, 19.1836f, 23.7773f, 17.4844f)
                lineTo(23.7773f, 8.3555f)
                curveTo(23.7773f, 8.0039f, 23.7539f, 7.7227f, 23.6836f, 7.4648f)
                lineTo(12.6914f, 13.7461f)
                close()
                moveTo(11.0859f, 25.7695f)
                lineTo(11.0859f, 13.7461f)
                lineTo(0.0938f, 7.4648f)
                curveTo(0.0234f, 7.7227f, 0.0f, 8.0039f, 0.0f, 8.3555f)
                lineTo(0.0f, 17.4844f)
                curveTo(0.0f, 19.1836f, 0.5977f, 19.8164f, 1.6758f, 20.4375f)
                lineTo(10.8633f, 25.6641f)
                curveTo(10.9336f, 25.7109f, 11.0039f, 25.7461f, 11.0859f, 25.7695f)
                close()
                moveTo(11.8945f, 12.3398f)
                lineTo(16.8984f, 9.5039f)
                lineTo(5.8008f, 3.1641f)
                lineTo(1.5f, 5.6133f)
                curveTo(1.2422f, 5.7539f, 1.0313f, 5.8945f, 0.8438f, 6.0703f)
                close()
                moveTo(18.5273f, 8.5781f)
                lineTo(22.9336f, 6.0703f)
                curveTo(22.7578f, 5.8945f, 22.5469f, 5.7539f, 22.2891f, 5.6133f)
                lineTo(14.0156f, 0.9023f)
                curveTo(13.3008f, 0.4922f, 12.5859f, 0.2695f, 11.8945f, 0.2695f)
                curveTo(11.1914f, 0.2695f, 10.4766f, 0.4922f, 9.7617f, 0.9023f)
                lineTo(7.3828f, 2.25f)
                close()
            }
        }
        .build()
        return _shippingbox!!
    }

private var _shippingbox: ImageVector? = null
