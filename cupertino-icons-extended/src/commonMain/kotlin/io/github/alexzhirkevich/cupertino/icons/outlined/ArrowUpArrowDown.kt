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

public val CupertinoIcons.Outlined.ArrowUpArrowDown: ImageVector
    get() {
        if (_arrowUpArrowDown != null) {
            return _arrowUpArrowDown!!
        }
        _arrowUpArrowDown = Builder(name = "ArrowUpArrowDown", defaultWidth = 27.4219.dp,
                defaultHeight = 22.0342.dp, viewportWidth = 27.4219f, viewportHeight =
                22.0342f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2461f, 0.3589f)
                lineTo(0.3281f, 6.3941f)
                curveTo(0.1289f, 6.605f, 0.0f, 6.9097f, 0.0f, 7.1675f)
                curveTo(0.0f, 7.7886f, 0.4219f, 8.2105f, 1.0313f, 8.2105f)
                curveTo(1.3359f, 8.2105f, 1.5703f, 8.105f, 1.7695f, 7.9058f)
                lineTo(4.207f, 5.3862f)
                lineTo(6.0938f, 3.2066f)
                lineTo(5.9766f, 5.9136f)
                lineTo(5.9766f, 20.9722f)
                curveTo(5.9766f, 21.5933f, 6.4102f, 22.0269f, 7.0313f, 22.0269f)
                curveTo(7.6406f, 22.0269f, 8.0742f, 21.5933f, 8.0742f, 20.9722f)
                lineTo(8.0742f, 5.9136f)
                lineTo(7.9688f, 3.2066f)
                lineTo(9.8438f, 5.3862f)
                lineTo(12.293f, 7.9058f)
                curveTo(12.4922f, 8.105f, 12.7148f, 8.2105f, 13.0195f, 8.2105f)
                curveTo(13.6289f, 8.2105f, 14.0508f, 7.7886f, 14.0508f, 7.1675f)
                curveTo(14.0508f, 6.9097f, 13.9336f, 6.605f, 13.7227f, 6.3941f)
                lineTo(7.8164f, 0.3589f)
                curveTo(7.3828f, -0.0981f, 6.6914f, -0.1216f, 6.2461f, 0.3589f)
                close()
                moveTo(21.1875f, 21.687f)
                lineTo(27.0938f, 15.6284f)
                curveTo(27.3047f, 15.4292f, 27.4219f, 15.1245f, 27.4219f, 14.855f)
                curveTo(27.4219f, 14.2339f, 27.0f, 13.8237f, 26.3906f, 13.8237f)
                curveTo(26.0859f, 13.8237f, 25.8633f, 13.9175f, 25.6641f, 14.1167f)
                lineTo(23.2266f, 16.6362f)
                lineTo(21.3398f, 18.8277f)
                lineTo(21.4453f, 16.1206f)
                lineTo(21.4453f, 1.062f)
                curveTo(21.4453f, 0.4527f, 21.0117f, 0.0073f, 20.4023f, 0.0073f)
                curveTo(19.7812f, 0.0073f, 19.3477f, 0.4527f, 19.3477f, 1.062f)
                lineTo(19.3477f, 16.1206f)
                lineTo(19.4648f, 18.8277f)
                lineTo(17.5781f, 16.6362f)
                lineTo(15.1406f, 14.1167f)
                curveTo(14.9414f, 13.9175f, 14.707f, 13.8237f, 14.4141f, 13.8237f)
                curveTo(13.8047f, 13.8237f, 13.3711f, 14.2339f, 13.3711f, 14.855f)
                curveTo(13.3711f, 15.1245f, 13.5f, 15.4292f, 13.7109f, 15.6284f)
                lineTo(19.6172f, 21.687f)
                curveTo(20.0508f, 22.1441f, 20.7305f, 22.1558f, 21.1875f, 21.687f)
                close()
            }
        }
        .build()
        return _arrowUpArrowDown!!
    }

private var _arrowUpArrowDown: ImageVector? = null
