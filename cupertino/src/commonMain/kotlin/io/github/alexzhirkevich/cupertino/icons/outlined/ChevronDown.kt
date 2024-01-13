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

public val CupertinoIcons.Outlined.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = Builder(name = "ChevronDown", defaultWidth = 20.3555.dp, defaultHeight =
                12.4805.dp, viewportWidth = 20.3555f, viewportHeight = 12.4805f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1836f, 12.4805f)
                curveTo(10.4766f, 12.4805f, 10.7695f, 12.3633f, 10.9688f, 12.1406f)
                lineTo(20.0391f, 2.8477f)
                curveTo(20.2383f, 2.6484f, 20.3555f, 2.3906f, 20.3555f, 2.0977f)
                curveTo(20.3555f, 1.4883f, 19.8984f, 1.0195f, 19.2891f, 1.0195f)
                curveTo(18.9961f, 1.0195f, 18.7266f, 1.1367f, 18.5273f, 1.3242f)
                lineTo(9.5508f, 10.5f)
                lineTo(10.8047f, 10.5f)
                lineTo(1.8281f, 1.3242f)
                curveTo(1.6406f, 1.1367f, 1.3711f, 1.0195f, 1.0664f, 1.0195f)
                curveTo(0.457f, 1.0195f, 0.0f, 1.4883f, 0.0f, 2.0977f)
                curveTo(0.0f, 2.3906f, 0.1172f, 2.6484f, 0.3164f, 2.8594f)
                lineTo(9.3867f, 12.1406f)
                curveTo(9.6094f, 12.3633f, 9.8789f, 12.4805f, 10.1836f, 12.4805f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
