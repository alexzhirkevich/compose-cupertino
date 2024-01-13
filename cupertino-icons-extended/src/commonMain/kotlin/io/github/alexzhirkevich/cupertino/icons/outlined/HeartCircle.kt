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

public val CupertinoIcons.Outlined.HeartCircle: ImageVector
    get() {
        if (_heartCircle != null) {
            return _heartCircle!!
        }
        _heartCircle = Builder(name = "HeartCircle", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
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
                moveTo(9.1406f, 6.7852f)
                curveTo(7.1484f, 6.7852f, 5.7188f, 8.2852f, 5.7188f, 10.3594f)
                curveTo(5.7188f, 13.4414f, 8.9648f, 16.2773f, 11.3672f, 17.8008f)
                curveTo(11.5781f, 17.918f, 11.8242f, 18.082f, 11.9766f, 18.082f)
                curveTo(12.1289f, 18.082f, 12.3633f, 17.9297f, 12.5391f, 17.8008f)
                curveTo(14.918f, 16.2422f, 18.1875f, 13.4414f, 18.1875f, 10.3594f)
                curveTo(18.1875f, 8.2852f, 16.7578f, 6.7852f, 14.7656f, 6.7852f)
                curveTo(13.5234f, 6.7852f, 12.5391f, 7.5f, 11.9531f, 8.5664f)
                curveTo(11.3672f, 7.5f, 10.3945f, 6.7852f, 9.1406f, 6.7852f)
                close()
            }
        }
        .build()
        return _heartCircle!!
    }

private var _heartCircle: ImageVector? = null
