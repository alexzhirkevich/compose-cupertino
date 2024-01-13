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

package io.github.alexzhirkevich.cupertino.icons.filled

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

public val CupertinoIcons.Filled.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 29.4961.dp, defaultHeight =
                18.5273.dp, viewportWidth = 29.4961f, viewportHeight = 18.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 18.5156f)
                lineTo(25.8164f, 18.5156f)
                curveTo(28.2539f, 18.5156f, 29.4961f, 17.2969f, 29.4961f, 14.8828f)
                lineTo(29.4961f, 3.6211f)
                curveTo(29.4961f, 1.2188f, 28.2539f, 0.0f, 25.8164f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2188f, 0.0f, 0.0f, 1.207f, 0.0f, 3.6211f)
                lineTo(0.0f, 14.8828f)
                curveTo(0.0f, 17.2969f, 1.2188f, 18.5156f, 3.6797f, 18.5156f)
                close()
                moveTo(4.4414f, 6.4453f)
                curveTo(4.1133f, 6.4453f, 3.9141f, 6.2344f, 3.9141f, 5.9063f)
                lineTo(3.9141f, 4.793f)
                curveTo(3.9141f, 4.4648f, 4.1133f, 4.2539f, 4.4414f, 4.2539f)
                lineTo(5.5547f, 4.2539f)
                curveTo(5.8945f, 4.2539f, 6.1055f, 4.4648f, 6.1055f, 4.793f)
                lineTo(6.1055f, 5.9063f)
                curveTo(6.1055f, 6.2344f, 5.8945f, 6.4453f, 5.5547f, 6.4453f)
                close()
                moveTo(8.332f, 6.4453f)
                curveTo(7.9922f, 6.4453f, 7.793f, 6.2344f, 7.793f, 5.9063f)
                lineTo(7.793f, 4.793f)
                curveTo(7.793f, 4.4648f, 7.9922f, 4.2539f, 8.332f, 4.2539f)
                lineTo(9.4453f, 4.2539f)
                curveTo(9.7734f, 4.2539f, 9.9844f, 4.4648f, 9.9844f, 4.793f)
                lineTo(9.9844f, 5.9063f)
                curveTo(9.9844f, 6.2344f, 9.7734f, 6.4453f, 9.4453f, 6.4453f)
                close()
                moveTo(12.2227f, 6.4453f)
                curveTo(11.8945f, 6.4453f, 11.6836f, 6.2344f, 11.6836f, 5.9063f)
                lineTo(11.6836f, 4.793f)
                curveTo(11.6836f, 4.4648f, 11.8945f, 4.2539f, 12.2227f, 4.2539f)
                lineTo(13.3242f, 4.2539f)
                curveTo(13.6641f, 4.2539f, 13.875f, 4.4648f, 13.875f, 4.793f)
                lineTo(13.875f, 5.9063f)
                curveTo(13.875f, 6.2344f, 13.6641f, 6.4453f, 13.3242f, 6.4453f)
                close()
                moveTo(16.1133f, 6.4453f)
                curveTo(15.7852f, 6.4453f, 15.5742f, 6.2344f, 15.5742f, 5.9063f)
                lineTo(15.5742f, 4.793f)
                curveTo(15.5742f, 4.4648f, 15.7852f, 4.2539f, 16.1133f, 4.2539f)
                lineTo(17.2266f, 4.2539f)
                curveTo(17.5547f, 4.2539f, 17.7656f, 4.4648f, 17.7656f, 4.793f)
                lineTo(17.7656f, 5.9063f)
                curveTo(17.7656f, 6.2344f, 17.5547f, 6.4453f, 17.2266f, 6.4453f)
                close()
                moveTo(20.0039f, 6.4453f)
                curveTo(19.6641f, 6.4453f, 19.4531f, 6.2344f, 19.4531f, 5.9063f)
                lineTo(19.4531f, 4.793f)
                curveTo(19.4531f, 4.4648f, 19.6641f, 4.2539f, 20.0039f, 4.2539f)
                lineTo(21.1172f, 4.2539f)
                curveTo(21.4453f, 4.2539f, 21.6445f, 4.4648f, 21.6445f, 4.793f)
                lineTo(21.6445f, 5.9063f)
                curveTo(21.6445f, 6.2344f, 21.4453f, 6.4453f, 21.1172f, 6.4453f)
                close()
                moveTo(23.8945f, 6.4453f)
                curveTo(23.5547f, 6.4453f, 23.3438f, 6.2344f, 23.3438f, 5.9063f)
                lineTo(23.3438f, 4.793f)
                curveTo(23.3438f, 4.4648f, 23.5547f, 4.2539f, 23.8945f, 4.2539f)
                lineTo(24.9961f, 4.2539f)
                curveTo(25.3359f, 4.2539f, 25.5352f, 4.4648f, 25.5352f, 4.793f)
                lineTo(25.5352f, 5.9063f)
                curveTo(25.5352f, 6.2344f, 25.3359f, 6.4453f, 24.9961f, 6.4453f)
                close()
                moveTo(4.4414f, 10.3359f)
                curveTo(4.1133f, 10.3359f, 3.9141f, 10.125f, 3.9141f, 9.7969f)
                lineTo(3.9141f, 8.6836f)
                curveTo(3.9141f, 8.3555f, 4.1133f, 8.1445f, 4.4414f, 8.1445f)
                lineTo(5.5547f, 8.1445f)
                curveTo(5.8945f, 8.1445f, 6.1055f, 8.3555f, 6.1055f, 8.6836f)
                lineTo(6.1055f, 9.7969f)
                curveTo(6.1055f, 10.125f, 5.8945f, 10.3359f, 5.5547f, 10.3359f)
                close()
                moveTo(8.332f, 10.3359f)
                curveTo(7.9922f, 10.3359f, 7.793f, 10.125f, 7.793f, 9.7969f)
                lineTo(7.793f, 8.6836f)
                curveTo(7.793f, 8.3555f, 7.9922f, 8.1445f, 8.332f, 8.1445f)
                lineTo(9.4453f, 8.1445f)
                curveTo(9.7734f, 8.1445f, 9.9844f, 8.3555f, 9.9844f, 8.6836f)
                lineTo(9.9844f, 9.7969f)
                curveTo(9.9844f, 10.125f, 9.7734f, 10.3359f, 9.4453f, 10.3359f)
                close()
                moveTo(12.2227f, 10.3359f)
                curveTo(11.8945f, 10.3359f, 11.6836f, 10.125f, 11.6836f, 9.7969f)
                lineTo(11.6836f, 8.6836f)
                curveTo(11.6836f, 8.3555f, 11.8945f, 8.1445f, 12.2227f, 8.1445f)
                lineTo(13.3242f, 8.1445f)
                curveTo(13.6641f, 8.1445f, 13.875f, 8.3555f, 13.875f, 8.6836f)
                lineTo(13.875f, 9.7969f)
                curveTo(13.875f, 10.125f, 13.6641f, 10.3359f, 13.3242f, 10.3359f)
                close()
                moveTo(16.1133f, 10.3359f)
                curveTo(15.7852f, 10.3359f, 15.5742f, 10.125f, 15.5742f, 9.7969f)
                lineTo(15.5742f, 8.6836f)
                curveTo(15.5742f, 8.3555f, 15.7852f, 8.1445f, 16.1133f, 8.1445f)
                lineTo(17.2266f, 8.1445f)
                curveTo(17.5547f, 8.1445f, 17.7656f, 8.3555f, 17.7656f, 8.6836f)
                lineTo(17.7656f, 9.7969f)
                curveTo(17.7656f, 10.125f, 17.5547f, 10.3359f, 17.2266f, 10.3359f)
                close()
                moveTo(20.0039f, 10.3359f)
                curveTo(19.6641f, 10.3359f, 19.4531f, 10.125f, 19.4531f, 9.7969f)
                lineTo(19.4531f, 8.6836f)
                curveTo(19.4531f, 8.3555f, 19.6641f, 8.1445f, 20.0039f, 8.1445f)
                lineTo(21.1172f, 8.1445f)
                curveTo(21.4453f, 8.1445f, 21.6445f, 8.3555f, 21.6445f, 8.6836f)
                lineTo(21.6445f, 9.7969f)
                curveTo(21.6445f, 10.125f, 21.4453f, 10.3359f, 21.1172f, 10.3359f)
                close()
                moveTo(23.8945f, 10.3359f)
                curveTo(23.5547f, 10.3359f, 23.3438f, 10.125f, 23.3438f, 9.7969f)
                lineTo(23.3438f, 8.6836f)
                curveTo(23.3438f, 8.3555f, 23.5547f, 8.1445f, 23.8945f, 8.1445f)
                lineTo(24.9961f, 8.1445f)
                curveTo(25.3359f, 8.1445f, 25.5352f, 8.3555f, 25.5352f, 8.6836f)
                lineTo(25.5352f, 9.7969f)
                curveTo(25.5352f, 10.125f, 25.3359f, 10.3359f, 24.9961f, 10.3359f)
                close()
                moveTo(4.4414f, 14.2266f)
                curveTo(4.1133f, 14.2266f, 3.9141f, 14.0156f, 3.9141f, 13.6875f)
                lineTo(3.9141f, 12.5742f)
                curveTo(3.9141f, 12.2461f, 4.1133f, 12.0352f, 4.4414f, 12.0352f)
                lineTo(5.5547f, 12.0352f)
                curveTo(5.8945f, 12.0352f, 6.1055f, 12.2461f, 6.1055f, 12.5742f)
                lineTo(6.1055f, 13.6875f)
                curveTo(6.1055f, 14.0156f, 5.8945f, 14.2266f, 5.5547f, 14.2266f)
                close()
                moveTo(8.4609f, 14.2266f)
                curveTo(8.0391f, 14.2266f, 7.793f, 13.9805f, 7.793f, 13.5586f)
                lineTo(7.793f, 12.6914f)
                curveTo(7.793f, 12.2812f, 8.0391f, 12.0352f, 8.4609f, 12.0352f)
                lineTo(20.9883f, 12.0352f)
                curveTo(21.3984f, 12.0352f, 21.6445f, 12.2812f, 21.6445f, 12.6914f)
                lineTo(21.6445f, 13.5586f)
                curveTo(21.6445f, 13.9805f, 21.3984f, 14.2266f, 20.9883f, 14.2266f)
                close()
                moveTo(23.8945f, 14.2266f)
                curveTo(23.5547f, 14.2266f, 23.3438f, 14.0156f, 23.3438f, 13.6875f)
                lineTo(23.3438f, 12.5742f)
                curveTo(23.3438f, 12.2461f, 23.5547f, 12.0352f, 23.8945f, 12.0352f)
                lineTo(24.9961f, 12.0352f)
                curveTo(25.3359f, 12.0352f, 25.5352f, 12.2461f, 25.5352f, 12.5742f)
                lineTo(25.5352f, 13.6875f)
                curveTo(25.5352f, 14.0156f, 25.3359f, 14.2266f, 24.9961f, 14.2266f)
                close()
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
