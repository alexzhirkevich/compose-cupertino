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

public val CupertinoIcons.Outlined.CheckmarkCircle: ImageVector
    get() {
        if (_checkmarkCircle != null) {
            return _checkmarkCircle!!
        }
        _checkmarkCircle = Builder(name = "CheckmarkCircle", defaultWidth = 23.9062.dp,
                defaultHeight = 23.918.dp, viewportWidth = 23.9062f, viewportHeight =
                23.918f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9531f, 23.9062f)
                curveTo(18.4922f, 23.9062f, 23.9062f, 18.4805f, 23.9062f, 11.9531f)
                curveTo(23.9062f, 5.4141f, 18.4805f, 0.0f, 11.9414f, 0.0f)
                curveTo(5.4141f, 0.0f, 0.0f, 5.4141f, 0.0f, 11.9531f)
                curveTo(0.0f, 18.4805f, 5.4258f, 23.9062f, 11.9531f, 23.9062f)
                close()
                moveTo(11.9531f, 21.9141f)
                curveTo(6.4219f, 21.9141f, 2.0039f, 17.4844f, 2.0039f, 11.9531f)
                curveTo(2.0039f, 6.4219f, 6.4102f, 1.9922f, 11.9414f, 1.9922f)
                curveTo(17.4727f, 1.9922f, 21.9141f, 6.4219f, 21.9141f, 11.9531f)
                curveTo(21.9141f, 17.4844f, 17.4844f, 21.9141f, 11.9531f, 21.9141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6641f, 17.5195f)
                curveTo(11.0508f, 17.5195f, 11.3789f, 17.332f, 11.6133f, 16.9688f)
                lineTo(16.9688f, 8.543f)
                curveTo(17.0977f, 8.3086f, 17.25f, 8.0508f, 17.25f, 7.793f)
                curveTo(17.25f, 7.2656f, 16.7812f, 6.9258f, 16.2891f, 6.9258f)
                curveTo(15.9961f, 6.9258f, 15.7031f, 7.1133f, 15.4805f, 7.4531f)
                lineTo(10.6172f, 15.2578f)
                lineTo(8.3086f, 12.2695f)
                curveTo(8.0273f, 11.8945f, 7.7695f, 11.8008f, 7.4414f, 11.8008f)
                curveTo(6.9375f, 11.8008f, 6.5391f, 12.2109f, 6.5391f, 12.7266f)
                curveTo(6.5391f, 12.9844f, 6.6445f, 13.2305f, 6.8086f, 13.4531f)
                lineTo(9.668f, 16.9688f)
                curveTo(9.9609f, 17.3555f, 10.2773f, 17.5195f, 10.6641f, 17.5195f)
                close()
            }
        }
        .build()
        return _checkmarkCircle!!
    }

private var _checkmarkCircle: ImageVector? = null
