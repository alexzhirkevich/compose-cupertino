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

public val CupertinoIcons.Outlined.Menucard: ImageVector
    get() {
        if (_menucard != null) {
            return _menucard!!
        }
        _menucard = Builder(name = "Menucard", defaultWidth = 19.4766.dp, defaultHeight =
                27.0491.dp, viewportWidth = 19.4766f, viewportHeight = 27.0491f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.3086f, 24.6163f)
                lineTo(15.6328f, 26.9718f)
                curveTo(18.0234f, 27.3937f, 19.4766f, 26.0695f, 19.4766f, 23.4562f)
                lineTo(19.4766f, 8.9601f)
                curveTo(19.4766f, 6.5695f, 18.2461f, 5.7023f, 15.8672f, 5.2921f)
                lineTo(2.9414f, 3.007f)
                curveTo(1.1602f, 2.6906f, 0.0f, 3.6632f, 0.0f, 5.421f)
                lineTo(0.0f, 21.9562f)
                curveTo(0.0f, 23.4679f, 0.7734f, 24.3468f, 2.3086f, 24.6163f)
                close()
                moveTo(2.7656f, 22.7531f)
                curveTo(2.168f, 22.6593f, 1.8867f, 22.3077f, 1.8867f, 21.6866f)
                lineTo(1.8867f, 5.7374f)
                curveTo(1.8867f, 5.1046f, 2.3086f, 4.7882f, 3.0f, 4.9054f)
                lineTo(15.7734f, 7.1437f)
                curveTo(16.957f, 7.3663f, 17.5898f, 7.8468f, 17.5898f, 8.9367f)
                lineTo(17.5898f, 23.257f)
                curveTo(17.5898f, 24.5812f, 16.8164f, 25.2491f, 15.5508f, 25.0148f)
                close()
                moveTo(16.5469f, 6.7335f)
                lineTo(18.4336f, 6.7335f)
                lineTo(18.4336f, 3.9913f)
                curveTo(18.4336f, 1.5304f, 16.7812f, 0.3468f, 14.0039f, 0.839f)
                lineTo(1.7578f, 3.007f)
                lineTo(2.4609f, 4.6359f)
                lineTo(14.6719f, 2.6085f)
                curveTo(15.8438f, 2.4093f, 16.5469f, 2.9015f, 16.5469f, 3.921f)
                close()
                moveTo(4.8164f, 10.0616f)
                lineTo(13.8516f, 11.6554f)
                curveTo(14.4023f, 11.7491f, 14.7422f, 11.4093f, 14.7422f, 10.9171f)
                curveTo(14.7422f, 10.4718f, 14.5195f, 10.2374f, 14.1094f, 10.1554f)
                lineTo(5.1211f, 8.5851f)
                curveTo(4.582f, 8.4913f, 4.207f, 8.8077f, 4.207f, 9.2882f)
                curveTo(4.207f, 9.6984f, 4.4297f, 9.9913f, 4.8164f, 10.0616f)
                close()
                moveTo(4.8164f, 14.632f)
                lineTo(13.8516f, 16.2257f)
                curveTo(14.4023f, 16.3195f, 14.7422f, 15.9796f, 14.7422f, 15.4874f)
                curveTo(14.7422f, 15.0421f, 14.5195f, 14.8077f, 14.1094f, 14.7257f)
                lineTo(5.1211f, 13.1554f)
                curveTo(4.582f, 13.0616f, 4.207f, 13.3781f, 4.207f, 13.8585f)
                curveTo(4.207f, 14.2687f, 4.4297f, 14.5616f, 4.8164f, 14.632f)
                close()
            }
        }
        .build()
        return _menucard!!
    }

private var _menucard: ImageVector? = null
