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

public val CupertinoIcons.Outlined.PlusViewfinder: ImageVector
    get() {
        if (_plusViewfinder != null) {
            return _plusViewfinder!!
        }
        _plusViewfinder = Builder(name = "PlusViewfinder", defaultWidth = 22.9453.dp, defaultHeight
                = 22.957.dp, viewportWidth = 22.9453f, viewportHeight = 22.957f).apply {
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
                moveTo(6.0469f, 11.4844f)
                curveTo(6.0469f, 12.0586f, 6.457f, 12.457f, 7.0547f, 12.457f)
                lineTo(10.5f, 12.457f)
                lineTo(10.5f, 15.9141f)
                curveTo(10.5f, 16.5f, 10.8867f, 16.9102f, 11.4609f, 16.9102f)
                curveTo(12.0586f, 16.9102f, 12.457f, 16.5f, 12.457f, 15.9141f)
                lineTo(12.457f, 12.457f)
                lineTo(15.9141f, 12.457f)
                curveTo(16.5f, 12.457f, 16.9102f, 12.0586f, 16.9102f, 11.4844f)
                curveTo(16.9102f, 10.8984f, 16.5117f, 10.4883f, 15.9141f, 10.4883f)
                lineTo(12.457f, 10.4883f)
                lineTo(12.457f, 7.043f)
                curveTo(12.457f, 6.4453f, 12.0586f, 6.0469f, 11.4609f, 6.0469f)
                curveTo(10.8867f, 6.0469f, 10.5f, 6.4453f, 10.5f, 7.043f)
                lineTo(10.5f, 10.4883f)
                lineTo(7.0547f, 10.4883f)
                curveTo(6.4453f, 10.4883f, 6.0469f, 10.8984f, 6.0469f, 11.4844f)
                close()
            }
        }
        .build()
        return _plusViewfinder!!
    }

private var _plusViewfinder: ImageVector? = null
