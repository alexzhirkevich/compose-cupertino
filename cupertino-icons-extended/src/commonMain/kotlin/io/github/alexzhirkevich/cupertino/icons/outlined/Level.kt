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

public val CupertinoIcons.Outlined.Level: ImageVector
    get() {
        if (_level != null) {
            return _level!!
        }
        _level = Builder(name = "Level", defaultWidth = 28.6641.dp, defaultHeight = 12.7148.dp,
                viewportWidth = 28.6641f, viewportHeight = 12.7148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.7695f, 11.3672f)
                lineTo(5.8945f, 11.3672f)
                lineTo(5.8945f, 1.3594f)
                lineTo(4.7695f, 1.3594f)
                close()
                moveTo(22.7695f, 11.3672f)
                lineTo(23.8945f, 11.3672f)
                lineTo(23.8945f, 1.3594f)
                lineTo(22.7695f, 1.3594f)
                close()
                moveTo(14.332f, 6.9023f)
                curveTo(17.8594f, 6.9023f, 20.4727f, 4.6992f, 20.7305f, 1.3594f)
                lineTo(19.4766f, 1.3594f)
                curveTo(19.2773f, 4.0547f, 17.168f, 5.8359f, 14.332f, 5.8359f)
                curveTo(11.4844f, 5.8359f, 9.375f, 4.0547f, 9.1758f, 1.3594f)
                lineTo(7.9219f, 1.3594f)
                curveTo(8.1914f, 4.6992f, 10.8047f, 6.9023f, 14.332f, 6.9023f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1758f, 12.7148f)
                lineTo(25.4883f, 12.7148f)
                curveTo(27.5859f, 12.7148f, 28.6641f, 11.6367f, 28.6641f, 9.5625f)
                lineTo(28.6641f, 3.1641f)
                curveTo(28.6641f, 1.0898f, 27.5742f, 0.0117f, 25.4766f, 0.0117f)
                lineTo(3.1641f, 0.0117f)
                curveTo(1.0664f, 0.0117f, 0.0f, 1.0898f, 0.0f, 3.1641f)
                lineTo(0.0f, 9.5625f)
                curveTo(0.0f, 11.6367f, 1.0781f, 12.7148f, 3.1758f, 12.7148f)
                close()
                moveTo(3.457f, 10.8281f)
                curveTo(2.4609f, 10.8281f, 1.8867f, 10.2773f, 1.8867f, 9.2227f)
                lineTo(1.8867f, 3.5039f)
                curveTo(1.8867f, 2.4492f, 2.4609f, 1.8984f, 3.4688f, 1.8984f)
                lineTo(25.1953f, 1.8984f)
                curveTo(26.2031f, 1.8984f, 26.7656f, 2.4492f, 26.7656f, 3.5039f)
                lineTo(26.7656f, 9.2227f)
                curveTo(26.7656f, 10.2773f, 26.2031f, 10.8281f, 25.1836f, 10.8281f)
                close()
                moveTo(14.332f, 4.1016f)
                curveTo(15.9258f, 4.1016f, 17.0977f, 3.1055f, 17.2266f, 1.5938f)
                lineTo(11.4375f, 1.5938f)
                curveTo(11.5547f, 3.1055f, 12.7266f, 4.1016f, 14.332f, 4.1016f)
                close()
            }
        }
        .build()
        return _level!!
    }

private var _level: ImageVector? = null
