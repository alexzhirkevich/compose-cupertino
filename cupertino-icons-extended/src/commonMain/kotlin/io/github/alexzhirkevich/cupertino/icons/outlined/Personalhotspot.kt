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

public val CupertinoIcons.Outlined.Personalhotspot: ImageVector
    get() {
        if (_personalhotspot != null) {
            return _personalhotspot!!
        }
        _personalhotspot = Builder(name = "Personalhotspot", defaultWidth = 33.668.dp, defaultHeight
                = 19.1836.dp, viewportWidth = 33.668f, viewportHeight = 19.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.8086f, 13.7344f)
                lineTo(7.7578f, 13.7344f)
                curveTo(7.6875f, 13.125f, 7.6289f, 12.457f, 7.7109f, 11.8477f)
                lineTo(6.9375f, 11.8477f)
                curveTo(4.0547f, 11.8477f, 2.0039f, 9.8203f, 2.0039f, 6.9141f)
                curveTo(2.0039f, 4.0313f, 4.0664f, 1.9922f, 6.9375f, 1.9922f)
                lineTo(17.332f, 1.9922f)
                curveTo(20.2031f, 1.9922f, 22.2656f, 4.0313f, 22.2656f, 6.9141f)
                curveTo(22.2656f, 9.8203f, 20.2031f, 11.8477f, 17.332f, 11.8477f)
                lineTo(13.2188f, 11.8477f)
                curveTo(13.0547f, 12.3047f, 13.1133f, 13.1953f, 13.4766f, 13.7344f)
                lineTo(17.4609f, 13.7344f)
                curveTo(21.4336f, 13.7344f, 24.2695f, 10.9453f, 24.2695f, 6.9141f)
                curveTo(24.2695f, 2.8945f, 21.4336f, 0.1055f, 17.4609f, 0.1055f)
                lineTo(6.8086f, 0.1055f)
                curveTo(2.8359f, 0.1055f, 0.0f, 2.8945f, 0.0f, 6.9141f)
                curveTo(0.0f, 10.9453f, 2.8359f, 13.7344f, 6.8086f, 13.7344f)
                close()
                moveTo(16.207f, 19.1836f)
                lineTo(26.8594f, 19.1836f)
                curveTo(30.832f, 19.1836f, 33.668f, 16.3945f, 33.668f, 12.3633f)
                curveTo(33.668f, 8.3438f, 30.832f, 5.5547f, 26.8594f, 5.5547f)
                lineTo(25.8984f, 5.5547f)
                curveTo(25.9688f, 6.1523f, 26.0273f, 6.832f, 25.957f, 7.4414f)
                lineTo(26.7188f, 7.4414f)
                curveTo(29.6016f, 7.4414f, 31.6641f, 9.4688f, 31.6641f, 12.3633f)
                curveTo(31.6641f, 15.2578f, 29.6016f, 17.2969f, 26.7188f, 17.2969f)
                lineTo(16.3359f, 17.2969f)
                curveTo(13.4648f, 17.2969f, 11.4023f, 15.2578f, 11.4023f, 12.3633f)
                curveTo(11.4023f, 9.4688f, 13.4531f, 7.4414f, 16.3359f, 7.4414f)
                lineTo(20.4492f, 7.4414f)
                curveTo(20.6133f, 6.9844f, 20.5547f, 6.0938f, 20.1797f, 5.5547f)
                lineTo(16.207f, 5.5547f)
                curveTo(12.2227f, 5.5547f, 9.3984f, 8.3438f, 9.3984f, 12.3633f)
                curveTo(9.3984f, 16.3945f, 12.2227f, 19.1836f, 16.207f, 19.1836f)
                close()
            }
        }
        .build()
        return _personalhotspot!!
    }

private var _personalhotspot: ImageVector? = null
