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

public val CupertinoIcons.Outlined.Applepencil: ImageVector
    get() {
        if (_applepencil != null) {
            return _applepencil!!
        }
        _applepencil = Builder(name = "Applepencil", defaultWidth = 18.6643.dp, defaultHeight =
                19.0064.dp, viewportWidth = 18.6643f, viewportHeight = 19.0064f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0462f, 18.4739f)
                curveTo(-0.1296f, 18.8137f, 0.2337f, 19.1184f, 0.5149f, 18.9661f)
                lineTo(2.2727f, 18.052f)
                lineTo(0.9954f, 16.7747f)
                close()
                moveTo(1.5344f, 15.7903f)
                lineTo(3.2805f, 17.5364f)
                lineTo(3.9719f, 17.1731f)
                lineTo(18.2337f, 2.9817f)
                curveTo(18.8079f, 2.4075f, 18.8079f, 1.4817f, 18.2337f, 0.9192f)
                curveTo(17.6594f, 0.3567f, 16.7454f, 0.3567f, 16.1829f, 0.9075f)
                lineTo(1.9094f, 15.1106f)
                close()
            }
        }
        .build()
        return _applepencil!!
    }

private var _applepencil: ImageVector? = null
