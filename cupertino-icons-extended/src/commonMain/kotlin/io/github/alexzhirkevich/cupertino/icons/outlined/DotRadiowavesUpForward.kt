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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Outlined.DotRadiowavesUpForward: ImageVector
    get() {
        if (_dotRadiowavesUpForward != null) {
            return _dotRadiowavesUpForward!!
        }
        _dotRadiowavesUpForward = Builder(name = "DotRadiowavesUpForward", defaultWidth =
                17.6953.dp, defaultHeight = 17.8242.dp, viewportWidth = 17.6953f, viewportHeight =
                17.8242f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6758f, 17.6953f)
                curveTo(2.5898f, 17.6953f, 3.3281f, 16.9453f, 3.3281f, 16.043f)
                curveTo(3.3281f, 15.1172f, 2.6016f, 14.3789f, 1.6758f, 14.3789f)
                curveTo(0.7617f, 14.3789f, 0.0f, 15.1523f, 0.0f, 16.0781f)
                curveTo(0.0f, 16.9453f, 0.7852f, 17.6953f, 1.6758f, 17.6953f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.1758f, 10.5469f)
                curveTo(0.1758f, 11.0625f, 0.6094f, 11.4844f, 1.125f, 11.4844f)
                curveTo(3.9258f, 11.4844f, 6.2109f, 13.7695f, 6.2109f, 16.5703f)
                curveTo(6.2109f, 17.0859f, 6.6328f, 17.5195f, 7.1484f, 17.5195f)
                curveTo(7.6641f, 17.5195f, 8.0977f, 17.0859f, 8.0977f, 16.5703f)
                curveTo(8.0977f, 12.7266f, 4.957f, 9.5977f, 1.125f, 9.5977f)
                curveTo(0.6094f, 9.5977f, 0.1758f, 10.0312f, 0.1758f, 10.5469f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.1758f, 5.8945f)
                curveTo(0.1758f, 6.4102f, 0.6094f, 6.832f, 1.125f, 6.832f)
                curveTo(6.5039f, 6.832f, 10.8633f, 11.1914f, 10.8633f, 16.5703f)
                curveTo(10.8633f, 17.0859f, 11.2852f, 17.5195f, 11.8008f, 17.5195f)
                curveTo(12.3164f, 17.5195f, 12.75f, 17.0859f, 12.75f, 16.5703f)
                curveTo(12.75f, 10.1602f, 7.5352f, 4.9453f, 1.125f, 4.9453f)
                curveTo(0.6094f, 4.9453f, 0.1758f, 5.3789f, 0.1758f, 5.8945f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.1758f, 0.9375f)
                curveTo(0.1758f, 1.4531f, 0.6094f, 1.8867f, 1.125f, 1.8867f)
                curveTo(9.2227f, 1.8867f, 15.8086f, 8.4727f, 15.8086f, 16.5703f)
                curveTo(15.8086f, 17.0859f, 16.2422f, 17.5195f, 16.7578f, 17.5195f)
                curveTo(17.2734f, 17.5195f, 17.6953f, 17.0859f, 17.6953f, 16.5703f)
                curveTo(17.6953f, 7.4414f, 10.2539f, 0.0f, 1.125f, 0.0f)
                curveTo(0.6094f, 0.0f, 0.1758f, 0.4219f, 0.1758f, 0.9375f)
                close()
            }
        }
        .build()
        return _dotRadiowavesUpForward!!
    }

private var _dotRadiowavesUpForward: ImageVector? = null
