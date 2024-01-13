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

public val CupertinoIcons.Outlined.ChecklistChecked: ImageVector
    get() {
        if (_checklistChecked != null) {
            return _checklistChecked!!
        }
        _checklistChecked = Builder(name = "ChecklistChecked", defaultWidth = 26.2734.dp,
                defaultHeight = 23.707.dp, viewportWidth = 26.2734f, viewportHeight =
                23.707f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.6055f, 5.9883f)
                lineTo(25.3711f, 5.9883f)
                curveTo(25.8633f, 5.9883f, 26.2734f, 5.6016f, 26.2734f, 5.0977f)
                curveTo(26.2734f, 4.6055f, 25.8633f, 4.2188f, 25.3711f, 4.2188f)
                lineTo(13.6055f, 4.2188f)
                curveTo(13.1133f, 4.2188f, 12.7148f, 4.6055f, 12.7148f, 5.0977f)
                curveTo(12.7148f, 5.6016f, 13.1133f, 5.9883f, 13.6055f, 5.9883f)
                close()
                moveTo(13.6055f, 19.5352f)
                lineTo(25.3711f, 19.5352f)
                curveTo(25.8633f, 19.5352f, 26.2734f, 19.1484f, 26.2734f, 18.6562f)
                curveTo(26.2734f, 18.1523f, 25.8633f, 17.7656f, 25.3711f, 17.7656f)
                lineTo(13.6055f, 17.7656f)
                curveTo(13.1133f, 17.7656f, 12.7148f, 18.1523f, 12.7148f, 18.6562f)
                curveTo(12.7148f, 19.1484f, 13.1133f, 19.5352f, 13.6055f, 19.5352f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0508f, 10.1367f)
                curveTo(7.8047f, 10.1367f, 10.1016f, 7.8516f, 10.1016f, 5.0977f)
                curveTo(10.1016f, 2.332f, 7.8047f, 0.0352f, 5.0508f, 0.0352f)
                curveTo(2.2852f, 0.0352f, 0.0f, 2.332f, 0.0f, 5.0977f)
                curveTo(0.0f, 7.8516f, 2.2969f, 10.1367f, 5.0508f, 10.1367f)
                close()
                moveTo(4.4531f, 7.8047f)
                curveTo(4.207f, 7.8047f, 4.043f, 7.6758f, 3.8672f, 7.4766f)
                lineTo(2.5547f, 5.8945f)
                curveTo(2.4375f, 5.7656f, 2.4023f, 5.625f, 2.4023f, 5.4375f)
                curveTo(2.4023f, 5.0977f, 2.6602f, 4.8281f, 2.9766f, 4.8281f)
                curveTo(3.1992f, 4.8281f, 3.3633f, 4.9219f, 3.5156f, 5.1211f)
                lineTo(4.4297f, 6.2813f)
                lineTo(6.5156f, 2.9297f)
                curveTo(6.6563f, 2.7188f, 6.832f, 2.6016f, 7.043f, 2.6016f)
                curveTo(7.3711f, 2.6016f, 7.6523f, 2.8594f, 7.6523f, 3.1523f)
                curveTo(7.6523f, 3.3164f, 7.6055f, 3.457f, 7.5f, 3.6328f)
                lineTo(5.0508f, 7.4766f)
                curveTo(4.9219f, 7.6875f, 4.7109f, 7.8047f, 4.4531f, 7.8047f)
                close()
                moveTo(5.0508f, 23.707f)
                curveTo(7.8047f, 23.707f, 10.1016f, 21.4219f, 10.1016f, 18.668f)
                curveTo(10.1016f, 15.8906f, 7.8047f, 13.5938f, 5.0508f, 13.5938f)
                curveTo(2.2852f, 13.5938f, 0.0f, 15.8906f, 0.0f, 18.668f)
                curveTo(0.0f, 21.4219f, 2.2969f, 23.707f, 5.0508f, 23.707f)
                close()
                moveTo(4.4531f, 21.375f)
                curveTo(4.207f, 21.375f, 4.043f, 21.2344f, 3.8672f, 21.0469f)
                lineTo(2.5547f, 19.4531f)
                curveTo(2.4375f, 19.3242f, 2.4023f, 19.1836f, 2.4023f, 18.9961f)
                curveTo(2.4023f, 18.6562f, 2.6602f, 18.3984f, 2.9766f, 18.3984f)
                curveTo(3.1992f, 18.3984f, 3.3633f, 18.4805f, 3.5156f, 18.6914f)
                lineTo(4.4297f, 19.8516f)
                lineTo(6.5156f, 16.5f)
                curveTo(6.6563f, 16.2773f, 6.832f, 16.1602f, 7.043f, 16.1602f)
                curveTo(7.3711f, 16.1602f, 7.6523f, 16.418f, 7.6523f, 16.7227f)
                curveTo(7.6523f, 16.8867f, 7.6055f, 17.0156f, 7.5f, 17.1914f)
                lineTo(5.0508f, 21.0352f)
                curveTo(4.9219f, 21.2578f, 4.7109f, 21.375f, 4.4531f, 21.375f)
                close()
            }
        }
        .build()
        return _checklistChecked!!
    }

private var _checklistChecked: ImageVector? = null
