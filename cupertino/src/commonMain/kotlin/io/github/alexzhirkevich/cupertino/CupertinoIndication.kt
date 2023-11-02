package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationInstance
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import io.github.alexzhirkevich.LocalContentColor

internal object CupertinoIndication : Indication {

    @Composable
    override fun rememberUpdatedInstance(interactionSource: InteractionSource): IndicationInstance {


        val color by rememberUpdatedState(LocalContentColor.current.copy(alpha = .1f))

        val pressed by interactionSource.collectIsPressedAsState()

        return remember {
            object : IndicationInstance{
                override fun ContentDrawScope.drawIndication() {
                    if (pressed) {
                        drawRect(color)
                    }
                    drawContent()
                }
            }
        }
    }
}
