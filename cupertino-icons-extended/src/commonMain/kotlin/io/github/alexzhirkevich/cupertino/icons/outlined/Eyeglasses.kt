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

public val CupertinoIcons.Outlined.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) {
            return _eyeglasses!!
        }
        _eyeglasses = Builder(name = "Eyeglasses", defaultWidth = 36.9727.dp, defaultHeight =
                14.6367.dp, viewportWidth = 36.9727f, viewportHeight = 14.6367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5742f, 14.625f)
                curveTo(13.6055f, 14.625f, 16.875f, 11.3555f, 16.875f, 7.3125f)
                curveTo(16.875f, 3.2813f, 13.6055f, 0.0f, 9.5742f, 0.0f)
                curveTo(5.5313f, 0.0f, 2.25f, 3.2813f, 2.25f, 7.3125f)
                curveTo(2.25f, 11.3555f, 5.5313f, 14.625f, 9.5742f, 14.625f)
                close()
                moveTo(9.5742f, 12.6445f)
                curveTo(6.6211f, 12.6445f, 4.2305f, 10.2656f, 4.2305f, 7.3125f)
                curveTo(4.2305f, 4.3711f, 6.6211f, 1.9805f, 9.5742f, 1.9805f)
                curveTo(12.5039f, 1.9805f, 14.8945f, 4.3828f, 14.8945f, 7.3125f)
                curveTo(14.8945f, 10.2539f, 12.5039f, 12.6445f, 9.5742f, 12.6445f)
                close()
                moveTo(27.4219f, 14.625f)
                curveTo(31.4531f, 14.625f, 34.7227f, 11.3555f, 34.7227f, 7.3125f)
                curveTo(34.7227f, 3.2813f, 31.4531f, 0.0f, 27.4219f, 0.0f)
                curveTo(23.3789f, 0.0f, 20.0977f, 3.2813f, 20.0977f, 7.3125f)
                curveTo(20.0977f, 11.3555f, 23.3789f, 14.625f, 27.4219f, 14.625f)
                close()
                moveTo(27.4219f, 12.6445f)
                curveTo(24.4805f, 12.6445f, 22.0781f, 10.2539f, 22.0781f, 7.3125f)
                curveTo(22.0781f, 4.3828f, 24.4805f, 1.9805f, 27.4219f, 1.9805f)
                curveTo(30.3633f, 1.9805f, 32.7422f, 4.3711f, 32.7422f, 7.3125f)
                curveTo(32.7422f, 10.2656f, 30.3633f, 12.6445f, 27.4219f, 12.6445f)
                close()
                moveTo(3.0234f, 5.8711f)
                lineTo(0.8789f, 5.8711f)
                curveTo(0.3047f, 5.8711f, 0.0f, 6.1641f, 0.0f, 6.75f)
                lineTo(0.0f, 7.2305f)
                curveTo(0.0f, 7.8164f, 0.3047f, 8.1211f, 0.8789f, 8.1211f)
                lineTo(3.0234f, 8.1211f)
                close()
                moveTo(33.9492f, 8.1211f)
                lineTo(36.1055f, 8.1211f)
                curveTo(36.6797f, 8.1211f, 36.9727f, 7.8164f, 36.9727f, 7.2305f)
                lineTo(36.9727f, 6.75f)
                curveTo(36.9727f, 6.1641f, 36.6797f, 5.8711f, 36.1055f, 5.8711f)
                lineTo(33.9492f, 5.8711f)
                close()
                moveTo(16.3008f, 7.7344f)
                curveTo(16.8867f, 7.3711f, 17.707f, 7.1836f, 18.4922f, 7.1836f)
                curveTo(19.2656f, 7.1836f, 20.0859f, 7.3711f, 20.6836f, 7.7344f)
                lineTo(20.6836f, 5.6133f)
                curveTo(20.0156f, 5.2969f, 19.1484f, 5.1797f, 18.4922f, 5.1797f)
                curveTo(17.8242f, 5.1797f, 16.957f, 5.2969f, 16.3008f, 5.6133f)
                close()
            }
        }
        .build()
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
