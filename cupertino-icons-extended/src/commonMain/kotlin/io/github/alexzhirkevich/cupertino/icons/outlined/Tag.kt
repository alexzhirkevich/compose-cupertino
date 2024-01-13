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

public val CupertinoIcons.Outlined.Tag: ImageVector
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
                moveTo(12.5537f, 24.6782f)
                curveTo(11.71f, 25.522f, 10.8194f, 25.5337f, 9.9639f, 24.6665f)
                lineTo(2.6865f, 17.4009f)
                curveTo(1.8311f, 16.5454f, 1.8428f, 15.6431f, 2.6748f, 14.811f)
                lineTo(14.0537f, 3.4556f)
                curveTo(14.2881f, 3.2212f, 14.5342f, 3.0689f, 14.9326f, 3.0689f)
                lineTo(19.8662f, 3.0689f)
                curveTo(20.2295f, 3.0689f, 20.4756f, 3.2095f, 20.7217f, 3.4556f)
                lineTo(23.9209f, 6.6431f)
                curveTo(24.167f, 6.8892f, 24.2959f, 7.1353f, 24.2959f, 7.4985f)
                lineTo(24.2959f, 12.4439f)
                curveTo(24.2959f, 12.8306f, 24.1553f, 13.0767f, 23.9209f, 13.311f)
                close()
                moveTo(18.4248f, 10.5571f)
                curveTo(19.3389f, 10.5571f, 20.0303f, 9.8423f, 20.0303f, 8.9517f)
                curveTo(20.0303f, 8.0493f, 19.3389f, 7.3462f, 18.4248f, 7.3462f)
                curveTo(17.499f, 7.3462f, 16.8194f, 8.0493f, 16.8194f, 8.9517f)
                curveTo(16.8194f, 9.8423f, 17.499f, 10.5571f, 18.4248f, 10.5571f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
