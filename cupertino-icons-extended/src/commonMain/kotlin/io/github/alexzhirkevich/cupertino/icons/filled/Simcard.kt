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

public val CupertinoIcons.Filled.Simcard: ImageVector
    get() {
        if (_simcard != null) {
            return _simcard!!
        }
        _simcard = Builder(name = "Simcard", defaultWidth = 19.7109.dp, defaultHeight = 25.1367.dp,
                viewportWidth = 19.7109f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6328f, 25.1367f)
                lineTo(16.0781f, 25.1367f)
                curveTo(18.5039f, 25.1367f, 19.7109f, 23.9062f, 19.7109f, 21.4688f)
                lineTo(19.7109f, 8.332f)
                curveTo(19.7109f, 7.1719f, 19.5f, 6.5977f, 18.8438f, 5.9297f)
                lineTo(13.8633f, 0.9609f)
                curveTo(13.1836f, 0.2695f, 12.5156f, 0.0117f, 11.4609f, 0.0117f)
                lineTo(3.6328f, 0.0117f)
                curveTo(1.2188f, 0.0117f, 0.0f, 1.2539f, 0.0f, 3.6914f)
                lineTo(0.0f, 21.4688f)
                curveTo(0.0f, 23.918f, 1.207f, 25.1367f, 3.6328f, 25.1367f)
                close()
                moveTo(4.2656f, 19.6406f)
                lineTo(4.2656f, 15.2812f)
                lineTo(7.2891f, 15.2812f)
                curveTo(7.4063f, 15.2812f, 7.4766f, 15.3398f, 7.4766f, 15.457f)
                lineTo(7.4766f, 21.2695f)
                lineTo(5.8828f, 21.2695f)
                curveTo(4.8867f, 21.2695f, 4.2656f, 20.6484f, 4.2656f, 19.6406f)
                close()
                moveTo(4.2656f, 13.9805f)
                lineTo(4.2656f, 12.5156f)
                curveTo(4.2656f, 11.4961f, 4.8867f, 10.875f, 5.8828f, 10.875f)
                lineTo(11.0273f, 10.875f)
                lineTo(11.0273f, 21.2695f)
                lineTo(8.7773f, 21.2695f)
                lineTo(8.7773f, 14.6836f)
                curveTo(8.7773f, 14.25f, 8.5195f, 13.9805f, 8.0742f, 13.9805f)
                close()
                moveTo(12.3281f, 21.2695f)
                lineTo(12.3281f, 10.875f)
                lineTo(13.8398f, 10.875f)
                curveTo(14.8359f, 10.875f, 15.4688f, 11.4961f, 15.4688f, 12.5156f)
                lineTo(15.4688f, 19.6406f)
                curveTo(15.4688f, 20.6484f, 14.8359f, 21.2695f, 13.8398f, 21.2695f)
                close()
            }
        }
        .build()
        return _simcard!!
    }

private var _simcard: ImageVector? = null
