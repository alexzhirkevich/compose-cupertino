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

public val CupertinoIcons.Outlined.SquareSplit1x2: ImageVector
    get() {
        if (_squareSplit1x2 != null) {
            return _squareSplit1x2!!
        }
        _squareSplit1x2 = Builder(name = "SquareSplit1x2", defaultWidth = 21.5742.dp, defaultHeight
                = 21.5977.dp, viewportWidth = 21.5742f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2656f, 9.8672f)
                lineTo(1.2656f, 11.7539f)
                lineTo(20.3438f, 11.7539f)
                lineTo(20.3438f, 9.8672f)
                close()
                moveTo(0.0f, 3.6914f)
                lineTo(0.0f, 17.918f)
                curveTo(0.0f, 20.3672f, 1.2188f, 21.5977f, 3.6328f, 21.5977f)
                lineTo(17.9414f, 21.5977f)
                curveTo(20.3555f, 21.5977f, 21.5742f, 20.3672f, 21.5742f, 17.918f)
                lineTo(21.5742f, 3.6914f)
                curveTo(21.5742f, 1.2539f, 20.3672f, 0.0234f, 17.9414f, 0.0234f)
                lineTo(3.6328f, 0.0234f)
                curveTo(1.207f, 0.0234f, 0.0f, 1.2539f, 0.0f, 3.6914f)
                close()
                moveTo(1.8867f, 3.7266f)
                curveTo(1.8867f, 2.5547f, 2.5078f, 1.9102f, 3.7266f, 1.9102f)
                lineTo(17.8477f, 1.9102f)
                curveTo(19.0664f, 1.9102f, 19.6875f, 2.5547f, 19.6875f, 3.7266f)
                lineTo(19.6875f, 17.8828f)
                curveTo(19.6875f, 19.043f, 19.0664f, 19.7109f, 17.8477f, 19.7109f)
                lineTo(3.7266f, 19.7109f)
                curveTo(2.5078f, 19.7109f, 1.8867f, 19.043f, 1.8867f, 17.8828f)
                close()
            }
        }
        .build()
        return _squareSplit1x2!!
    }

private var _squareSplit1x2: ImageVector? = null
