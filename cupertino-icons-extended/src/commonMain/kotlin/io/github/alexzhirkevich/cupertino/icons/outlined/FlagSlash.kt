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

public val CupertinoIcons.Outlined.FlagSlash: ImageVector
    get() {
        if (_flagSlash != null) {
            return _flagSlash!!
        }
        _flagSlash = Builder(name = "FlagSlash", defaultWidth = 22.1675.dp, defaultHeight =
                27.5156.dp, viewportWidth = 22.1675f, viewportHeight = 27.5156f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4854f, 25.2598f)
                curveTo(1.9775f, 25.2598f, 2.376f, 24.873f, 2.376f, 24.3809f)
                lineTo(2.376f, 17.8652f)
                curveTo(2.669f, 17.7363f, 3.7705f, 17.3145f, 5.4932f, 17.3145f)
                curveTo(9.6533f, 17.3145f, 12.2432f, 19.248f, 16.1689f, 19.4238f)
                lineTo(14.0596f, 17.3027f)
                curveTo(11.2939f, 16.7871f, 8.9033f, 15.5449f, 5.4932f, 15.5449f)
                curveTo(4.2041f, 15.5449f, 3.0322f, 15.6973f, 2.376f, 15.9668f)
                lineTo(2.376f, 5.7598f)
                lineTo(0.7471f, 4.1309f)
                curveTo(0.6533f, 4.3066f, 0.5947f, 4.5293f, 0.5947f, 4.8574f)
                lineTo(0.5947f, 24.3809f)
                curveTo(0.5947f, 24.8613f, 1.0049f, 25.2598f, 1.4854f, 25.2598f)
                close()
                moveTo(21.1729f, 17.7832f)
                curveTo(21.3369f, 17.5371f, 21.4072f, 17.2207f, 21.4072f, 16.7871f)
                lineTo(21.4072f, 4.8926f)
                curveTo(21.4072f, 4.2598f, 20.8682f, 3.8965f, 20.1885f, 3.8965f)
                curveTo(19.6143f, 3.8965f, 18.5361f, 4.3887f, 16.5205f, 4.3887f)
                curveTo(12.4775f, 4.3887f, 9.7822f, 2.3379f, 5.5283f, 2.2676f)
                lineTo(7.5205f, 4.2598f)
                curveTo(10.5791f, 4.7519f, 13.0283f, 6.1582f, 16.5205f, 6.1582f)
                curveTo(17.7979f, 6.1582f, 18.8525f, 6.0059f, 19.6377f, 5.7832f)
                lineTo(19.6377f, 16.2363f)
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
