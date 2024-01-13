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

public val CupertinoIcons.Outlined.MappinSlash: ImageVector
    get() {
        if (_mappinSlash != null) {
            return _mappinSlash!!
        }
        _mappinSlash = Builder(name = "MappinSlash", defaultWidth = 18.1509.dp, defaultHeight =
                25.7461.dp, viewportWidth = 18.1509f, viewportHeight = 25.7461f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1065f, 4.418f)
                curveTo(5.1065f, 6.4805f, 6.501f, 8.2031f, 8.4111f, 8.6836f)
                lineTo(8.4111f, 10.1133f)
                lineTo(10.5908f, 12.293f)
                lineTo(10.5908f, 8.6836f)
                curveTo(12.501f, 8.2148f, 13.9072f, 6.4805f, 13.9072f, 4.418f)
                curveTo(13.9072f, 1.9922f, 11.9502f, 0.0f, 9.501f, 0.0f)
                curveTo(7.0635f, 0.0f, 5.1065f, 1.9922f, 5.1065f, 4.418f)
                close()
                moveTo(8.4111f, 19.5586f)
                curveTo(8.4111f, 23.0156f, 9.0322f, 24.9023f, 9.501f, 24.9023f)
                curveTo(9.9463f, 24.9023f, 10.5791f, 23.2266f, 10.5791f, 20.3203f)
                lineTo(10.5791f, 18.6914f)
                lineTo(8.4111f, 16.5234f)
                close()
                moveTo(8.2471f, 4.6641f)
                curveTo(7.4385f, 4.6641f, 6.7354f, 3.9609f, 6.7354f, 3.1406f)
                curveTo(6.7354f, 2.332f, 7.4385f, 1.6406f, 8.2471f, 1.6406f)
                curveTo(9.0674f, 1.6406f, 9.7471f, 2.332f, 9.7471f, 3.1406f)
                curveTo(9.7471f, 3.9609f, 9.0674f, 4.6641f, 8.2471f, 4.6641f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6143f, 22.7812f)
                curveTo(16.9658f, 23.1328f, 17.5518f, 23.1328f, 17.8916f, 22.7812f)
                curveTo(18.2314f, 22.4297f, 18.2432f, 21.8672f, 17.8916f, 21.5039f)
                lineTo(1.5439f, 5.168f)
                curveTo(1.1924f, 4.8281f, 0.6064f, 4.8164f, 0.2549f, 5.168f)
                curveTo(-0.085f, 5.5078f, -0.085f, 6.1055f, 0.2549f, 6.4453f)
                close()
            }
        }
        .build()
        return _mappinSlash!!
    }

private var _mappinSlash: ImageVector? = null
