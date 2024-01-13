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

public val CupertinoIcons.Filled.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 22.522.dp, defaultHeight =
                25.1836.dp, viewportWidth = 22.522f, viewportHeight = 25.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8525f, 16.582f)
                lineTo(18.8525f, 3.3633f)
                curveTo(18.8525f, 1.1367f, 17.7393f, 0.0f, 15.5361f, 0.0f)
                lineTo(6.3721f, 0.0f)
                curveTo(5.0244f, 0.0f, 4.0986f, 0.457f, 3.6065f, 1.3477f)
                close()
                moveTo(3.0557f, 7.1953f)
                lineTo(3.0557f, 23.707f)
                curveTo(3.0557f, 24.6211f, 3.5127f, 25.1367f, 4.2979f, 25.1367f)
                curveTo(4.8721f, 25.1367f, 5.2119f, 24.8086f, 6.2666f, 23.7891f)
                lineTo(10.8486f, 19.2773f)
                curveTo(10.9072f, 19.2188f, 11.0127f, 19.2188f, 11.0596f, 19.2773f)
                lineTo(15.6416f, 23.7891f)
                curveTo(16.6963f, 24.8086f, 17.0361f, 25.1367f, 17.6104f, 25.1367f)
                curveTo(18.3955f, 25.1367f, 18.8525f, 24.6211f, 18.8525f, 23.707f)
                lineTo(18.8525f, 23.0156f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9854f, 23.1211f)
                curveTo(21.3369f, 23.4727f, 21.9111f, 23.4727f, 22.2627f, 23.1211f)
                curveTo(22.6025f, 22.7695f, 22.6143f, 22.1953f, 22.2627f, 21.8438f)
                lineTo(1.5439f, 1.1133f)
                curveTo(1.1924f, 0.7617f, 0.6064f, 0.7617f, 0.2549f, 1.1133f)
                curveTo(-0.085f, 1.4531f, -0.085f, 2.0508f, 0.2549f, 2.3906f)
                close()
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null
