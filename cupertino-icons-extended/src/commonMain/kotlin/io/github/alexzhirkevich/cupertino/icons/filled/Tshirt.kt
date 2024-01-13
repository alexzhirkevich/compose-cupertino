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

public val CupertinoIcons.Filled.Tshirt: ImageVector
    get() {
        if (_tshirt != null) {
            return _tshirt!!
        }
        _tshirt = Builder(name = "Tshirt", defaultWidth = 30.8566.dp, defaultHeight = 25.582.dp,
                viewportWidth = 30.8566f, viewportHeight = 25.582f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4671f, 25.582f)
                lineTo(21.385f, 25.582f)
                curveTo(23.553f, 25.582f, 24.6077f, 24.5391f, 24.6428f, 22.3828f)
                lineTo(24.7952f, 10.875f)
                lineTo(27.6663f, 11.5312f)
                curveTo(28.7561f, 11.7773f, 29.4593f, 11.332f, 29.7288f, 10.207f)
                lineTo(30.7718f, 6.0469f)
                curveTo(31.053f, 4.9336f, 30.6311f, 4.1602f, 29.5647f, 3.7148f)
                lineTo(21.3147f, 0.1992f)
                curveTo(20.846f, -0.0117f, 20.4124f, 0.0f, 19.9788f, 0.2109f)
                curveTo(18.4319f, 0.9492f, 17.178f, 1.3242f, 15.4319f, 1.3242f)
                curveTo(13.6741f, 1.3242f, 12.4202f, 0.9492f, 10.8733f, 0.2109f)
                curveTo(10.4397f, 0.0f, 10.0061f, -0.0117f, 9.5374f, 0.1992f)
                lineTo(1.2874f, 3.7148f)
                curveTo(0.221f, 4.1602f, -0.1892f, 4.9336f, 0.0803f, 6.0469f)
                lineTo(1.1233f, 10.207f)
                curveTo(1.3929f, 11.332f, 2.096f, 11.7773f, 3.1858f, 11.5312f)
                lineTo(6.0686f, 10.875f)
                lineTo(6.2092f, 22.3828f)
                curveTo(6.2444f, 24.5391f, 7.2991f, 25.582f, 9.4671f, 25.582f)
                close()
                moveTo(15.4319f, 4.9805f)
                curveTo(13.428f, 4.9805f, 12.0218f, 3.9492f, 11.4241f, 2.25f)
                curveTo(12.6546f, 2.7188f, 14.0374f, 2.9766f, 15.4319f, 2.9766f)
                curveTo(16.8147f, 2.9766f, 18.2093f, 2.7188f, 19.428f, 2.25f)
                curveTo(18.8421f, 3.9258f, 17.4593f, 4.9805f, 15.4319f, 4.9805f)
                close()
            }
        }
        .build()
        return _tshirt!!
    }

private var _tshirt: ImageVector? = null
