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

public val CupertinoIcons.Outlined.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.832.dp, defaultHeight = 22.2305.dp,
                viewportWidth = 24.832f, viewportHeight = 22.2305f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.2852f)
                curveTo(0.0f, 14.0273f, 5.2383f, 19.7695f, 13.3008f, 19.7695f)
                curveTo(18.9258f, 19.7695f, 22.9102f, 16.1367f, 22.9102f, 11.0039f)
                curveTo(22.9102f, 6.0703f, 18.8906f, 2.5078f, 13.3477f, 2.5078f)
                curveTo(11.4375f, 2.5078f, 9.5039f, 3.0469f, 7.3594f, 3.0469f)
                curveTo(5.5547f, 3.0469f, 3.9961f, 2.4961f, 2.707f, 1.0313f)
                curveTo(2.0273f, 0.2344f, 0.6797f, 0.1641f, 0.3516f, 1.5117f)
                curveTo(0.0703f, 2.6484f, 0.0f, 4.6523f, 0.0f, 5.2852f)
                close()
                moveTo(1.7695f, 5.2852f)
                curveTo(1.7695f, 4.5117f, 1.7813f, 3.6445f, 1.8867f, 3.0117f)
                curveTo(1.9102f, 2.8594f, 1.9922f, 2.8477f, 2.0977f, 2.9414f)
                curveTo(3.4102f, 4.1367f, 5.4727f, 4.8164f, 7.3594f, 4.8164f)
                curveTo(8.625f, 4.8164f, 9.7734f, 4.6523f, 10.8047f, 4.5117f)
                curveTo(11.7422f, 4.3828f, 12.5625f, 4.2773f, 13.3477f, 4.2773f)
                curveTo(17.918f, 4.2773f, 21.1406f, 7.0781f, 21.1406f, 11.0039f)
                curveTo(21.1406f, 15.1406f, 17.9414f, 18.0f, 13.3008f, 18.0f)
                curveTo(6.2344f, 18.0f, 1.7695f, 13.0547f, 1.7695f, 5.2852f)
                close()
                moveTo(6.8555f, 8.0156f)
                curveTo(7.5938f, 10.3008f, 9.8086f, 11.2148f, 12.5742f, 11.8945f)
                curveTo(16.5469f, 12.8438f, 18.3633f, 13.6172f, 19.957f, 15.6094f)
                curveTo(21.2578f, 17.2148f, 21.5742f, 19.1484f, 22.3008f, 21.4688f)
                curveTo(22.4766f, 22.0312f, 22.8633f, 22.2305f, 23.2734f, 22.2305f)
                curveTo(24.1406f, 22.2305f, 24.832f, 21.4219f, 24.832f, 20.4492f)
                curveTo(24.832f, 18.832f, 22.9922f, 16.0312f, 21.7617f, 14.3555f)
                curveTo(20.1797f, 12.2578f, 17.4727f, 11.0508f, 13.1719f, 10.3594f)
                curveTo(10.9453f, 9.9844f, 8.9766f, 9.3984f, 7.6289f, 7.6406f)
                curveTo(7.2539f, 7.1367f, 6.6797f, 7.4883f, 6.8555f, 8.0156f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
