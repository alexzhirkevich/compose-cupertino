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

public val CupertinoIcons.Outlined.IphoneBadgePlay: ImageVector
    get() {
        if (_iphoneBadgePlay != null) {
            return _iphoneBadgePlay!!
        }
        _iphoneBadgePlay = Builder(name = "IphoneBadgePlay", defaultWidth = 20.0977.dp,
                defaultHeight = 27.8555.dp, viewportWidth = 20.0977f, viewportHeight =
                27.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 23.2734f)
                curveTo(0.0f, 25.1016f, 1.2773f, 26.3203f, 3.1875f, 26.3203f)
                lineTo(8.0039f, 26.3203f)
                curveTo(7.6055f, 25.7695f, 7.2773f, 25.1484f, 7.0547f, 24.4336f)
                lineTo(3.4336f, 24.4336f)
                curveTo(2.4375f, 24.4336f, 1.8867f, 23.9062f, 1.8867f, 22.9688f)
                lineTo(1.8867f, 4.8633f)
                curveTo(1.8867f, 3.9258f, 2.4375f, 3.3984f, 3.4336f, 3.3984f)
                lineTo(4.9336f, 3.3984f)
                curveTo(5.1211f, 3.3984f, 5.2148f, 3.4922f, 5.2148f, 3.668f)
                lineTo(5.2148f, 3.9375f)
                curveTo(5.2148f, 4.4297f, 5.543f, 4.7578f, 6.0234f, 4.7578f)
                lineTo(9.0469f, 4.7578f)
                curveTo(9.5391f, 4.7578f, 9.8555f, 4.4297f, 9.8555f, 3.9375f)
                lineTo(9.8555f, 3.668f)
                curveTo(9.8555f, 3.4922f, 9.9492f, 3.3984f, 10.1367f, 3.3984f)
                lineTo(11.6367f, 3.3984f)
                curveTo(12.6211f, 3.3984f, 13.1719f, 3.9258f, 13.1719f, 4.8633f)
                lineTo(13.1836f, 14.4023f)
                curveTo(13.5f, 14.3555f, 13.8164f, 14.332f, 14.1328f, 14.332f)
                curveTo(14.4492f, 14.332f, 14.7656f, 14.3555f, 15.0703f, 14.3906f)
                lineTo(15.0703f, 4.5586f)
                curveTo(15.0703f, 2.7305f, 13.7812f, 1.5117f, 11.8711f, 1.5117f)
                lineTo(3.1875f, 1.5117f)
                curveTo(1.2773f, 1.5117f, 0.0f, 2.7305f, 0.0f, 4.5586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1328f, 27.8555f)
                curveTo(17.3672f, 27.8555f, 20.0977f, 25.1602f, 20.0977f, 21.9023f)
                curveTo(20.0977f, 18.6328f, 17.4023f, 15.9492f, 14.1328f, 15.9492f)
                curveTo(10.875f, 15.9492f, 8.1797f, 18.6445f, 8.1797f, 21.9023f)
                curveTo(8.1797f, 25.1836f, 10.875f, 27.8555f, 14.1328f, 27.8555f)
                close()
                moveTo(12.2109f, 24.2695f)
                lineTo(12.2109f, 19.5234f)
                curveTo(12.2109f, 19.0312f, 12.7031f, 18.832f, 13.125f, 19.0898f)
                lineTo(16.957f, 21.3516f)
                curveTo(17.4141f, 21.6211f, 17.4492f, 22.1602f, 17.0273f, 22.4062f)
                lineTo(13.125f, 24.7031f)
                curveTo(12.7031f, 24.9609f, 12.2109f, 24.7617f, 12.2109f, 24.2695f)
                close()
            }
        }
        .build()
        return _iphoneBadgePlay!!
    }

private var _iphoneBadgePlay: ImageVector? = null
