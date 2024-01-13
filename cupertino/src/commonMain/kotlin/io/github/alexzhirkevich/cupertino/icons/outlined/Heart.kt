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

public val CupertinoIcons.Outlined.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 23.2734.dp, defaultHeight = 22.2305.dp,
                viewportWidth = 23.2734f, viewportHeight = 22.2305f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.793f)
                curveTo(0.0f, 12.7852f, 4.1836f, 17.6953f, 10.793f, 21.9141f)
                curveTo(11.0391f, 22.0664f, 11.3906f, 22.2305f, 11.6367f, 22.2305f)
                curveTo(11.8828f, 22.2305f, 12.2344f, 22.0664f, 12.4922f, 21.9141f)
                curveTo(19.0898f, 17.6953f, 23.2734f, 12.7852f, 23.2734f, 7.793f)
                curveTo(23.2734f, 3.6445f, 20.4258f, 0.7148f, 16.6289f, 0.7148f)
                curveTo(14.4609f, 0.7148f, 12.7031f, 1.7461f, 11.6367f, 3.3281f)
                curveTo(10.5938f, 1.7578f, 8.8125f, 0.7148f, 6.6445f, 0.7148f)
                curveTo(2.8477f, 0.7148f, 0.0f, 3.6445f, 0.0f, 7.793f)
                close()
                moveTo(1.8867f, 7.793f)
                curveTo(1.8867f, 4.6758f, 3.9023f, 2.6016f, 6.6211f, 2.6016f)
                curveTo(8.8242f, 2.6016f, 10.0898f, 3.9727f, 10.8398f, 5.1445f)
                curveTo(11.1562f, 5.6133f, 11.3555f, 5.7422f, 11.6367f, 5.7422f)
                curveTo(11.918f, 5.7422f, 12.0938f, 5.6016f, 12.4336f, 5.1445f)
                curveTo(13.2422f, 3.9961f, 14.4609f, 2.6016f, 16.6523f, 2.6016f)
                curveTo(19.3711f, 2.6016f, 21.3867f, 4.6758f, 21.3867f, 7.793f)
                curveTo(21.3867f, 12.1523f, 16.7812f, 16.8516f, 11.8828f, 20.1094f)
                curveTo(11.7656f, 20.1914f, 11.6836f, 20.25f, 11.6367f, 20.25f)
                curveTo(11.5898f, 20.25f, 11.5078f, 20.1914f, 11.4023f, 20.1094f)
                curveTo(6.4922f, 16.8516f, 1.8867f, 12.1523f, 1.8867f, 7.793f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
