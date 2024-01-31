/*
 * Copyright (c) 2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.Child
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.predictiveBackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.backstackStackAnimation
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveSheetGestureOverlay
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackDispatcher
import io.github.alexzhirkevich.cupertino.cupertinoTween

@Composable
fun <T : Any> Value<T>.subscribeAsState2(
): State<T> = produceState(
    initialValue = value,
    this
) {
    val disposable = observe {
        this.value = it
    }
    awaitDispose {
        disposable.cancel()
    }
}


@ExperimentalDecomposeApi
@Composable
fun <C : Any, T : Any> CupertinoSheetStack(
    stack: Value<ChildStack<C, T>>,
    backDispatcher: BackDispatcher,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    shape: CornerBasedShape = DefaultSheetShape,
    backgroundColor: Color = Color.Black,
    windowInsets: WindowInsets = WindowInsets.statusBars,
    content: @Composable (child: Child.Created<C, T>) -> Unit,
) {
    val state by stack.subscribeAsState2()
    val backStackSize = rememberUpdatedState(state.backStack.size)

    val isPredictive = remember { mutableStateOf(false) }

    val doPadding by rememberUpdatedState(backStackSize.value > 0)

    val maxTopPadding by rememberUpdatedState(
        newValue = windowInsets.asPaddingValues().calculateTopPadding() + SheetTopPadding
    )

    val padding = animateDpAsState(
        if (doPadding && !isPredictive.value) maxTopPadding else 0.dp
    )

    PredictiveSheetGestureOverlay(
        backDispatcher = backDispatcher,
        topPadding = LocalDensity.current.run {
            maxTopPadding.toPx()
        },
        modifier = modifier
            .background(backgroundColor),
    ) {
        Children(
            stack = stack,
            content = content,
            animation = predictiveBackAnimation(
                animation = backstackStackAnimation(
                    cupertinoSheetStackAnimator(
                        backStackSize = backStackSize,
                        padding = padding,
                        layoutShape = shape,
                        animationSpec = cupertinoTween(2000)
                    )
                ),
                selector = { initialBackEvent, _, _ ->
                    cupertinoSheetPredictiveBackAnimatable(
                        initialBackEvent = initialBackEvent,
                        shape = shape,
                        backStackSize = backStackSize,
                        isPredictive = isPredictive,
                        padding = padding,
                    )
                },
                backHandler = backDispatcher,
                onBack = onBack
            ),
        )
//        BackStackedChildren(
//            stack = stack,
//            animation = predictiveBackAnimation(
//                animation = stackAnimation(
//                    cupertinoSheetStackAnimator(
//                        backStackSize = backStackSize,
//                        padding = padding,
//                        layoutShape = shape,
//                        animationSpec = cupertinoTween(2000)
//                    )
//                ),
//                selector = { initialBackEvent, _, _ ->
//                    cupertinoSheetPredictiveBackAnimatable(
//                        initialBackEvent = initialBackEvent,
//                        shape = shape,
//                        backStackSize = backStackSize,
//                        isPredictive = isPredictive,
//                        padding = padding,
//                    )
//                },
//                backHandler = backDispatcher,
//                onBack = onBack
//            ),
//            content = content
//        )
    }
}

@Composable
internal fun <C : Any, T : Any> BackStackedChildren(
    stack: Value<ChildStack<C, T>>,
    modifier: Modifier = Modifier,
    animation: StackAnimation<C, T>? = null,
    content: @Composable (child: Child.Created<C, T>) -> Unit,
) {
    val state by stack.subscribeAsState2()
    BackStackedChildren(
        stack = state,
        modifier = modifier,
        animation = animation,
        content = content
    )
}

@Composable
internal fun <C : Any, T : Any> BackStackedChildren(
    stack: ChildStack<C, T>,
    modifier: Modifier = Modifier,
    animation: StackAnimation<C, T>? = null,
    content: @Composable (child: Child.Created<C, T>) -> Unit,
) {
    val visibleBackStack = stack.backStack.lastOrNull()

    visibleBackStack?.let { child ->
        val factor = 1f
        Box(
            modifier = Modifier
                .drawWithContent {
                    drawContent()
                    drawRect(Color.Black, alpha = factor / 4)
                }
                .graphicsLayer {
                    scaleX = 1f + (-factor) / 10f
                    scaleY = scaleX
                    shape = DefaultSheetShape
                    clip = true
                }
        ) {
            content(child)
        }
    }

    Children(
        stack = stack,
        animation = animation,
        content = content,
        modifier = modifier
    )
}

internal val DefaultSheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)