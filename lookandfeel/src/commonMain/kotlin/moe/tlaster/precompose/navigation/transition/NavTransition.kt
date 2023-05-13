package moe.tlaster.precompose.navigation.transition

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut

/**
 * Create a navigation transition
 */
interface NavTransition {
    /**
     * Transition the scene that about to appear for the first time, similar to activity onCreate
     */
    val createTransition: EnterTransition

    /**
     * Transition the scene that about to disappear forever, similar to activity onDestroy
     */
    val destroyTransition: ExitTransition

    /**
     * Transition the scene that will be pushed into back stack, similar to activity onPause
     * Have no effect for floating/dialog route
     */
    val pauseTransition: ExitTransition

    /**
     * Transition the scene that about to show from the back stack, similar to activity onResume
     * Have no effect for floating/dialog route
     */
    val resumeTransition: EnterTransition

    /**
     * This describes the zIndex of the new target content as it enters the container. It defaults
     * to 0f. Content with higher zIndex will be drawn over lower `zIndex`ed content. Among
     * content with the same index, the target content will be placed on top.
     */
    val enterTargetContentZIndex: Float get() = 0f

    /**
     * This describes the zIndex of the target content as it exists the container. It defaults
     * to 0f. Content with higher zIndex will be drawn over lower `zIndex`ed content.
     */
    val exitTargetContentZIndex: Float get() = 0f
}

@OptIn(ExperimentalAnimationApi::class)
fun NavTransition(
    createTransition: EnterTransition = fadeIn() + scaleIn(initialScale = 0.9f),
    destroyTransition: ExitTransition = fadeOut() + scaleOut(targetScale = 0.9f),
    pauseTransition: ExitTransition = fadeOut() + scaleOut(targetScale = 1.1f),
    resumeTransition: EnterTransition = fadeIn() + scaleIn(initialScale = 1.1f),
    enterTargetContentZIndex: Float = 0f,
    exitTargetContentZIndex: Float = 0f,
) = object : NavTransition {
    override val createTransition: EnterTransition = createTransition
    override val destroyTransition: ExitTransition = destroyTransition
    override val pauseTransition: ExitTransition = pauseTransition
    override val resumeTransition: EnterTransition = resumeTransition
    override val enterTargetContentZIndex: Float = enterTargetContentZIndex
    override val exitTargetContentZIndex: Float = exitTargetContentZIndex
}
