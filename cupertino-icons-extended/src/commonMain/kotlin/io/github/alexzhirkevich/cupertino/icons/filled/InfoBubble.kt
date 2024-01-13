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

public val CupertinoIcons.Filled.InfoBubble: ImageVector
    get() {
        if (_infoBubble != null) {
            return _infoBubble!!
        }
        _infoBubble = Builder(name = "InfoBubble", defaultWidth = 25.8281.dp, defaultHeight =
                25.8867.dp, viewportWidth = 25.8281f, viewportHeight = 25.8867f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9609f, 25.8867f)
                curveTo(7.418f, 25.8867f, 7.7578f, 25.6523f, 8.3086f, 25.1367f)
                lineTo(12.5391f, 21.2695f)
                lineTo(20.4609f, 21.2695f)
                curveTo(23.9531f, 21.2695f, 25.8281f, 19.3477f, 25.8281f, 15.9141f)
                lineTo(25.8281f, 6.9375f)
                curveTo(25.8281f, 3.5039f, 23.9531f, 1.5703f, 20.4609f, 1.5703f)
                lineTo(5.3672f, 1.5703f)
                curveTo(1.875f, 1.5703f, 0.0f, 3.4922f, 0.0f, 6.9375f)
                lineTo(0.0f, 15.9141f)
                curveTo(0.0f, 19.3594f, 1.875f, 21.2695f, 5.3672f, 21.2695f)
                lineTo(5.918f, 21.2695f)
                lineTo(5.918f, 24.6797f)
                curveTo(5.918f, 25.4062f, 6.293f, 25.8867f, 6.9609f, 25.8867f)
                close()
                moveTo(10.9688f, 17.707f)
                curveTo(10.5f, 17.707f, 10.1484f, 17.3672f, 10.1484f, 16.8984f)
                curveTo(10.1484f, 16.4648f, 10.5f, 16.1133f, 10.9688f, 16.1133f)
                lineTo(12.3516f, 16.1133f)
                lineTo(12.3516f, 11.0039f)
                lineTo(11.1562f, 11.0039f)
                curveTo(10.6992f, 11.0039f, 10.3359f, 10.6758f, 10.3359f, 10.207f)
                curveTo(10.3359f, 9.7734f, 10.6992f, 9.4219f, 11.1562f, 9.4219f)
                lineTo(13.2656f, 9.4219f)
                curveTo(13.8281f, 9.4219f, 14.1328f, 9.832f, 14.1328f, 10.4297f)
                lineTo(14.1328f, 16.1133f)
                lineTo(15.5156f, 16.1133f)
                curveTo(15.9844f, 16.1133f, 16.3359f, 16.4648f, 16.3359f, 16.8984f)
                curveTo(16.3359f, 17.3672f, 15.9844f, 17.707f, 15.5156f, 17.707f)
                close()
                moveTo(12.8203f, 7.5703f)
                curveTo(12.0117f, 7.5703f, 11.3555f, 6.9141f, 11.3555f, 6.0938f)
                curveTo(11.3555f, 5.2734f, 12.0117f, 4.6172f, 12.8203f, 4.6172f)
                curveTo(13.6406f, 4.6172f, 14.2852f, 5.2734f, 14.2852f, 6.0938f)
                curveTo(14.2852f, 6.9141f, 13.6406f, 7.5703f, 12.8203f, 7.5703f)
                close()
            }
        }
        .build()
        return _infoBubble!!
    }

private var _infoBubble: ImageVector? = null
