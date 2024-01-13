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

public val CupertinoIcons.Filled.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 15.1289.dp, defaultHeight = 32.0508.dp,
                viewportWidth = 15.1289f, viewportHeight = 32.0508f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5586f, 17.9531f)
                curveTo(11.8125f, 17.9531f, 15.1289f, 13.4297f, 15.1289f, 7.7813f)
                curveTo(15.1289f, 3.3398f, 12.0352f, 0.0f, 7.5586f, 0.0f)
                curveTo(3.082f, 0.0f, 0.0f, 3.3398f, 0.0f, 7.7813f)
                curveTo(0.0f, 13.4297f, 3.3047f, 17.9531f, 7.5586f, 17.9531f)
                close()
                moveTo(5.918f, 17.1445f)
                lineTo(5.3672f, 19.2539f)
                curveTo(5.25f, 19.7227f, 5.4961f, 20.2266f, 6.0938f, 20.2266f)
                lineTo(9.0352f, 20.2266f)
                curveTo(9.6328f, 20.2266f, 9.8906f, 19.7227f, 9.7617f, 19.2539f)
                lineTo(9.1875f, 17.1445f)
                close()
                moveTo(7.418f, 31.8867f)
                curveTo(7.875f, 31.8867f, 8.25f, 31.5f, 8.25f, 31.043f)
                curveTo(8.25f, 28.4766f, 10.582f, 27.8789f, 10.582f, 25.2773f)
                curveTo(10.582f, 22.6055f, 8.332f, 22.1016f, 8.3555f, 19.7695f)
                lineTo(6.6914f, 19.7695f)
                curveTo(6.6797f, 22.957f, 8.9297f, 23.4492f, 8.9297f, 25.2773f)
                curveTo(8.9297f, 27.1406f, 6.5859f, 27.4219f, 6.5859f, 31.043f)
                curveTo(6.5859f, 31.5f, 6.9609f, 31.8867f, 7.418f, 31.8867f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
