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

public val CupertinoIcons.Outlined.MusicQuarternote3: ImageVector
    get() {
        if (_musicQuarternote3 != null) {
            return _musicQuarternote3!!
        }
        _musicQuarternote3 = Builder(name = "MusicQuarternote3", defaultWidth = 26.9766.dp,
                defaultHeight = 23.3789.dp, viewportWidth = 26.9766f, viewportHeight =
                23.3789f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.2969f)
                curveTo(0.0f, 22.1016f, 1.3945f, 23.3555f, 3.3398f, 23.3555f)
                curveTo(5.0742f, 23.3555f, 7.6523f, 22.0781f, 7.6523f, 18.6562f)
                lineTo(7.6523f, 6.7617f)
                curveTo(7.6523f, 6.3398f, 7.3008f, 5.9766f, 6.8672f, 5.9766f)
                curveTo(6.4336f, 5.9766f, 6.0703f, 6.3398f, 6.0703f, 6.7617f)
                lineTo(6.0703f, 15.375f)
                curveTo(6.0703f, 15.9492f, 5.8477f, 16.3359f, 5.332f, 16.4297f)
                lineTo(3.4688f, 16.8164f)
                curveTo(1.1016f, 17.3203f, 0.0f, 18.5039f, 0.0f, 20.2969f)
                close()
                moveTo(10.6406f, 14.3203f)
                curveTo(10.6406f, 16.1133f, 12.0352f, 17.3789f, 13.9805f, 17.3789f)
                curveTo(15.7148f, 17.3789f, 18.293f, 16.1016f, 18.293f, 12.668f)
                lineTo(18.293f, 0.7852f)
                curveTo(18.293f, 0.3516f, 17.9414f, 0.0f, 17.5078f, 0.0f)
                curveTo(17.0742f, 0.0f, 16.7109f, 0.3516f, 16.7109f, 0.7852f)
                lineTo(16.7109f, 9.3984f)
                curveTo(16.7109f, 9.9727f, 16.4883f, 10.3477f, 15.9727f, 10.4531f)
                lineTo(14.1094f, 10.8398f)
                curveTo(11.7422f, 11.332f, 10.6406f, 12.5273f, 10.6406f, 14.3203f)
                close()
                moveTo(19.3242f, 20.2969f)
                curveTo(19.3242f, 22.1016f, 20.707f, 23.3555f, 22.6641f, 23.3555f)
                curveTo(24.3867f, 23.3555f, 26.9766f, 22.0781f, 26.9766f, 18.6562f)
                lineTo(26.9766f, 6.7617f)
                curveTo(26.9766f, 6.3398f, 26.6133f, 5.9766f, 26.1914f, 5.9766f)
                curveTo(25.7578f, 5.9766f, 25.3945f, 6.3398f, 25.3945f, 6.7617f)
                lineTo(25.3945f, 15.375f)
                curveTo(25.3945f, 15.9609f, 25.1602f, 16.3359f, 24.6562f, 16.4297f)
                lineTo(22.7812f, 16.8281f)
                curveTo(20.4258f, 17.3203f, 19.3242f, 18.5156f, 19.3242f, 20.2969f)
                close()
            }
        }
        .build()
        return _musicQuarternote3!!
    }

private var _musicQuarternote3: ImageVector? = null
