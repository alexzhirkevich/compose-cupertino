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

public val CupertinoIcons.Filled.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 19.4912.dp, defaultHeight =
                26.3788.dp, viewportWidth = 19.4912f, viewportHeight = 26.3788f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0635f, 25.6992f)
                lineTo(12.4189f, 18.9843f)
                lineTo(4.2158f, 10.7812f)
                lineTo(1.8135f, 13.7929f)
                curveTo(1.6143f, 14.0507f, 1.4971f, 14.2851f, 1.4971f, 14.5429f)
                curveTo(1.4971f, 15.0f, 1.8486f, 15.3398f, 2.3408f, 15.3398f)
                lineTo(8.7744f, 15.4336f)
                lineTo(5.4697f, 24.832f)
                curveTo(5.0479f, 26.039f, 6.2666f, 26.6836f, 7.0635f, 25.6992f)
                close()
                moveTo(15.2783f, 15.4101f)
                lineTo(17.7041f, 12.3867f)
                curveTo(17.9033f, 12.1406f, 18.0088f, 11.9062f, 18.0088f, 11.6367f)
                curveTo(18.0088f, 11.1914f, 17.6689f, 10.8515f, 17.1768f, 10.8398f)
                lineTo(10.7314f, 10.7461f)
                lineTo(14.0479f, 1.3476f)
                curveTo(14.4697f, 0.1289f, 13.251f, -0.5039f, 12.4541f, 0.4922f)
                lineTo(7.0752f, 7.2187f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9502f, 22.5703f)
                curveTo(18.3018f, 22.9218f, 18.8877f, 22.9218f, 19.2275f, 22.5703f)
                curveTo(19.5791f, 22.2304f, 19.5791f, 21.6562f, 19.2275f, 21.2929f)
                lineTo(1.5439f, 3.6093f)
                curveTo(1.1924f, 3.2578f, 0.5947f, 3.2578f, 0.2549f, 3.6093f)
                curveTo(-0.085f, 3.9492f, -0.085f, 4.5468f, 0.2549f, 4.8867f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
