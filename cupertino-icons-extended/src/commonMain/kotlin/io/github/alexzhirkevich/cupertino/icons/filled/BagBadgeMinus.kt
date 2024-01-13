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

public val CupertinoIcons.Filled.BagBadgeMinus: ImageVector
    get() {
        if (_bagBadgeMinus != null) {
            return _bagBadgeMinus!!
        }
        _bagBadgeMinus = Builder(name = "BagBadgeMinus", defaultWidth = 26.7422.dp, defaultHeight =
                26.3086.dp, viewportWidth = 26.7422f, viewportHeight = 26.3086f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0625f, 4.5586f)
                lineTo(9.6211f, 4.5586f)
                curveTo(7.1719f, 4.5586f, 5.9414f, 5.7656f, 5.9414f, 8.1914f)
                lineTo(5.9414f, 12.6445f)
                curveTo(10.0898f, 12.6445f, 13.5117f, 16.0547f, 13.5117f, 20.2031f)
                curveTo(13.5117f, 21.5625f, 13.1367f, 22.8398f, 12.4922f, 23.9531f)
                lineTo(23.4141f, 23.9531f)
                curveTo(25.5117f, 23.9531f, 26.7422f, 22.7344f, 26.7422f, 20.3203f)
                lineTo(26.7422f, 8.1914f)
                curveTo(26.7422f, 5.7773f, 25.5f, 4.5586f, 23.0625f, 4.5586f)
                close()
                moveTo(11.4844f, 4.6641f)
                lineTo(13.3711f, 4.6641f)
                curveTo(13.3711f, 3.082f, 14.6484f, 1.7813f, 16.3359f, 1.7813f)
                curveTo(18.0352f, 1.7813f, 19.3008f, 3.082f, 19.3008f, 4.6641f)
                lineTo(21.1875f, 4.6641f)
                curveTo(21.1875f, 2.1563f, 19.0312f, 0.0f, 16.3359f, 0.0f)
                curveTo(13.6523f, 0.0f, 11.4844f, 2.1563f, 11.4844f, 4.6641f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9531f, 26.1562f)
                curveTo(9.1758f, 26.1562f, 11.9062f, 23.4492f, 11.9062f, 20.1914f)
                curveTo(11.9062f, 16.9336f, 9.2109f, 14.2383f, 5.9531f, 14.2383f)
                curveTo(2.6836f, 14.2383f, 0.0f, 16.9336f, 0.0f, 20.1914f)
                curveTo(0.0f, 23.4727f, 2.6836f, 26.1562f, 5.9531f, 26.1562f)
                close()
                moveTo(2.9297f, 20.918f)
                curveTo(2.543f, 20.918f, 2.2148f, 20.5781f, 2.2148f, 20.1914f)
                curveTo(2.2148f, 19.8164f, 2.543f, 19.4766f, 2.9297f, 19.4766f)
                lineTo(8.9648f, 19.4766f)
                curveTo(9.3516f, 19.4766f, 9.6797f, 19.8164f, 9.6797f, 20.1914f)
                curveTo(9.6797f, 20.5781f, 9.3516f, 20.918f, 8.9648f, 20.918f)
                close()
            }
        }
        .build()
        return _bagBadgeMinus!!
    }

private var _bagBadgeMinus: ImageVector? = null
