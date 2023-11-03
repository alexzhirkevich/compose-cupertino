package io.github.alexzhirkevich.adaptive

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoSwitchColors
import io.github.alexzhirkevich.cupertino.CupertinoSwitchDefaults

/**
 * Adaptive Switch depending on current [Theme].
 *
 * Switches toggle the state of a single item on or off.
 *
 * @param checked whether or not this switch is checked
 * @param onCheckedChange called when this switch is clicked. If `null`, then this switch will not
 * be interactable, unless something else handles its input events and updates its state.
 * @param modifier the [Modifier] to be applied to this switch
 * @param thumbContent content that will be drawn inside the thumb
 * @param enabled controls the enabled state of this switch. When `false`, this component will not
 * respond to user input, and it will appear visually disabled and disabled to accessibility
 * services.
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * @param adaptation configuration block for theme-dependent properties
 * for this switch. You can create and pass in your own `remember`ed instance to observe
 * [Interaction]s and customize the appearance / behavior of this switch in different states.
 */
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveSwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    thumbContent: @Composable (() -> Unit)? = null,
    enabled: Boolean = true,
    adaptation: @Composable SwitchAdaptationScope.() -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val scope = remember {
        SwitchAdaptationScope()
    }

    scope.apply {
        adaptation()
    }

    when(LocalTheme.current){
        Theme.Cupertino -> CupertinoSwitch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            thumbContent = thumbContent,
            interactionSource = interactionSource,
            colors = scope.cupertino?.colors ?: CupertinoSwitchDefaults.colors()
        )

        else -> Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            thumbContent = thumbContent,
            enabled = enabled,
            interactionSource = interactionSource,
            colors = scope.material?.colors ?: SwitchDefaults.colors()
        )
    }
}

@Stable
class CupertinoSwitchAdaptation internal constructor(
    var colors : CupertinoSwitchColors
)

@Stable
class MaterialSwitchAdaptation internal constructor(
    var colors : SwitchColors
)

@Stable
class SwitchAdaptationScope internal constructor(): AdaptationScope<CupertinoSwitchAdaptation, MaterialSwitchAdaptation>() {

    internal var cupertino : CupertinoSwitchAdaptation? by mutableStateOf(null)
    internal var material : MaterialSwitchAdaptation? by mutableStateOf(null)

    @Composable
    override fun cupertino(block: @Composable CupertinoSwitchAdaptation.() -> Unit) {
        cupertino = CupertinoSwitchAdaptation(
            colors = CupertinoSwitchDefaults.colors()
        ).apply {
            block()
        }
    }

    @Composable
    override fun material(block: @Composable MaterialSwitchAdaptation.() -> Unit) {
        material = MaterialSwitchAdaptation(
            colors = SwitchDefaults.colors()
        ).apply {
            block()
        }
    }
}