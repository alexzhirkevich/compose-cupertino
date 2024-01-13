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

public val CupertinoIcons.Outlined.Francsign: ImageVector
    get() {
        if (_francsign != null) {
            return _francsign!!
        }
        _francsign = Builder(name = "Francsign", defaultWidth = 15.1641.dp, defaultHeight =
                21.8555.dp, viewportWidth = 15.1641f, viewportHeight = 21.8555f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0898f, 21.8555f)
                curveTo(4.7461f, 21.8555f, 5.2148f, 21.3633f, 5.2148f, 20.707f)
                lineTo(5.2148f, 11.8242f)
                lineTo(13.2773f, 11.8242f)
                curveTo(13.875f, 11.8242f, 14.3203f, 11.4375f, 14.3203f, 10.8281f)
                curveTo(14.3203f, 10.2188f, 13.875f, 9.832f, 13.2773f, 9.832f)
                lineTo(5.2148f, 9.832f)
                lineTo(5.2148f, 2.5664f)
                lineTo(14.1211f, 2.5664f)
                curveTo(14.7305f, 2.5664f, 15.1641f, 2.1797f, 15.1641f, 1.5586f)
                curveTo(15.1641f, 0.9492f, 14.7305f, 0.5508f, 14.1211f, 0.5508f)
                lineTo(4.0898f, 0.5508f)
                curveTo(3.3984f, 0.5508f, 2.9648f, 1.0078f, 2.9648f, 1.7109f)
                lineTo(2.9648f, 20.707f)
                curveTo(2.9648f, 21.375f, 3.4219f, 21.8555f, 4.0898f, 21.8555f)
                close()
                moveTo(0.0f, 17.1094f)
                curveTo(0.0f, 17.5195f, 0.3398f, 17.8711f, 0.7617f, 17.8711f)
                lineTo(10.3125f, 17.8711f)
                curveTo(10.7344f, 17.8711f, 11.0859f, 17.5195f, 11.0859f, 17.1094f)
                curveTo(11.0859f, 16.6875f, 10.7344f, 16.3359f, 10.3125f, 16.3359f)
                lineTo(0.7617f, 16.3359f)
                curveTo(0.3398f, 16.3359f, 0.0f, 16.6875f, 0.0f, 17.1094f)
                close()
            }
        }
        .build()
        return _francsign!!
    }

private var _francsign: ImageVector? = null
