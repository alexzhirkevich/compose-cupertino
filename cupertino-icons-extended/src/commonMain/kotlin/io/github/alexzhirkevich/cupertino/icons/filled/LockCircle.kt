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

public val CupertinoIcons.Filled.LockCircle: ImageVector
    get() {
        if (_lockCircle != null) {
            return _lockCircle!!
        }
        _lockCircle = Builder(name = "LockCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.918f)
                curveTo(18.4922f, 23.918f, 23.9062f, 18.5039f, 23.9062f, 11.9648f)
                curveTo(23.9062f, 5.4375f, 18.4805f, 0.0117f, 11.9414f, 0.0117f)
                curveTo(5.4141f, 0.0117f, 0.0f, 5.4375f, 0.0f, 11.9648f)
                curveTo(0.0f, 18.5039f, 5.4258f, 23.918f, 11.9531f, 23.918f)
                close()
                moveTo(7.5938f, 16.7578f)
                lineTo(7.5938f, 11.9414f)
                curveTo(7.5938f, 11.0859f, 7.9453f, 10.6758f, 8.6484f, 10.6289f)
                lineTo(8.6484f, 9.1992f)
                curveTo(8.6484f, 6.9727f, 9.9844f, 5.4844f, 11.9531f, 5.4844f)
                curveTo(13.9219f, 5.4844f, 15.2578f, 6.9727f, 15.2578f, 9.1992f)
                lineTo(15.2578f, 10.6289f)
                curveTo(15.9609f, 10.6758f, 16.3125f, 11.0859f, 16.3125f, 11.9414f)
                lineTo(16.3125f, 16.7578f)
                curveTo(16.3125f, 17.6602f, 15.9141f, 18.0703f, 15.082f, 18.0703f)
                lineTo(8.8242f, 18.0703f)
                curveTo(7.9922f, 18.0703f, 7.5938f, 17.6602f, 7.5938f, 16.7578f)
                close()
                moveTo(9.9141f, 10.6172f)
                lineTo(13.9922f, 10.6172f)
                lineTo(13.9922f, 9.0586f)
                curveTo(13.9922f, 7.6523f, 13.1719f, 6.7031f, 11.9531f, 6.7031f)
                curveTo(10.7344f, 6.7031f, 9.9141f, 7.6523f, 9.9141f, 9.0586f)
                close()
            }
        }
        .build()
        return _lockCircle!!
    }

private var _lockCircle: ImageVector? = null
