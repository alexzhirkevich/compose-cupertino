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

public val CupertinoIcons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 31.7695.dp, defaultHeight = 19.9336.dp,
                viewportWidth = 31.7695f, viewportHeight = 19.9336f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8906f, 19.9336f)
                curveTo(25.2773f, 19.9336f, 31.7695f, 12.3398f, 31.7695f, 9.9727f)
                curveTo(31.7695f, 7.5938f, 25.2656f, 0.0117f, 15.8906f, 0.0117f)
                curveTo(6.6211f, 0.0117f, 0.0f, 7.5938f, 0.0f, 9.9727f)
                curveTo(0.0f, 12.3398f, 6.6211f, 19.9336f, 15.8906f, 19.9336f)
                close()
                moveTo(15.8906f, 16.5f)
                curveTo(12.2344f, 16.5f, 9.3398f, 13.5352f, 9.3281f, 9.9727f)
                curveTo(9.3164f, 6.3164f, 12.2344f, 3.4453f, 15.8906f, 3.4453f)
                curveTo(19.5117f, 3.4453f, 22.4414f, 6.3164f, 22.4414f, 9.9727f)
                curveTo(22.4414f, 13.5352f, 19.5117f, 16.5f, 15.8906f, 16.5f)
                close()
                moveTo(15.8906f, 12.3281f)
                curveTo(17.1914f, 12.3281f, 18.2695f, 11.2617f, 18.2695f, 9.9727f)
                curveTo(18.2695f, 8.6719f, 17.1914f, 7.6055f, 15.8906f, 7.6055f)
                curveTo(14.5781f, 7.6055f, 13.5f, 8.6719f, 13.5f, 9.9727f)
                curveTo(13.5f, 11.2617f, 14.5781f, 12.3281f, 15.8906f, 12.3281f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
