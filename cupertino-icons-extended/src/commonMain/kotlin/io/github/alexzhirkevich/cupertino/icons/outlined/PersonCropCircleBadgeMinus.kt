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

public val CupertinoIcons.Outlined.PersonCropCircleBadgeMinus: ImageVector
    get() {
        if (_personCropCircleBadgeMinus != null) {
            return _personCropCircleBadgeMinus!!
        }
        _personCropCircleBadgeMinus = Builder(name = "PersonCropCircleBadgeMinus", defaultWidth =
                28.3477.dp, defaultHeight = 24.1523.dp, viewportWidth = 28.3477f, viewportHeight =
                24.1523f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(28.3477f)
                verticalLineToRelative(24.1523f)
                horizontalLineToRelative(-28.3477f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3945f, 24.0234f)
                curveTo(22.9219f, 24.0234f, 28.3477f, 18.5977f, 28.3477f, 12.0703f)
                curveTo(28.3477f, 5.5313f, 22.9102f, 0.1172f, 16.3828f, 0.1172f)
                curveTo(10.2773f, 0.1172f, 5.1797f, 4.8164f, 4.5234f, 10.7578f)
                curveTo(5.0977f, 10.6523f, 5.9297f, 10.6055f, 6.5508f, 10.6758f)
                curveTo(7.1953f, 5.8125f, 11.3203f, 2.1094f, 16.3828f, 2.1094f)
                curveTo(21.9023f, 2.1094f, 26.3555f, 6.5391f, 26.3555f, 12.0703f)
                curveTo(26.3555f, 14.6484f, 25.3945f, 16.9922f, 23.7891f, 18.7383f)
                curveTo(22.6406f, 17.3672f, 19.9219f, 16.0547f, 16.3828f, 16.0547f)
                curveTo(15.2578f, 16.0547f, 14.2266f, 16.1953f, 13.3008f, 16.418f)
                curveTo(13.4414f, 16.9805f, 13.5117f, 17.5898f, 13.5117f, 18.1875f)
                curveTo(13.5117f, 20.0156f, 12.8438f, 21.7148f, 11.7188f, 23.0391f)
                curveTo(13.1602f, 23.6719f, 14.7422f, 24.0234f, 16.3945f, 24.0234f)
                close()
                moveTo(16.3828f, 14.0625f)
                curveTo(18.6328f, 14.0859f, 20.4023f, 12.1641f, 20.4023f, 9.6445f)
                curveTo(20.4023f, 7.2773f, 18.6211f, 5.3203f, 16.3828f, 5.3203f)
                curveTo(14.1328f, 5.3203f, 12.3398f, 7.2773f, 12.3633f, 9.6445f)
                curveTo(12.375f, 12.1523f, 14.1328f, 14.0391f, 16.3828f, 14.0625f)
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
