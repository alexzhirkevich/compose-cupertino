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

public val CupertinoIcons.Outlined.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 18.0.dp, defaultHeight = 27.2461.dp,
                viewportWidth = 18.0f, viewportHeight = 27.2461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.6875f)
                curveTo(0.0f, 22.9219f, 2.0156f, 24.9844f, 5.168f, 24.9844f)
                curveTo(7.5234f, 24.9844f, 9.2813f, 23.9531f, 10.3945f, 21.9609f)
                lineTo(11.4492f, 20.0742f)
                curveTo(13.9219f, 15.5508f, 18.0f, 14.9648f, 18.0f, 9.1523f)
                curveTo(18.0f, 3.668f, 14.4492f, 0.0f, 9.1289f, 0.0f)
                curveTo(3.6797f, 0.0f, 0.0f, 3.6914f, 0.0f, 9.1992f)
                close()
                moveTo(1.7695f, 19.5703f)
                lineTo(1.7695f, 9.1992f)
                curveTo(1.7695f, 4.7344f, 4.7109f, 1.7695f, 9.1289f, 1.7695f)
                curveTo(13.3945f, 1.7695f, 16.2305f, 4.7344f, 16.2305f, 9.1523f)
                curveTo(16.2305f, 14.0156f, 12.4219f, 14.8594f, 9.8672f, 19.2773f)
                lineTo(8.8477f, 21.0234f)
                curveTo(8.0156f, 22.4766f, 6.8555f, 23.168f, 5.25f, 23.168f)
                curveTo(3.082f, 23.168f, 1.7695f, 21.8086f, 1.7695f, 19.5703f)
                close()
                moveTo(4.2656f, 15.1641f)
                curveTo(4.7461f, 15.1641f, 5.1563f, 14.7539f, 5.1563f, 14.2734f)
                lineTo(5.1563f, 9.1289f)
                curveTo(5.1563f, 6.8789f, 6.7266f, 5.3906f, 9.1172f, 5.3906f)
                curveTo(11.3906f, 5.3906f, 12.8555f, 6.8672f, 12.8555f, 9.1289f)
                curveTo(12.8555f, 9.6094f, 13.2539f, 10.0195f, 13.7344f, 10.0195f)
                curveTo(14.2148f, 10.0195f, 14.625f, 9.6094f, 14.625f, 9.1289f)
                curveTo(14.625f, 5.8359f, 12.4219f, 3.6211f, 9.1172f, 3.6211f)
                curveTo(5.6953f, 3.6211f, 3.3867f, 5.8359f, 3.3867f, 9.1289f)
                lineTo(3.3867f, 14.2734f)
                curveTo(3.3867f, 14.7539f, 3.7852f, 15.1641f, 4.2656f, 15.1641f)
                close()
                moveTo(4.1719f, 11.6836f)
                lineTo(8.1328f, 11.6836f)
                curveTo(8.9297f, 11.6836f, 9.4336f, 12.1641f, 9.4336f, 12.8672f)
                curveTo(9.4336f, 13.2305f, 9.2461f, 13.7227f, 8.9648f, 14.0625f)
                lineTo(7.5586f, 15.832f)
                curveTo(7.4063f, 16.0312f, 7.3242f, 16.2422f, 7.3242f, 16.4648f)
                curveTo(7.3242f, 16.9453f, 7.7344f, 17.3438f, 8.2148f, 17.3438f)
                curveTo(8.4844f, 17.3438f, 8.7422f, 17.2031f, 8.9414f, 16.957f)
                lineTo(10.4648f, 15.0234f)
                curveTo(10.9453f, 14.4141f, 11.2617f, 13.5234f, 11.2617f, 12.7969f)
                curveTo(11.2617f, 11.0742f, 10.0078f, 9.9141f, 8.1094f, 9.9141f)
                lineTo(4.1719f, 9.9141f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
