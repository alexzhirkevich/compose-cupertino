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

public val CupertinoIcons.Outlined.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = Builder(name = "Newspaper", defaultWidth = 26.6484.dp, defaultHeight =
                25.1367.dp, viewportWidth = 26.6484f, viewportHeight = 25.1367f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.5859f)
                curveTo(0.0f, 23.918f, 1.1602f, 25.125f, 3.5391f, 25.125f)
                lineTo(22.9688f, 25.125f)
                curveTo(25.4297f, 25.125f, 26.6484f, 23.918f, 26.6484f, 21.5039f)
                lineTo(26.6484f, 3.6328f)
                curveTo(26.6484f, 1.2188f, 25.4297f, 0.0f, 22.9688f, 0.0f)
                lineTo(8.8477f, 0.0f)
                curveTo(6.3984f, 0.0f, 5.168f, 1.2188f, 5.168f, 3.6328f)
                lineTo(5.168f, 9.2227f)
                lineTo(2.3672f, 9.2227f)
                curveTo(0.8789f, 9.2227f, 0.0f, 10.0312f, 0.0f, 11.4258f)
                close()
                moveTo(1.8867f, 21.5859f)
                lineTo(1.8867f, 11.7891f)
                curveTo(1.8867f, 11.3555f, 2.1445f, 11.1094f, 2.5781f, 11.1094f)
                lineTo(5.168f, 11.1094f)
                lineTo(5.168f, 21.5859f)
                curveTo(5.168f, 22.5586f, 4.4531f, 23.2383f, 3.5391f, 23.2383f)
                curveTo(2.6133f, 23.2383f, 1.8867f, 22.5234f, 1.8867f, 21.5859f)
                close()
                moveTo(6.6563f, 23.2383f)
                curveTo(6.9141f, 22.7344f, 7.0547f, 22.1484f, 7.0547f, 21.4688f)
                lineTo(7.0547f, 3.7383f)
                curveTo(7.0547f, 2.5195f, 7.7109f, 1.8867f, 8.8828f, 1.8867f)
                lineTo(22.9336f, 1.8867f)
                curveTo(24.1055f, 1.8867f, 24.7617f, 2.5195f, 24.7617f, 3.7383f)
                lineTo(24.7617f, 21.3984f)
                curveTo(24.7617f, 22.6172f, 24.1055f, 23.2383f, 22.9336f, 23.2383f)
                close()
                moveTo(10.1016f, 6.9844f)
                lineTo(21.7383f, 6.9844f)
                curveTo(22.1484f, 6.9844f, 22.4648f, 6.6563f, 22.4648f, 6.2461f)
                curveTo(22.4648f, 5.8477f, 22.1484f, 5.543f, 21.7383f, 5.543f)
                lineTo(10.1016f, 5.543f)
                curveTo(9.6797f, 5.543f, 9.3633f, 5.8477f, 9.3633f, 6.2461f)
                curveTo(9.3633f, 6.6563f, 9.6797f, 6.9844f, 10.1016f, 6.9844f)
                close()
                moveTo(10.1016f, 11.1094f)
                lineTo(21.7383f, 11.1094f)
                curveTo(22.1484f, 11.1094f, 22.4648f, 10.793f, 22.4648f, 10.3945f)
                curveTo(22.4648f, 9.9844f, 22.1484f, 9.668f, 21.7383f, 9.668f)
                lineTo(10.1016f, 9.668f)
                curveTo(9.6797f, 9.668f, 9.3633f, 9.9844f, 9.3633f, 10.3945f)
                curveTo(9.3633f, 10.793f, 9.6797f, 11.1094f, 10.1016f, 11.1094f)
                close()
                moveTo(10.793f, 19.4648f)
                lineTo(13.8281f, 19.4648f)
                curveTo(14.7188f, 19.4648f, 15.2578f, 18.9258f, 15.2578f, 18.0352f)
                lineTo(15.2578f, 15.2461f)
                curveTo(15.2578f, 14.3438f, 14.7188f, 13.8047f, 13.8281f, 13.8047f)
                lineTo(10.793f, 13.8047f)
                curveTo(9.8906f, 13.8047f, 9.3516f, 14.3438f, 9.3516f, 15.2461f)
                lineTo(9.3516f, 18.0352f)
                curveTo(9.3516f, 18.9258f, 9.8906f, 19.4648f, 10.793f, 19.4648f)
                close()
                moveTo(17.3672f, 15.2461f)
                lineTo(21.7266f, 15.2461f)
                curveTo(22.1484f, 15.2461f, 22.4531f, 14.9414f, 22.4531f, 14.543f)
                curveTo(22.4531f, 14.1211f, 22.1484f, 13.8047f, 21.7266f, 13.8047f)
                lineTo(17.3672f, 13.8047f)
                curveTo(16.9453f, 13.8047f, 16.6406f, 14.1211f, 16.6406f, 14.543f)
                curveTo(16.6406f, 14.9414f, 16.9453f, 15.2461f, 17.3672f, 15.2461f)
                close()
                moveTo(17.3672f, 19.4648f)
                lineTo(21.7266f, 19.4648f)
                curveTo(22.1484f, 19.4648f, 22.4531f, 19.1602f, 22.4531f, 18.7617f)
                curveTo(22.4531f, 18.3516f, 22.1484f, 18.0234f, 21.7266f, 18.0234f)
                lineTo(17.3672f, 18.0234f)
                curveTo(16.9453f, 18.0234f, 16.6406f, 18.3516f, 16.6406f, 18.7617f)
                curveTo(16.6406f, 19.1602f, 16.9453f, 19.4648f, 17.3672f, 19.4648f)
                close()
            }
        }
        .build()
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
