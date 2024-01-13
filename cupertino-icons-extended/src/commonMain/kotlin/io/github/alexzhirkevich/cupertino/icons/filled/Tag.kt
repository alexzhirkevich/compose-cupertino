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

public val CupertinoIcons.Filled.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 26.1826.dp, defaultHeight = 27.3604.dp,
                viewportWidth = 26.1826f, viewportHeight = 27.3604f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8194f, 26.0962f)
                lineTo(25.2451f, 14.647f)
                curveTo(26.124f, 13.7681f, 26.1826f, 13.2642f, 26.1826f, 12.0337f)
                lineTo(26.1826f, 7.5806f)
                curveTo(26.1826f, 6.3384f, 25.8897f, 5.9517f, 24.999f, 5.061f)
                lineTo(22.3037f, 2.3657f)
                curveTo(21.4248f, 1.4868f, 21.0381f, 1.1821f, 19.7959f, 1.1821f)
                lineTo(15.3311f, 1.1821f)
                curveTo(14.1006f, 1.1821f, 13.6084f, 1.2407f, 12.7295f, 2.1196f)
                lineTo(1.2686f, 13.5571f)
                curveTo(-0.4072f, 15.2329f, -0.4424f, 16.9673f, 1.2803f, 18.6782f)
                lineTo(8.6983f, 26.0845f)
                curveTo(10.4209f, 27.7954f, 12.1436f, 27.772f, 13.8194f, 26.0962f)
                close()
                moveTo(17.8272f, 10.5571f)
                curveTo(16.9014f, 10.5571f, 16.2217f, 9.8423f, 16.2217f, 8.9517f)
                curveTo(16.2217f, 8.0493f, 16.9014f, 7.3462f, 17.8272f, 7.3462f)
                curveTo(18.7412f, 7.3462f, 19.4326f, 8.0493f, 19.4326f, 8.9517f)
                curveTo(19.4326f, 9.8423f, 18.7412f, 10.5571f, 17.8272f, 10.5571f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
