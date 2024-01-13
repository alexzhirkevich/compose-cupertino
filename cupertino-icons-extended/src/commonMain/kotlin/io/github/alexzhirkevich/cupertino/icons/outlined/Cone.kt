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

public val CupertinoIcons.Outlined.Cone: ImageVector
    get() {
        if (_cone != null) {
            return _cone!!
        }
        _cone = Builder(name = "Cone", defaultWidth = 23.5781.dp, defaultHeight = 25.6758.dp,
                viewportWidth = 23.5781f, viewportHeight = 25.6758f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.8594f)
                curveTo(0.0f, 23.6367f, 4.957f, 25.6758f, 11.7891f, 25.6758f)
                curveTo(18.6211f, 25.6758f, 23.5781f, 23.6367f, 23.5781f, 20.8594f)
                curveTo(23.5781f, 20.4844f, 23.4023f, 19.9219f, 23.1328f, 19.418f)
                lineTo(12.8906f, 0.8672f)
                curveTo(12.5742f, 0.293f, 12.1758f, 0.1875f, 11.7891f, 0.1875f)
                curveTo(11.4023f, 0.1875f, 11.0039f, 0.293f, 10.6875f, 0.8672f)
                lineTo(0.4453f, 19.418f)
                curveTo(0.1758f, 19.9219f, 0.0f, 20.4844f, 0.0f, 20.8594f)
                close()
                moveTo(1.8281f, 20.8594f)
                curveTo(1.8281f, 20.7305f, 1.957f, 20.4609f, 2.1094f, 20.1914f)
                lineTo(11.5781f, 3.0938f)
                curveTo(11.625f, 2.9883f, 11.6953f, 2.9531f, 11.7891f, 2.9531f)
                curveTo(11.8828f, 2.9531f, 11.9531f, 2.9883f, 12.0f, 3.0938f)
                lineTo(21.4688f, 20.1914f)
                curveTo(21.6211f, 20.4609f, 21.75f, 20.7305f, 21.75f, 20.8594f)
                curveTo(21.75f, 22.2773f, 17.0625f, 23.8359f, 11.7891f, 23.8359f)
                curveTo(6.5156f, 23.8359f, 1.8281f, 22.2773f, 1.8281f, 20.8594f)
                close()
            }
        }
        .build()
        return _cone!!
    }

private var _cone: ImageVector? = null
