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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme as MaterialColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.materialkolor.dynamicColorScheme
import io.github.alexzhirkevich.LocalContentColorProvider
import io.github.alexzhirkevich.LocalTextStyleProvider
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.theme.ColorScheme as CupertinoColorScheme
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.lightColorScheme
import androidx.compose.material3.LocalContentColor as MaterialLocalContentColor
import androidx.compose.material3.LocalTextStyle as MaterialLocalTextStyle
import io.github.alexzhirkevich.cupertino.theme.Shapes as CupertinoShapes
import androidx.compose.material3.Shapes as MaterialShapes
import io.github.alexzhirkevich.cupertino.theme.darkColorScheme as cupertinoDark
import io.github.alexzhirkevich.cupertino.theme.lightColorScheme as cupertinoLight

enum class Theme {
    Cupertino, Material3
}

// Composable returning null cause crash on IOS
// https://github.com/JetBrains/compose-multiplatform/issues/3900

@Composable
internal expect fun systemMaterialColorScheme(dark : Boolean) : MaterialColorScheme?

@Composable
internal fun systemCupertinoColorScheme(dark : Boolean) : CupertinoColorScheme? {
    val r : CupertinoColorScheme? = null // https://github.com/JetBrains/compose-multiplatform/issues/3900
    return r
}

/**
 * Adaptive theme depending on [target]. It allows to seamlessly use Material and Cupertino widgets.
 *
 * [Theme.Cupertino] => [CupertinoTheme] with [primaryColor] as accent.
 *
 * [Theme.Material3] => [MaterialTheme] generated from seed [primaryColor].
 *
 * This theme also allows to use [androidx.compose.material3.Text] together with [CupertinoText] and
 * [androidx.compose.material3.Icon] together with [CupertinoIcon] both in Material and Cupertino widgets.
 * This components will behave identically
 *
 * @param primaryColor main color to generate themes
 * @param target preferred theme
 * @param useSystemColorTheme use system color theme on devices where it is supported (ex. material3 on Android >= 31)
 * */
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTheme(
    target: Theme,
    primaryColor : Color,
    useDarkTheme : Boolean = isSystemInDarkTheme(),
    useSystemColorTheme : Boolean = true,
    shapes: Shapes = Shapes(),
    content : @Composable () -> Unit
) {
    AdaptiveTheme(
        target = target,
        material = {
            MaterialTheme(
                colorScheme =
                systemMaterialColorScheme(dark = useDarkTheme)
                    ?.takeIf { useSystemColorTheme }
                    ?: dynamicColorScheme(
                        seedColor = primaryColor,
                        isDark = useDarkTheme
                    ),
                shapes = MaterialShapes(
                    extraSmall = shapes.extraSmall,
                    small = shapes.small,
                    medium = shapes.medium,
                    large = shapes.large,
                    extraLarge = shapes.extraLarge
                ),
                content = it
            )
        },
        cupertino = {
            CupertinoTheme(
                colorScheme = systemCupertinoColorScheme(dark = useDarkTheme)
                    .takeIf { useSystemColorTheme }
                    ?: if (useDarkTheme)
                        cupertinoDark(accent = primaryColor)
                    else cupertinoLight(accent = primaryColor),
                shapes = CupertinoShapes(
                    extraSmall = shapes.extraSmall,
                    small = shapes.small,
                    medium = shapes.medium,
                    large = shapes.large,
                    extraLarge = shapes.extraLarge
                ),
                content = it
            )
        },
        content = content
    )
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
    target: Theme,
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

//@Composable
//fun MaterialThemeFromOrigin(
//    origin: ThemeOrigin,
//    colorScheme: MaterialColorScheme = MaterialColorSchemeFromOrigin(origin),
//    typography: MaterialTypography = MaterialTypographyFromOrigin(origin),
//    shapes: MaterialShapes = MaterialShapesFromOrigin(origin),
//    content: @Composable () -> Unit
//) {
//    MaterialTheme(
//        colorScheme = colorScheme,
//        shapes = shapes,
//        typography = typography,
//        content = content
//    )
//}
//
//
//@Composable
//fun CupertinoThemeFromOrigin(
//    origin: ThemeOrigin,
//    colorScheme: CupertinoColorScheme = run {
//        val accent = when (origin) {
//            ThemeOrigin.Material3 -> MaterialTheme.colorScheme.primary
//            else -> CupertinoTheme.colorScheme.accent
//        }
//        if (isSystemInDarkTheme())
//            cupertinoDark(accent = accent)
//        else cupertinoLight(accent = accent)
//    },
//    typography: CupertinoTypography = when(origin) {
//        else -> CupertinoTheme.typography
//    },
//    shapes: CupertinoShapes = when(origin) {
//        ThemeOrigin.Material3 -> CupertinoShapes(
//            extraSmall = MaterialTheme.shapes.extraSmall,
//            small = MaterialTheme.shapes.small,
//            medium = MaterialTheme.shapes.medium,
//            large = MaterialTheme.shapes.large,
//            extraLarge = MaterialTheme.shapes.extraLarge,
//        )
//        else -> CupertinoTheme.shapes
//    },
//    content: @Composable () -> Unit
//) {
//    CupertinoTheme(
//        colorScheme = colorScheme,
//        shapes = shapes,
//        typography = typography,
//        content = content
//    )
//}
//
//@Composable
//fun MaterialColorSchemeFromOrigin(
//    origin: ThemeOrigin,
//    dark : Boolean,
//    primary: Color = when(origin) {
//        ThemeOrigin.Cupertino -> CupertinoTheme.colorScheme.accent
//        else -> MaterialTheme.colorScheme.primary
//    },
//    onPrimary: Color,
//    primaryContainer: Color,
//    onPrimaryContainer: Color,
//    inversePrimary: Color,
//    secondary: Color,
//    onSecondary: Color,
//    secondaryContainer: Color,
//    onSecondaryContainer: Color,
//    tertiary: Color,
//    onTertiary: Color,
//    tertiaryContainer: Color,
//    onTertiaryContainer: Color,
//    background: Color,
//    onBackground: Color,
//    surface: Color,
//    onSurface: Color,
//    surfaceVariant: Color,
//    onSurfaceVariant: Color,
//    surfaceTint: Color,
//    inverseSurface: Color,
//    inverseOnSurface: Color,
//    error: Color,
//    onError: Color,
//    errorContainer: Color,
//    onErrorContainer: Color,
//    outline: Color,
//    outlineVariant: Color,
//    scrim: Color,
//) : MaterialColorScheme {
//    return if (dark)
//        darkColorScheme(
//            primary = primary,
//            onPrimary = onPrimary,
//            primaryContainer = primaryContainer,
//            onPrimaryContainer = onPrimaryContainer,
//            inversePrimary = inversePrimary,
//            secondary = secondary,
//            onSecondary = onSecondary,
//            secondaryContainer = secondaryContainer,
//            onSecondaryContainer = onSecondaryContainer,
//            tertiary = tertiary,
//            onTertiary = onTertiary,
//            tertiaryContainer = tertiaryContainer,
//            onTertiaryContainer = onTertiaryContainer,
//            background = background,
//            onBackground = onBackground,
//            surface = surface,
//            onSurface = onSurface,
//            surfaceVariant = surfaceVariant,
//            onSurfaceVariant = onSurfaceVariant,
//            surfaceTint = surfaceTint,
//            inverseSurface = inverseSurface,
//            inverseOnSurface = inverseOnSurface,
//            error = error,
//            onError = onError,
//            errorContainer = errorContainer,
//            onErrorContainer = onErrorContainer,
//            outline = outline,
//            outlineVariant = outlineVariant,
//            scrim = scrim
//        )
//    else lightColorScheme(
//        primary = primary,
//        onPrimary = onPrimary,
//        primaryContainer = primaryContainer,
//        onPrimaryContainer = onPrimaryContainer,
//        inversePrimary = inversePrimary,
//        secondary = secondary,
//        onSecondary = onSecondary,
//        secondaryContainer = secondaryContainer,
//        onSecondaryContainer = onSecondaryContainer,
//        tertiary = tertiary,
//        onTertiary = onTertiary,
//        tertiaryContainer = tertiaryContainer,
//        onTertiaryContainer = onTertiaryContainer,
//        background = background,
//        onBackground = onBackground,
//        surface = surface,
//        onSurface = onSurface,
//        surfaceVariant = surfaceVariant,
//        onSurfaceVariant = onSurfaceVariant,
//        surfaceTint = surfaceTint,
//        inverseSurface = inverseSurface,
//        inverseOnSurface = inverseOnSurface,
//        error = error,
//        onError = onError,
//        errorContainer = errorContainer,
//        onErrorContainer = onErrorContainer,
//        outline = outline,
//        outlineVariant = outlineVariant,
//        scrim = scrim
//    )
//}
//
//
//@Composable
//fun MaterialTypographyFromOrigin(
//    origin: ThemeOrigin
//) : MaterialTypography {
//    DynamicMaterialTheme(
//
//    )
//}
//
//@Composable
//fun MaterialShapesFromOrigin(
//    origin: ThemeOrigin
//) : MaterialShapes {
//
//}

internal val LocalTheme = staticCompositionLocalOf<Theme> {
    error("Adaptive theme is not provided")
}