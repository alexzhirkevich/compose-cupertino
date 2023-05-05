@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")

package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoSwitch
import com.github.alexzhirkevich.lookandfeel.components.cupertino.cupertinoColors
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

/**
 * @see [Switch]
 */
@Composable
fun AdaptiveSwitch(
    checked : Boolean,
    onCheckedChange : (Boolean) -> Unit,
    modifier : Modifier = Modifier,
    thumbContent: @Composable() (() -> Unit)? = null,
    colors : SwitchColors = SwitchDefaults.platformColors(),
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
){
    when (currentLookAndFeel){
        LookAndFeel.Cupertino -> CupertinoSwitch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            thumbContent = thumbContent,
            colors = colors,
            enabled = enabled,
            interactionSource = interactionSource
        )
        else -> Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            thumbContent = thumbContent,
            colors = colors,
            enabled = enabled,
            interactionSource = interactionSource
        )
    }
}

@Composable
fun SwitchDefaults.platformColors() = when(currentLookAndFeel){
    LookAndFeel.Cupertino -> cupertinoColors(LocalPlatformConfiguration.current?.darkMode ?: isSystemInDarkTheme())
    else -> colors()
}

