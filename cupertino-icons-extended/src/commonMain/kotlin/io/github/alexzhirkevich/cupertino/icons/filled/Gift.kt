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

public val CupertinoIcons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 22.5117.dp, defaultHeight = 25.8867.dp,
                viewportWidth = 22.5117f, viewportHeight = 25.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6758f, 21.5859f)
                curveTo(1.6758f, 23.543f, 2.8242f, 24.5625f, 4.7813f, 24.5625f)
                lineTo(10.2891f, 24.5625f)
                lineTo(10.2891f, 14.0391f)
                lineTo(1.6758f, 14.0391f)
                close()
                moveTo(12.2109f, 24.5625f)
                lineTo(17.7305f, 24.5625f)
                curveTo(19.6758f, 24.5625f, 20.8359f, 23.543f, 20.8359f, 21.5859f)
                lineTo(20.8359f, 14.0391f)
                lineTo(12.2109f, 14.0391f)
                close()
                moveTo(0.0f, 11.0391f)
                curveTo(0.0f, 12.293f, 0.7031f, 12.7852f, 1.9688f, 12.7852f)
                lineTo(10.2891f, 12.7852f)
                lineTo(10.2891f, 6.4453f)
                lineTo(8.4609f, 6.4453f)
                curveTo(6.6211f, 6.4453f, 5.543f, 5.2852f, 5.543f, 3.9961f)
                curveTo(5.543f, 2.707f, 6.4805f, 1.957f, 7.7695f, 1.957f)
                curveTo(9.1641f, 1.957f, 10.2891f, 3.0117f, 10.2891f, 4.7461f)
                lineTo(10.2891f, 6.4453f)
                lineTo(12.2109f, 6.4453f)
                lineTo(12.2109f, 4.7461f)
                curveTo(12.2109f, 3.0117f, 13.3359f, 1.957f, 14.7305f, 1.957f)
                curveTo(16.0195f, 1.957f, 16.957f, 2.707f, 16.957f, 3.9961f)
                curveTo(16.957f, 5.2852f, 15.8906f, 6.4453f, 14.0391f, 6.4453f)
                lineTo(12.2109f, 6.4453f)
                lineTo(12.2109f, 12.7852f)
                lineTo(20.543f, 12.7852f)
                curveTo(21.8086f, 12.7852f, 22.5117f, 12.293f, 22.5117f, 11.0391f)
                lineTo(22.5117f, 8.1914f)
                curveTo(22.5117f, 6.9375f, 21.8086f, 6.4453f, 20.543f, 6.4453f)
                lineTo(17.8242f, 6.4453f)
                curveTo(18.5039f, 5.8008f, 18.9141f, 4.9219f, 18.9141f, 3.8906f)
                curveTo(18.9141f, 1.6172f, 17.1211f, 0.0f, 14.8477f, 0.0f)
                curveTo(13.207f, 0.0f, 11.8477f, 0.9023f, 11.25f, 2.4727f)
                curveTo(10.6523f, 0.9023f, 9.3047f, 0.0f, 7.6523f, 0.0f)
                curveTo(5.3906f, 0.0f, 3.5859f, 1.6172f, 3.5859f, 3.8906f)
                curveTo(3.5859f, 4.9219f, 3.9961f, 5.8008f, 4.6875f, 6.4453f)
                lineTo(1.9688f, 6.4453f)
                curveTo(0.7617f, 6.4453f, 0.0f, 6.9375f, 0.0f, 8.1914f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
