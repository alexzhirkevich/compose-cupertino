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

public val CupertinoIcons.Filled.DocPlaintext: ImageVector
    get() {
        if (_docPlaintext != null) {
            return _docPlaintext!!
        }
        _docPlaintext = Builder(name = "DocPlaintext", defaultWidth = 19.7109.dp, defaultHeight =
                25.1367.dp, viewportWidth = 19.7109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2734f, 6.6211f)
                curveTo(4.8398f, 6.6211f, 4.5234f, 6.2813f, 4.5234f, 5.8594f)
                curveTo(4.5234f, 5.4492f, 4.8398f, 5.1328f, 5.2734f, 5.1328f)
                lineTo(14.4492f, 5.1328f)
                curveTo(14.8711f, 5.1328f, 15.1875f, 5.4492f, 15.1875f, 5.8594f)
                curveTo(15.1875f, 6.2813f, 14.8711f, 6.6211f, 14.4492f, 6.6211f)
                close()
                moveTo(5.2734f, 10.8398f)
                curveTo(4.8398f, 10.8398f, 4.5234f, 10.5f, 4.5234f, 10.0781f)
                curveTo(4.5234f, 9.668f, 4.8398f, 9.3516f, 5.2734f, 9.3516f)
                lineTo(14.4492f, 9.3516f)
                curveTo(14.8711f, 9.3516f, 15.1875f, 9.668f, 15.1875f, 10.0781f)
                curveTo(15.1875f, 10.5f, 14.8711f, 10.8398f, 14.4492f, 10.8398f)
                close()
                moveTo(5.2734f, 15.0586f)
                curveTo(4.8398f, 15.0586f, 4.5234f, 14.7305f, 4.5234f, 14.3203f)
                curveTo(4.5234f, 13.8984f, 4.8398f, 13.5703f, 5.2734f, 13.5703f)
                lineTo(9.6094f, 13.5703f)
                curveTo(10.0547f, 13.5703f, 10.3594f, 13.8984f, 10.3594f, 14.3203f)
                curveTo(10.3594f, 14.7305f, 10.0547f, 15.0586f, 9.6094f, 15.0586f)
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
            }
        }
        .build()
        return _docPlaintext!!
    }

private var _docPlaintext: ImageVector? = null
