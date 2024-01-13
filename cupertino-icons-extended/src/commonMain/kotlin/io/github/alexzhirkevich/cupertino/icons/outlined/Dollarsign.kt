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

public val CupertinoIcons.Outlined.Dollarsign: ImageVector
    get() {
        if (_dollarsign != null) {
            return _dollarsign!!
        }
        _dollarsign = Builder(name = "Dollarsign", defaultWidth = 14.7539.dp, defaultHeight =
                26.543.dp, viewportWidth = 14.7539f, viewportHeight = 26.543f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4414f, 23.7188f)
                curveTo(11.4023f, 23.7188f, 14.7539f, 21.6562f, 14.7539f, 17.8945f)
                curveTo(14.7539f, 15.0f, 12.9023f, 13.2773f, 8.7656f, 12.2812f)
                lineTo(6.5391f, 11.7539f)
                curveTo(3.9258f, 11.1328f, 2.7188f, 10.043f, 2.7188f, 8.332f)
                curveTo(2.7188f, 6.4922f, 4.4648f, 4.9102f, 7.4297f, 4.9102f)
                curveTo(9.8555f, 4.9102f, 11.5195f, 6.0469f, 12.1641f, 8.1445f)
                curveTo(12.3516f, 8.7539f, 12.75f, 9.0703f, 13.3359f, 9.0703f)
                curveTo(14.0273f, 9.0703f, 14.4141f, 8.625f, 14.4141f, 7.9453f)
                curveTo(14.4141f, 7.7578f, 14.3906f, 7.5586f, 14.332f, 7.3477f)
                curveTo(13.6289f, 4.6406f, 10.8867f, 2.8359f, 7.4297f, 2.8359f)
                curveTo(3.3516f, 2.8359f, 0.4336f, 5.1328f, 0.4336f, 8.4727f)
                curveTo(0.4336f, 11.2383f, 2.2617f, 12.9727f, 6.1875f, 13.9219f)
                lineTo(8.4141f, 14.4492f)
                curveTo(11.332f, 15.1523f, 12.4688f, 16.1602f, 12.4688f, 18.0586f)
                curveTo(12.4688f, 20.3203f, 10.6172f, 21.6445f, 7.4648f, 21.6445f)
                curveTo(4.6523f, 21.6445f, 2.8125f, 20.4609f, 2.25f, 18.2695f)
                curveTo(2.0508f, 17.6484f, 1.6641f, 17.332f, 1.0781f, 17.332f)
                curveTo(0.3984f, 17.332f, 0.0f, 17.7891f, 0.0f, 18.4805f)
                curveTo(0.0f, 18.6562f, 0.0234f, 18.8555f, 0.082f, 19.0664f)
                curveTo(0.8203f, 22.0078f, 3.9258f, 23.7188f, 7.4414f, 23.7188f)
                close()
                moveTo(7.3828f, 26.543f)
                curveTo(7.875f, 26.543f, 8.2734f, 26.1445f, 8.2734f, 25.6523f)
                lineTo(8.2734f, 0.9727f)
                curveTo(8.2734f, 0.4805f, 7.875f, 0.0938f, 7.3828f, 0.0938f)
                curveTo(6.8906f, 0.0938f, 6.5039f, 0.4805f, 6.5039f, 0.9727f)
                lineTo(6.5039f, 25.6523f)
                curveTo(6.5039f, 26.1445f, 6.8906f, 26.543f, 7.3828f, 26.543f)
                close()
            }
        }
        .build()
        return _dollarsign!!
    }

private var _dollarsign: ImageVector? = null
