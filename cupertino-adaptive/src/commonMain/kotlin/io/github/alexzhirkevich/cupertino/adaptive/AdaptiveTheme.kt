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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import io.github.alexzhirkevich.LocalContentColorProvider
import io.github.alexzhirkevich.LocalTextStyleProvider
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import androidx.compose.material3.LocalContentColor as MaterialLocalContentColor
import androidx.compose.material3.LocalTextStyle as MaterialLocalTextStyle

enum class Theme {
    Cupertino, Material3
}

/**
 * Adaptive theme depending on [target]. It allows to seamlessly use Material and Cupertino widgets.
 *
 * This theme also allows to use [androidx.compose.material3.Text] together with [CupertinoText] and
 * [androidx.compose.material3.Icon] together with [CupertinoIcon] both in Material and Cupertino widgets.
 * This components will behave identically
 * */
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTheme(
    target: Theme = DefaultTheme,
    material: @Composable (content: @Composable () -> Unit) -> Unit = {
        MaterialTheme(content = it)
    },
    cupertino: @Composable (content: @Composable () -> Unit) -> Unit = {
        CupertinoTheme(content = it)
    },
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalTheme provides target,
        LocalContentColorProvider provides MaterialLocalContentColor,
        LocalTextStyleProvider provides MaterialLocalTextStyle,
    ) {
        when (LocalTheme.current) {
            Theme.Cupertino -> {
                material {
                    cupertino(content)
                }
            }

            Theme.Material3 -> {
                cupertino {
                    material(content)
                }
            }
        }
    }
}

@ExperimentalAdaptiveApi
val currentTheme : Theme
    @Composable
    get() = LocalTheme.current

internal expect val DefaultTheme : Theme

internal val LocalTheme = staticCompositionLocalOf<Theme> {
    error("Adaptive theme is not provided. Please add AdaptiveTheme { } to the root of your composable hierarchy")
}