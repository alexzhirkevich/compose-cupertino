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

public val CupertinoIcons.Outlined.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 16.0985.dp, defaultHeight =
                28.9102.dp, viewportWidth = 16.0985f, viewportHeight = 28.9102f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0164f, 27.1758f)
                curveTo(5.0008f, 27.1758f, 5.6102f, 26.625f, 5.5985f, 25.6641f)
                lineTo(5.3641f, 12.5039f)
                curveTo(5.3641f, 12.0938f, 5.5399f, 11.7891f, 5.9032f, 11.625f)
                curveTo(7.45f, 10.9453f, 8.118f, 10.2305f, 8.036f, 8.1797f)
                lineTo(7.7078f, 0.9844f)
                curveTo(7.6844f, 0.4688f, 7.3797f, 0.1758f, 6.8993f, 0.1758f)
                curveTo(6.4422f, 0.1758f, 6.161f, 0.4805f, 6.161f, 1.0078f)
                lineTo(6.243f, 8.0039f)
                curveTo(6.243f, 8.4141f, 5.9852f, 8.6719f, 5.5985f, 8.6719f)
                curveTo(5.2f, 8.6719f, 4.9188f, 8.4258f, 4.9188f, 8.0391f)
                lineTo(4.8016f, 0.7969f)
                curveTo(4.7899f, 0.293f, 4.4969f, 0.0f, 4.0164f, 0.0f)
                curveTo(3.536f, 0.0f, 3.2547f, 0.293f, 3.243f, 0.7969f)
                lineTo(3.1258f, 8.0391f)
                curveTo(3.1258f, 8.4258f, 2.8446f, 8.6719f, 2.4461f, 8.6719f)
                curveTo(2.0594f, 8.6719f, 1.7899f, 8.4141f, 1.7899f, 8.0039f)
                lineTo(1.8719f, 1.0078f)
                curveTo(1.8719f, 0.4805f, 1.6024f, 0.1758f, 1.1336f, 0.1758f)
                curveTo(0.6532f, 0.1758f, 0.3485f, 0.4688f, 0.325f, 0.9844f)
                lineTo(0.0086f, 8.1797f)
                curveTo(-0.0851f, 10.2305f, 0.5828f, 10.9453f, 2.1297f, 11.625f)
                curveTo(2.493f, 11.7891f, 2.6688f, 12.0938f, 2.6688f, 12.5039f)
                lineTo(2.4461f, 25.6641f)
                curveTo(2.4344f, 26.625f, 3.0321f, 27.1758f, 4.0164f, 27.1758f)
                close()
                moveTo(13.1805f, 16.957f)
                lineTo(12.9344f, 25.6055f)
                curveTo(12.8993f, 26.625f, 13.5203f, 27.1758f, 14.493f, 27.1758f)
                curveTo(15.4891f, 27.1758f, 16.0985f, 26.6719f, 16.0985f, 25.7344f)
                lineTo(16.0985f, 0.8789f)
                curveTo(16.0985f, 0.2813f, 15.6883f, 0.0f, 15.2664f, 0.0f)
                curveTo(14.8211f, 0.0f, 14.5282f, 0.2344f, 14.1532f, 0.7852f)
                curveTo(12.2664f, 3.4336f, 11.0243f, 8.3906f, 11.0243f, 13.0781f)
                lineTo(11.0243f, 13.6523f)
                curveTo(11.0243f, 14.4609f, 11.3172f, 15.0586f, 11.9032f, 15.4453f)
                lineTo(12.5946f, 15.9141f)
                curveTo(13.0164f, 16.207f, 13.2039f, 16.5352f, 13.1805f, 16.957f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
