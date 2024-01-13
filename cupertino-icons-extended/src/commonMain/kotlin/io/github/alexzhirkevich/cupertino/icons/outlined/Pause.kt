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

public val CupertinoIcons.Outlined.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 9.75.dp, defaultHeight = 19.3711.dp,
                viewportWidth = 9.75f, viewportHeight = 19.3711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.9961f, 19.3711f)
                curveTo(1.5586f, 19.3711f, 2.0039f, 18.9492f, 2.0039f, 18.3984f)
                lineTo(2.0039f, 0.9961f)
                curveTo(2.0039f, 0.4453f, 1.5586f, 0.0117f, 0.9961f, 0.0117f)
                curveTo(0.4453f, 0.0117f, 0.0f, 0.4453f, 0.0f, 0.9961f)
                lineTo(0.0f, 18.3984f)
                curveTo(0.0f, 18.9492f, 0.4453f, 19.3711f, 0.9961f, 19.3711f)
                close()
                moveTo(8.7422f, 19.3711f)
                curveTo(9.293f, 19.3711f, 9.75f, 18.9492f, 9.75f, 18.3984f)
                lineTo(9.75f, 0.9961f)
                curveTo(9.75f, 0.4453f, 9.293f, 0.0117f, 8.7422f, 0.0117f)
                curveTo(8.1914f, 0.0117f, 7.7461f, 0.4453f, 7.7461f, 0.9961f)
                lineTo(7.7461f, 18.3984f)
                curveTo(7.7461f, 18.9492f, 8.1914f, 19.3711f, 8.7422f, 19.3711f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
