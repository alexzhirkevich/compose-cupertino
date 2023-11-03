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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.CalendarDate
import io.github.alexzhirkevich.CalendarModel
import io.github.alexzhirkevich.CalendarModelImpl
import io.github.alexzhirkevich.CalendarMonth
import io.github.alexzhirkevich.MillisecondsIn24Hours
import io.github.alexzhirkevich.PlatformDateFormat
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.currentLocale
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.atStartOfDayIn


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
fun rememberCupertinoDatePickerState(
    initialSelectedDateMillis: Long = DatePickerDefaults.today.utcTimeMillis,
    initialDisplayedMonthMillis: Long = initialSelectedDateMillis,
    yearRange: IntRange = DatePickerDefaults.YearRangeLarge,
): CupertinoDatePickerState = rememberSaveable(
    saver = CupertinoDatePickerState.Saver()
) {
    CupertinoDatePickerState(
        initialSelectedDateMillis = initialSelectedDateMillis,
        initialDisplayedMonthMillis = initialDisplayedMonthMillis,
        yearRange = yearRange
    )
}


/**
 * Date and time picker
 * */
@Composable
fun CupertinoDatePicker(
    state: CupertinoDatePickerState,
    mode: DatePickerDisplayMode = DatePickerDisplayMode.Wheel,
    height : Dp = CupertinoPickerDefaults.Height,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {
    when(mode){
        DatePickerDisplayMode.Wheel -> CupertinoDatePickerWheel(
            state = state,
            height = height,
            containerColor = containerColor,
            modifier = modifier
        )

        DatePickerDisplayMode.Pager -> TODO()
    }
}

enum class DisplayMode {
    /** Paging date picker */
    DatePicker,

    /** Paging date and time picker */
    DateTimePicker,

    /** Wheel date and time picker */
    Wheel
}


@Composable
private fun CupertinoDatePickerWheel(
    state: CupertinoDatePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .requiredHeight(height),
        horizontalArrangement = Arrangement.Center,
    ) {

        CupertinoPicker(
            state = state.stateData.monthState,
            height = height,
            modifier = Modifier.weight(1f),
            containerColor = containerColor,
            withRotation = true,
            rotationTransformOrigin = TransformOrigin(.5f, .5f),
            items = state.stateData.monthNames,
        ) {
            PickerText(
                text = it,
                textAlign = TextAlign.End,
            )
        }

        CupertinoPicker(
            state = state.stateData.dayState,
            height = height,
            modifier = Modifier.width(CupertinoTimePickerTokens.BlockWidth),
            containerColor = containerColor,
            withRotation = true,
            items = (1..state.stateData.daysInMonth).toList()
        ) {
            PickerText(
                text = it.toString(),
                textAlign = TextAlign.Center,
            )
        }
        CupertinoPicker(
            state = state.stateData.yearState,
            height = height,
            modifier = Modifier.weight(1f),
            containerColor = containerColor,
            items = state.stateData.yearRange.toList(),
            withRotation = true,
            rotationTransformOrigin = TransformOrigin(0f, .5f)
        ) {
            PickerText(
                text = it.toString(),
                textAlign = TextAlign.Start,
            )
        }
    }
}

@Composable
internal fun DatePicker() {

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
@Stable
internal open class DatePickerStateData constructor(
    initialSelectedStartDateMillis: Long,
    initialSelectedEndDateMillis: Long?,
    initialDisplayedMonthMillis: Long,
    val yearRange: IntRange
) {

    val calendarModel: CalendarModel = CalendarModelImpl()

    /**
     * A state of [CalendarDate] that represents the start date for a selection.
     */
    val selectedDateFromWheel : CalendarDate by derivedStateOf {

        val months = calendarModel.getMonth(
            year = yearState.selectedItemIndex + yearRange.first,
            month = monthState.selectedItemIndex + 1
        )

        val day = (dayState.selectedItemIndex + 1).coerceIn(1, daysInMonth.takeIf { it > 0 } ?: 29)

        calendarModel.getDate(
            year = months.year,
            month = months.month,
            day = day,
        ).copy(utcTimeMillis = months.startUtcTimeMillis + (day - 1) * MillisecondsIn24Hours)
    }
    /**
     * A mutable state of [CalendarDate] that represents the end date for a selection.
     *
     * Single date selection states that use this [StateData] should always have this as `null`.
     */
    var selectedEndDate = mutableStateOf<CalendarDate?>(null)


    internal val daysInMonth by derivedStateOf {
        calendarModel.getMonth(
            year = yearState.selectedItemIndex + yearRange.first,
            month = monthState.selectedItemIndex + 1
        ).numberOfDays
    }
    internal val monthState by lazy {
        CupertinoPickerState(
            initiallySelectedItemIndex = calendarModel
                .getCanonicalDate(initialSelectedStartDateMillis).month - 1
        )
    }

    internal val dayState by lazy {
        CupertinoPickerState(
            initiallySelectedItemIndex = calendarModel
                .getCanonicalDate(initialSelectedStartDateMillis).dayOfMonth - 1
        )
    }

    internal val yearState by lazy {
        CupertinoPickerState(
            initiallySelectedItemIndex = calendarModel
                .getCanonicalDate(initialSelectedStartDateMillis).year - yearRange.first
        )
    }


    internal val monthNames by lazy {
        PlatformDateFormat.monthsNames(currentLocale())
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

        val start = LocalDate(range.first, 1, 1)
            .atStartOfDayIn(TimeZone.UTC).toEpochMilliseconds()
        val end = LocalDate(range.endInclusive, 12, 31)
            .atStartOfDayIn(TimeZone.UTC).toEpochMilliseconds()

        buildList<Long>(365 * (range.last - range.first)) {
            var current = start
            while (current < end) {
                add(current)
                current += MillisecondsIn24Hours
            }
        }.map {
            calendarModel.getCanonicalDate(it)
        }
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
    fun setSelection(startDateMillis: Long, endDateMillis: Long?) {
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
         * A [Saver] implementation for [StateData].
         */
        fun Saver(): Saver<DatePickerStateData, Any> = listSaver(
            save = {
                listOf(
                    it.selectedDateFromWheel.utcTimeMillis,
                    it.selectedEndDate.value?.utcTimeMillis,
                    it.displayedMonth.startUtcTimeMillis,
                    it.yearRange.first,
                    it.yearRange.last
                )
            },
            restore = { value ->
                DatePickerStateData(
                    initialSelectedStartDateMillis = value[0] as Long,
                    initialSelectedEndDateMillis = value[1] as Long?,
                    initialDisplayedMonthMillis = value[2] as Long,
                    yearRange = IntRange(value[3] as Int, value[4] as Int),
                )
            }
        )
    }
}


/**
 * A state object that can be hoisted to observe the date picker state. See
 * [rememberCupertinoDateTimePickerState].
 *
 * The state's [selectedDateMillis] will provide a timestamp that represents the _start_ of the day.
 */
@Stable
class CupertinoDatePickerState private constructor(internal val stateData: DatePickerStateData) {

    /**
     * Constructs a DatePickerState.
     *
     * @param initialSelectedDateMillis timestamp in _UTC_ milliseconds from the epoch that
     * represents an initial selection of a date. Provide a `null` to indicate no selection. Note
     * that the state's
     * [selectedDateMillis] will provide a timestamp that represents the _start_ of the day, which
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
    ) : this(
        DatePickerStateData(
            initialSelectedStartDateMillis = initialSelectedDateMillis,
            initialSelectedEndDateMillis = null,
            initialDisplayedMonthMillis = initialDisplayedMonthMillis,
            yearRange = yearRange,
        )
    )

    /**
     * A timestamp that represents the _start_ of the day of the selected date in _UTC_ milliseconds
     * from the epoch. If minute and hour are provided, this value will be shifted by hour
     *
     * In case no date was selected or provided, the state will hold a `null` value.
     *
     * @see [setSelection]
     */
    val selectedDateMillis: Long
        @Suppress("AutoBoxing") get() = stateData.selectedDateFromWheel.utcTimeMillis


    /**
     * Sets the selected date.
     *
     * @param dateMillis timestamp in _UTC_ milliseconds from the epoch that represents the date
     * selection, or `null` to indicate no selection.
     *
     * @throws IllegalArgumentException in case the given timestamps do not fall within the year
     * range this state was created with.
     */
    fun setSelection(@Suppress("AutoBoxing") dateMillis: Long) {
        stateData.setSelection(startDateMillis = dateMillis, endDateMillis = null)
    }

    companion object {
        /**
         * The default [Saver] implementation for [CupertinoDateTimePickerState].
         */
        fun Saver(): Saver<CupertinoDatePickerState, *> = Saver(
            save = { with(DatePickerStateData.Saver()) { save(it.stateData) } },
            restore = { value -> CupertinoDatePickerState(with(DatePickerStateData.Saver()) { restore(value)!! }) }
        )
    }
}

