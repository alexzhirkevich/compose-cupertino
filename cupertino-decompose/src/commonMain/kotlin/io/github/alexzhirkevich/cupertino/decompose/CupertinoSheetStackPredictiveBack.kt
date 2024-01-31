package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.GraphicsLayerScope
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.Direction
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimator
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.PredictiveBackAnimatable
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimator
import com.arkivanov.essenty.backhandler.BackEvent
import io.github.alexzhirkevich.cupertino.cupertinoTween
import kotlin.math.abs

//@ExperimentalDecomposeApi
//@Composable
//fun <C : Any, T : Any> cupertinoSheetPredictiveBackAnimation(
//    backHandler: BackHandler,
//    onBack: () -> Unit,
//    shape: CornerBasedShape,
//    backStackSize: State<Int>,
//    padding: State<Dp>,
//    isPredictive: MutableState<Boolean>,
//    animation: StackAnimation<C, T> = stackAnimation(
//        animator = cupertinoStackAnimator(),
//        disableInputDuringAnimation = true
//    )
//): StackAnimation<C, T> = predictiveBackSheetAnimation(
//    backHandler = backHandler,
//    animation = animation,
//    onBack = onBack,
//    selector = { initialBackEvent, _, _ ->
//        cupertinoSheetPredictiveBackAnimatable(
//            initialBackEvent = initialBackEvent,
//            shape = shape,
//            backStackSize = backStackSize,
//            padding = padding,
//            isPredictive = isPredictive,
//        )
//    }
//)
//

@ExperimentalDecomposeApi
fun cupertinoSheetPredictiveBackAnimatable(
    initialBackEvent: BackEvent,
    shape: CornerBasedShape,
    backStackSize: State<Int>,
    padding: State<Dp>,
    isPredictive: MutableState<Boolean>,
): PredictiveBackAnimatable = CupertinoSheetPredictiveBackAnimatable(
    initialBackEvent = initialBackEvent,
    shape = shape,
    padding = padding,
    backStackSize = backStackSize,
    isPredictive = isPredictive,
)

@OptIn(ExperimentalDecomposeApi::class)
internal class CupertinoSheetPredictiveBackAnimatable(
    initialBackEvent: BackEvent,
    shape: CornerBasedShape,
    padding: State<Dp>,
    backStackSize: State<Int>,
    isPredictive: MutableState<Boolean>,
) : PredictiveBackAnimatable {

    private val progressAnimatable = Animatable(initialValue = initialBackEvent.progress)
    private var isPredictive by isPredictive

    override val exitModifier: Modifier = Modifier
        .cupertinoSheetPredictiveExit(
            progress = progressAnimatable::value,
        )

    override val enterModifier: Modifier = Modifier
        .cupertinoSheetPredictiveEnter(
            shape = shape,
            padding = padding,
            backStackSize = backStackSize,
            progress = progressAnimatable::value,
        )

    override suspend fun animate(event: BackEvent) {
        isPredictive = true
        progressAnimatable.snapTo(targetValue = event.progress)
    }

    override suspend fun finish() {
        isPredictive = false
        progressAnimatable.animateTo(targetValue = 1F)
    }

    // Next Decompose Release
//    override suspend fun cancel() {
//        isPredictive = false
//        progressAnimatable.animateTo(targetValue = 0F)
//    }
}

fun cupertinoSheetStackAnimator(
    backStackSize: State<Int>,
    padding: State<Dp>,
    layoutShape: CornerBasedShape,
    animationSpec: FiniteAnimationSpec<Float> = cupertinoTween()
): SheetStackAnimator = sheetStackAnimator(
    animationSpec = animationSpec,
) { factor, direction, content ->

    val modifier = when (direction) {
        TriDirection.ENTER_BACK -> Modifier
            .graphicsLayer {
                translationY = padding.value.toPx() + (factor * padding.value.toPx())

                shape = if (backStackSize.value == 0)
                    transformableShape(layoutShape, abs(factor)) else layoutShape

                clip = true
                scaleX = 1f + factor / 10f
                scaleY = scaleX
            }
            .drawWithContent {
                drawContent()
                drawRect(Color.Black, alpha = abs(factor) / 4)
            }

        TriDirection.EXIT_BACK ->   Modifier
            .graphicsLayer {
                translationY = (factor + 1) * padding.value.toPx()

                shape = if (backStackSize.value == 1)
                    transformableShape(layoutShape, abs(factor)) else layoutShape

                clip = true
                scaleX = 1f + factor / 10f
                scaleY = scaleX
            }
            .drawWithContent {
                drawContent()
                drawRect(Color.Black, alpha = abs(factor) / 4)
            }

        TriDirection.ENTER_FRONT -> Modifier
            .graphicsLayer {
                translationY = padding.value.toPx()
                translationY += size.height * factor
                shape = if (backStackSize.value == 0) RectangleShape else layoutShape
                clip = true
            }

        TriDirection.EXIT_FRONT -> Modifier
            .graphicsLayer {
                translationY = padding.value.toPx()
                translationY += size.height * factor
                shape = layoutShape
                clip = true
            }

        TriDirection.ENTER_BACK_SECOND -> Modifier
            .graphicsLayer {
                translationY = padding.value.toPx() - ((1f + factor) * padding.value.toPx())

                shape = layoutShape

                clip = true
                scaleX = .9f
                scaleY = scaleX
            }
            .drawWithContent {
                drawContent()
                drawRect(Color.Black, alpha = .25f)
            }

        TriDirection.EXIT_BACK_SECOND -> Modifier
            .graphicsLayer {
                translationY = (-factor) * padding.value.toPx()
                shape = layoutShape

                clip = true
                scaleX = .9f
                scaleY = scaleX
            }
            .drawWithContent {

                drawContent()
                drawRect(Color.Black, alpha = .25f)
            }
    }

    val outsideViewport = direction == TriDirection.EXIT_BACK_SECOND && factor < -.5f ||
            direction == TriDirection.ENTER_BACK_SECOND && factor < -.5f - Float.MIN_VALUE


    if (!outsideViewport) {
        content(modifier)
    }
}

internal val SheetTopPadding = 12.dp

fun Modifier.cupertinoSheetPredictiveEnter(
    shape: CornerBasedShape,
    padding: State<Dp>,
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
                translationY = -padding.value.toPx() - SheetTopPadding.toPx()
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


internal fun GraphicsLayerScope.transformableShape(
    shape: CornerBasedShape,
    factor: Float
): CornerBasedShape {
    val topStartCornerSize = CornerSize(shape.topStart.toPx(size, this) * factor)
    val topEndCornerSize = CornerSize(shape.topEnd.toPx(size, this) * factor)
    val bottomStartCornerSize = CornerSize(shape.bottomStart.toPx(size, this) * factor)
    val bottomEndCornerSize = CornerSize(shape.bottomEnd.toPx(size, this) * factor)
    return shape.copy(
        topStart = topStartCornerSize,
        topEnd = topEndCornerSize,
        bottomEnd = bottomEndCornerSize,
        bottomStart = bottomStartCornerSize,
    )
}
