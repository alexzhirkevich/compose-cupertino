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

public val CupertinoIcons.Filled.Dice: ImageVector
    get() {
        if (_dice != null) {
            return _dice!!
        }
        _dice = Builder(name = "Dice", defaultWidth = 24.7969.dp, defaultHeight = 24.5742.dp,
                viewportWidth = 24.7969f, viewportHeight = 24.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.5156f)
                curveTo(0.0f, 17.9297f, 1.2188f, 19.1484f, 3.6797f, 19.1484f)
                lineTo(4.0781f, 19.1484f)
                lineTo(4.0781f, 9.082f)
                curveTo(4.0781f, 5.7656f, 6.0234f, 3.8555f, 9.3633f, 3.8555f)
                lineTo(19.1133f, 3.8555f)
                lineTo(19.1133f, 3.6563f)
                curveTo(19.1133f, 1.2422f, 17.8828f, 0.0234f, 15.4453f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2188f, 0.0234f, 0.0f, 1.2422f, 0.0f, 3.6563f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3633f, 24.5742f)
                lineTo(21.1289f, 24.5742f)
                curveTo(23.5664f, 24.5742f, 24.7969f, 23.3555f, 24.7969f, 20.9414f)
                lineTo(24.7969f, 9.082f)
                curveTo(24.7969f, 6.668f, 23.5664f, 5.4492f, 21.1289f, 5.4492f)
                lineTo(9.3633f, 5.4492f)
                curveTo(6.9023f, 5.4492f, 5.6836f, 6.6563f, 5.6836f, 9.082f)
                lineTo(5.6836f, 20.9414f)
                curveTo(5.6836f, 23.3555f, 6.9023f, 24.5742f, 9.3633f, 24.5742f)
                close()
                moveTo(10.5117f, 12.0f)
                curveTo(9.5625f, 11.9883f, 8.8008f, 11.2383f, 8.8008f, 10.2773f)
                curveTo(8.8008f, 9.3398f, 9.5625f, 8.5781f, 10.5117f, 8.5781f)
                curveTo(11.4492f, 8.5781f, 12.2227f, 9.3398f, 12.2227f, 10.2773f)
                curveTo(12.2227f, 11.2383f, 11.4492f, 12.0234f, 10.5117f, 12.0f)
                close()
                moveTo(19.9688f, 12.0f)
                curveTo(19.0312f, 11.9883f, 18.2578f, 11.2383f, 18.2578f, 10.2773f)
                curveTo(18.2578f, 9.3398f, 19.0312f, 8.5781f, 19.9688f, 8.5781f)
                curveTo(20.9062f, 8.5781f, 21.6797f, 9.3398f, 21.6797f, 10.2773f)
                curveTo(21.6797f, 11.2383f, 20.9062f, 12.0234f, 19.9688f, 12.0f)
                close()
                moveTo(15.2344f, 16.7461f)
                curveTo(14.2969f, 16.7461f, 13.5352f, 15.9727f, 13.5352f, 15.0117f)
                curveTo(13.5352f, 14.0742f, 14.2969f, 13.3242f, 15.2344f, 13.3242f)
                curveTo(16.1719f, 13.3242f, 16.9453f, 14.0742f, 16.9453f, 15.0117f)
                curveTo(16.9453f, 15.9727f, 16.1719f, 16.7461f, 15.2344f, 16.7461f)
                close()
                moveTo(10.5117f, 21.4805f)
                curveTo(9.5625f, 21.4805f, 8.8125f, 20.707f, 8.8125f, 19.7578f)
                curveTo(8.8125f, 18.8086f, 9.5625f, 18.0586f, 10.5117f, 18.0586f)
                curveTo(11.4492f, 18.0586f, 12.2109f, 18.8086f, 12.2109f, 19.7578f)
                curveTo(12.2109f, 20.707f, 11.4492f, 21.4805f, 10.5117f, 21.4805f)
                close()
                moveTo(19.9688f, 21.4805f)
                curveTo(19.0312f, 21.4805f, 18.2695f, 20.707f, 18.2695f, 19.7578f)
                curveTo(18.2695f, 18.8086f, 19.0312f, 18.0586f, 19.9688f, 18.0586f)
                curveTo(20.9062f, 18.0586f, 21.6797f, 18.8086f, 21.6797f, 19.7578f)
                curveTo(21.6797f, 20.707f, 20.9062f, 21.4805f, 19.9688f, 21.4805f)
                close()
            }
        }
        .build()
        return _dice!!
    }

private var _dice: ImageVector? = null
