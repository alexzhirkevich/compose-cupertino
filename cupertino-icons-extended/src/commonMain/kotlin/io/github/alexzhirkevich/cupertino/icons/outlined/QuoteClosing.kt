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

public val CupertinoIcons.Outlined.QuoteClosing: ImageVector
    get() {
        if (_quoteClosing != null) {
            return _quoteClosing!!
        }
        _quoteClosing = Builder(name = "QuoteClosing", defaultWidth = 25.793.dp, defaultHeight =
                16.2539.dp, viewportWidth = 25.793f, viewportHeight = 16.2539f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.6484f)
                curveTo(0.0f, 8.7656f, 2.3203f, 11.25f, 5.2852f, 11.25f)
                curveTo(6.6797f, 11.25f, 8.0039f, 10.6992f, 8.9766f, 9.6211f)
                lineTo(9.293f, 9.6211f)
                curveTo(8.6133f, 11.8359f, 6.5508f, 13.6875f, 3.9961f, 14.4492f)
                curveTo(3.6211f, 14.5664f, 3.3516f, 14.6719f, 3.1875f, 14.8125f)
                curveTo(3.0f, 14.9648f, 2.9063f, 15.1523f, 2.9063f, 15.4219f)
                curveTo(2.9063f, 15.9141f, 3.2695f, 16.2539f, 3.8086f, 16.2539f)
                curveTo(4.1953f, 16.2539f, 4.4648f, 16.1836f, 4.9805f, 16.0195f)
                curveTo(6.5859f, 15.4922f, 8.0508f, 14.5664f, 9.1758f, 13.3828f)
                curveTo(10.7461f, 11.7422f, 11.7188f, 9.5508f, 11.7188f, 6.9492f)
                curveTo(11.7188f, 2.5547f, 8.9297f, 0.0117f, 5.6602f, 0.0117f)
                curveTo(2.4375f, 0.0117f, 0.0f, 2.4727f, 0.0f, 5.6484f)
                close()
                moveTo(14.0742f, 5.6484f)
                curveTo(14.0742f, 8.7656f, 16.3828f, 11.25f, 19.3594f, 11.25f)
                curveTo(20.7539f, 11.25f, 22.0664f, 10.6992f, 23.0508f, 9.6211f)
                lineTo(23.3555f, 9.6211f)
                curveTo(22.6875f, 11.8359f, 20.625f, 13.6875f, 18.0586f, 14.4492f)
                curveTo(17.6836f, 14.5664f, 17.4258f, 14.6719f, 17.2617f, 14.8125f)
                curveTo(17.0742f, 14.9648f, 16.9688f, 15.1523f, 16.9688f, 15.4219f)
                curveTo(16.9688f, 15.9141f, 17.3438f, 16.2539f, 17.8945f, 16.2539f)
                curveTo(18.2578f, 16.2539f, 18.5391f, 16.1836f, 19.043f, 16.0195f)
                curveTo(20.6602f, 15.4922f, 22.1133f, 14.5664f, 23.2266f, 13.3828f)
                curveTo(24.8203f, 11.7422f, 25.793f, 9.5508f, 25.793f, 6.9492f)
                curveTo(25.793f, 2.5547f, 23.0039f, 0.0117f, 19.7344f, 0.0117f)
                curveTo(16.5117f, 0.0117f, 14.0742f, 2.4727f, 14.0742f, 5.6484f)
                close()
            }
        }
        .build()
        return _quoteClosing!!
    }

private var _quoteClosing: ImageVector? = null
