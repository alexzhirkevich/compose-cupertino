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

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListLayoutInfo
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.shape.CornerBasedShape
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
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.fastFirstOrNull
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.abs


@Stable
@ExperimentalCupertinoApi
class CupertinoPickerState(
    internal val infinite : Boolean = false,
    internal val initiallySelectedItemIndex : Int = 0,
) : ScrollableState {

    internal val lazyListState: LazyListState = LazyListState(
        firstVisibleItemIndex = if (infinite)
            INFINITE_OFFSET + initiallySelectedItemIndex
        else initiallySelectedItemIndex
    )

    internal val selectedItemHeight: Int by derivedStateOf {
        selectedItem?.size ?: 0
    }


    private val selectedItem by derivedStateOf {
        with(layoutInfo) {
            visibleItemsInfo.fastFirstOrNull {
                it.offset + it.size - viewportStartOffset > viewportSize.height / 2
            }
        }
    }

    internal var changedProgrammatically by mutableStateOf(false)

    /**
     * Current selected item index.
     *
     * - NOTE: if picker is [infinite], this value will not represent actual item index.
     * It will be index + items.count * spin. And it can be negative.
     *
     * In that case
     *
     * - [selectedItemIndex] or [selectedItemState] functions should be used to get updated state of the actual item index.
     *
     * - [currentSelectedItem] function should be used to get current selected item index at the moment.
     * */
    val selectedItemIndex : Int by derivedStateOf {
        (if (infinite) {
            selectedItem?.index?.minus(INFINITE_OFFSET)
        } else selectedItem?.index) ?: initiallySelectedItemIndex
    }

    /**
     * Current selected item index at the moment.
     *
     * If picker is not [infinite] then [selectedItemIndex] property can be safely used instead
     * */
    fun currentSelectedItem(itemsCount : Int) : Int {
        return selectedItemIndex.modSign(itemsCount)
    }

    /**
     * Updated state of the actual item index.
     *
     * If picker is not [infinite] then [selectedItemIndex] property can be safely used instead
     * */
    fun selectedItemState(itemsCount : Int) : State<Int> {
        return derivedStateOf { selectedItemIndex.modSign(itemsCount) }
    }

    /**
     * Selected item index for [infinite] picker.
     *
     * If picker is not [infinite] then [selectedItemIndex] property can be safely used instead
     * */
    @Composable
    fun selectedItemIndex(itemsCount : Int): Int {
        return remember(itemsCount) {
            selectedItemState(itemsCount)
        }.value
    }

    override val canScrollBackward: Boolean
        get() = lazyListState.canScrollBackward

    override val canScrollForward: Boolean
        get() = lazyListState.canScrollForward

    override val isScrollInProgress: Boolean
        get() = lazyListState.isScrollInProgress

    override fun dispatchRawDelta(delta: Float): Float {
        return lazyListState.dispatchRawDelta(delta)
    }

    override suspend fun scroll(
        scrollPriority: MutatePriority,
        block: suspend ScrollScope.() -> Unit
    ) {
        changedProgrammatically = true
        lazyListState.scroll(scrollPriority, block)
    }


    /**
     * The object of [LazyListLayoutInfo] calculated during the last layout pass. For example,
     * you can use it to calculate what items are currently visible.
     *
     * Note that this property is observable and is updated after every scroll or remeasure.
     * If you use it in the composable function it will be recomposed on every change causing
     * potential performance issues including infinity recomposition loop.
     * Therefore, avoid using it in the composition.
     *
     * If you want to run some side effects like sending an analytics event or updating a state
     * based on this value consider using "snapshotFlow":
     */
    val layoutInfo: LazyListLayoutInfo get() = lazyListState.layoutInfo

    /**
     * [InteractionSource] that will be used to dispatch drag events when this
     * list is being dragged. If you want to know whether the fling (or animated scroll) is in
     * progress, use [isScrollInProgress].
     */
    val interactionSource: InteractionSource get() = lazyListState.interactionSource

    /**
     * Instantly selects the item with given [index]
     */
    suspend fun scrollToItem(index: Int) {
        lazyListState.scrollToItem(if (infinite) INFINITE_OFFSET + index else index)
    }

    /**
     * Animate (smooth scroll) to the item with given [index].
     */
    suspend fun animateScrollToItem(index: Int) =
        lazyListState.animateScrollToItem(index)

    companion object {
        fun Saver(): Saver<CupertinoPickerState, *> = Saver(
            save = { listOf(it.infinite, it.selectedItemIndex) },
            restore = {
                CupertinoPickerState(
                    infinite = it[0] as Boolean,
                    initiallySelectedItemIndex = it[1] as Int
                )
            }
        )
    }
}

@Composable
@ExperimentalCupertinoApi
fun rememberCupertinoPickerState(
    infinite: Boolean = true,
    initiallySelectedItemIndex: Int = 0
) : CupertinoPickerState {
    return rememberSaveable(
        initiallySelectedItemIndex,
        saver = CupertinoPickerState.Saver()
    ) {
        CupertinoPickerState(
            infinite = infinite,
            initiallySelectedItemIndex = initiallySelectedItemIndex
        )
    }
}

typealias CupertinoPickerIndicator = DrawScope.(itemHeight : Float) -> Unit

/**
 * Cupertino wheel item picker
 *
 * @param state picker state. Shoult be created using [rememberCupertinoPickerState]
 * @param items items to pick from.
 * @param height picker height.
 * @param modifier modifier applied to picker root.
 * @param indicator picker indicator. Defaults to [CupertinoPickerDefaults.indicator].
 * Also [CupertinoPickerDefaults.indicatorOld] from older iOS can be used
 * @param containerColor picker background color. Also used for foreground blend.
 * @param key optional lazy list key for item.
 * @param content item content. All items should have the same height
 * */
@OptIn(InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
fun <T : Any> CupertinoWheelPicker(
    state: CupertinoPickerState,
    items: List<T>,
    height: Dp = CupertinoPickerDefaults.Height,
    modifier: Modifier = Modifier,
    indicator: CupertinoPickerIndicator = CupertinoPickerDefaults.indicator(),
    containerColor: Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
    textStyle: TextStyle = CupertinoPickerDefaults.textStyle,
    key: ((T) -> Any)? = null,
    withRotation: Boolean = false,
    rotationTransformOrigin: TransformOrigin = TransformOrigin.Center,
    enabled : Boolean = true,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    content: @Composable (T) -> Unit
) {

    val paddingValues = with(LocalDensity.current) {
        remember(height, state.selectedItemHeight) {
            PaddingValues(vertical = ((height.toPx() - state.selectedItemHeight) / 2).toDp())
        }
    }

    val haptic = LocalHapticFeedback.current

    var isInitial by remember {
        mutableStateOf(true)
    }


    LaunchedEffect(0) {
        delay(100)
        isInitial = false
    }

    LaunchedEffect(state.selectedItemIndex(items.size)) {
        if (!isInitial && !state.changedProgrammatically) {
            haptic.performHapticFeedback(CupertinoHapticFeedback.SelectionChanged)
//            soundLauncher.play()
        }
        state.changedProgrammatically = false
    }

    LaunchedEffect(state.isScrollInProgress) {
        if (!state.isScrollInProgress) {
            state.scrollToItem(state.selectedItemIndex.modSign(items.size))
        }
    }

    val scope = rememberCoroutineScope()

    CompositionLocalProvider(
        LocalContentColor provides CupertinoTheme.colorScheme
            .label.copy(alpha = .75f),
        //native picker doesn't scale with font
        LocalDensity provides Density(LocalDensity.current.density, 1f)
    ) {
        ProvideTextStyle(textStyle) {
            LazyColumn(
                modifier = modifier
                    .requiredHeight(height)
                    .background(containerColor)
                    .cupertinoPickerForeground(
                        state = state,
                        containerColor = containerColor,
                    )
                    .cupertinoPickerIndicator(state, indicator),
                state = state.lazyListState,
                contentPadding = paddingValues,
                userScrollEnabled = enabled,
                horizontalAlignment = horizontalAlignment,
                flingBehavior = rememberSnapFlingBehavior(state.lazyListState)
            ) {

                fun index(index: Int) =
                    if (state.infinite)
                        ((index - INFINITE_OFFSET) % items.size).let {
                            if (it >= 0) it else items.size - abs(it)
                        }
                    else index

                items(
                    count = if (state.infinite)
                        Int.MAX_VALUE
                    else items.size,
                    key = key?.run { { invoke(items[index(it)]) } }
                ) { index ->
                    Box(
                        modifier = Modifier
                            .heightIn(min = MinItemHeight)
                            .graphicsLayer {
                                if (withRotation) {

                                    rotationX =
                                        (15f * ((index - if (state.infinite) INFINITE_OFFSET else 0) -
                                                state.selectedItemIndex)).coerceIn(-60f, 60f)
                                    transformOrigin = rotationTransformOrigin

//                            cameraDistance += abs(rotationX)/15
                                    //TODO: compose doesn't support Z translation
                                }
                            }
                            .pointerInput(0) {
                                detectTapGestures {
                                    scope.launch {
                                        state.animateScrollToItem(index)
                                    }
                                }
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        content(items[index(index)])
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalCupertinoApi::class)
@Composable
private fun Modifier.cupertinoPickerForeground(
    state: CupertinoPickerState,
    containerColor: Color,
) : Modifier {
    val halfTransparentContainerColor = remember(containerColor) {
        containerColor.copy(alpha = .5f)
    }

    val transparentContainerColor = remember(containerColor) {
        containerColor.copy(alpha = 0f)
    }


    return drawWithContent {
        drawContent()

        val itemHeight = state.selectedItemHeight

        val height = (size.height - itemHeight) / 2

        drawRect(
            topLeft = Offset.Zero,
            size = size.copy(height = height),
            brush = Brush.verticalGradient(
                0f to containerColor,
                .05f to containerColor,
                .25f to halfTransparentContainerColor,
                1f to transparentContainerColor
            )
        )
        drawRect(
            topLeft = Offset(0f, height + itemHeight),
            size = size.copy(height = height),
            brush = Brush.verticalGradient(
                0f to transparentContainerColor,
                .75f to halfTransparentContainerColor,
                .95f to containerColor,
                1f to containerColor,
            )
        )
    }
}

@ExperimentalCupertinoApi
fun Modifier.cupertinoPickerIndicator(
    state : CupertinoPickerState,
    indicator : CupertinoPickerIndicator
) = drawWithContent {
    drawContent()
    translate(0f, (size.height - state.selectedItemHeight) / 2) {
        indicator(state.selectedItemHeight.toFloat())
    }
}

@Immutable
object CupertinoPickerDefaults {

    val Height = 220.dp

    val textStyle : TextStyle
        @Composable
        get() =  CupertinoTheme.typography.title2.copy(
            letterSpacing = (-1).sp,
        )

    /**
     * 2 horizontal separators like in old iOS version
     * */
    @Composable
    fun indicatorOld(
        color : Color = CupertinoTheme.colorScheme.separator,
    ) : DrawScope.(itemHeight: Float) -> Unit {
        return {
            drawLine(
                color = color,
                start = Offset(0f, 0f),
                end = Offset(size.width, 0f)
            )

            drawLine(
                color = color,
                start = Offset(0f, it),
                end = Offset(size.width, it)
            )
        }
    }

    /**
     * Rounded rect like in new iOS version
     * */
    @Composable
    fun indicator(
        color : Color = CupertinoPickerTokens.IndicatorColor,
        shape: Shape = CupertinoPickerTokens.IndicatorShape,
        paddingValues: PaddingValues = CupertinoPickerTokens.IndicatorPaddingValues
    ) : CupertinoPickerIndicator {
        return {

            val startPadding = paddingValues.calculateStartPadding(layoutDirection).toPx()
            val endPadding = paddingValues.calculateEndPadding(layoutDirection).toPx()

            val size = Size(size.width - startPadding - endPadding, it)

            translate(left = startPadding) {
                drawOutline(
                    shape.createOutline(size, layoutDirection, this),
                    color = color,
                )
            }
        }
    }
}

internal object CupertinoPickerTokens {

    val IndicatorColor : Color
        @Composable get() = CupertinoTheme.colorScheme.label.copy(alpha = .05f)

    val IndicatorPaddingValues : PaddingValues = PaddingValues(
        horizontal = 10.dp
    )

    val IndicatorShape : CornerBasedShape
        @Composable get() = CupertinoTheme.shapes.small
}

internal val PickerMaxWidth = 500.dp
private val MinItemHeight = 32.dp
private const val INFINITE_OFFSET = Int.MAX_VALUE/2