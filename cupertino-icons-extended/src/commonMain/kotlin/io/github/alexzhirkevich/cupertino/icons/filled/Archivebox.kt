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

public val CupertinoIcons.Filled.Archivebox: ImageVector
    get() {
        if (_archivebox != null) {
            return _archivebox!!
        }
        _archivebox = Builder(name = "Archivebox", defaultWidth = 23.4258.dp, defaultHeight =
                21.5977.dp, viewportWidth = 23.4258f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2852f, 21.5977f)
                lineTo(18.1406f, 21.5977f)
                curveTo(20.4492f, 21.5977f, 21.6797f, 20.4023f, 21.6797f, 18.1055f)
                lineTo(21.6797f, 6.8906f)
                lineTo(1.7461f, 6.8906f)
                lineTo(1.7461f, 18.1055f)
                curveTo(1.7461f, 20.4141f, 2.9766f, 21.5977f, 5.2852f, 21.5977f)
                close()
                moveTo(7.8516f, 11.1211f)
                curveTo(7.3594f, 11.1211f, 7.0195f, 10.7812f, 7.0195f, 10.2656f)
                lineTo(7.0195f, 9.9023f)
                curveTo(7.0195f, 9.3867f, 7.3594f, 9.0586f, 7.8516f, 9.0586f)
                lineTo(15.5859f, 9.0586f)
                curveTo(16.0781f, 9.0586f, 16.4297f, 9.3867f, 16.4297f, 9.9023f)
                lineTo(16.4297f, 10.2656f)
                curveTo(16.4297f, 10.7812f, 16.0781f, 11.1211f, 15.5859f, 11.1211f)
                close()
                moveTo(1.9922f, 5.2852f)
                lineTo(21.4336f, 5.2852f)
                curveTo(22.7578f, 5.2852f, 23.4258f, 4.5f, 23.4258f, 3.1875f)
                lineTo(23.4258f, 2.1211f)
                curveTo(23.4258f, 0.8086f, 22.7578f, 0.0234f, 21.4336f, 0.0234f)
                lineTo(1.9922f, 0.0234f)
                curveTo(0.7383f, 0.0234f, 0.0f, 0.8086f, 0.0f, 2.1211f)
                lineTo(0.0f, 3.1875f)
                curveTo(0.0f, 4.5f, 0.668f, 5.2852f, 1.9922f, 5.2852f)
                close()
            }
        }
        .build()
        return _archivebox!!
    }

private var _archivebox: ImageVector? = null
