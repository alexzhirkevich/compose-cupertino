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

public val CupertinoIcons.Outlined.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 23.1655.dp, defaultHeight = 23.1907.dp,
                viewportWidth = 23.1655f, viewportHeight = 23.1907f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.832f, 21.3277f)
                curveTo(4.3164f, 23.8004f, 7.7969f, 23.8238f, 10.5508f, 21.0699f)
                lineTo(21.0859f, 10.5348f)
                curveTo(23.8281f, 7.7926f, 23.8047f, 4.3121f, 21.332f, 1.8277f)
                curveTo(18.8477f, -0.6449f, 15.3672f, -0.6566f, 12.625f, 2.0856f)
                lineTo(2.0898f, 12.609f)
                curveTo(-0.6641f, 15.3629f, -0.6406f, 18.8434f, 1.832f, 21.3277f)
                close()
                moveTo(3.0742f, 20.0973f)
                curveTo(1.3047f, 18.3395f, 1.5273f, 15.8785f, 3.4375f, 13.9449f)
                lineTo(13.9492f, 3.4332f)
                curveTo(15.8477f, 1.5231f, 18.3203f, 1.3121f, 20.1016f, 3.0699f)
                curveTo(21.8711f, 4.816f, 21.6719f, 7.2887f, 19.7266f, 9.2223f)
                lineTo(9.2266f, 19.734f)
                curveTo(7.3281f, 21.6324f, 4.8438f, 21.8551f, 3.0742f, 20.0973f)
                close()
                moveTo(7.5156f, 8.7535f)
                lineTo(14.4414f, 15.6793f)
                lineTo(15.6953f, 14.4254f)
                lineTo(8.7578f, 7.4996f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
