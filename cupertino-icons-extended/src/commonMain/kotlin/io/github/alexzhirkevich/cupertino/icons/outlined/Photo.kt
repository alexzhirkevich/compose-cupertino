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

public val CupertinoIcons.Outlined.Photo: ImageVector
    get() {
        if (_photo != null) {
            return _photo!!
        }
        _photo = Builder(name = "Photo", defaultWidth = 27.6328.dp, defaultHeight = 21.5742.dp,
                viewportWidth = 27.6328f, viewportHeight = 21.5742f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.4258f, 17.3203f)
                lineTo(19.4648f, 10.7812f)
                curveTo(18.9375f, 10.3125f, 18.3281f, 10.0547f, 17.6953f, 10.0547f)
                curveTo(17.0508f, 10.0547f, 16.4766f, 10.2773f, 15.9375f, 10.7578f)
                lineTo(10.6406f, 15.4922f)
                lineTo(8.4727f, 13.5352f)
                curveTo(7.9805f, 13.0898f, 7.4414f, 12.8672f, 6.8906f, 12.8672f)
                curveTo(6.3633f, 12.8672f, 5.8711f, 13.0781f, 5.3789f, 13.5234f)
                lineTo(0.9141f, 17.5547f)
                curveTo(0.9844f, 19.6758f, 1.8516f, 20.7539f, 3.5977f, 20.7539f)
                lineTo(23.2383f, 20.7539f)
                curveTo(25.3594f, 20.7539f, 26.4258f, 19.5703f, 26.4258f, 17.3203f)
                close()
                moveTo(8.7305f, 10.8984f)
                curveTo(10.2422f, 10.8984f, 11.4844f, 9.6563f, 11.4844f, 8.1328f)
                curveTo(11.4844f, 6.6211f, 10.2422f, 5.3672f, 8.7305f, 5.3672f)
                curveTo(7.207f, 5.3672f, 5.9648f, 6.6211f, 5.9648f, 8.1328f)
                curveTo(5.9648f, 9.6563f, 7.207f, 10.8984f, 8.7305f, 10.8984f)
                close()
                moveTo(3.6797f, 21.5742f)
                lineTo(23.9531f, 21.5742f)
                curveTo(26.4141f, 21.5742f, 27.6328f, 20.3672f, 27.6328f, 17.9531f)
                lineTo(27.6328f, 3.6328f)
                curveTo(27.6328f, 1.2188f, 26.4141f, 0.0f, 23.9531f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2305f, 0.0f, 0.0f, 1.2188f, 0.0f, 3.6328f)
                lineTo(0.0f, 17.9531f)
                curveTo(0.0f, 20.3672f, 1.2305f, 21.5742f, 3.6797f, 21.5742f)
                close()
                moveTo(3.7031f, 19.6875f)
                curveTo(2.5313f, 19.6875f, 1.8867f, 19.0664f, 1.8867f, 17.8477f)
                lineTo(1.8867f, 3.7383f)
                curveTo(1.8867f, 2.5195f, 2.5313f, 1.8867f, 3.7031f, 1.8867f)
                lineTo(23.9297f, 1.8867f)
                curveTo(25.0898f, 1.8867f, 25.7461f, 2.5195f, 25.7461f, 3.7383f)
                lineTo(25.7461f, 17.8477f)
                curveTo(25.7461f, 19.0664f, 25.0898f, 19.6875f, 23.9297f, 19.6875f)
                close()
            }
        }
        .build()
        return _photo!!
    }

private var _photo: ImageVector? = null
