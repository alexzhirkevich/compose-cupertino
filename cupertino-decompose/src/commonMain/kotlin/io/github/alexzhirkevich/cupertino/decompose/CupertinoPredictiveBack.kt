package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.tween
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.Direction
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimator
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveBackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimator
import com.arkivanov.essenty.backhandler.BackHandler

/**
 * Default easing of iOS system animations
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/camediatimingfunctionname/1521854-default">Apple Developer</a>
 * */
val CupertinoDefaultEasing = CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f)


fun cupertinoStackAnimator(
    animationSpec: FiniteAnimationSpec<Float> = tween(
        easing = CupertinoDefaultEasing,
        durationMillis = 400
    )
) : StackAnimator = stackAnimator(
    animationSpec = animationSpec,
) { factor, direction, content ->
    content(
        Modifier.graphicsLayer {
            translationX = size.width * when (direction) {
                Direction.ENTER_FRONT,
                Direction.EXIT_FRONT -> factor

                else -> factor * SlideFactor
            }
        }
    )
}

fun Modifier.cupertinoPredictiveEnterModifier(progress: () -> Float) : Modifier =
    graphicsLayer {
        translationX = (progress() - 1f) * SlideFactor * size.width
    }.drawWithContent {
        drawContent()
        drawRect(Color.Black, alpha = ((1f - progress()) * SlideFactor).coerceIn(0f,1f))
    }

fun Modifier.cupertinoPredictiveExitModifier(progress: () -> Float) : Modifier =
    graphicsLayer {
        translationX = progress() * size.width
    }


private const val SlideFactor =.25f
