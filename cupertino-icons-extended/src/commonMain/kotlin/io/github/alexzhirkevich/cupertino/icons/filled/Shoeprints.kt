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

public val CupertinoIcons.Filled.Shoeprints: ImageVector
    get() {
        if (_shoeprints != null) {
            return _shoeprints!!
        }
        _shoeprints = Builder(name = "Shoeprints", defaultWidth = 21.7181.dp, defaultHeight =
                27.3164.dp, viewportWidth = 21.7181f, viewportHeight = 27.3164f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8398f, 0.0f)
                curveTo(2.3086f, 0.0f, 0.0f, 3.8555f, 0.0f, 6.8438f)
                curveTo(0.0f, 8.2734f, 0.4805f, 11.0859f, 1.6055f, 13.3477f)
                lineTo(8.0859f, 13.3477f)
                curveTo(9.1992f, 11.0859f, 9.6914f, 8.2734f, 9.6914f, 6.8438f)
                curveTo(9.6914f, 3.8555f, 7.3828f, 0.0f, 4.8398f, 0.0f)
                close()
                moveTo(4.8516f, 20.2383f)
                curveTo(6.6797f, 20.2383f, 7.6641f, 18.4219f, 7.6641f, 15.8438f)
                curveTo(7.6641f, 15.5977f, 7.6406f, 15.2344f, 7.5938f, 14.9531f)
                lineTo(2.1094f, 14.9531f)
                curveTo(2.0625f, 15.2344f, 2.0391f, 15.5977f, 2.0391f, 15.8438f)
                curveTo(2.0391f, 18.4219f, 3.0234f, 20.2383f, 4.8516f, 20.2383f)
                close()
                moveTo(19.0781f, 7.6992f)
                curveTo(16.6875f, 6.832f, 13.2188f, 9.6563f, 12.1875f, 12.4688f)
                curveTo(11.707f, 13.8164f, 11.1914f, 16.6289f, 11.4609f, 19.1367f)
                lineTo(17.5547f, 21.3516f)
                curveTo(19.3828f, 19.6055f, 20.8008f, 17.1445f, 21.293f, 15.7734f)
                curveTo(22.3125f, 12.9727f, 21.4688f, 8.5781f, 19.0781f, 7.6992f)
                close()
                moveTo(12.1641f, 26.7188f)
                curveTo(13.8867f, 27.3398f, 15.4336f, 25.9688f, 16.3125f, 23.5547f)
                curveTo(16.3945f, 23.3203f, 16.4883f, 22.9688f, 16.5586f, 22.6875f)
                lineTo(11.4023f, 20.8008f)
                curveTo(11.2617f, 21.0586f, 11.1094f, 21.3867f, 11.0273f, 21.6211f)
                curveTo(10.1484f, 24.0469f, 10.4531f, 26.0859f, 12.1641f, 26.7188f)
                close()
            }
        }
        .build()
        return _shoeprints!!
    }

private var _shoeprints: ImageVector? = null
