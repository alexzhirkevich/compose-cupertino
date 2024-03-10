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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.CupertinoRangeSlider
import io.github.alexzhirkevich.cupertino.CupertinoSlider
import io.github.alexzhirkevich.cupertino.CupertinoSliderColors
import io.github.alexzhirkevich.cupertino.CupertinoSliderDefaults

/**
 * Sliders allow users to make selections from a range of values.
 *
 * Sliders reflect a range of values along a bar, from which users may select a single value.
 * They are ideal for adjusting settings such as volume, brightness, or applying image filters.
 *
 * @param value current value of the slider. If outside of [valueRange] provided, value will be
 * coerced to this range.
 * @param onValueChange callback in which value should be updated
 * @param modifier the [Modifier] to be applied to this slider
 * @param enabled controls the enabled state of this slider. When `false`, this component will not
 * respond to user input, and it will appear visually disabled and disabled to accessibility
 * services.
 * @param valueRange range of values that this slider can take. The passed [value] will be coerced
 * to this range.
 * @param steps if greater than 0, specifies the amount of discrete allowable values, evenly
 * distributed across the whole value range. If 0, the slider will behave continuously and allow any
 * value from the range specified. Must not be negative.
 * @param onValueChangeFinished called when value change has ended. This should not be used to
 * update the slider value (use [onValueChange] instead), but rather to know when the user has
 * completed selecting a new value by ending a drag or a click.
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * for this slider. You can create and pass in your own `remember`ed instance to observe
 * [Interaction]s and customize the appearance / behavior of this slider in different states.
 * @param adaptation adaptation scope
 */
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    adaptation : AdaptationScope<CupertinoSliderAdaptation, MaterialSliderAdaptation>.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptation = remember(steps) {
            SliderAdaptation(steps)
        },
        adaptationScope = adaptation,
        material = {
            Slider(
                value = value,
                onValueChange = onValueChange,
                modifier = modifier,
                enabled = enabled,
                valueRange = valueRange,
                steps = steps,
                onValueChangeFinished = onValueChangeFinished,
                colors = it.colors,
                interactionSource = interactionSource
            )
        },
        cupertino = {
            CupertinoSlider(
                value = value,
                onValueChange = onValueChange,
                modifier = modifier,
                enabled = enabled,
                valueRange = valueRange,
                steps = steps,
                onValueChangeFinished = onValueChangeFinished,
                colors = it.colors,
                interactionSource = interactionSource
            )
        }
    )
}

/**
 * Sliders allow users to make selections from a range of values.
 *
 * Sliders reflect a range of values along a bar, from which users may select a single value.
 * They are ideal for adjusting settings such as volume, brightness, or applying image filters.
 *
 * @param value current values of the RangeSlider. If either value is outside of [valueRange]
 * provided, it will be coerced to this range.
 * @param onValueChange lambda in which values should be updated
 * @param modifier modifiers for the Range Slider layout
 * @param enabled whether or not component is enabled and can we interacted with or not
 * @param valueRange range of values that Range Slider values can take. Passed [value] will be
 * coerced to this range
 * @param steps if greater than 0, specifies the amounts of discrete values, evenly distributed
 * between across the whole value range. If 0, range slider will behave as a continuous slider and
 * allow to choose any value from the range specified. Must not be negative.
 * @param onValueChangeFinished lambda to be invoked when value change has ended. This callback
 * shouldn't be used to update the range slider values (use [onValueChange] for that), but rather to
 * know when the user has completed selecting a new value by ending a drag or a click.
 * @param adaptation adaptation scope
 */
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveRangeSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null,
    adaptation : AdaptationScope<CupertinoSliderAdaptation, MaterialSliderAdaptation>.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptation = remember(steps) {
            SliderAdaptation(steps)
        },
        adaptationScope = adaptation,
        material = {
            RangeSlider(
                value = value,
                onValueChange = onValueChange,
                modifier = modifier,
                enabled = enabled,
                valueRange = valueRange,
                onValueChangeFinished = onValueChangeFinished,
                colors = it.colors,
            )
        },
        cupertino = {
            CupertinoRangeSlider(
                value = value,
                onValueChange = onValueChange,
                modifier = modifier,
                enabled = enabled,
                valueRange = valueRange,
                onValueChangeFinished = onValueChangeFinished,
                colors = it.colors,
            )
        }
    )
}

@Stable
class CupertinoSliderAdaptation internal constructor(
    colors : CupertinoSliderColors
) {
    var colors : CupertinoSliderColors by mutableStateOf(colors)
}

@Stable
class MaterialSliderAdaptation internal constructor(
    colors : SliderColors
) {
    var colors : SliderColors by mutableStateOf(colors)
}

@OptIn(ExperimentalAdaptiveApi::class)
@Stable
private class SliderAdaptation(private val steps: Int) :
    Adaptation<CupertinoSliderAdaptation, MaterialSliderAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoSliderAdaptation {

        val colors =  CupertinoSliderDefaults.defaultColorsFor(steps)

        return remember(colors) {
            CupertinoSliderAdaptation(
                colors = colors
            )
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialSliderAdaptation {

        val colors = SliderDefaults.colors()

        return remember(colors) {
            MaterialSliderAdaptation(colors)
        }
    }
}