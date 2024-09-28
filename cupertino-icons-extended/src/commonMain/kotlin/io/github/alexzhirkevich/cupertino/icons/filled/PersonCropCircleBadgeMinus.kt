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

public val CupertinoIcons.Filled.PersonCropCircleBadgeMinus: ImageVector
    get() {
        if (_personCropCircleBadgeMinus != null) {
            return _personCropCircleBadgeMinus!!
        }
        _personCropCircleBadgeMinus = Builder(name = "PersonCropCircleBadgeMinus", defaultWidth =
                28.3477.dp, defaultHeight = 24.1523.dp, viewportWidth = 28.3477f, viewportHeight =
                24.1523f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3945f, 24.0234f)
                curveTo(22.9219f, 24.0234f, 28.3477f, 18.6094f, 28.3477f, 12.0703f)
                curveTo(28.3477f, 5.543f, 22.9102f, 0.1172f, 16.3828f, 0.1172f)
                curveTo(10.2891f, 0.1172f, 5.1914f, 4.8281f, 4.5234f, 10.7695f)
                curveTo(4.9805f, 10.6758f, 5.4609f, 10.6289f, 5.9531f, 10.6289f)
                curveTo(9.5273f, 10.6289f, 12.5508f, 13.1719f, 13.3008f, 16.4297f)
                curveTo(14.2266f, 16.1953f, 15.2578f, 16.0664f, 16.3828f, 16.0664f)
                curveTo(19.9219f, 16.0664f, 22.6406f, 17.3789f, 23.7891f, 18.75f)
                curveTo(22.0312f, 20.7539f, 19.3008f, 22.0547f, 16.3828f, 22.0547f)
                curveTo(15.1875f, 22.0547f, 13.8867f, 21.8203f, 12.7734f, 21.3633f)
                curveTo(12.6211f, 21.7969f, 12.2109f, 22.4531f, 11.707f, 23.0391f)
                curveTo(13.1602f, 23.6836f, 14.7305f, 24.0234f, 16.3945f, 24.0234f)
                close()
                moveTo(16.3828f, 14.0742f)
                curveTo(14.1211f, 14.0508f, 12.375f, 12.1758f, 12.3633f, 9.6563f)
                curveTo(12.3398f, 7.2891f, 14.1328f, 5.3203f, 16.3828f, 5.3203f)
                curveTo(18.6211f, 5.3203f, 20.4023f, 7.2891f, 20.4023f, 9.6563f)
                curveTo(20.4023f, 12.1758f, 18.6328f, 14.0977f, 16.3828f, 14.0742f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9531f, 24.1523f)
                curveTo(9.1758f, 24.1523f, 11.9062f, 21.457f, 11.9062f, 18.1992f)
                curveTo(11.9062f, 14.9297f, 9.2227f, 12.2461f, 5.9531f, 12.2461f)
                curveTo(2.6953f, 12.2461f, 0.0f, 14.9414f, 0.0f, 18.1992f)
                curveTo(0.0f, 21.4805f, 2.6953f, 24.1523f, 5.9531f, 24.1523f)
                close()
                moveTo(2.9414f, 18.9141f)
                curveTo(2.543f, 18.9141f, 2.2266f, 18.5742f, 2.2266f, 18.1992f)
                curveTo(2.2266f, 17.8242f, 2.543f, 17.4844f, 2.9414f, 17.4844f)
                lineTo(8.9648f, 17.4844f)
                curveTo(9.3516f, 17.4844f, 9.6797f, 17.8242f, 9.6797f, 18.1992f)
                curveTo(9.6797f, 18.5742f, 9.3516f, 18.9141f, 8.9648f, 18.9141f)
                close()
            }
        }
        .build()
        return _personCropCircleBadgeMinus!!
    }

private var _personCropCircleBadgeMinus: ImageVector? = null
