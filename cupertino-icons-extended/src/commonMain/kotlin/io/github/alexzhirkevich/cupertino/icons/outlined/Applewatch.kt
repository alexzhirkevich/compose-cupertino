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

public val CupertinoIcons.Outlined.Applewatch: ImageVector
    get() {
        if (_applewatch != null) {
            return _applewatch!!
        }
        _applewatch = Builder(name = "Applewatch", defaultWidth = 16.9922.dp, defaultHeight =
                25.0898.dp, viewportWidth = 16.9922f, viewportHeight = 25.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.2852f)
                curveTo(0.0f, 19.1016f, 0.7148f, 20.4375f, 2.0391f, 21.1641f)
                curveTo(2.6836f, 21.5039f, 3.0586f, 21.9375f, 3.293f, 22.7227f)
                lineTo(3.668f, 23.9766f)
                curveTo(3.8906f, 24.7266f, 4.418f, 25.0898f, 5.2031f, 25.0898f)
                lineTo(10.6172f, 25.0898f)
                curveTo(11.4258f, 25.0898f, 11.918f, 24.7383f, 12.1406f, 23.9766f)
                lineTo(12.5273f, 22.7227f)
                curveTo(12.7617f, 21.9375f, 13.1367f, 21.5039f, 13.7812f, 21.1641f)
                curveTo(15.1055f, 20.4375f, 15.8203f, 19.1016f, 15.8203f, 17.2852f)
                lineTo(15.8203f, 7.8047f)
                curveTo(15.8203f, 5.9883f, 15.1055f, 4.6641f, 13.7812f, 3.9258f)
                curveTo(13.1367f, 3.5859f, 12.7617f, 3.1523f, 12.5273f, 2.3789f)
                lineTo(12.1406f, 1.1133f)
                curveTo(11.9414f, 0.375f, 11.4141f, 0.0f, 10.6172f, 0.0f)
                lineTo(5.2031f, 0.0f)
                curveTo(4.418f, 0.0f, 3.8906f, 0.3633f, 3.668f, 1.1133f)
                lineTo(3.293f, 2.3789f)
                curveTo(3.0703f, 3.1406f, 2.6953f, 3.5977f, 2.0391f, 3.9258f)
                curveTo(0.7266f, 4.6289f, 0.0f, 5.9648f, 0.0f, 7.8047f)
                close()
                moveTo(1.7109f, 17.0391f)
                lineTo(1.7109f, 8.0625f)
                curveTo(1.7109f, 6.3164f, 2.7305f, 5.2617f, 4.4414f, 5.2617f)
                lineTo(11.3789f, 5.2617f)
                curveTo(13.0898f, 5.2617f, 14.1094f, 6.3164f, 14.1094f, 8.0625f)
                lineTo(14.1094f, 17.0391f)
                curveTo(14.1094f, 18.7734f, 13.0898f, 19.8281f, 11.3789f, 19.8281f)
                lineTo(4.4414f, 19.8281f)
                curveTo(2.7305f, 19.8281f, 1.7109f, 18.7734f, 1.7109f, 17.0391f)
                close()
                moveTo(15.5625f, 11.7188f)
                lineTo(15.9844f, 11.7188f)
                curveTo(16.5938f, 11.7188f, 16.9922f, 11.3086f, 16.9922f, 10.6406f)
                lineTo(16.9922f, 9.0586f)
                curveTo(16.9922f, 8.3906f, 16.5938f, 7.9805f, 15.9844f, 7.9805f)
                lineTo(15.5625f, 7.9805f)
                close()
            }
        }
        .build()
        return _applewatch!!
    }

private var _applewatch: ImageVector? = null
