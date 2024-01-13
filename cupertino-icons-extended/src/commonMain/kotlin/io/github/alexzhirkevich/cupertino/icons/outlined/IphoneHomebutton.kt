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

public val CupertinoIcons.Outlined.IphoneHomebutton: ImageVector
    get() {
        if (_iphoneHomebutton != null) {
            return _iphoneHomebutton!!
        }
        _iphoneHomebutton = Builder(name = "IphoneHomebutton", defaultWidth = 15.0586.dp,
                defaultHeight = 24.832.dp, viewportWidth = 15.0586f, viewportHeight =
                24.832f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.7734f)
                curveTo(0.0f, 23.6016f, 1.2773f, 24.8203f, 3.1875f, 24.8203f)
                lineTo(11.8711f, 24.8203f)
                curveTo(13.7812f, 24.8203f, 15.0586f, 23.6016f, 15.0586f, 21.7734f)
                lineTo(15.0586f, 3.0469f)
                curveTo(15.0586f, 1.2188f, 13.7812f, 0.0f, 11.8711f, 0.0f)
                lineTo(3.1875f, 0.0f)
                curveTo(1.2773f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.0469f)
                close()
                moveTo(1.8867f, 20.8477f)
                lineTo(1.8867f, 3.9727f)
                lineTo(13.1719f, 3.9727f)
                lineTo(13.1719f, 20.8477f)
                close()
                moveTo(7.5469f, 23.6602f)
                curveTo(6.9844f, 23.6602f, 6.5273f, 23.2031f, 6.5273f, 22.6406f)
                curveTo(6.5273f, 22.0898f, 6.9844f, 21.6328f, 7.5469f, 21.6328f)
                curveTo(8.0977f, 21.6328f, 8.5547f, 22.0898f, 8.5547f, 22.6406f)
                curveTo(8.5547f, 23.2031f, 8.0977f, 23.6602f, 7.5469f, 23.6602f)
                close()
                moveTo(5.3086f, 2.0508f)
                curveTo(5.3086f, 1.7813f, 5.4961f, 1.6055f, 5.7539f, 1.6055f)
                lineTo(9.3164f, 1.6055f)
                curveTo(9.5742f, 1.6055f, 9.7617f, 1.7813f, 9.7617f, 2.0508f)
                curveTo(9.7617f, 2.3203f, 9.5742f, 2.4844f, 9.3164f, 2.4844f)
                lineTo(5.7539f, 2.4844f)
                curveTo(5.4961f, 2.4844f, 5.3086f, 2.3203f, 5.3086f, 2.0508f)
                close()
            }
        }
        .build()
        return _iphoneHomebutton!!
    }

private var _iphoneHomebutton: ImageVector? = null
