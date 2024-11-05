package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import io.github.alexzhirkevich.cupertino.swipebox.CupertinoSwipeBoxDefaults
import io.github.alexzhirkevich.cupertino.swipebox.CupertinoSwipeBoxState
import io.github.alexzhirkevich.cupertino.swipebox.CupertinoSwipeBoxValue
import io.github.alexzhirkevich.cupertino.swipebox.SharedSwipeBoxController
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch


/**
 * Should be together with [CupertinoSwipeBoxState.dismissDirection] to detect dismiss direction
 * towards end and display start items
 * */
@ExperimentalCupertinoApi
val CupertinoSwipeBoxValue.isTowardsEnd : Boolean
    get() = this == CupertinoSwipeBoxValue.ExpandedToEnd
            || this == CupertinoSwipeBoxValue.DismissedToEnd

/**
 * Should be together with [CupertinoSwipeBoxState.dismissDirection] to detect dismiss direction
 * towards start and display end items
 * */
@ExperimentalCupertinoApi
val CupertinoSwipeBoxValue.isTowardsStart : Boolean
    get() = this == CupertinoSwipeBoxValue.ExpandedToStart
            || this == CupertinoSwipeBoxValue.DismissedToStart

@ExperimentalCupertinoApi
val CupertinoSwipeBoxState.isActive: Boolean
    get() = offset != 0f && !offset.isNaN()


@ExperimentalCupertinoApi
private val GlobalSwipeBoxController by lazy {
    SharedSwipeBoxController()
}

@ExperimentalCupertinoApi
val EmptySwipeBoxState by lazy {
    CupertinoSwipeBoxState(
        density = Density(1f, 1f),
        initialValue = CupertinoSwipeBoxValue.Collapsed
    )
}


/**
 * Remember [CupertinoSwipeBoxState] with [initialValue].
 * Use [dismissThreshold] to setup offset fractions that will be considered dismissed.
 * Use [confirmValueChange] to block value changes or react on dismisses
 * Dismiss will be performed with [animationSpec]
 *
 * [sharedController] is used to keep only one swipe box expanded. It will be collapsed only if
 * [confirmValueChange] will return true. Global controller is used by default keeping only single
 * instance of [CupertinoSwipeBoxState] expanded among the whole app.
 * You can use null to disable this behavior or use custom [SharedSwipeBoxController]
 *
 * Use [scrollableState] parameter to collapse this state when scrolling is started. It will be
 * collapsed only if [confirmValueChange] will return true
 * */
@Composable
@ExperimentalCupertinoApi
@Stable
fun rememberCupertinoSwipeBoxState(
    initialValue: CupertinoSwipeBoxValue = CupertinoSwipeBoxValue.Collapsed,
    sharedController : SharedSwipeBoxController? = GlobalSwipeBoxController,
    scrollableState: ScrollableState? = null,
    dismissThreshold: Float = CupertinoSwipeBoxDefaults.DismissThreshold,
    animationSpec : FiniteAnimationSpec<Float> = CupertinoSwipeBoxDefaults.AnimationSpec,
    confirmValueChange: (CupertinoSwipeBoxValue) -> Boolean = { true },
) : CupertinoSwipeBoxState {

    val density = LocalDensity.current

    val state = rememberSaveable(
        saver = CupertinoSwipeBoxState.Saver(
            dismissThreshold = dismissThreshold,
            animationSpec = animationSpec,
            confirmValueChange = confirmValueChange,
            density = density,
        )
    ) {
        CupertinoSwipeBoxState(
            density = density,
            initialValue = initialValue,
            animationSpec = animationSpec,
            dismissThreshold = dismissThreshold,
            confirmValueChange = confirmValueChange,
        )
    }

    if (sharedController != null) {
        LaunchedEffect(state) {
            sharedController.expanded
                .filter { it !== state }
                .collectLatest {
                    state.animateTo(CupertinoSwipeBoxValue.Collapsed)
                }
        }

        LaunchedEffect(state.offset) {
            if (state.offset != 0f && !state.offset.isNaN()) {
                sharedController.expanded.emit(state)
            }
        }
    }

    if (scrollableState != null) {
        LaunchedEffect(scrollableState) {
            snapshotFlow { state.isActive }
                .filter { it }
                .collectLatest {
                    sharedController?.expanded?.emit(state)
                }
        }
    }

    return state
}


