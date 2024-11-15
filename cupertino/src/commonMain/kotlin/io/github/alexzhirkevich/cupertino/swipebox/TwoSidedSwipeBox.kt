@file:OptIn(ExperimentalFoundationApi::class)

package io.github.alexzhirkevich.cupertino.swipebox


import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.InternalCupertinoApi
import io.github.alexzhirkevich.cupertino.LocalContainerColor
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.White
import io.github.alexzhirkevich.cupertino.theme.systemBlue
import io.github.alexzhirkevich.cupertino.theme.systemRed
import kotlin.math.roundToInt

enum class SwipeBoxStates {
    Resting,
    EndVisible,
    StartVisible,
    EndFullyExpanded,
    StartFullyExpanded,
}

@OptIn(ExperimentalFoundationApi::class, InternalCupertinoApi::class)
@Composable
fun TwoSidedSwipeBox(
    height: Dp = 72.dp,
    startIcon: ImageVector? = null,
    fullExpansionStart: Boolean = true,
    endIcon: ImageVector? = null,
    fullExpansionEnd: Boolean = true,
    scrollableState: ScrollableState,
    content: @Composable BoxScope.() -> Unit
) {
    val density = LocalDensity.current
    var parentWidth by remember { mutableStateOf(0) }
    val isEndActionItemSupplied = endIcon != null
    val isStartActionItemSupplied = startIcon != null

    val swipeBoxState = remember {
        AnchoredDraggableState(
            initialValue = SwipeBoxStates.Resting,
            snapAnimationSpec = SpringSpec(
                stiffness = Spring.StiffnessMedium,
                dampingRatio = Spring.DampingRatioLowBouncy
            ),
            decayAnimationSpec = splineBasedDecay(density),
            positionalThreshold = { distance -> distance * 0.5f },
            velocityThreshold = { Float.POSITIVE_INFINITY }
        )
    }

    val hapticFeedback = LocalHapticFeedback.current
    var hasTriggeredHapticFeedback by remember { mutableStateOf(false) }
    var anchorsInitialized by remember { mutableStateOf(false) }

    AnchorsEffect(
        parentWidth = parentWidth,
        isEndActionItemSupplied = isEndActionItemSupplied,
        fullExpansionStart = fullExpansionStart,
        fullExpansionEnd = fullExpansionEnd,
        isStartActionItemSupplied =  isStartActionItemSupplied,
        swipeBoxState = swipeBoxState,
        density = density
    ) { anchorsInitialized = it }

    HapticFeedbackEffect(
        fullExpansionStart = fullExpansionStart,
        fullExpansionEnd = fullExpansionEnd,
        swipeBoxState = swipeBoxState,
        hapticFeedback = hapticFeedback,
        hasTriggeredHapticFeedback = hasTriggeredHapticFeedback
    ) { hasTriggeredHapticFeedback = it }

    ScrollEffect(
        scrollableState = scrollableState,
        swipeBoxState = swipeBoxState
    )

    DismissFullyExpandedEffect(
        swipeBoxState = swipeBoxState,
        isStartActionItemSupplied = isStartActionItemSupplied,
        fullExpansionStart = fullExpansionStart,
        isEndActionItemSupplied = isEndActionItemSupplied,
        fullExpansionEnd = fullExpansionEnd,
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .onGloballyPositioned { coordinates ->
                parentWidth = coordinates.size.width
            }
    ) {
        val offset = if (anchorsInitialized) swipeBoxState.offset else 0f

        if (offset > 0 && isStartActionItemSupplied) {
            Box(
                modifier = Modifier
                    .height(height)
                    .width(with(density) { offset.toDp() })
                    .align(Alignment.CenterStart)
                    .background(CupertinoColors.systemBlue)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CupertinoIcon(
                        imageVector = startIcon!!,
                        contentDescription = "Right Swipe Action",
                        tint = CupertinoColors.White,
                        modifier = Modifier.requiredSize(20.dp)
                    )
                }
            }
        }

        if (offset < 0 && isEndActionItemSupplied) {
            Box(
                modifier = Modifier
                    .height(height)
                    .width(with(density) { -offset.toDp() })
                    .align(Alignment.CenterEnd)
                    .background(CupertinoColors.systemRed)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    CupertinoIcon(
                        imageVector = endIcon!!,
                        contentDescription = "Left Swipe Action",
                        tint = CupertinoColors.White,
                        modifier = Modifier.requiredSize(20.dp)
                    )
                }
            }
        }

        if (anchorsInitialized) {
            Box(
                modifier = Modifier
                    .offset { IntOffset(swipeBoxState.requireOffset().roundToInt(), 0) }
                    .anchoredDraggable(
                        state = swipeBoxState,
                        orientation = Orientation.Horizontal
                    )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(height)
                        .background(LocalContainerColor.current)
                        .padding(
                            start = CupertinoSectionDefaults.PaddingValues
                                .calculateStartPadding(LocalLayoutDirection.current)
                        )
                ) {
                    content()
                }
            }
        }
    }
}