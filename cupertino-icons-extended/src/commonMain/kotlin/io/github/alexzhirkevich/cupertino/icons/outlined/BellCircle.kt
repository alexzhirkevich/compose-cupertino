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

public val CupertinoIcons.Outlined.BellCircle: ImageVector
    get() {
        if (_bellCircle != null) {
            return _bellCircle!!
        }
        _bellCircle = Builder(name = "BellCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(6.7969f, 16.1836f)
                lineTo(17.1211f, 16.1836f)
                curveTo(17.7188f, 16.1836f, 18.0703f, 15.8672f, 18.0703f, 15.4102f)
                curveTo(18.0703f, 14.7539f, 17.4258f, 14.1797f, 16.8516f, 13.5938f)
                curveTo(16.4062f, 13.1367f, 16.3242f, 12.2109f, 16.2773f, 11.4727f)
                curveTo(16.2188f, 8.9766f, 15.5508f, 7.2656f, 13.8398f, 6.6328f)
                curveTo(13.582f, 5.8008f, 12.9023f, 5.1211f, 11.9531f, 5.1211f)
                curveTo(11.0039f, 5.1211f, 10.3359f, 5.8008f, 10.0664f, 6.6328f)
                curveTo(8.3555f, 7.2656f, 7.6875f, 8.9766f, 7.6406f, 11.4727f)
                curveTo(7.582f, 12.2109f, 7.4883f, 13.1367f, 7.0547f, 13.5938f)
                curveTo(6.5039f, 14.1914f, 5.8359f, 14.7539f, 5.8359f, 15.4102f)
                curveTo(5.8359f, 15.8672f, 6.1875f, 16.1836f, 6.7969f, 16.1836f)
                close()
                moveTo(11.9531f, 18.8906f)
                curveTo(13.0547f, 18.8906f, 13.8633f, 18.1055f, 13.9336f, 17.1562f)
                lineTo(9.9727f, 17.1562f)
                curveTo(10.0547f, 18.1055f, 10.8516f, 18.8906f, 11.9531f, 18.8906f)
                close()
            }
        }
        .build()
        return _bellCircle!!
    }

private var _bellCircle: ImageVector? = null
