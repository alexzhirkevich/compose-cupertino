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

public val CupertinoIcons.Outlined.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(5.4727f, 13.1836f)
                curveTo(5.4727f, 13.8984f, 5.9648f, 14.3789f, 6.668f, 14.3789f)
                lineTo(9.4922f, 14.3789f)
                lineTo(9.4922f, 17.1914f)
                curveTo(9.4922f, 17.9297f, 9.9727f, 18.3984f, 10.6875f, 18.3984f)
                lineTo(13.1719f, 18.3984f)
                curveTo(13.8984f, 18.3984f, 14.3672f, 17.9297f, 14.3672f, 17.1914f)
                lineTo(14.3672f, 14.3789f)
                lineTo(17.1914f, 14.3789f)
                curveTo(17.918f, 14.3789f, 18.3984f, 13.8984f, 18.3984f, 13.1836f)
                lineTo(18.3984f, 10.6875f)
                curveTo(18.3984f, 9.9844f, 17.918f, 9.4922f, 17.1914f, 9.4922f)
                lineTo(14.3672f, 9.4922f)
                lineTo(14.3672f, 6.6914f)
                curveTo(14.3672f, 5.9648f, 13.8984f, 5.4844f, 13.1719f, 5.4844f)
                lineTo(10.6875f, 5.4844f)
                curveTo(9.9727f, 5.4844f, 9.4922f, 5.9648f, 9.4922f, 6.6914f)
                lineTo(9.4922f, 9.4922f)
                lineTo(6.668f, 9.4922f)
                curveTo(5.9531f, 9.4922f, 5.4727f, 9.9844f, 5.4727f, 10.6875f)
                close()
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
