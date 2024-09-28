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

@file:Suppress("UnusedReceiverParameter")

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

public val CupertinoIcons.Outlined.BubbleLeft: ImageVector
    get() {
        if (_bubbleLeft != null) {
            return _bubbleLeft!!
        }
        _bubbleLeft = Builder(name = "BubbleLeft", defaultWidth = 25.8281.dp, defaultHeight =
                25.7461.dp, viewportWidth = 25.8281f, viewportHeight = 25.7461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.207f, 25.7461f)
                curveTo(7.7813f, 25.7461f, 8.1797f, 25.4414f, 8.8945f, 24.8086f)
                lineTo(12.9375f, 21.2109f)
                lineTo(20.4609f, 21.2109f)
                curveTo(23.9531f, 21.2109f, 25.8281f, 19.2773f, 25.8281f, 15.8438f)
                lineTo(25.8281f, 6.8672f)
                curveTo(25.8281f, 3.4336f, 23.9531f, 1.5f, 20.4609f, 1.5f)
                lineTo(5.3672f, 1.5f)
                curveTo(1.875f, 1.5f, 0.0f, 3.4219f, 0.0f, 6.8672f)
                lineTo(0.0f, 15.8438f)
                curveTo(0.0f, 19.2891f, 1.875f, 21.2109f, 5.3672f, 21.2109f)
                lineTo(5.9297f, 21.2109f)
                lineTo(5.9297f, 24.2578f)
                curveTo(5.9297f, 25.1602f, 6.3867f, 25.7461f, 7.207f, 25.7461f)
                close()
                moveTo(7.6875f, 23.6016f)
                lineTo(7.6875f, 20.2031f)
                curveTo(7.6875f, 19.5703f, 7.4414f, 19.3242f, 6.8086f, 19.3242f)
                lineTo(5.3672f, 19.3242f)
                curveTo(3.0f, 19.3242f, 1.8867f, 18.1172f, 1.8867f, 15.832f)
                lineTo(1.8867f, 6.8672f)
                curveTo(1.8867f, 4.582f, 3.0f, 3.3867f, 5.3672f, 3.3867f)
                lineTo(20.4609f, 3.3867f)
                curveTo(22.8164f, 3.3867f, 23.9414f, 4.582f, 23.9414f, 6.8672f)
                lineTo(23.9414f, 15.832f)
                curveTo(23.9414f, 18.1172f, 22.8164f, 19.3242f, 20.4609f, 19.3242f)
                lineTo(12.8672f, 19.3242f)
                curveTo(12.2109f, 19.3242f, 11.8828f, 19.418f, 11.4375f, 19.875f)
                close()
            }
        }
        .build()
        return _bubbleLeft!!
    }

private var _bubbleLeft: ImageVector? = null
