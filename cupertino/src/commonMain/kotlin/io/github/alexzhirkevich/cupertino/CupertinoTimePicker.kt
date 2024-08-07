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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.PlatformDateFormat
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.currentLocale
import io.github.alexzhirkevich.defaultLocale
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**
 * Creates a [CupertinoTimePickerState] for a time picker that is remembered across compositions
 * and configuration changes.
 *
 * @param initialHour starting hour for this state, will be displayed in the time picker when launched
 * Ranges from 0 to 23
 * @param initialMinute starting minute for this state, will be displayed in the time picker when
 * launched. Ranges from 0 to 59
 * @param is24Hour The format for this time picker. `false` for 12 hour format with an AM/PM toggle
 * or `true` for 24 hour format without toggle. Defaults to follow system setting.
 */
@Composable
@ExperimentalCupertinoApi
fun rememberCupertinoTimePickerState(
    initialHour: Int = 0,
    initialMinute: Int = 0,
    is24Hour: Boolean = PlatformDateFormat.is24HourFormat(defaultLocale()),
): CupertinoTimePickerState = rememberSaveable(
    saver = CupertinoTimePickerState.Saver()
) {
    CupertinoTimePickerState(
        initialHour = initialHour,
        initialMinute = initialMinute,
        is24Hour = is24Hour,
    )
}

private val MonospaceFont = SpanStyle(fontFeatureSettings = "tnum")

@OptIn(InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
fun CupertinoTimePicker(
    state: CupertinoTimePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
    containerColor : Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
    modifier: Modifier = Modifier
) {

    LaunchedEffect(state){
        state.isManual = false
    }

    if (state.is24Hour)
        CupertinoTimePicker24(
            state = state,
            height = height,
            indicator = indicator,
            containerColor = containerColor,
            modifier = modifier
        )
    else CupertinoTimePicker12(
        state = state,
        height = height,
        indicator = indicator,
        containerColor = containerColor,
        modifier = modifier
    )
}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
private fun CupertinoTimePicker24(
    state: CupertinoTimePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(height)
            .background(containerColor)
            .cupertinoPickerIndicator(
                state = state.hourState,
                indicator = indicator
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.widthIn(max = PickerMaxWidth / 2),
            horizontalArrangement = Arrangement.Center,
        ) {
            CupertinoWheelPicker(
                state = state.hourState,
                items = Hours24,
                height = height,
                modifier = Modifier.weight(1f),
                indicator = {},
                containerColor = containerColor,
            ) {
                Box(
                    modifier = Modifier
                        .padding(end = CupertinoTimePickerTokens.BlockWidth / 4),
                ) {

                    NumberPickerText(
                        text = it,
                        textAlign = TextAlign.End,
                    )
                }
            }

            CupertinoWheelPicker(
                state = state.minuteState,
                items = Minutes,
                height = height,
                modifier = Modifier.weight(1f),
                indicator = {},
                containerColor = containerColor,
            ) {
                Box(
                    modifier = Modifier
                        .padding(start = CupertinoTimePickerTokens.BlockWidth / 4),
                ) {
                    NumberPickerText(
                        text = it,
                        textAlign = TextAlign.Start,
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
private fun CupertinoTimePicker12(
    state: CupertinoTimePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(height)
            .background(containerColor)
            .cupertinoPickerIndicator(
                state = state.hourState,
                indicator = indicator
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.widthIn(max = PickerMaxWidth/2),
            horizontalArrangement = Arrangement.Center,
        ) {
            CupertinoWheelPicker(
                state = state.hourState,
                items = Hours12,
                height = height,
                modifier = Modifier.weight(1f),
                indicator = {},
                containerColor = containerColor,
            ) {
                Box(
                    modifier = Modifier
                ) {

                    NumberPickerText(
                        text = it,
                        textAlign = TextAlign.End,
                    )
                }
            }

            CupertinoWheelPicker(
                state = state.minuteState,
                items = Minutes,
                height = height,
                modifier = Modifier.width(CupertinoTimePickerTokens.BlockWidth),
                indicator = {},
                containerColor = containerColor,
                rotationTransformOrigin = TransformOrigin.Center
            ) {
                NumberPickerText(
                    text = it,
                    textAlign = TextAlign.Center,
                )
            }
            CupertinoWheelPicker(
                state = state.amPmState,
                items = listOf(true, false),
                height = height,
                modifier = Modifier
                    .weight(1f),
                indicator = {},
                containerColor = containerColor
            ) {
                PickerText(
                    text = if (it) AmPm.first else AmPm.second,
                    textAlign = TextAlign.Start,
                )
            }
        }
    }
}

@Composable
internal fun PickerText(
    text : String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    textAlign : TextAlign = TextAlign.Start
) {
    CupertinoText(
        text = text,
        modifier = modifier,
        textAlign = textAlign,
        maxLines = 1,
        minLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
internal fun NumberPickerText(
    text : String,
    modifier: Modifier = Modifier,
    textAlign : TextAlign = TextAlign.Start
) {
    CupertinoText(
        text = buildAnnotatedString {
            withStyle(MonospaceFont) {
                append(text)
            }
        },
        modifier = modifier
            .fillMaxWidth(),
        textAlign = textAlign,
        maxLines = 1,
        minLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

/**
 * A class to handle state changes in a [CupertinoTimePicker]
 *
 * @param initialHour
 *  starting hour for this state, will be displayed in the time picker when launched
 *  Ranges from 0 to 23
 * @param initialMinute
 *  starting minute for this state, will be displayed in the time picker when launched.
 *  Ranges from 0 to 59
 * @param is24Hour The format for this time picker `false` for 12 hour format with an AM/PM toggle
 *  or `true` for 24 hour format without toggle.
 */
@OptIn(InternalCupertinoApi::class)
@Stable
@ExperimentalCupertinoApi
class CupertinoTimePickerState internal constructor(
    initialHour: Int,
    initialMinute: Int,
    val is24Hour: Boolean = PlatformDateFormat.is24HourFormat(currentLocale()),
) {

    init {
        require(initialHour in 0..23) { "initialHour should in [0..23] range" }
        require(initialMinute in 0..59) { "initialMinute should be in [0..59] range" }
    }

    val minute : Int by derivedStateOf {
        if (isManual) {
            manualMinute
        } else {
            minuteState.selectedItemIndex
                .modSign(Minutes.size)
        }
    }

    val hour: Int by derivedStateOf {
        if (isManual) {
            manualHour
        } else {
            if (!is24Hour && isEvening)
                12 + hourState.selectedItemIndex.modSign(hoursList.size)
            else hourState.selectedItemIndex.modSign(hoursList.size)
        }
    }

    private val hoursList: List<String>
        get() = if (is24Hour) Hours24 else Hours12

    internal val isEvening
        get() =
            amPmState.selectedItemIndex == 1


    internal val hourState = CupertinoPickerState(
        infinite = true,
        initiallySelectedItemIndex = if (is24Hour)
            initialHour else initialHour % 12
    )

    internal val minuteState = CupertinoPickerState(
        infinite = true,
        initiallySelectedItemIndex = initialMinute
    )

    internal val amPmState = CupertinoPickerState()

    @InternalCupertinoApi
    var manualHour : Int by mutableStateOf(initialHour)

    @InternalCupertinoApi
    var manualMinute : Int by mutableStateOf(initialMinute)

    private var _isManual by mutableStateOf(false)

    @InternalCupertinoApi
    var isManual
        get() = _isManual
        set(value) {
            if (_isManual != value) {
                if (value) {
                    manualHour = hourState.currentSelectedItem(hoursList.size)
                    manualMinute = minuteState.currentSelectedItem(60)
                } else {
                    CoroutineScope(Dispatchers.Unconfined).launch {
                        hourState.scrollToItem(manualHour)
                        minuteState.scrollToItem(manualMinute)
                    }
                }
                _isManual = value
            }
        }


    companion object {
        /**
         * The default [Saver] implementation for [CupertinoTimePickerState].
         */
        fun Saver(): Saver<CupertinoTimePickerState, *> = Saver(
            save = {
                listOf(
                    it.hour,
                    it.minute,
                    it.is24Hour
                )
            },
            restore = { value ->
                CupertinoTimePickerState(
                    initialHour = value[0] as Int,
                    initialMinute = value[1] as Int,
                    is24Hour = value[2] as Boolean
                )
            }
        )
    }
}

internal fun Int.modSign(o : Int) : Int {
    return mod(o).let {
        if (it >= 0) it else this-it
    }
}
internal object CupertinoTimePickerTokens {
    val BlockWidth = 85.dp
    val Padding = 24.dp
}

internal fun Int.toStringWithLeadingZero() = if (this < 10) "0$this" else "$this"

internal val Minutes= (0..59).map(Int::toStringWithLeadingZero)
internal val Hours24= (0..23).map(Int::toStringWithLeadingZero)
internal val Hours12= (0..11).map(Int::toStringWithLeadingZero)

internal val AmPm = "AM" to "PM" // TODO localize
