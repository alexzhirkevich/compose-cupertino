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

package io.github.alexzhirkevich.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.White
import io.github.alexzhirkevich.cupertino.theme.isDark

/**
 * This object provides access to native accessibility preferences
 * */
object Accessibility

expect val Accessibility.isHighContrastEnabled : Boolean

expect val Accessibility.isReduceTransparencyEnabled : Boolean

/**
 * Adjust color contrast if corresponding OS accessibility system preference is enabled
 * */
val Color.accessible : Color
@Composable
    get() = accessible(isDark())

/**
 * Adjust color contrast if corresponding accessibility system preference is enabled
 * */
fun Color.accessible(isDark : Boolean) : Color =
    if (Accessibility.isHighContrastEnabled)
        lerp(this, if (isDark) CupertinoColors.White else Color.Black, .2f)
    else this
