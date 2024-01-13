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

public val CupertinoIcons.Filled.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.8789.dp, defaultHeight = 24.9023.dp,
                viewportWidth = 24.8789f, viewportHeight = 24.9023f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.6719f)
                curveTo(0.0f, 6.375f, 0.4688f, 6.832f, 1.1953f, 6.832f)
                lineTo(2.6484f, 6.832f)
                lineTo(2.6484f, 3.0469f)
                curveTo(2.6484f, 2.3086f, 2.0273f, 1.7578f, 1.3242f, 1.7578f)
                curveTo(0.6211f, 1.7461f, 0.0f, 2.2969f, 0.0f, 3.0469f)
                close()
                moveTo(3.0352f, 0.0f)
                curveTo(3.9492f, 0.5156f, 4.2422f, 1.207f, 4.2422f, 2.4609f)
                lineTo(4.2422f, 21.832f)
                curveTo(4.2422f, 23.4844f, 5.1914f, 24.4336f, 6.6328f, 24.4336f)
                curveTo(7.9688f, 24.4336f, 8.8594f, 23.5195f, 8.8594f, 21.9258f)
                lineTo(8.8594f, 18.6914f)
                curveTo(8.8594f, 17.0977f, 9.5859f, 16.2773f, 11.1914f, 16.2773f)
                lineTo(22.4766f, 16.2773f)
                lineTo(22.4766f, 3.6797f)
                curveTo(22.4766f, 1.2305f, 21.2578f, 0.0f, 18.8438f, 0.0f)
                close()
                moveTo(8.7656f, 6.1172f)
                curveTo(8.7656f, 5.7188f, 9.082f, 5.4023f, 9.5039f, 5.4023f)
                lineTo(17.5664f, 5.4023f)
                curveTo(17.9883f, 5.4023f, 18.293f, 5.7188f, 18.293f, 6.1172f)
                curveTo(18.293f, 6.5273f, 17.9883f, 6.8438f, 17.5664f, 6.8438f)
                lineTo(9.5039f, 6.8438f)
                curveTo(9.082f, 6.8438f, 8.7656f, 6.5273f, 8.7656f, 6.1172f)
                close()
                moveTo(8.7656f, 10.2305f)
                curveTo(8.7656f, 9.8203f, 9.082f, 9.4922f, 9.5039f, 9.4922f)
                lineTo(13.7109f, 9.4922f)
                curveTo(14.1328f, 9.4922f, 14.4375f, 9.8203f, 14.4375f, 10.2305f)
                curveTo(14.4375f, 10.6289f, 14.1328f, 10.9336f, 13.7109f, 10.9336f)
                lineTo(9.5039f, 10.9336f)
                curveTo(9.082f, 10.9336f, 8.7656f, 10.6289f, 8.7656f, 10.2305f)
                close()
                moveTo(9.3398f, 24.8906f)
                lineTo(21.1875f, 24.8906f)
                curveTo(23.4141f, 24.8906f, 24.8789f, 23.3672f, 24.8789f, 21.0586f)
                lineTo(24.8789f, 19.043f)
                curveTo(24.8789f, 18.3398f, 24.4102f, 17.8711f, 23.6836f, 17.8711f)
                lineTo(11.6602f, 17.8711f)
                curveTo(10.9336f, 17.8711f, 10.4531f, 18.3398f, 10.4531f, 19.043f)
                lineTo(10.4531f, 21.3398f)
                curveTo(10.4531f, 22.6875f, 10.2773f, 23.8828f, 9.3398f, 24.8906f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
