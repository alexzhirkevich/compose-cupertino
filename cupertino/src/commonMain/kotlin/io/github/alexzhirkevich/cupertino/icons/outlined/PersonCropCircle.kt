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

public val CupertinoIcons.Outlined.PersonCropCircle: ImageVector
    get() {
        if (_personCropCircle != null) {
            return _personCropCircle!!
        }
        _personCropCircle = Builder(name = "PersonCropCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(23.9062f)
                verticalLineToRelative(23.918f)
                horizontalLineToRelative(-23.9062f)
                close()
            }
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
                moveTo(19.9688f, 19.6758f)
                lineTo(19.9336f, 19.5469f)
                curveTo(19.3594f, 17.8242f, 16.2656f, 15.9375f, 11.9531f, 15.9375f)
                curveTo(7.6523f, 15.9375f, 4.5586f, 17.8242f, 3.9727f, 19.5352f)
                lineTo(3.9375f, 19.6758f)
                curveTo(6.0469f, 21.7617f, 9.668f, 22.9805f, 11.9531f, 22.9805f)
                curveTo(14.25f, 22.9805f, 17.8359f, 21.7734f, 19.9688f, 19.6758f)
                close()
                moveTo(11.9531f, 13.9453f)
                curveTo(14.2148f, 13.9688f, 15.9727f, 12.0469f, 15.9727f, 9.5273f)
                curveTo(15.9727f, 7.1602f, 14.2031f, 5.2031f, 11.9531f, 5.2031f)
                curveTo(9.7031f, 5.2031f, 7.9219f, 7.1602f, 7.9336f, 9.5273f)
                curveTo(7.9453f, 12.0469f, 9.7031f, 13.9219f, 11.9531f, 13.9453f)
                close()
            }
        }
        .build()
        return _personCropCircle!!
    }

private var _personCropCircle: ImageVector? = null
