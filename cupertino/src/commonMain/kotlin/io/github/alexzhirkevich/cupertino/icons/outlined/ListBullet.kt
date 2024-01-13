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

public val CupertinoIcons.Outlined.ListBullet: ImageVector
    get() {
        if (_listBullet != null) {
            return _listBullet!!
        }
        _listBullet = Builder(name = "ListBullet", defaultWidth = 23.6133.dp, defaultHeight =
                17.1445.dp, viewportWidth = 23.6133f, viewportHeight = 17.1445f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6563f, 2.4375f)
                lineTo(22.6641f, 2.4375f)
                curveTo(23.1914f, 2.4375f, 23.6133f, 2.0273f, 23.6133f, 1.5f)
                curveTo(23.6133f, 0.9609f, 23.1914f, 0.5508f, 22.6641f, 0.5508f)
                lineTo(6.6563f, 0.5508f)
                curveTo(6.1172f, 0.5508f, 5.707f, 0.9609f, 5.707f, 1.5f)
                curveTo(5.707f, 2.0273f, 6.1172f, 2.4375f, 6.6563f, 2.4375f)
                close()
                moveTo(6.6563f, 9.5273f)
                lineTo(22.6641f, 9.5273f)
                curveTo(23.1914f, 9.5273f, 23.6133f, 9.1055f, 23.6133f, 8.5781f)
                curveTo(23.6133f, 8.0508f, 23.1914f, 7.6406f, 22.6641f, 7.6406f)
                lineTo(6.6563f, 7.6406f)
                curveTo(6.1172f, 7.6406f, 5.707f, 8.0508f, 5.707f, 8.5781f)
                curveTo(5.707f, 9.1055f, 6.1172f, 9.5273f, 6.6563f, 9.5273f)
                close()
                moveTo(6.6563f, 16.6055f)
                lineTo(22.6641f, 16.6055f)
                curveTo(23.1914f, 16.6055f, 23.6133f, 16.1953f, 23.6133f, 15.668f)
                curveTo(23.6133f, 15.1289f, 23.1914f, 14.7188f, 22.6641f, 14.7188f)
                lineTo(6.6563f, 14.7188f)
                curveTo(6.1172f, 14.7188f, 5.707f, 15.1289f, 5.707f, 15.668f)
                curveTo(5.707f, 16.1953f, 6.1172f, 16.6055f, 6.6563f, 16.6055f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4766f, 2.9648f)
                curveTo(2.2969f, 2.9648f, 2.9531f, 2.3086f, 2.9531f, 1.5f)
                curveTo(2.9531f, 0.6797f, 2.2969f, 0.0234f, 1.4766f, 0.0234f)
                curveTo(0.6563f, 0.0234f, 0.0f, 0.6797f, 0.0f, 1.5f)
                curveTo(0.0f, 2.3086f, 0.6563f, 2.9648f, 1.4766f, 2.9648f)
                close()
                moveTo(1.4766f, 10.0547f)
                curveTo(2.2969f, 10.0547f, 2.9531f, 9.3984f, 2.9531f, 8.5781f)
                curveTo(2.9531f, 7.7578f, 2.2969f, 7.1016f, 1.4766f, 7.1016f)
                curveTo(0.6563f, 7.1016f, 0.0f, 7.7578f, 0.0f, 8.5781f)
                curveTo(0.0f, 9.3984f, 0.6563f, 10.0547f, 1.4766f, 10.0547f)
                close()
                moveTo(1.4766f, 17.1445f)
                curveTo(2.2969f, 17.1445f, 2.9531f, 16.4766f, 2.9531f, 15.668f)
                curveTo(2.9531f, 14.8477f, 2.2969f, 14.1914f, 1.4766f, 14.1914f)
                curveTo(0.6563f, 14.1914f, 0.0f, 14.8477f, 0.0f, 15.668f)
                curveTo(0.0f, 16.4766f, 0.6563f, 17.1445f, 1.4766f, 17.1445f)
                close()
            }
        }
        .build()
        return _listBullet!!
    }

private var _listBullet: ImageVector? = null
