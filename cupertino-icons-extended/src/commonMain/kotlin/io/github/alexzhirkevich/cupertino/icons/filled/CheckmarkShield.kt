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

public val CupertinoIcons.Filled.CheckmarkShield: ImageVector
    get() {
        if (_checkmarkShield != null) {
            return _checkmarkShield!!
        }
        _checkmarkShield = Builder(name = "CheckmarkShield", defaultWidth = 19.1719.dp,
                defaultHeight = 23.6602.dp, viewportWidth = 19.1719f, viewportHeight =
                23.6602f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2734f, 17.2969f)
                curveTo(7.875f, 17.2969f, 7.5469f, 17.1445f, 7.2422f, 16.7344f)
                lineTo(4.3008f, 13.125f)
                curveTo(4.125f, 12.8906f, 4.0195f, 12.6211f, 4.0195f, 12.3633f)
                curveTo(4.0195f, 11.8242f, 4.4297f, 11.3906f, 4.9688f, 11.3906f)
                curveTo(5.2969f, 11.3906f, 5.5547f, 11.5078f, 5.8477f, 11.8945f)
                lineTo(8.2266f, 14.9648f)
                lineTo(13.2305f, 6.9258f)
                curveTo(13.4531f, 6.5625f, 13.7578f, 6.3867f, 14.0742f, 6.3867f)
                curveTo(14.5781f, 6.3867f, 15.0586f, 6.7383f, 15.0586f, 7.2773f)
                curveTo(15.0586f, 7.5469f, 14.918f, 7.8164f, 14.7656f, 8.0508f)
                lineTo(9.2578f, 16.7344f)
                curveTo(9.0117f, 17.1094f, 8.6719f, 17.2969f, 8.2734f, 17.2969f)
                close()
                moveTo(9.5859f, 23.6602f)
                curveTo(9.7734f, 23.6602f, 10.0664f, 23.5898f, 10.3594f, 23.4375f)
                curveTo(17.0273f, 19.9453f, 19.1719f, 18.1992f, 19.1719f, 13.9922f)
                lineTo(19.1719f, 5.1563f)
                curveTo(19.1719f, 3.9492f, 18.6562f, 3.5625f, 17.6719f, 3.1523f)
                curveTo(16.3008f, 2.5898f, 11.918f, 0.9961f, 10.5586f, 0.5273f)
                curveTo(10.2422f, 0.4219f, 9.9141f, 0.3633f, 9.5859f, 0.3633f)
                curveTo(9.2578f, 0.3633f, 8.9297f, 0.4336f, 8.625f, 0.5273f)
                curveTo(7.2539f, 0.9727f, 2.8711f, 2.6016f, 1.5f, 3.1523f)
                curveTo(0.5273f, 3.5508f, 0.0f, 3.9492f, 0.0f, 5.1563f)
                lineTo(0.0f, 13.9922f)
                curveTo(0.0f, 18.1992f, 2.2617f, 19.7461f, 8.8125f, 23.4375f)
                curveTo(9.1172f, 23.6016f, 9.3984f, 23.6602f, 9.5859f, 23.6602f)
                close()
            }
        }
        .build()
        return _checkmarkShield!!
    }

private var _checkmarkShield: ImageVector? = null
