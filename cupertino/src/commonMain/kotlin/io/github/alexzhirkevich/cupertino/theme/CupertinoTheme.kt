/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import io.github.alexzhirkevich.cupertino.CupertinoIndication
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.LocalTextStyle
import io.github.alexzhirkevich.cupertino.rememberCupertinoIndication

object CupertinoTheme {
    /**
     * Retrieves the current [ColorScheme] at the call site's position in the hierarchy.
     */
    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    /**
     * Retrieves the current [Typography] at the call site's position in the hierarchy.
     */
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    /**
     * Retrieves the current [Shapes] at the call site's position in the hierarchy.
     */
    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}

@Composable
fun CupertinoTheme(
    colorScheme: ColorScheme = if (isSystemInDarkTheme())
        darkColorScheme() else lightColorScheme(),
    shapes: Shapes = Shapes(),
    typography: Typography = Typography(),
    content : @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalShapes provides shapes,
        LocalTypography provides typography,
        LocalTextStyle provides typography.body,
        LocalContentColor provides colorScheme.label,
        LocalIndication provides rememberCupertinoIndication(),
        content = content
    )
}

//fun ColorScheme.cupertino(dark : Boolean) : ColorScheme = copy(
//    background = if (dark) Color.Black else AppleColors.gray6(false),
//    surface = if (dark) AppleColors.gray6(true) else Color.White,
//    surfaceVariant = if (dark) AppleColors.gray6(true) else Color.White,
//    onSurfaceVariant = if (dark) Color.White else Color.Black,
//    primaryContainer = AppleColors.gray5(dark),
//    secondaryContainer = AppleColors.gray8(dark), // Segmented control indicator
//    tertiaryContainer = AppleColors.gray7(dark), // Alert dialog
//    onTertiaryContainer = if (dark) Color.White else Color.Black,
//    error = AppleColors.red(dark),
//    outlineVariant = AppleColors.gray(dark)
//)
