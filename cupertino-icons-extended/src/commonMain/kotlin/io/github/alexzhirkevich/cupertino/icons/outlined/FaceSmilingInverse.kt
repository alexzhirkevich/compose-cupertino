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

public val CupertinoIcons.Outlined.FaceSmilingInverse: ImageVector
    get() {
        if (_faceSmilingInverse != null) {
            return _faceSmilingInverse!!
        }
        _faceSmilingInverse = Builder(name = "FaceSmilingInverse", defaultWidth = 23.9062.dp,
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
                moveTo(11.9531f, 17.9883f)
                curveTo(9.4219f, 17.9883f, 7.7227f, 16.3008f, 7.7227f, 15.5039f)
                curveTo(7.7227f, 15.2109f, 8.0156f, 15.082f, 8.2617f, 15.1992f)
                curveTo(9.1523f, 15.668f, 10.1836f, 16.2305f, 11.9531f, 16.2305f)
                curveTo(13.7109f, 16.2305f, 14.7539f, 15.6797f, 15.6328f, 15.1992f)
                curveTo(15.8906f, 15.082f, 16.1719f, 15.2109f, 16.1719f, 15.5039f)
                curveTo(16.1719f, 16.3008f, 14.4727f, 17.9883f, 11.9531f, 17.9883f)
                close()
                moveTo(8.3672f, 10.8516f)
                curveTo(7.6055f, 10.8516f, 6.9492f, 10.1602f, 6.9492f, 9.1992f)
                curveTo(6.9492f, 8.2148f, 7.6055f, 7.5234f, 8.3672f, 7.5234f)
                curveTo(9.1406f, 7.5234f, 9.8203f, 8.2148f, 9.8203f, 9.1992f)
                curveTo(9.8203f, 10.1602f, 9.1406f, 10.8516f, 8.3672f, 10.8516f)
                close()
                moveTo(15.5273f, 10.8516f)
                curveTo(14.7656f, 10.8516f, 14.1094f, 10.1602f, 14.1094f, 9.1992f)
                curveTo(14.1094f, 8.2148f, 14.7656f, 7.5234f, 15.5273f, 7.5234f)
                curveTo(16.3008f, 7.5234f, 16.9805f, 8.2148f, 16.9805f, 9.1992f)
                curveTo(16.9805f, 10.1602f, 16.3008f, 10.8516f, 15.5273f, 10.8516f)
                close()
            }
        }
        .build()
        return _faceSmilingInverse!!
    }

private var _faceSmilingInverse: ImageVector? = null
