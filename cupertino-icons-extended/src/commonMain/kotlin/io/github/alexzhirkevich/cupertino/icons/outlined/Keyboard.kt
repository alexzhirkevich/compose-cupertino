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

public val CupertinoIcons.Outlined.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 29.4961.dp, defaultHeight =
                18.5273.dp, viewportWidth = 29.4961f, viewportHeight = 18.5273f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6797f, 18.5156f)
                lineTo(25.8164f, 18.5156f)
                curveTo(28.2539f, 18.5156f, 29.4961f, 17.2969f, 29.4961f, 14.8828f)
                lineTo(29.4961f, 3.6211f)
                curveTo(29.4961f, 1.2188f, 28.2539f, 0.0f, 25.8164f, 0.0f)
                lineTo(3.6797f, 0.0f)
                curveTo(1.2188f, 0.0f, 0.0f, 1.207f, 0.0f, 3.6211f)
                lineTo(0.0f, 14.8828f)
                curveTo(0.0f, 17.2969f, 1.2188f, 18.5156f, 3.6797f, 18.5156f)
                close()
                moveTo(3.7031f, 16.6289f)
                curveTo(2.5313f, 16.6289f, 1.8867f, 15.9961f, 1.8867f, 14.7773f)
                lineTo(1.8867f, 3.7266f)
                curveTo(1.8867f, 2.5078f, 2.5313f, 1.8867f, 3.7031f, 1.8867f)
                lineTo(25.7812f, 1.8867f)
                curveTo(26.9414f, 1.8867f, 27.6094f, 2.5078f, 27.6094f, 3.7266f)
                lineTo(27.6094f, 14.7773f)
                curveTo(27.6094f, 15.9961f, 26.9414f, 16.6289f, 25.7812f, 16.6289f)
                close()
                moveTo(4.7578f, 6.5273f)
                lineTo(5.8359f, 6.5273f)
                curveTo(6.1641f, 6.5273f, 6.3633f, 6.3281f, 6.3633f, 6.0117f)
                lineTo(6.3633f, 4.9336f)
                curveTo(6.3633f, 4.6055f, 6.1641f, 4.4063f, 5.8359f, 4.4063f)
                lineTo(4.7578f, 4.4063f)
                curveTo(4.4414f, 4.4063f, 4.2422f, 4.6055f, 4.2422f, 4.9336f)
                lineTo(4.2422f, 6.0117f)
                curveTo(4.2422f, 6.3281f, 4.4414f, 6.5273f, 4.7578f, 6.5273f)
                close()
                moveTo(8.5313f, 6.5273f)
                lineTo(9.6094f, 6.5273f)
                curveTo(9.9258f, 6.5273f, 10.125f, 6.3281f, 10.125f, 6.0117f)
                lineTo(10.125f, 4.9336f)
                curveTo(10.125f, 4.6055f, 9.9258f, 4.4063f, 9.6094f, 4.4063f)
                lineTo(8.5313f, 4.4063f)
                curveTo(8.2031f, 4.4063f, 8.0039f, 4.6055f, 8.0039f, 4.9336f)
                lineTo(8.0039f, 6.0117f)
                curveTo(8.0039f, 6.3281f, 8.2031f, 6.5273f, 8.5313f, 6.5273f)
                close()
                moveTo(12.3047f, 6.5273f)
                lineTo(13.3711f, 6.5273f)
                curveTo(13.6992f, 6.5273f, 13.8984f, 6.3281f, 13.8984f, 6.0117f)
                lineTo(13.8984f, 4.9336f)
                curveTo(13.8984f, 4.6055f, 13.6992f, 4.4063f, 13.3711f, 4.4063f)
                lineTo(12.3047f, 4.4063f)
                curveTo(11.9766f, 4.4063f, 11.7773f, 4.6055f, 11.7773f, 4.9336f)
                lineTo(11.7773f, 6.0117f)
                curveTo(11.7773f, 6.3281f, 11.9766f, 6.5273f, 12.3047f, 6.5273f)
                close()
                moveTo(16.0664f, 6.5273f)
                lineTo(17.1445f, 6.5273f)
                curveTo(17.4727f, 6.5273f, 17.6719f, 6.3281f, 17.6719f, 6.0117f)
                lineTo(17.6719f, 4.9336f)
                curveTo(17.6719f, 4.6055f, 17.4727f, 4.4063f, 17.1445f, 4.4063f)
                lineTo(16.0664f, 4.4063f)
                curveTo(15.75f, 4.4063f, 15.5508f, 4.6055f, 15.5508f, 4.9336f)
                lineTo(15.5508f, 6.0117f)
                curveTo(15.5508f, 6.3281f, 15.75f, 6.5273f, 16.0664f, 6.5273f)
                close()
                moveTo(19.8398f, 6.5273f)
                lineTo(20.918f, 6.5273f)
                curveTo(21.2344f, 6.5273f, 21.4336f, 6.3281f, 21.4336f, 6.0117f)
                lineTo(21.4336f, 4.9336f)
                curveTo(21.4336f, 4.6055f, 21.2344f, 4.4063f, 20.918f, 4.4063f)
                lineTo(19.8398f, 4.4063f)
                curveTo(19.5117f, 4.4063f, 19.3125f, 4.6055f, 19.3125f, 4.9336f)
                lineTo(19.3125f, 6.0117f)
                curveTo(19.3125f, 6.3281f, 19.5117f, 6.5273f, 19.8398f, 6.5273f)
                close()
                moveTo(23.6133f, 6.5273f)
                lineTo(24.6797f, 6.5273f)
                curveTo(25.0078f, 6.5273f, 25.207f, 6.3281f, 25.207f, 6.0117f)
                lineTo(25.207f, 4.9336f)
                curveTo(25.207f, 4.6055f, 25.0078f, 4.4063f, 24.6797f, 4.4063f)
                lineTo(23.6133f, 4.4063f)
                curveTo(23.2852f, 4.4063f, 23.0859f, 4.6055f, 23.0859f, 4.9336f)
                lineTo(23.0859f, 6.0117f)
                curveTo(23.0859f, 6.3281f, 23.2852f, 6.5273f, 23.6133f, 6.5273f)
                close()
                moveTo(4.7578f, 10.3008f)
                lineTo(5.8359f, 10.3008f)
                curveTo(6.1641f, 10.3008f, 6.3633f, 10.1016f, 6.3633f, 9.7734f)
                lineTo(6.3633f, 8.707f)
                curveTo(6.3633f, 8.3789f, 6.1641f, 8.1797f, 5.8359f, 8.1797f)
                lineTo(4.7578f, 8.1797f)
                curveTo(4.4414f, 8.1797f, 4.2422f, 8.3789f, 4.2422f, 8.707f)
                lineTo(4.2422f, 9.7734f)
                curveTo(4.2422f, 10.1016f, 4.4414f, 10.3008f, 4.7578f, 10.3008f)
                close()
                moveTo(8.5313f, 10.3008f)
                lineTo(9.6094f, 10.3008f)
                curveTo(9.9258f, 10.3008f, 10.125f, 10.1016f, 10.125f, 9.7734f)
                lineTo(10.125f, 8.707f)
                curveTo(10.125f, 8.3789f, 9.9258f, 8.1797f, 9.6094f, 8.1797f)
                lineTo(8.5313f, 8.1797f)
                curveTo(8.2031f, 8.1797f, 8.0039f, 8.3789f, 8.0039f, 8.707f)
                lineTo(8.0039f, 9.7734f)
                curveTo(8.0039f, 10.1016f, 8.2031f, 10.3008f, 8.5313f, 10.3008f)
                close()
                moveTo(12.3047f, 10.3008f)
                lineTo(13.3711f, 10.3008f)
                curveTo(13.6992f, 10.3008f, 13.8984f, 10.1016f, 13.8984f, 9.7734f)
                lineTo(13.8984f, 8.707f)
                curveTo(13.8984f, 8.3789f, 13.6992f, 8.1797f, 13.3711f, 8.1797f)
                lineTo(12.3047f, 8.1797f)
                curveTo(11.9766f, 8.1797f, 11.7773f, 8.3789f, 11.7773f, 8.707f)
                lineTo(11.7773f, 9.7734f)
                curveTo(11.7773f, 10.1016f, 11.9766f, 10.3008f, 12.3047f, 10.3008f)
                close()
                moveTo(16.0664f, 10.3008f)
                lineTo(17.1445f, 10.3008f)
                curveTo(17.4727f, 10.3008f, 17.6719f, 10.1016f, 17.6719f, 9.7734f)
                lineTo(17.6719f, 8.707f)
                curveTo(17.6719f, 8.3789f, 17.4727f, 8.1797f, 17.1445f, 8.1797f)
                lineTo(16.0664f, 8.1797f)
                curveTo(15.75f, 8.1797f, 15.5508f, 8.3789f, 15.5508f, 8.707f)
                lineTo(15.5508f, 9.7734f)
                curveTo(15.5508f, 10.1016f, 15.75f, 10.3008f, 16.0664f, 10.3008f)
                close()
                moveTo(19.8398f, 10.3008f)
                lineTo(20.918f, 10.3008f)
                curveTo(21.2344f, 10.3008f, 21.4336f, 10.1016f, 21.4336f, 9.7734f)
                lineTo(21.4336f, 8.707f)
                curveTo(21.4336f, 8.3789f, 21.2344f, 8.1797f, 20.918f, 8.1797f)
                lineTo(19.8398f, 8.1797f)
                curveTo(19.5117f, 8.1797f, 19.3125f, 8.3789f, 19.3125f, 8.707f)
                lineTo(19.3125f, 9.7734f)
                curveTo(19.3125f, 10.1016f, 19.5117f, 10.3008f, 19.8398f, 10.3008f)
                close()
                moveTo(23.6133f, 10.3008f)
                lineTo(24.6797f, 10.3008f)
                curveTo(25.0078f, 10.3008f, 25.207f, 10.1016f, 25.207f, 9.7734f)
                lineTo(25.207f, 8.707f)
                curveTo(25.207f, 8.3789f, 25.0078f, 8.1797f, 24.6797f, 8.1797f)
                lineTo(23.6133f, 8.1797f)
                curveTo(23.2852f, 8.1797f, 23.0859f, 8.3789f, 23.0859f, 8.707f)
                lineTo(23.0859f, 9.7734f)
                curveTo(23.0859f, 10.1016f, 23.2852f, 10.3008f, 23.6133f, 10.3008f)
                close()
                moveTo(4.7578f, 14.0742f)
                lineTo(5.8359f, 14.0742f)
                curveTo(6.1641f, 14.0742f, 6.3633f, 13.875f, 6.3633f, 13.5469f)
                lineTo(6.3633f, 12.4688f)
                curveTo(6.3633f, 12.1523f, 6.1641f, 11.9531f, 5.8359f, 11.9531f)
                lineTo(4.7578f, 11.9531f)
                curveTo(4.4414f, 11.9531f, 4.2422f, 12.1523f, 4.2422f, 12.4688f)
                lineTo(4.2422f, 13.5469f)
                curveTo(4.2422f, 13.875f, 4.4414f, 14.0742f, 4.7578f, 14.0742f)
                close()
                moveTo(8.6484f, 14.0742f)
                lineTo(20.8008f, 14.0742f)
                curveTo(21.1992f, 14.0742f, 21.4336f, 13.8398f, 21.4336f, 13.4297f)
                lineTo(21.4336f, 12.5859f)
                curveTo(21.4336f, 12.1875f, 21.1992f, 11.9531f, 20.8008f, 11.9531f)
                lineTo(8.6484f, 11.9531f)
                curveTo(8.2383f, 11.9531f, 8.0039f, 12.1875f, 8.0039f, 12.5859f)
                lineTo(8.0039f, 13.4297f)
                curveTo(8.0039f, 13.8398f, 8.2383f, 14.0742f, 8.6484f, 14.0742f)
                close()
                moveTo(23.6133f, 14.0742f)
                lineTo(24.6797f, 14.0742f)
                curveTo(25.0078f, 14.0742f, 25.207f, 13.875f, 25.207f, 13.5469f)
                lineTo(25.207f, 12.4688f)
                curveTo(25.207f, 12.1523f, 25.0078f, 11.9531f, 24.6797f, 11.9531f)
                lineTo(23.6133f, 11.9531f)
                curveTo(23.2852f, 11.9531f, 23.0859f, 12.1523f, 23.0859f, 12.4688f)
                lineTo(23.0859f, 13.5469f)
                curveTo(23.0859f, 13.875f, 23.2852f, 14.0742f, 23.6133f, 14.0742f)
                close()
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
