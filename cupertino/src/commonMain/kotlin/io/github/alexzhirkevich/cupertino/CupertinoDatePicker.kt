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

@file:OptIn(InternalCupertinoApi::class)

package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.ScrollAxisRange
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.horizontalScrollAxisRange
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.text
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.coerceAtMost
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import io.github.alexzhirkevich.CalendarDate
import io.github.alexzhirkevich.CalendarModel
import io.github.alexzhirkevich.CalendarModelImpl
import io.github.alexzhirkevich.CalendarMonth
import io.github.alexzhirkevich.DaysInWeek
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.MillisecondsIn24Hours
import io.github.alexzhirkevich.PlatformDateFormat
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronBackward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronForward
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionTokens
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.DefaultAlpha
import io.github.alexzhirkevich.cupertino.theme.White
import io.github.alexzhirkevich.currentLocale
import io.github.alexzhirkevich.defaultLocale
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlin.math.ceil


/**
 * Creates a [CupertinoDatePickerState] for a time picker that is remembered across compositions
 * and configuration changes.
 *
 * @param initialSelectedDateMillis initial selected date milliseconds at the start of day
 * @param yearRange range of available years to pick
 */
@Composable
@ExperimentalCupertinoApi
fun rememberCupertinoDatePickerState(
    initialSelectedDateMillis: Long = CupertinoDatePickerDefaults.today.utcTimeMillis,
    yearRange: IntRange = CupertinoDatePickerDefaults.YearRangeLarge,
): CupertinoDatePickerState = rememberSaveable(
    saver = CupertinoDatePickerState.Saver()
) {
    CupertinoDatePickerState(
        initialSelectedDateMillis = initialSelectedDateMillis,
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
    modifier: Modifier = Modifier,
    style: DatePickerStyle = DatePickerStyle.Wheel(),
    containerColor: Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
) {

    CompositionLocalProvider(
        LocalContainerColor provides containerColor
    ) {
        when (style) {
            is DatePickerStyle.Wheel -> CupertinoDatePickerWheel(
                state = state,
                height = style.height,
                indicator = style.indicator ?: CupertinoPickerDefaults.indicator(),
                containerColor = containerColor,
                modifier = modifier
            )

            is DatePickerStyle.Pager -> CupertinoDatePickerPager(
                state = state,
                containerColor = containerColor,
                modifier = modifier,
                style = style
            )
        }
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
class CupertinoDatePickerState private constructor(
    internal val stateData: DatePickerStateData
) {


    /**
     * Constructs a DatePickerState.
     *
     * @param initialSelectedDateMillis timestamp in _UTC_ milliseconds from the epoch that
     * represents an initial selection of a date. Provide a `null` to indicate no selection. Note
     * that the state's
     * [selectedDateMillis] will provide a timestamp that represents the _start_ of the day, which
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
    ) : this(
        DatePickerStateData(
            initialSelectedStartDateMillis = initialSelectedDateMillis,
            initialSelectedEndDateMillis = null,
            yearRange = yearRange,
        )
    ) {
        mSelectedDateMillis = initialSelectedDateMillis
    }

    /**
     * A timestamp that represents the _start_ of the day of the selected date in _UTC_ milliseconds
     * from the epoch.
     *
     * @see [setSelection]
     */
    val selectedDateMillis: Long by derivedStateOf {
        if (isManual)
            mSelectedDateMillis
        else stateData.selectedDateFromWheel.utcTimeMillis
    }

    internal val selectedStartDate: CalendarDate by derivedStateOf() {
        if (isManual)
            stateData.calendarModel.getCanonicalDate(mSelectedDateMillis)
        else
            stateData.selectedDateFromWheel
    }


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
            mSelectedDateMillis = dateMillis
        } else {
            stateData.setSelection(startDateMillis = dateMillis, endDateMillis = null)
        }

        stateData.displayedMonth = stateData.calendarModel.getMonth(dateMillis)
    }

    @InternalCupertinoApi
    var isManual by mutableStateOf(false)

    private var mSelectedDateMillis: Long by mutableStateOf(0)


    companion object {
        /**
         * The default [Saver] implementation for [CupertinoDateTimePickerState].
         */
        fun Saver(): Saver<CupertinoDatePickerState, *> = Saver(
            save = {
                listOf(
                    it.selectedDateMillis,
                    it.stateData.yearRange.first,
                    it.stateData.yearRange.last,
                    it.isManual
                )
//                with(DatePickerStateData.Saver()) {
//                    save(it.stateData)
//                }
            },
            restore = { value ->
                CupertinoDatePickerState(
                    initialSelectedDateMillis = value[0] as Long,
                    yearRange = value[1] as Int..value[2] as Int
                ).apply {
                    isManual = value[3] as Boolean
                }
//                CupertinoDatePickerState(with(DatePickerStateData.Saver()) { restore(value)!! })
            }
        )
    }
}

@Immutable
class CupertinoDatePickerTextStyles internal constructor(
    internal val headline: TextStyle,
    internal val day: TextStyle,
    internal val selectedDay: TextStyle,
    internal val weekday: TextStyle,
    internal val monthWheel: TextStyle,
)

/**
 * Represents the colors used by the date picker.
 *
 * See [CupertinoDatePickerDefaults.pagerColors] for the default implementation that follows Cupertino
 * specifications.
 */
@Immutable
class CupertinoDatePickerColors internal constructor(
    internal val chevronsColor: Color,
    private val headlineContentColor: Color,
    internal val weekdayContentColor: Color,
    private val dayContentColor: Color,
    private val disabledDayContentColor: Color,
    internal val selectedDayContentColor: Color,
    private val disabledSelectedDayContentColor: Color,
    private val selectedDayContainerColor: Color,
    private val disabledSelectedDayContainerColor: Color,
    private val todayContentColor: Color,
    internal val dayInSelectionRangeContainerColor: Color,
    private val dayInSelectionRangeContentColor: Color,
) {

    @Composable
    internal fun headlineContentColor(
        inMonthSelectionMode: Boolean
    ): State<Color> {

        val target = if (inMonthSelectionMode)
            chevronsColor
        else headlineContentColor

        return animateColorAsState(target)
    }

    /**
     * Represents the content color for a calendar day.
     *
     * @param isToday indicates that the color is for a date that represents today
     * @param selected indicates that the color is for a selected day
     * @param inRange indicates that the day is part of a selection range of days
     * @param enabled indicates that the day is enabled for selection
     */
    @Composable
    internal fun dayContentColor(
        isToday: Boolean,
        selected: Boolean,
        inRange: Boolean,
        enabled: Boolean
    ): State<Color> {
        val target = when {
            selected && isToday -> CupertinoColors.White
            selected && enabled -> selectedDayContentColor
            selected && !enabled -> disabledSelectedDayContentColor
            inRange && enabled -> dayInSelectionRangeContentColor
            inRange && !enabled -> disabledDayContentColor
            isToday -> todayContentColor
            enabled -> dayContentColor
            else -> disabledDayContentColor
        }

        return rememberUpdatedState(target)
    }

    /**
     * Represents the container color for a calendar day.
     *
     * @param selected indicates that the color is for a selected day
     * @param enabled indicates that the day is enabled for selection
     */
    @Composable
    internal fun dayContainerColor(
        isToday: Boolean,
        selected: Boolean,
        enabled: Boolean
    ): State<Color> {

        val target = when {
            selected && isToday -> selectedDayContentColor
            selected && enabled -> selectedDayContainerColor
            selected -> disabledSelectedDayContainerColor
            else -> Color.Transparent
        }

        return rememberUpdatedState(target)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is CupertinoDatePickerColors) return false
        if (headlineContentColor != other.headlineContentColor) return false
        if (weekdayContentColor != other.weekdayContentColor) return false
        if (dayContentColor != other.dayContentColor) return false
        if (disabledDayContentColor != other.disabledDayContentColor) return false
        if (selectedDayContentColor != other.selectedDayContentColor) return false
        if (disabledSelectedDayContentColor != other.disabledSelectedDayContentColor) return false
        if (selectedDayContainerColor != other.selectedDayContainerColor) return false
        if (disabledSelectedDayContainerColor != other.disabledSelectedDayContainerColor) {
            return false
        }
        if (todayContentColor != other.todayContentColor) return false
        if (dayInSelectionRangeContainerColor != other.dayInSelectionRangeContainerColor) {
            return false
        }
        if (dayInSelectionRangeContentColor != other.dayInSelectionRangeContentColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = headlineContentColor.hashCode()
        result = 31 * result + weekdayContentColor.hashCode()
        result = 31 * result + dayContentColor.hashCode()
        result = 31 * result + disabledDayContentColor.hashCode()
        result = 31 * result + selectedDayContentColor.hashCode()
        result = 31 * result + disabledSelectedDayContentColor.hashCode()
        result = 31 * result + selectedDayContainerColor.hashCode()
        result = 31 * result + disabledSelectedDayContainerColor.hashCode()
        result = 31 * result + todayContentColor.hashCode()
        result = 31 * result + dayInSelectionRangeContainerColor.hashCode()
        result = 31 * result + dayInSelectionRangeContentColor.hashCode()
        return result
    }
}


@OptIn(ExperimentalCupertinoApi::class)
private enum class DatePickerComponent(
    val key: Char,
    val content: @Composable (CupertinoDatePickerState, Dp, Color) -> Unit
) {
    Day('d', { state, height, containerColor ->
        CupertinoWheelPicker(
            state = state.stateData.dayState,
            items = (1..state.stateData.daysInMonth).toList(),
            height = height,
            modifier = Modifier.width(75.dp),
            indicator = {},
            containerColor = containerColor,
        ) {
            PickerText(
                text = it.toString(),
                modifier = Modifier.padding(horizontal = HorizontalPadding)
            )
        }
    }),

    Month('m', { state, height, containerColor ->
        CupertinoWheelPicker(
            state = state.stateData.monthState,
            items = state.stateData.monthNames,
            height = height,
            modifier = Modifier.width(130.dp),
            indicator = {},
            containerColor = containerColor,
        ) {
            PickerText(
                text = it,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = HorizontalPadding)
            )
        }
    }),
    Year('y', { state, height, containerColor ->
        CupertinoWheelPicker(
            state = state.stateData.yearState,
            items = remember(state) { state.stateData.yearRange.toList() },
            height = height,
            modifier = Modifier.width(85.dp),
            indicator = {},
            containerColor = containerColor,
        ) {
            PickerText(
                text = it.toString(),
                modifier = Modifier.padding(horizontal = HorizontalPadding)
            )
        }
    })
}

@Composable
@ExperimentalCupertinoApi
private fun CupertinoDatePickerWheel(
    state: CupertinoDatePickerState,
    height: Dp = CupertinoPickerDefaults.Height,
    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
    containerColor: Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {

    LaunchedEffect(state) {
        state.isManual = false
    }

    val locale = defaultLocale()

    val components = remember(locale) {
        state.stateData.calendarModel
            .getDateInputFormat(locale)
            .patternWithoutDelimiters
            .lowercase()
            .toSet()
            .map { c ->
                DatePickerComponent.entries.first { it.key == c }
            }
    }

    Box(
        modifier = modifier
            .requiredHeight(height)
            .background(containerColor)
            .cupertinoPickerIndicator(
                state = state.stateData.dayState,
                indicator = indicator
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
        ) {
            components.fastForEach {
                it.content(state, height, containerColor)
            }
        }
    }
}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
private fun CupertinoDatePickerPager(
    state: CupertinoDatePickerState,
    style: DatePickerStyle.Pager,
    containerColor: Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    modifier: Modifier = Modifier
) {
    LaunchedEffect(state) {
        state.isManual = true
    }


    var inMonthSelectionMode by rememberSaveable {
        mutableStateOf(false)
    }

    val monthsListState = rememberLazyListState(
        initialFirstVisibleItemIndex = state.stateData.displayedMonthIndex
    )

    val coroutineScope = rememberCoroutineScope()

    CompositionLocalProvider(LocalContainerColor provides containerColor) {
        Column(
            modifier
                .background(containerColor)
        ) {
            PagerDatePickerControls(
                state = state,
                colors = style.colors,
                inMonthSelectionMode = inMonthSelectionMode,
                onMonthSelectionClicked = {
                    inMonthSelectionMode = !inMonthSelectionMode
                },
                onPrevMonthClicked = {
                    coroutineScope.launch {
                        monthsListState.animateScrollToItem(
                            (monthsListState.firstVisibleItemIndex - 1).coerceAtLeast(1)
                        )
                    }
                },
                onNextMonthClicked = {
                    coroutineScope.launch {
                        monthsListState.animateScrollToItem(
                            monthsListState.firstVisibleItemIndex +
                                    if (monthsListState.isScrollInProgress) 2 else 1
                        )
                    }
                },
                maxDaySize = style.rowMaxHeight,
                textStyles = style.textStyles
            )

            val height = calculatePagerHeight(
                verticalSpacing = style.rowSpacing,
                maxDaySize = style.rowMaxHeight
            ) + style.rowMaxHeight

            AnimatedContent(
                modifier = Modifier
                    .height(height),
                targetState = inMonthSelectionMode,
                transitionSpec = {
                    PagerFadeEnter togetherWith PagerFadeExit
                },
            ) { monthSelection ->

                if (monthSelection) {
                    CupertinoMonthPicker(
                        containerColor = containerColor,
                        state = state,
                        height = height
                            .coerceAtMost(CupertinoPickerDefaults.Height),
                        modifier = Modifier
                            .fillMaxWidth(),
                    )
                } else {
                    Column {
                        WeekDays(
                            colors = style.colors,
                            calendarModel = state.stateData.calendarModel,
                            maxDaySize = style.rowMaxHeight,
                            textStyles = style.textStyles
                        )

                        HorizontalMonthsList(
                            onDateSelected = { date ->
                                state.setSelection(date)
                            },
                            state = state,
                            lazyListState = monthsListState,
                            dateValidator = {
                                true
                            },
                            style = style
                        )
                    }
                }
            }
        }
    }
}

//
@OptIn(ExperimentalCupertinoApi::class)
@Composable
private fun PagerDatePickerControls(
    maxDaySize: Dp,
    state: CupertinoDatePickerState,
    colors: CupertinoDatePickerColors,
    textStyles: CupertinoDatePickerTextStyles,
    inMonthSelectionMode: Boolean,
    onMonthSelectionClicked: () -> Unit,
    onPrevMonthClicked: () -> Unit,
    onNextMonthClicked: () -> Unit,
) {

    val calendarModel = state.stateData.calendarModel
    val locale = defaultLocale()

    val isLtr = LocalLayoutDirection.current == LayoutDirection.Ltr
    val chevronRotation by animateFloatAsState(targetValue = if (inMonthSelectionMode) if (isLtr) 90f else -90f else 0f)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(maxDaySize)
            .padding(start = CupertinoSectionTokens.HorizontalPadding)
    ) {
        val month by remember {
            derivedStateOf {
                state.stateData.displayedMonth.format(
                    calendarModel = calendarModel,
                    skeleton = CupertinoDatePickerDefaults.YearMonthSkeleton,
                    locale = locale
                )
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.pointerInput(0) {
                detectTapGestures {
                    onMonthSelectionClicked()
                }
            }
        ) {

            CupertinoText(
                text = month,
                style = textStyles.headline,
                color = colors.headlineContentColor(
                    inMonthSelectionMode = inMonthSelectionMode
                ).value
            )

            CupertinoIcon(
                modifier = Modifier
                    .size(SmallChevronSize)
                    .padding(start = 4.dp)
                    .graphicsLayer {
                        rotationZ = chevronRotation
                    },
                imageVector = if (isLtr)
                    CupertinoIcons.Default.ChevronForward
                else CupertinoIcons.Default.ChevronBackward,
                contentDescription = null,
                tint = colors.chevronsColor
            )
        }

        Spacer(Modifier.weight(1f))

        AnimatedVisibility(
            visible = !inMonthSelectionMode,
            enter = PagerFadeEnter,
            exit = PagerFadeExit
        ) {
            Row {
                CupertinoIconButton(
                    onClick = onPrevMonthClicked
                ) {
                    CupertinoIcon(
                        modifier = Modifier
                            .rotate(180f)
                            .size(LargeChevronSize),
                        imageVector = if (isLtr)
                            CupertinoIcons.Default.ChevronForward
                        else CupertinoIcons.Default.ChevronBackward,
                        contentDescription = "Next Month",
                        tint = colors.chevronsColor
                    )
                }
                CupertinoIconButton(
                    onClick = onNextMonthClicked
                ) {
                    CupertinoIcon(
                        modifier = Modifier.size(LargeChevronSize),
                        imageVector = if (isLtr)
                            CupertinoIcons.Default.ChevronForward
                        else CupertinoIcons.Default.ChevronBackward,
                        contentDescription = "Next Month",
                        tint = colors.chevronsColor
                    )
                }
            }
        }
    }
}

/**
 * Composes the weekdays letters.
 */
@Composable
internal fun WeekDays(
    colors: CupertinoDatePickerColors,
    textStyles: CupertinoDatePickerTextStyles,
    calendarModel: CalendarModel,
    maxDaySize: Dp
) {
    val firstDayOfWeek = calendarModel.firstDayOfWeek
    val weekdays = calendarModel.weekdayNames
    val dayNames = arrayListOf<Pair<String, String>>()
    // Start with firstDayOfWeek - 1 as the days are 1-based.
    for (i in firstDayOfWeek - 1 until weekdays.size) {
        dayNames.add(weekdays[i])
    }
    for (i in 0 until firstDayOfWeek - 1) {
        dayNames.add(weekdays[i])
    }
    CompositionLocalProvider(
        LocalContentColor provides colors.weekdayContentColor
    ) {
        ProvideTextStyle(value = textStyles.weekday) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = maxDaySize / 4),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                dayNames.fastForEach {
                    Box(
                        modifier = Modifier
                            .clearAndSetSemantics { contentDescription = it.first }
                            .size(
                                width = maxDaySize,
                                height = maxDaySize * 3 / 4
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        CupertinoText(
                            text = it.second.uppercase(),
                            modifier = Modifier.wrapContentSize(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
private fun HorizontalMonthsList(
    style: DatePickerStyle.Pager,
    onDateSelected: (dateInMillis: Long) -> Unit,
    state: CupertinoDatePickerState,
    lazyListState: LazyListState,
    dateValidator: (Long) -> Boolean,
) {
    val stateData = state.stateData
    val today = stateData.calendarModel.today
    val firstMonth = remember(stateData.yearRange) {
        stateData.calendarModel.getMonth(
            year = stateData.yearRange.first,
            month = 1 // January
        )
    }
    LazyRow(
        // Apply this to prevent the screen reader from scrolling to the next or previous month, and
        // instead, traverse outside the Month composable when swiping from a focused first or last
        // day of the month.
        modifier = Modifier.semantics {
            horizontalScrollAxisRange = ScrollAxisRange(value = { 0f }, maxValue = { 0f })
        },
        state = lazyListState,
        flingBehavior = rememberSnapFlingBehavior(lazyListState),
        userScrollEnabled = style.userScrollEnabled
    ) {
        items(stateData.totalMonthsInRange) {
            val month =
                stateData.calendarModel.plusMonths(
                    from = firstMonth,
                    addedMonthsCount = it
                )
            Box(
                modifier = Modifier.fillParentMaxWidth()
            ) {
                Month(
                    colors = style.colors,
                    month = month,
                    onDateSelected = onDateSelected,
                    today = today,
                    stateData = stateData,
                    state = state,
                    rangeSelectionEnabled = false,
                    dateValidator = dateValidator,
                    verticalSpacing = style.rowSpacing,
                    maxDaySize = style.rowMaxHeight,
                    textStyles = style.textStyles
                )
            }
        }
    }

    LaunchedEffect(lazyListState, state) {
        snapshotFlow {
            state.stateData.displayedMonthIndex
        }.collectLatest {
            if (!lazyListState.isScrollInProgress) {
                lazyListState.scrollToItem(it)
            }
        }
    }

    LaunchedEffect(lazyListState) {
        updateDisplayedMonth(lazyListState, stateData)
    }
}

//
internal suspend fun updateDisplayedMonth(
    lazyListState: LazyListState,
    stateData: DatePickerStateData
) {
    snapshotFlow { lazyListState.firstVisibleItemIndex }.collectLatest {
        val yearOffset = lazyListState.firstVisibleItemIndex / 12
        val month = lazyListState.firstVisibleItemIndex % 12 + 1
        with(stateData) {
            if (displayedMonth.month != month ||
                displayedMonth.year != yearRange.first + yearOffset
            ) {
                displayedMonth = calendarModel.getMonth(
                    year = yearRange.first + yearOffset,
                    month = month
                )
            }
        }
    }
}

/**
 * A composable that renders a calendar month and displays a date selection.
 */
@OptIn(ExperimentalCupertinoApi::class)
@Composable
internal fun Month(
    verticalSpacing: Dp,
    maxDaySize: Dp,
    colors: CupertinoDatePickerColors,
    textStyles: CupertinoDatePickerTextStyles,
    month: CalendarMonth,
    onDateSelected: (dateInMillis: Long) -> Unit,
    today: CalendarDate,
    stateData: DatePickerStateData,
    state: CupertinoDatePickerState,
    rangeSelectionEnabled: Boolean,
    dateValidator: (Long) -> Boolean,
) {

    val defaultLocale = defaultLocale()
    val startSelection = state.selectedStartDate
    val endSelection = stateData.selectedEndDate

    val totalRows by remember {
        derivedStateOf {
            ceil((month.daysFromStartOfWeekToFirstOfMonth + month.numberOfDays) / DaysInWeek.toFloat())
                .toInt()
        }
    }

    val daySize = (maxDaySize * MaxCalendarRows / totalRows).coerceAtMost(maxDaySize)

    Column(
        modifier = Modifier
            .requiredHeight(
                calculatePagerHeight(
                    verticalSpacing = verticalSpacing,
                    maxDaySize = maxDaySize
                )
            ),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        CompositionLocalProvider(
            LocalContentColor provides colors.selectedDayContentColor.copy(
                alpha = CupertinoColors.DefaultAlpha.alpha
            )
        ) {
            var cellNumber = 0

            repeat(totalRows) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = verticalSpacing / 2),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {

                    repeat(DaysInWeek) {
                        if (cellNumber < month.daysFromStartOfWeekToFirstOfMonth ||
                            cellNumber >=
                            (month.daysFromStartOfWeekToFirstOfMonth + month.numberOfDays)
                        ) {
                            // Empty cell
                            Spacer(
                                modifier = Modifier.requiredSize(
                                    width = daySize,
                                    height = daySize
                                )
                            )
                        } else {
                            val dayNumber = cellNumber - month.daysFromStartOfWeekToFirstOfMonth
                            val dateInMillis = month.startUtcTimeMillis +
                                    (dayNumber * MillisecondsIn24Hours)
                            val isToday = dateInMillis == today.utcTimeMillis
                            val startDateSelected =
                                dateInMillis == startSelection.utcTimeMillis
                            val endDateSelected =
                                dateInMillis == endSelection.value?.utcTimeMillis
                            val inRange = remember(rangeSelectionEnabled, dateInMillis) {
                                derivedStateOf {
                                    with(stateData) {
                                        rangeSelectionEnabled &&
                                                dateInMillis >= startSelection.utcTimeMillis &&
                                                dateInMillis <= (selectedEndDate.value?.utcTimeMillis
                                            ?: Long.MIN_VALUE)
                                    }
                                }
                            }
                            val dayContentDescription = dayContentDescription(
                                rangeSelectionEnabled = rangeSelectionEnabled,
                                isToday = isToday,
                                isStartDate = startDateSelected,
                                isEndDate = endDateSelected,
                                isInRange = inRange.value
                            )
                            val formattedDateDescription =
                                PlatformDateFormat.formatWithSkeleton(
                                    dateInMillis,
                                    CupertinoDatePickerDefaults.YearAbbrMonthDaySkeleton,
                                    defaultLocale
                                )

                            val selected = startDateSelected || endDateSelected

                            Day(
                                modifier = Modifier
                                    .requiredSize(daySize),
                                selected = selected,
                                onClick = { onDateSelected(dateInMillis) },
                                // Only animate on the first selected day. This is important to
                                // disable when drawing a range marker behind the days on an
                                // end-date selection.
                                enabled = remember(dateInMillis) {
                                    dateValidator.invoke(dateInMillis)
                                },
                                today = isToday,
                                inRange = inRange.value,
                                description = if (dayContentDescription != null) {
                                    "$dayContentDescription, $formattedDateDescription"
                                } else {
                                    formattedDateDescription
                                },
                                colors = colors
                            ) {
                                ProvideTextStyle(
                                    if (selected) textStyles.selectedDay else textStyles.day
                                ) {

                                    CupertinoText(
                                        text = (dayNumber + 1).toString(),
                                        // The semantics are set at the Day level.
                                        modifier = Modifier.clearAndSetSemantics { },
                                        textAlign = TextAlign.Center,
                                        fontWeight = if (selected)
                                            FontWeight.SemiBold else FontWeight.Normal
                                    )
                                }
                            }
                        }
                        cellNumber++
                    }
                }
            }
        }
    }
}

@Composable
private fun dayContentDescription(
    rangeSelectionEnabled: Boolean,
    isToday: Boolean,
    isStartDate: Boolean,
    isEndDate: Boolean,
    isInRange: Boolean
): String? {
    val descriptionBuilder = StringBuilder()
    if (rangeSelectionEnabled) {
        when {
            isStartDate -> descriptionBuilder.append(
                "Start date"
            )

            isEndDate -> descriptionBuilder.append(
                "End date"
            )

            isInRange -> descriptionBuilder.append(
                "In range"
            )
        }
    }
    if (isToday) {
        if (descriptionBuilder.isNotEmpty()) descriptionBuilder.append(", ")
        descriptionBuilder.append("Today")
    }
    return if (descriptionBuilder.isEmpty()) null else descriptionBuilder.toString()
}

@Composable
private fun Day(
    modifier: Modifier,
    selected: Boolean,
    onClick: () -> Unit,
    enabled: Boolean,
    today: Boolean,
    inRange: Boolean,
    description: String,
    colors: CupertinoDatePickerColors,
    content: @Composable () -> Unit
) {

    CupertinoSurface(
        onClick,
        modifier
            // Apply and merge semantics here. This will ensure that when scrolling the list the
            // entire Day surface is treated as one unit and holds the date semantics even when it's
            // not completely visible atm.
            .semantics(mergeDescendants = true) {
                text = AnnotatedString(description)
                role = Role.Button
                this.selected = selected
            },
        enabled,
        CircleShape,
        colors.dayContainerColor(
            selected = selected,
            enabled = enabled,
            isToday = today
        ).value,
        colors.dayContentColor(
            isToday = today,
            selected = selected,
            inRange = inRange,
            enabled = enabled,
        ).value,
    ) {
        Box(contentAlignment = Alignment.Center) {
            content()
        }
    }
}

internal class SelectedRangeInfo(
    val gridCoordinates: Pair<IntOffset, IntOffset>,
    val firstIsSelectionStart: Boolean,
    val lastIsSelectionEnd: Boolean
) {
    companion object {
        /**
         * Calculates the selection coordinates within the current month's grid. The returned [Pair]
         * holds the actual item x & y coordinates within the LazyVerticalGrid, and is later used to
         * calculate the exact offset for drawing the selection rectangles when in range-selection
         * mode.
         */
        fun calculateRangeInfo(
            month: CalendarMonth,
            startDate: CalendarDate?,
            endDate: CalendarDate?
        ): SelectedRangeInfo? {
            if (startDate != null && endDate != null) {
                if (startDate.utcTimeMillis > month.endUtcTimeMillis ||
                    endDate.utcTimeMillis < month.startUtcTimeMillis
                ) {
                    return null
                }
                val firstIsSelectionStart = startDate.utcTimeMillis >= month.startUtcTimeMillis
                val lastIsSelectionEnd = endDate.utcTimeMillis <= month.endUtcTimeMillis
                val startGridItemOffset = if (firstIsSelectionStart) {
                    month.daysFromStartOfWeekToFirstOfMonth + startDate.dayOfMonth - 1
                } else {
                    month.daysFromStartOfWeekToFirstOfMonth
                }
                val endGridItemOffset = if (lastIsSelectionEnd) {
                    month.daysFromStartOfWeekToFirstOfMonth + endDate.dayOfMonth - 1
                } else {
                    month.daysFromStartOfWeekToFirstOfMonth + month.numberOfDays - 1
                }

                // Calculate the selected coordinates within the cells grid.
                val startCoordinates = IntOffset(
                    x = startGridItemOffset % DaysInWeek,
                    y = startGridItemOffset / DaysInWeek
                )
                val endCoordinates = IntOffset(
                    x = endGridItemOffset % DaysInWeek,
                    y = endGridItemOffset / DaysInWeek
                )
                return SelectedRangeInfo(
                    Pair(startCoordinates, endCoordinates),
                    firstIsSelectionStart,
                    lastIsSelectionEnd
                )
            }
            return null
        }
    }
}

private const val MaxCalendarRows = 5

private val SmallChevronSize = 12.dp
private val LargeChevronSize = 18.dp

/**
 * Holds the state's data for the date picker.
 *
 *
 * @param initialSelectedStartDateMillis timestamp in _UTC_ milliseconds from the epoch that
 * represents an initial selection of a start date. Provide a `null` to indicate no selection.
 * @param initialSelectedEndDateMillis timestamp in _UTC_ milliseconds from the epoch that
 * represents an initial selection of an end date. Provide a `null` to indicate no selection. This
 * value will be ignored in case it's smaller or equals to the initial start value.

 * @param yearRange an [IntRange] that holds the year range that the date picker will be limited to
 * @see rememberCupertinoDateTimePickerState
 */
@OptIn(ExperimentalCupertinoApi::class)
@Stable
internal open class DatePickerStateData(
    val initialSelectedStartDateMillis: Long,
    initialSelectedEndDateMillis: Long?,
    val yearRange: IntRange
) {

    val calendarModel: CalendarModel = CalendarModelImpl()


    /**
     * A state of [CalendarDate] that represents the start date for a selection.
     */
    val selectedDateFromWheel: CalendarDate by derivedStateOf(structuralEqualityPolicy()) {

        val months = calendarModel.getMonth(
            year = yearRange.first + yearState.selectedItemIndex,
            month = selectedMonthIndex + 1
        )

        val dayIndex = dayState.selectedItemIndex % 31

        val day = (dayIndex + 1).coerceIn(1, months.numberOfDays)

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


    internal val daysInMonth by derivedStateOf(structuralEqualityPolicy()) {
        calendarModel.getMonth(
            year = yearState.selectedItemIndex + yearRange.first,
            month = selectedMonthIndex + 1
        ).numberOfDays
    }

    private val selectedMonthIndex: Int by derivedStateOf(structuralEqualityPolicy()) {
        monthState.selectedItemIndex.modSign(12)
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
            val month = calendarModel.getMonth(initialSelectedStartDateMillis)
            require(yearRange.contains(month.year)) {
                "The initial display month's year (${month.year}) is out of the years range of " +
                        "$yearRange."
            }
            month
        }
    )

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
                    yearRange = IntRange(value[3] as Int, value[4] as Int),
                )
            }
        )
    }
}


@OptIn(ExperimentalCupertinoApi::class)
@Composable
private fun CupertinoMonthPicker(
    containerColor: Color,
    height: Dp,
    state: CupertinoDatePickerState,
    modifier: Modifier = Modifier,
) {

    val initialMilli = remember(state) {
        val month = state.stateData.displayedMonth

        month.startUtcTimeMillis + state.stateData.calendarModel
            .getCanonicalDate(state.selectedDateMillis)
            .dayOfMonth
            .coerceAtMost(month.numberOfDays).minus(1) * MillisecondsIn24Hours
    }

    val delegatedState = rememberCupertinoDatePickerState(
        initialSelectedDateMillis = initialMilli,
        yearRange = state.stateData.yearRange
    )

    val milli = delegatedState.selectedDateMillis

    LaunchedEffect(state, milli) {
        state.setSelection(milli)
    }

    val locale = defaultLocale()

    val components = remember(locale) {
        setOf(DatePickerComponent.Month, DatePickerComponent.Year)
    }

    Box(
        modifier = modifier
            .requiredHeight(height)
            .background(containerColor)
            .cupertinoPickerIndicator(
                state = delegatedState.stateData.monthState,
                indicator = CupertinoPickerDefaults.indicator()
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
        ) {
            components.forEach {
                it.content(delegatedState, height, containerColor)
            }
        }
    }
}

@Stable
fun calculatePagerHeight(
    verticalSpacing: Dp,
    maxDaySize: Dp,
) = (maxDaySize + verticalSpacing) * MaxCalendarRows


//private val VerticalPadding : Dp = 6.dp
//private val PagerRowSize= CupertinoButtonTokens.IconButtonSize
//private val PagerHeight = (PagerRowSize + VerticalPadding) * MaxCalendarRows
//private val PagerRowsHeight = (PagerRowSize) * MaxCalendarRows

private val HorizontalPadding: Dp = 8.dp
private val PagerFadeEnter = fadeIn()
private val PagerFadeExit = fadeOut()