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

public val CupertinoIcons.Outlined.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 26.0977.dp, defaultHeight =
                24.7852.dp, viewportWidth = 26.0977f, viewportHeight = 24.7852f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.3281f)
                curveTo(0.0f, 15.3867f, 1.6992f, 17.0625f, 4.9102f, 17.0625f)
                lineTo(8.9766f, 17.0625f)
                curveTo(13.0312f, 17.5312f, 17.2852f, 18.8672f, 20.9648f, 21.1289f)
                lineTo(20.9648f, 19.043f)
                curveTo(17.3789f, 16.8398f, 13.2422f, 15.6328f, 8.9063f, 15.1758f)
                lineTo(4.9102f, 15.1758f)
                curveTo(2.7656f, 15.1758f, 1.8867f, 14.3438f, 1.8867f, 12.3281f)
                lineTo(1.8867f, 10.6055f)
                curveTo(1.8867f, 8.5781f, 2.7656f, 7.7578f, 4.9102f, 7.7578f)
                lineTo(8.8008f, 7.7578f)
                curveTo(13.2188f, 7.3125f, 17.4492f, 6.0586f, 20.9648f, 3.8789f)
                lineTo(20.9648f, 1.8047f)
                curveTo(17.4375f, 4.0547f, 12.7266f, 5.4727f, 9.0469f, 5.8711f)
                lineTo(4.9102f, 5.8711f)
                curveTo(1.6992f, 5.8711f, 0.0f, 7.5234f, 0.0f, 10.6055f)
                close()
                moveTo(10.8984f, 16.9102f)
                lineTo(9.1172f, 16.9102f)
                lineTo(10.1016f, 21.9023f)
                curveTo(10.1953f, 22.4297f, 9.9258f, 22.7695f, 9.5508f, 22.8984f)
                curveTo(9.1523f, 23.0391f, 8.6367f, 22.9102f, 8.3672f, 22.3477f)
                lineTo(5.7188f, 16.6875f)
                lineTo(3.7969f, 16.6875f)
                lineTo(6.5039f, 22.6875f)
                curveTo(7.4648f, 24.832f, 9.1289f, 24.9609f, 10.2656f, 24.6094f)
                curveTo(11.4141f, 24.2461f, 12.1172f, 23.1797f, 11.8125f, 21.6211f)
                close()
                moveTo(7.3945f, 6.7617f)
                lineTo(7.3945f, 16.1719f)
                lineTo(9.293f, 16.1719f)
                lineTo(9.293f, 6.7617f)
                close()
                moveTo(20.2969f, 19.957f)
                curveTo(20.2969f, 21.6914f, 21.4688f, 22.8516f, 23.1914f, 22.8516f)
                curveTo(24.9375f, 22.8516f, 26.0977f, 21.6914f, 26.0977f, 19.957f)
                lineTo(26.0977f, 2.8945f)
                curveTo(26.0977f, 1.1602f, 24.9375f, 0.0f, 23.1914f, 0.0f)
                curveTo(21.4688f, 0.0f, 20.2969f, 1.1602f, 20.2969f, 2.8945f)
                close()
                moveTo(22.1953f, 19.957f)
                lineTo(22.1953f, 2.8945f)
                curveTo(22.1953f, 2.2852f, 22.582f, 1.8867f, 23.1914f, 1.8867f)
                curveTo(23.8008f, 1.8867f, 24.2109f, 2.2852f, 24.2109f, 2.8945f)
                lineTo(24.2109f, 19.957f)
                curveTo(24.2109f, 20.5664f, 23.8008f, 20.9648f, 23.1914f, 20.9648f)
                curveTo(22.582f, 20.9648f, 22.1953f, 20.5664f, 22.1953f, 19.957f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
