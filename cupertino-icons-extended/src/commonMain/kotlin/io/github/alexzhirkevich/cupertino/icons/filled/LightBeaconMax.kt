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

public val CupertinoIcons.Filled.LightBeaconMax: ImageVector
    get() {
        if (_lightBeaconMax != null) {
            return _lightBeaconMax!!
        }
        _lightBeaconMax = Builder(name = "LightBeaconMax", defaultWidth = 27.7383.dp, defaultHeight
                = 26.6367.dp, viewportWidth = 27.7383f, viewportHeight = 26.6367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8477f, 14.0742f)
                lineTo(14.8477f, 21.8086f)
                lineTo(12.9023f, 21.8086f)
                lineTo(12.9023f, 14.0742f)
                curveTo(12.9023f, 13.5352f, 13.3242f, 13.0898f, 13.8633f, 13.0898f)
                curveTo(14.4023f, 13.0898f, 14.8477f, 13.5352f, 14.8477f, 14.0742f)
                close()
                moveTo(22.8633f, 23.707f)
                curveTo(23.3906f, 23.707f, 23.8242f, 23.2852f, 23.8242f, 22.7695f)
                curveTo(23.8242f, 22.2422f, 23.3906f, 21.8086f, 22.8633f, 21.8086f)
                lineTo(21.4336f, 21.8086f)
                lineTo(21.4336f, 14.0391f)
                curveTo(21.4336f, 9.7617f, 18.1406f, 6.457f, 13.8633f, 6.457f)
                curveTo(9.5977f, 6.457f, 6.3047f, 9.7617f, 6.3047f, 14.0391f)
                lineTo(6.3047f, 21.8086f)
                lineTo(4.8516f, 21.8086f)
                curveTo(4.3359f, 21.8086f, 3.9258f, 22.2422f, 3.9258f, 22.7695f)
                curveTo(3.9258f, 23.2852f, 4.3359f, 23.707f, 4.8516f, 23.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2461f, 14.8828f)
                curveTo(3.7969f, 14.8828f, 4.2773f, 14.4258f, 4.2773f, 13.8867f)
                curveTo(4.2773f, 13.3242f, 3.7969f, 12.8672f, 3.2461f, 12.8672f)
                lineTo(0.9961f, 12.8672f)
                curveTo(0.457f, 12.8672f, 0.0f, 13.3359f, 0.0f, 13.8867f)
                curveTo(0.0f, 14.4141f, 0.457f, 14.8828f, 0.9961f, 14.8828f)
                close()
                moveTo(5.6484f, 7.0898f)
                curveTo(6.0352f, 7.4766f, 6.6797f, 7.4883f, 7.0664f, 7.0898f)
                curveTo(7.4648f, 6.6914f, 7.4531f, 6.0586f, 7.0664f, 5.6719f)
                lineTo(5.4844f, 4.0781f)
                curveTo(5.1094f, 3.6797f, 4.4531f, 3.6797f, 4.0547f, 4.0781f)
                curveTo(3.668f, 4.4766f, 3.668f, 5.0977f, 4.0547f, 5.4961f)
                close()
                moveTo(12.8555f, 3.2695f)
                curveTo(12.8555f, 3.8203f, 13.3125f, 4.2891f, 13.8633f, 4.2891f)
                curveTo(14.4258f, 4.2891f, 14.8828f, 3.8203f, 14.8828f, 3.2695f)
                lineTo(14.8828f, 1.0195f)
                curveTo(14.8828f, 0.4688f, 14.4141f, 0.0f, 13.8633f, 0.0f)
                curveTo(13.3125f, 0.0f, 12.8555f, 0.4688f, 12.8555f, 1.0195f)
                close()
                moveTo(20.6484f, 5.6719f)
                curveTo(20.2617f, 6.0586f, 20.25f, 6.6914f, 20.6484f, 7.0898f)
                curveTo(21.0586f, 7.4883f, 21.6797f, 7.4766f, 22.0664f, 7.0898f)
                lineTo(23.6719f, 5.4961f)
                curveTo(24.0586f, 5.0977f, 24.0586f, 4.4766f, 23.6719f, 4.0781f)
                curveTo(23.2617f, 3.6797f, 22.6406f, 3.6797f, 22.2539f, 4.0781f)
                close()
                moveTo(26.7188f, 14.8828f)
                curveTo(27.2695f, 14.8828f, 27.7383f, 14.4141f, 27.7383f, 13.8867f)
                curveTo(27.7383f, 13.3359f, 27.2695f, 12.8672f, 26.7188f, 12.8672f)
                lineTo(24.4688f, 12.8672f)
                curveTo(23.9297f, 12.8672f, 23.4609f, 13.3242f, 23.4609f, 13.8867f)
                curveTo(23.4609f, 14.4258f, 23.9297f, 14.8828f, 24.4688f, 14.8828f)
                close()
            }
        }
        .build()
        return _lightBeaconMax!!
    }

private var _lightBeaconMax: ImageVector? = null
