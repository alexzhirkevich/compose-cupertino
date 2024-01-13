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

public val CupertinoIcons.Filled.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 30.6416.dp, defaultHeight =
                25.0312.dp, viewportWidth = 30.6416f, viewportHeight = 25.0312f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6338f, 22.0254f)
                lineTo(18.7002f, 22.0254f)
                lineTo(2.0947f, 5.4199f)
                curveTo(1.9658f, 5.7129f, 1.8838f, 6.2519f, 1.8838f, 6.7441f)
                lineTo(1.8838f, 18.2871f)
                curveTo(1.8838f, 20.6426f, 3.2783f, 22.0254f, 5.6338f, 22.0254f)
                close()
                moveTo(18.3369f, 2.9941f)
                lineTo(6.1377f, 2.9941f)
                lineTo(21.8525f, 18.709f)
                curveTo(21.9346f, 18.3105f, 21.9814f, 17.7715f, 21.9814f, 17.2676f)
                lineTo(21.9814f, 6.6973f)
                curveTo(21.9814f, 4.3535f, 20.6924f, 2.9941f, 18.3369f, 2.9941f)
                close()
                moveTo(23.5752f, 15.9668f)
                lineTo(27.8408f, 19.6582f)
                curveTo(28.2393f, 20.0098f, 28.708f, 20.2324f, 29.1299f, 20.2324f)
                curveTo(30.0439f, 20.2324f, 30.6416f, 19.5645f, 30.6416f, 18.6035f)
                lineTo(30.6416f, 6.416f)
                curveTo(30.6416f, 5.4551f, 30.0439f, 4.7871f, 29.1299f, 4.7871f)
                curveTo(28.708f, 4.7871f, 28.2393f, 5.0098f, 27.8408f, 5.3613f)
                lineTo(23.5752f, 9.041f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.4111f, 24.7676f)
                curveTo(23.7627f, 25.1191f, 24.3486f, 25.1191f, 24.6885f, 24.7676f)
                curveTo(25.0283f, 24.4043f, 25.04f, 23.8418f, 24.6885f, 23.4902f)
                lineTo(1.5439f, 0.3574f)
                curveTo(1.1924f, 0.0059f, 0.6064f, -0.0059f, 0.2549f, 0.3574f)
                curveTo(-0.085f, 0.6973f, -0.085f, 1.2949f, 0.2549f, 1.6348f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
