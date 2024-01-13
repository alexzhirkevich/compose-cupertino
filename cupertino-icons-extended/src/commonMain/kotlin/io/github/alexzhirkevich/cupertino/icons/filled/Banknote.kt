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

public val CupertinoIcons.Filled.Banknote: ImageVector
    get() {
        if (_banknote != null) {
            return _banknote!!
        }
        _banknote = Builder(name = "Banknote", defaultWidth = 30.9375.dp, defaultHeight =
                19.3711.dp, viewportWidth = 30.9375f, viewportHeight = 19.3711f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3633f, 15.7266f)
                curveTo(3.3633f, 15.9141f, 3.4688f, 16.0078f, 3.6445f, 16.0078f)
                lineTo(12.8086f, 16.0078f)
                curveTo(11.5664f, 14.7422f, 10.8398f, 12.5039f, 10.8398f, 9.668f)
                curveTo(10.8398f, 6.8438f, 11.5664f, 4.6172f, 12.7852f, 3.3633f)
                lineTo(3.6445f, 3.3633f)
                curveTo(3.4688f, 3.3633f, 3.3633f, 3.457f, 3.3633f, 3.6445f)
                close()
                moveTo(12.2461f, 9.668f)
                curveTo(12.2461f, 13.3242f, 13.5117f, 15.7734f, 15.4219f, 15.7734f)
                curveTo(17.3906f, 15.7734f, 18.7148f, 13.3242f, 18.7148f, 9.668f)
                curveTo(18.7148f, 6.0117f, 17.3906f, 3.5742f, 15.4219f, 3.5742f)
                curveTo(13.5117f, 3.5742f, 12.2461f, 6.0117f, 12.2461f, 9.668f)
                close()
                moveTo(18.1055f, 16.0078f)
                lineTo(27.293f, 16.0078f)
                curveTo(27.4688f, 16.0078f, 27.5742f, 15.9141f, 27.5742f, 15.7266f)
                lineTo(27.5742f, 3.6445f)
                curveTo(27.5742f, 3.457f, 27.4688f, 3.3633f, 27.293f, 3.3633f)
                lineTo(18.1172f, 3.3633f)
                curveTo(19.3711f, 4.6172f, 20.1094f, 6.8438f, 20.1094f, 9.668f)
                curveTo(20.1094f, 12.5039f, 19.3594f, 14.7422f, 18.1055f, 16.0078f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.4336f)
                curveTo(0.0f, 18.9961f, 0.375f, 19.3711f, 0.9375f, 19.3711f)
                lineTo(30.0117f, 19.3711f)
                curveTo(30.5742f, 19.3711f, 30.9375f, 18.9961f, 30.9375f, 18.4336f)
                lineTo(30.9375f, 0.9258f)
                curveTo(30.9375f, 0.3633f, 30.5742f, 0.0f, 30.0117f, 0.0f)
                lineTo(0.9375f, 0.0f)
                curveTo(0.375f, 0.0f, 0.0f, 0.3633f, 0.0f, 0.9258f)
                close()
                moveTo(2.1445f, 16.5117f)
                lineTo(2.1445f, 2.8594f)
                curveTo(2.1445f, 2.3906f, 2.4141f, 2.1445f, 2.8477f, 2.1445f)
                lineTo(28.0898f, 2.1445f)
                curveTo(28.5352f, 2.1445f, 28.793f, 2.3906f, 28.793f, 2.8594f)
                lineTo(28.793f, 16.5117f)
                curveTo(28.793f, 16.9688f, 28.5352f, 17.2266f, 28.0898f, 17.2266f)
                lineTo(2.8477f, 17.2266f)
                curveTo(2.4141f, 17.2266f, 2.1445f, 16.9688f, 2.1445f, 16.5117f)
                close()
            }
        }
        .build()
        return _banknote!!
    }

private var _banknote: ImageVector? = null
