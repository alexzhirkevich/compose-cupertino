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

public val CupertinoIcons.Outlined.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = Builder(name = "LockOpen", defaultWidth = 24.1172.dp, defaultHeight =
                23.5664.dp, viewportWidth = 24.1172f, viewportHeight = 23.5664f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6367f, 22.9688f)
                lineTo(13.3594f, 22.9688f)
                curveTo(15.082f, 22.9688f, 15.9961f, 22.0312f, 15.9961f, 20.1797f)
                lineTo(15.9961f, 12.1055f)
                curveTo(15.9961f, 10.2656f, 15.082f, 9.3281f, 13.3594f, 9.3281f)
                lineTo(2.6367f, 9.3281f)
                curveTo(0.9141f, 9.3281f, 0.0f, 10.2656f, 0.0f, 12.1055f)
                lineTo(0.0f, 20.1797f)
                curveTo(0.0f, 22.0312f, 0.9141f, 22.9688f, 2.6367f, 22.9688f)
                close()
                moveTo(2.6953f, 21.1992f)
                curveTo(2.1914f, 21.1992f, 1.8984f, 20.8828f, 1.8984f, 20.3086f)
                lineTo(1.8984f, 11.9766f)
                curveTo(1.8984f, 11.4023f, 2.1914f, 11.0977f, 2.6953f, 11.0977f)
                lineTo(13.3008f, 11.0977f)
                curveTo(13.8164f, 11.0977f, 14.0977f, 11.4023f, 14.0977f, 11.9766f)
                lineTo(14.0977f, 20.3086f)
                curveTo(14.0977f, 20.8828f, 13.8164f, 21.1992f, 13.3008f, 21.1992f)
                close()
                moveTo(12.2227f, 10.2422f)
                lineTo(14.0742f, 10.2422f)
                lineTo(14.0742f, 6.293f)
                curveTo(14.0742f, 3.3281f, 15.9727f, 1.7695f, 18.1641f, 1.7695f)
                curveTo(20.3555f, 1.7695f, 22.2539f, 3.3281f, 22.2539f, 6.293f)
                lineTo(22.2539f, 8.8945f)
                curveTo(22.2539f, 9.5859f, 22.6641f, 9.9375f, 23.1914f, 9.9375f)
                curveTo(23.6953f, 9.9375f, 24.1172f, 9.6211f, 24.1172f, 8.8945f)
                lineTo(24.1172f, 6.5391f)
                curveTo(24.1172f, 2.1328f, 21.2227f, 0.0f, 18.1641f, 0.0f)
                curveTo(15.0938f, 0.0f, 12.2227f, 2.1328f, 12.2227f, 6.5391f)
                close()
            }
        }
        .build()
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
