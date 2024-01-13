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

public val CupertinoIcons.Outlined.DoorLeftHandOpen: ImageVector
    get() {
        if (_doorLeftHandOpen != null) {
            return _doorLeftHandOpen!!
        }
        _doorLeftHandOpen = Builder(name = "DoorLeftHandOpen", defaultWidth = 17.8594.dp,
                defaultHeight = 24.8789.dp, viewportWidth = 17.8594f, viewportHeight =
                24.8789f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 23.9297f)
                curveTo(0.0f, 24.4453f, 0.4219f, 24.8672f, 0.9375f, 24.8672f)
                curveTo(1.4648f, 24.8672f, 1.8867f, 24.4453f, 1.8867f, 23.9297f)
                lineTo(1.8867f, 2.5078f)
                curveTo(1.8867f, 2.1328f, 2.1328f, 1.8867f, 2.4844f, 1.8867f)
                lineTo(15.375f, 1.8867f)
                curveTo(15.7266f, 1.8867f, 15.9727f, 2.1328f, 15.9727f, 2.5078f)
                lineTo(15.9727f, 23.9297f)
                curveTo(15.9727f, 24.4453f, 16.3945f, 24.8672f, 16.9219f, 24.8672f)
                curveTo(17.4375f, 24.8672f, 17.8594f, 24.4453f, 17.8594f, 23.9297f)
                lineTo(17.8594f, 2.3906f)
                curveTo(17.8594f, 0.9609f, 16.8867f, 0.0f, 15.4102f, 0.0f)
                lineTo(2.4492f, 0.0f)
                curveTo(0.9844f, 0.0f, 0.0f, 0.9609f, 0.0f, 2.3906f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2578f, 24.1992f)
                curveTo(3.2578f, 24.4219f, 3.4453f, 24.5391f, 3.668f, 24.4453f)
                lineTo(7.3477f, 22.8164f)
                curveTo(7.6406f, 22.6875f, 7.7578f, 22.5938f, 7.7578f, 22.2891f)
                lineTo(7.7578f, 5.4023f)
                curveTo(7.7578f, 5.1094f, 7.6406f, 5.0039f, 7.3594f, 4.8867f)
                lineTo(3.668f, 3.2461f)
                curveTo(3.4453f, 3.1523f, 3.2578f, 3.2695f, 3.2578f, 3.5039f)
                close()
            }
        }
        .build()
        return _doorLeftHandOpen!!
    }

private var _doorLeftHandOpen: ImageVector? = null
