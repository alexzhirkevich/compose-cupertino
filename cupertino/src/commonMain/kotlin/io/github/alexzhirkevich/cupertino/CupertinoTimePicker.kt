package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.PlatformDateFormat
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.currentlocale
import io.github.alexzhirkevich.defaultLocale


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

@Composable
fun CupertinoTimePicker(
    state: CupertinoTimePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier.height(height),
        horizontalArrangement = Arrangement.Center,
    ) {
        CupertinoPicker(
            state = state.hourState,
            modifier = Modifier.weight(1f),
            height = height,
            containerColor = containerColor,
            withRotation = true,
            rotationTransformOrigin = TransformOrigin(1f,.5f),
            items = if (state.is24Hour) Hours24 else Hours12
        ) {
            PickerText(
                text = it,
                textAlign = TextAlign.End,
            )
        }
        CupertinoPicker(
            height = height,
            state = state.minuteState,
            modifier = if (state.is24Hour)
                Modifier.weight(1f)
            else Modifier.width(CupertinoTimePickerTokens.BlockWidth),
            containerColor = containerColor,
            items = Minutes,
            withRotation = true,
            rotationTransformOrigin = if (state.is24Hour)
                TransformOrigin(0f,.5f)
            else TransformOrigin.Center,
        ) {
            PickerText(
                text = it,
                textAlign = if (state.is24Hour)
                    TextAlign.Start
                else TextAlign.Center,
            )
        }
        if (!state.is24Hour) {
            CupertinoPicker(
                state = state.amPmState,
                height = height,
                modifier = Modifier
                    .weight(1f),
                containerColor = containerColor,
                items = listOf(true, false)
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
@Stable
class CupertinoTimePickerState(
    initialHour: Int,
    initialMinute: Int,
    val is24Hour: Boolean = PlatformDateFormat.is24HourFormat(currentlocale()),
) {

    init {
        require(initialHour in 0..23) { "initialHour should in [0..23] range" }
        require(initialMinute in 0..59) { "initialMinute should be in [0..59] range" }
    }

    val minute get() = minuteState.selectedItemIndex


    val hour: Int by derivedStateOf {
        if (!is24Hour && isEvening)
            12 + hourState.selectedItemIndex else hourState.selectedItemIndex
    }

    internal val isEvening get() =
        amPmState.selectedItemIndex == 1


    internal val hourState = CupertinoPickerState(
        initiallySelectedItemIndex = if (is24Hour)
            initialHour else initialHour % 12
    )

    internal val minuteState = CupertinoPickerState(
        initiallySelectedItemIndex = initialMinute
    )

    internal val amPmState = CupertinoPickerState()


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

internal object CupertinoTimePickerTokens {
    val BlockWidth = 85.dp
}

internal val Minutes= (0..59).map { "${if (it < 10) "0" else ""}$it" }
internal val Hours24= (0..23).map { it.toString() }
internal val Hours12= (0..11).map { it.toString() }
internal val AmPm = "AM" to "PM" // TODO expect
