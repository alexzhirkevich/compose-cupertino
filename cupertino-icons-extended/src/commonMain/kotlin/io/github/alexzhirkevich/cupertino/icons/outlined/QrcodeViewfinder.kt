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

public val CupertinoIcons.Outlined.QrcodeViewfinder: ImageVector
    get() {
        if (_qrcodeViewfinder != null) {
            return _qrcodeViewfinder!!
        }
        _qrcodeViewfinder = Builder(name = "QrcodeViewfinder", defaultWidth = 22.9453.dp,
                defaultHeight = 22.957.dp, viewportWidth = 22.9453f, viewportHeight =
                22.957f).apply {
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
                moveTo(6.3633f, 17.1094f)
                lineTo(10.4414f, 17.1094f)
                curveTo(10.7344f, 17.1094f, 10.957f, 16.8867f, 10.957f, 16.5938f)
                lineTo(10.957f, 12.5156f)
                curveTo(10.957f, 12.2227f, 10.7344f, 12.0f, 10.4414f, 12.0f)
                lineTo(6.3633f, 12.0f)
                curveTo(6.0703f, 12.0f, 5.8477f, 12.2227f, 5.8477f, 12.5156f)
                lineTo(5.8477f, 16.5938f)
                curveTo(5.8477f, 16.8867f, 6.0703f, 17.1094f, 6.3633f, 17.1094f)
                close()
                moveTo(6.8672f, 16.0898f)
                lineTo(6.8672f, 13.0195f)
                lineTo(9.9375f, 13.0195f)
                lineTo(9.9375f, 16.0898f)
                close()
                moveTo(7.7578f, 15.1875f)
                lineTo(9.0469f, 15.1875f)
                lineTo(9.0469f, 13.9102f)
                lineTo(7.7578f, 13.9102f)
                close()
                moveTo(6.3633f, 10.9805f)
                lineTo(10.4414f, 10.9805f)
                curveTo(10.7344f, 10.9805f, 10.957f, 10.7578f, 10.957f, 10.4766f)
                lineTo(10.957f, 6.3867f)
                curveTo(10.957f, 6.1055f, 10.7344f, 5.8711f, 10.4414f, 5.8711f)
                lineTo(6.3633f, 5.8711f)
                curveTo(6.0703f, 5.8711f, 5.8477f, 6.1055f, 5.8477f, 6.3867f)
                lineTo(5.8477f, 10.4766f)
                curveTo(5.8477f, 10.7578f, 6.0703f, 10.9805f, 6.3633f, 10.9805f)
                close()
                moveTo(6.8672f, 9.9609f)
                lineTo(6.8672f, 6.8906f)
                lineTo(9.9375f, 6.8906f)
                lineTo(9.9375f, 9.9609f)
                close()
                moveTo(7.7578f, 9.0703f)
                lineTo(9.0469f, 9.0703f)
                lineTo(9.0469f, 7.7813f)
                lineTo(7.7578f, 7.7813f)
                close()
                moveTo(12.4805f, 10.9805f)
                lineTo(16.5586f, 10.9805f)
                curveTo(16.8516f, 10.9805f, 17.0742f, 10.7578f, 17.0742f, 10.4766f)
                lineTo(17.0742f, 6.3867f)
                curveTo(17.0742f, 6.1055f, 16.8516f, 5.8711f, 16.5586f, 5.8711f)
                lineTo(12.4805f, 5.8711f)
                curveTo(12.1875f, 5.8711f, 11.9648f, 6.1055f, 11.9648f, 6.3867f)
                lineTo(11.9648f, 10.4766f)
                curveTo(11.9648f, 10.7578f, 12.1875f, 10.9805f, 12.4805f, 10.9805f)
                close()
                moveTo(12.9844f, 9.9609f)
                lineTo(12.9844f, 6.8906f)
                lineTo(16.0547f, 6.8906f)
                lineTo(16.0547f, 9.9609f)
                close()
                moveTo(13.8867f, 9.0703f)
                lineTo(15.1641f, 9.0703f)
                lineTo(15.1641f, 7.7813f)
                lineTo(13.8867f, 7.7813f)
                close()
                moveTo(12.1172f, 16.957f)
                lineTo(13.3945f, 16.957f)
                lineTo(13.3945f, 15.6797f)
                lineTo(12.1172f, 15.6797f)
                close()
                moveTo(15.6445f, 16.957f)
                lineTo(16.9219f, 16.957f)
                lineTo(16.9219f, 15.6797f)
                lineTo(15.6445f, 15.6797f)
                close()
                moveTo(13.875f, 15.1875f)
                lineTo(15.1641f, 15.1875f)
                lineTo(15.1641f, 13.9102f)
                lineTo(13.875f, 13.9102f)
                close()
                moveTo(12.1172f, 13.418f)
                lineTo(13.3945f, 13.418f)
                lineTo(13.3945f, 12.1406f)
                lineTo(12.1172f, 12.1406f)
                close()
                moveTo(15.6445f, 13.418f)
                lineTo(16.9219f, 13.418f)
                lineTo(16.9219f, 12.1406f)
                lineTo(15.6445f, 12.1406f)
                close()
            }
        }
        .build()
        return _qrcodeViewfinder!!
    }

private var _qrcodeViewfinder: ImageVector? = null
