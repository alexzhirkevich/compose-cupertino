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

package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.MutatorMutex
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.DragScope
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.horizontalDrag
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.lerp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.input.pointer.AwaitPointerEventScope
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerId
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.PointerType
import androidx.compose.ui.input.pointer.changedToUpIgnoreConsumed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.ViewConfiguration
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.setProgress
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.lerp
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White
import io.github.alexzhirkevich.cupertino.theme.systemGray
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.math.sign

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
 * @param colors [CupertinoSliderColors] that will be used to resolve the colors used for this slider in
 * different states. See [CupertinoSliderDefaults.colors].
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * for this slider. You can create and pass in your own `remember`ed instance to observe
 * [Interaction]s and customize the appearance / behavior of this slider in different states.
 */
@Composable
fun CupertinoSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null,
    colors: CupertinoSliderColors = CupertinoSliderDefaults.defaultColorsFor(steps),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    require(steps >= 0) { "steps should be >= 0" }

    SliderImpl(
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        onValueChange = onValueChange,
        onValueChangeFinished = onValueChangeFinished,
        steps = steps,
        value = value,
        valueRange = valueRange,
        thumb = {
            CupertinoSliderDefaults.Thumb(
                interactionSource = interactionSource,
                colors = colors,
                enabled = enabled
            )
        },
        track = { sliderPositions ->
            CupertinoSliderDefaults.Track(
                colors = colors,
                enabled = enabled,
                sliderPositions = sliderPositions
            )
        }
    )
}

/***
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
 * @param onValueChangeFinished called when value change has ended. This should not be used to
 * update the slider value (use [onValueChange] instead), but rather to know when the user has
 * completed selecting a new value by ending a drag or a click.
 * @param colors [CupertinoSliderColors] that will be used to resolve the colors used for this slider in
 * different states. See [CupertinoSliderDefaults.colors].
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * for this slider. You can create and pass in your own `remember`ed instance to observe
 * [Interaction]s and customize the appearance / behavior of this slider in different states.
 * @param thumb the thumb to be displayed on the slider, it is placed on top of the track. The lambda
 * receives a [SliderPositions] which is used to obtain the current active track and the tick positions
 * if the slider is discrete.
 * @param track the track to be displayed on the slider, it is placed underneath the thumb. The lambda
 * receives a [SliderPositions] which is used to obtain the current active track and the tick positions
 * if the slider is discrete.
 * @param steps if greater than 0, specifies the amount of discrete allowable values, evenly
 * distributed across the whole value range. If 0, the slider will behave continuously and allow any
 * value from the range specified. Must not be negative.
 */
@Composable
fun CupertinoSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    onValueChangeFinished: (() -> Unit)? = null,
    steps: Int = 0,
    colors: CupertinoSliderColors = CupertinoSliderDefaults.defaultColorsFor(steps),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    thumb: @Composable (SliderPositions) -> Unit = {
        CupertinoSliderDefaults.Thumb(
            interactionSource = interactionSource,
            colors = colors,
            enabled = enabled
        )
    },
    track: @Composable (SliderPositions) -> Unit = { sliderPositions ->
        CupertinoSliderDefaults.Track(
            colors = colors,
            enabled = enabled,
            sliderPositions = sliderPositions
        )
    },
    /*@IntRange(from = 0)*/
) {
    require(steps >= 0) { "steps should be >= 0" }

    SliderImpl(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        valueRange = valueRange,
        steps = steps,
        onValueChangeFinished = onValueChangeFinished,
        interactionSource = interactionSource,
        thumb = thumb,
        track = track
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
 * @param colors [CupertinoSliderColors] that will be used to determine the color of the Range Slider
 * parts in different state. See [CupertinoSliderDefaults.colors] to customize.
 */
@Composable
fun CupertinoRangeSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    /*@IntRange(from = 0)*/
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null,
    colors: CupertinoSliderColors = CupertinoSliderDefaults.defaultColorsFor(steps)
) {
    val startInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    val endInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() }

    require(steps >= 0) { "steps should be >= 0" }

    RangeSliderImpl(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        enabled = enabled,
        valueRange = valueRange,
        steps = steps,
        onValueChangeFinished = onValueChangeFinished,
        startInteractionSource = startInteractionSource,
        endInteractionSource = endInteractionSource,
        startThumb = {
            CupertinoSliderDefaults.Thumb(
                interactionSource = startInteractionSource,
                colors = colors,
                enabled = enabled
            )
        },
        endThumb = {
            CupertinoSliderDefaults.Thumb(
                interactionSource = endInteractionSource,
                colors = colors,
                enabled = enabled
            )
        },
        track = { sliderPositions ->
            CupertinoSliderDefaults.Track(
                colors = colors,
                enabled = enabled,
                sliderPositions = sliderPositions
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
 * @param colors [CupertinoSliderColors] that will be used to determine the color of the Range Slider
 * parts in different state. See [CupertinoSliderDefaults.colors] to customize.
 * @param startInteractionSource the [MutableInteractionSource] representing the stream of
 * [Interaction]s for the start thumb. You can create and pass in your own
 * `remember`ed instance to observe.
 * @param endInteractionSource the [MutableInteractionSource] representing the stream of
 * [Interaction]s for the end thumb. You can create and pass in your own
 * `remember`ed instance to observe.
 * @param startThumb the start thumb to be displayed on the Range Slider. The lambda receives a
 * [SliderPositions] which is used to obtain the current active track and the tick
 * positions if the range slider is discrete.
 * @param endThumb the end thumb to be displayed on the Range Slider. The lambda receives a
 * [SliderPositions] which is used to obtain the current active track and the tick
 * positions if the range slider is discrete.
 * @param track the track to be displayed on the range slider, it is placed underneath the thumb.
 * The lambda receives a [SliderPositions] which is used to obtain the current active track and the
 * tick positions if the range slider is discrete.
 */
@Composable
fun CupertinoRangeSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    onValueChangeFinished: (() -> Unit)? = null,
    steps: Int = 0,
    colors: CupertinoSliderColors = CupertinoSliderDefaults.defaultColorsFor(steps),
    startInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    endInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    startThumb: @Composable (SliderPositions) -> Unit = {
        CupertinoSliderDefaults.Thumb(
            interactionSource = startInteractionSource,
            colors = colors,
            enabled = enabled
        )
    },
    endThumb: @Composable (SliderPositions) -> Unit = {
        CupertinoSliderDefaults.Thumb(
            interactionSource = endInteractionSource,
            colors = colors,
            enabled = enabled
        )
    },
    track: @Composable (SliderPositions) -> Unit = { sliderPositions ->
        CupertinoSliderDefaults.Track(
            colors = colors,
            enabled = enabled,
            sliderPositions = sliderPositions
        )
    },
) {
    require(steps >= 0) { "steps should be >= 0" }

    RangeSliderImpl(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        enabled = enabled,
        valueRange = valueRange,
        steps = steps,
        onValueChangeFinished = onValueChangeFinished,
        startInteractionSource = startInteractionSource,
        endInteractionSource = endInteractionSource,
        startThumb = startThumb,
        endThumb = endThumb,
        track = track
    )
}

@OptIn(InternalCupertinoApi::class)
@Composable
private fun SliderImpl(
    modifier: Modifier,
    enabled: Boolean,
    interactionSource: MutableInteractionSource,
    onValueChange: (Float) -> Unit,
    onValueChangeFinished: (() -> Unit)?,
    steps: Int,
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    thumb: @Composable (SliderPositions) -> Unit,
    track: @Composable (SliderPositions) -> Unit
) {
    val onValueChangeState = rememberUpdatedState<(Float) -> Unit> {
        if (it != value) {
            onValueChange(it)
        }
    }

    val tickFractions = remember(steps) {
        stepsToTickFractions(steps)
    }

    val thumbWidth = remember { mutableStateOf(ThumbWidth.value) }
    val totalWidth = remember { mutableStateOf(0) }

    fun scaleToUserValue(minPx: Float, maxPx: Float, offset: Float) =
        scale(minPx, maxPx, offset, valueRange.start, valueRange.endInclusive)

    fun scaleToOffset(minPx: Float, maxPx: Float, userValue: Float) =
        scale(valueRange.start, valueRange.endInclusive, userValue, minPx, maxPx)

    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

    val rawOffset = remember {
        lazy {
            val maxPx = max(totalWidth.value - thumbWidth.value / 2, 0f)
            val minPx = min(thumbWidth.value / 2, maxPx)
            mutableStateOf(scaleToOffset(minPx, maxPx, value))
        }
    }
    val pressOffset = remember { mutableStateOf(0f) }
    val coerced = value.coerceIn(valueRange.start, valueRange.endInclusive)

    val positionFraction = calcFraction(valueRange.start, valueRange.endInclusive, coerced)
    val sliderPositions = remember {
        SliderPositions(0f..positionFraction, tickFractions)
    }
    sliderPositions.activeRange = 0f..positionFraction
    sliderPositions.tickFractions = tickFractions

    val haptic = LocalHapticFeedback.current

    var prevValue by remember(value) {
        mutableStateOf(value)
    }

    val draggableState = remember(valueRange) {
        SliderDraggableState {
            val maxPx = max(totalWidth.value - thumbWidth.value / 2, 0f)
            val minPx = min(thumbWidth.value / 2, maxPx)
            rawOffset.value.value = (rawOffset.value.value + it + pressOffset.value).coerceIn(0f, totalWidth.value.toFloat())
            pressOffset.value = 0f

            val offsetInTrack = snapValueToTick(rawOffset.value.value, tickFractions, minPx, maxPx)
            val new = scaleToUserValue(minPx, maxPx, offsetInTrack)

            if (steps > 0) {
                if (prevValue != new) {
                    prevValue = new
                    haptic.performHapticFeedback(CupertinoHapticFeedback.SelectionChanged)
                }
            }

            onValueChangeState.value.invoke(new)
        }
    }

    val gestureEndAction = rememberUpdatedState {
        if (!draggableState.isDragging) {
            // check isDragging in case the change is still in progress (touch -> drag case)
            onValueChangeFinished?.invoke()
        }
    }

    val press = Modifier.sliderTapModifier(
        draggableState,
        interactionSource,
        totalWidth.value,
        isRtl,
        rawOffset,
        gestureEndAction,
        pressOffset,
        enabled
    )

    val drag = Modifier.draggable(
        orientation = Orientation.Horizontal,
        reverseDirection = isRtl,
        enabled = enabled,
        interactionSource = interactionSource,
        onDragStopped = { _ -> gestureEndAction.value.invoke() },
        startDragImmediately = draggableState.isDragging,
        state = draggableState
    )

    Layout(
        {
            Box(modifier = Modifier.layoutId(SliderComponents.THUMB)) { Box(drag){ thumb(sliderPositions) } }
            Box(modifier = Modifier.layoutId(SliderComponents.TRACK)) { track(sliderPositions) }
        },
        modifier = modifier
            .requiredSizeIn(
                minWidth = SliderTokens.HandleWidth,
                minHeight = SliderTokens.HandleHeight
            )
            .sliderSemantics(
                value = value,
                enabled = enabled,
                onValueChange = onValueChange,
                onValueChangeFinished = onValueChangeFinished,
                valueRange = valueRange,
                steps = steps
            )
            .focusable(enabled, interactionSource)
            .then(press)
//            .then(drag)
    ) { measurables, constraints ->

        val thumbPlaceable = measurables.first {
            it.layoutId == SliderComponents.THUMB
        }.measure(constraints)

        val trackPlaceable = measurables.first {
            it.layoutId == SliderComponents.TRACK
        }.measure(
            constraints.offset(
                horizontal = - thumbPlaceable.width
            ).copy(minHeight = 0)
        )

        val sliderWidth = thumbPlaceable.width + trackPlaceable.width
        val sliderHeight = max(trackPlaceable.height, thumbPlaceable.height)

        thumbWidth.value = thumbPlaceable.width.toFloat()
        totalWidth.value = sliderWidth

        val trackOffsetX = thumbPlaceable.width / 2
        val thumbOffsetX = ((trackPlaceable.width) * positionFraction).roundToInt()
        val trackOffsetY = (sliderHeight - trackPlaceable.height) / 2
        val thumbOffsetY = (sliderHeight - thumbPlaceable.height) / 2

        layout(
            sliderWidth,
            sliderHeight
        ) {
            trackPlaceable.placeRelative(
                trackOffsetX,
                trackOffsetY
            )
            thumbPlaceable.placeRelative(
                thumbOffsetX,
                thumbOffsetY
            )
        }
    }
}

@Composable
private fun RangeSliderImpl(
    modifier: Modifier,
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    enabled: Boolean,
    valueRange: ClosedFloatingPointRange<Float>,
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)?,
    startInteractionSource: MutableInteractionSource,
    endInteractionSource: MutableInteractionSource,
    startThumb: @Composable ((SliderPositions) -> Unit),
    endThumb: @Composable ((SliderPositions) -> Unit),
    track: @Composable ((SliderPositions) -> Unit)
) {
    val onValueChangeState = rememberUpdatedState<(ClosedFloatingPointRange<Float>) -> Unit> {
        if (it != value) {
            onValueChange(it)
        }
    }

    val tickFractions = remember(steps) {
        stepsToTickFractions(steps)
    }

    var startThumbWidth by remember { mutableStateOf(ThumbWidth.value) }
    var endThumbWidth by remember { mutableStateOf(ThumbWidth.value) }
    var totalWidth by remember { mutableStateOf(0) }

    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

    // scales range offset from within minPx..maxPx to within valueRange.start..valueRange.end
    fun scaleToUserValue(minPx: Float, maxPx: Float, offset: ClosedFloatingPointRange<Float>) =
        scale(minPx, maxPx, offset, valueRange.start, valueRange.endInclusive)

    // scales float userValue within valueRange.start..valueRange.end to within minPx..maxPx
    fun scaleToOffset(minPx: Float, maxPx: Float, userValue: Float) =
        scale(valueRange.start, valueRange.endInclusive, userValue, minPx, maxPx)

    val obtainedMeasurements = remember { mutableStateOf(false) }
    val rawOffsetStart = remember { mutableStateOf(0f) }
    val rawOffsetEnd = remember { mutableStateOf(0f) }

    val gestureEndAction = rememberUpdatedState<(Boolean) -> Unit> {
        onValueChangeFinished?.invoke()
    }

    val onDrag = rememberUpdatedState<(Boolean, Float) -> Unit> { isStart, offset ->
        val maxPx = max(totalWidth - endThumbWidth / 2, 0f)
        val minPx = min(startThumbWidth / 2, maxPx)
        val offsetRange = if (isStart) {
            rawOffsetStart.value = (rawOffsetStart.value + offset)
            rawOffsetEnd.value = scaleToOffset(minPx, maxPx, value.endInclusive)
            val offsetEnd = rawOffsetEnd.value
            var offsetStart = rawOffsetStart.value.coerceIn(minPx, offsetEnd)
            offsetStart = snapValueToTick(offsetStart, tickFractions, minPx, maxPx)
            offsetStart..offsetEnd
        } else {
            rawOffsetEnd.value = (rawOffsetEnd.value + offset)
            rawOffsetStart.value = scaleToOffset(minPx, maxPx, value.start)
            val offsetStart = rawOffsetStart.value
            var offsetEnd = rawOffsetEnd.value.coerceIn(offsetStart, maxPx)
            offsetEnd = snapValueToTick(offsetEnd, tickFractions, minPx, maxPx)
            offsetStart..offsetEnd
        }

        onValueChangeState.value.invoke(scaleToUserValue(minPx, maxPx, offsetRange))
    }

    val pressDrag = Modifier.rangeSliderPressDragModifier(
        startInteractionSource,
        endInteractionSource,
        rawOffsetStart,
        rawOffsetEnd,
        enabled,
        isRtl,
        totalWidth,
        valueRange,
        gestureEndAction,
        onDrag,
    )

    // The positions of the thumbs are dependant on each other.
    val coercedStart = value.start.coerceIn(valueRange.start, value.endInclusive)
    val coercedEnd = value.endInclusive.coerceIn(value.start, valueRange.endInclusive)
    val positionFractionStart = calcFraction(
        valueRange.start,
        valueRange.endInclusive,
        coercedStart
    )
    val positionFractionEnd = calcFraction(valueRange.start, valueRange.endInclusive, coercedEnd)

    val sliderPositions = remember {
        SliderPositions(
            positionFractionStart..positionFractionEnd,
            tickFractions
        )
    }
    sliderPositions.activeRange = positionFractionStart..positionFractionEnd
    sliderPositions.tickFractions = tickFractions

    val startSteps = floor(steps * positionFractionEnd).toInt()
    val endSteps = floor(steps * (1f - positionFractionStart)).toInt()

    val startThumbSemantics = Modifier.sliderSemantics(
        coercedStart,
        enabled,
        { changedVal -> onValueChangeState.value.invoke(changedVal..coercedEnd) },
        onValueChangeFinished,
        valueRange.start..coercedEnd,
        startSteps
    )
    val endThumbSemantics = Modifier.sliderSemantics(
        coercedEnd,
        enabled,
        { changedVal -> onValueChangeState.value.invoke(coercedStart..changedVal) },
        onValueChangeFinished,
        coercedStart..valueRange.endInclusive,
        endSteps
    )

    Layout(
        {
            Box(modifier = Modifier
                .layoutId(RangeSliderComponents.STARTTHUMB)
                .focusable(enabled, startInteractionSource)
                .then(startThumbSemantics)
            ) { startThumb(sliderPositions) }
            Box(modifier = Modifier
                .layoutId(RangeSliderComponents.ENDTHUMB)
                .focusable(enabled, endInteractionSource)
                .then(endThumbSemantics)
            ) { endThumb(sliderPositions) }
            Box(modifier = Modifier.layoutId(RangeSliderComponents.TRACK)) {
                track(sliderPositions)
            }
        },
        modifier = modifier
            .requiredSizeIn(
                minWidth = SliderTokens.HandleWidth,
                minHeight = SliderTokens.HandleHeight
            )
            .then(pressDrag)
    ) { measurables, constraints ->
        val startThumbPlaceable = measurables.first {
            it.layoutId == RangeSliderComponents.STARTTHUMB
        }.measure(
            constraints
        )

        val endThumbPlaceable = measurables.first {
            it.layoutId == RangeSliderComponents.ENDTHUMB
        }.measure(
            constraints
        )

        val trackPlaceable = measurables.first {
            it.layoutId == RangeSliderComponents.TRACK
        }.measure(
            constraints.offset(
                horizontal = - (startThumbPlaceable.width + endThumbPlaceable.width) / 2
            ).copy(minHeight = 0)
        )

        val sliderWidth = trackPlaceable.width +
                (startThumbPlaceable.width + endThumbPlaceable.width) / 2
        val sliderHeight = maxOf(
            trackPlaceable.height,
            startThumbPlaceable.height,
            endThumbPlaceable.height
        )

        startThumbWidth = startThumbPlaceable.width.toFloat()
        endThumbWidth = endThumbPlaceable.width.toFloat()
        totalWidth = sliderWidth

        // Updates rawOffsetStart and rawOffsetEnd with the correct min and max pixel.
        // We use this `obtainedMeasurements` boolean so that we only do this update once.
        // Is there a cleaner way to do this?
        if (!obtainedMeasurements.value) {
            val finalizedMaxPx = max(totalWidth - endThumbWidth / 2, 0f)
            val finalizedMinPx = min(startThumbWidth / 2, finalizedMaxPx)
            rawOffsetStart.value = scaleToOffset(
                finalizedMinPx,
                finalizedMaxPx,
                value.start
            )
            rawOffsetEnd.value = scaleToOffset(
                finalizedMinPx,
                finalizedMaxPx,
                value.endInclusive
            )
            obtainedMeasurements.value = true
        }

        val trackOffsetX = startThumbPlaceable.width / 2
        val startThumbOffsetX = (trackPlaceable.width * positionFractionStart).roundToInt()
        // When start thumb and end thumb have different widths,
        // we need to add a correction for the centering of the slider.
        val endCorrection = (startThumbWidth - endThumbWidth) / 2
        val endThumbOffsetX =
            (trackPlaceable.width * positionFractionEnd + endCorrection).roundToInt()
        val trackOffsetY = (sliderHeight - trackPlaceable.height) / 2
        val startThumbOffsetY = (sliderHeight - startThumbPlaceable.height) / 2
        val endThumbOffsetY = (sliderHeight - endThumbPlaceable.height) / 2

        layout(
            sliderWidth,
            sliderHeight
        ) {
            trackPlaceable.placeRelative(
                trackOffsetX,
                trackOffsetY
            )
            startThumbPlaceable.placeRelative(
                startThumbOffsetX,
                startThumbOffsetY
            )
            endThumbPlaceable.placeRelative(
                endThumbOffsetX,
                endThumbOffsetY
            )
        }
    }
}

/**
 * Object to hold defaults used by [CupertinoSlider]
 */
@Stable
object CupertinoSliderDefaults {

    /**
     * Creates a [CupertinoSliderColors] that represents the different colors used in parts of the
     * [CupertinoSlider] in different states.
     *
     * For the name references below the words "active" and "inactive" are used. Active part of
     * the slider is filled with progress, so if slider's progress is 30% out of 100%, left (or
     * right in RTL) 30% of the track will be active, while the rest is inactive.
     *
     * @param thumbColor thumb color when enabled
     * @param activeTrackColor color of the track in the part that is "active", meaning that the
     * thumb is ahead of it
     * @param activeTickColor colors to be used to draw tick marks on the active track, if `steps`
     * is specified
     * @param inactiveTrackColor color of the track in the part that is "inactive", meaning that the
     * thumb is before it
     * @param inactiveTickColor colors to be used to draw tick marks on the inactive track, if
     * `steps` are specified on the Slider is specified
     * @param disabledThumbColor thumb colors when disabled
     * @param disabledActiveTrackColor color of the track in the "active" part when the Slider is
     * disabled
     * @param disabledActiveTickColor colors to be used to draw tick marks on the active track
     * when Slider is disabled and when `steps` are specified on it
     * @param disabledInactiveTrackColor color of the track in the "inactive" part when the
     * Slider is disabled
     * @param disabledInactiveTickColor colors to be used to draw tick marks on the inactive part
     * of the track when Slider is disabled and when `steps` are specified on it
     */
    @Composable
    @ReadOnlyComposable
    fun colors(
        thumbColor: Color = CupertinoColors.White,
        activeTrackColor: Color = CupertinoTheme.colorScheme.accent,
        activeTickColor: Color = CupertinoTheme.colorScheme.separator,
        inactiveTrackColor: Color = CupertinoTheme.colorScheme.separator,
        inactiveTickColor: Color = activeTickColor,
        disabledThumbColor: Color = thumbColor,
        disabledActiveTrackColor: Color = activeTrackColor.copy(alpha = .5f),
        disabledActiveTickColor: Color = activeTickColor,
        disabledInactiveTrackColor: Color = inactiveTrackColor.copy(alpha = .5f),
        disabledInactiveTickColor: Color = activeTickColor
    ): CupertinoSliderColors = CupertinoSliderColors(
        thumbColor = thumbColor,
        activeTrackColor = activeTrackColor,
        activeTickColor = activeTickColor,
        inactiveTrackColor = inactiveTrackColor,
        inactiveTickColor = inactiveTickColor,
        disabledThumbColor = disabledThumbColor,
        disabledActiveTrackColor = disabledActiveTrackColor,
        disabledActiveTickColor = disabledActiveTickColor,
        disabledInactiveTrackColor = disabledInactiveTrackColor,
        disabledInactiveTickColor = disabledInactiveTickColor
    )

    /**
     * Creates a [CupertinoSliderColors] that represents the different colors used in parts of the
     * [CupertinoSlider] in different states.
     *
     * For the name references below the words "active" and "inactive" are used. Active part of
     * the slider is filled with progress, so if slider's progress is 30% out of 100%, left (or
     * right in RTL) 30% of the track will be active, while the rest is inactive.
     *
     * @param thumbColor thumb color when enabled
     * @param activeTrackColor color of the track in the part that is "active", meaning that the
     * thumb is ahead of it
     * @param activeTickColor colors to be used to draw tick marks on the active track, if `steps`
     * is specified
     * @param inactiveTrackColor color of the track in the part that is "inactive", meaning that the
     * thumb is before it
     * @param inactiveTickColor colors to be used to draw tick marks on the inactive track, if
     * `steps` are specified on the Slider is specified
     * @param disabledThumbColor thumb colors when disabled
     * @param disabledActiveTrackColor color of the track in the "active" part when the Slider is
     * disabled
     * @param disabledActiveTickColor colors to be used to draw tick marks on the active track
     * when Slider is disabled and when `steps` are specified on it
     * @param disabledInactiveTrackColor color of the track in the "inactive" part when the
     * Slider is disabled
     * @param disabledInactiveTickColor colors to be used to draw tick marks on the inactive part
     * of the track when Slider is disabled and when `steps` are specified on it
     */
    @Composable
    @ReadOnlyComposable
    fun colorsSteps(
        thumbColor: Color = CupertinoColors.White,
        activeTrackColor: Color = CupertinoColors.systemGray,
        activeTickColor: Color = activeTrackColor,
        inactiveTrackColor: Color = activeTrackColor,
        inactiveTickColor: Color = activeTickColor,
        disabledThumbColor: Color = thumbColor,
        disabledActiveTrackColor: Color = activeTrackColor,
        disabledActiveTickColor: Color = activeTickColor,
        disabledInactiveTrackColor: Color = inactiveTrackColor,
        disabledInactiveTickColor: Color = activeTickColor
    ): CupertinoSliderColors = CupertinoSliderColors(
        thumbColor = thumbColor,
        activeTrackColor = activeTrackColor,
        activeTickColor = activeTickColor,
        inactiveTrackColor = inactiveTrackColor,
        inactiveTickColor = inactiveTickColor,
        disabledThumbColor = disabledThumbColor,
        disabledActiveTrackColor = disabledActiveTrackColor,
        disabledActiveTickColor = disabledActiveTickColor,
        disabledInactiveTrackColor = disabledInactiveTrackColor,
        disabledInactiveTickColor = disabledInactiveTickColor
    )

    @Composable
    fun defaultColorsFor(steps: Int) =
        if (steps == 0)
            colors()
        else
            colorsSteps()

    /**
     * The Default thumb for [CupertinoSlider] and [CupertinoRangeSlider]
     *
     * @param interactionSource the [MutableInteractionSource] representing the stream of
     * [Interaction]s for this thumb. You can create and pass in your own `remember`ed
     * instance to observe
     * @param modifier the [Modifier] to be applied to the thumb.
     * @param colors [CupertinoSliderColors] that will be used to resolve the colors used for this thumb in
     * different states. See [CupertinoSliderDefaults.colors].
     * @param enabled controls the enabled state of this slider. When `false`, this component will
     * not respond to user input, and it will appear visually disabled and disabled to
     * accessibility services.
     */
    @Composable
    fun Thumb(
        interactionSource: MutableInteractionSource,
        modifier: Modifier = Modifier,
        colors: CupertinoSliderColors = colors(),
        enabled: Boolean = true,
        thumbSize: DpSize = ThumbSize
    ) {
        val interactions = remember { mutableStateListOf<Interaction>() }
        LaunchedEffect(interactionSource) {
            interactionSource.interactions.collect { interaction ->
                when (interaction) {
                    is PressInteraction.Press -> interactions.add(interaction)
                    is PressInteraction.Release -> interactions.remove(interaction.press)
                    is PressInteraction.Cancel -> interactions.remove(interaction.press)
                    is DragInteraction.Start -> interactions.add(interaction)
                    is DragInteraction.Stop -> interactions.remove(interaction.start)
                    is DragInteraction.Cancel -> interactions.remove(interaction.start)
                }
            }
        }

        val shape = SliderTokens.HandleShape

        Spacer(
            modifier
                .size(thumbSize)
                .hoverable(interactionSource = interactionSource)
                .shadow(if (enabled) SliderTokens.ThumbElevation else 0.dp, shape, clip = false)
                .background(colors.thumbColor(enabled).value, shape)
        )
    }

    /**
     * The Default track for [CupertinoSlider] and [CupertinoRangeSlider]
     *
     * @param sliderPositions [SliderPositions] which is used to obtain the current active track
     * and the tick positions if the slider is discrete.
     * @param modifier the [Modifier] to be applied to the track.
     * @param colors [CupertinoSliderColors] that will be used to resolve the colors used for this track in
     * different states. See [CupertinoSliderDefaults.colors].
     * @param enabled controls the enabled state of this slider. When `false`, this component will
     * not respond to user input, and it will appear visually disabled and disabled to
     * accessibility services.
     */
    @Composable
    fun Track(
        sliderPositions: SliderPositions,
        modifier: Modifier = Modifier,
        colors: CupertinoSliderColors = colors(),
        enabled: Boolean = true,
    ) {
        val inactiveTrackColor = colors.trackColor(enabled, active = false)
        val activeTrackColor = colors.trackColor(enabled, active = true)
        val inactiveTickColor = colors.tickColor(enabled, active = false)
        val activeTickColor = colors.tickColor(enabled, active = true)
        Canvas(modifier
            .fillMaxWidth()
            .height(TrackHeight)
        ) {
            val isRtl = layoutDirection == LayoutDirection.Rtl
            val sliderLeft = Offset(0f, center.y)
            val sliderRight = Offset(size.width, center.y)
            val sliderStart = if (isRtl) sliderRight else sliderLeft
            val sliderEnd = if (isRtl) sliderLeft else sliderRight
            val tickSize = TickSize.toPx()
            val trackStrokeWidth = TrackHeight.toPx()
            drawLine(
                color = inactiveTrackColor.value,
                start = sliderStart,
                end = sliderEnd,
                strokeWidth = trackStrokeWidth,
                cap = StrokeCap.Round
            )
            val sliderValueEnd = Offset(
                sliderStart.x +
                        (sliderEnd.x - sliderStart.x) * sliderPositions.activeRange.endInclusive,
                center.y
            )

            val sliderValueStart = Offset(
                sliderStart.x +
                        (sliderEnd.x - sliderStart.x) * sliderPositions.activeRange.start,
                center.y
            )

            drawLine(
                color = activeTrackColor.value,
                start = sliderValueStart,
                end = sliderValueEnd,
                strokeWidth = trackStrokeWidth,
                cap = StrokeCap.Round
            )
            sliderPositions.tickFractions.groupBy {
                it > sliderPositions.activeRange.endInclusive ||
                        it < sliderPositions.activeRange.start
            }.forEach { (outsideFraction, list) ->

                list.fastForEach {
                    drawLine(
                        color = (if (outsideFraction) inactiveTickColor else activeTickColor).value,
                        start = Offset(lerp(sliderStart, sliderEnd, it).x, center.y - 2.dp.toPx()),
                        end = Offset(lerp(sliderStart, sliderEnd, it).x, center.y + 2.dp.toPx()),
                        strokeWidth = tickSize,
                        cap = StrokeCap.Square
                    )
                }
            }
        }
    }
}

private fun snapValueToTick(
    current: Float,
    tickFractions: FloatArray,
    minPx: Float,
    maxPx: Float
): Float {
    // target is a closest anchor to the `current`, if exists
    return tickFractions
        .minByOrNull { abs(lerp(minPx, maxPx, it) - current) }
        ?.run { lerp(minPx, maxPx, this) }
        ?: current
}

private suspend fun AwaitPointerEventScope.awaitSlop(
    id: PointerId,
    type: PointerType
): Pair<PointerInputChange, Float>? {
    var initialDelta = 0f
    val postPointerSlop = { pointerInput: PointerInputChange, offset: Float ->
        pointerInput.consume()
        initialDelta = offset
    }
    val afterSlopResult = awaitHorizontalPointerSlopOrCancellation(id, type, postPointerSlop)
    return if (afterSlopResult != null) afterSlopResult to initialDelta else null
}

private fun stepsToTickFractions(steps: Int): FloatArray {
    return if (steps == 0) floatArrayOf() else FloatArray(steps + 2) { it.toFloat() / (steps + 1) }
}

// Scale x1 from a1..b1 range to a2..b2 range
private fun scale(a1: Float, b1: Float, x1: Float, a2: Float, b2: Float) =
    lerp(a2, b2, calcFraction(a1, b1, x1))

// Scale x.start, x.endInclusive from a1..b1 range to a2..b2 range
private fun scale(a1: Float, b1: Float, x: ClosedFloatingPointRange<Float>, a2: Float, b2: Float) =
    scale(a1, b1, x.start, a2, b2)..scale(a1, b1, x.endInclusive, a2, b2)

// Calculate the 0..1 fraction that `pos` value represents between `a` and `b`
private fun calcFraction(a: Float, b: Float, pos: Float) =
    (if (b - a == 0f) 0f else (pos - a) / (b - a)).coerceIn(0f, 1f)

private fun Modifier.sliderSemantics(
    value: Float,
    enabled: Boolean,
    onValueChange: (Float) -> Unit,
    onValueChangeFinished: (() -> Unit)? = null,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0
): Modifier {
    val coerced = value.coerceIn(valueRange.start, valueRange.endInclusive)
    return semantics {
        if (!enabled) disabled()
        setProgress(
            action = { targetValue ->
                var newValue = targetValue.coerceIn(valueRange.start, valueRange.endInclusive)
                val originalVal = newValue
                val resolvedValue = if (steps > 0) {
                    var distance: Float = newValue
                    for (i in 0..steps + 1) {
                        val stepValue = lerp(
                            valueRange.start,
                            valueRange.endInclusive,
                            i.toFloat() / (steps + 1)
                        )
                        if (abs(stepValue - originalVal) <= distance) {
                            distance = abs(stepValue - originalVal)
                            newValue = stepValue
                        }
                    }
                    newValue
                } else {
                    newValue
                }

                // This is to keep it consistent with AbsSeekbar.java: return false if no
                // change from current.
                if (resolvedValue == coerced) {
                    false
                } else {
                    onValueChange(resolvedValue)
                    onValueChangeFinished?.invoke()
                    true
                }
            }
        )
    }.progressSemantics(value, valueRange, steps)
}

private fun Modifier.sliderTapModifier(
    draggableState: DraggableState,
    interactionSource: MutableInteractionSource,
    maxPx: Int,
    isRtl: Boolean,
    rawOffset: Lazy<State<Float>>,
    gestureEndAction: State<() -> Unit>,
    pressOffset: MutableState<Float>,
    enabled: Boolean
) = composed(
    factory = {
        if (enabled) {

            val scope = rememberCoroutineScope()
            pointerInput(draggableState, interactionSource, maxPx, isRtl) {
                awaitEachGesture {
                    val event = awaitFirstDown()
                    val end = waitForUpOrCancellation() ?: return@awaitEachGesture
                    val slop = viewConfiguration.pointerSlop(event.type)

                    if (abs((event.position.x - end.position.x)) < slop) {

                        val offset = if (isRtl)
                            maxPx - end.position.x
                        else end.position.x

                        scope.launch {
                            animateToTarget(
                                draggableState,
                                rawOffset.value.value,
                                offset,
                                0f
                            )
                            gestureEndAction.value.invoke()
                        }
                    }
                }
            }
        } else {
            this
        }
    },
    inspectorInfo = debugInspectorInfo {
        name = "sliderTapModifier"
        properties["draggableState"] = draggableState
        properties["interactionSource"] = interactionSource
        properties["maxPx"] = maxPx
        properties["isRtl"] = isRtl
        properties["rawOffset"] = rawOffset
        properties["gestureEndAction"] = gestureEndAction
        properties["pressOffset"] = pressOffset
        properties["enabled"] = enabled
    }
)

private suspend fun animateToTarget(
    draggableState: DraggableState,
    current: Float,
    target: Float,
    velocity: Float
) {
    draggableState.drag {
        var latestValue = current

        val anim = if (target > current)
            SliderToTickAnimationForward
        else SliderToTickAnimationBackward

        Animatable(initialValue = current).animateTo(target, anim, velocity) {
            dragBy(this.value - latestValue)
            latestValue = this.value
        }
    }
}

private fun Modifier.rangeSliderPressDragModifier(
    startInteractionSource: MutableInteractionSource,
    endInteractionSource: MutableInteractionSource,
    rawOffsetStart: State<Float>,
    rawOffsetEnd: State<Float>,
    enabled: Boolean,
    isRtl: Boolean,
    maxPx: Int,
    valueRange: ClosedFloatingPointRange<Float>,
    gestureEndAction: State<(Boolean) -> Unit>,
    onDrag: State<(Boolean, Float) -> Unit>,
): Modifier =
    if (enabled) {
        pointerInput(startInteractionSource, endInteractionSource, maxPx, isRtl, valueRange) {
            val rangeSliderLogic = RangeSliderLogic(
                startInteractionSource,
                endInteractionSource,
                rawOffsetStart,
                rawOffsetEnd,
                onDrag
            )
            coroutineScope {
                awaitEachGesture {
                    val event = awaitFirstDown(requireUnconsumed = false)
                    val interaction = DragInteraction.Start()
                    var posX = if (isRtl) maxPx - event.position.x else event.position.x
                    val compare = rangeSliderLogic.compareOffsets(posX)
                    var draggingStart = if (compare != 0) {
                        compare < 0
                    } else {
                        rawOffsetStart.value > posX
                    }

                    awaitSlop(event.id, event.type)?.let {
                        val slop = viewConfiguration.pointerSlop(event.type)
                        val shouldUpdateCapturedThumb = abs(rawOffsetEnd.value - posX) < slop &&
                                abs(rawOffsetStart.value - posX) < slop
                        if (shouldUpdateCapturedThumb) {
                            val dir = it.second
                            draggingStart = if (isRtl) dir >= 0f else dir < 0f
                            posX += it.first.positionChange().x
                        }
                    }

                    rangeSliderLogic.captureThumb(
                        draggingStart,
                        posX,
                        interaction,
                        this@coroutineScope
                    )

                    val finishInteraction = try {
                        val success = horizontalDrag(pointerId = event.id) {
                            val deltaX = it.positionChange().x
                            onDrag.value.invoke(draggingStart, if (isRtl) -deltaX else deltaX)
                        }
                        if (success) {
                            DragInteraction.Stop(interaction)
                        } else {
                            DragInteraction.Cancel(interaction)
                        }
                    } catch (e: CancellationException) {
                        DragInteraction.Cancel(interaction)
                    }

                    gestureEndAction.value.invoke(draggingStart)
                    launch {
                        rangeSliderLogic
                            .activeInteraction(draggingStart)
                            .emit(finishInteraction)
                    }
                }
            }
        }
    } else {
        this
    }

private class RangeSliderLogic(
    val startInteractionSource: MutableInteractionSource,
    val endInteractionSource: MutableInteractionSource,
    val rawOffsetStart: State<Float>,
    val rawOffsetEnd: State<Float>,
    val onDrag: State<(Boolean, Float) -> Unit>,
) {
    fun activeInteraction(draggingStart: Boolean): MutableInteractionSource =
        if (draggingStart) startInteractionSource else endInteractionSource

    fun compareOffsets(eventX: Float): Int {
        val diffStart = abs(rawOffsetStart.value - eventX)
        val diffEnd = abs(rawOffsetEnd.value - eventX)
        return diffStart.compareTo(diffEnd)
    }

    fun captureThumb(
        draggingStart: Boolean,
        posX: Float,
        interaction: Interaction,
        scope: CoroutineScope
    ) {
        onDrag.value.invoke(
            draggingStart,
            posX - if (draggingStart) rawOffsetStart.value else rawOffsetEnd.value
        )
        scope.launch {
            activeInteraction(draggingStart).emit(interaction)
        }
    }
}

@Immutable
class CupertinoSliderColors internal constructor(
    private val thumbColor: Color,
    private val activeTrackColor: Color,
    private val activeTickColor: Color,
    private val inactiveTrackColor: Color,
    private val inactiveTickColor: Color,
    private val disabledThumbColor: Color,
    private val disabledActiveTrackColor: Color,
    private val disabledActiveTickColor: Color,
    private val disabledInactiveTrackColor: Color,
    private val disabledInactiveTickColor: Color
) {

    @Composable
    internal fun thumbColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) thumbColor else disabledThumbColor)
    }

    @Composable
    internal fun trackColor(enabled: Boolean, active: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (active) activeTrackColor else inactiveTrackColor
            } else {
                if (active) disabledActiveTrackColor else disabledInactiveTrackColor
            }
        )
    }

    @Composable
    internal fun tickColor(enabled: Boolean, active: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (active) activeTickColor else inactiveTickColor
            } else {
                if (active) disabledActiveTickColor else disabledInactiveTickColor
            }
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CupertinoSliderColors) return false

        if (thumbColor != other.thumbColor) return false
        if (activeTrackColor != other.activeTrackColor) return false
        if (activeTickColor != other.activeTickColor) return false
        if (inactiveTrackColor != other.inactiveTrackColor) return false
        if (inactiveTickColor != other.inactiveTickColor) return false
        if (disabledThumbColor != other.disabledThumbColor) return false
        if (disabledActiveTrackColor != other.disabledActiveTrackColor) return false
        if (disabledActiveTickColor != other.disabledActiveTickColor) return false
        if (disabledInactiveTrackColor != other.disabledInactiveTrackColor) return false
        if (disabledInactiveTickColor != other.disabledInactiveTickColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = thumbColor.hashCode()
        result = 31 * result + activeTrackColor.hashCode()
        result = 31 * result + activeTickColor.hashCode()
        result = 31 * result + inactiveTrackColor.hashCode()
        result = 31 * result + inactiveTickColor.hashCode()
        result = 31 * result + disabledThumbColor.hashCode()
        result = 31 * result + disabledActiveTrackColor.hashCode()
        result = 31 * result + disabledActiveTickColor.hashCode()
        result = 31 * result + disabledInactiveTrackColor.hashCode()
        result = 31 * result + disabledInactiveTickColor.hashCode()
        return result
    }
}

// Internal to be referred to in tests
internal val ThumbWidth = 26.dp
private val ThumbHeight = 26.dp
private val ThumbSize = DpSize(ThumbWidth, ThumbHeight)
private val TickSize = SliderTokens.TickMarksContainerSize

// Internal to be referred to in tests
internal val TrackHeight = SliderTokens.InactiveTrackHeight

private val SliderToTickAnimationForward = tween<Float>(durationMillis = 180, easing = LinearEasing)
private val SliderToTickAnimationBackward = tween<Float>(durationMillis = 80, easing = LinearEasing)

private class SliderDraggableState(
    val onDelta: (Float) -> Unit
) : DraggableState {

    var isDragging by mutableStateOf(false)
        private set

    private val dragScope: DragScope = object : DragScope {
        override fun dragBy(pixels: Float): Unit = onDelta(pixels)
    }

    private val scrollMutex = MutatorMutex()

    override suspend fun drag(
        dragPriority: MutatePriority,
        block: suspend DragScope.() -> Unit
    ): Unit = coroutineScope {
        isDragging = true
        scrollMutex.mutateWith(dragScope, dragPriority, block)
        isDragging = false
    }

    override fun dispatchRawDelta(delta: Float) {
        return onDelta(delta)
    }
}

private enum class SliderComponents {
    THUMB,
    TRACK
}

private enum class RangeSliderComponents {
    ENDTHUMB,
    STARTTHUMB,
    TRACK
}

/**
 * Class that holds information about [CupertinoSlider]'s and [CupertinoRangeSlider]'s active track
 * and fractional positions where the discrete ticks should be drawn on the track.
 */
@Stable
class SliderPositions(
    initialActiveRange: ClosedFloatingPointRange<Float> = 0f..1f,
    initialTickFractions: FloatArray = floatArrayOf()
) {
    /**
     * [ClosedFloatingPointRange] that indicates the current active range for the
     * start to thumb for a [CupertinoSlider] and start thumb to end thumb for a [CupertinoRangeSlider].
     */
    var activeRange: ClosedFloatingPointRange<Float> by mutableStateOf(initialActiveRange)
        internal set

    /**
     * The discrete points where a tick should be drawn on the track.
     * Each value of tickFractions should be within the range [0f, 1f]. If
     * the track is continuous, then tickFractions will be an empty [FloatArray].
     */
    var tickFractions: FloatArray by mutableStateOf(initialTickFractions)
        internal set

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SliderPositions) return false

        if (activeRange != other.activeRange) return false
        if (!tickFractions.contentEquals(other.tickFractions)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = activeRange.hashCode()
        result = 31 * result + tickFractions.contentHashCode()
        return result
    }
}

internal suspend fun AwaitPointerEventScope.awaitHorizontalPointerSlopOrCancellation(
    pointerId: PointerId,
    pointerType: PointerType,
    onPointerSlopReached: (change: PointerInputChange, overSlop: Float) -> Unit
) = awaitPointerSlopOrCancellation(
    pointerId = pointerId,
    pointerType = pointerType,
    onPointerSlopReached = onPointerSlopReached,
    getDragDirectionValue = { it.x }
)

private suspend inline fun AwaitPointerEventScope.awaitPointerSlopOrCancellation(
    pointerId: PointerId,
    pointerType: PointerType,
    onPointerSlopReached: (PointerInputChange, Float) -> Unit,
    getDragDirectionValue: (Offset) -> Float
): PointerInputChange? {
    if (currentEvent.isPointerUp(pointerId)) {
        return null // The pointer has already been lifted, so the gesture is canceled
    }
    val touchSlop = viewConfiguration.pointerSlop(pointerType)
    var pointer: PointerId = pointerId
    var totalPositionChange = 0f

    while (true) {
        val event = awaitPointerEvent()
        val dragEvent = event.changes.fastFirstOrNull { it.id == pointer }!!
        if (dragEvent.isConsumed) {
            return null
        } else if (dragEvent.changedToUpIgnoreConsumed()) {
            val otherDown = event.changes.fastFirstOrNull { it.pressed }
            if (otherDown == null) {
                // This is the last "up"
                return null
            } else {
                pointer = otherDown.id
            }
        } else {
            val currentPosition = dragEvent.position
            val previousPosition = dragEvent.previousPosition
            val positionChange = getDragDirectionValue(currentPosition) -
                    getDragDirectionValue(previousPosition)
            totalPositionChange += positionChange

            val inDirection = abs(totalPositionChange)
            if (inDirection < touchSlop) {
                // verify that nothing else consumed the drag event
                awaitPointerEvent(PointerEventPass.Final)
                if (dragEvent.isConsumed) {
                    return null
                }
            } else {
                onPointerSlopReached(
                    dragEvent,
                    totalPositionChange - (sign(totalPositionChange) * touchSlop)
                )
                if (dragEvent.isConsumed) {
                    return dragEvent
                } else {
                    totalPositionChange = 0f
                }
            }
        }
    }
}

private fun PointerEvent.isPointerUp(pointerId: PointerId): Boolean =
    changes.fastFirstOrNull { it.id == pointerId }?.pressed != true

private val mouseSlop = 0.125.dp
private val defaultTouchSlop = 18.dp // The default touch slop on Android devices
private val mouseToTouchSlopRatio = mouseSlop / defaultTouchSlop

internal fun ViewConfiguration.pointerSlop(pointerType: PointerType): Float {
    return when (pointerType) {
        PointerType.Mouse -> touchSlop * mouseToTouchSlopRatio
        else -> touchSlop
    }
}

internal object SliderTokens {
    val ThumbElevation = 8.dp
    val HandleHeight = 20.0.dp
    val HandleShape = CircleShape
    val HandleWidth = 20.0.dp
    val InactiveTrackHeight = 4.0.dp
    val TickMarksContainerSize = 3.0.dp
}