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

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme as materialLightColorScheme
import androidx.compose.material3.Shapes as MaterialShapes
import androidx.compose.material3.ColorScheme as MaterialColorScheme
import androidx.compose.material3.Typography as MaterialTypography

import io.github.alexzhirkevich.cupertino.theme.ColorScheme as CupertinoColorScheme
import io.github.alexzhirkevich.cupertino.theme.Typography as CupertinoTypography
import io.github.alexzhirkevich.cupertino.theme.Shapes as CupertinoShapes
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.lightColorScheme as cupertinoLightColorScheme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import io.github.alexzhirkevich.LocalContentColorProvider
import io.github.alexzhirkevich.LocalTextStyleProvider
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoText

import androidx.compose.material3.LocalContentColor as MaterialLocalContentColor
import androidx.compose.material3.LocalTextStyle as MaterialLocalTextStyle

enum class Theme {
    Cupertino, Material3
}

/**
 * Adaptive theme depending on [target]. It allows to seamlessly use Material and Cupertino widgets.
 *
 * This theme also make [Text] <-> [CupertinoText] and [Icon] <-> [CupertinoIcon] behave identically
 *
 * Current theme target can be accessed inside the [content] using [currentTheme] property
 *
 * @param target theme for adaptive widgets
 * @param material [MaterialTheme] specification
 * @param cupertino [CupertinoTheme] specification
 * @param content themed content
 * */
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTheme(
    target: Theme = DefaultTheme,
    material: MaterialThemeSpec = MaterialThemeSpec.Default(),
    cupertino: CupertinoThemeSpec = CupertinoThemeSpec.Default(),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalTheme provides target,
        LocalContentColorProvider provides MaterialLocalContentColor,
        LocalTextStyleProvider provides MaterialLocalTextStyle,
    ) {
        when (LocalTheme.current) {
            Theme.Cupertino -> {
                MaterialTheme(
                    colorScheme = material.colorScheme,
                    shapes = material.shapes,
                    typography = material.typography
                ) {
                    CupertinoTheme(
                        colorScheme = cupertino.colorScheme,
                        shapes = cupertino.shapes,
                        typography = cupertino.typography,
                        content = content
                    )
                }
            }

            Theme.Material3 -> {
                CupertinoTheme(
                    colorScheme = cupertino.colorScheme,
                    shapes = cupertino.shapes,
                    typography = cupertino.typography
                ) {
                    MaterialTheme(
                        colorScheme = material.colorScheme,
                        shapes = material.shapes,
                        typography = material.typography,
                        content = content
                    )
                }
            }
        }
    }
}

/**
 * Adaptive theme depending on [target]. It allows to seamlessly use Material and Cupertino widgets.
 *
 * This theme also allows to use [Text] together with [CupertinoText] and
 * [Icon] together with [CupertinoIcon] both in Material and Cupertino widgets.
 * This components will behave identically
 *
 * Current theme target can be accessed inside the [content] using [currentTheme] property.
 *
 * @param target theme for adaptive widgets. Defaults to [Theme.Cupertino] for iOS
 * and [Theme.Material3] for other platforms
 * @param material [MaterialTheme] specification. NOTE: You must use lambda parameter as a content
 * @param cupertino [CupertinoTheme] specification. NOTE: You must use lambda parameter as a content
 * @param content themed content
 * */
@ExperimentalAdaptiveApi
@Deprecated(
    message = "Use variant with theme specs instead of lambdas",
    replaceWith = ReplaceWith(
        "AdaptiveTheme(target, MaterialThemeSpec.Default(), CupertinoThemeSpec.Default(), content)",
        "io.github.alexzhirkevich.cupertino.adaptive.MaterialThemeSpec",
        "io.github.alexzhirkevich.cupertino.adaptive.CupertinoThemeSpec",
    )
)
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

@Immutable
@ExperimentalAdaptiveApi
class MaterialThemeSpec(
    val colorScheme : MaterialColorScheme = materialLightColorScheme(),
    val shapes : MaterialShapes = MaterialShapes(),
    val typography : MaterialTypography = MaterialTypography(),
) {
    fun copy(
        colorScheme: MaterialColorScheme = this.colorScheme,
        shapes: MaterialShapes = this.shapes,
        typography: MaterialTypography = this.typography
    ) = MaterialThemeSpec(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = typography
    )

    override fun toString(): String {
        return "MaterialThemeSpec(colorScheme=$colorScheme, shapes=$shapes, typography=$typography)"
    }

    companion object {
        @Composable
        fun Default(
            colorScheme: MaterialColorScheme = MaterialTheme.colorScheme,
            shapes: MaterialShapes = MaterialTheme.shapes,
            typography: MaterialTypography = MaterialTheme.typography,
        ) = MaterialThemeSpec(colorScheme, shapes, typography)
    }
}

@Immutable
@ExperimentalAdaptiveApi
class CupertinoThemeSpec(
    val colorScheme : CupertinoColorScheme = cupertinoLightColorScheme(),
    val shapes : CupertinoShapes = CupertinoShapes(),
    val typography : CupertinoTypography = CupertinoTypography()
) {
    fun copy(
        colorScheme : CupertinoColorScheme = this.colorScheme,
        shapes : CupertinoShapes = this.shapes,
        typography : CupertinoTypography = this.typography
    ) = CupertinoThemeSpec(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = typography
    )

    override fun toString(): String {
        return "CupertinoThemeSpec(colorScheme=$colorScheme, shapes=$shapes, typography=$typography)"
    }
    companion object {
        @Composable
        fun Default(
            colorScheme: CupertinoColorScheme = CupertinoTheme.colorScheme,
            shapes: CupertinoShapes = CupertinoTheme.shapes,
            typography: CupertinoTypography = CupertinoTheme.typography,
        ) = CupertinoThemeSpec(colorScheme, shapes, typography)
    }
}


/**
 * Theme declared as a target in [AdaptiveTheme]
 * */
@ExperimentalAdaptiveApi
val currentTheme : Theme
    @Composable
    get() = LocalTheme.current

expect val DefaultTheme : Theme

internal val LocalTheme = staticCompositionLocalOf<Theme> {
    error("Adaptive theme is not provided. Please add AdaptiveTheme { } to the root of your composable hierarchy")
}