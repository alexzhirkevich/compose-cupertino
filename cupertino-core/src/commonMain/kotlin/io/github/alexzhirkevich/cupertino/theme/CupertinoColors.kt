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
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.Accessibility
import io.github.alexzhirkevich.cupertino.isHighContrastEnabled

object CupertinoColors

val CupertinoColors.DefaultAlpha : Color
    @Composable
    @ReadOnlyComposable
    get() = LocalContentColor.current.copy(alpha = .1f)

val CupertinoColors.systemRed : Color
    @Composable
    @ReadOnlyComposable
    get() = systemRed(isDark)

val CupertinoColors.systemOrange : Color
    @Composable
    @ReadOnlyComposable
    get() = systemOrange(isDark)

val CupertinoColors.systemYellow : Color
    @Composable
    @ReadOnlyComposable
    get() = systemYellow(isDark)

val CupertinoColors.systemGreen : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGreen(isDark)

val CupertinoColors.systemBlue : Color
    @Composable
    @ReadOnlyComposable
    get() = systemBlue(isDark)

val CupertinoColors.systemMint : Color
    @Composable
    @ReadOnlyComposable
    get() = systemMint(isDark)

val CupertinoColors.systemTeal : Color
    @Composable
    @ReadOnlyComposable
    get() = systemTeal(isDark)

val CupertinoColors.systemCyan : Color
    @Composable
    @ReadOnlyComposable
    get() = systemCyan(isDark)

val CupertinoColors.systemIndigo : Color
    @Composable
    @ReadOnlyComposable
    get() = systemIndigo(isDark)

val CupertinoColors.systemPurple : Color
    @Composable
    @ReadOnlyComposable
    get() = systemPurple(isDark)

val CupertinoColors.systemPink : Color
    @Composable
    @ReadOnlyComposable
    get() = systemPink(isDark)

val CupertinoColors.systemBrown : Color
    @Composable
    @ReadOnlyComposable
    get() = systemBrown(isDark)

val CupertinoColors.systemGray : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray(isDark)

val CupertinoColors.systemGray2 : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray2(isDark)

val CupertinoColors.systemGray3 : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray3(isDark)

val CupertinoColors.systemGray4 : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray4(isDark)

val CupertinoColors.systemGray5 : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray5(isDark)

val CupertinoColors.systemGray6 : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray6(isDark)

val CupertinoColors.systemGray7 : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray7(isDark)

internal val CupertinoColors.systemGray8 : Color
    @Composable
    @ReadOnlyComposable
    get() = systemGray8(isDark)

val CupertinoColors.Black : Color
    get() = Color.Black

val CupertinoColors.Blue : Color
    get() = Color.Blue

val CupertinoColors.Brown : Color
    get() = Color(0xff996633)

val CupertinoColors.Cyan : Color
    get() = Color.Cyan

val CupertinoColors.LightGray : Color
    get() = Color(0xffaaaaaa)

val CupertinoColors.DarkGray : Color
    get() = Color(0xff555555)

val CupertinoColors.Gray : Color
    get() = Color(0xff7f7f7f)

val CupertinoColors.Green : Color
    get() = Color.Green

val CupertinoColors.Magenta : Color
    get() = Color.Magenta

val CupertinoColors.Orange : Color
    get() = Color(0xffff7f00)

val CupertinoColors.Purple : Color
    get() = Color(0xff7f007f)

val CupertinoColors.Red : Color
    get() = Color.Red

val CupertinoColors.White : Color
    get() = Color.White

val CupertinoColors.Yellow : Color
    get() = Color.Yellow


private val isDark : Boolean
    @Composable
    @ReadOnlyComposable
    get() = CupertinoTheme.colorScheme.isDark

private fun CupertinoColors.default(dark: Boolean, light: Color) =
    if (dark)
        Color(light.red, light.green + 10/255f, light.blue + 10/255f, light.alpha)
    else light

fun CupertinoColors.systemRed(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast)
    default(dark, Color(255, 59, 48))
else if (dark) Color(255,105,97)
    else Color(215,0,21)

fun CupertinoColors.systemOrange(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast)
        default(dark, Color(255, 149, 0))
    else if (dark)
        Color(255,179,64)
    else Color(201,52,0)

fun CupertinoColors.systemYellow(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast)
        default(dark, Color(255, 204, 0))
    else if (dark)
        Color(255,212,38)
    else Color(178,80,0)


fun CupertinoColors.systemGreen(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast){
    if (dark)
        Color(48, 209, 88)
    else Color(52, 199, 89)
} else {
    if (dark)
        Color(48,219,91)
    else Color(36,138,61)
}

fun CupertinoColors.systemMint(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(102, 212, 207)
    else Color(0, 199, 190)
} else {
    if (dark)
        Color(102, 212, 207)
    else
        Color(12, 129, 123)
}

fun CupertinoColors.systemTeal(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(64, 200, 244)
    else Color(48, 176, 199)
} else {
    if (dark)
        Color(93, 230, 255)
    else Color(0, 130, 153)
}

fun CupertinoColors.systemCyan(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(100, 210, 255)
    else Color(50, 173, 230)
} else {
    if (dark)
        Color(112, 215, 255)
    else Color(0, 113, 164)
}

fun CupertinoColors.systemBlue(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(10, 132, 255)
    else Color(0, 122, 255)
} else {
    if (dark)
        Color(64, 156, 255)
    else Color(0, 64, 221)
}

fun CupertinoColors.systemIndigo(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(94, 92, 230)
    else Color(88, 86, 214)
} else {
    if (dark)
        Color(125, 122, 255)
    else Color(54, 52, 163)
}

fun CupertinoColors.systemPurple(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(191, 90, 242)
    else Color(185, 82, 222)
} else {
    if (dark)
        Color(218, 143, 255)
    else
        Color(137, 68, 171)
}

fun CupertinoColors.systemPink(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast)
    default(dark, Color(255, 45, 85))
else {
    if (dark)
        Color(255, 100, 130)
    else Color(211, 15, 69)
}

fun CupertinoColors.systemBrown(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(172, 142, 104)
    else Color(162, 132, 94)
} else {
    if (dark)
        Color(181, 148, 105)
    else Color(127, 101, 69)
}

fun CupertinoColors.systemGray(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast)
        Color(142, 142, 147)
    else {
    if (dark)
        Color(174, 174, 179)
    else Color(108, 108, 112)
}

fun CupertinoColors.systemGray2(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(99, 99, 102)
    else Color(174, 174, 178)
} else {
    if (dark)
        Color(124, 124, 128)
    else Color(142, 142, 147)
}

fun CupertinoColors.systemGray3(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(72, 72, 74)
    else Color(199, 199, 204)
} else {
    if (dark)
        Color(84, 84, 86)
    else Color(174, 174, 178)
}

fun CupertinoColors.systemGray4(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(58, 58, 60)
    else Color(209, 209, 214)
} else {
    if (dark)
        Color(68, 68, 70)
    else Color(188, 188, 192)
}

fun CupertinoColors.systemGray5(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(44, 44, 46)
    else Color(229, 229, 234)
} else {
    if (dark)
        Color(54, 54, 56)
    else Color(216, 216, 220)
}

fun CupertinoColors.systemGray6(
    dark: Boolean,
    highContrast : Boolean = Accessibility.isHighContrastEnabled
) = if (!highContrast) {
    if (dark)
        Color(28, 28, 30)
    else Color(242, 242, 247)
} else {
    if (dark)
        Color(36, 36, 38)
    else Color(235, 235, 250)
}

fun CupertinoColors.systemGray7(dark: Boolean) = if (dark)
    Color(35, 35, 35)
else Color(238, 238, 238)

fun CupertinoColors.systemGray8(dark: Boolean) = if (dark)
    Color(90, 90, 95)
else
    Color(254, 254, 254)
