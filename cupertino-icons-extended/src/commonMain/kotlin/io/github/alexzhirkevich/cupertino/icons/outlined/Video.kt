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

public val CupertinoIcons.Outlined.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 28.9922.dp, defaultHeight = 19.2773.dp,
                viewportWidth = 28.9922f, viewportHeight = 19.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5703f, 19.2656f)
                lineTo(16.8164f, 19.2656f)
                curveTo(19.6758f, 19.2656f, 21.3867f, 17.6016f, 21.3867f, 14.7422f)
                lineTo(21.3867f, 4.5117f)
                curveTo(21.3867f, 1.6641f, 19.6758f, 0.0f, 16.8164f, 0.0f)
                lineTo(4.5703f, 0.0f)
                curveTo(1.8398f, 0.0f, 0.0f, 1.6641f, 0.0f, 4.5117f)
                lineTo(0.0f, 14.7422f)
                curveTo(0.0f, 17.6016f, 1.7109f, 19.2656f, 4.5703f, 19.2656f)
                close()
                moveTo(4.8984f, 17.4961f)
                curveTo(2.9766f, 17.4961f, 1.8867f, 16.5f, 1.8867f, 14.4727f)
                lineTo(1.8867f, 4.793f)
                curveTo(1.8867f, 2.7539f, 2.9766f, 1.7578f, 4.8984f, 1.7578f)
                lineTo(16.4883f, 1.7578f)
                curveTo(18.3984f, 1.7578f, 19.5f, 2.7539f, 19.5f, 4.793f)
                lineTo(19.5f, 14.4727f)
                curveTo(19.5f, 16.5f, 18.3984f, 17.4961f, 16.4883f, 17.4961f)
                close()
                moveTo(21.1172f, 6.3516f)
                lineTo(21.1172f, 8.5781f)
                lineTo(26.6953f, 3.9727f)
                curveTo(26.8008f, 3.8906f, 26.8711f, 3.832f, 26.9766f, 3.832f)
                curveTo(27.1172f, 3.832f, 27.1758f, 3.9492f, 27.1758f, 4.1133f)
                lineTo(27.1758f, 15.1523f)
                curveTo(27.1758f, 15.3164f, 27.1172f, 15.4219f, 26.9766f, 15.4219f)
                curveTo(26.8711f, 15.4219f, 26.8008f, 15.3633f, 26.6953f, 15.293f)
                lineTo(21.1172f, 10.6875f)
                lineTo(21.1172f, 12.9023f)
                lineTo(25.8164f, 16.8867f)
                curveTo(26.2852f, 17.2734f, 26.8008f, 17.543f, 27.2812f, 17.543f)
                curveTo(28.3125f, 17.543f, 28.9922f, 16.7812f, 28.9922f, 15.6914f)
                lineTo(28.9922f, 3.5742f)
                curveTo(28.9922f, 2.4844f, 28.3125f, 1.7227f, 27.2812f, 1.7227f)
                curveTo(26.8008f, 1.7227f, 26.2852f, 1.9922f, 25.8164f, 2.3789f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
