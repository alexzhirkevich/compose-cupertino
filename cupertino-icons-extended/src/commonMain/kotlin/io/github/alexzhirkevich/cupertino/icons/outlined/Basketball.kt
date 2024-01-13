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

public val CupertinoIcons.Outlined.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 23.9062.dp, defaultHeight =
                23.918.dp, viewportWidth = 23.9062f, viewportHeight = 23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2422f, 12.7734f)
                curveTo(4.4297f, 8.4258f, 9.3164f, 5.6836f, 14.9648f, 5.6836f)
                curveTo(17.2383f, 5.6836f, 19.3711f, 6.1172f, 21.3984f, 6.9844f)
                lineTo(21.1406f, 5.4727f)
                curveTo(19.2305f, 4.7695f, 17.1094f, 4.3828f, 14.9648f, 4.3828f)
                curveTo(8.9648f, 4.3828f, 3.6328f, 7.3594f, 0.2695f, 11.9062f)
                close()
                moveTo(21.1641f, 17.4961f)
                lineTo(22.4062f, 17.1328f)
                curveTo(20.6367f, 10.9336f, 10.4883f, 9.5859f, 10.4883f, 4.6172f)
                curveTo(10.4883f, 3.1289f, 11.25f, 2.0391f, 12.6445f, 1.3008f)
                lineTo(11.8359f, 0.2578f)
                curveTo(10.2305f, 1.1836f, 9.1875f, 2.7422f, 9.1875f, 4.6172f)
                curveTo(9.1875f, 10.6289f, 19.6172f, 12.1758f, 21.1641f, 17.4961f)
                close()
                moveTo(4.0898f, 20.2617f)
                lineTo(5.5898f, 20.4023f)
                curveTo(3.8203f, 17.0273f, 5.5664f, 12.0938f, 5.2734f, 7.8516f)
                curveTo(5.1914f, 6.7266f, 4.4883f, 4.6992f, 3.2227f, 4.3945f)
                lineTo(2.8945f, 5.6602f)
                curveTo(3.457f, 5.7305f, 3.9258f, 7.1719f, 3.9727f, 7.957f)
                curveTo(4.2305f, 11.6836f, 2.6367f, 16.4766f, 4.0898f, 20.2617f)
                close()
                moveTo(13.5352f, 23.0508f)
                lineTo(14.5781f, 22.2656f)
                curveTo(7.7109f, 13.7344f, 6.6914f, 4.4297f, 7.8164f, 1.8984f)
                lineTo(6.3984f, 2.0977f)
                curveTo(5.5195f, 5.7422f, 6.9727f, 14.8477f, 13.5352f, 23.0508f)
                close()
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 22.3125f)
                curveTo(6.293f, 22.3125f, 1.5938f, 17.6133f, 1.5938f, 11.9531f)
                curveTo(1.5938f, 6.293f, 6.2813f, 1.5938f, 11.9414f, 1.5938f)
                curveTo(17.6016f, 1.5938f, 22.3125f, 6.293f, 22.3125f, 11.9531f)
                curveTo(22.3125f, 17.6133f, 17.6133f, 22.3125f, 11.9531f, 22.3125f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
