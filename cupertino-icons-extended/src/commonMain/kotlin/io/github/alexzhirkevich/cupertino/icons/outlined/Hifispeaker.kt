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

public val CupertinoIcons.Outlined.Hifispeaker: ImageVector
    get() {
        if (_hifispeaker != null) {
            return _hifispeaker!!
        }
        _hifispeaker = Builder(name = "Hifispeaker", defaultWidth = 17.9648.dp, defaultHeight =
                24.2695.dp, viewportWidth = 17.9648f, viewportHeight = 24.2695f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.3281f)
                lineTo(0.0f, 20.9297f)
                curveTo(0.0f, 23.1445f, 1.1016f, 24.2578f, 3.293f, 24.2578f)
                lineTo(14.6836f, 24.2578f)
                curveTo(16.875f, 24.2578f, 17.9648f, 23.1445f, 17.9648f, 20.9297f)
                lineTo(17.9648f, 3.3281f)
                curveTo(17.9648f, 1.1133f, 16.875f, 0.0f, 14.6836f, 0.0f)
                lineTo(3.293f, 0.0f)
                curveTo(1.1016f, 0.0f, 0.0f, 1.1133f, 0.0f, 3.3281f)
                close()
                moveTo(1.8867f, 3.3516f)
                curveTo(1.8867f, 2.3906f, 2.3906f, 1.8867f, 3.3633f, 1.8867f)
                lineTo(14.6133f, 1.8867f)
                curveTo(15.5859f, 1.8867f, 16.0781f, 2.3906f, 16.0781f, 3.3516f)
                lineTo(16.0781f, 20.9062f)
                curveTo(16.0781f, 21.8555f, 15.5742f, 22.3711f, 14.6133f, 22.3711f)
                lineTo(3.3633f, 22.3711f)
                curveTo(2.3906f, 22.3711f, 1.8867f, 21.8555f, 1.8867f, 20.9062f)
                close()
                moveTo(8.9883f, 20.4844f)
                curveTo(11.6367f, 20.4844f, 13.7695f, 18.3633f, 13.7695f, 15.7031f)
                curveTo(13.7695f, 13.043f, 11.6367f, 10.9336f, 8.9883f, 10.9219f)
                curveTo(6.3398f, 10.9102f, 4.207f, 13.043f, 4.207f, 15.7031f)
                curveTo(4.207f, 18.3633f, 6.3398f, 20.4844f, 8.9883f, 20.4844f)
                close()
                moveTo(8.9883f, 17.7305f)
                curveTo(7.875f, 17.7305f, 6.9609f, 16.8281f, 6.9609f, 15.7031f)
                curveTo(6.9609f, 14.543f, 7.8398f, 13.6641f, 8.9883f, 13.6641f)
                curveTo(10.125f, 13.6641f, 11.0156f, 14.543f, 11.0156f, 15.7031f)
                curveTo(11.0156f, 16.8281f, 10.125f, 17.7305f, 8.9883f, 17.7305f)
                close()
                moveTo(8.9883f, 9.082f)
                curveTo(10.4531f, 9.082f, 11.6719f, 7.8984f, 11.6484f, 6.4219f)
                curveTo(11.6367f, 4.9453f, 10.4531f, 3.7852f, 8.9883f, 3.7734f)
                curveTo(7.5117f, 3.7617f, 6.3281f, 4.9336f, 6.3281f, 6.4219f)
                curveTo(6.3281f, 7.8984f, 7.5117f, 9.082f, 8.9883f, 9.082f)
                close()
                moveTo(8.9883f, 7.7813f)
                curveTo(8.2266f, 7.7813f, 7.6289f, 7.1602f, 7.6289f, 6.4219f)
                curveTo(7.6289f, 5.6367f, 8.2266f, 5.0625f, 8.9883f, 5.0625f)
                curveTo(9.7266f, 5.0625f, 10.3477f, 5.6719f, 10.3477f, 6.4219f)
                curveTo(10.3477f, 7.1602f, 9.7383f, 7.7813f, 8.9883f, 7.7813f)
                close()
            }
        }
        .build()
        return _hifispeaker!!
    }

private var _hifispeaker: ImageVector? = null
