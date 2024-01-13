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

public val CupertinoIcons.Filled.CheckmarkCircle: ImageVector
    get() {
        if (_checkmarkCircle != null) {
            return _checkmarkCircle!!
        }
        _checkmarkCircle = Builder(name = "CheckmarkCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(10.6406f, 17.6836f)
                curveTo(10.2422f, 17.6836f, 9.9141f, 17.5195f, 9.6094f, 17.1094f)
                lineTo(6.668f, 13.5f)
                curveTo(6.4922f, 13.2656f, 6.3867f, 13.0078f, 6.3867f, 12.7383f)
                curveTo(6.3867f, 12.2109f, 6.7969f, 11.7773f, 7.3242f, 11.7773f)
                curveTo(7.6641f, 11.7773f, 7.9219f, 11.8828f, 8.2148f, 12.2695f)
                lineTo(10.5938f, 15.3398f)
                lineTo(15.5977f, 7.3008f)
                curveTo(15.8203f, 6.9492f, 16.125f, 6.7617f, 16.4297f, 6.7617f)
                curveTo(16.9453f, 6.7617f, 17.4258f, 7.1133f, 17.4258f, 7.6641f)
                curveTo(17.4258f, 7.9219f, 17.2734f, 8.1914f, 17.1328f, 8.4375f)
                lineTo(11.625f, 17.1094f)
                curveTo(11.3789f, 17.4961f, 11.0391f, 17.6836f, 10.6406f, 17.6836f)
                close()
            }
        }
        .build()
        return _checkmarkCircle!!
    }

private var _checkmarkCircle: ImageVector? = null
