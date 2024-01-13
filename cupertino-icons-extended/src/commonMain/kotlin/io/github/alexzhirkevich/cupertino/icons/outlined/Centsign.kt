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

public val CupertinoIcons.Outlined.Centsign: ImageVector
    get() {
        if (_centsign != null) {
            return _centsign!!
        }
        _centsign = Builder(name = "Centsign", defaultWidth = 13.8633.dp, defaultHeight =
                21.7852.dp, viewportWidth = 13.8633f, viewportHeight = 21.7852f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3828f, 18.9844f)
                curveTo(10.6523f, 18.9844f, 13.0195f, 17.3086f, 13.7461f, 15.1289f)
                curveTo(13.8047f, 14.9297f, 13.8633f, 14.707f, 13.8633f, 14.4609f)
                curveTo(13.8633f, 13.8633f, 13.4414f, 13.4648f, 12.8438f, 13.4648f)
                curveTo(12.3633f, 13.4648f, 12.0586f, 13.7695f, 11.8594f, 14.2266f)
                curveTo(11.168f, 15.9023f, 9.7148f, 17.0742f, 7.3945f, 17.0742f)
                curveTo(4.2891f, 17.0742f, 2.2031f, 14.8828f, 2.2031f, 10.8867f)
                curveTo(2.2031f, 6.9727f, 4.2656f, 4.6875f, 7.3711f, 4.6875f)
                curveTo(9.6914f, 4.6875f, 11.1445f, 5.8711f, 11.8242f, 7.5234f)
                curveTo(12.0234f, 8.0273f, 12.375f, 8.3086f, 12.8672f, 8.3086f)
                curveTo(13.4531f, 8.3086f, 13.8398f, 7.8984f, 13.8398f, 7.3125f)
                curveTo(13.8398f, 7.0664f, 13.7812f, 6.8438f, 13.7227f, 6.6445f)
                curveTo(12.9844f, 4.4766f, 10.6289f, 2.7773f, 7.3594f, 2.7773f)
                curveTo(2.9297f, 2.7773f, 0.0f, 5.9414f, 0.0f, 10.8867f)
                curveTo(0.0f, 15.9023f, 2.9297f, 18.9844f, 7.3828f, 18.9844f)
                close()
                moveTo(7.2773f, 21.7734f)
                curveTo(7.7109f, 21.7734f, 8.0508f, 21.4688f, 8.0508f, 21.0117f)
                lineTo(8.0508f, 0.7617f)
                curveTo(8.0508f, 0.3047f, 7.7109f, 0.0f, 7.2773f, 0.0f)
                curveTo(6.8438f, 0.0f, 6.5156f, 0.3047f, 6.5156f, 0.7617f)
                lineTo(6.5156f, 21.0117f)
                curveTo(6.5156f, 21.4688f, 6.8438f, 21.7734f, 7.2773f, 21.7734f)
                close()
            }
        }
        .build()
        return _centsign!!
    }

private var _centsign: ImageVector? = null
