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

public val CupertinoIcons.Outlined.Scalemass: ImageVector
    get() {
        if (_scalemass != null) {
            return _scalemass!!
        }
        _scalemass = Builder(name = "Scalemass", defaultWidth = 23.1718.dp, defaultHeight =
                24.7852.dp, viewportWidth = 23.1718f, viewportHeight = 24.7852f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.1718f, 20.918f)
                curveTo(-0.4375f, 23.3555f, 0.5937f, 24.7617f, 2.9492f, 24.7617f)
                lineTo(20.2226f, 24.7617f)
                curveTo(22.5781f, 24.7617f, 23.6093f, 23.3555f, 23.0f, 20.918f)
                lineTo(20.4101f, 10.4531f)
                curveTo(19.9765f, 8.7305f, 18.7343f, 7.7344f, 16.9882f, 7.7344f)
                lineTo(6.1836f, 7.7344f)
                curveTo(4.4375f, 7.7344f, 3.1836f, 8.7305f, 2.7617f, 10.4531f)
                close()
                moveTo(2.0f, 21.0352f)
                lineTo(4.5195f, 11.1094f)
                curveTo(4.7773f, 10.1016f, 5.3515f, 9.6211f, 6.3242f, 9.6211f)
                lineTo(16.8476f, 9.6211f)
                curveTo(17.8203f, 9.6211f, 18.3945f, 10.1016f, 18.6523f, 11.1094f)
                lineTo(21.1718f, 21.0352f)
                curveTo(21.4882f, 22.2422f, 21.0195f, 22.875f, 19.9765f, 22.875f)
                lineTo(3.1836f, 22.875f)
                curveTo(2.1523f, 22.875f, 1.6836f, 22.2422f, 2.0f, 21.0352f)
                close()
                moveTo(10.6367f, 9.1055f)
                lineTo(12.5234f, 9.1055f)
                lineTo(12.5234f, 5.7656f)
                lineTo(10.6367f, 5.7656f)
                close()
                moveTo(11.5859f, 6.6797f)
                curveTo(13.4023f, 6.6797f, 14.9375f, 5.168f, 14.9375f, 3.3516f)
                curveTo(14.9375f, 1.5234f, 13.4023f, 0.0f, 11.5859f, 0.0f)
                curveTo(9.7578f, 0.0f, 8.2343f, 1.5234f, 8.2343f, 3.3516f)
                curveTo(8.2343f, 5.1797f, 9.7695f, 6.6797f, 11.5859f, 6.6797f)
                close()
                moveTo(11.5859f, 5.0508f)
                curveTo(10.6601f, 5.0508f, 9.875f, 4.2773f, 9.875f, 3.3516f)
                curveTo(9.875f, 2.4258f, 10.6484f, 1.6289f, 11.5859f, 1.6289f)
                curveTo(12.5117f, 1.6289f, 13.2968f, 2.4258f, 13.2968f, 3.3516f)
                curveTo(13.2968f, 4.2773f, 12.5234f, 5.0508f, 11.5859f, 5.0508f)
                close()
            }
        }
        .build()
        return _scalemass!!
    }

private var _scalemass: ImageVector? = null
