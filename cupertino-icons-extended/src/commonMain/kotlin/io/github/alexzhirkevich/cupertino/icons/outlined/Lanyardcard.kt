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

public val CupertinoIcons.Outlined.Lanyardcard: ImageVector
    get() {
        if (_lanyardcard != null) {
            return _lanyardcard!!
        }
        _lanyardcard = Builder(name = "Lanyardcard", defaultWidth = 18.2109.dp, defaultHeight =
                25.1367.dp, viewportWidth = 18.2109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.457f)
                curveTo(0.0f, 23.9062f, 1.207f, 25.125f, 3.6328f, 25.125f)
                lineTo(14.5898f, 25.125f)
                curveTo(17.0039f, 25.125f, 18.2109f, 23.9062f, 18.2109f, 21.457f)
                lineTo(18.2109f, 3.6797f)
                curveTo(18.2109f, 1.2422f, 17.0039f, 0.0f, 14.5898f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.207f, 0.0f, 0.0f, 1.2422f, 0.0f, 3.6797f)
                close()
                moveTo(1.8867f, 21.4219f)
                lineTo(1.8867f, 3.7148f)
                curveTo(1.8867f, 2.543f, 2.5078f, 1.8867f, 3.7266f, 1.8867f)
                lineTo(14.4844f, 1.8867f)
                curveTo(15.7031f, 1.8867f, 16.3242f, 2.543f, 16.3242f, 3.7148f)
                lineTo(16.3242f, 21.4219f)
                curveTo(16.3242f, 22.5938f, 15.7031f, 23.2383f, 14.4844f, 23.2383f)
                lineTo(3.7266f, 23.2383f)
                curveTo(2.5078f, 23.2383f, 1.8867f, 22.5938f, 1.8867f, 21.4219f)
                close()
                moveTo(6.3164f, 4.7109f)
                lineTo(11.9062f, 4.7109f)
                curveTo(12.3281f, 4.7109f, 12.668f, 4.3711f, 12.668f, 3.9492f)
                curveTo(12.668f, 3.5273f, 12.3281f, 3.1875f, 11.9062f, 3.1875f)
                lineTo(6.3164f, 3.1875f)
                curveTo(5.9063f, 3.1875f, 5.5547f, 3.5273f, 5.5547f, 3.9492f)
                curveTo(5.5547f, 4.3711f, 5.9063f, 4.7109f, 6.3164f, 4.7109f)
                close()
            }
        }
        .build()
        return _lanyardcard!!
    }

private var _lanyardcard: ImageVector? = null
