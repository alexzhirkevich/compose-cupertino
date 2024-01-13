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

public val CupertinoIcons.Outlined.MusicMic: ImageVector
    get() {
        if (_musicMic != null) {
            return _musicMic!!
        }
        _musicMic = Builder(name = "MusicMic", defaultWidth = 23.2652.dp, defaultHeight =
                24.7228.dp, viewportWidth = 23.2652f, viewportHeight = 24.7228f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9391f, 23.8165f)
                curveTo(12.5367f, 23.8165f, 13.0055f, 23.3477f, 13.0055f, 22.7618f)
                lineTo(13.0055f, 14.0665f)
                lineTo(16.5094f, 10.8321f)
                curveTo(17.8453f, 11.0079f, 19.2516f, 10.4571f, 20.482f, 9.2266f)
                lineTo(14.0367f, 2.7696f)
                curveTo(12.7945f, 4.0001f, 12.2789f, 5.3829f, 12.4664f, 6.7305f)
                lineTo(1.568f, 18.461f)
                curveTo(1.1227f, 18.9415f, 1.0524f, 19.6094f, 1.6031f, 20.1602f)
                lineTo(0.1031f, 22.0938f)
                curveTo(-0.0375f, 22.2813f, -0.0492f, 22.5508f, 0.1617f, 22.7618f)
                lineTo(0.5016f, 23.1133f)
                curveTo(0.7008f, 23.3126f, 0.9703f, 23.3243f, 1.1812f, 23.1602f)
                lineTo(3.1149f, 21.6485f)
                curveTo(3.6422f, 22.1993f, 4.3219f, 22.129f, 4.7906f, 21.6837f)
                lineTo(10.8727f, 16.0587f)
                lineTo(10.8727f, 22.7618f)
                curveTo(10.8727f, 23.3477f, 11.3414f, 23.8165f, 11.9391f, 23.8165f)
                close()
                moveTo(2.775f, 19.4219f)
                lineTo(13.1109f, 8.4532f)
                curveTo(13.3102f, 8.793f, 13.5445f, 9.1094f, 13.8375f, 9.4258f)
                curveTo(14.1188f, 9.7188f, 14.4469f, 9.9883f, 14.7516f, 10.1758f)
                lineTo(3.8531f, 20.5001f)
                close()
                moveTo(15.2086f, 1.586f)
                lineTo(21.6656f, 8.043f)
                curveTo(23.7281f, 6.004f, 23.8102f, 3.3907f, 21.8297f, 1.4219f)
                curveTo(19.8609f, -0.5234f, 17.2711f, -0.4765f, 15.2086f, 1.586f)
                close()
            }
        }
        .build()
        return _musicMic!!
    }

private var _musicMic: ImageVector? = null
