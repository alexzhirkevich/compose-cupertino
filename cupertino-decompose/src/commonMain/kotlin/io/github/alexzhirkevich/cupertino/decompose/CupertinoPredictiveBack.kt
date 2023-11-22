package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.Direction
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimator
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.predictiveBackAnimatable
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.predictiveBackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimator
import com.arkivanov.essenty.backhandler.BackHandler
import io.github.alexzhirkevich.cupertinoTween

@ExperimentalDecomposeApi
fun <C : Any,T : Any> cupertinoPredictiveBackAnimation(
    backHandler: BackHandler,
    onBack : () -> Unit,
    animation: StackAnimation<C, T>? = stackAnimation(cupertinoStackAnimator())
) = predictiveBackAnimation(
    backHandler = backHandler,
    animation = animation,
    onBack = onBack,
    selector = { initialBackEvent, _, _ ->
        predictiveBackAnimatable(
            initialBackEvent = initialBackEvent,
            exitModifier = { progress, _ ->
                Modifier
                    .cupertinoPredictiveExit(progress = { progress })
            },
            enterModifier = { progress, _ ->
                Modifier
                    .cupertinoPredictiveEnter(progress = { progress })
            },
        )
    }
)

fun cupertinoStackAnimator(
    animationSpec: FiniteAnimationSpec<Float> = cupertinoTween()
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

fun Modifier.cupertinoPredictiveEnter(progress: () -> Float) : Modifier =
    graphicsLayer {
        translationX = (progress() - 1f) * SlideFactor * size.width
    }.drawWithContent {
        drawContent()
        drawRect(Color.Black, alpha = ((1f - progress()) * SlideFactor).coerceIn(0f,1f))
    }

fun Modifier.cupertinoPredictiveExit(progress: () -> Float) : Modifier =
    graphicsLayer {
        translationX = progress() * size.width
    }


private const val SlideFactor =.25f
