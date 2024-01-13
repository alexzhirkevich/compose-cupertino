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

public val CupertinoIcons.Outlined.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) {
            return _pauseCircle!!
        }
        _pauseCircle = Builder(name = "PauseCircle", defaultWidth = 23.9062.dp, defaultHeight =
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
                moveTo(8.6367f, 16.5234f)
                lineTo(9.7852f, 16.5234f)
                curveTo(10.3711f, 16.5234f, 10.6406f, 16.207f, 10.6406f, 15.75f)
                lineTo(10.6406f, 8.1328f)
                curveTo(10.6406f, 7.6875f, 10.3711f, 7.3711f, 9.7852f, 7.3711f)
                lineTo(8.6367f, 7.3711f)
                curveTo(8.0625f, 7.3711f, 7.793f, 7.6875f, 7.793f, 8.1328f)
                lineTo(7.793f, 15.75f)
                curveTo(7.793f, 16.207f, 8.0625f, 16.5234f, 8.6367f, 16.5234f)
                close()
                moveTo(14.1211f, 16.5234f)
                lineTo(15.2695f, 16.5234f)
                curveTo(15.832f, 16.5234f, 16.1016f, 16.207f, 16.1016f, 15.75f)
                lineTo(16.1016f, 8.1328f)
                curveTo(16.1016f, 7.6875f, 15.832f, 7.3711f, 15.2695f, 7.3711f)
                lineTo(14.1211f, 7.3711f)
                curveTo(13.5352f, 7.3711f, 13.2656f, 7.6875f, 13.2656f, 8.1328f)
                lineTo(13.2656f, 15.75f)
                curveTo(13.2656f, 16.207f, 13.5352f, 16.5234f, 14.1211f, 16.5234f)
                close()
            }
        }
        .build()
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
