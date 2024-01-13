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

package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
class Typography(
    val largeTitle : TextStyle = TextStyle(
        fontSize = 34.sp,
        lineHeight = 41.sp
    ),
    val title1 : TextStyle= TextStyle(
        fontSize = 28.sp,
        lineHeight = 34.sp
    ),
    val title2 : TextStyle = TextStyle(
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    val title3 : TextStyle = TextStyle(
        fontSize = 20.sp,
        lineHeight = 25.sp
    ),
    val headline : TextStyle = TextStyle(
        fontSize = 17.sp,
        lineHeight = 22.sp,
        fontWeight = FontWeight.SemiBold
    ),
    val body : TextStyle = TextStyle(
        fontSize = 17.sp,
        lineHeight = 22.sp
    ),
    val callout : TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 21.sp
    ),
    val subhead : TextStyle = TextStyle(
        fontSize = 15.sp,
        lineHeight = 20.sp
    ),
    val footnote : TextStyle = TextStyle(
        fontSize = 13.sp,
        lineHeight = 18.sp
    ),
    val caption1 : TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    val caption2 : TextStyle = TextStyle(
        fontSize = 11.sp,
        lineHeight = 13.sp
    ),
)

internal val LocalTypography = staticCompositionLocalOf { Typography() }
