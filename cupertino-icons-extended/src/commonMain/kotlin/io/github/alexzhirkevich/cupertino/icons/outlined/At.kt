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

public val CupertinoIcons.Outlined.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.3047.dp, defaultHeight = 25.9102.dp,
                viewportWidth = 24.3047f, viewportHeight = 25.9102f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.5f)
                curveTo(0.0f, 21.2227f, 5.2266f, 25.9102f, 12.4219f, 25.9102f)
                curveTo(14.3672f, 25.9102f, 16.2188f, 25.6406f, 17.3672f, 25.2656f)
                curveTo(18.1758f, 25.0078f, 18.4336f, 24.5859f, 18.4336f, 24.1523f)
                curveTo(18.4336f, 23.7188f, 18.0938f, 23.3906f, 17.6602f, 23.3906f)
                curveTo(17.5195f, 23.3906f, 17.332f, 23.4141f, 17.1094f, 23.4727f)
                curveTo(15.6797f, 23.8242f, 14.4492f, 24.0586f, 12.7969f, 24.0586f)
                curveTo(6.3867f, 24.0586f, 2.0156f, 20.1914f, 2.0156f, 13.5703f)
                curveTo(2.0156f, 7.2305f, 6.1406f, 2.8125f, 12.3516f, 2.8125f)
                curveTo(17.8477f, 2.8125f, 22.4414f, 6.1992f, 22.4414f, 12.2812f)
                curveTo(22.4414f, 15.832f, 21.2461f, 18.2227f, 19.3125f, 18.2227f)
                curveTo(18.0234f, 18.2227f, 17.2969f, 17.4727f, 17.2969f, 16.1953f)
                lineTo(17.2969f, 8.25f)
                curveTo(17.2969f, 7.6172f, 16.9453f, 7.2305f, 16.3477f, 7.2305f)
                curveTo(15.7617f, 7.2305f, 15.3984f, 7.6172f, 15.3984f, 8.25f)
                lineTo(15.3984f, 9.5859f)
                lineTo(15.293f, 9.5859f)
                curveTo(14.6953f, 8.1445f, 13.2305f, 7.2305f, 11.4844f, 7.2305f)
                curveTo(8.4492f, 7.2305f, 6.3164f, 9.8203f, 6.3164f, 13.5352f)
                curveTo(6.3164f, 17.2852f, 8.4375f, 19.8984f, 11.5312f, 19.8984f)
                curveTo(13.3477f, 19.8984f, 14.7539f, 18.9141f, 15.4336f, 17.25f)
                lineTo(15.5391f, 17.25f)
                curveTo(15.7617f, 18.9023f, 17.1562f, 19.9102f, 19.0078f, 19.9102f)
                curveTo(22.2773f, 19.9102f, 24.3047f, 16.6992f, 24.3047f, 12.1992f)
                curveTo(24.3047f, 5.3906f, 19.3008f, 0.9727f, 12.375f, 0.9727f)
                curveTo(5.0977f, 0.9727f, 0.0f, 5.9531f, 0.0f, 13.5f)
                close()
                moveTo(11.8477f, 18.0469f)
                curveTo(9.75f, 18.0469f, 8.4141f, 16.3008f, 8.4141f, 13.5234f)
                curveTo(8.4141f, 10.793f, 9.7617f, 9.0469f, 11.8594f, 9.0469f)
                curveTo(14.0156f, 9.0469f, 15.375f, 10.7578f, 15.375f, 13.4766f)
                curveTo(15.375f, 16.2539f, 13.9805f, 18.0469f, 11.8477f, 18.0469f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
