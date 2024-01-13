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

public val CupertinoIcons.Outlined.InfoCircle: ImageVector
    get() {
        if (_infoCircle != null) {
            return _infoCircle!!
        }
        _infoCircle = Builder(name = "InfoCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(9.9023f, 18.5156f)
                lineTo(14.6719f, 18.5156f)
                curveTo(15.1523f, 18.5156f, 15.5273f, 18.1641f, 15.5273f, 17.6836f)
                curveTo(15.5273f, 17.2266f, 15.1523f, 16.8633f, 14.6719f, 16.8633f)
                lineTo(13.2188f, 16.8633f)
                lineTo(13.2188f, 10.8984f)
                curveTo(13.2188f, 10.2656f, 12.9023f, 9.8438f, 12.3047f, 9.8438f)
                lineTo(10.1016f, 9.8438f)
                curveTo(9.6211f, 9.8438f, 9.2461f, 10.207f, 9.2461f, 10.6641f)
                curveTo(9.2461f, 11.1445f, 9.6211f, 11.4961f, 10.1016f, 11.4961f)
                lineTo(11.3555f, 11.4961f)
                lineTo(11.3555f, 16.8633f)
                lineTo(9.9023f, 16.8633f)
                curveTo(9.4219f, 16.8633f, 9.0469f, 17.2266f, 9.0469f, 17.6836f)
                curveTo(9.0469f, 18.1641f, 9.4219f, 18.5156f, 9.9023f, 18.5156f)
                close()
                moveTo(11.8477f, 7.8984f)
                curveTo(12.7031f, 7.8984f, 13.3711f, 7.2188f, 13.3711f, 6.3633f)
                curveTo(13.3711f, 5.5078f, 12.7031f, 4.8281f, 11.8477f, 4.8281f)
                curveTo(11.0039f, 4.8281f, 10.3242f, 5.5078f, 10.3242f, 6.3633f)
                curveTo(10.3242f, 7.2188f, 11.0039f, 7.8984f, 11.8477f, 7.8984f)
                close()
            }
        }
        .build()
        return _infoCircle!!
    }

private var _infoCircle: ImageVector? = null
