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

public val CupertinoIcons.Filled.ExclamationmarkCircle: ImageVector
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
                moveTo(11.9531f, 14.1328f)
                curveTo(11.3438f, 14.1328f, 11.0039f, 13.793f, 10.9922f, 13.1719f)
                lineTo(10.8398f, 6.7852f)
                curveTo(10.8281f, 6.1641f, 11.2852f, 5.7188f, 11.9414f, 5.7188f)
                curveTo(12.5859f, 5.7188f, 13.0664f, 6.1758f, 13.0547f, 6.7969f)
                lineTo(12.8906f, 13.1719f)
                curveTo(12.8789f, 13.8047f, 12.5391f, 14.1328f, 11.9531f, 14.1328f)
                close()
                moveTo(11.9531f, 18.0586f)
                curveTo(11.25f, 18.0586f, 10.6406f, 17.4961f, 10.6406f, 16.8047f)
                curveTo(10.6406f, 16.1133f, 11.2383f, 15.5391f, 11.9531f, 15.5391f)
                curveTo(12.668f, 15.5391f, 13.2656f, 16.1016f, 13.2656f, 16.8047f)
                curveTo(13.2656f, 17.5078f, 12.6562f, 18.0586f, 11.9531f, 18.0586f)
                close()
            }
        }
        .build()
        return _exclamationmarkCircle!!
    }

private var _exclamationmarkCircle: ImageVector? = null
