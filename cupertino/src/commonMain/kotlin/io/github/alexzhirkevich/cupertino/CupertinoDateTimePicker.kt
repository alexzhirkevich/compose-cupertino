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

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.CalendarDate
import io.github.alexzhirkevich.CalendarModel
import io.github.alexzhirkevich.CalendarModelImpl
import io.github.alexzhirkevich.CalendarMonth
import io.github.alexzhirkevich.MillisecondsIn24Hours
import io.github.alexzhirkevich.PlatformDateFormat
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
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
@ExperimentalCupertinoApi
fun rememberCupertinoDateTimePickerState(
    initialSelectedDateMillis: Long = CupertinoDateTimePickerDefault.today.utcTimeMillis,
    initialDisplayedMonthMillis: Long = initialSelectedDateMillis,
    initialHour: Int = 0,
    initialMinute: Int = 0,
    is24Hour: Boolean = PlatformDateFormat.is24HourFormat(defaultLocale()),
    yearRange: IntRange = CupertinoDateTimePickerDefault.YearRangeSmall,
): CupertinoDateTimePickerState = rememberSaveable(
    saver = CupertinoDateTimePickerState.Saver()
) {
    CupertinoDateTimePickerState(
        initialSelectedDateMillis = initialSelectedDateMillis,
        initialDisplayedMonthMillis = initialDisplayedMonthMillis,
        yearRange = yearRange,
        initialHour = initialHour,
        initialMinute = initialMinute,
        is24Hour = is24Hour
    )
}


/**
 * Date and time picker
 * */
@Composable
@ExperimentalCupertinoApi
fun CupertinoDateTimePicker(
    state: CupertinoDateTimePickerState,
    mode: DatePickerDisplayMode = DatePickerDisplayMode.Wheel,
    containerColor : Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
    modifier: Modifier = Modifier
) {
    when(mode){
        DatePickerDisplayMode.Wheel -> CupertinoDateTimePickerWheel(
            state = state,
            containerColor = containerColor,
            modifier = modifier
        )

//        DatePickerDisplayMode.Pager -> TODO()
    }
}

enum class DatePickerDisplayMode {
    /** Paging date time picker */
//    Pager,

    /** Wheel date and time picker */
    Wheel
}


private const val Today = "Today" // todo localize

@Composable
@ExperimentalCupertinoApi
private fun CupertinoDateTimePickerWheel(
    state: CupertinoDateTimePickerState,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {

    val height = CupertinoPickerDefaults.Height

    Row(
        modifier = modifier
            .requiredHeight(height),
        horizontalArrangement = Arrangement.Center,
    ) {

        state.stateData.calendarModel.today

        val locale = defaultLocale()
        CupertinoPicker(
            state = state.stateData.dateState,
            height = height,
            modifier = Modifier
                .weight(1.25f),
            containerColor = containerColor,
            withRotation = true,
            rotationTransformOrigin = TransformOrigin(.5f, .5f),
            items = state.stateData.days,
        ) {
            PickerText(
                text = if (it.value.utcTimeMillis == CupertinoDateTimePickerDefault.today.utcTimeMillis)
                    Today else it.value.format(
                    calendarModel = state.stateData.calendarModel,
                    skeleton = CupertinoDateTimePickerDefault.MonthWeekdayDaySkeleton,
                    locale = locale
                ),
                textAlign = TextAlign.End,
            )
        }

        CupertinoPicker(
            state = state.stateData.hourState,
            height = height,
            modifier = Modifier.width(CupertinoTimePickerTokens.BlockWidth /
                    if (state.stateData.is24Hour) 1 else 2),
            containerColor = containerColor,
            withRotation = true,
            items = if (state.stateData.is24Hour) Hours24 else Hours12,
        ) {
            PickerText(
                text = it,
                textAlign = if (state.stateData.is24Hour)
                    TextAlign.Center else TextAlign.End,
            )
        }
        CupertinoPicker(
            state = state.stateData.minuteState,
            height = height,
            modifier = if (state.stateData.is24Hour)
                Modifier.weight(1f)
            else Modifier.width(CupertinoTimePickerTokens.BlockWidth),
            containerColor = containerColor,
            items = Minutes,
            withRotation = true,
            rotationTransformOrigin = if (state.stateData.is24Hour)
                TransformOrigin(0f, .5f)
            else TransformOrigin.Center,
        ) {
            PickerText(
                text = it,
                textAlign = if (state.stateData.is24Hour)
                    TextAlign.Start
                else TextAlign.Center,
            )
        }
        if (!state.stateData.is24Hour) {
            CupertinoPicker(
                state = state.stateData.amPmState,
                height = height,
                modifier = Modifier
                    .weight(1f),
                containerColor = containerColor,
                items = listOf(true, false),
            ) {
                PickerText(
                    text = if (it) AmPm.first else AmPm.second,
                    textAlign = TextAlign.Start,
                )
            }
        }
    }
}

/**
 * Holds the state's data for the date picker.
 *
 * Note that the internal representation is capable of holding a start and end date. However, the
 * the [CupertinoDateTimePickerState] and the [DateRangePickerState] that use this class will only expose
 * publicly the relevant functionality for their purpose.
 *
 * @param initialSelectedStartDateMillis timestamp in _UTC_ milliseconds from the epoch that
 * represents an initial selection of a start date. Provide a `null` to indicate no selection.
 * @param initialSelectedEndDateMillis timestamp in _UTC_ milliseconds from the epoch that
 * represents an initial selection of an end date. Provide a `null` to indicate no selection. This
 * value will be ignored in case it's smaller or equals to the initial start value.
 * @param initialDisplayedMonthMillis timestamp in _UTC_ milliseconds from the epoch that represents
 * an initial selection of a month to be displayed to the user. In case `null` is provided, the
 * displayed month would be the current one.
 * @param yearRange an [IntRange] that holds the year range that the date picker will be limited to
 * @param initialDisplayMode an initial [DatePickerDisplayMode] that this state will hold
 * @see rememberCupertinoDateTimePickerState
 */
@OptIn(ExperimentalCupertinoApi::class)
@Stable
internal class DateTimePickerStateData constructor(
    initialSelectedStartDateMillis: Long,
    initialSelectedEndDateMillis: Long?,
    initialDisplayedMonthMillis: Long,
    initialDisplayedHour: Int,
    initialDisplayedMinute: Int,
    val is24Hour : Boolean,
    val yearRange: IntRange
) {

    val calendarModel: CalendarModel = CalendarModelImpl()

    /**
     * A mutable state of [CalendarDate] that represents the start date for a selection.
     */
    val selectedStartDate : CalendarDate
        get() = days[dateState.selectedItemIndex].value
    /**
     * A mutable state of [CalendarDate] that represents the end date for a selection.
     *
     * Single date selection states that use this [DateTimePickerStateData] should always have this as `null`.
     */
    var selectedEndDate = mutableStateOf<CalendarDate?>(null)

    val selectedMinute : Int
        get() = minuteState.selectedItemIndex

    val selectedHour : Int by derivedStateOf {
        if (!is24Hour && isEvening)
            12 + hourState.selectedItemIndex else hourState.selectedItemIndex
    }

    private val isEvening get() =
        amPmState.selectedItemIndex == 1

    internal val todayIndex: Int by lazy {
        val start = calendarModel.getDate(yearRange.first, 1, 1).utcTimeMillis

        ((initialDisplayedMonthMillis - start) / MillisecondsIn24Hours).toInt()
    }


    internal val dateState by lazy {
        CupertinoPickerState(
            initiallySelectedItemIndex = todayIndex
        )
    }

    internal val hourState by lazy {
        CupertinoPickerState(
            initiallySelectedItemIndex = if (is24Hour)
                initialDisplayedHour else initialDisplayedHour % 12
        )
    }

    internal val minuteState by lazy {
        CupertinoPickerState(
            initiallySelectedItemIndex = initialDisplayedMinute
        )
    }

    internal val amPmState by lazy {
        CupertinoPickerState()
    }

    /**
     * Initialize the state with the provided initial selections.
     */
    init {
        setSelection(
            startDateMillis = initialSelectedStartDateMillis,
            endDateMillis = initialSelectedEndDateMillis
        )
    }

    /**
     * A mutable state for the month that is displayed to the user. In case an initial month was not
     * provided, the current month will be the one to be displayed.
     */
    var displayedMonth by mutableStateOf(
        run {
            val month = calendarModel.getMonth(initialDisplayedMonthMillis)
            require(yearRange.contains(month.year)) {
                "The initial display month's year (${month.year}) is out of the years range of " +
                        "$yearRange."
            }
            month
        }
    )

    /**
     * The current [CalendarMonth] that represents the present's day month.
     */
    val currentMonth: CalendarMonth
        get() = calendarModel.getMonth(calendarModel.today)

    /**
     * The displayed month index within the total months at the defined years range.
     *
     * @see [displayedMonth]
     * @see [yearRange]
     */
    val displayedMonthIndex: Int
        get() = displayedMonth.indexIn(yearRange)

    /**
     * The total month count for the defined years range.
     *
     * @see [yearRange]
     */
    val totalMonthsInRange: Int
        get() = (yearRange.last - yearRange.first + 1) * 12


    internal val days by lazy {
        val range = yearRange

        val start = calendarModel.getDate(range.first, 1, 1).utcTimeMillis
        val end = calendarModel.getDate(range.last + 1, 1, 1).utcTimeMillis

        List(((end - start) / MillisecondsIn24Hours).toInt()) {
            lazy {
                calendarModel.getCanonicalDate(start + it * MillisecondsIn24Hours)
            }
        }
    }

    /**
     * Sets a start and end selection dates.
     *
     * The function expects the dates to be within the state's year-range, and for the start date to
     * appear before, or be equal, the end date. Also, if an end date is provided (e.g. not `null`),
     * a start date is also expected to be provided. In any other case, an
     * [IllegalArgumentException] is thrown.
     *
     * @param startDateMillis timestamp in _UTC_ milliseconds from the epoch that represents the
     * start date selection. Provide a `null` to indicate no selection.
     * @param endDateMillis timestamp in _UTC_ milliseconds from the epoch that represents the
     * end date selection. Provide a `null` to indicate no selection.
     * @throws IllegalArgumentException in case the given timestamps do not comply with the expected
     * values specified above.
     */
    internal fun setSelection(startDateMillis: Long, endDateMillis: Long?) {
        val startDate = calendarModel.getCanonicalDate(startDateMillis)
        val endDate = if (endDateMillis != null) {
            calendarModel.getCanonicalDate(endDateMillis)
        } else {
            null
        }
        // Validate that both dates are within the valid years range.
        startDate.let {
            require(yearRange.contains(it.year)) {
                "The provided start date year (${it.year}) is out of the years range of $yearRange."
            }
        }
        endDate?.let {
            require(yearRange.contains(it.year)) {
                "The provided end date year (${it.year}) is out of the years range of $yearRange."
            }
        }
        // Validate that an end date cannot be set without a start date.
        if (endDate != null) {
            requireNotNull(startDate) {
                "An end date was provided without a start date."
            }
            // Validate that the end date appears on or after the start date.
            require(startDate.utcTimeMillis <= endDate.utcTimeMillis) {
                "The provided end date appears before the start date."
            }
        }
        selectedEndDate.value = endDate
    }

    companion object {
        /**
         * A [Saver] implementation for [DateTimePickerStateData].
         */
        fun Saver(): Saver<DateTimePickerStateData, Any> = listSaver(
            save = {
                listOf(
                    it.selectedStartDate.utcTimeMillis,
                    it.selectedEndDate.value?.utcTimeMillis,
                    it.displayedMonth.startUtcTimeMillis,
                    it.selectedHour,
                    it.selectedMinute,
                    it.is24Hour,
                    it.yearRange.first,
                    it.yearRange.last
                )
            },
            restore = { value ->
                DateTimePickerStateData(
                    initialSelectedStartDateMillis = value[0] as Long,
                    initialSelectedEndDateMillis = value[1] as Long?,
                    initialDisplayedMonthMillis = value[2] as Long,
                    initialDisplayedHour = value[3] as Int,
                    initialDisplayedMinute = value[4] as Int,
                    is24Hour = value[5] as Boolean,
                    yearRange = IntRange(value[6] as Int, value[7] as Int),
                )
            }
        )
    }
}


/**
 * A state object that can be hoisted to observe the date picker state. See
 * [rememberCupertinoDateTimePickerState].
 *
 * The state's [selectedDateTimeMillis] will provide a timestamp that represents the _start_ of the day.
 */
@Stable
@ExperimentalCupertinoApi
class CupertinoDateTimePickerState private constructor(internal val stateData: DateTimePickerStateData) {

    /**
     * Constructs a DatePickerState.
     *
     * @param initialSelectedDateMillis timestamp in _UTC_ milliseconds from the epoch that
     * represents an initial selection of a date. Provide a `null` to indicate no selection. Note
     * that the state's
     * [selectedDateTimeMillis] will provide a timestamp that represents the _start_ of the day, which
     * may be different than the provided initialSelectedDateMillis.
     * @param initialDisplayedMonthMillis timestamp in _UTC_ milliseconds from the epoch that
     * represents an initial selection of a month to be displayed to the user. In case `null` is
     * provided, the displayed month would be the current one.
     * @param yearRange an [IntRange] that holds the year range that the date picker will be limited
     * to
     * @see rememberCupertinoDateTimePickerState
     * @throws [IllegalArgumentException] if the initial selected date or displayed month represent
     * a year that is out of the year range.
     */
    constructor(
        @Suppress("AutoBoxing") initialSelectedDateMillis: Long,
        @Suppress("AutoBoxing") initialDisplayedMonthMillis: Long,
        yearRange: IntRange,
        initialHour: Int,
        initialMinute: Int,
        is24Hour: Boolean,
    ) : this(
        DateTimePickerStateData(
            initialSelectedStartDateMillis = initialSelectedDateMillis,
            initialSelectedEndDateMillis = null,
            initialDisplayedMonthMillis = initialDisplayedMonthMillis,
            yearRange = yearRange,
            initialDisplayedHour = initialHour,
            initialDisplayedMinute = initialMinute,
            is24Hour = is24Hour
        )
    )

    /**
     * A timestamp that represents the _start_ of the day of the selected date in _UTC_ milliseconds
     * from the epoch including [selectedHour] and [selectedMinute]
     *
     * @see [setSelection]
     */
    val selectedDateTimeMillis: Long
        @Suppress("AutoBoxing") get() = stateData.selectedStartDate.utcTimeMillis +
            ((60 * selectedHour) + selectedMinute) * 60_000

    val selectedMinute : Int
        get() = stateData.selectedMinute

    val selectedHour : Int
        get() = stateData.selectedHour
    /**
     * Sets the selected date.
     *
     * @param dateMillis timestamp in _UTC_ milliseconds from the epoch that represents the date
     * selection, or `null` to indicate no selection.
     *
     * @throws IllegalArgumentException in case the given timestamps do not fall within the year
     * range this state was created with.
     */
    internal fun setSelection(@Suppress("AutoBoxing") dateMillis: Long) {
        stateData.setSelection(startDateMillis = dateMillis, endDateMillis = null)
    }

    companion object {
        /**
         * The default [Saver] implementation for [CupertinoDateTimePickerState].
         */
        fun Saver(): Saver<CupertinoDateTimePickerState, *> = Saver(
            save = { with(DateTimePickerStateData.Saver()) { save(it.stateData) } },
            restore = { value -> CupertinoDateTimePickerState(with(DateTimePickerStateData.Saver()) { restore(value)!! }) }
        )
    }
}


@Stable
object CupertinoDateTimePickerDefault {

    internal val today = CalendarModelImpl().today

    val YearRangeSmall: IntRange = IntRange(today.year-1, today.year + 1)

    val YearRangeLarge: IntRange = IntRange((today.year-30)/10*10, (today.year+30)/10*10)


//    /** The default tonal elevation used for [DatePickerDialog]. */
//    val TonalElevation: Dp = DatePickerModalTokens.ContainerElevation
//
//    /** The default shape for date picker dialogs. */
//    val shape: Shape @Composable get() = DatePickerModalTokens.ContainerShape.toShape()

    /**
     * A date format skeleton used to format the date picker's year selection menu button (e.g.
     * "March 2021")
     */
    const val YearMonthSkeleton: String = "yMMMM"

    /**
     * A date format skeleton used to format a selected date (e.g. "Mar 27, 2021")
     */
    const val YearAbbrMonthDaySkeleton: String = "yMMMd"

    /**
     * A date format skeleton used to format a selected date to be used as content description for
     * screen readers (e.g. "Saturday, March 27, 2021")
     */
    const val YearMonthWeekdayDaySkeleton: String = "yMMMMEEEEd"

    /**
     * A date format skeleton used to format a selected date to be used as content description for
     * screen readers (e.g. "Sat Mar 27")
     */
    const val MonthWeekdayDaySkeleton: String = "MMMEEd"
}
