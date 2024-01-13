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

public val CupertinoIcons.Outlined.Checkmark: ImageVector
    get() {
        if (_checkmark != null) {
            return _checkmark!!
        }
        _checkmark = Builder(name = "Checkmark", defaultWidth = 20.1914.dp, defaultHeight =
                20.6836.dp, viewportWidth = 20.1914f, viewportHeight = 20.6836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6406f, 20.6836f)
                curveTo(8.1445f, 20.6836f, 8.543f, 20.4609f, 8.8242f, 20.0273f)
                lineTo(19.8984f, 2.5898f)
                curveTo(20.1094f, 2.25f, 20.1914f, 1.9922f, 20.1914f, 1.7227f)
                curveTo(20.1914f, 1.0781f, 19.7695f, 0.6563f, 19.125f, 0.6563f)
                curveTo(18.6562f, 0.6563f, 18.3984f, 0.8086f, 18.1172f, 1.2539f)
                lineTo(7.5938f, 18.0234f)
                lineTo(2.1328f, 10.875f)
                curveTo(1.8398f, 10.4648f, 1.5469f, 10.3008f, 1.125f, 10.3008f)
                curveTo(0.457f, 10.3008f, 0.0f, 10.7578f, 0.0f, 11.4023f)
                curveTo(0.0f, 11.6719f, 0.1172f, 11.9766f, 0.3398f, 12.2578f)
                lineTo(6.4219f, 20.0039f)
                curveTo(6.7734f, 20.4609f, 7.1367f, 20.6836f, 7.6406f, 20.6836f)
                close()
            }
        }
        .build()
        return _checkmark!!
    }

private var _checkmark: ImageVector? = null
