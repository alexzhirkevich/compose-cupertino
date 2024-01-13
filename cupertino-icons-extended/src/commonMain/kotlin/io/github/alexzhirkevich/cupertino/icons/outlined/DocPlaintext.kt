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

public val CupertinoIcons.Outlined.DocPlaintext: ImageVector
    get() {
        if (_docPlaintext != null) {
            return _docPlaintext!!
        }
        _docPlaintext = Builder(name = "DocPlaintext", defaultWidth = 19.7109.dp, defaultHeight =
                25.1367.dp, viewportWidth = 19.7109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4141f, 6.7852f)
                lineTo(14.3086f, 6.7852f)
                curveTo(14.7188f, 6.7852f, 15.0234f, 6.4688f, 15.0234f, 6.0586f)
                curveTo(15.0234f, 5.6602f, 14.7188f, 5.3438f, 14.3086f, 5.3438f)
                lineTo(5.4141f, 5.3438f)
                curveTo(4.9922f, 5.3438f, 4.6875f, 5.6602f, 4.6875f, 6.0586f)
                curveTo(4.6875f, 6.4688f, 4.9922f, 6.7852f, 5.4141f, 6.7852f)
                close()
                moveTo(5.4141f, 10.875f)
                lineTo(14.3086f, 10.875f)
                curveTo(14.7188f, 10.875f, 15.0234f, 10.5586f, 15.0234f, 10.1484f)
                curveTo(15.0234f, 9.75f, 14.7188f, 9.4336f, 14.3086f, 9.4336f)
                lineTo(5.4141f, 9.4336f)
                curveTo(4.9922f, 9.4336f, 4.6875f, 9.75f, 4.6875f, 10.1484f)
                curveTo(4.6875f, 10.5586f, 4.9922f, 10.875f, 5.4141f, 10.875f)
                close()
                moveTo(5.4141f, 14.9648f)
                lineTo(9.6211f, 14.9648f)
                curveTo(10.043f, 14.9648f, 10.3477f, 14.6602f, 10.3477f, 14.2617f)
                curveTo(10.3477f, 13.8398f, 10.043f, 13.5234f, 9.6211f, 13.5234f)
                lineTo(5.4141f, 13.5234f)
                curveTo(4.9922f, 13.5234f, 4.6875f, 13.8398f, 4.6875f, 14.2617f)
                curveTo(4.6875f, 14.6602f, 4.9922f, 14.9648f, 5.4141f, 14.9648f)
                close()
                moveTo(0.0f, 21.457f)
                curveTo(0.0f, 23.9062f, 1.207f, 25.125f, 3.6328f, 25.125f)
                lineTo(16.0781f, 25.125f)
                curveTo(18.5039f, 25.125f, 19.7109f, 23.9062f, 19.7109f, 21.457f)
                lineTo(19.7109f, 3.6797f)
                curveTo(19.7109f, 1.2422f, 18.5039f, 0.0f, 16.0781f, 0.0f)
                lineTo(3.6328f, 0.0f)
                curveTo(1.207f, 0.0f, 0.0f, 1.2422f, 0.0f, 3.6797f)
                close()
                moveTo(1.8867f, 21.4219f)
                lineTo(1.8867f, 3.7148f)
                curveTo(1.8867f, 2.543f, 2.5078f, 1.8867f, 3.7266f, 1.8867f)
                lineTo(15.9844f, 1.8867f)
                curveTo(17.2031f, 1.8867f, 17.8242f, 2.543f, 17.8242f, 3.7148f)
                lineTo(17.8242f, 21.4219f)
                curveTo(17.8242f, 22.5938f, 17.2031f, 23.2383f, 15.9844f, 23.2383f)
                lineTo(3.7266f, 23.2383f)
                curveTo(2.5078f, 23.2383f, 1.8867f, 22.5938f, 1.8867f, 21.4219f)
                close()
            }
        }
        .build()
        return _docPlaintext!!
    }

private var _docPlaintext: ImageVector? = null
