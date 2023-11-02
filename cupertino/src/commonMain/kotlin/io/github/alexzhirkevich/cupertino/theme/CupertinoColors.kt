package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object CupertinoColors

val CupertinoColors.systemRed : Color
    @Composable
    get() = systemRed(isDark)

val CupertinoColors.systemOrange : Color
    @Composable
    get() = systemOrange(isDark)

val CupertinoColors.systemYellow : Color
    @Composable
    get() = systemYellow(isDark)

val CupertinoColors.systemGreen : Color
    @Composable
    get() = systemGreen(isDark)

val CupertinoColors.systemBlue : Color
    @Composable
    get() = systemBlue(isDark)

val CupertinoColors.systemMint : Color
    @Composable
    get() = systemMint(isDark)

val CupertinoColors.systemTeal : Color
    @Composable
    get() = systemTeal(isDark)

val CupertinoColors.systemCyan : Color
    @Composable
    get() = systemCyan(isDark)

val CupertinoColors.systemIndigo : Color
    @Composable
    get() = systemIndigo(isDark)

val CupertinoColors.systemPurple : Color
    @Composable
    get() = systemPurple(isDark)

val CupertinoColors.systemPink : Color
    @Composable
    get() = systemPink(isDark)

val CupertinoColors.systemBrown : Color
    @Composable
    get() = systemBrown(isDark)

val CupertinoColors.systemGray : Color
    @Composable
    get() = systemGray(isDark)

val CupertinoColors.systemGray2 : Color
    @Composable
    get() = systemGray2(isDark)

val CupertinoColors.systemGray3 : Color
    @Composable
    get() = systemGray3(isDark)

val CupertinoColors.systemGray4 : Color
    @Composable
    get() = systemGray4(isDark)

val CupertinoColors.systemGray5 : Color
    @Composable
    get() = systemGray5(isDark)

val CupertinoColors.systemGray6 : Color
    @Composable
    get() = systemGray6(isDark)

val CupertinoColors.systemGray7 : Color
    @Composable
    get() = systemGray7(isDark)

internal val CupertinoColors.systemGray8 : Color
    @Composable
    get() = systemGray8(isDark)

val CupertinoColors.black : Color
    get() = Color.Black

val CupertinoColors.blue : Color
    get() = Color.Blue

val CupertinoColors.brown : Color
    get() = Color(0xff996633)

val CupertinoColors.cyan : Color
    get() = Color.Cyan

val CupertinoColors.lightGray : Color
    get() = Color(0xffaaaaaa)

val CupertinoColors.darkGray : Color
    get() = Color(0xff555555)

val CupertinoColors.gray : Color
    get() = Color(0xff7f7f7f)

val CupertinoColors.green : Color
    get() = Color.Green

val CupertinoColors.magenta : Color
    get() = Color.Magenta

val CupertinoColors.orange : Color
    get() = Color(0xffff7f00)

val CupertinoColors.purple : Color
    get() = Color(0xff7f007f)

val CupertinoColors.red : Color
    get() = Color.Red

val CupertinoColors.white : Color
    get() = Color.White

val CupertinoColors.yellow : Color
    get() = Color.Yellow


private val isDark : Boolean
    @Composable
    get() = CupertinoTheme.colorScheme.isDark

private fun CupertinoColors.default(dark: Boolean, light: Color) =
    if (dark)
        Color(light.red, light.green + 10/255f, light.blue + 10/255f, light.alpha)
    else light

fun CupertinoColors.systemRed(dark: Boolean) = default(dark, Color(255, 59, 48))

fun CupertinoColors.systemOrange(dark: Boolean) = default(dark, Color(255, 149, 0))

fun CupertinoColors.systemYellow(dark: Boolean) = default(dark, Color(255, 204, 0))

fun CupertinoColors.systemGreen(dark: Boolean) = if (dark)
    Color(48, 209, 88)
else Color(52, 199, 89)

fun CupertinoColors.systemMint(dark: Boolean) = if (dark)
    Color(102, 212, 207)
else Color(0, 199, 190)

fun CupertinoColors.systemTeal(dark: Boolean) = if (dark)
    Color(64, 200, 244)
else Color(48, 176, 199)

fun CupertinoColors.systemCyan(dark: Boolean) = if (dark)
    Color(100, 210, 255)
else Color(50, 173, 230)

fun CupertinoColors.systemBlue(dark: Boolean) = if (dark)
    Color(10, 132, 255)
else Color(0, 122, 255)

fun CupertinoColors.systemIndigo(dark: Boolean) = if (dark)
    Color(94, 92, 230)
else Color(88, 86, 214)

fun CupertinoColors.systemPurple(dark: Boolean) = if (dark)
    Color(191, 90, 242)
else Color(185, 82, 222)

internal fun CupertinoColors.systemPink(dark: Boolean) = default(dark, Color(255, 45, 85))

fun CupertinoColors.systemBrown(dark: Boolean) = if (dark)
    Color(172, 142, 104)
else Color(162, 132, 94)

internal fun CupertinoColors.systemGray(dark: Boolean) = Color(142, 142, 147)

internal fun CupertinoColors.systemGray2(dark: Boolean) = if (dark)
    Color(99, 99, 102)
else Color(174, 174, 178)

internal fun CupertinoColors.systemGray3(dark: Boolean) = if (dark)
    Color(72, 72, 74)
else Color(199, 199, 204)

internal fun CupertinoColors.systemGray4(dark: Boolean) = if (dark)
    Color(58, 58, 60)
else Color(209, 209, 214)

internal fun CupertinoColors.systemGray5(dark: Boolean) = if (dark)
    Color(44, 44, 46)
else Color(229, 229, 234)

internal fun CupertinoColors.systemGray6(dark: Boolean) = if (dark)
    Color(28, 28, 30)
else Color(242, 242, 247)

internal fun CupertinoColors.systemGray7(dark: Boolean) = if (dark)
    Color(35, 35, 35)
else Color(238, 238, 238)

internal fun CupertinoColors.systemGray8(dark: Boolean) = if (dark)
    Color(90, 90, 95)
else
    Color(254, 254, 254)
