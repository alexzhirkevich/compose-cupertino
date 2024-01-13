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

public val CupertinoIcons.Filled.PersonCropCircle: ImageVector
    get() {
        if (_personCropCircle != null) {
            return _personCropCircle!!
        }
        _personCropCircle = Builder(name = "PersonCropCircle", defaultWidth = 23.9062.dp,
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
                moveTo(11.9414f, 22.125f)
                curveTo(9.2578f, 22.125f, 6.5391f, 21.0234f, 4.7461f, 19.1133f)
                curveTo(6.0117f, 17.1211f, 8.7656f, 15.9492f, 11.9414f, 15.9492f)
                curveTo(15.0938f, 15.9492f, 17.8711f, 17.0977f, 19.1484f, 19.1133f)
                curveTo(17.3438f, 21.0234f, 14.6367f, 22.125f, 11.9414f, 22.125f)
                close()
                moveTo(11.9414f, 13.957f)
                curveTo(9.6914f, 13.9336f, 7.9219f, 12.0586f, 7.9219f, 9.5391f)
                curveTo(7.9102f, 7.1719f, 9.7031f, 5.2031f, 11.9414f, 5.2031f)
                curveTo(14.1914f, 5.2031f, 15.9609f, 7.1719f, 15.9609f, 9.5391f)
                curveTo(15.9609f, 12.0586f, 14.2031f, 13.9805f, 11.9414f, 13.957f)
                close()
            }
        }
        .build()
        return _personCropCircle!!
    }

private var _personCropCircle: ImageVector? = null
