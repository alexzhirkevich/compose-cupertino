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

public val CupertinoIcons.Filled.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 29.918.dp, defaultHeight =
                23.2148.dp, viewportWidth = 29.918f, viewportHeight = 23.2148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.4961f)
                curveTo(0.0f, 20.7656f, 2.9297f, 23.2148f, 6.5156f, 23.2148f)
                curveTo(10.0898f, 23.2148f, 13.0078f, 20.7656f, 13.0078f, 17.4961f)
                lineTo(13.0078f, 14.4961f)
                curveTo(13.582f, 14.2734f, 14.2734f, 14.1445f, 14.9648f, 14.1445f)
                curveTo(15.7266f, 14.1445f, 16.3828f, 14.2266f, 16.9102f, 14.4141f)
                lineTo(16.9102f, 17.4961f)
                curveTo(16.9102f, 20.7656f, 19.8281f, 23.2148f, 23.4023f, 23.2148f)
                curveTo(26.9766f, 23.2148f, 29.918f, 20.7656f, 29.918f, 17.4961f)
                curveTo(29.918f, 16.6406f, 29.7891f, 15.8438f, 29.3086f, 14.7305f)
                lineTo(24.4453f, 3.3867f)
                curveTo(23.7773f, 1.8633f, 22.3828f, 0.9727f, 20.625f, 0.9727f)
                curveTo(18.375f, 0.9727f, 16.9102f, 2.4023f, 16.9102f, 4.5469f)
                lineTo(16.9102f, 5.6836f)
                curveTo(16.3242f, 5.5313f, 15.6797f, 5.4492f, 14.9648f, 5.4492f)
                curveTo(14.2852f, 5.4492f, 13.6289f, 5.5547f, 13.0078f, 5.7539f)
                lineTo(13.0078f, 4.5469f)
                curveTo(13.0078f, 2.4023f, 11.543f, 0.9727f, 9.293f, 0.9727f)
                curveTo(7.5352f, 0.9727f, 6.1289f, 1.8633f, 5.4727f, 3.3867f)
                lineTo(0.5977f, 14.7305f)
                curveTo(0.1172f, 15.8438f, 0.0f, 16.6406f, 0.0f, 17.4961f)
                close()
                moveTo(1.8398f, 17.4961f)
                curveTo(1.8398f, 15.1406f, 3.8672f, 13.5352f, 6.5156f, 13.5352f)
                curveTo(9.1523f, 13.5352f, 11.25f, 15.1406f, 11.25f, 17.4961f)
                curveTo(11.25f, 19.8516f, 9.1523f, 21.457f, 6.5156f, 21.457f)
                curveTo(3.8672f, 21.457f, 1.8398f, 19.8516f, 1.8398f, 17.4961f)
                close()
                moveTo(18.668f, 17.4961f)
                curveTo(18.668f, 15.1406f, 20.7539f, 13.5352f, 23.4023f, 13.5352f)
                curveTo(26.0391f, 13.5352f, 28.0664f, 15.1406f, 28.0664f, 17.4961f)
                curveTo(28.0664f, 19.8516f, 26.0391f, 21.457f, 23.4023f, 21.457f)
                curveTo(20.7539f, 21.457f, 18.668f, 19.8516f, 18.668f, 17.4961f)
                close()
                moveTo(13.0078f, 10.9219f)
                lineTo(13.0078f, 9.3281f)
                curveTo(13.6289f, 9.1289f, 14.2852f, 9.0352f, 14.9648f, 9.0352f)
                curveTo(15.6797f, 9.0352f, 16.3242f, 9.1055f, 16.9102f, 9.2578f)
                lineTo(16.9102f, 10.8281f)
                curveTo(16.3828f, 10.6523f, 15.7383f, 10.5703f, 14.9648f, 10.5703f)
                curveTo(14.2734f, 10.5703f, 13.582f, 10.6992f, 13.0078f, 10.9219f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
