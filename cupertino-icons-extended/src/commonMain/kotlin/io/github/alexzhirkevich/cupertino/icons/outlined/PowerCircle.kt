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

public val CupertinoIcons.Outlined.PowerCircle: ImageVector
    get() {
        if (_powerCircle != null) {
            return _powerCircle!!
        }
        _powerCircle = Builder(name = "PowerCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(11.9531f, 18.0703f)
                curveTo(15.3047f, 18.0703f, 18.0938f, 15.2812f, 18.0938f, 11.9414f)
                curveTo(18.0938f, 10.2656f, 17.3438f, 8.5898f, 16.0898f, 7.4414f)
                curveTo(15.2812f, 6.6914f, 14.1914f, 7.8398f, 15.0117f, 8.6133f)
                curveTo(15.9375f, 9.4688f, 16.4648f, 10.6523f, 16.4766f, 11.9414f)
                curveTo(16.4766f, 14.4609f, 14.4727f, 16.4648f, 11.9531f, 16.4648f)
                curveTo(9.4336f, 16.4648f, 7.4414f, 14.4609f, 7.4414f, 11.9414f)
                curveTo(7.4414f, 10.6523f, 7.957f, 9.4688f, 8.8945f, 8.6016f)
                curveTo(9.7148f, 7.8281f, 8.625f, 6.6797f, 7.8281f, 7.4414f)
                curveTo(6.5625f, 8.5781f, 5.8125f, 10.2422f, 5.8125f, 11.9414f)
                curveTo(5.8125f, 15.2812f, 8.6016f, 18.0703f, 11.9531f, 18.0703f)
                close()
                moveTo(11.9531f, 12.2109f)
                curveTo(12.4102f, 12.2109f, 12.7383f, 11.8711f, 12.7383f, 11.4023f)
                lineTo(12.7383f, 6.2813f)
                curveTo(12.7383f, 5.8125f, 12.4102f, 5.4844f, 11.9531f, 5.4844f)
                curveTo(11.4961f, 5.4844f, 11.1797f, 5.8125f, 11.1797f, 6.2813f)
                lineTo(11.1797f, 11.4023f)
                curveTo(11.1797f, 11.8711f, 11.4961f, 12.2109f, 11.9531f, 12.2109f)
                close()
            }
        }
        .build()
        return _powerCircle!!
    }

private var _powerCircle: ImageVector? = null
