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

public val CupertinoIcons.Outlined.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 20.8125.dp, defaultHeight = 23.0039.dp,
                viewportWidth = 20.8125f, viewportHeight = 23.0039f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.8906f, 23.0039f)
                curveTo(1.3828f, 23.0039f, 1.7813f, 22.6172f, 1.7813f, 22.125f)
                lineTo(1.7813f, 15.6094f)
                curveTo(2.0742f, 15.4805f, 3.1758f, 15.0586f, 4.8984f, 15.0586f)
                curveTo(9.2344f, 15.0586f, 11.9531f, 17.1797f, 16.0781f, 17.1797f)
                curveTo(17.9062f, 17.1797f, 18.5859f, 16.9805f, 19.4766f, 16.582f)
                curveTo(20.2852f, 16.2188f, 20.8125f, 15.6094f, 20.8125f, 14.5312f)
                lineTo(20.8125f, 2.6367f)
                curveTo(20.8125f, 2.0039f, 20.2734f, 1.6406f, 19.5938f, 1.6406f)
                curveTo(19.0195f, 1.6406f, 17.9414f, 2.1328f, 15.9258f, 2.1328f)
                curveTo(11.8008f, 2.1328f, 9.0938f, 0.0117f, 4.7461f, 0.0117f)
                curveTo(2.918f, 0.0117f, 2.2266f, 0.2109f, 1.3359f, 0.6094f)
                curveTo(0.5273f, 0.9727f, 0.0f, 1.582f, 0.0f, 2.6484f)
                lineTo(0.0f, 22.125f)
                curveTo(0.0f, 22.6055f, 0.4102f, 23.0039f, 0.8906f, 23.0039f)
                close()
                moveTo(16.0781f, 15.4102f)
                curveTo(12.1758f, 15.4102f, 9.4102f, 13.2891f, 4.8984f, 13.2891f)
                curveTo(3.6094f, 13.2891f, 2.4375f, 13.4414f, 1.7813f, 13.7109f)
                lineTo(1.7813f, 2.707f)
                curveTo(1.9453f, 2.3203f, 2.918f, 1.7813f, 4.7461f, 1.7813f)
                curveTo(8.8711f, 1.7813f, 11.625f, 3.9023f, 15.9258f, 3.9023f)
                curveTo(17.2031f, 3.9023f, 18.2578f, 3.75f, 19.043f, 3.5273f)
                lineTo(19.043f, 14.4844f)
                curveTo(18.8789f, 14.8711f, 17.9062f, 15.4102f, 16.0781f, 15.4102f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
