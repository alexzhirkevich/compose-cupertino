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

public val CupertinoIcons.Outlined.LinkCircle: ImageVector
    get() {
        if (_linkCircle != null) {
            return _linkCircle!!
        }
        _linkCircle = Builder(name = "LinkCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2227f, 17.4727f)
                curveTo(7.6875f, 18.9258f, 9.5156f, 18.8086f, 11.2148f, 17.0977f)
                lineTo(12.9727f, 15.3516f)
                curveTo(14.707f, 13.6289f, 14.8477f, 11.7891f, 13.3594f, 10.3125f)
                curveTo(12.9609f, 9.9023f, 12.5039f, 9.6211f, 12.1758f, 9.5625f)
                curveTo(11.8477f, 9.7969f, 11.4492f, 10.2305f, 11.2617f, 10.6406f)
                curveTo(11.8008f, 10.7227f, 12.2109f, 10.9102f, 12.4922f, 11.1797f)
                curveTo(13.4062f, 12.1055f, 13.2656f, 13.3242f, 12.0703f, 14.5078f)
                lineTo(10.3711f, 16.207f)
                curveTo(9.2227f, 17.3555f, 8.0156f, 17.4844f, 7.0898f, 16.582f)
                curveTo(6.1758f, 15.668f, 6.2813f, 14.4492f, 7.4648f, 13.3008f)
                lineTo(8.6719f, 12.0938f)
                curveTo(8.4844f, 11.6484f, 8.4727f, 10.9688f, 8.6602f, 10.3945f)
                lineTo(6.5742f, 12.457f)
                curveTo(4.875f, 14.168f, 4.7344f, 15.9961f, 6.2227f, 17.4727f)
                close()
                moveTo(17.2617f, 6.3984f)
                curveTo(15.7969f, 4.9453f, 13.9688f, 5.0625f, 12.2695f, 6.7734f)
                lineTo(10.5117f, 8.5078f)
                curveTo(8.7773f, 10.2422f, 8.6367f, 12.0703f, 10.125f, 13.5469f)
                curveTo(10.5234f, 13.9688f, 10.9805f, 14.2383f, 11.3086f, 14.3086f)
                curveTo(11.6367f, 14.0625f, 12.0352f, 13.6289f, 12.2227f, 13.2305f)
                curveTo(11.6836f, 13.1484f, 11.2734f, 12.9609f, 10.9922f, 12.6797f)
                curveTo(10.0781f, 11.7656f, 10.2188f, 10.5352f, 11.4141f, 9.3633f)
                lineTo(13.1133f, 7.6641f)
                curveTo(14.2617f, 6.5156f, 15.4688f, 6.3867f, 16.3945f, 7.2891f)
                curveTo(17.3086f, 8.2031f, 17.2031f, 9.4219f, 16.0195f, 10.5703f)
                lineTo(14.8125f, 11.7656f)
                curveTo(15.0f, 12.2227f, 15.0117f, 12.8906f, 14.8242f, 13.4766f)
                lineTo(16.9102f, 11.4023f)
                curveTo(18.6094f, 9.7031f, 18.75f, 7.875f, 17.2617f, 6.3984f)
                close()
            }
        }
        .build()
        return _linkCircle!!
    }

private var _linkCircle: ImageVector? = null
