package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

internal val LocalColorScheme = staticCompositionLocalOf {
    lightColorScheme()
}

@Composable
@ReadOnlyComposable
internal fun isDark() =
    CupertinoTheme.colorScheme.isDark


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
)

fun lightColorScheme(
    accent : Color = CupertinoColors.systemBlue(false),
    label : Color = Color.Black,
    secondaryLabel : Color = Color(0x993c3c43),
    tertiaryLabel : Color = Color(0x4c3c3c43),
    quaternaryLabel : Color = Color(0x2d3c3c43),
    systemFill : Color = Color(0x5b787880),
    secondarySystemFill : Color = Color(0x51787880),
    tertiarySystemFill : Color = Color(0x3d767680),
    quaternarySystemFill : Color = Color(0x2d767680),
    placeholderText : Color = Color(0x4c3c3c43),
    separator : Color = Color(0x493c3c43),
    opaqueSeparator : Color =  Color(0xffc6c6c8),
    link : Color = Color(0xff007aff),
    systemGroupedBackground : Color = Color(0xfff2f2f7),
    secondarySystemGroupedBackground : Color = Color.White,
    tertiarySystemGroupedBackground : Color = Color(0xfff2f2f7),
    systemBackground : Color = Color.White,
    secondarySystemBackground : Color = Color(0xfff2f2f7),
    tertiarySystemBackground : Color = Color.White,
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
    accent : Color = CupertinoColors.systemBlue(true),
    label : Color = Color.White,
    secondaryLabel : Color = Color(0x99ebebf5),
    tetriaryLabel : Color = Color(0x4cebebf5),
    quaternaryLabel : Color = Color(0x28ebebf5),
    systemFill : Color = Color(0x5b787880),
    secondarySystemFill : Color = Color(0x51787880),
    tertiarySystemFill : Color = Color(0x3d767680),
    quaternarySystemFill : Color = Color(0x2d767680),
    placeholderText : Color = Color(0x4cebebf5),
    separator : Color = Color(0x99545458),
    opaqueSeparator : Color =  Color(0xff38383a),
    link : Color = Color(0xff0984ff),
    systemGroupedBackground : Color = Color.Black,
    secondarySystemGroupedBackground : Color = Color(0xff1c1c1e),
    tertiarySystemGroupedBackground : Color = Color(0xff2c2c2e),
    systemBackground : Color = Color.Black,
    secondarySystemBackground : Color = Color(0xff1c1c1e),
    tertiarySystemBackground : Color = Color(0xff2c2c2e),
) : ColorScheme = ColorScheme(
    isDark = true,
    accent = accent,
    label = label,
    secondaryLabel = secondaryLabel,
    tertiaryLabel = tetriaryLabel,
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
