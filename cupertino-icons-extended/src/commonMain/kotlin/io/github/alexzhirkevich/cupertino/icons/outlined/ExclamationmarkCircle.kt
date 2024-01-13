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

public val CupertinoIcons.Outlined.ExclamationmarkCircle: ImageVector
    get() {
        if (_exclamationmarkCircle != null) {
            return _exclamationmarkCircle!!
        }
        _exclamationmarkCircle = Builder(name = "ExclamationmarkCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
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
                moveTo(11.9414f, 14.0625f)
                curveTo(12.4922f, 14.0625f, 12.8203f, 13.7461f, 12.832f, 13.1367f)
                lineTo(13.0078f, 6.9492f)
                curveTo(13.0195f, 6.3516f, 12.5508f, 5.9063f, 11.9297f, 5.9063f)
                curveTo(11.2969f, 5.9063f, 10.8516f, 6.3398f, 10.8633f, 6.9375f)
                lineTo(11.0156f, 13.1367f)
                curveTo(11.0273f, 13.7344f, 11.3555f, 14.0625f, 11.9414f, 14.0625f)
                close()
                moveTo(11.9414f, 17.8711f)
                curveTo(12.6094f, 17.8711f, 13.1953f, 17.332f, 13.1953f, 16.6523f)
                curveTo(13.1953f, 15.9727f, 12.6211f, 15.4336f, 11.9414f, 15.4336f)
                curveTo(11.25f, 15.4336f, 10.6758f, 15.9844f, 10.6758f, 16.6523f)
                curveTo(10.6758f, 17.3203f, 11.2617f, 17.8711f, 11.9414f, 17.8711f)
                close()
            }
        }
        .build()
        return _exclamationmarkCircle!!
    }

private var _exclamationmarkCircle: ImageVector? = null
