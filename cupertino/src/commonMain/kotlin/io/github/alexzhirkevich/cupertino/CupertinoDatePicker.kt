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
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.CalendarDate
import io.github.alexzhirkevich.CalendarModel
import io.github.alexzhirkevich.CalendarModelImpl
import io.github.alexzhirkevich.CalendarMonth
import io.github.alexzhirkevich.MillisecondsIn24Hours
import io.github.alexzhirkevich.PlatformDateFormat
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.currentLocale


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
fun rememberCupertinoDatePickerState(
    initialSelectedDateMillis: Long = CupertinoDateTimePickerDefault.today.utcTimeMillis,
    initialDisplayedMonthMillis: Long = initialSelectedDateMillis,
    yearRange: IntRange = CupertinoDateTimePickerDefault.YearRangeLarge,
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
@ExperimentalCupertinoApi
fun CupertinoDatePicker(
    state: CupertinoDatePickerState,
    mode: DatePickerDisplayMode = DatePickerDisplayMode.Wheel(),
    containerColor : Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
    modifier: Modifier = Modifier
) {
    when(mode){
        is DatePickerDisplayMode.Wheel -> CupertinoDatePickerWheel(
            state = state,
            height = mode.height,
            indicator = mode.indicator ?: CupertinoPickerDefaults.indicator(),
            containerColor = containerColor,
            modifier = modifier
        )

//        DatePickerDisplayMode.Pager -> TODO()
    }
}

@Composable
@ExperimentalCupertinoApi
private fun CupertinoDatePickerWheel(
    state: CupertinoDatePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .requiredHeight(height)
            .cupertinoPickerIndicator(
                state = state.stateData.monthState,
                indicator = indicator
            ),
        horizontalArrangement = Arrangement.Center,
    ) {

        CupertinoPicker(
            state = state.stateData.monthState,
            items = state.stateData.monthNames,
            height = height,
            modifier = Modifier.weight(1f),
            indicator = {},
            containerColor = containerColor,
            withRotation = true,
            rotationTransformOrigin = TransformOrigin(.5f, .5f)
        ) {
            PickerText(
                text = it,
                textAlign = TextAlign.End,
            )
        }

        CupertinoPicker(
            state = state.stateData.dayState,
            items = (1..state.stateData.daysInMonth).toList(),
            height = height,
            modifier = Modifier.width(CupertinoTimePickerTokens.BlockWidth),
            indicator = {},
            containerColor = containerColor,
            withRotation = true
        ) {
            PickerText(
                text = it.toString(),
                textAlign = TextAlign.Center,
            )
        }
        CupertinoPicker(
            state = state.stateData.yearState,
            items = state.stateData.yearRange.toList(),
            height = height,
            modifier = Modifier.weight(1f),
            indicator = {},
            containerColor = containerColor,
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

//@OptIn(ExperimentalCupertinoApi::class)
//@Composable
//private fun PagerDatePicker(
//    state: CupertinoDatePickerState,
//    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
//    modifier: Modifier = Modifier
//) {
//    val calendarModel = state.stateData.calendarModel
//
//    var inMonthSelectionMode by rememberSaveable {
//        mutableStateOf(false)
//    }
//
//    val monthsListState = rememberLazyListState(
//        initialFirstVisibleItemIndex = state.stateData.displayedMonthIndex
//    )
//
//    val coroutineScope = rememberCoroutineScope()
//
//    Column(
//        modifier
//            .background(containerColor)
//    ) {
//        PagerDatePickerControls(
//            state = state,
//            inMonthSelectionMode = inMonthSelectionMode,
//            onMonthSelectionClicked = {
//                inMonthSelectionMode = !inMonthSelectionMode
//            },
//            onPrevMonthClicked = {
//                coroutineScope.launch {
//                    monthsListState.animateScrollToItem(
//                        monthsListState.firstVisibleItemIndex - 1
//                    )
//                }
//            },
//            onNextMonthClicked = {
//                coroutineScope.launch {
//                    monthsListState.animateScrollToItem(
//                        monthsListState.firstVisibleItemIndex + 1
//                    )
//                }
//            }
//        )
//    }
//}
//
//@OptIn(ExperimentalCupertinoApi::class)
//@Composable
//private fun PagerDatePickerControls(
//    state: CupertinoDatePickerState,
//    inMonthSelectionMode : Boolean,
//    onMonthSelectionClicked : () -> Unit,
//    onPrevMonthClicked : () -> Unit,
//    onNextMonthClicked : () -> Unit,
//) {
//
//    val calendarModel = state.stateData.calendarModel
//    val locale = defaultLocale()
//
//    Row(
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        val month by derivedStateOf {
//            state.stateData.currentMonth.format(
//                calendarModel = calendarModel,
//                skeleton = CupertinoDateTimePickerDefault.YearMonthSkeleton,
//                locale = locale
//            )
//        }
//
//        CupertinoText(
//            text = month,
//            style = CupertinoTheme.typography.headline,
//            modifier = Modifier.pointerInput(0){
//                detectTapGestures {
//                    onMonthSelectionClicked()
//                }
//            }
//        )
//
//        CupertinoIcon(
//            modifier = Modifier.size(SmallChevronSize),
//            imageVector = SFSymbols.Default.ChevronRight,
//            contentDescription = null,
//            tint = CupertinoTheme.colorScheme.accent
//        )
//
//        Spacer(Modifier.weight(1f))
//
//        AnimatedVisibility(
//            visible = !inMonthSelectionMode
//        ){
//            Row {
//                CupertinoIconButton(
//                    onClick = onPrevMonthClicked
//                ){
//                    CupertinoIcon(
//                        modifier = Modifier
//                            .rotate(180f)
//                            .size(LargeChevronSize),
//                        imageVector = SFSymbols.Default.ChevronRight,
//                        contentDescription = "Next Month",
//                    )
//                }
//                CupertinoIconButton(
//                    onClick = onNextMonthClicked
//                ){
//                    CupertinoIcon(
//                        modifier = Modifier.size(LargeChevronSize),
//                        imageVector = SFSymbols.Default.ChevronRight,
//                        contentDescription = "Next Month",
//                    )
//                }
//            }
//        }
//    }
//}


//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//private fun HorizontalMonthsList(
//    onDateSelected: (dateInMillis: Long) -> Unit,
//    stateData: DatePickerStateData,
//    lazyListState: LazyListState,
//    dateValidator: (Long) -> Boolean,
//) {
//    val today = stateData.calendarModel.today
//    val firstMonth = remember(stateData.yearRange) {
//        stateData.calendarModel.getMonth(
//            year = stateData.yearRange.first,
//            month = 1 // January
//        )
//    }
//    LazyRow(
//        // Apply this to prevent the screen reader from scrolling to the next or previous month, and
//        // instead, traverse outside the Month composable when swiping from a focused first or last
//        // day of the month.
//        modifier = Modifier.semantics {
//            horizontalScrollAxisRange = ScrollAxisRange(value = { 0f }, maxValue = { 0f })
//        },
//        state = lazyListState,
//        // TODO(b/264687693): replace with the framework's rememberSnapFlingBehavior(lazyListState)
//        //  when promoted to stable
//        flingBehavior = rememberSnapFlingBehavior(lazyListState)
//    ) {
//        items(stateData.totalMonthsInRange) {
//            val month =
//                stateData.calendarModel.plusMonths(
//                    from = firstMonth,
//                    addedMonthsCount = it
//                )
//            Box(
//                modifier = Modifier.fillParentMaxWidth()
//            ) {
//                Month(
//                    month = month,
//                    onDateSelected = onDateSelected,
//                    today = today,
//                    stateData = stateData,
//                    rangeSelectionEnabled = false,
//                    dateValidator = dateValidator,
//                )
//            }
//        }
//    }
//
//    LaunchedEffect(lazyListState) {
//        updateDisplayedMonth(lazyListState, stateData)
//    }
//}
//
//internal suspend fun updateDisplayedMonth(
//    lazyListState: LazyListState,
//    stateData: DatePickerStateData
//) {
//    snapshotFlow { lazyListState.firstVisibleItemIndex }.collect {
//        val yearOffset = lazyListState.firstVisibleItemIndex / 12
//        val month = lazyListState.firstVisibleItemIndex % 12 + 1
//        with(stateData) {
//            if (displayedMonth.month != month ||
//                displayedMonth.year != yearRange.first + yearOffset
//            ) {
//                displayedMonth = calendarModel.getMonth(
//                    year = yearRange.first + yearOffset,
//                    month = month
//                )
//            }
//        }
//    }
//}
//
///**
// * A composable that renders a calendar month and displays a date selection.
// */
//@Composable
//internal fun Month(
//    month: CalendarMonth,
//    onDateSelected: (dateInMillis: Long) -> Unit,
//    today: CalendarDate,
//    stateData: DatePickerStateData,
//    rangeSelectionEnabled: Boolean,
//    dateValidator: (Long) -> Boolean,
//) {
//    val rangeSelectionInfo: State<SelectedRangeInfo?> = remember(rangeSelectionEnabled) {
//        derivedStateOf {
//            if (rangeSelectionEnabled) {
//                SelectedRangeInfo.calculateRangeInfo(
//                    month,
//                    stateData.selectedStartDate.value,
//                    stateData.selectedEndDate.value
//                )
//            } else {
//                null
//            }
//        }
//    }
//
//    val rangeSelectionDrawModifier = if (rangeSelectionEnabled) {
//        Modifier.drawWithContent {
//            rangeSelectionInfo.value?.let {
//                drawRangeBackground(it, colors.dayInSelectionRangeContainerColor)
//            }
//            drawContent()
//        }
//    } else {
//        Modifier
//    }
//
//    val defaultLocale = defaultLocale()
//    val startSelection = stateData.selectedStartDate
//    val endSelection = stateData.selectedEndDate
//    ProvideTextStyle(
//        MaterialTheme.typography.fromToken(DatePickerModalTokens.DateLabelTextFont)
//    ) {
//        var cellIndex = 0
//        Column(
//            modifier = Modifier
//                .requiredHeight(RecommendedSizeForAccessibility * MaxCalendarRows)
//                .then(rangeSelectionDrawModifier),
//            verticalArrangement = Arrangement.SpaceEvenly
//        ) {
//            repeat(MaxCalendarRows) {
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceEvenly,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    repeat(DaysInWeek) {
//                        if (cellIndex < month.daysFromStartOfWeekToFirstOfMonth ||
//                            cellIndex >=
//                            (month.daysFromStartOfWeekToFirstOfMonth + month.numberOfDays)
//                        ) {
//                            // Empty cell
//                            Spacer(
//                                modifier = Modifier.requiredSize(
//                                    width = RecommendedSizeForAccessibility,
//                                    height = RecommendedSizeForAccessibility
//                                )
//                            )
//                        } else {
//                            val dayNumber = cellIndex - month.daysFromStartOfWeekToFirstOfMonth
//                            val dateInMillis = month.startUtcTimeMillis +
//                                    (dayNumber * MillisecondsIn24Hours)
//                            val isToday = dateInMillis == today.utcTimeMillis
//                            val startDateSelected =
//                                dateInMillis == startSelection.value?.utcTimeMillis
//                            val endDateSelected = dateInMillis == endSelection.value?.utcTimeMillis
//                            val inRange = remember(rangeSelectionEnabled, dateInMillis) {
//                                derivedStateOf {
//                                    with(stateData) {
//                                        rangeSelectionEnabled &&
//                                                dateInMillis >= (selectedStartDate.value?.utcTimeMillis
//                                            ?: kotlin.Long.MAX_VALUE) &&
//                                                dateInMillis <= (selectedEndDate.value?.utcTimeMillis
//                                            ?: kotlin.Long.MIN_VALUE)
//                                    }
//                                }
//                            }
//                            val dayContentDescription = dayContentDescription(
//                                rangeSelectionEnabled = rangeSelectionEnabled,
//                                isToday = isToday,
//                                isStartDate = startDateSelected,
//                                isEndDate = endDateSelected,
//                                isInRange = inRange.value
//                            )
//                            val formattedDateDescription = formatWithSkeleton(
//                                dateInMillis,
//                                dateFormatter.selectedDateDescriptionSkeleton,
//                                defaultLocale
//                            )
//                            Day(
//                                modifier = Modifier,
//                                selected = startDateSelected || endDateSelected,
//                                onClick = { onDateSelected(dateInMillis) },
//                                // Only animate on the first selected day. This is important to
//                                // disable when drawing a range marker behind the days on an
//                                // end-date selection.
//                                animateChecked = startDateSelected,
//                                enabled = remember(dateInMillis) {
//                                    dateValidator.invoke(dateInMillis)
//                                },
//                                today = isToday,
//                                inRange = inRange.value,
//                                description = if (dayContentDescription != null) {
//                                    "$dayContentDescription, $formattedDateDescription"
//                                } else {
//                                    formattedDateDescription
//                                },
//                                colors = colors
//                            ) {
//                                CupertinoText(
//                                    text = (dayNumber + 1).toString(),
//                                    // The semantics are set at the Day level.
//                                    modifier = Modifier.clearAndSetSemantics { },
//                                    textAlign = TextAlign.Center
//                                )
//                            }
//                        }
//                        cellIndex++
//                    }
//                }
//            }
//        }
//    }
//}


private val SmallChevronSize = 16.dp
private val LargeChevronSize = 24.dp

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
            month = selectedMonthIndex + 1
        )

        val day = (selectedDayIndex + 1).coerceIn(1, daysInMonth.takeIf { it > 0 } ?: 29)

        calendarModel.getDate(
            year = months.year,
            month = months.month,
            day = day,
        ).copy(utcTimeMillis = months.startUtcTimeMillis + (day - 1) * MillisecondsIn24Hours)
    }
    /**
     * A mutable state of [CalendarDate] that represents the end date for a selection.
     *
     * Single date selection states that use this [DateTimePickerStateData] should always have this as `null`.
     */
    var selectedEndDate = mutableStateOf<CalendarDate?>(null)


    internal val daysInMonth by derivedStateOf {
        calendarModel.getMonth(
            year = yearState.selectedItemIndex + yearRange.first,
            month = selectedMonthIndex + 1
        ).numberOfDays
    }

    private val selectedMonthIndex : Int by derivedStateOf {
        monthState.selectedItemIndex.modSign(monthNames.size)
    }

    private val selectedDayIndex : Int by derivedStateOf {
        dayState.selectedItemIndex.modSign(daysInMonth)
    }

    private val initialDate by lazy {
        calendarModel.getCanonicalDate(initialSelectedStartDateMillis)
    }

    internal val monthState by lazy {
        CupertinoPickerState(
            infinite = true,
            initiallySelectedItemIndex = initialDate.month - 1
        )
    }

    internal val dayState by lazy {
        CupertinoPickerState(
            infinite = true,
            initiallySelectedItemIndex = initialDate.dayOfMonth - 1
        )
    }

    internal val yearState by lazy {
        CupertinoPickerState(
            initiallySelectedItemIndex = initialDate.year - yearRange.first
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
         * A [Saver] implementation for [DateTimePickerStateData].
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
@ExperimentalCupertinoApi
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
     * from the epoch.
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
    internal fun setSelection(@Suppress("AutoBoxing") dateMillis: Long) {
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

