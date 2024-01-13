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

package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.FlagSlash: ImageVector
    get() {
        if (_flagSlash != null) {
            return _flagSlash!!
        }
        _flagSlash = Builder(name = "FlagSlash", defaultWidth = 22.1675.dp, defaultHeight =
                27.5156.dp, viewportWidth = 22.1675f, viewportHeight = 27.5156f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5947f, 24.3809f)
                curveTo(0.5947f, 24.8613f, 1.0049f, 25.2598f, 1.4854f, 25.2598f)
                curveTo(1.9775f, 25.2598f, 2.376f, 24.873f, 2.376f, 24.3809f)
                lineTo(2.376f, 17.8652f)
                curveTo(2.669f, 17.7363f, 3.7705f, 17.3145f, 5.4932f, 17.3145f)
                curveTo(9.6533f, 17.3145f, 12.2432f, 19.248f, 16.1689f, 19.4238f)
                lineTo(0.8291f, 4.1074f)
                curveTo(0.6885f, 4.3301f, 0.5947f, 4.5879f, 0.5947f, 4.9043f)
                close()
                moveTo(5.5283f, 2.2676f)
                lineTo(21.1143f, 17.8418f)
                curveTo(21.3135f, 17.5605f, 21.4072f, 17.209f, 21.4072f, 16.7871f)
                lineTo(21.4072f, 4.8926f)
                curveTo(21.4072f, 4.2598f, 20.8682f, 3.8965f, 20.1885f, 3.8965f)
                curveTo(19.6143f, 3.8965f, 18.5361f, 4.3887f, 16.5205f, 4.3887f)
                curveTo(12.4775f, 4.3887f, 9.7822f, 2.3379f, 5.5283f, 2.2676f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6221f, 21.8965f)
                curveTo(20.9854f, 22.248f, 21.5596f, 22.248f, 21.8994f, 21.8965f)
                curveTo(22.251f, 21.5332f, 22.2627f, 20.9707f, 21.8994f, 20.6191f)
                lineTo(1.5439f, 0.2637f)
                curveTo(1.1924f, -0.0879f, 0.6064f, -0.0879f, 0.2549f, 0.2637f)
                curveTo(-0.085f, 0.6035f, -0.085f, 1.2012f, 0.2549f, 1.541f)
                close()
            }
        }
        .build()
        return _flagSlash!!
    }

private var _flagSlash: ImageVector? = null
