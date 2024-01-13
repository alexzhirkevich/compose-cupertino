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

public val CupertinoIcons.Outlined.ListBulletIndent: ImageVector
    get() {
        if (_listBulletIndent != null) {
            return _listBulletIndent!!
        }
        _listBulletIndent = Builder(name = "ListBulletIndent", defaultWidth = 29.4609.dp,
                defaultHeight = 17.1445.dp, viewportWidth = 29.4609f, viewportHeight =
                17.1445f).apply {
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
                moveTo(9.5742f, 9.5273f)
                lineTo(25.5938f, 9.5273f)
                curveTo(26.1211f, 9.5273f, 26.5312f, 9.1055f, 26.5312f, 8.5781f)
                curveTo(26.5312f, 8.0508f, 26.1211f, 7.6406f, 25.5938f, 7.6406f)
                lineTo(9.5742f, 7.6406f)
                curveTo(9.0469f, 7.6406f, 8.6367f, 8.0508f, 8.6367f, 8.5781f)
                curveTo(8.6367f, 9.1055f, 9.0469f, 9.5273f, 9.5742f, 9.5273f)
                close()
                moveTo(12.5039f, 16.6055f)
                lineTo(28.5234f, 16.6055f)
                curveTo(29.0508f, 16.6055f, 29.4609f, 16.1953f, 29.4609f, 15.668f)
                curveTo(29.4609f, 15.1289f, 29.0508f, 14.7188f, 28.5234f, 14.7188f)
                lineTo(12.5039f, 14.7188f)
                curveTo(11.9766f, 14.7188f, 11.5664f, 15.1289f, 11.5664f, 15.668f)
                curveTo(11.5664f, 16.1953f, 11.9766f, 16.6055f, 12.5039f, 16.6055f)
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
                moveTo(4.4063f, 10.0547f)
                curveTo(5.2148f, 10.0547f, 5.8828f, 9.3984f, 5.8828f, 8.5781f)
                curveTo(5.8828f, 7.7578f, 5.2148f, 7.1016f, 4.4063f, 7.1016f)
                curveTo(3.5859f, 7.1016f, 2.9297f, 7.7578f, 2.9297f, 8.5781f)
                curveTo(2.9297f, 9.3984f, 3.5859f, 10.0547f, 4.4063f, 10.0547f)
                close()
                moveTo(7.3242f, 17.1445f)
                curveTo(8.1445f, 17.1445f, 8.8008f, 16.4766f, 8.8008f, 15.668f)
                curveTo(8.8008f, 14.8477f, 8.1445f, 14.1914f, 7.3242f, 14.1914f)
                curveTo(6.5156f, 14.1914f, 5.8477f, 14.8477f, 5.8477f, 15.668f)
                curveTo(5.8477f, 16.4766f, 6.5156f, 17.1445f, 7.3242f, 17.1445f)
                close()
            }
        }
        .build()
        return _listBulletIndent!!
    }

private var _listBulletIndent: ImageVector? = null
