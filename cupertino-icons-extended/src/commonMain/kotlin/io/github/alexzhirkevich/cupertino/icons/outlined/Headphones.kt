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

public val CupertinoIcons.Outlined.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 23.8594.dp, defaultHeight =
                24.8555.dp, viewportWidth = 23.8594f, viewportHeight = 24.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.832f)
                curveTo(0.0f, 16.3594f, 1.0195f, 20.25f, 2.7422f, 23.2734f)
                curveTo(3.0352f, 23.7773f, 3.5859f, 23.918f, 4.1133f, 23.625f)
                curveTo(4.6055f, 23.3555f, 4.7461f, 22.8047f, 4.4414f, 22.2539f)
                curveTo(2.8711f, 19.3945f, 1.9922f, 15.9844f, 1.9922f, 12.832f)
                curveTo(1.9922f, 6.3281f, 5.9648f, 1.9922f, 11.9297f, 1.9922f)
                curveTo(17.8828f, 1.9922f, 21.8672f, 6.3281f, 21.8672f, 12.832f)
                curveTo(21.8672f, 15.9844f, 20.9766f, 19.3945f, 19.4062f, 22.2539f)
                curveTo(19.1016f, 22.8047f, 19.2422f, 23.3555f, 19.7344f, 23.625f)
                curveTo(20.2617f, 23.918f, 20.8242f, 23.7773f, 21.1055f, 23.2734f)
                curveTo(22.8281f, 20.25f, 23.8594f, 16.3594f, 23.8594f, 12.832f)
                curveTo(23.8594f, 5.1211f, 19.1016f, 0.0f, 11.9297f, 0.0f)
                curveTo(4.7461f, 0.0f, 0.0f, 5.1211f, 0.0f, 12.832f)
                close()
                moveTo(3.668f, 22.9805f)
                curveTo(4.0547f, 24.3281f, 5.2031f, 24.9492f, 6.5625f, 24.5625f)
                curveTo(7.9102f, 24.1758f, 8.543f, 23.0039f, 8.1445f, 21.6562f)
                lineTo(6.4688f, 15.9375f)
                curveTo(6.082f, 14.6016f, 4.9336f, 13.9688f, 3.5742f, 14.3555f)
                curveTo(2.2266f, 14.7539f, 1.5938f, 15.9141f, 1.9922f, 17.2734f)
                close()
                moveTo(20.1797f, 22.9805f)
                lineTo(21.8555f, 17.2734f)
                curveTo(22.2539f, 15.9023f, 21.6328f, 14.7539f, 20.2734f, 14.3555f)
                curveTo(18.9141f, 13.9688f, 17.7773f, 14.6016f, 17.3789f, 15.9375f)
                lineTo(15.7031f, 21.6562f)
                curveTo(15.3047f, 23.0156f, 15.9375f, 24.1758f, 17.2852f, 24.5625f)
                curveTo(18.6562f, 24.9492f, 19.793f, 24.3281f, 20.1797f, 22.9805f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
