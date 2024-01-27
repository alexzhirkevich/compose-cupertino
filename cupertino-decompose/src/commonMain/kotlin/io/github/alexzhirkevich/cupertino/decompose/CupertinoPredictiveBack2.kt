package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
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
import kotlin.math.abs

@ExperimentalDecomposeApi
@Composable
fun <C : Any,T : Any> cupertinoSheetPredictiveBackAnimation(
    backHandler: BackHandler,
    onBack : () -> Unit,
    shape: Shape,
    windowInsets: WindowInsets,
    backStackSize: State<Int>,
    animation: StackAnimation<C, T>? = stackAnimation(
        animator = cupertinoStackAnimator(),
        disableInputDuringAnimation = true
    )
) : StackAnimation<C,T> = predictiveBackAnimation(
    backHandler = backHandler,
    animation = animation,
    onBack = onBack,
    selector = { initialBackEvent, _, _ ->
        cupertinoSheetPredictiveBackAnimatable(
            initialBackEvent = initialBackEvent,
            shape = shape,
            windowInsets = windowInsets,
            backStackSize = backStackSize
        )
    }
)


@ExperimentalDecomposeApi
fun cupertinoSheetPredictiveBackAnimatable(
    initialBackEvent: BackEvent,
    shape: Shape,
    windowInsets: WindowInsets,
    backStackSize: State<Int>,
) : PredictiveBackAnimatable =  CupertinoSheetPredictiveBackAnimatable(
    initialBackEvent = initialBackEvent,
    shape = shape,
    windowInsets = windowInsets,
    backStackSize = backStackSize
)

@OptIn(ExperimentalDecomposeApi::class)
internal class CupertinoSheetPredictiveBackAnimatable(
    initialBackEvent: BackEvent,
    shape: Shape,
    windowInsets: WindowInsets,
    backStackSize: State<Int>
) : PredictiveBackAnimatable {

    private val progressAnimatable = Animatable(initialValue = initialBackEvent.progress)

    override val exitModifier: Modifier = Modifier
        .cupertinoSheetPredictiveExit(progressAnimatable::value)
    override val enterModifier: Modifier = Modifier
        .cupertinoSheetPredictiveEnter(
            shape = shape,
            windowInsets = windowInsets,
            backStackSize = backStackSize,
            progress = progressAnimatable::value
        )
    override suspend fun animate(event: BackEvent) {
        progressAnimatable.snapTo(targetValue = event.progress)
    }

    override suspend fun finish() {
        progressAnimatable.animateTo(targetValue = 1F)
    }
}

fun cupertinoSheetStackAnimator(
    backStackSize : State<Int>,
    shape: Shape,
    windowInsets: WindowInsets,
    animationSpec: FiniteAnimationSpec<Float> = cupertinoTween()
) : StackAnimator = stackAnimator(
    animationSpec = animationSpec,
) { factor, direction, content ->

    val modifier = when (direction) {
        Direction.ENTER_BACK, Direction.EXIT_BACK ->
            Modifier
                .drawWithContent {
                    drawContent()
                    drawRect(Color.Black, alpha = abs(factor) / 4)
                }
                .graphicsLayer {
                    scaleX = 1f + factor / 10f
                    scaleY = scaleX
                    this.shape = shape
                    clip = abs(factor) > Float.MIN_VALUE
                }

        else -> {

            val doClip = backStackSize.value > 0 || abs(factor) > Float.MIN_VALUE

            val clipModifier = if (doClip){
                Modifier
                    .windowInsetsPadding(windowInsets)
                    .padding(top = SheetTopPadding)
            } else Modifier

            Modifier
                .then(clipModifier)
                .graphicsLayer {
                    translationY = size.height * factor
                    if (doClip) {
                        this.shape = shape
                        clip = true
                    }
                }
        }
    }
    content(modifier)
}

internal val SheetTopPadding = 12.dp


fun Modifier.cupertinoSheetPredictiveEnter(
    shape: Shape,
    windowInsets : WindowInsets,
    backStackSize: State<Int>,
    progress: () -> Float
) : Modifier = composed {

    Modifier
        .background(Color.Black)
        .drawWithContent {
            drawContent()
            drawRect(Color.Black, alpha = abs(1f -progress()) / 4)
        }
        .graphicsLayer {
            if (backStackSize.value > 0) {
                translationY = -windowInsets.getTop(this) - SheetTopPadding.toPx()
            }

            scaleX = 1f - (1f - progress()) /10f
            scaleY = scaleX
            this.shape = shape
            clip = abs(progress()) > Float.MIN_VALUE
        }
}

fun Modifier.cupertinoSheetPredictiveExit(progress: () -> Float) : Modifier = composed {

    graphicsLayer {
        translationY = progress() * size.height
    }
}


private const val SlideFactor =1f//.25f
