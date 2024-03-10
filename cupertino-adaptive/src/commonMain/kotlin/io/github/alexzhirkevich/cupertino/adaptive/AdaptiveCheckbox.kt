package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import io.github.alexzhirkevich.cupertino.CupertinoCheckBox
import io.github.alexzhirkevich.cupertino.CupertinoCheckboxColors
import io.github.alexzhirkevich.cupertino.CupertinoCheckboxDefaults
import io.github.alexzhirkevich.cupertino.CupertinoTriStateCheckBox

@ExperimentalAdaptiveApi
@Composable
fun AdaptiveCheckbox(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation : AdaptationScope<CupertinoCheckBoxAdaptation,MaterialCheckBoxAdaptation>.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptation = remember { CheckBoxAdaptation() },
        adaptationScope = adaptation,
        material = {
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = it.colors
            )
        },
        cupertino = {
            CupertinoCheckBox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = it.colors
            )
        }
    )
}

@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTriStateCheckbox(
    state: ToggleableState,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation : AdaptationScope<CupertinoCheckBoxAdaptation,MaterialCheckBoxAdaptation>.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptation = remember { CheckBoxAdaptation() },
        adaptationScope = adaptation,
        material = {
            TriStateCheckbox(
                state = state,
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = it.colors
            )
        },
        cupertino = {
            CupertinoTriStateCheckBox(
                state = state,
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = it.colors
            )
        }
    )
}

@Stable
class MaterialCheckBoxAdaptation(
    colors: CheckboxColors
) {
    var colors: CheckboxColors by mutableStateOf(colors)
}

@Stable
class CupertinoCheckBoxAdaptation(
    colors : CupertinoCheckboxColors
){
    var colors : CupertinoCheckboxColors by mutableStateOf(colors)
}

@OptIn(ExperimentalAdaptiveApi::class)
@Stable
private class CheckBoxAdaptation : Adaptation<CupertinoCheckBoxAdaptation,MaterialCheckBoxAdaptation>(){

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoCheckBoxAdaptation {
        val colors = CupertinoCheckboxDefaults.colors()

        return remember(colors) {
            CupertinoCheckBoxAdaptation(colors)
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialCheckBoxAdaptation {
        val colors = CheckboxDefaults.colors()

        return remember(colors) {
            MaterialCheckBoxAdaptation(colors)
        }
    }

}