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

public val CupertinoIcons.Outlined.Faceid: ImageVector
    get() {
        if (_faceid != null) {
            return _faceid!!
        }
        _faceid = Builder(name = "Faceid", defaultWidth = 22.9453.dp, defaultHeight = 22.957.dp,
                viewportWidth = 22.9453f, viewportHeight = 22.957f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(22.9453f)
                verticalLineToRelative(22.957f)
                horizontalLineToRelative(-22.9453f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.9375f, 7.4766f)
                curveTo(1.5586f, 7.4766f, 1.8867f, 7.125f, 1.8867f, 6.5156f)
                lineTo(1.8867f, 3.75f)
                curveTo(1.8867f, 2.5313f, 2.5313f, 1.9102f, 3.7031f, 1.9102f)
                lineTo(6.5391f, 1.9102f)
                curveTo(7.1602f, 1.9102f, 7.5f, 1.5703f, 7.5f, 0.9609f)
                curveTo(7.5f, 0.3516f, 7.1602f, 0.0234f, 6.5391f, 0.0234f)
                lineTo(3.6797f, 0.0234f)
                curveTo(1.2305f, 0.0234f, 0.0f, 1.2305f, 0.0f, 3.6445f)
                lineTo(0.0f, 6.5156f)
                curveTo(0.0f, 7.125f, 0.3398f, 7.4766f, 0.9375f, 7.4766f)
                close()
                moveTo(21.9961f, 7.4766f)
                curveTo(22.6172f, 7.4766f, 22.9453f, 7.125f, 22.9453f, 6.5156f)
                lineTo(22.9453f, 3.6445f)
                curveTo(22.9453f, 1.2305f, 21.7148f, 0.0234f, 19.2656f, 0.0234f)
                lineTo(16.3945f, 0.0234f)
                curveTo(15.7852f, 0.0234f, 15.4453f, 0.3516f, 15.4453f, 0.9609f)
                curveTo(15.4453f, 1.5703f, 15.7852f, 1.9102f, 16.3945f, 1.9102f)
                lineTo(19.2305f, 1.9102f)
                curveTo(20.3906f, 1.9102f, 21.0586f, 2.5313f, 21.0586f, 3.75f)
                lineTo(21.0586f, 6.5156f)
                curveTo(21.0586f, 7.125f, 21.3984f, 7.4766f, 21.9961f, 7.4766f)
                close()
                moveTo(3.6797f, 22.957f)
                lineTo(6.5391f, 22.957f)
                curveTo(7.1602f, 22.957f, 7.5f, 22.6172f, 7.5f, 22.0195f)
                curveTo(7.5f, 21.4102f, 7.1602f, 21.0703f, 6.5391f, 21.0703f)
                lineTo(3.7031f, 21.0703f)
                curveTo(2.5313f, 21.0703f, 1.8867f, 20.4492f, 1.8867f, 19.2305f)
                lineTo(1.8867f, 16.4648f)
                curveTo(1.8867f, 15.8438f, 1.5469f, 15.5039f, 0.9375f, 15.5039f)
                curveTo(0.3281f, 15.5039f, 0.0f, 15.8438f, 0.0f, 16.4648f)
                lineTo(0.0f, 19.3242f)
                curveTo(0.0f, 21.75f, 1.2305f, 22.957f, 3.6797f, 22.957f)
                close()
                moveTo(16.3945f, 22.957f)
                lineTo(19.2656f, 22.957f)
                curveTo(21.7148f, 22.957f, 22.9453f, 21.7383f, 22.9453f, 19.3242f)
                lineTo(22.9453f, 16.4648f)
                curveTo(22.9453f, 15.8438f, 22.6055f, 15.5039f, 21.9961f, 15.5039f)
                curveTo(21.3867f, 15.5039f, 21.0586f, 15.8438f, 21.0586f, 16.4648f)
                lineTo(21.0586f, 19.2305f)
                curveTo(21.0586f, 20.4492f, 20.3906f, 21.0703f, 19.2305f, 21.0703f)
                lineTo(16.3945f, 21.0703f)
                curveTo(15.7852f, 21.0703f, 15.4453f, 21.4102f, 15.4453f, 22.0195f)
                curveTo(15.4453f, 22.6172f, 15.7852f, 22.957f, 16.3945f, 22.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0078f, 10.6992f)
                curveTo(7.5586f, 10.6992f, 7.957f, 10.3125f, 7.957f, 9.75f)
                lineTo(7.957f, 8.1563f)
                curveTo(7.957f, 7.5938f, 7.5586f, 7.207f, 7.0078f, 7.207f)
                curveTo(6.457f, 7.207f, 6.0703f, 7.5938f, 6.0703f, 8.1563f)
                lineTo(6.0703f, 9.75f)
                curveTo(6.0703f, 10.3125f, 6.457f, 10.6992f, 7.0078f, 10.6992f)
                close()
                moveTo(10.5352f, 13.4648f)
                curveTo(10.5586f, 13.4648f, 10.5938f, 13.4648f, 10.6289f, 13.4648f)
                curveTo(11.8125f, 13.4648f, 12.457f, 12.8203f, 12.457f, 11.6367f)
                lineTo(12.457f, 7.9453f)
                curveTo(12.457f, 7.4883f, 12.1523f, 7.1953f, 11.707f, 7.1953f)
                curveTo(11.2383f, 7.1953f, 10.9336f, 7.4883f, 10.9336f, 7.9453f)
                lineTo(10.9336f, 11.7422f)
                curveTo(10.9336f, 11.8594f, 10.8633f, 11.918f, 10.7578f, 11.918f)
                lineTo(10.3477f, 11.918f)
                curveTo(9.9258f, 11.918f, 9.5977f, 12.2461f, 9.5977f, 12.668f)
                curveTo(9.5977f, 13.1719f, 9.9375f, 13.4648f, 10.5352f, 13.4648f)
                close()
                moveTo(15.9023f, 10.6992f)
                curveTo(16.4414f, 10.6992f, 16.8281f, 10.3125f, 16.8281f, 9.75f)
                lineTo(16.8281f, 8.1563f)
                curveTo(16.8281f, 7.5938f, 16.4414f, 7.207f, 15.9023f, 7.207f)
                curveTo(15.3398f, 7.207f, 14.9531f, 7.5938f, 14.9531f, 8.1563f)
                lineTo(14.9531f, 9.75f)
                curveTo(14.9531f, 10.3125f, 15.3398f, 10.6992f, 15.9023f, 10.6992f)
                close()
                moveTo(11.4023f, 17.4023f)
                curveTo(12.8203f, 17.4023f, 14.25f, 16.793f, 15.2695f, 15.7734f)
                curveTo(15.4102f, 15.6445f, 15.4805f, 15.4453f, 15.4805f, 15.2109f)
                curveTo(15.4805f, 14.7656f, 15.1523f, 14.4492f, 14.7188f, 14.4492f)
                curveTo(14.4961f, 14.4492f, 14.332f, 14.5312f, 14.1094f, 14.7656f)
                curveTo(13.4648f, 15.4336f, 12.4453f, 15.8906f, 11.4023f, 15.8906f)
                curveTo(10.418f, 15.8906f, 9.3867f, 15.457f, 8.707f, 14.7656f)
                curveTo(8.5195f, 14.5898f, 8.3672f, 14.4492f, 8.0859f, 14.4492f)
                curveTo(7.6523f, 14.4492f, 7.3242f, 14.7656f, 7.3242f, 15.2109f)
                curveTo(7.3242f, 15.4102f, 7.3945f, 15.5977f, 7.5469f, 15.7617f)
                curveTo(8.4961f, 16.8398f, 9.9844f, 17.4023f, 11.4023f, 17.4023f)
                close()
            }
        }
        .build()
        return _faceid!!
    }

private var _faceid: ImageVector? = null
