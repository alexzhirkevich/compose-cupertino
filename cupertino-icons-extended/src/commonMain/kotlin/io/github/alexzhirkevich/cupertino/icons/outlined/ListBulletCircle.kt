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

public val CupertinoIcons.Outlined.ListBulletCircle: ImageVector
    get() {
        if (_listBulletCircle != null) {
            return _listBulletCircle!!
        }
        _listBulletCircle = Builder(name = "ListBulletCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0938f, 8.7891f)
                lineTo(17.8828f, 8.7891f)
                curveTo(18.2812f, 8.7891f, 18.5977f, 8.4844f, 18.5977f, 8.0859f)
                curveTo(18.5977f, 7.6758f, 18.2812f, 7.3711f, 17.8828f, 7.3711f)
                lineTo(9.0938f, 7.3711f)
                curveTo(8.6953f, 7.3711f, 8.3906f, 7.6875f, 8.3906f, 8.0859f)
                curveTo(8.3906f, 8.4727f, 8.707f, 8.7891f, 9.0938f, 8.7891f)
                close()
                moveTo(9.0938f, 16.5469f)
                lineTo(17.8828f, 16.5469f)
                curveTo(18.2812f, 16.5469f, 18.5977f, 16.2422f, 18.5977f, 15.8438f)
                curveTo(18.5977f, 15.4336f, 18.2812f, 15.1289f, 17.8828f, 15.1289f)
                lineTo(9.0938f, 15.1289f)
                curveTo(8.707f, 15.1289f, 8.3906f, 15.457f, 8.3906f, 15.8438f)
                curveTo(8.3906f, 16.2422f, 8.6953f, 16.5469f, 9.0938f, 16.5469f)
                close()
                moveTo(9.0938f, 12.668f)
                lineTo(17.8828f, 12.668f)
                curveTo(18.2812f, 12.668f, 18.5977f, 12.3633f, 18.5977f, 11.9648f)
                curveTo(18.5977f, 11.5547f, 18.2812f, 11.25f, 17.8828f, 11.25f)
                lineTo(9.0938f, 11.25f)
                curveTo(8.707f, 11.25f, 8.3906f, 11.5781f, 8.3906f, 11.9648f)
                curveTo(8.3906f, 12.3516f, 8.707f, 12.668f, 9.0938f, 12.668f)
                close()
                moveTo(6.2695f, 9.0938f)
                curveTo(6.8203f, 9.0938f, 7.2773f, 8.625f, 7.2773f, 8.0859f)
                curveTo(7.2773f, 7.5234f, 6.832f, 7.0781f, 6.2695f, 7.0781f)
                curveTo(5.707f, 7.0781f, 5.2617f, 7.5234f, 5.2617f, 8.0859f)
                curveTo(5.2617f, 8.6367f, 5.707f, 9.0938f, 6.2695f, 9.0938f)
                close()
                moveTo(6.2695f, 12.9727f)
                curveTo(6.8203f, 12.9727f, 7.2773f, 12.5039f, 7.2773f, 11.9648f)
                curveTo(7.2773f, 11.4141f, 6.8203f, 10.957f, 6.2695f, 10.957f)
                curveTo(5.707f, 10.957f, 5.2617f, 11.4023f, 5.2617f, 11.9648f)
                curveTo(5.2617f, 12.5156f, 5.707f, 12.9727f, 6.2695f, 12.9727f)
                close()
                moveTo(6.2695f, 16.8516f)
                curveTo(6.832f, 16.8516f, 7.2773f, 16.3945f, 7.2773f, 15.8438f)
                curveTo(7.2773f, 15.293f, 6.8203f, 14.8359f, 6.2695f, 14.8359f)
                curveTo(5.707f, 14.8359f, 5.2617f, 15.2812f, 5.2617f, 15.8438f)
                curveTo(5.2617f, 16.3945f, 5.707f, 16.8516f, 6.2695f, 16.8516f)
                close()
            }
        }
        .build()
        return _listBulletCircle!!
    }

private var _listBulletCircle: ImageVector? = null
