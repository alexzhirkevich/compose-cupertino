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

public val CupertinoIcons.Outlined.CameraViewfinder: ImageVector
    get() {
        if (_cameraViewfinder != null) {
            return _cameraViewfinder!!
        }
        _cameraViewfinder = Builder(name = "CameraViewfinder", defaultWidth = 22.9453.dp,
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
                moveTo(6.2461f, 16.7812f)
                lineTo(16.7109f, 16.7812f)
                curveTo(17.9414f, 16.7812f, 18.5742f, 16.1719f, 18.5742f, 14.9531f)
                lineTo(18.5742f, 8.7656f)
                curveTo(18.5742f, 7.5234f, 17.9414f, 6.9141f, 16.7109f, 6.9141f)
                lineTo(15.1875f, 6.9141f)
                curveTo(14.7305f, 6.9141f, 14.5898f, 6.832f, 14.3203f, 6.5273f)
                lineTo(13.8398f, 6.0f)
                curveTo(13.5469f, 5.6719f, 13.2422f, 5.5078f, 12.6445f, 5.5078f)
                lineTo(10.2773f, 5.5078f)
                curveTo(9.668f, 5.5078f, 9.3633f, 5.6719f, 9.0703f, 6.0f)
                lineTo(8.5898f, 6.5273f)
                curveTo(8.3203f, 6.8203f, 8.1797f, 6.9141f, 7.7227f, 6.9141f)
                lineTo(6.2461f, 6.9141f)
                curveTo(5.0039f, 6.9141f, 4.3828f, 7.5234f, 4.3828f, 8.7656f)
                lineTo(4.3828f, 14.9531f)
                curveTo(4.3828f, 16.1719f, 5.0039f, 16.7812f, 6.2461f, 16.7812f)
                close()
                moveTo(11.4961f, 15.3164f)
                curveTo(9.5391f, 15.3164f, 7.9688f, 13.7578f, 7.9688f, 11.7891f)
                curveTo(7.9688f, 9.8438f, 9.5391f, 8.2852f, 11.4961f, 8.2852f)
                curveTo(13.4297f, 8.2852f, 14.9883f, 9.8438f, 14.9883f, 11.7891f)
                curveTo(14.9883f, 13.793f, 13.4297f, 15.3164f, 11.4961f, 15.3164f)
                close()
                moveTo(11.4844f, 14.2969f)
                curveTo(12.8555f, 14.2969f, 13.9805f, 13.1953f, 13.9805f, 11.7891f)
                curveTo(13.9805f, 10.4062f, 12.8555f, 9.293f, 11.4844f, 9.293f)
                curveTo(10.1016f, 9.293f, 8.9766f, 10.4062f, 8.9766f, 11.7891f)
                curveTo(8.9766f, 13.1953f, 10.1016f, 14.2969f, 11.4844f, 14.2969f)
                close()
                moveTo(16.1602f, 10.1133f)
                curveTo(15.7266f, 10.1133f, 15.375f, 9.7617f, 15.375f, 9.3164f)
                curveTo(15.375f, 8.8711f, 15.7266f, 8.5195f, 16.1602f, 8.5195f)
                curveTo(16.5938f, 8.5195f, 16.957f, 8.8711f, 16.957f, 9.3164f)
                curveTo(16.957f, 9.7617f, 16.5938f, 10.1133f, 16.1602f, 10.1133f)
                close()
            }
        }
        .build()
        return _cameraViewfinder!!
    }

private var _cameraViewfinder: ImageVector? = null
