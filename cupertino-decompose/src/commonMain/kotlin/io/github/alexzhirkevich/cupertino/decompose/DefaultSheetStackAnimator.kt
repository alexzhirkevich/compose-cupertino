package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.animation.core.AnimationState
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.animateTo
import androidx.compose.animation.core.isFinished
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

internal class DefaultSheetStackAnimator(
    private val animationSpec: FiniteAnimationSpec<Float> = tween(),
    private val frame: @Composable (factor: Float, direction: TriDirection, content: @Composable (Modifier) -> Unit) -> Unit
) : SheetStackAnimator {

    @Composable
    override operator fun invoke(
        direction: TriDirection,
        isInitial: Boolean,
        onFinished: () -> Unit,
        content: @Composable (Modifier) -> Unit,
    ) {
        val animationState = remember(direction, isInitial) { AnimationState(initialValue = if (isInitial) 0F else 1F) }

        LaunchedEffect(animationState) {
            animationState.animateTo(
                targetValue = 0F,
                animationSpec = animationSpec,
                sequentialAnimation = !animationState.isFinished,
            )

            onFinished()
        }

        val factor =
            when (direction) {
                TriDirection.ENTER_FRONT -> animationState.value
                TriDirection.EXIT_FRONT -> 1F - animationState.value
                TriDirection.ENTER_BACK -> -animationState.value
                TriDirection.EXIT_BACK -> animationState.value - 1F
                TriDirection.ENTER_BACK_SECOND -> -animationState.value
                TriDirection.EXIT_BACK_SECOND -> animationState.value - 1F
            }

        frame(factor, direction, content)
    }
}