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

public val CupertinoIcons.Filled.ExclamationmarkIcloud: ImageVector
    get() {
        if (_exclamationmarkIcloud != null) {
            return _exclamationmarkIcloud!!
        }
        _exclamationmarkIcloud = Builder(name = "ExclamationmarkIcloud", defaultWidth = 29.4609.dp,
                defaultHeight = 22.2773.dp, viewportWidth = 29.4609f, viewportHeight =
                22.2773f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.1562f, 20.3672f)
                curveTo(26.6953f, 20.3672f, 29.4609f, 17.7773f, 29.4609f, 14.5547f)
                curveTo(29.4609f, 12.0938f, 28.043f, 9.9609f, 25.7578f, 9.0f)
                curveTo(25.7812f, 3.7734f, 22.0195f, 0.0f, 17.2266f, 0.0f)
                curveTo(14.0508f, 0.0f, 11.7891f, 1.6992f, 10.3828f, 3.75f)
                curveTo(7.5f, 2.9063f, 4.3594f, 5.0977f, 4.3008f, 8.3789f)
                curveTo(1.6523f, 8.8008f, 0.0f, 11.168f, 0.0f, 14.0273f)
                curveTo(0.0f, 17.4727f, 3.0117f, 20.3672f, 7.0195f, 20.3672f)
                close()
                moveTo(14.7422f, 12.6328f)
                curveTo(14.1328f, 12.6328f, 13.7812f, 12.2812f, 13.7578f, 11.6484f)
                lineTo(13.6055f, 6.4922f)
                curveTo(13.582f, 5.8594f, 14.0625f, 5.3906f, 14.7305f, 5.3906f)
                curveTo(15.3867f, 5.3906f, 15.9023f, 5.8711f, 15.8789f, 6.5039f)
                lineTo(15.7031f, 11.6484f)
                curveTo(15.6797f, 12.293f, 15.3398f, 12.6328f, 14.7422f, 12.6328f)
                close()
                moveTo(14.7305f, 16.957f)
                curveTo(14.0625f, 16.957f, 13.418f, 16.418f, 13.418f, 15.6914f)
                curveTo(13.418f, 14.9648f, 14.0508f, 14.4258f, 14.7305f, 14.4258f)
                curveTo(15.4219f, 14.4258f, 16.043f, 14.9531f, 16.043f, 15.6914f)
                curveTo(16.043f, 16.4297f, 15.4102f, 16.957f, 14.7305f, 16.957f)
                close()
            }
        }
        .build()
        return _exclamationmarkIcloud!!
    }

private var _exclamationmarkIcloud: ImageVector? = null
