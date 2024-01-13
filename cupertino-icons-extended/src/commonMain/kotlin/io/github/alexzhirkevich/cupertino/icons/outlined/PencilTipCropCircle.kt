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

public val CupertinoIcons.Outlined.PencilTipCropCircle: ImageVector
    get() {
        if (_pencilTipCropCircle != null) {
            return _pencilTipCropCircle!!
        }
        _pencilTipCropCircle = Builder(name = "PencilTipCropCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                close()
                moveTo(2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9023f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9258f, 15.5039f, 20.0859f, 18.6094f, 17.3086f, 20.3672f)
                lineTo(15.8438f, 13.4883f)
                curveTo(15.7383f, 12.9258f, 15.293f, 12.5156f, 14.7539f, 12.4805f)
                lineTo(14.6719f, 12.4805f)
                lineTo(12.7266f, 6.6328f)
                curveTo(12.4688f, 5.8711f, 11.4492f, 5.8711f, 11.1914f, 6.6328f)
                lineTo(9.2461f, 12.4805f)
                lineTo(9.1641f, 12.4805f)
                curveTo(8.6367f, 12.5156f, 8.1797f, 12.9258f, 8.0742f, 13.4766f)
                lineTo(6.6211f, 20.3672f)
                curveTo(3.832f, 18.6094f, 2.0039f, 15.5156f, 2.0039f, 11.9531f)
                close()
                moveTo(8.0156f, 21.1055f)
                lineTo(9.5156f, 13.9922f)
                lineTo(14.4141f, 13.9922f)
                lineTo(15.9141f, 21.1055f)
                curveTo(14.6953f, 21.6211f, 13.3594f, 21.9141f, 11.9531f, 21.9141f)
                curveTo(10.5469f, 21.9141f, 9.2109f, 21.6328f, 8.0156f, 21.1055f)
                close()
            }
        }
        .build()
        return _pencilTipCropCircle!!
    }

private var _pencilTipCropCircle: ImageVector? = null
