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

public val CupertinoIcons.Outlined.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(name = "MusicNote", defaultWidth = 14.2969.dp, defaultHeight =
                24.082.dp, viewportWidth = 14.2969f, viewportHeight = 24.082f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2969f, 5.8711f)
                lineTo(14.2969f, 1.4648f)
                curveTo(14.2969f, 0.8438f, 13.793f, 0.4453f, 13.1953f, 0.5625f)
                lineTo(7.1719f, 1.875f)
                curveTo(6.4219f, 2.0391f, 6.0117f, 2.4492f, 6.0117f, 3.1055f)
                lineTo(6.0352f, 16.1367f)
                curveTo(6.0938f, 16.7109f, 5.8242f, 17.0859f, 5.3086f, 17.1914f)
                lineTo(3.4453f, 17.5781f)
                curveTo(1.1016f, 18.0703f, 0.0f, 19.2656f, 0.0f, 21.0352f)
                curveTo(0.0f, 22.8281f, 1.3828f, 24.082f, 3.3281f, 24.082f)
                curveTo(5.0508f, 24.082f, 7.6289f, 22.8164f, 7.6289f, 19.4062f)
                lineTo(7.6289f, 8.6836f)
                curveTo(7.6289f, 8.0625f, 7.7461f, 7.9336f, 8.2969f, 7.8164f)
                lineTo(13.6523f, 6.6445f)
                curveTo(14.0508f, 6.5625f, 14.2969f, 6.2578f, 14.2969f, 5.8711f)
                close()
            }
        }
        .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
