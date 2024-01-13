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

public val CupertinoIcons.Outlined.CompassDrawing: ImageVector
    get() {
        if (_compassDrawing != null) {
            return _compassDrawing!!
        }
        _compassDrawing = Builder(name = "CompassDrawing", defaultWidth = 17.543.dp, defaultHeight =
                26.8945.dp, viewportWidth = 17.543f, viewportHeight = 26.8945f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1211f, 3.668f)
                lineTo(9.4219f, 3.668f)
                lineTo(9.4219f, 0.6445f)
                curveTo(9.4219f, 0.2813f, 9.1289f, 0.0f, 8.7656f, 0.0f)
                curveTo(8.4023f, 0.0f, 8.1211f, 0.293f, 8.1211f, 0.6563f)
                close()
                moveTo(8.7656f, 9.6445f)
                curveTo(10.7695f, 9.6445f, 12.3633f, 8.0508f, 12.3633f, 6.0586f)
                curveTo(12.3633f, 4.0547f, 10.7695f, 2.4609f, 8.7656f, 2.4609f)
                curveTo(6.7734f, 2.4609f, 5.1797f, 4.0547f, 5.1797f, 6.0586f)
                curveTo(5.1797f, 8.0508f, 6.7734f, 9.6445f, 8.7656f, 9.6445f)
                close()
                moveTo(8.7656f, 7.875f)
                curveTo(7.7109f, 7.875f, 6.9492f, 7.1016f, 6.9492f, 6.0586f)
                curveTo(6.9492f, 5.0039f, 7.7109f, 4.2305f, 8.7656f, 4.2305f)
                curveTo(9.8203f, 4.2305f, 10.5938f, 5.0039f, 10.5938f, 6.0586f)
                curveTo(10.5938f, 7.1016f, 9.8203f, 7.875f, 8.7656f, 7.875f)
                close()
                moveTo(8.2852f, 8.707f)
                lineTo(6.4453f, 8.2617f)
                lineTo(1.9219f, 23.4609f)
                curveTo(1.7695f, 23.9531f, 2.0859f, 24.4805f, 2.5898f, 24.6094f)
                curveTo(3.0938f, 24.75f, 3.5977f, 24.457f, 3.75f, 23.9414f)
                close()
                moveTo(2.4258f, 22.793f)
                lineTo(1.5586f, 26.0391f)
                curveTo(1.4766f, 26.3672f, 1.6523f, 26.707f, 1.9922f, 26.7891f)
                curveTo(2.332f, 26.8828f, 2.6602f, 26.6953f, 2.7539f, 26.3555f)
                lineTo(3.6211f, 23.1211f)
                close()
                moveTo(9.2578f, 8.707f)
                lineTo(13.793f, 23.9414f)
                curveTo(13.9453f, 24.457f, 14.4492f, 24.75f, 14.9531f, 24.6094f)
                curveTo(15.457f, 24.4805f, 15.7617f, 23.9531f, 15.6211f, 23.4609f)
                lineTo(11.0977f, 8.2617f)
                close()
                moveTo(15.1172f, 22.793f)
                lineTo(13.9102f, 23.1211f)
                lineTo(14.7891f, 26.3555f)
                curveTo(14.8828f, 26.6953f, 15.2109f, 26.8828f, 15.5508f, 26.7891f)
                curveTo(15.8789f, 26.707f, 16.0664f, 26.3672f, 15.9727f, 26.0391f)
                close()
                moveTo(0.7734f, 15.2109f)
                curveTo(0.3398f, 15.2109f, 0.0f, 15.5508f, 0.0f, 15.9727f)
                curveTo(0.0f, 16.3945f, 0.3398f, 16.7461f, 0.7734f, 16.7461f)
                lineTo(16.7695f, 16.7461f)
                curveTo(17.1914f, 16.7461f, 17.543f, 16.3945f, 17.543f, 15.9727f)
                curveTo(17.543f, 15.5508f, 17.1914f, 15.2109f, 16.7695f, 15.2109f)
                close()
                moveTo(9.5391f, 13.957f)
                curveTo(9.5391f, 13.5352f, 9.1875f, 13.1836f, 8.7656f, 13.1836f)
                curveTo(8.3438f, 13.1836f, 8.0039f, 13.5352f, 8.0039f, 13.957f)
                lineTo(8.0039f, 17.9883f)
                curveTo(8.0039f, 18.4102f, 8.3438f, 18.7617f, 8.7656f, 18.7617f)
                curveTo(9.1875f, 18.7617f, 9.5391f, 18.4102f, 9.5391f, 17.9883f)
                close()
            }
        }
        .build()
        return _compassDrawing!!
    }

private var _compassDrawing: ImageVector? = null
