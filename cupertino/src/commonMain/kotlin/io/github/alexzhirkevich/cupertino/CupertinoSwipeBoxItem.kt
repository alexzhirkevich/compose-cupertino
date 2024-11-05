package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.util.fastMapIndexed
import androidx.compose.ui.util.lerp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.swipebox.CupertinoSwipeBoxDefaults
import io.github.alexzhirkevich.cupertino.swipebox.CupertinoSwipeBoxState
import io.github.alexzhirkevich.cupertino.swipebox.CupertinoSwipeBoxValue
import io.github.alexzhirkevich.cupertino.swipebox.SwipeBoxBehavior
import io.github.alexzhirkevich.cupertino.swipebox.SwipeHandle
import io.github.alexzhirkevich.cupertino.swipebox.swipeBoxAnchors
import io.github.alexzhirkevich.cupertino.swipebox.swipeHandle
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.White
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.roundToInt

@ExperimentalCupertinoApi
private val LocalSwipeBoxState = compositionLocalOf<CupertinoSwipeBoxState?> {
    null
}

/**
 * Swipe box that can display multiple actions for list item and perform dismiss operations.
 *
 * @param state swipe box state. See [rememberCupertinoSwipeBoxState]
 * @param items action items. Use [CupertinoSwipeBoxState.dismissDirection] to display start or end items.
 * [CupertinoSwipeBoxItem] should be used as an item.
 * Items are displayed in a row with parallax and bound effect. Display direction for end items is reversed.
 * @param modifier box container modifier.
 * @param restoreOnClick click on foreground part will collapse the box when it is expanded.
 * Any other tap gestures will be consumed.
 * @param handleWidth width of the swipe handle in the [CupertinoSwipeBoxValue.Collapsed] state.
 * When state is expanded or dismissed, swipe can be performed over the whole foreground part.
 * Use [Dp.Unspecified] or [Dp.Infinity] to enable full-box swipe.
 * Tap on item will trigger state collapse.
 * @param itemWidth width of the actions items.
 * @param startToEndBehavior id expansion/dismissal to end is enabled.
 * @param endToStartBehavior id expansion/dismissal to start is enabled.
 * @param content foreground content. Should have a non-transparent background
 *
 * @see CupertinoSwipeBoxItem
 * */
@OptIn(InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBox(
    state: CupertinoSwipeBoxState,
    items: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    restoreOnClick: Boolean = true,
    handleWidth: Dp = Dp.Unspecified,
    itemWidth: Dp = CupertinoSwipeBoxDefaults.ItemWidth,
    startToEndBehavior: SwipeBoxBehavior = SwipeBoxBehavior.Dismissible,
    endToStartBehavior: SwipeBoxBehavior = SwipeBoxBehavior.Dismissible,
    content: @Composable RowScope.() -> Unit,
) {
    var height by remember { mutableStateOf(0) }
    var width by remember { mutableStateOf(0) }
    val coroutineScope = rememberCoroutineScope()
    val isFullBoxSwipe = handleWidth == Dp.Unspecified || handleWidth == Dp.Infinity
    val density = LocalDensity.current

    Box {
        if (state.currentValue == CupertinoSwipeBoxValue.Collapsed) {
            if (!isFullBoxSwipe) {
                SwipeHandle(
                    modifier = Modifier
                        .width(handleWidth)
                        .align(Alignment.CenterStart)
                        .systemGestureExclusion(),
                    state = state,
                    height = height
                )
                SwipeHandle(
                    modifier = Modifier
                        .width(handleWidth)
                        .align(Alignment.CenterEnd)
                        .systemGestureExclusion(),
                    state = state,
                    height = height
                )
            }
        } else {
            if (restoreOnClick) {
                SwipeHandle(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset { IntOffset(x = state.offset.roundToInt(), y = 0) }
                        .clickable(
                            onClick = {
                                if (state.confirmValueChange(CupertinoSwipeBoxValue.Collapsed)) {
                                    coroutineScope.launch {
                                        state.reset()
                                    }
                                }
                            },
                            onClickLabel = "Collapse",
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }
                        ),
                    state = state,
                    height = height
                )
            }
        }

        val isSwipeHandleOnBox by remember(state) {
            derivedStateOf {
                state.currentValue == CupertinoSwipeBoxValue.Collapsed && isFullBoxSwipe ||
                        state.currentValue != CupertinoSwipeBoxValue.Collapsed && !restoreOnClick
            }
        }

        Box(
            modifier = modifier
                .onSizeChanged {
                    height = it.height
                    width = it.width
                }
                .then(if (isSwipeHandleOnBox) Modifier.swipeHandle(state) else Modifier),
            propagateMinConstraints = true
        ) {

            val itemsCountState = remember { mutableStateOf(0) }
            var itemsCount by itemsCountState

            val shouldDismiss by remember(state) {
                derivedStateOf {
                    val canDismiss =
                        state.dismissDirection.isTowardsEnd && startToEndBehavior == SwipeBoxBehavior.Dismissible ||
                                state.dismissDirection.isTowardsStart && endToStartBehavior == SwipeBoxBehavior.Dismissible
                    canDismiss && (abs(state.offset) > (state.dismissThreshold * width))
                }
            }

            SideEffect {
                state.isDismissed = shouldDismiss
            }

            val firstItemWidthFraction by animateFloatAsState(
                targetValue = if (shouldDismiss) 1f else 0f,
                animationSpec = spring(stiffness = Spring.StiffnessMediumLow)
            )

            val haptic = LocalHapticFeedback.current

            DisposableEffect(state) {
                onDispose {
                    state.isDismissed = false
                }
            }

            LaunchedEffect(haptic, state) {
                snapshotFlow { shouldDismiss }
                    .drop(1)
                    .collect {
                        haptic.performHapticFeedback(CupertinoHapticFeedback.ImpactLight)
                    }
            }

            CompositionLocalProvider(LocalSwipeBoxState provides state) {
                SubcomposeLayout(
                    modifier = Modifier.matchParentSize()
                ) { constraints ->

                    val itemsMeasurables = subcompose(null) {
                        items()
                    }
                    itemsCount = itemsMeasurables.size

                    val itemWidthPx = with(density) { itemWidth.toPx() }

                    val absOffset = abs(state.offset)
                    val minWidth = (absOffset / itemsCount).coerceAtLeast(itemWidthPx + 1)
                    val maxWidth = absOffset.coerceAtLeast(itemWidthPx + 1)

                    val placeables = itemsMeasurables.fastMapIndexed { index, it ->

                        val animatedMultiplier = if (index == 0) firstItemWidthFraction else 0f

                        it.measure(
                            constraints.copy(
                                minWidth = itemWidth.roundToPx(),
                                maxWidth = lerp(minWidth, maxWidth, animatedMultiplier).roundToInt()
                            )
                        )
                    }

                    val parallax = ((itemWidth * itemsCount).toPx() - absOffset)
                        .coerceAtLeast(0f)
                        .roundToInt()

                    layout(constraints.maxWidth, constraints.maxHeight) {

                        val isTowardsRight = state.dismissDirection.isTowardsEnd

                        var xPosition = if (isTowardsRight) 0 else constraints.maxWidth

                        placeables.fastForEachIndexed { i, it ->

                            if (!isTowardsRight) {
                                xPosition -= it.width
                            }

                            val parallaxAmount = (parallax / itemsCount) * (i + 1) *
                                    if (isTowardsRight) -1 else 1

                            it.placeRelative(
                                x = xPosition + parallaxAmount,
                                y = 0,
                                zIndex = placeables.size - i.toFloat()
                            )
                            if (state.dismissDirection.isTowardsEnd) {
                                xPosition += it.width
                            }
                        }
                    }
                }
            }
            Row(
                content = content,
                modifier = Modifier.swipeBoxAnchors(
                    state = state,
                    startToEnd = startToEndBehavior,
                    endToStart = endToStartBehavior,
                    itemWidth = itemWidth,
                    count = itemsCountState
                )
            )
        }
    }
}

/**
 * Item for the [CupertinoSwipeBox]
 *
 * @param color item container color
 * @param onClick item click handler
 * @param modifier item modifier
 * @param enabled if item can be clicked
 * @param onClickLabel semantic / accessibility label for the onClick action
 * @param icon item icon
 * @param label item label
 *
 * @see CupertinoSwipeBox
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBoxItem(
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: @Composable () -> Unit,
    label: @Composable () -> Unit
) {
    CupertinoSwipeBoxItem(
        color = color,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        onClickLabel = onClickLabel,
        interactionSource = interactionSource,
        content = {
            Box(
                modifier = Modifier.weight(.6f),
                contentAlignment = BiasAlignment(
                    horizontalBias = 0f,
                    verticalBias = .5f
                )
            ) {
                icon()
            }
            Box(
                modifier = Modifier.weight(.4f),
                contentAlignment = Alignment.TopCenter
            ) {
                label()
            }
        }
    )
}

/**
 * Item for the [CupertinoSwipeBox]
 *
 * @param color item container color
 * @param onClick item click handler
 * @param modifier item modifier
 * @param enabled if item can be clicked
 * @param onClickLabel semantic / accessibility label for the onClick action
 * @param content item content
 *
 * @see CupertinoSwipeBox
 */
@Composable
@ExperimentalCupertinoApi
fun CupertinoSwipeBoxItem(
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClickLabel: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable ColumnScope.() -> Unit
) {
    CompositionLocalProvider(
        LocalContentColor provides CupertinoColors.White
    ) {

        val state = LocalSwipeBoxState.current

        val animHorizBias by animateFloatAsState(
            when {
                state == null -> 0f
                state.isDismissed && state.dismissDirection.isTowardsEnd -> 1f
                state.isDismissed && state.dismissDirection.isTowardsStart -> -1f
                else -> 0f
            },
            animationSpec = state?.animationSpec ?: spring()
        )

        ProvideTextStyle(CupertinoTheme.typography.footnote) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color)
                    .clickable(
                        onClick = onClick,
                        enabled = enabled,
                        role = Role.Button,
                        onClickLabel = onClickLabel,
                        interactionSource = interactionSource,
                        indication = LocalIndication.current
                    )
                    .padding(horizontal = 8.dp)
                    .then(modifier),
                contentAlignment = BiasAlignment(
                    verticalBias = 0f,
                    horizontalBias = animHorizBias
                )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    content = content
                )
            }
        }
    }
}