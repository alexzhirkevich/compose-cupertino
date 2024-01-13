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

public val CupertinoIcons.Outlined.Hryvniasign: ImageVector
    get() {
        if (_hryvniasign != null) {
            return _hryvniasign!!
        }
        _hryvniasign = Builder(name = "Hryvniasign", defaultWidth = 16.3477.dp, defaultHeight =
                21.6211.dp, viewportWidth = 16.3477f, viewportHeight = 21.6211f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0742f, 0.0f)
                curveTo(5.6719f, 0.0f, 3.4805f, 0.9375f, 2.3555f, 2.9531f)
                curveTo(2.0742f, 3.375f, 1.9102f, 3.7852f, 1.8984f, 4.2773f)
                curveTo(1.8984f, 4.8398f, 2.25f, 5.2617f, 2.8945f, 5.2617f)
                curveTo(3.3164f, 5.2617f, 3.6563f, 5.0859f, 3.9023f, 4.5117f)
                curveTo(4.582f, 2.8359f, 6.2578f, 1.9688f, 8.1445f, 1.9688f)
                curveTo(10.5117f, 1.9688f, 12.4922f, 3.1523f, 12.4922f, 5.3438f)
                curveTo(12.4922f, 6.3281f, 11.9648f, 7.4414f, 10.793f, 7.9453f)
                lineTo(13.2773f, 7.9453f)
                curveTo(14.168f, 7.2422f, 14.6484f, 6.2344f, 14.6484f, 5.2031f)
                curveTo(14.6484f, 1.875f, 11.6484f, 0.0f, 8.0742f, 0.0f)
                close()
                moveTo(0.75f, 9.2109f)
                lineTo(15.5859f, 9.2109f)
                curveTo(16.0312f, 9.2109f, 16.3477f, 8.8711f, 16.3477f, 8.4492f)
                curveTo(16.3477f, 8.0039f, 16.0312f, 7.6875f, 15.5859f, 7.6875f)
                lineTo(0.75f, 7.6875f)
                curveTo(0.3281f, 7.6875f, 0.0f, 8.0039f, 0.0f, 8.4492f)
                curveTo(0.0f, 8.8711f, 0.3281f, 9.2109f, 0.75f, 9.2109f)
                close()
                moveTo(0.75f, 13.3008f)
                lineTo(15.5859f, 13.3008f)
                curveTo(16.0312f, 13.3008f, 16.3477f, 12.9609f, 16.3477f, 12.5391f)
                curveTo(16.3477f, 12.0938f, 16.0312f, 11.7773f, 15.5859f, 11.7773f)
                lineTo(0.75f, 11.7773f)
                curveTo(0.3281f, 11.7773f, 0.0f, 12.0938f, 0.0f, 12.5391f)
                curveTo(0.0f, 12.9609f, 0.3281f, 13.3008f, 0.75f, 13.3008f)
                close()
                moveTo(8.1914f, 21.6094f)
                curveTo(11.2617f, 21.6094f, 13.5f, 20.3203f, 14.543f, 18.2812f)
                curveTo(14.8125f, 17.8594f, 15.0f, 17.4609f, 15.0f, 16.9453f)
                curveTo(15.0f, 16.3711f, 14.5898f, 15.9727f, 14.0156f, 15.9727f)
                curveTo(13.4297f, 15.9727f, 13.1367f, 16.2773f, 12.9258f, 16.7344f)
                curveTo(12.1758f, 18.668f, 10.5469f, 19.6406f, 8.1328f, 19.6406f)
                curveTo(5.2969f, 19.6406f, 3.4922f, 18.082f, 3.4922f, 16.2305f)
                curveTo(3.4922f, 14.9297f, 4.1836f, 13.6992f, 5.918f, 13.0078f)
                lineTo(3.2695f, 13.0078f)
                curveTo(2.0508f, 13.7344f, 1.3242f, 14.9648f, 1.3242f, 16.3242f)
                curveTo(1.3242f, 19.2539f, 3.9844f, 21.6094f, 8.1914f, 21.6094f)
                close()
            }
        }
        .build()
        return _hryvniasign!!
    }

private var _hryvniasign: ImageVector? = null
