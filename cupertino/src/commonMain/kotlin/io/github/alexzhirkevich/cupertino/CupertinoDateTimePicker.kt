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
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
    initialSelectedDateMillis: Long = CupertinoDatePickerDefaults.today.utcTimeMillis,
    initialHour: Int = 0,
    initialMinute: Int = 0,
    is24Hour: Boolean = PlatformDateFormat.is24HourFormat(defaultLocale()),
    yearRange: IntRange = CupertinoDatePickerDefaults.YearRangeSmall,
): CupertinoDateTimePickerState = rememberSaveable(
    saver = CupertinoDateTimePickerState.Saver(is24Hour)
) {
    CupertinoDateTimePickerState(
        initialSelectedDateMillis = initialSelectedDateMillis,
//        initialDisplayedMonthMillis = initialDisplayedMonthMillis,
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
    style: DatePickerStyle = DatePickerStyle.Wheel(),
    containerColor : Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
    modifier: Modifier = Modifier
) {
    when(style){
        is DatePickerStyle.Wheel -> CupertinoDateTimePickerWheel(
            state = state,
            height = style.height,
            indicator = style.indicator ?: CupertinoPickerDefaults.indicator(),
            containerColor = containerColor,
            modifier = modifier
        )

        is DatePickerStyle.Pager -> TODO("Pager datetime picker is not yet implemented. Use wheel or native (ios)")
    }
}

@Immutable
sealed interface DatePickerStyle {

    /** Paging date time picker
     *
     * @param colors pager colors
     * @param rowSpacing spacing between date picker rows
     * @param rowMaxHeight max height of date picker row. Can be smaller if date picker has extra row
     * */
    @Immutable
    class Pager(
        val colors: CupertinoDatePickerColors,
        val textStyles: CupertinoDatePickerTextStyles,
        val rowSpacing : Dp = 0.dp,
        val rowMaxHeight : Dp = CupertinoButtonTokens.IconButtonSize - 8.dp,
        val userScrollEnabled : Boolean = true
    ) : DatePickerStyle {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as Pager

            if (colors != other.colors) return false
            if (textStyles != other.textStyles) return false
            if (rowSpacing != other.rowSpacing) return false
            if (rowMaxHeight != other.rowMaxHeight) return false
            if (userScrollEnabled != other.userScrollEnabled) return false

            return true
        }

        override fun hashCode(): Int {
            var result = colors.hashCode()
            result = 31 * result + textStyles.hashCode()
            result = 31 * result + rowSpacing.hashCode()
            result = 31 * result + rowMaxHeight.hashCode()
            result = 31 * result + userScrollEnabled.hashCode()
            return result
        }
    }

    /**
     * Wheel date and time picker
     *
     * @param height wheel picker heigh
     * @param indicator picker indicator. Defaults to [CupertinoPickerDefaults.indicator].
     * Also [CupertinoPickerDefaults.indicatorOld] from older iOS can be used
     * */
    @Immutable
    class Wheel(
        val height: Dp = CupertinoPickerDefaults.Height,
        val indicator: CupertinoPickerIndicator? = null
    ) : DatePickerStyle {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as Wheel

            if (height != other.height) return false
            if (indicator != other.indicator) return false

            return true
        }

        override fun hashCode(): Int {
            var result = height.hashCode()
            result = 31 * result + (indicator?.hashCode() ?: 0)
            return result
        }
    }

    companion object {
        @Composable
        fun Pager(
            textStyles: CupertinoDatePickerTextStyles = CupertinoDatePickerDefaults.pagerTextStyles(),
            colors: CupertinoDatePickerColors = CupertinoDatePickerDefaults.pagerColors(),
            rowSpacing : Dp = 6.dp,
            rowMaxHeight : Dp = CupertinoButtonTokens.IconButtonSize,
            userScrollEnabled : Boolean = true
        ): Pager = DatePickerStyle.Pager(
            colors = colors,
            textStyles = textStyles,
            rowSpacing = rowSpacing,
            rowMaxHeight = rowMaxHeight,
            userScrollEnabled = userScrollEnabled
        )
    }
}

@OptIn(InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
private fun CupertinoDateTimePickerWheel(
    state: CupertinoDateTimePickerState,
    height : Dp = CupertinoPickerDefaults.Height,
    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {
    LaunchedEffect(state){
        state.isManual = false
    }

    Box(
        modifier = modifier
            .requiredHeight(height)
            .background(containerColor)
            .cupertinoPickerIndicator(
                state = state.stateData.dateState,
                indicator = indicator
            ),
        contentAlignment = Alignment.Center
    ) {

        Row(
            modifier = Modifier.widthIn(max = PickerMaxWidth),
            horizontalArrangement = Arrangement.Center,
        ) {

            state.stateData.calendarModel.today

            val locale = defaultLocale()
            CupertinoWheelPicker(
                state = state.stateData.dateState,
                items = state.stateData.days,
                height = height,
                modifier = Modifier
                    .weight(2f),
                indicator = {},
                containerColor = containerColor,
            ) {
                PickerText(
                    text = if (it.value.utcTimeMillis == CupertinoDatePickerDefaults.today.utcTimeMillis)
                        Today else it.value.format(
                        calendarModel = state.stateData.calendarModel,
                        skeleton = CupertinoDatePickerDefaults.MonthWeekdayDaySkeleton,
                        locale = locale
                    ),
                    textAlign = TextAlign.End
                )
            }

            CupertinoWheelPicker(
                state = state.stateData.hourState,
                items = if (state.stateData.is24Hour) Hours24 else Hours12,
                height = height,
                modifier = Modifier
                    .width(
                        if (state.stateData.is24Hour)
                            CupertinoTimePickerTokens.BlockWidth
                        else CupertinoTimePickerTokens.BlockWidth * 2 / 3
                    ),
                indicator = {},
                containerColor = containerColor,
            ) {
                NumberPickerText(
                    text = it,
                    textAlign = if (state.stateData.is24Hour)
                        TextAlign.Center else TextAlign.End,
                )
            }
            CupertinoWheelPicker(
                state = state.stateData.minuteState,
                items = Minutes,
                height = height,
                modifier = if (state.stateData.is24Hour)
                    Modifier.weight(1f)
                else Modifier.width(CupertinoTimePickerTokens.BlockWidth),
                indicator = {},
                containerColor = containerColor,
            ) {
                NumberPickerText(
                    text = it,
                    textAlign = if (state.stateData.is24Hour)
                        TextAlign.Start else TextAlign.Center,
                )
            }
            if (!state.stateData.is24Hour) {
                CupertinoWheelPicker(
                    state = state.stateData.amPmState,
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
}
//@OptIn(ExperimentalCupertinoApi::class)
//@Composable
//fun CupertinoDateTimePickerWheel12(
//    state: CupertinoDateTimePickerState,
//    height : Dp = CupertinoPickerDefaults.Height,
//    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
//    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
//    modifier: Modifier = Modifier
//) {
//    Row(
//        modifier = modifier
//            .requiredHeight(height)
//            .cupertinoPickerIndicator(
//                state = state.stateData.dateState,
//                indicator = indicator
//            ),
//x    ) {
//
//        CupertinoPicker(
//            state = state.stateData.dateState,
//            items = state.stateData.days,
//            height = height,
//            modifier = Modifier
//                .weight(1.5f),
//            indicator = {},
//            containerColor = containerColor,
//            withRotation = true,
//            rotationTransformOrigin = TransformOrigin(.5f, .5f)
//        ) {
//            PickerText(
//                text = if (it.value.utcTimeMillis == CupertinoDateTimePickerDefault.today.utcTimeMillis)
//                    Today else it.value.format(
//                    calendarModel = state.stateData.calendarModel,
//                    skeleton = CupertinoDateTimePickerDefault.MonthWeekdayDaySkeleton,
//                    locale = defaultLocale()
//                ),
//                textAlign = TextAlign.End,
//            )
//        }
//
//        CupertinoPicker(
//            state = state.stateData.hourState,
//            items = if (state.stateData.is24Hour) Hours24 else Hours12,
//            height = height,
//            modifier = Modifier.width(IntrinsicSize.Min),
//            indicator = {},
//            containerColor = containerColor,
//            withRotation = true
//        ) {
//            NumberPickerText(
//                text = it,
//                modifier = Modifier
//                    .padding(horizontal = CupertinoTimePickerTokens.Padding),
//                textAlign = TextAlign.End,
//            )
//        }
//        CupertinoPicker(
//            state = state.stateData.minuteState,
//            items = Minutes,
//            height = height,
//            indicator = {},
//            modifier = Modifier.width(IntrinsicSize.Min),
//            containerColor = containerColor,
//            withRotation = true,
//            rotationTransformOrigin = TransformOrigin.Center
//        ) {
//            NumberPickerText(
//                text = it,
//                 modifier = Modifier
//                    .padding(horizontal = CupertinoTimePickerTokens.Padding),
//                textAlign = TextAlign.Center,
//            )
//        }
//        CupertinoPicker(
//            state = state.stateData.amPmState,
//            items = listOf(true, false),
//            height = height,
//            modifier = Modifier
//                .weight(1f),
//            indicator = {},
//            containerColor = containerColor
//        ) {
//            PickerText(
//                text = if (it) AmPm.first else AmPm.second,
//                textAlign = TextAlign.Start,
//            )
//        }
//    }
//}

/**
 * Holds the state's data for the date picker.
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
 * @see rememberCupertinoDateTimePickerState
 */
@OptIn(ExperimentalCupertinoApi::class)
@Stable
internal class DateTimePickerStateData(
    internal val initialSelectedStartDateMillis: Long,
    initialSelectedEndDateMillis: Long?,
    initialDisplayedMonthMillis: Long = initialSelectedStartDateMillis,
    val initialDisplayedHour: Int,
    val initialDisplayedMinute: Int,
    val is24Hour : Boolean,
    val yearRange: IntRange
) {

    val calendarModel: CalendarModel = CalendarModelImpl()

    /**
     * A mutable state of [CalendarDate] that represents the start date for a selection.
     */
    val selectedStartDate : CalendarDate by derivedStateOf(structuralEqualityPolicy()) {
        days[dateState.selectedItemIndex].value
    }
    /**
     * A mutable state of [CalendarDate] that represents the end date for a selection.
     *
     * Single date selection states that use this [DateTimePickerStateData] should always have this as `null`.
     */
    var selectedEndDate = mutableStateOf<CalendarDate?>(null)

    val selectedMinute : Int by derivedStateOf(structuralEqualityPolicy()) {
        minuteState.selectedItemIndex
    }

    val selectedHour : Int by derivedStateOf(structuralEqualityPolicy()) {
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
            infinite = true,
            initiallySelectedItemIndex = if (is24Hour)
                initialDisplayedHour else initialDisplayedHour % 12
        )
    }

    internal val minuteState by lazy {
        CupertinoPickerState(
            infinite = true,
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
@OptIn(InternalCupertinoApi::class)
@Stable
@ExperimentalCupertinoApi
class CupertinoDateTimePickerState private constructor(
    internal val stateData: DateTimePickerStateData
) {

    /**
     * Constructs a DatePickerState.
     *
     * @param initialSelectedDateMillis timestamp in _UTC_ milliseconds from the epoch that
     * represents an initial selection of a date. Provide a `null` to indicate no selection. Note
     * that the state's
     * [selectedDateTimeMillis] will provide a timestamp that represents the _start_ of the day, which
     * may be different than the provided initialSelectedDateMillis.
     * @param yearRange an [IntRange] that holds the year range that the date picker will be limited
     * to
     * @see rememberCupertinoDateTimePickerState
     * @throws [IllegalArgumentException] if the initial selected date or displayed month represent
     * a year that is out of the year range.
     */
    constructor(
        @Suppress("AutoBoxing") initialSelectedDateMillis: Long,
        yearRange: IntRange,
        initialHour: Int,
        initialMinute: Int,
        is24Hour: Boolean,
    ) : this(
        DateTimePickerStateData(
            initialSelectedStartDateMillis = initialSelectedDateMillis,
            initialSelectedEndDateMillis = null,
//            initialDisplayedMonthMillis = initialDisplayedMonthMillis,
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
    val selectedDateTimeMillis: Long by derivedStateOf(structuralEqualityPolicy()) {
        if (isManual) {
            mSelectedDateTimeMillis
        } else {
            stateData.selectedStartDate.utcTimeMillis +
                    ((60 * selectedHour) + selectedMinute) * 60_000
        }
    }

    val selectedMinute: Int by derivedStateOf(structuralEqualityPolicy()) {
        if (isManual) {
            val start = stateData.calendarModel.getCanonicalDate(mSelectedDateTimeMillis)
            ((mSelectedDateTimeMillis - start.utcTimeMillis) % 60).toInt()
        } else {
            stateData.selectedMinute.modSign(Minutes.size)
        }
    }

    val selectedHour: Int by derivedStateOf(structuralEqualityPolicy()) {
        if (isManual) {
            val start = stateData.calendarModel.getCanonicalDate(mSelectedDateTimeMillis)
            ((mSelectedDateTimeMillis - start.utcTimeMillis) / 60).toInt()
        } else {
            stateData.selectedHour.modSign(if (stateData.is24Hour) Hours24.size else Hours12.size)
        }
    }

    private var mSelectedDateTimeMillis: Long by mutableStateOf(stateData.initialSelectedStartDateMillis)

    @InternalCupertinoApi
    var isManual: Boolean by mutableStateOf(false)

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
        if (isManual) {
            mSelectedDateTimeMillis = dateMillis
        } else {
            stateData.setSelection(startDateMillis = dateMillis, endDateMillis = null)
        }
    }

    companion object {

        /**
         * The default [Saver] implementation for [CupertinoDateTimePickerState].
         */
        fun Saver(
            is24Hour : Boolean
        ): Saver<CupertinoDateTimePickerState, *> = Saver(
            save = {
                listOf(
                    it.selectedDateTimeMillis,
                    it.selectedHour,
                    it.selectedMinute,
                    it.stateData.yearRange.first,
                    it.stateData.yearRange.last)
            },
            restore = { value ->
                CupertinoDateTimePickerState(
                    initialSelectedDateMillis = value[0] as Long,
                    initialHour = value[1] as Int,
                    initialMinute = value[2] as Int,
//                    initialDisplayedMonthMillis = value[0] as Long,
                    yearRange = value[3] as Int .. value[4] as Int,
                    is24Hour = is24Hour
                )
            }
        )
    }
}


@Immutable
object CupertinoDatePickerDefaults {

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

    @Composable
    fun pagerTextStyles(
        headline : TextStyle = CupertinoTheme.typography.headline,
        day : TextStyle = CupertinoTheme.typography.title3,
        selectedDay : TextStyle = day.copy(fontWeight = FontWeight.Bold),
        weekday : TextStyle = CupertinoTheme.typography.footnote
            .copy(fontWeight = FontWeight.SemiBold),
        monthWheel : TextStyle = CupertinoPickerDefaults.textStyle
    ) : CupertinoDatePickerTextStyles = CupertinoDatePickerTextStyles(
        headline = headline,
        day = day,
        weekday = weekday,
        selectedDay = selectedDay,
        monthWheel = monthWheel
    )

    @Composable
    fun pagerColors(
        chevronsColor : Color = CupertinoTheme.colorScheme.accent,
        headlineContentColor: Color = CupertinoTheme.colorScheme.label,
        weekdayContentColor: Color = CupertinoTheme.colorScheme.tertiaryLabel,
        todayContentColor: Color = CupertinoTheme.colorScheme.accent,
        dayContentColor: Color = CupertinoTheme.colorScheme.label,
        disabledDayContentColor: Color = dayContentColor.copy(alpha = 0.38f),
        disabledSelectedDayContentColor: Color = todayContentColor.copy(alpha = 0.38f),
        selectedDayContentColor: Color = todayContentColor,
        selectedDayContainerColor: Color = todayContentColor.copy(alpha = CupertinoButtonTokens.BorderedButtonAlpha),
        disabledSelectedDayContainerColor: Color = selectedDayContainerColor.copy(alpha = 0.38f),
        dayInSelectionRangeContentColor: Color = CupertinoTheme.colorScheme.label,
        dayInSelectionRangeContainerColor: Color = CupertinoTheme.colorScheme.label
    ) : CupertinoDatePickerColors = CupertinoDatePickerColors(
        chevronsColor = chevronsColor,
        headlineContentColor = headlineContentColor ,
        weekdayContentColor = weekdayContentColor ,
        dayContentColor = dayContentColor ,
        disabledDayContentColor = disabledDayContentColor ,
        selectedDayContentColor = selectedDayContentColor ,
        disabledSelectedDayContentColor = disabledSelectedDayContentColor ,
        selectedDayContainerColor = selectedDayContainerColor ,
        disabledSelectedDayContainerColor = disabledSelectedDayContainerColor ,
        todayContentColor = todayContentColor ,
        dayInSelectionRangeContainerColor = dayInSelectionRangeContainerColor ,
        dayInSelectionRangeContentColor = dayInSelectionRangeContentColor ,
    )
}

private const val Today = "Today" // todo localize
