package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.overscroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.swipebox.CupertinoHorizontalOverscrollEffect
import io.github.alexzhirkevich.cupertino.swipebox.SwipeBoxStates
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.White
import io.github.alexzhirkevich.cupertino.theme.systemBlue
import kotlin.math.roundToInt

enum class SimpleSwipeBoxStates {
    Resting,
    Visible,
    FullyExpanded,
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SimpleCupertinoSwipeBox(
    icon: ImageVector,
    scrollableState: ScrollableState,
    content: @Composable BoxScope.() -> Unit
) {
    val density = LocalDensity.current
    var parentWidth by remember { mutableStateOf(0) }

    val swipeBoxState = remember {
        AnchoredDraggableState(
            initialValue = SimpleSwipeBoxStates.Resting,
            snapAnimationSpec = SpringSpec(
                stiffness = Spring.StiffnessMedium,
            ),
            decayAnimationSpec = splineBasedDecay(density),
            positionalThreshold = { distance -> distance * 0.5f },
            velocityThreshold = {
                density.run { Float.POSITIVE_INFINITY.dp.toPx() }
            }
        )
    }

    val swipeBoxOffset = with(density) { 84.dp.toPx() }
    val hapticFeedback = LocalHapticFeedback.current

    // State to track if anchors have been initialized
    var anchorsInitialized by remember { mutableStateOf(false) }
    var hasTriggeredHapticFeedback by remember { mutableStateOf(false) }

    val overscrollEffect = CupertinoHorizontalOverscrollEffect(
        density.density,
        layoutDirection = LocalLayoutDirection.current
    )

    LaunchedEffect(parentWidth) {
        if (parentWidth > 0) {
            val swipeBoxFullyExpandedOffset = parentWidth * 0.5f
            val anchors = DraggableAnchors {
                SimpleSwipeBoxStates.Resting at 0f
                SimpleSwipeBoxStates.Visible at swipeBoxOffset
                SimpleSwipeBoxStates.FullyExpanded at swipeBoxFullyExpandedOffset
            }
            swipeBoxState.updateAnchors(anchors)
            anchorsInitialized = true
        }
    }

    LaunchedEffect(swipeBoxState.currentValue, swipeBoxState.targetValue) {
        // Trigger haptic feedback when reaching the fully expanded state
        if (swipeBoxState.targetValue == SimpleSwipeBoxStates.FullyExpanded &&
            !hasTriggeredHapticFeedback
        ) {
            hapticFeedback.performHapticFeedback(HapticFeedbackType(3001))
            hasTriggeredHapticFeedback = true
        }

        // Reset the flag if swiping back to a non-expanded state
        if (swipeBoxState.targetValue != SimpleSwipeBoxStates.FullyExpanded) {
            hasTriggeredHapticFeedback = false
        }
    }

    LaunchedEffect(swipeBoxState.settledValue) {
        if (swipeBoxState.settledValue == SimpleSwipeBoxStates.FullyExpanded) {
            kotlinx.coroutines.delay(10)
            swipeBoxState.animateTo(SimpleSwipeBoxStates.Resting)
        }
    }

    // Use a LaunchedEffect to monitor scroll events and reset the draggable state if needed
    LaunchedEffect(scrollableState) {
        snapshotFlow { scrollableState.isScrollInProgress }
            .collect { isScrolling ->
                if (isScrolling && swipeBoxState.currentValue != SimpleSwipeBoxStates.Resting) {
                    swipeBoxState.animateTo(SimpleSwipeBoxStates.Resting)
                }
            }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .onGloballyPositioned { coordinates ->
                parentWidth = coordinates.size.width
            }
    ) {
        Row(
            modifier = Modifier
                .matchParentSize()
                .background(CupertinoColors.systemBlue)
                .align(Alignment.CenterStart)
                .padding(horizontal = 32.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                CupertinoIcon(
                    imageVector = icon,
                    contentDescription = "Swipe Icon",
                    tint = CupertinoColors.White,
                    modifier = Modifier
                        .requiredSize(20.dp)
                        .align(Alignment.Center)
                )
            }
        }

        if (anchorsInitialized) {
            Box(
                modifier = Modifier
                    .offset { IntOffset(swipeBoxState.requireOffset().roundToInt(), 0) }
                    .anchoredDraggable(
                        state = swipeBoxState,
                        orientation = Orientation.Horizontal,
                        overscrollEffect = overscrollEffect
                    )
                    .overscroll(overscrollEffect)
            ) {
                content()
            }
        }
    }
}