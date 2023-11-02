
package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollScope
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

@Stable
class CupertinoPickerState(
    internal val initiallySelectedItemIndex : Int = 0
) : ScrollableState {

    internal val lazyListState: LazyListState = LazyListState()

    internal val selectedItemHeight: Int by derivedStateOf {
        layoutInfo.visibleItemsInfo.firstOrNull {
            it.index == selectedItemIndex
        }?.size ?: 0
    }

    val selectedItemIndex: Int
        get() = with(layoutInfo) {
            visibleItemsInfo.firstOrNull {
                it.offset + it.size - viewportStartOffset > viewportSize.height / 2
            }?.index ?: initiallySelectedItemIndex
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

    private var initialized : Boolean = false

    private val mutex = Mutex()

    /**
     * Instantly selects the item with given [index]
     */
    suspend fun scrollToItem(index: Int) {
        lazyListState.scrollToItem(
            index = index,
            scrollOffset = lazyListState.layoutInfo.viewportStartOffset +
                    lazyListState.layoutInfo.viewportSize.height / 2 -
                    if (initialized) selectedItemHeight / 2 else 0 // TODO: figure out why initial scroll works differently
        )
    }

    suspend fun initialize(){
        mutex.withLock {
            if (!initialized){
                scrollToItem(initiallySelectedItemIndex)
                initialized = true
            }
        }
    }

    /**
     * Animate (smooth scroll) to the item with given [index].
     */
    suspend fun animateScrollToItem(index: Int) {
        lazyListState.animateScrollToItem(
            index = index,
            scrollOffset = lazyListState.layoutInfo.viewportStartOffset +
                    lazyListState.layoutInfo.viewportSize.height / 2
        )
    }

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
fun <T : Any> CupertinoPicker(
    height : Dp = CupertinoPickerDefaults.Height,
    modifier : Modifier = Modifier
        .requiredHeight(height),
    state : CupertinoPickerState,
    containerColor : Color = CupertinoTheme.colorScheme.systemBackground,
    dividerColor : Color = CupertinoTheme.colorScheme.separator,
    items : List<T>,
    key : ((T) -> Any)? = null,
    withRotation : Boolean = false,
    rotationTransformOrigin: TransformOrigin = TransformOrigin.Center,
    content : @Composable (T) -> Unit
) {

    LaunchedEffect(state) {
        state.initialize()
    }

    val itemHeight = state.selectedItemHeight

    val paddingValues = with(LocalDensity.current) {
        remember(height, itemHeight) {
            PaddingValues(vertical = ((height.toPx() - itemHeight) / 2).toDp())
        }
    }

    LazyColumn(
        state = state.lazyListState,
        contentPadding = paddingValues,
        modifier = modifier
            .background(containerColor)
            .drawWithContent {
                drawContent()

                val _height = (size.height - itemHeight) / 2

                drawRect(
                    topLeft = Offset.Zero,
                    size = size.copy(height = _height),
                    brush = Brush.verticalGradient(
                        0f to containerColor,
                        1f to containerColor.copy(alpha = 0f)
                    )
                )
                drawRect(
                    topLeft = Offset(0f, _height + itemHeight),
                    size = size.copy(height = _height),
                    brush = Brush.verticalGradient(
                        0f to containerColor.copy(alpha = 0f),
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
                    .graphicsLayer {
                        if (withRotation) {
                            val visibleCnt = state.layoutInfo.visibleItemsInfo.size

                            val selected = state.selectedItemIndex

                            rotationX = (150f / visibleCnt * (index - selected)).coerceIn(-60f, 60f)
//                            cameraDistance = 30f * abs(index - selected)
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
