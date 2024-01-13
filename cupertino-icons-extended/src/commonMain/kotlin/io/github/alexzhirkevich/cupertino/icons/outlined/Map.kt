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

public val CupertinoIcons.Outlined.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.375.dp, defaultHeight = 23.1211.dp,
                viewportWidth = 24.375f, viewportHeight = 23.1211f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3242f, 22.6641f)
                curveTo(1.6172f, 22.6641f, 1.9219f, 22.5586f, 2.2969f, 22.3477f)
                lineTo(8.2617f, 19.1367f)
                lineTo(14.7422f, 22.7695f)
                curveTo(15.1641f, 23.0039f, 15.6211f, 23.1211f, 16.0547f, 23.1211f)
                curveTo(16.4648f, 23.1211f, 16.875f, 23.0156f, 17.2266f, 22.8164f)
                lineTo(23.3555f, 19.3359f)
                curveTo(24.0586f, 18.9492f, 24.375f, 18.3867f, 24.375f, 17.6016f)
                lineTo(24.375f, 1.8164f)
                curveTo(24.375f, 0.9492f, 23.8945f, 0.4688f, 23.0508f, 0.4688f)
                curveTo(22.7578f, 0.4688f, 22.4531f, 0.5625f, 22.0664f, 0.7734f)
                lineTo(15.8555f, 4.2305f)
                lineTo(9.4922f, 0.3281f)
                curveTo(9.1289f, 0.1172f, 8.7188f, 0.0f, 8.3086f, 0.0f)
                curveTo(7.8867f, 0.0f, 7.4648f, 0.1172f, 7.1016f, 0.3281f)
                lineTo(1.0078f, 3.7969f)
                curveTo(0.3164f, 4.1953f, 0.0f, 4.7578f, 0.0f, 5.543f)
                lineTo(0.0f, 21.3047f)
                curveTo(0.0f, 22.1719f, 0.4805f, 22.6641f, 1.3242f, 22.6641f)
                close()
                moveTo(7.5f, 17.2734f)
                lineTo(2.2148f, 20.1797f)
                curveTo(2.1563f, 20.2031f, 2.0977f, 20.2383f, 2.0391f, 20.2383f)
                curveTo(1.9453f, 20.2383f, 1.8867f, 20.168f, 1.8867f, 20.0508f)
                lineTo(1.8867f, 6.0f)
                curveTo(1.8867f, 5.7188f, 1.9922f, 5.5195f, 2.2734f, 5.3555f)
                lineTo(7.0781f, 2.543f)
                curveTo(7.2305f, 2.4609f, 7.3594f, 2.3906f, 7.5f, 2.3086f)
                close()
                moveTo(9.3867f, 17.4609f)
                lineTo(9.3867f, 2.5547f)
                curveTo(9.5039f, 2.625f, 9.6445f, 2.6953f, 9.7617f, 2.7656f)
                lineTo(14.9883f, 5.9531f)
                lineTo(14.9883f, 20.6016f)
                curveTo(14.8242f, 20.5078f, 14.6484f, 20.4258f, 14.4727f, 20.332f)
                close()
                moveTo(16.875f, 20.8125f)
                lineTo(16.875f, 5.8359f)
                lineTo(22.1602f, 2.9531f)
                curveTo(22.2188f, 2.918f, 22.2773f, 2.8945f, 22.3242f, 2.8945f)
                curveTo(22.4297f, 2.8945f, 22.4883f, 2.9648f, 22.4883f, 3.082f)
                lineTo(22.4883f, 17.1328f)
                curveTo(22.4883f, 17.4258f, 22.3711f, 17.625f, 22.1016f, 17.7891f)
                lineTo(17.4023f, 20.5195f)
                curveTo(17.2266f, 20.625f, 17.0508f, 20.7305f, 16.875f, 20.8125f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
