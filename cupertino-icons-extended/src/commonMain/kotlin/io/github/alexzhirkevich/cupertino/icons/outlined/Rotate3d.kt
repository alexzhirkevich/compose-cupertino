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

public val CupertinoIcons.Outlined.Rotate3d: ImageVector
    get() {
        if (_rotate3d != null) {
            return _rotate3d!!
        }
        _rotate3d = Builder(name = "Rotate3d", defaultWidth = 23.9062.dp, defaultHeight = 23.918.dp,
                viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0898f, 12.3398f)
                curveTo(7.0898f, 16.6758f, 8.3906f, 20.9648f, 10.9805f, 23.6719f)
                lineTo(12.457f, 22.8633f)
                curveTo(10.1484f, 20.3672f, 8.9648f, 16.3828f, 8.9648f, 12.3398f)
                curveTo(8.9648f, 8.0508f, 10.1953f, 3.7852f, 12.457f, 1.043f)
                lineTo(10.9688f, 0.2461f)
                curveTo(8.4375f, 3.1758f, 7.0898f, 7.7578f, 7.0898f, 12.3398f)
                close()
                moveTo(11.5312f, 16.2656f)
                curveTo(16.1016f, 16.2656f, 20.6836f, 14.9297f, 23.6133f, 12.3867f)
                lineTo(22.8281f, 10.8984f)
                curveTo(20.0859f, 13.1719f, 15.8203f, 14.3906f, 11.5312f, 14.3906f)
                curveTo(7.4766f, 14.3906f, 3.4922f, 13.207f, 0.9961f, 10.8984f)
                lineTo(0.1992f, 12.375f)
                curveTo(2.8945f, 14.9648f, 7.1836f, 16.2656f, 11.5312f, 16.2656f)
                close()
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
        }
        .build()
        return _rotate3d!!
    }

private var _rotate3d: ImageVector? = null
