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

package io.github.alexzhirkevich

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Interoperable composition local for content color.
 *
 * Depending on current theme, this local will point to the
 * - internal LocalContentColor - for CupertinoTheme
 * - androidx.compose.matarial3.LocalContentColor - for AdaptiveTheme
 *
 * It used as source of local content color in all cupertino widgets.
 * And therefore for AdaptiveTheme there is no difference between using composables like material3
 * Icon and CupertinoIcon where LocalContentColor.current is passed as a default parameter.
 *
 * You can provide your own local (for ex. basic Material local) using [LocalContentColorProvider]
 * */
val LocalContentColor : ProvidableCompositionLocal<Color>
    @Composable
    @ReadOnlyComposable
    get() = LocalContentColorProvider.current


val LocalContentColorProvider = staticCompositionLocalOf {
    EmptyLocalColor
}

private val EmptyLocalColor = compositionLocalOf {
    Color.Black
}