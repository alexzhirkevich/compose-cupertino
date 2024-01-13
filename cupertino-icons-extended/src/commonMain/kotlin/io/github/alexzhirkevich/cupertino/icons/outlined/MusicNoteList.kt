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

public val CupertinoIcons.Outlined.MusicNoteList: ImageVector
    get() {
        if (_musicNoteList != null) {
            return _musicNoteList!!
        }
        _musicNoteList = Builder(name = "MusicNoteList", defaultWidth = 23.8945.dp, defaultHeight =
                24.082.dp, viewportWidth = 23.8945f, viewportHeight = 24.082f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.8945f, 5.8711f)
                lineTo(23.8945f, 1.4648f)
                curveTo(23.8945f, 0.8438f, 23.3906f, 0.4453f, 22.793f, 0.5625f)
                lineTo(16.7695f, 1.875f)
                curveTo(16.0195f, 2.0391f, 15.6094f, 2.4492f, 15.6094f, 3.1055f)
                lineTo(15.6328f, 16.1367f)
                curveTo(15.6914f, 16.7109f, 15.4219f, 17.0859f, 14.9062f, 17.1914f)
                lineTo(13.043f, 17.5781f)
                curveTo(10.6992f, 18.0703f, 9.5977f, 19.2656f, 9.5977f, 21.0352f)
                curveTo(9.5977f, 22.8281f, 10.9805f, 24.082f, 12.9258f, 24.082f)
                curveTo(14.6484f, 24.082f, 17.2266f, 22.8164f, 17.2266f, 19.4062f)
                lineTo(17.2266f, 8.6836f)
                curveTo(17.2266f, 8.0625f, 17.3438f, 7.9336f, 17.8945f, 7.8164f)
                lineTo(23.25f, 6.6445f)
                curveTo(23.6484f, 6.5625f, 23.8945f, 6.2578f, 23.8945f, 5.8711f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.7969f, 6.4219f)
                lineTo(11.2734f, 6.4219f)
                curveTo(11.707f, 6.4219f, 12.0703f, 6.0586f, 12.0703f, 5.625f)
                curveTo(12.0703f, 5.1914f, 11.707f, 4.8398f, 11.2734f, 4.8398f)
                lineTo(0.7969f, 4.8398f)
                curveTo(0.3516f, 4.8398f, 0.0f, 5.1914f, 0.0f, 5.625f)
                curveTo(0.0f, 6.0586f, 0.3516f, 6.4219f, 0.7969f, 6.4219f)
                close()
                moveTo(0.7969f, 10.5938f)
                lineTo(11.2734f, 10.5938f)
                curveTo(11.7188f, 10.5938f, 12.0703f, 10.2305f, 12.0703f, 9.7852f)
                curveTo(12.0703f, 9.3516f, 11.707f, 9.0117f, 11.2734f, 9.0117f)
                lineTo(0.7969f, 9.0117f)
                curveTo(0.3516f, 9.0117f, 0.0f, 9.3516f, 0.0f, 9.7852f)
                curveTo(0.0f, 10.2305f, 0.3398f, 10.5938f, 0.7969f, 10.5938f)
                close()
                moveTo(0.7969f, 14.7656f)
                lineTo(11.2734f, 14.7656f)
                curveTo(11.7188f, 14.7656f, 12.0703f, 14.4141f, 12.0703f, 13.9688f)
                curveTo(12.0703f, 13.5352f, 11.707f, 13.1836f, 11.2734f, 13.1836f)
                lineTo(0.7969f, 13.1836f)
                curveTo(0.3516f, 13.1836f, 0.0f, 13.5352f, 0.0f, 13.9688f)
                curveTo(0.0f, 14.4141f, 0.3398f, 14.7656f, 0.7969f, 14.7656f)
                close()
            }
        }
        .build()
        return _musicNoteList!!
    }

private var _musicNoteList: ImageVector? = null
