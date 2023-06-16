package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.ui.graphics.Color

object AppleColors {

    private fun default(dark: Boolean, light: Color) =
        if (dark)
            Color(light.red, light.green + 10/255f, light.blue + 10/255f, light.alpha)
        else light

    fun red(dark: Boolean) = default(dark, Color(255, 59, 48))

    fun orange(dark: Boolean) = default(dark, Color(255, 149, 0))

    fun yellow(dark: Boolean) = default(dark, Color(255, 204, 0))

    fun green(dark: Boolean) = if (dark)
        Color(48, 209, 88)
    else Color(52, 199, 89)

    fun mint(dark: Boolean) = if (dark)
        Color(102, 212, 207)
    else Color(0, 199, 190)

    fun teal(dark: Boolean) = if (dark)
        Color(64, 200, 244)
    else Color(48, 176, 199)

    fun cyan(dark: Boolean) = if (dark)
        Color(100, 210, 255)
    else Color(50, 173, 230)

    fun blue(dark: Boolean) = if (dark)
        Color(10, 132, 255)
    else Color(0, 122, 255)

    fun indigo(dark: Boolean) = if (dark)
        Color(94, 92, 230)
    else Color(88, 86, 214)

    fun purple(dark: Boolean) = if (dark)
        Color(191, 90, 242)
    else Color(185, 82, 222)

    fun pink(dark: Boolean) = default(dark, Color(255, 45, 85))

    fun brown(dark: Boolean) = if (dark)
        Color(172, 142, 104)
    else Color(162, 132, 94)

    fun gray(dark: Boolean) = Color(142, 142, 147)

    fun gray2(dark: Boolean) = if (dark)
        Color(99, 99, 102)
    else Color(174, 174, 178)

    fun gray3(dark: Boolean) = if (dark)
        Color(72, 72, 74)
    else Color(199, 199, 204)

    fun gray4(dark: Boolean) = if (dark)
        Color(58, 58, 60)
    else Color(209, 209, 214)

    fun gray5(dark: Boolean) = if (dark)
        Color(44, 44, 46)
    else Color(229, 229, 234)

    fun gray6(dark: Boolean) = if (dark)
        Color(28, 28, 30)
    else Color(242, 242, 247)

    fun gray7(dark: Boolean) = if (dark)
        Color(35, 35, 35)
    else Color(238, 238, 238)

    fun gray8(dark: Boolean) = if (dark)
        Color(90, 90, 95)
    else
        Color(254, 254, 254)
}