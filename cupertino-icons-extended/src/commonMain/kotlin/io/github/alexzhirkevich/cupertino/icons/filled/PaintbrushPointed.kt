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

public val CupertinoIcons.Filled.PaintbrushPointed: ImageVector
    get() {
        if (_paintbrushPointed != null) {
            return _paintbrushPointed!!
        }
        _paintbrushPointed = Builder(name = "PaintbrushPointed", defaultWidth = 25.4409.dp,
                defaultHeight = 23.8615.dp, viewportWidth = 25.4409f, viewportHeight =
                23.8615f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2583f, 21.0069f)
                curveTo(2.2153f, 23.8194f, 6.5395f, 24.7804f, 9.3052f, 22.8585f)
                curveTo(11.6958f, 21.1944f, 12.2231f, 18.6163f, 10.6411f, 16.3663f)
                curveTo(9.2231f, 14.3272f, 6.6567f, 13.753f, 4.9692f, 14.9601f)
                curveTo(3.0239f, 16.3429f, 3.8091f, 18.2413f, 2.6138f, 19.0851f)
                curveTo(1.6177f, 19.7999f, 0.9263f, 19.3546f, 0.352f, 19.7413f)
                curveTo(-0.023f, 19.9757f, -0.1636f, 20.421f, 0.2583f, 21.0069f)
                close()
                moveTo(11.0864f, 14.6319f)
                curveTo(11.9419f, 15.4874f, 12.5864f, 16.6241f, 12.7388f, 17.5499f)
                curveTo(13.688f, 17.3976f, 14.4497f, 16.9522f, 15.2466f, 16.1554f)
                curveTo(15.3755f, 16.0382f, 15.4927f, 15.9093f, 15.6099f, 15.7686f)
                curveTo(15.0942f, 12.9444f, 12.7388f, 10.6241f, 9.9614f, 10.1085f)
                curveTo(9.8208f, 10.2257f, 9.6919f, 10.3546f, 9.563f, 10.4835f)
                curveTo(8.7661f, 11.2804f, 8.3325f, 12.0655f, 8.1802f, 12.9913f)
                curveTo(9.0942f, 13.1436f, 10.2427f, 13.7765f, 11.0864f, 14.6319f)
                close()
                moveTo(22.1372f, 0.6983f)
                curveTo(21.5395f, 1.1319f, 15.0239f, 5.5968f, 11.0278f, 9.1241f)
                curveTo(13.6763f, 9.9562f, 15.7505f, 12.0186f, 16.5942f, 14.7022f)
                curveTo(20.145f, 10.7061f, 24.5981f, 4.2022f, 25.0317f, 3.5929f)
                curveTo(26.4145f, 1.6593f, 24.0005f, -0.6845f, 22.1372f, 0.6983f)
                close()
            }
        }
        .build()
        return _paintbrushPointed!!
    }

private var _paintbrushPointed: ImageVector? = null
