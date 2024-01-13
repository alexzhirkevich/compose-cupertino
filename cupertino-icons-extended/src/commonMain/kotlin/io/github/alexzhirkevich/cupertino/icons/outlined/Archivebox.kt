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

public val CupertinoIcons.Outlined.Archivebox: ImageVector
    get() {
        if (_archivebox != null) {
            return _archivebox!!
        }
        _archivebox = Builder(name = "Archivebox", defaultWidth = 23.4258.dp, defaultHeight =
                21.5977.dp, viewportWidth = 23.4258f, viewportHeight = 21.5977f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2852f, 21.5977f)
                lineTo(18.1406f, 21.5977f)
                curveTo(20.4492f, 21.5977f, 21.6797f, 20.4023f, 21.6797f, 18.1055f)
                lineTo(21.6797f, 5.5898f)
                lineTo(19.793f, 5.5898f)
                lineTo(19.793f, 18.1992f)
                curveTo(19.793f, 19.2539f, 19.207f, 19.8281f, 18.1641f, 19.8281f)
                lineTo(5.2617f, 19.8281f)
                curveTo(4.207f, 19.8281f, 3.6328f, 19.2539f, 3.6328f, 18.1992f)
                lineTo(3.6328f, 5.5898f)
                lineTo(1.7461f, 5.5898f)
                lineTo(1.7461f, 18.1055f)
                curveTo(1.7461f, 20.4141f, 2.9766f, 21.5977f, 5.2852f, 21.5977f)
                close()
                moveTo(7.8516f, 11.1914f)
                lineTo(15.5859f, 11.1914f)
                curveTo(16.0781f, 11.1914f, 16.4297f, 10.8516f, 16.4297f, 10.3359f)
                lineTo(16.4297f, 9.9609f)
                curveTo(16.4297f, 9.4453f, 16.0781f, 9.1172f, 15.5859f, 9.1172f)
                lineTo(7.8516f, 9.1172f)
                curveTo(7.3594f, 9.1172f, 7.0195f, 9.4453f, 7.0195f, 9.9609f)
                lineTo(7.0195f, 10.3359f)
                curveTo(7.0195f, 10.8516f, 7.3594f, 11.1914f, 7.8516f, 11.1914f)
                close()
                moveTo(2.2266f, 6.4688f)
                lineTo(21.1992f, 6.4688f)
                curveTo(22.6406f, 6.4688f, 23.4258f, 5.5664f, 23.4258f, 4.1367f)
                lineTo(23.4258f, 2.3555f)
                curveTo(23.4258f, 0.9258f, 22.6406f, 0.0234f, 21.1992f, 0.0234f)
                lineTo(2.2266f, 0.0234f)
                curveTo(0.8555f, 0.0234f, 0.0f, 0.9258f, 0.0f, 2.3555f)
                lineTo(0.0f, 4.1367f)
                curveTo(0.0f, 5.5664f, 0.7852f, 6.4688f, 2.2266f, 6.4688f)
                close()
                moveTo(2.707f, 4.6992f)
                curveTo(2.1211f, 4.6992f, 1.8867f, 4.4531f, 1.8867f, 3.8672f)
                lineTo(1.8867f, 2.625f)
                curveTo(1.8867f, 2.0391f, 2.1211f, 1.793f, 2.707f, 1.793f)
                lineTo(20.7305f, 1.793f)
                curveTo(21.3164f, 1.793f, 21.5391f, 2.0391f, 21.5391f, 2.625f)
                lineTo(21.5391f, 3.8672f)
                curveTo(21.5391f, 4.4531f, 21.3164f, 4.6992f, 20.7305f, 4.6992f)
                close()
            }
        }
        .build()
        return _archivebox!!
    }

private var _archivebox: ImageVector? = null
