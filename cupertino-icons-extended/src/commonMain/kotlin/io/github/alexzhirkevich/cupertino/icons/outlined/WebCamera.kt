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

public val CupertinoIcons.Outlined.WebCamera: ImageVector
    get() {
        if (_webCamera != null) {
            return _webCamera!!
        }
        _webCamera = Builder(name = "WebCamera", defaultWidth = 18.832.dp, defaultHeight =
                23.6367.dp, viewportWidth = 18.832f, viewportHeight = 23.6367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4219f, 18.8555f)
                curveTo(14.6133f, 18.8555f, 18.832f, 14.6367f, 18.832f, 9.4219f)
                curveTo(18.832f, 4.2188f, 14.6133f, 0.0f, 9.4219f, 0.0f)
                curveTo(4.2188f, 0.0f, 0.0f, 4.2188f, 0.0f, 9.4219f)
                curveTo(0.0f, 14.6367f, 4.2188f, 18.8555f, 9.4219f, 18.8555f)
                close()
                moveTo(9.4219f, 16.9688f)
                curveTo(5.2031f, 16.9688f, 1.8867f, 13.6523f, 1.8867f, 9.4219f)
                curveTo(1.8867f, 5.1914f, 5.2031f, 1.8867f, 9.4219f, 1.8867f)
                curveTo(13.6406f, 1.8867f, 16.9453f, 5.1914f, 16.9453f, 9.4219f)
                curveTo(16.9453f, 13.6523f, 13.6406f, 16.9688f, 9.4219f, 16.9688f)
                close()
                moveTo(8.4844f, 22.6758f)
                lineTo(10.3711f, 22.6758f)
                lineTo(10.3711f, 17.9883f)
                lineTo(8.4844f, 17.9883f)
                close()
                moveTo(5.3203f, 23.6133f)
                lineTo(13.5234f, 23.6133f)
                curveTo(14.0391f, 23.6133f, 14.4609f, 23.1914f, 14.4609f, 22.6758f)
                curveTo(14.4609f, 22.1602f, 14.0391f, 21.7266f, 13.5234f, 21.7266f)
                lineTo(5.332f, 21.7266f)
                curveTo(4.8164f, 21.7266f, 4.3828f, 22.1602f, 4.3828f, 22.6758f)
                curveTo(4.3828f, 23.1914f, 4.8047f, 23.6133f, 5.3203f, 23.6133f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4219f, 14.8945f)
                curveTo(12.4805f, 14.8945f, 14.8711f, 12.4805f, 14.8711f, 9.4219f)
                curveTo(14.8711f, 6.375f, 12.4805f, 3.9609f, 9.4219f, 3.9609f)
                curveTo(6.375f, 3.9609f, 3.9609f, 6.375f, 3.9609f, 9.4219f)
                curveTo(3.9609f, 12.4805f, 6.375f, 14.8945f, 9.4219f, 14.8945f)
                close()
                moveTo(9.4219f, 11.9648f)
                curveTo(8.0039f, 11.9648f, 6.8789f, 10.8398f, 6.8789f, 9.4219f)
                curveTo(6.8789f, 8.0039f, 8.0039f, 6.8789f, 9.4219f, 6.8789f)
                curveTo(10.8398f, 6.8789f, 11.9531f, 8.0039f, 11.9531f, 9.4219f)
                curveTo(11.9531f, 10.8398f, 10.8398f, 11.9648f, 9.4219f, 11.9648f)
                close()
            }
        }
        .build()
        return _webCamera!!
    }

private var _webCamera: ImageVector? = null
