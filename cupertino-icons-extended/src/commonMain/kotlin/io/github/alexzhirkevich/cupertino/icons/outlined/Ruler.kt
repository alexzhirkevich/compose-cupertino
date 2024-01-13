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

public val CupertinoIcons.Outlined.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 28.6641.dp, defaultHeight = 12.7148.dp,
                viewportWidth = 28.6641f, viewportHeight = 12.7148f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.6641f, 3.1641f)
                curveTo(28.6641f, 1.0898f, 27.5742f, 0.0117f, 25.4766f, 0.0117f)
                lineTo(3.1641f, 0.0117f)
                curveTo(1.0664f, 0.0117f, 0.0f, 1.0898f, 0.0f, 3.1641f)
                lineTo(0.0f, 9.5625f)
                curveTo(0.0f, 11.6367f, 1.0781f, 12.7148f, 3.1758f, 12.7148f)
                lineTo(25.4883f, 12.7148f)
                curveTo(27.5859f, 12.7148f, 28.6641f, 11.6367f, 28.6641f, 9.5625f)
                close()
                moveTo(26.7656f, 3.5039f)
                lineTo(26.7656f, 9.2227f)
                curveTo(26.7656f, 10.2773f, 26.2031f, 10.8281f, 25.1836f, 10.8281f)
                lineTo(3.457f, 10.8281f)
                curveTo(2.4609f, 10.8281f, 1.8867f, 10.2773f, 1.8867f, 9.2227f)
                lineTo(1.8867f, 3.5039f)
                curveTo(1.8867f, 2.4492f, 2.4609f, 1.8984f, 3.4688f, 1.8984f)
                lineTo(25.1953f, 1.8984f)
                curveTo(26.2031f, 1.8984f, 26.7656f, 2.4492f, 26.7656f, 3.5039f)
                close()
                moveTo(4.4766f, 1.2422f)
                lineTo(3.5273f, 1.2422f)
                lineTo(3.5273f, 7.418f)
                curveTo(3.5273f, 7.6875f, 3.7383f, 7.8867f, 4.0078f, 7.8867f)
                curveTo(4.2891f, 7.8867f, 4.4766f, 7.6758f, 4.4766f, 7.4063f)
                close()
                moveTo(6.5508f, 1.2422f)
                lineTo(5.6016f, 1.2422f)
                lineTo(5.6016f, 5.3555f)
                curveTo(5.6016f, 5.6367f, 5.8125f, 5.8242f, 6.0703f, 5.8242f)
                curveTo(6.3633f, 5.8242f, 6.5508f, 5.625f, 6.5508f, 5.3438f)
                close()
                moveTo(8.6133f, 1.2422f)
                lineTo(7.6523f, 1.2422f)
                lineTo(7.6523f, 5.3555f)
                curveTo(7.6523f, 5.6367f, 7.875f, 5.8242f, 8.1328f, 5.8242f)
                curveTo(8.4141f, 5.8242f, 8.6133f, 5.625f, 8.6133f, 5.3438f)
                close()
                moveTo(10.6641f, 1.2422f)
                lineTo(9.7148f, 1.2422f)
                lineTo(9.7148f, 5.3555f)
                curveTo(9.7148f, 5.6367f, 9.9258f, 5.8242f, 10.1953f, 5.8242f)
                curveTo(10.4766f, 5.8242f, 10.6641f, 5.625f, 10.6641f, 5.3438f)
                close()
                moveTo(12.7383f, 1.2422f)
                lineTo(11.7891f, 1.2422f)
                lineTo(11.7891f, 5.3555f)
                curveTo(11.7891f, 5.6367f, 12.0f, 5.8242f, 12.2578f, 5.8242f)
                curveTo(12.5508f, 5.8242f, 12.7383f, 5.625f, 12.7383f, 5.3438f)
                close()
                moveTo(14.8125f, 1.2422f)
                lineTo(13.8633f, 1.2422f)
                lineTo(13.8633f, 7.418f)
                curveTo(13.8633f, 7.6875f, 14.0742f, 7.8867f, 14.332f, 7.8867f)
                curveTo(14.625f, 7.8867f, 14.8125f, 7.6758f, 14.8125f, 7.4063f)
                close()
                moveTo(16.875f, 1.2422f)
                lineTo(15.9258f, 1.2422f)
                lineTo(15.9258f, 5.3555f)
                curveTo(15.9258f, 5.6367f, 16.1367f, 5.8242f, 16.3945f, 5.8242f)
                curveTo(16.6758f, 5.8242f, 16.875f, 5.625f, 16.875f, 5.3438f)
                close()
                moveTo(18.9375f, 1.2422f)
                lineTo(17.9883f, 1.2422f)
                lineTo(17.9883f, 5.3555f)
                curveTo(17.9883f, 5.6367f, 18.1992f, 5.8242f, 18.4688f, 5.8242f)
                curveTo(18.75f, 5.8242f, 18.9375f, 5.625f, 18.9375f, 5.3438f)
                close()
                moveTo(21.0f, 1.2422f)
                lineTo(20.0508f, 1.2422f)
                lineTo(20.0508f, 5.3555f)
                curveTo(20.0508f, 5.6367f, 20.2617f, 5.8242f, 20.5195f, 5.8242f)
                curveTo(20.8125f, 5.8242f, 21.0f, 5.625f, 21.0f, 5.3438f)
                close()
                moveTo(23.0742f, 1.2422f)
                lineTo(22.125f, 1.2422f)
                lineTo(22.125f, 5.3555f)
                curveTo(22.125f, 5.6367f, 22.3359f, 5.8242f, 22.5938f, 5.8242f)
                curveTo(22.875f, 5.8242f, 23.0742f, 5.625f, 23.0742f, 5.3438f)
                close()
                moveTo(25.1367f, 1.2422f)
                lineTo(24.1875f, 1.2422f)
                lineTo(24.1875f, 7.418f)
                curveTo(24.1875f, 7.6875f, 24.3984f, 7.8867f, 24.668f, 7.8867f)
                curveTo(24.9492f, 7.8867f, 25.1367f, 7.6758f, 25.1367f, 7.4063f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
