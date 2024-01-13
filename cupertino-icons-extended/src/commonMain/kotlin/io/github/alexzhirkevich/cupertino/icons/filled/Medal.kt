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

public val CupertinoIcons.Filled.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 22.3095.dp, defaultHeight = 26.4492.dp,
                viewportWidth = 22.3095f, viewportHeight = 26.4492f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.148f, 26.4375f)
                curveTo(15.273f, 26.4375f, 18.6011f, 23.1094f, 18.6011f, 18.9961f)
                curveTo(18.6011f, 14.8711f, 15.273f, 11.543f, 11.148f, 11.543f)
                curveTo(7.0347f, 11.543f, 3.7066f, 14.8711f, 3.7066f, 18.9961f)
                curveTo(3.7066f, 23.1094f, 7.0347f, 26.4375f, 11.148f, 26.4375f)
                close()
                moveTo(9.0269f, 22.8281f)
                curveTo(8.5816f, 23.1562f, 8.1128f, 22.8164f, 8.2886f, 22.3008f)
                lineTo(9.1323f, 19.7812f)
                lineTo(6.9761f, 18.2461f)
                curveTo(6.5659f, 17.9414f, 6.6948f, 17.3672f, 7.2573f, 17.3672f)
                lineTo(9.9058f, 17.3906f)
                lineTo(10.7144f, 14.8594f)
                curveTo(10.8784f, 14.3438f, 11.4409f, 14.3438f, 11.605f, 14.8594f)
                lineTo(12.4136f, 17.3906f)
                lineTo(15.062f, 17.3672f)
                curveTo(15.6245f, 17.3672f, 15.7417f, 17.9531f, 15.3433f, 18.2344f)
                lineTo(13.187f, 19.7812f)
                lineTo(14.0308f, 22.3008f)
                curveTo(14.2066f, 22.8164f, 13.7378f, 23.1562f, 13.2925f, 22.8281f)
                lineTo(11.1597f, 21.2695f)
                close()
                moveTo(4.0113f, 13.418f)
                curveTo(5.1597f, 11.9648f, 6.7417f, 10.8633f, 8.5581f, 10.3242f)
                lineTo(3.2495f, 0.7852f)
                lineTo(0.1675f, 5.4844f)
                curveTo(-0.0434f, 5.7891f, -0.0551f, 6.1289f, 0.1324f, 6.4336f)
                close()
                moveTo(8.523f, 6.3281f)
                lineTo(13.7847f, 6.3281f)
                lineTo(17.3589f, 0.0f)
                lineTo(4.9488f, 0.0f)
                close()
                moveTo(13.7495f, 10.3242f)
                curveTo(15.5777f, 10.8633f, 17.148f, 11.9648f, 18.2964f, 13.418f)
                lineTo(22.187f, 6.4336f)
                curveTo(22.3628f, 6.1289f, 22.3511f, 5.7891f, 22.1402f, 5.4844f)
                lineTo(19.0581f, 0.7852f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
