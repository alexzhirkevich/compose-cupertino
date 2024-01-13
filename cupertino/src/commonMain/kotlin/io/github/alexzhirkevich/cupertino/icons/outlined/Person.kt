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

public val CupertinoIcons.Outlined.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 20.4727.dp, defaultHeight = 22.0898.dp,
                viewportWidth = 20.4727f, viewportHeight = 22.0898f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8711f, 22.0898f)
                lineTo(17.6016f, 22.0898f)
                curveTo(19.5469f, 22.0898f, 20.4727f, 21.5039f, 20.4727f, 20.2148f)
                curveTo(20.4727f, 17.1445f, 16.5938f, 12.7031f, 10.2422f, 12.7031f)
                curveTo(3.8789f, 12.7031f, 0.0f, 17.1445f, 0.0f, 20.2148f)
                curveTo(0.0f, 21.5039f, 0.9258f, 22.0898f, 2.8711f, 22.0898f)
                close()
                moveTo(2.3203f, 20.3203f)
                curveTo(2.0156f, 20.3203f, 1.8867f, 20.2383f, 1.8867f, 19.9922f)
                curveTo(1.8867f, 18.0703f, 4.8633f, 14.4727f, 10.2422f, 14.4727f)
                curveTo(15.6094f, 14.4727f, 18.5859f, 18.0703f, 18.5859f, 19.9922f)
                curveTo(18.5859f, 20.2383f, 18.4688f, 20.3203f, 18.1641f, 20.3203f)
                close()
                moveTo(10.2422f, 11.25f)
                curveTo(13.0312f, 11.25f, 15.3047f, 8.7656f, 15.3047f, 5.7422f)
                curveTo(15.3047f, 2.7422f, 13.043f, 0.3867f, 10.2422f, 0.3867f)
                curveTo(7.4648f, 0.3867f, 5.1797f, 2.7891f, 5.1797f, 5.7656f)
                curveTo(5.1914f, 8.7773f, 7.4531f, 11.25f, 10.2422f, 11.25f)
                close()
                moveTo(10.2422f, 9.4805f)
                curveTo(8.5313f, 9.4805f, 7.0664f, 7.8398f, 7.0664f, 5.7656f)
                curveTo(7.0664f, 3.7266f, 8.5078f, 2.1563f, 10.2422f, 2.1563f)
                curveTo(11.9883f, 2.1563f, 13.418f, 3.7031f, 13.418f, 5.7422f)
                curveTo(13.418f, 7.8164f, 11.9648f, 9.4805f, 10.2422f, 9.4805f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
