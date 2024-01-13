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

public val CupertinoIcons.Filled.QuestionmarkApp: ImageVector
    get() {
        if (_questionmarkApp != null) {
            return _questionmarkApp!!
        }
        _questionmarkApp = Builder(name = "QuestionmarkApp", defaultWidth = 21.3281.dp,
                defaultHeight = 21.3398.dp, viewportWidth = 21.3281f, viewportHeight =
                21.3398f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.957f, 1.3828f)
                curveTo(18.7617f, 0.1875f, 17.0742f, 0.0f, 15.0703f, 0.0f)
                lineTo(6.2227f, 0.0f)
                curveTo(4.2539f, 0.0f, 2.5664f, 0.1875f, 1.3711f, 1.3828f)
                curveTo(0.1758f, 2.5781f, 0.0f, 4.2539f, 0.0f, 6.2109f)
                lineTo(0.0f, 15.0703f)
                curveTo(0.0f, 17.0742f, 0.1758f, 18.7383f, 1.3711f, 19.9336f)
                curveTo(2.5664f, 21.1289f, 4.2539f, 21.3164f, 6.2461f, 21.3164f)
                lineTo(15.0703f, 21.3164f)
                curveTo(17.0742f, 21.3164f, 18.7617f, 21.1289f, 19.957f, 19.9336f)
                curveTo(21.1523f, 18.7383f, 21.3281f, 17.0742f, 21.3281f, 15.0703f)
                lineTo(21.3281f, 6.2461f)
                curveTo(21.3281f, 4.2422f, 21.1523f, 2.5664f, 19.957f, 1.3828f)
                close()
                moveTo(10.4297f, 13.1719f)
                curveTo(9.7969f, 13.1719f, 9.457f, 12.8438f, 9.457f, 12.2109f)
                curveTo(9.457f, 12.1641f, 9.457f, 12.1055f, 9.457f, 12.0586f)
                curveTo(9.457f, 10.8633f, 10.1016f, 10.2305f, 10.9688f, 9.6211f)
                curveTo(12.0234f, 8.8828f, 12.5391f, 8.4844f, 12.5391f, 7.6641f)
                curveTo(12.5391f, 6.75f, 11.8125f, 6.1289f, 10.7227f, 6.1289f)
                curveTo(9.9258f, 6.1289f, 9.293f, 6.5273f, 8.8594f, 7.2305f)
                lineTo(8.6484f, 7.5234f)
                curveTo(8.4258f, 7.8047f, 8.168f, 8.0039f, 7.7578f, 8.0039f)
                curveTo(7.3477f, 8.0039f, 6.9141f, 7.7109f, 6.9141f, 7.1719f)
                curveTo(6.9141f, 6.9609f, 6.9609f, 6.7617f, 7.0195f, 6.5742f)
                curveTo(7.3594f, 5.4609f, 8.7188f, 4.4883f, 10.8047f, 4.4883f)
                curveTo(12.8672f, 4.4883f, 14.6484f, 5.5547f, 14.6484f, 7.5703f)
                curveTo(14.6484f, 9.0234f, 13.8047f, 9.7266f, 12.6328f, 10.5f)
                curveTo(11.8008f, 11.0508f, 11.4023f, 11.4844f, 11.4023f, 12.1641f)
                curveTo(11.4023f, 12.1992f, 11.4023f, 12.2578f, 11.4023f, 12.3047f)
                curveTo(11.4023f, 12.7852f, 11.0391f, 13.1719f, 10.4297f, 13.1719f)
                close()
                moveTo(10.3945f, 16.7695f)
                curveTo(9.7031f, 16.7695f, 9.082f, 16.207f, 9.082f, 15.5156f)
                curveTo(9.082f, 14.8242f, 9.6914f, 14.25f, 10.3945f, 14.25f)
                curveTo(11.1094f, 14.25f, 11.707f, 14.8125f, 11.707f, 15.5156f)
                curveTo(11.707f, 16.2188f, 11.0977f, 16.7695f, 10.3945f, 16.7695f)
                close()
            }
        }
        .build()
        return _questionmarkApp!!
    }

private var _questionmarkApp: ImageVector? = null
