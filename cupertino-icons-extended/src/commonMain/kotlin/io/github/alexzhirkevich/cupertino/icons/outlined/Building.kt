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

@file:Suppress("UnusedReceiverParameter")

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

public val CupertinoIcons.Outlined.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 18.6562.dp, defaultHeight =
                24.9961.dp, viewportWidth = 18.6562f, viewportHeight = 24.9961f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 22.8633f)
                curveTo(0.0f, 24.1641f, 0.75f, 24.9961f, 1.9453f, 24.9961f)
                lineTo(16.7227f, 24.9961f)
                curveTo(17.9062f, 24.9961f, 18.6562f, 24.1641f, 18.6562f, 22.8633f)
                lineTo(18.6562f, 2.1445f)
                curveTo(18.6562f, 0.8438f, 17.9062f, 0.0117f, 16.7227f, 0.0117f)
                lineTo(1.9453f, 0.0117f)
                curveTo(0.75f, 0.0117f, 0.0f, 0.8438f, 0.0f, 2.1445f)
                close()
                moveTo(1.8867f, 22.4297f)
                lineTo(1.8867f, 2.5781f)
                curveTo(1.8867f, 2.1094f, 2.0977f, 1.8984f, 2.5664f, 1.8984f)
                lineTo(16.1016f, 1.8984f)
                curveTo(16.5586f, 1.8984f, 16.7695f, 2.1094f, 16.7695f, 2.5781f)
                lineTo(16.7695f, 22.4297f)
                curveTo(16.7695f, 22.8867f, 16.5586f, 23.1094f, 16.1016f, 23.1094f)
                lineTo(2.5664f, 23.1094f)
                curveTo(2.0977f, 23.1094f, 1.8867f, 22.8867f, 1.8867f, 22.4297f)
                close()
                moveTo(5.25f, 24.0f)
                lineTo(6.7852f, 24.0f)
                lineTo(6.7852f, 20.0859f)
                curveTo(6.7852f, 19.8398f, 6.9141f, 19.7109f, 7.1602f, 19.7109f)
                lineTo(11.4961f, 19.7109f)
                curveTo(11.7539f, 19.7109f, 11.8711f, 19.8398f, 11.8711f, 20.0859f)
                lineTo(11.8711f, 24.0f)
                lineTo(13.4062f, 24.0f)
                lineTo(13.4062f, 19.6523f)
                curveTo(13.4062f, 18.6445f, 12.9609f, 18.1758f, 12.0f, 18.1758f)
                lineTo(6.6563f, 18.1758f)
                curveTo(5.6953f, 18.1758f, 5.25f, 18.6445f, 5.25f, 19.6523f)
                close()
                moveTo(5.4375f, 7.0195f)
                lineTo(7.7227f, 7.0195f)
                curveTo(8.0039f, 7.0195f, 8.2031f, 6.832f, 8.2031f, 6.5391f)
                lineTo(8.2031f, 4.3242f)
                curveTo(8.2031f, 4.043f, 8.0039f, 3.8438f, 7.7227f, 3.8438f)
                lineTo(5.4375f, 3.8438f)
                curveTo(5.1563f, 3.8438f, 4.9805f, 4.043f, 4.9805f, 4.3242f)
                lineTo(4.9805f, 6.5391f)
                curveTo(4.9805f, 6.832f, 5.1563f, 7.0195f, 5.4375f, 7.0195f)
                close()
                moveTo(10.9336f, 7.0195f)
                lineTo(13.207f, 7.0195f)
                curveTo(13.4883f, 7.0195f, 13.6875f, 6.832f, 13.6875f, 6.5391f)
                lineTo(13.6875f, 4.3242f)
                curveTo(13.6875f, 4.043f, 13.4883f, 3.8438f, 13.207f, 3.8438f)
                lineTo(10.9336f, 3.8438f)
                curveTo(10.6406f, 3.8438f, 10.4648f, 4.043f, 10.4648f, 4.3242f)
                lineTo(10.4648f, 6.5391f)
                curveTo(10.4648f, 6.832f, 10.6406f, 7.0195f, 10.9336f, 7.0195f)
                close()
                moveTo(5.4375f, 11.6602f)
                lineTo(7.7227f, 11.6602f)
                curveTo(8.0039f, 11.6602f, 8.2031f, 11.4727f, 8.2031f, 11.1797f)
                lineTo(8.2031f, 8.9648f)
                curveTo(8.2031f, 8.6836f, 8.0039f, 8.4844f, 7.7227f, 8.4844f)
                lineTo(5.4375f, 8.4844f)
                curveTo(5.1563f, 8.4844f, 4.9805f, 8.6836f, 4.9805f, 8.9648f)
                lineTo(4.9805f, 11.1797f)
                curveTo(4.9805f, 11.4727f, 5.1563f, 11.6602f, 5.4375f, 11.6602f)
                close()
                moveTo(10.9336f, 11.6602f)
                lineTo(13.207f, 11.6602f)
                curveTo(13.4883f, 11.6602f, 13.6875f, 11.4727f, 13.6875f, 11.1797f)
                lineTo(13.6875f, 8.9648f)
                curveTo(13.6875f, 8.6836f, 13.4883f, 8.4844f, 13.207f, 8.4844f)
                lineTo(10.9336f, 8.4844f)
                curveTo(10.6406f, 8.4844f, 10.4648f, 8.6836f, 10.4648f, 8.9648f)
                lineTo(10.4648f, 11.1797f)
                curveTo(10.4648f, 11.4727f, 10.6406f, 11.6602f, 10.9336f, 11.6602f)
                close()
                moveTo(5.4375f, 16.3008f)
                lineTo(7.7227f, 16.3008f)
                curveTo(8.0039f, 16.3008f, 8.2031f, 16.1016f, 8.2031f, 15.8203f)
                lineTo(8.2031f, 13.6055f)
                curveTo(8.2031f, 13.3125f, 8.0039f, 13.125f, 7.7227f, 13.125f)
                lineTo(5.4375f, 13.125f)
                curveTo(5.1563f, 13.125f, 4.9805f, 13.3125f, 4.9805f, 13.6055f)
                lineTo(4.9805f, 15.8203f)
                curveTo(4.9805f, 16.1016f, 5.1563f, 16.3008f, 5.4375f, 16.3008f)
                close()
                moveTo(10.9336f, 16.3008f)
                lineTo(13.207f, 16.3008f)
                curveTo(13.4883f, 16.3008f, 13.6875f, 16.1016f, 13.6875f, 15.8203f)
                lineTo(13.6875f, 13.6055f)
                curveTo(13.6875f, 13.3125f, 13.4883f, 13.125f, 13.207f, 13.125f)
                lineTo(10.9336f, 13.125f)
                curveTo(10.6406f, 13.125f, 10.4648f, 13.3125f, 10.4648f, 13.6055f)
                lineTo(10.4648f, 15.8203f)
                curveTo(10.4648f, 16.1016f, 10.6406f, 16.3008f, 10.9336f, 16.3008f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
