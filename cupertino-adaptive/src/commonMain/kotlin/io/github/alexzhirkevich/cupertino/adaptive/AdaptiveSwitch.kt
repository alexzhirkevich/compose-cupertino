/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.adaptive

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
    adaptation: @Composable AdaptationScope<CupertinoSwitchAdaptation, MaterialSwitchAdaptation>.() -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    AdaptiveWidget(
        adaptationScope = remember {
            SwitchAdaptationScope()
        },
        adaptation = adaptation,
        material = {
            Switch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                modifier = modifier,
                thumbContent = thumbContent,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = it?.colors ?: SwitchDefaults.colors()
            )
        },
        cupertino = {
            CupertinoSwitch(
                checked = checked,
                onCheckedChange = onCheckedChange,
                modifier = modifier,
                thumbContent = thumbContent,
                interactionSource = interactionSource,
                colors = it?.colors ?: CupertinoSwitchDefaults.colors()
            )
        }
    )
}

class CupertinoSwitchAdaptation internal constructor(
    var colors : CupertinoSwitchColors
)

class MaterialSwitchAdaptation internal constructor(
    var colors : SwitchColors
)

@Stable
private class SwitchAdaptationScope :
    AdaptationScope<CupertinoSwitchAdaptation, MaterialSwitchAdaptation>() {

    override var cupertino : CupertinoSwitchAdaptation? by mutableStateOf(null)
        private set
    override var material : MaterialSwitchAdaptation? by mutableStateOf(null)
        private set

    @Composable
    @Stable
    override fun cupertino(block: @Composable CupertinoSwitchAdaptation.() -> Unit) {
        cupertino = CupertinoSwitchAdaptation(
            colors = CupertinoSwitchDefaults.colors()
        ).apply {
            block()
        }
    }

    @Composable
    @Stable
    override fun material(block: @Composable MaterialSwitchAdaptation.() -> Unit) {
        material = MaterialSwitchAdaptation(
            colors = SwitchDefaults.colors()
        ).apply {
            block()
        }
    }
}