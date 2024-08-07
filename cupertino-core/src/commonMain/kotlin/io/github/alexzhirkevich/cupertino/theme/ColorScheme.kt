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

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import io.github.alexzhirkevich.cupertino.Accessibility
import io.github.alexzhirkevich.cupertino.InternalCupertinoApi
import io.github.alexzhirkevich.cupertino.isHighContrastEnabled

@Immutable
class ColorScheme internal constructor(
    val isDark : Boolean,
    val accent : Color,
    val label : Color,
    val secondaryLabel : Color,
    val tertiaryLabel : Color,
    val quaternaryLabel : Color,
    val systemFill : Color,
    val secondarySystemFill : Color,
    val tertiarySystemFill : Color,
    val quaternarySystemFill : Color,
    val placeholderText : Color,
    val separator : Color,
    val opaqueSeparator : Color,
    val link : Color,
    val systemGroupedBackground : Color,
    val secondarySystemGroupedBackground : Color,
    val tertiarySystemGroupedBackground : Color,
    val systemBackground : Color,
    val secondarySystemBackground : Color,
    val tertiarySystemBackground : Color,
) {
    fun copy(
        accent : Color = this.accent,
        label : Color = this.label,
        secondaryLabel : Color = this.secondaryLabel,
        tertiaryLabel : Color = this.tertiaryLabel,
        quaternaryLabel : Color = this.quaternaryLabel,
        systemFill : Color = this.systemFill,
        secondarySystemFill : Color = this.secondarySystemFill,
        tertiarySystemFill : Color = this.tertiarySystemFill,
        quaternarySystemFill : Color = this.quaternarySystemFill,
        placeholderText : Color = this.placeholderText,
        separator : Color = this.separator,
        opaqueSeparator : Color = this.opaqueSeparator,
        link : Color = this.link,
        systemGroupedBackground : Color = this.systemGroupedBackground,
        secondarySystemGroupedBackground : Color = this.secondarySystemGroupedBackground,
        tertiarySystemGroupedBackground : Color = this.tertiarySystemGroupedBackground,
        systemBackground : Color = this.systemBackground,
        secondarySystemBackground : Color = this.secondarySystemBackground,
        tertiarySystemBackground : Color = this.tertiarySystemBackground,
    ) = ColorScheme(
        isDark = isDark,
        accent = accent,
        label = label,
        secondaryLabel = secondaryLabel,
        tertiaryLabel = tertiaryLabel,
        quaternaryLabel = quaternaryLabel,
        systemFill = systemFill,
        secondarySystemFill = secondarySystemFill,
        tertiarySystemFill = tertiarySystemFill,
        quaternarySystemFill = quaternarySystemFill,
        placeholderText = placeholderText,
        separator = separator,
        opaqueSeparator = opaqueSeparator,
        link = link,
        systemGroupedBackground = systemGroupedBackground,
        secondarySystemGroupedBackground = secondarySystemGroupedBackground,
        tertiarySystemGroupedBackground = tertiarySystemGroupedBackground,
        systemBackground = systemBackground,
        secondarySystemBackground = secondarySystemBackground,
        tertiarySystemBackground = tertiarySystemBackground
    )
}

fun lightColorScheme(
    accent : Color = ColorSchemeTokens.lightAccent,
    label : Color = ColorSchemeTokens.lightLabel,
    secondaryLabel : Color = ColorSchemeTokens.lightSecondaryLabel,
    tertiaryLabel : Color = ColorSchemeTokens.lightTertiaryLabel,
    quaternaryLabel : Color = ColorSchemeTokens.lightQuaternaryLabel,
    systemFill : Color = ColorSchemeTokens.lightSystemFill,
    secondarySystemFill : Color = ColorSchemeTokens.lightSecondarySystemFill,
    tertiarySystemFill : Color = ColorSchemeTokens.lightTertiarySystemFill,
    quaternarySystemFill : Color = ColorSchemeTokens.lightQuaternarySystemFill,
    placeholderText : Color = ColorSchemeTokens.lightPlaceholderText,
    separator : Color = ColorSchemeTokens.lightSeparator,
    opaqueSeparator : Color =  ColorSchemeTokens.lightOpaqueSeparator,
    link : Color = ColorSchemeTokens.lightLink,
    systemGroupedBackground : Color = ColorSchemeTokens.lightSystemGroupedBackground,
    secondarySystemGroupedBackground : Color = ColorSchemeTokens.lightSecondarySystemGroupedBackground,
    tertiarySystemGroupedBackground : Color = ColorSchemeTokens.lightTertiarySystemGroupedBackground,
    systemBackground : Color = ColorSchemeTokens.lightSystemBackground,
    secondarySystemBackground : Color = ColorSchemeTokens.lightSecondarySystemBackground,
    tertiarySystemBackground : Color = ColorSchemeTokens.lightTertiarySystemBackground,
) : ColorScheme = ColorScheme(
    isDark = false,
    accent = accent,
    label = label,
    secondaryLabel = secondaryLabel,
    tertiaryLabel = tertiaryLabel,
    quaternaryLabel = quaternaryLabel,
    placeholderText = placeholderText,
    systemFill = systemFill,
    secondarySystemFill = secondarySystemFill,
    tertiarySystemFill = tertiarySystemFill,
    quaternarySystemFill = quaternarySystemFill,
    separator = separator,
    opaqueSeparator = opaqueSeparator,
    link = link,
    systemGroupedBackground = systemGroupedBackground,
    secondarySystemGroupedBackground =secondarySystemGroupedBackground,
    tertiarySystemGroupedBackground =tertiarySystemGroupedBackground,
    systemBackground = systemBackground,
    secondarySystemBackground = secondarySystemBackground,
    tertiarySystemBackground = tertiarySystemBackground
)

fun darkColorScheme(
    accent : Color = ColorSchemeTokens.darkAccent,
    label : Color = ColorSchemeTokens.darkLabel,
    secondaryLabel : Color = ColorSchemeTokens.darkSecondaryLabel,
    tertiaryLabel : Color = ColorSchemeTokens.darkTertiaryLabel,
    quaternaryLabel : Color = ColorSchemeTokens.darkQuaternaryLabel,
    systemFill : Color = ColorSchemeTokens.darkSystemFill,
    secondarySystemFill : Color = ColorSchemeTokens.darkSecondarySystemFill,
    tertiarySystemFill : Color = ColorSchemeTokens.darkTertiarySystemFill,
    quaternarySystemFill : Color = ColorSchemeTokens.darkQuaternarySystemFill,
    placeholderText : Color = ColorSchemeTokens.darkPlaceholderText,
    separator : Color = ColorSchemeTokens.darkSeparator,
    opaqueSeparator : Color =  ColorSchemeTokens.darkOpaqueSeparator,
    link : Color = ColorSchemeTokens.darkLink,
    systemGroupedBackground : Color = ColorSchemeTokens.darkSystemGroupedBackground,
    secondarySystemGroupedBackground : Color = ColorSchemeTokens.darkSecondarySystemGroupedBackground,
    tertiarySystemGroupedBackground : Color = ColorSchemeTokens.darkTertiarySystemGroupedBackground,
    systemBackground : Color = ColorSchemeTokens.darkSystemBackground,
    secondarySystemBackground : Color = ColorSchemeTokens.darkSecondarySystemBackground,
    tertiarySystemBackground : Color = ColorSchemeTokens.darkTertiarySystemBackground,
) : ColorScheme = ColorScheme(
    isDark = true,
    accent = accent,
    label = label,
    secondaryLabel = secondaryLabel,
    tertiaryLabel = tertiaryLabel,
    quaternaryLabel = quaternaryLabel,
    placeholderText = placeholderText,
    systemFill = systemFill,
    secondarySystemFill = secondarySystemFill,
    tertiarySystemFill = tertiarySystemFill,
    quaternarySystemFill = quaternarySystemFill,
    separator = separator,
    opaqueSeparator = opaqueSeparator,
    link = link,
    systemGroupedBackground = systemGroupedBackground,
    secondarySystemGroupedBackground =secondarySystemGroupedBackground,
    tertiarySystemGroupedBackground =tertiarySystemGroupedBackground,
    systemBackground = systemBackground,
    secondarySystemBackground = secondarySystemBackground,
    tertiarySystemBackground = tertiarySystemBackground
)

private val defaultCupertinoColorScheme = lightColorScheme()

@InternalCupertinoApi
val LocalColorScheme = staticCompositionLocalOf {
    defaultCupertinoColorScheme
}

@Composable
@InternalCupertinoApi
fun isInitializedCupertinoTheme() : Boolean {
    return LocalColorScheme.current !== defaultCupertinoColorScheme
}


@Composable
@ReadOnlyComposable
internal fun isDark() =
    CupertinoTheme.colorScheme.isDark

internal object ColorSchemeTokens {
    val lightAccent : Color = CupertinoColors.systemBlue(false)
    val lightLabel : Color = Color.Black
    val lightSecondaryLabel : Color = color(
        accessible = 0xcc3c3c43,
        default = 0x993c3c43
    )
    val lightTertiaryLabel : Color = color(
        accessible = 0xb23c3c43,
        default = 0x4c3c3c43
    )
    val lightQuaternaryLabel : Color = color(
        accessible = 0x8c3c3c43,
        default =  0x2d3c3c43
    )
    val lightSystemFill : Color = color(
        accessible = 0x47787880,
        default = 0x5b787880
    )
    val lightSecondarySystemFill : Color = color(
        accessible = 0x3d787880,
        default = 0x51787880
    )
    val lightTertiarySystemFill : Color = color(
        accessible = 0x33767680,
        default = 0x3d767680
    )
    val lightQuaternarySystemFill : Color = color(
        accessible = 0x28747480,
        default = 0x2d767680
    )

    val lightPlaceholderText : Color = color(
        accessible = 0xb23c3c43,
        default = 0x4c3c3c43
    )
    val lightSeparator : Color = color(
        accessible = 0x5e3c3c43,
        default = 0x493c3c43
    )
    val lightOpaqueSeparator : Color = color(
        accessible = 0xffc6c6c8,
        default = 0xffc6c6c8
    )
    val lightLink : Color = Color(0xff007aff)
    val lightSystemGroupedBackground : Color = color(
        accessible = 0xffebebf0,
        default = 0xfff2f2f7
    )
    val lightSecondarySystemGroupedBackground : Color = Color.White
    val lightTertiarySystemGroupedBackground : Color = color(
        accessible = 0xffebebf0,
        default = 0xfff2f2f7
    )
    val lightSystemBackground : Color = Color.White
    val lightSecondarySystemBackground : Color = color(
        accessible = 0xffebebf0,
        default = 0xfff2f2f7
    )
    val lightTertiarySystemBackground : Color = Color.White

    val darkAccent : Color = CupertinoColors.systemBlue(true)
    val darkLabel : Color = Color.White
    val darkSecondaryLabel : Color = color(
        accessible = 0xb2ebebf5,
        default = 0x99ebebf5
    )
    val darkTertiaryLabel : Color =  color(
        accessible = 0x8cebebf5,
        default = 0x4cebebf5
    )
    val darkQuaternaryLabel : Color =  color(
        accessible = 0x66ebebf5,
        default = 0x28ebebf5
    )
    val darkSystemFill : Color = color(
        accessible = 0x70787880,
        default = 0x5b787880
    )
    val darkSecondarySystemFill : Color = color(
        accessible = 0x66787880,
        default = 0x51787880
    )
    val darkTertiarySystemFill : Color = color(
        accessible = 0x51767680,
        default = 0x3d767680
    )
    val darkQuaternarySystemFill : Color = color(
        accessible = 0x42767680,
        default = 0x2d767680
    )
    val darkPlaceholderText : Color =  color(
        accessible = 0x8cebebf5,
        default = 0x4cebebf5
    )
    val darkSeparator : Color = color(
        accessible = 0xad545458,
        default = 0x99545458
    )
    val darkOpaqueSeparator : Color =  color(
        accessible = 0xff38383a,
        default = 0xff38383a
    )
    val darkLink : Color = Color(0xff0984ff)
    val darkSystemGroupedBackground : Color = Color.Black
    val darkSecondarySystemGroupedBackground : Color = color(
        accessible = 0xff242426,
        default = 0xff1c1c1e
    )
    val darkTertiarySystemGroupedBackground : Color = color(
        accessible = 0xff363638,
        default = 0xff2c2c2e
    )
    val darkSystemBackground : Color = Color.Black
    val darkSecondarySystemBackground : Color = color(
        accessible = 0xff242426,
        default = 0xff1c1c1e
    )
    val darkTertiarySystemBackground : Color = color(
        accessible = 0xff363638,
        default = 0xff2c2c2e
    )

    private fun color(
        accessible : Long,
        default : Long
    ) : Color = Color(if (Accessibility.isHighContrastEnabled) accessible else default)
}