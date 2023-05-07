package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationInstance
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.clipRect
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration

class CupertinoIndication : Indication {

    @Composable
    override fun rememberUpdatedInstance(interactionSource: InteractionSource): IndicationInstance {
        val pressed by interactionSource.collectIsPressedAsState()

        val isDark = LocalPlatformConfiguration.current?.darkMode ?: isSystemInDarkTheme()

        val color = (if (isDark) Color.White else Color.Black).copy(
            alpha = if (pressed) .2f else 0f
        )
        return remember(color) {  SolidIndicationInstance(color) }
    }
}

private class SolidIndicationInstance(
    private val color: Color
    ) : IndicationInstance{
    override fun ContentDrawScope.drawIndication() {
        drawContent()
        clipRect {
            drawRect(color)
        }
    }

}