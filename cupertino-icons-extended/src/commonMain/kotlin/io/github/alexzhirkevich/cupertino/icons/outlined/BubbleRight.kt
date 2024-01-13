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

public val CupertinoIcons.Outlined.BubbleRight: ImageVector
    get() {
        if (_bubbleRight != null) {
            return _bubbleRight!!
        }
        _bubbleRight = Builder(name = "BubbleRight", defaultWidth = 25.8281.dp, defaultHeight =
                25.7461.dp, viewportWidth = 25.8281f, viewportHeight = 25.7461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6211f, 25.7461f)
                curveTo(19.4414f, 25.7461f, 19.8984f, 25.1602f, 19.8984f, 24.2578f)
                lineTo(19.8984f, 21.2109f)
                lineTo(20.4609f, 21.2109f)
                curveTo(23.9531f, 21.2109f, 25.8281f, 19.2891f, 25.8281f, 15.8438f)
                lineTo(25.8281f, 6.8672f)
                curveTo(25.8281f, 3.4219f, 23.9531f, 1.5f, 20.4609f, 1.5f)
                lineTo(5.3672f, 1.5f)
                curveTo(1.875f, 1.5f, 0.0f, 3.4336f, 0.0f, 6.8672f)
                lineTo(0.0f, 15.8438f)
                curveTo(0.0f, 19.2773f, 1.875f, 21.2109f, 5.3672f, 21.2109f)
                lineTo(12.8906f, 21.2109f)
                lineTo(16.9336f, 24.8086f)
                curveTo(17.6484f, 25.4414f, 18.0469f, 25.7461f, 18.6211f, 25.7461f)
                close()
                moveTo(18.1406f, 23.6016f)
                lineTo(14.3906f, 19.875f)
                curveTo(13.9453f, 19.418f, 13.6172f, 19.3242f, 12.9609f, 19.3242f)
                lineTo(5.3672f, 19.3242f)
                curveTo(3.0117f, 19.3242f, 1.8867f, 18.1172f, 1.8867f, 15.832f)
                lineTo(1.8867f, 6.8672f)
                curveTo(1.8867f, 4.582f, 3.0117f, 3.3867f, 5.3672f, 3.3867f)
                lineTo(20.4609f, 3.3867f)
                curveTo(22.8281f, 3.3867f, 23.9414f, 4.582f, 23.9414f, 6.8672f)
                lineTo(23.9414f, 15.832f)
                curveTo(23.9414f, 18.1172f, 22.8281f, 19.3242f, 20.4609f, 19.3242f)
                lineTo(19.0195f, 19.3242f)
                curveTo(18.3867f, 19.3242f, 18.1406f, 19.5703f, 18.1406f, 20.2031f)
                close()
            }
        }
        .build()
        return _bubbleRight!!
    }

private var _bubbleRight: ImageVector? = null
