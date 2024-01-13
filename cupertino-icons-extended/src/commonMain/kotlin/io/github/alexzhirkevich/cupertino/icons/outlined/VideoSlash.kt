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

public val CupertinoIcons.Outlined.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 30.7471.dp, defaultHeight =
                25.0078.dp, viewportWidth = 30.7471f, viewportHeight = 25.0078f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3252f, 22.1309f)
                lineTo(18.7822f, 22.1309f)
                lineTo(17.0244f, 20.3613f)
                lineTo(6.6533f, 20.3613f)
                curveTo(4.7315f, 20.3613f, 3.6416f, 19.3652f, 3.6416f, 17.3379f)
                lineTo(3.6416f, 7.0723f)
                lineTo(1.7549f, 5.1738f)
                curveTo(1.7549f, 5.7012f, 1.7549f, 6.2051f, 1.7549f, 6.7324f)
                lineTo(1.7549f, 17.6074f)
                curveTo(1.7549f, 20.4668f, 3.4658f, 22.1309f, 6.3252f, 22.1309f)
                close()
                moveTo(18.5713f, 2.8652f)
                lineTo(6.0674f, 2.8652f)
                lineTo(7.8252f, 4.6231f)
                lineTo(18.2432f, 4.6231f)
                curveTo(20.1533f, 4.6231f, 21.2549f, 5.6191f, 21.2549f, 7.6582f)
                lineTo(21.2549f, 17.2441f)
                curveTo(21.2549f, 17.5254f, 21.2197f, 17.7246f, 21.1494f, 17.9473f)
                lineTo(22.79f, 19.5879f)
                curveTo(23.0127f, 19.0605f, 23.1416f, 18.4043f, 23.1416f, 17.7598f)
                lineTo(23.1416f, 7.3769f)
                curveTo(23.1416f, 4.5293f, 21.4307f, 2.8652f, 18.5713f, 2.8652f)
                close()
                moveTo(22.8604f, 9.2285f)
                lineTo(22.8604f, 11.4551f)
                lineTo(28.4502f, 6.8379f)
                curveTo(28.5557f, 6.7559f, 28.626f, 6.6973f, 28.7314f, 6.6973f)
                curveTo(28.8721f, 6.6973f, 28.9307f, 6.8144f, 28.9307f, 6.9785f)
                lineTo(28.9307f, 18.0176f)
                curveTo(28.9307f, 18.1816f, 28.8721f, 18.2871f, 28.7314f, 18.2871f)
                curveTo(28.626f, 18.2871f, 28.5557f, 18.2285f, 28.4502f, 18.1582f)
                lineTo(22.8604f, 13.541f)
                lineTo(22.8604f, 15.7676f)
                lineTo(27.5713f, 19.752f)
                curveTo(28.04f, 20.1387f, 28.5557f, 20.4082f, 29.0361f, 20.4082f)
                curveTo(30.0674f, 20.4082f, 30.7471f, 19.6465f, 30.7471f, 18.5566f)
                lineTo(30.7471f, 6.4394f)
                curveTo(30.7471f, 5.3496f, 30.0674f, 4.5879f, 29.0361f, 4.5879f)
                curveTo(28.5557f, 4.5879f, 28.04f, 4.8574f, 27.5713f, 5.2441f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.4111f, 24.7441f)
                curveTo(23.7627f, 25.0957f, 24.3486f, 25.0957f, 24.6885f, 24.7441f)
                curveTo(25.0283f, 24.3809f, 25.04f, 23.8184f, 24.6885f, 23.4668f)
                lineTo(1.5439f, 0.334f)
                curveTo(1.1924f, -0.0176f, 0.6064f, -0.0293f, 0.2549f, 0.334f)
                curveTo(-0.085f, 0.6738f, -0.085f, 1.2715f, 0.2549f, 1.6113f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
