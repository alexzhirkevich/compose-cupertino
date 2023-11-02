package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import io.github.alexzhirkevich.PlatformDateFormat
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.defaultLocale
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
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
fun rememberCupertinoDateTimePickerState(
    initialSelectedDateMillis: Long = DatePickerDefaults.today.utcTimeMillis,
    initialDisplayedMonthMillis: Long = initialSelectedDateMillis,
    initialHour: Int = 0,
    initialMinute: Int = 0,
    is24Hour: Boolean = PlatformDateFormat.is24HourFormat(defaultLocale()),
    yearRange: IntRange = DatePickerDefaults.YearRange,
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
fun CupertinoDateTimePicker(
    state: CupertinoDateTimePickerState,
    mode: DisplayMode = DisplayMode.Wheel,
    height : Dp = CupertinoPickerDefaults.Height,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {
    when(mode){
        DisplayMode.Wheel -> CupertinoDateTimePickerWheel(
            state = state,
            height = height,
            containerColor = containerColor,
            modifier = modifier
        )

        DisplayMode.DatePicker -> TODO()
        DisplayMode.DateTimePicker -> TODO()
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

private const val MillisInDay = 3600 * 24 * 1000

/**
 * Date and time picker
 * */
@Composable
fun CupertinoDateTimePickerWheel(
    state: CupertinoDateTimePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .height(height),
        horizontalArrangement = Arrangement.Center,
    ) {

        state.stateData.calendarModel.today

        val locale = defaultLocale()
        CupertinoPicker(
            state = state.stateData.dateState,
            height = height,
            modifier = Modifier.weight(1.5f),
            containerColor = containerColor,
            withRotation = true,
            rotationTransformOrigin = TransformOrigin(.5f, .5f),
            items = state.stateData.days,
        ) {
            PickerText(
                text = if (it.utcTimeMillis == DatePickerDefaults.today.utcTimeMillis)
                    "Today" else it.format(
                    calendarModel = state.stateData.calendarModel,
                    skeleton = DatePickerDefaults.MonthWeekdayDaySkeleton,
                    locale = locale
                ),
                textAlign = TextAlign.End,
            )
        }

        CupertinoPicker(
            state = state.stateData.hourState,
            height = height,
            modifier = Modifier.width(CupertinoTimePickerTokens.BlockWidth / 2),
            containerColor = containerColor,
            withRotation = true,
            items = if (state.stateData.is24Hour) Hours24 else Hours12,
        ) {
            PickerText(
                text = it,
                textAlign = TextAlign.End,
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
 * @param initialDisplayMode an initial [DisplayMode] that this state will hold
 * @see rememberCupertinoDateTimePickerState
 */
@Stable
internal class StateData constructor(
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
        get() = days[dateState.selectedItemIndex]
    /**
     * A mutable state of [CalendarDate] that represents the end date for a selection.
     *
     * Single date selection states that use this [StateData] should always have this as `null`.
     */
    var selectedEndDate = mutableStateOf<CalendarDate?>(null)

    val selectedMinute : Int
        get() = minuteState.selectedItemIndex

    val selectedHour : Int by derivedStateOf {
        if (!is24Hour && isEvening)
            12 + hourState.selectedItemIndex else hourState.selectedItemIndex
    }

    internal val isEvening get() =
        amPmState.selectedItemIndex == 1

    internal val dateState by lazy {
        CupertinoPickerState(
            days.binarySearch { it.utcTimeMillis.compareTo(initialDisplayedMonthMillis) }
        )
    }

    internal val hourState = CupertinoPickerState(
        initiallySelectedItemIndex = if (is24Hour)
            initialDisplayedHour else initialDisplayedHour % 12
    )

    internal val minuteState = CupertinoPickerState(
        initiallySelectedItemIndex = initialDisplayedMinute
    )

    internal val amPmState = CupertinoPickerState()

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

        val start = LocalDate(range.first, 1, 1)
            .atStartOfDayIn(TimeZone.UTC).toEpochMilliseconds()
        val end = LocalDate(range.endInclusive, 12, 31)
            .atStartOfDayIn(TimeZone.UTC).toEpochMilliseconds()

        buildList<Long>(365 * range.last - range.first) {
            var current = start
            while (current < end) {
                add(current)
                current += MillisInDay
            }
        }.map {
            calendarModel.getCanonicalDate(it)
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
        fun Saver(): Saver<StateData, Any> = listSaver(
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
                StateData(
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
 * The state's [selectedDateMillis] will provide a timestamp that represents the _start_ of the day.
 */
@Stable
class CupertinoDateTimePickerState private constructor(internal val stateData: StateData) {

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
        initialHour: Int,
        initialMinute: Int,
        is24Hour: Boolean,
    ) : this(
        StateData(
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
     * from the epoch. If minute and hour are provided, this value will be shifted by hour
     *
     * In case no date was selected or provided, the state will hold a `null` value.
     *
     * @see [setSelection]
     */
    val selectedDateMillis: Long?
        @Suppress("AutoBoxing") get() = stateData.selectedStartDate.utcTimeMillis

    /**
     * The same as [selectedDateMillis] by shifted by (60*[selectedHour] + [selectedMinute]) * 1000 ms -
     * represents actual selected UTC timestamp
     * @see [setSelection]
     */
    val selectedDateTimeMillis: Long?
        @Suppress("AutoBoxing") get() = selectedDateTimeMillis
            ?.plus(((60 * selectedHour) + selectedMinute) * 1000)

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
    fun setSelection(@Suppress("AutoBoxing") dateMillis: Long) {
        stateData.setSelection(startDateMillis = dateMillis, endDateMillis = null)
    }

    companion object {
        /**
         * The default [Saver] implementation for [CupertinoDateTimePickerState].
         */
        fun Saver(): Saver<CupertinoDateTimePickerState, *> = Saver(
            save = { with(StateData.Saver()) { save(it.stateData) } },
            restore = { value -> CupertinoDateTimePickerState(with(StateData.Saver()) { restore(value)!! }) }
        )
    }
}


@Stable
object DatePickerDefaults {

//    /**
//     * Creates a [DatePickerColors] that will potentially animate between the provided colors
//     * according to the Material specification.
//     *
//     * @param containerColor the color used for the date picker's background
//     * @param titleContentColor the color used for the date picker's title
//     * @param headlineContentColor the color used for the date picker's headline
//     * @param weekdayContentColor the color used for the weekday letters
//     * @param subheadContentColor the color used for the month and year subhead labels that appear
//     * when the date picker is scrolling calendar months vertically
//     * @param yearContentColor the color used for the year item when selecting a year
//     * @param currentYearContentColor the color used for the current year content when selecting a
//     * year
//     * @param selectedYearContentColor the color used for the selected year content when selecting a
//     * year
//     * @param selectedYearContainerColor the color used for the selected year container when
//     * selecting a year
//     * @param dayContentColor the color used for days content
//     * @param disabledDayContentColor the color used for disabled days content
//     * @param selectedDayContentColor the color used for selected days content
//     * @param disabledSelectedDayContentColor the color used for disabled selected days content
//     * @param selectedDayContainerColor the color used for a selected day container
//     * @param disabledSelectedDayContainerColor the color used for a disabled selected day container
//     * @param todayContentColor the color used for the day that marks the current date
//     * @param todayDateBorderColor the color used for the border of the day that marks the current
//     * date
//     * @param dayInSelectionRangeContentColor the content color used for days that are within a date
//     * range selection
//     * @param dayInSelectionRangeContainerColor the container color used for days that are within a
//     * date range selection
//     */
//    @Composable
//    fun colors(
//        containerColor: Color = DatePickerModalTokens.ContainerColor.toColor(),
//        titleContentColor: Color = DatePickerModalTokens.HeaderSupportingTextColor.toColor(),
//        headlineContentColor: Color = DatePickerModalTokens.HeaderHeadlineColor.toColor(),
//        weekdayContentColor: Color = DatePickerModalTokens.WeekdaysLabelTextColor.toColor(),
//        subheadContentColor: Color =
//            DatePickerModalTokens.RangeSelectionMonthSubheadColor.toColor(),
//        yearContentColor: Color =
//            DatePickerModalTokens.SelectionYearUnselectedLabelTextColor.toColor(),
//        currentYearContentColor: Color = DatePickerModalTokens.DateTodayLabelTextColor.toColor(),
//        selectedYearContentColor: Color =
//            DatePickerModalTokens.SelectionYearSelectedLabelTextColor.toColor(),
//        selectedYearContainerColor: Color =
//            DatePickerModalTokens.SelectionYearSelectedContainerColor.toColor(),
//        dayContentColor: Color = DatePickerModalTokens.DateUnselectedLabelTextColor.toColor(),
//         TODO: Missing token values for the disabled colors.
//        disabledDayContentColor: Color = dayContentColor.copy(alpha = 0.38f),
//        selectedDayContentColor: Color = DatePickerModalTokens.DateSelectedLabelTextColor.toColor(),
//         TODO: Missing token values for the disabled colors.
//        disabledSelectedDayContentColor: Color = selectedDayContentColor.copy(alpha = 0.38f),
//        selectedDayContainerColor: Color =
//            DatePickerModalTokens.DateSelectedContainerColor.toColor(),
//         TODO: Missing token values for the disabled colors.
//        disabledSelectedDayContainerColor: Color = selectedDayContainerColor.copy(alpha = 0.38f),
//        todayContentColor: Color = DatePickerModalTokens.DateTodayLabelTextColor.toColor(),
//        todayDateBorderColor: Color =
//            DatePickerModalTokens.DateTodayContainerOutlineColor.toColor(),
//        dayInSelectionRangeContentColor: Color =
//            DatePickerModalTokens.SelectionDateInRangeLabelTextColor.toColor(),
//        dayInSelectionRangeContainerColor: Color =
//            DatePickerModalTokens.RangeSelectionActiveIndicatorContainerColor.toColor()
//    ): DatePickerColors =
//        DatePickerColors(
//            containerColor = containerColor,
//            titleContentColor = titleContentColor,
//            headlineContentColor = headlineContentColor,
//            weekdayContentColor = weekdayContentColor,
//            subheadContentColor = subheadContentColor,
//            yearContentColor = yearContentColor,
//            currentYearContentColor = currentYearContentColor,
//            selectedYearContentColor = selectedYearContentColor,
//            selectedYearContainerColor = selectedYearContainerColor,
//            dayContentColor = dayContentColor,
//            disabledDayContentColor = disabledDayContentColor,
//            selectedDayContentColor = selectedDayContentColor,
//            disabledSelectedDayContentColor = disabledSelectedDayContentColor,
//            selectedDayContainerColor = selectedDayContainerColor,
//            disabledSelectedDayContainerColor = disabledSelectedDayContainerColor,
//            todayContentColor = todayContentColor,
//            todayDateBorderColor = todayDateBorderColor,
//            dayInSelectionRangeContentColor = dayInSelectionRangeContentColor,
//            dayInSelectionRangeContainerColor = dayInSelectionRangeContainerColor
//        )
//
//    /**
//     * A default date picker title composable.
//     *
//     * @param state a [DatePickerState] that will help determine the title's content
//     * @param modifier a [Modifier] to be applied for the title
//     */
//    @Composable
//    fun DatePickerTitle(state: DatePickerState, modifier: Modifier = Modifier) {
//        when (state.displayMode) {
//            DisplayMode.Picker -> Text(
//                text = getString(string = Strings.DatePickerTitle),
//                modifier = modifier
//            )
//
//            DisplayMode.Input -> Text(
//                text = getString(string = Strings.DateInputTitle),
//                modifier = modifier
//            )
//        }
//    }
//
//    /**
//     * A default date picker headline composable that displays a default headline text when there is
//     * no date selection, and an actual date string when there is.
//     *
//     * @param state a [DatePickerState] that will help determine the title's headline
//     * @param dateFormatter a [DatePickerFormatter]
//     * @param modifier a [Modifier] to be applied for the headline
//     */
//    @Composable
//    fun DatePickerHeadline(
//        state: DatePickerState,
//        dateFormatter: DatePickerFormatter,
//        modifier: Modifier = Modifier
//    ) {
//        with(state.stateData) {
//            val defaultLocale = defaultLocale()
//            val formattedDate = dateFormatter.formatDate(
//                date = selectedStartDate.value,
//                calendarModel = calendarModel,
//                locale = defaultLocale
//            )
//            val verboseDateDescription = dateFormatter.formatDate(
//                date = selectedStartDate.value,
//                calendarModel = calendarModel,
//                locale = defaultLocale,
//                forContentDescription = true
//            ) ?: when (displayMode.value) {
//                DisplayMode.Picker -> getString(Strings.DatePickerNoSelectionDescription)
//                DisplayMode.Input -> getString(Strings.DateInputNoInputDescription)
//                else -> ""
//            }
//
//            val headlineText = formattedDate ?: when (displayMode.value) {
//                DisplayMode.Picker -> getString(Strings.DatePickerHeadline)
//                DisplayMode.Input -> getString(Strings.DateInputHeadline)
//                else -> ""
//            }
//
//            val headlineDescription = when (displayMode.value) {
//                DisplayMode.Picker -> getString(Strings.DatePickerHeadlineDescription).format(verboseDateDescription)
//                DisplayMode.Input -> getString(Strings.DateInputHeadlineDescription).format(verboseDateDescription)
//                else -> ""
//            }
//
//            Text(
//                text = headlineText,
//                modifier = modifier.semantics {
//                    liveRegion = androidx.compose.ui.semantics.LiveRegionMode.Polite
//                    contentDescription = headlineDescription
//                },
//                maxLines = 1
//            )
//        }
//    }
//
//    /**
//     * Creates and remembers a [FlingBehavior] that will represent natural fling curve with snap to
//     * the most visible month in the months list.
//     *
//     * @param lazyListState a [LazyListState]
//     * @param decayAnimationSpec the decay to use
//     */
//    @Composable
//    internal fun rememberSnapFlingBehavior(
//        lazyListState: LazyListState,
//        decayAnimationSpec: DecayAnimationSpec<Float> = exponentialDecay()
//    ): FlingBehavior {
//        val density = LocalDensity.current
//        return remember(density) {
//            SnapFlingBehavior(
//                lazyListState = lazyListState,
//                decayAnimationSpec = decayAnimationSpec,
//                snapAnimationSpec = spring(stiffness = Spring.StiffnessMediumLow),
//                density = density
//            )
//        }
//    }

    internal val today = CalendarModelImpl().today

    /** The range of years for the date picker dialogs. */
    val YearRange: IntRange = IntRange(today.year-5, today.year + 5)

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
