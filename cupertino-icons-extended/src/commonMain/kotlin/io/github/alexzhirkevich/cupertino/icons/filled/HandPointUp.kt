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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Filled.HandPointUp: ImageVector
    get() {
        if (_handPointUp != null) {
            return _handPointUp!!
        }
        _handPointUp = Builder(name = "HandPointUp", defaultWidth = 18.4688.dp, defaultHeight =
                23.9414.dp, viewportWidth = 18.4688f, viewportHeight = 23.9414f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5234f, 23.9414f)
                curveTo(15.6094f, 23.9414f, 18.4688f, 20.7539f, 18.4688f, 15.3164f)
                lineTo(18.4688f, 13.0664f)
                curveTo(18.4688f, 11.0039f, 17.4727f, 9.75f, 16.3594f, 9.75f)
                curveTo(16.1016f, 9.75f, 15.9727f, 9.8789f, 15.9727f, 10.125f)
                lineTo(15.9727f, 11.1211f)
                curveTo(15.9727f, 11.5898f, 15.7266f, 11.8242f, 15.4453f, 11.8242f)
                curveTo(15.1406f, 11.8242f, 14.9062f, 11.5898f, 14.9062f, 11.1211f)
                lineTo(14.9062f, 10.4648f)
                curveTo(14.9062f, 9.2578f, 14.1211f, 8.4609f, 13.0781f, 8.4609f)
                curveTo(12.5977f, 8.4609f, 12.3867f, 8.6602f, 12.3867f, 9.0586f)
                lineTo(12.3867f, 10.418f)
                curveTo(12.3867f, 10.8867f, 12.1523f, 11.1211f, 11.8711f, 11.1211f)
                curveTo(11.5664f, 11.1211f, 11.3203f, 10.8867f, 11.3203f, 10.418f)
                lineTo(11.3203f, 9.1641f)
                curveTo(11.3203f, 7.8047f, 10.5234f, 7.1602f, 9.5156f, 7.1602f)
                curveTo(9.0586f, 7.1602f, 8.8242f, 7.3711f, 8.8242f, 7.7578f)
                lineTo(8.8242f, 10.418f)
                curveTo(8.8242f, 10.8867f, 8.5781f, 11.1211f, 8.2969f, 11.1211f)
                curveTo(7.9922f, 11.1211f, 7.7578f, 10.8867f, 7.7578f, 10.418f)
                lineTo(7.7578f, 1.5234f)
                curveTo(7.7578f, 0.6563f, 7.1836f, 0.0938f, 6.457f, 0.0938f)
                curveTo(5.6719f, 0.0938f, 5.1211f, 0.6563f, 5.1211f, 1.5234f)
                lineTo(5.1211f, 14.543f)
                curveTo(5.1211f, 14.8711f, 4.9219f, 15.0352f, 4.7227f, 15.0352f)
                curveTo(4.5234f, 15.0352f, 4.3594f, 14.918f, 4.2188f, 14.5898f)
                lineTo(2.4961f, 10.5234f)
                curveTo(2.2383f, 9.9258f, 1.8398f, 9.668f, 1.3125f, 9.668f)
                curveTo(0.5156f, 9.668f, 0.0f, 10.2188f, 0.0f, 10.875f)
                curveTo(0.0f, 11.1445f, 0.0586f, 11.3672f, 0.1172f, 11.5547f)
                lineTo(2.0156f, 17.2148f)
                curveTo(3.6328f, 21.9844f, 6.7852f, 23.9414f, 10.5234f, 23.9414f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
