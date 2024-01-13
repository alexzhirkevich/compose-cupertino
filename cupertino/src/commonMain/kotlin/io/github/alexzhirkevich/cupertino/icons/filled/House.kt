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

public val CupertinoIcons.Filled.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 27.9727.dp, defaultHeight = 26.5957.dp,
                viewportWidth = 27.9727f, viewportHeight = 26.5957f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0039f, 22.7256f)
                lineTo(10.957f, 22.7256f)
                lineTo(10.957f, 14.9795f)
                curveTo(10.957f, 14.4404f, 11.3203f, 14.0889f, 11.8594f, 14.0889f)
                lineTo(16.1133f, 14.0889f)
                curveTo(16.6523f, 14.0889f, 17.0039f, 14.4404f, 17.0039f, 14.9795f)
                close()
                moveTo(3.6563f, 22.0225f)
                curveTo(3.6563f, 23.6514f, 4.6406f, 24.6123f, 6.293f, 24.6123f)
                lineTo(21.7031f, 24.6123f)
                curveTo(23.3555f, 24.6123f, 24.3281f, 23.6514f, 24.3281f, 22.0225f)
                lineTo(24.3281f, 12.7412f)
                lineTo(14.6953f, 4.667f)
                curveTo(14.25f, 4.292f, 13.7227f, 4.3037f, 13.2891f, 4.667f)
                lineTo(3.6563f, 12.7412f)
                close()
                moveTo(0.0f, 11.5693f)
                curveTo(0.0f, 12.0498f, 0.375f, 12.5068f, 1.0078f, 12.5068f)
                curveTo(1.3359f, 12.5068f, 1.6055f, 12.3311f, 1.8516f, 12.1318f)
                lineTo(13.582f, 2.2881f)
                curveTo(13.8398f, 2.0537f, 14.1562f, 2.0537f, 14.4141f, 2.2881f)
                lineTo(26.1445f, 12.1318f)
                curveTo(26.3789f, 12.3311f, 26.6484f, 12.5068f, 26.9766f, 12.5068f)
                curveTo(27.5273f, 12.5068f, 27.9727f, 12.167f, 27.9727f, 11.6045f)
                curveTo(27.9727f, 11.2529f, 27.8555f, 11.0186f, 27.6094f, 10.8076f)
                lineTo(15.4102f, 0.5537f)
                curveTo(14.543f, -0.1846f, 13.4648f, -0.1846f, 12.5859f, 0.5537f)
                lineTo(0.375f, 10.8076f)
                curveTo(0.1172f, 11.0186f, 0.0f, 11.2998f, 0.0f, 11.5693f)
                close()
                moveTo(21.3867f, 6.2842f)
                lineTo(24.3281f, 8.7685f)
                lineTo(24.3281f, 3.3545f)
                curveTo(24.3281f, 2.8389f, 24.0f, 2.5107f, 23.4844f, 2.5107f)
                lineTo(22.2305f, 2.5107f)
                curveTo(21.7266f, 2.5107f, 21.3867f, 2.8389f, 21.3867f, 3.3545f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
