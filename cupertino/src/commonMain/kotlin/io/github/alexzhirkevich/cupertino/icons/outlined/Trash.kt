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

public val CupertinoIcons.Outlined.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 22.6875.dp, defaultHeight = 28.1836.dp,
                viewportWidth = 22.6875f, viewportHeight = 28.1836f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1992f, 5.3555f)
                lineTo(8.0625f, 5.3555f)
                lineTo(8.0625f, 2.8477f)
                curveTo(8.0625f, 2.1797f, 8.5313f, 1.7461f, 9.2344f, 1.7461f)
                lineTo(13.4297f, 1.7461f)
                curveTo(14.1328f, 1.7461f, 14.6016f, 2.1797f, 14.6016f, 2.8477f)
                lineTo(14.6016f, 5.3555f)
                lineTo(16.4648f, 5.3555f)
                lineTo(16.4648f, 2.7305f)
                curveTo(16.4648f, 1.0313f, 15.3633f, 0.0f, 13.5586f, 0.0f)
                lineTo(9.1055f, 0.0f)
                curveTo(7.3008f, 0.0f, 6.1992f, 1.0313f, 6.1992f, 2.7305f)
                close()
                moveTo(0.8789f, 6.293f)
                lineTo(21.8203f, 6.293f)
                curveTo(22.3008f, 6.293f, 22.6875f, 5.8828f, 22.6875f, 5.4023f)
                curveTo(22.6875f, 4.9219f, 22.3008f, 4.5234f, 21.8203f, 4.5234f)
                lineTo(0.8789f, 4.5234f)
                curveTo(0.4102f, 4.5234f, 0.0f, 4.9219f, 0.0f, 5.4023f)
                curveTo(0.0f, 5.8945f, 0.4102f, 6.293f, 0.8789f, 6.293f)
                close()
                moveTo(5.9766f, 26.0977f)
                lineTo(16.7227f, 26.0977f)
                curveTo(18.3984f, 26.0977f, 19.5234f, 25.0078f, 19.6055f, 23.332f)
                lineTo(20.4258f, 6.0703f)
                lineTo(18.5391f, 6.0703f)
                lineTo(17.7539f, 23.1328f)
                curveTo(17.7305f, 23.8359f, 17.2266f, 24.3281f, 16.5352f, 24.3281f)
                lineTo(6.1406f, 24.3281f)
                curveTo(5.4727f, 24.3281f, 4.9688f, 23.8242f, 4.9336f, 23.1328f)
                lineTo(4.1016f, 6.0703f)
                lineTo(2.2617f, 6.0703f)
                lineTo(3.0938f, 23.3438f)
                curveTo(3.1758f, 25.0195f, 4.2773f, 26.0977f, 5.9766f, 26.0977f)
                close()
                moveTo(7.875f, 22.3242f)
                curveTo(8.3203f, 22.3242f, 8.6133f, 22.043f, 8.6016f, 21.6328f)
                lineTo(8.2383f, 9.0938f)
                curveTo(8.2266f, 8.6836f, 7.9336f, 8.4141f, 7.5117f, 8.4141f)
                curveTo(7.0664f, 8.4141f, 6.7734f, 8.6953f, 6.7852f, 9.1055f)
                lineTo(7.1367f, 21.6328f)
                curveTo(7.1484f, 22.0547f, 7.4414f, 22.3242f, 7.875f, 22.3242f)
                close()
                moveTo(11.3438f, 22.3242f)
                curveTo(11.7891f, 22.3242f, 12.1055f, 22.043f, 12.1055f, 21.6328f)
                lineTo(12.1055f, 9.1055f)
                curveTo(12.1055f, 8.6953f, 11.7891f, 8.4141f, 11.3438f, 8.4141f)
                curveTo(10.8984f, 8.4141f, 10.5938f, 8.6953f, 10.5938f, 9.1055f)
                lineTo(10.5938f, 21.6328f)
                curveTo(10.5938f, 22.043f, 10.8984f, 22.3242f, 11.3438f, 22.3242f)
                close()
                moveTo(14.8242f, 22.3242f)
                curveTo(15.2461f, 22.3242f, 15.5391f, 22.0547f, 15.5508f, 21.6328f)
                lineTo(15.9023f, 9.1055f)
                curveTo(15.9141f, 8.6953f, 15.6211f, 8.4141f, 15.1758f, 8.4141f)
                curveTo(14.7539f, 8.4141f, 14.4609f, 8.6836f, 14.4492f, 9.1055f)
                lineTo(14.0977f, 21.6328f)
                curveTo(14.0859f, 22.043f, 14.3789f, 22.3242f, 14.8242f, 22.3242f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
