package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.Direction
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimator
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.PredictiveBackAnimatable
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.predictiveBackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimator
import com.arkivanov.essenty.backhandler.BackEvent
import com.arkivanov.essenty.backhandler.BackHandler
import io.github.alexzhirkevich.cupertino.cupertinoTween

@ExperimentalDecomposeApi
@Composable
fun <C : Any,T : Any> cupertinoPredictiveBackAnimation(
    backHandler: BackHandler,
    onBack : () -> Unit,
    animation: StackAnimation<C, T>? = stackAnimation(
        animator = cupertinoStackAnimator(),
        disableInputDuringAnimation = true
    )
) : StackAnimation<C,T> = predictiveBackAnimation(
    backHandler = backHandler,
    animation = animation,
    onBack = onBack,
    selector = { initialBackEvent, _, _ ->
        cupertinoPredictiveBackAnimatable(
            initialBackEvent = initialBackEvent
        )
    }
)


@ExperimentalDecomposeApi
fun cupertinoPredictiveBackAnimatable(
    initialBackEvent: BackEvent
) : PredictiveBackAnimatable =  CupertinoPredictiveBackAnimatable(
    initialBackEvent = initialBackEvent
)

@OptIn(ExperimentalDecomposeApi::class)
internal class CupertinoPredictiveBackAnimatable(
    initialBackEvent: BackEvent,
) : PredictiveBackAnimatable {

    private val progressAnimatable = Animatable(initialValue = initialBackEvent.progress)

    private var swipeEdge by mutableStateOf(initialBackEvent.swipeEdge)

    override val exitModifier: Modifier = Modifier
        .cupertinoPredictiveExit { progressAnimatable.value }
    override val enterModifier: Modifier get() = Modifier
        .cupertinoPredictiveEnter { progressAnimatable.value }

    override suspend fun animate(event: BackEvent) {
        swipeEdge = event.swipeEdge

        progressAnimatable.snapTo(targetValue = event.progress)
    }

    override suspend fun finish() {
        progressAnimatable.animateTo(targetValue = 1F)
    }
}

fun cupertinoStackAnimator(
    animationSpec: FiniteAnimationSpec<Float> = cupertinoTween()
) : StackAnimator = stackAnimator(
    animationSpec = animationSpec,
) { factor, direction, content ->
    content(
        Modifier.composed {

            val layoutDirection = LocalLayoutDirection.current

            graphicsLayer {
                translationX = size.width * when (direction) {
                    Direction.ENTER_FRONT,
                    Direction.EXIT_FRONT -> factor

                    else -> factor * SlideFactor
                }

                if (layoutDirection == LayoutDirection.Rtl)
                    translationX = -translationX
            }
        }
    )
}

fun Modifier.cupertinoPredictiveEnter(progress: () -> Float) : Modifier = composed {

    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

    graphicsLayer {
        translationX = (progress() - 1f) * SlideFactor * size.width

        if (isRtl)
            translationX = -translationX

    }.drawWithContent {
        drawContent()
        drawRect(Color.Black, alpha = ((1f - progress()) * SlideFactor).coerceIn(0f, 1f))
    }
}

fun Modifier.cupertinoPredictiveExit(progress: () -> Float) : Modifier = composed {

    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

    graphicsLayer {
        translationX = progress() * size.width

        if (isRtl)
            translationX = -translationX
    }
}


private const val SlideFactor =.25f
