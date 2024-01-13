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

public val CupertinoIcons.Outlined.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 22.4062.dp, defaultHeight = 26.3086.dp,
                viewportWidth = 22.4062f, viewportHeight = 26.3086f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2031f, 24.3047f)
                curveTo(17.3906f, 24.3047f, 22.4062f, 19.2891f, 22.4062f, 13.1016f)
                curveTo(22.4062f, 6.9141f, 17.3906f, 1.8867f, 11.2031f, 1.8867f)
                curveTo(5.0156f, 1.8867f, 0.0f, 6.9141f, 0.0f, 13.1016f)
                curveTo(0.0f, 19.2891f, 5.0156f, 24.3047f, 11.2031f, 24.3047f)
                close()
                moveTo(11.2031f, 22.3008f)
                curveTo(6.1172f, 22.3008f, 2.0039f, 18.1875f, 2.0039f, 13.1016f)
                curveTo(2.0039f, 8.0273f, 6.1172f, 3.9023f, 11.2031f, 3.9023f)
                curveTo(16.2773f, 3.9023f, 20.4023f, 8.0273f, 20.4023f, 13.1016f)
                curveTo(20.4023f, 18.1875f, 16.2773f, 22.3008f, 11.2031f, 22.3008f)
                close()
                moveTo(1.582f, 4.8984f)
                curveTo(1.7578f, 4.8984f, 1.8867f, 4.875f, 2.0508f, 4.7461f)
                lineTo(5.9766f, 1.7813f)
                curveTo(6.1641f, 1.6406f, 6.2695f, 1.4531f, 6.2695f, 1.2539f)
                curveTo(6.2695f, 1.0078f, 6.1523f, 0.8086f, 5.9531f, 0.6211f)
                curveTo(5.5078f, 0.2227f, 4.7109f, 0.0f, 4.0078f, 0.0f)
                curveTo(2.1797f, 0.0f, 0.7148f, 1.4648f, 0.7148f, 3.293f)
                curveTo(0.7148f, 3.7266f, 0.7852f, 4.1602f, 0.9141f, 4.4297f)
                curveTo(1.043f, 4.7227f, 1.2891f, 4.8984f, 1.582f, 4.8984f)
                close()
                moveTo(20.8242f, 4.8984f)
                curveTo(21.1172f, 4.8984f, 21.3633f, 4.7109f, 21.5039f, 4.4297f)
                curveTo(21.6211f, 4.1719f, 21.6914f, 3.7266f, 21.6914f, 3.293f)
                curveTo(21.6914f, 1.4648f, 20.2383f, 0.0f, 18.3984f, 0.0f)
                curveTo(17.6953f, 0.0f, 16.8984f, 0.2227f, 16.4531f, 0.6211f)
                curveTo(16.2539f, 0.8086f, 16.1367f, 1.0078f, 16.1367f, 1.2539f)
                curveTo(16.1367f, 1.4531f, 16.2422f, 1.6406f, 16.4414f, 1.7813f)
                lineTo(20.3555f, 4.7461f)
                curveTo(20.5312f, 4.875f, 20.6484f, 4.8984f, 20.8242f, 4.8984f)
                close()
                moveTo(1.4063f, 23.9648f)
                curveTo(1.7578f, 24.3281f, 2.332f, 24.3281f, 2.6953f, 23.9531f)
                lineTo(4.9102f, 21.75f)
                lineTo(3.6445f, 20.4961f)
                lineTo(1.418f, 22.6992f)
                curveTo(1.0547f, 23.0508f, 1.0664f, 23.625f, 1.4063f, 23.9648f)
                close()
                moveTo(21.0f, 23.9648f)
                curveTo(21.3516f, 23.625f, 21.3516f, 23.0508f, 20.9883f, 22.6992f)
                lineTo(18.7617f, 20.4961f)
                lineTo(17.5078f, 21.75f)
                lineTo(19.7109f, 23.9531f)
                curveTo(20.0742f, 24.3281f, 20.6484f, 24.3281f, 21.0f, 23.9648f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8711f, 14.3906f)
                lineTo(11.1914f, 14.3906f)
                curveTo(11.6484f, 14.3906f, 12.0117f, 14.0391f, 12.0117f, 13.582f)
                lineTo(12.0117f, 6.4805f)
                curveTo(12.0117f, 6.0234f, 11.6484f, 5.6602f, 11.1914f, 5.6602f)
                curveTo(10.7344f, 5.6602f, 10.3828f, 6.0234f, 10.3828f, 6.4805f)
                lineTo(10.3828f, 12.7617f)
                lineTo(5.8711f, 12.7617f)
                curveTo(5.4141f, 12.7617f, 5.0625f, 13.125f, 5.0625f, 13.582f)
                curveTo(5.0625f, 14.0391f, 5.4141f, 14.3906f, 5.8711f, 14.3906f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
