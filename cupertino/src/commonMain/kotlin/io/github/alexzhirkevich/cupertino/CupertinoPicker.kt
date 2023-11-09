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

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListLayoutInfo
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFirstOrNull
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.math.abs

@OptIn(ExperimentalFoundationApi::class)
@Stable
@ExperimentalCupertinoApi
class CupertinoPickerState(
    internal val initiallySelectedItemIndex : Int = 0,
    internal val itemHeight : Dp = 24.dp
) : ScrollableState {

    internal val lazyListState: LazyListState = LazyListState(
        firstVisibleItemIndex = initiallySelectedItemIndex
    )

    internal val selectedItemHeight: Int
        get() = selectedItem?.size ?: 0

    private val selectedItem by derivedStateOf {
        with(layoutInfo) {
            visibleItemsInfo.fastFirstOrNull {
                it.offset + it.size - viewportStartOffset > viewportSize.height / 2
            }
        }
    }

    val selectedItemIndex: Int
        get() = selectedItem?.index ?: 0

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
    ) = lazyListState.scroll(scrollPriority, block)


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
    suspend fun scrollToItem(index: Int) =
        lazyListState.scrollToItem(index)

    /**
     * Animate (smooth scroll) to the item with given [index].
     */
    suspend fun animateScrollToItem(index: Int) =
        lazyListState.animateScrollToItem(index)

    companion object {
        fun Saver(): Saver<CupertinoPickerState, *> = Saver(
            save = { it.selectedItemIndex },
            restore = {
                CupertinoPickerState(initiallySelectedItemIndex = it)
            }
        )
    }
}

@Composable
@ExperimentalCupertinoApi
fun rememberCupertinoPickerState(initiallySelectedItemIndex: Int = 0) : CupertinoPickerState {
    return rememberSaveable(
        initiallySelectedItemIndex,
        saver = CupertinoPickerState.Saver()
    ) {
        CupertinoPickerState(
            initiallySelectedItemIndex = initiallySelectedItemIndex
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
@ExperimentalCupertinoApi
fun <T : Any> CupertinoPicker(
    height : Dp = CupertinoPickerDefaults.Height,
    modifier : Modifier = Modifier,
    state : CupertinoPickerState,
    containerColor : Color = LocalContainerColor.current.takeOrElse {
        CupertinoTheme.colorScheme.secondarySystemGroupedBackground
    },
    dividerColor : Color = CupertinoTheme.colorScheme.separator,
    items : List<T>,
    key : ((T) -> Any)? = null,
    withRotation : Boolean = true,
    rotationTransformOrigin: TransformOrigin = TransformOrigin.Center,
    content : @Composable (T) -> Unit
) {

    val itemHeight = state.selectedItemHeight

    val paddingValues = with(LocalDensity.current) {
        remember(height, itemHeight) {
            PaddingValues(vertical = ((height.toPx() - itemHeight) / 2).toDp())
        }
    }

    val transparentContainerColor = remember(containerColor) {
        containerColor.copy(alpha = 0f)
    }

    LazyColumn(
        state = state.lazyListState,
        contentPadding = paddingValues,
        modifier = modifier
            .requiredHeight(height)
            .background(containerColor)
            .drawWithContent {
                drawContent()

                val _height = (size.height - itemHeight) / 2

                drawRect(
                    topLeft = Offset.Zero,
                    size = size.copy(height = _height),
                    brush = Brush.verticalGradient(
                        0f to containerColor,
                        1f to transparentContainerColor
                    )
                )
                drawRect(
                    topLeft = Offset(0f, _height + itemHeight),
                    size = size.copy(height = _height),
                    brush = Brush.verticalGradient(
                        0f to transparentContainerColor,
                        1f to containerColor,
                    )
                )

                drawLine(
                    color = dividerColor,
                    start = Offset(0f, _height),
                    end = Offset(size.width, _height)
                )

                drawLine(
                    color = dividerColor,
                    start = Offset(0f, _height + itemHeight),
                    end = Offset(size.width, _height + itemHeight)
                )
            },
        horizontalAlignment = Alignment.CenterHorizontally,
        flingBehavior = rememberSnapFlingBehavior(state.lazyListState)
    ) {

        items(
            count = items.size,
            key = key?.run { { invoke(items[it]) } }
        ) { index ->
            Box(
                modifier = Modifier
                    .height(state.itemHeight)
                    .graphicsLayer {
                        if (withRotation) {
                            rotationX = (20f * (index - state.selectedItemIndex)).coerceIn(-45f, 45f)
//                            scaleX = 1f -  abs(index - selected)/visibleCnt.toFloat()
//                            scaleY = scaleX
                            transformOrigin = rotationTransformOrigin
                        }
                    }
            ) {
                content(items[index])
            }
        }
    }
}

object CupertinoPickerDefaults {
    val Height = 175.dp
}
