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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.Child
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.predictiveback.predictiveBackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveSheetGestureOverlay
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackDispatcher
import io.github.alexzhirkevich.cupertino.cupertinoTween
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce

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
fun <C: Any,T : Any> CupertinoSheetStack(
    stack: Value<ChildStack<C, T>>,
    backDispatcher: BackDispatcher,
    onBack : () -> Unit,
    modifier: Modifier = Modifier,
    shape : Shape = DefaultSheetShape,
    backgroundColor : Color = Color.Black,
    windowInsets: WindowInsets = WindowInsets(top = 34.dp),// WindowInsets.statusBars,
    content: @Composable (child: Child.Created<C, T>) -> Unit,
) {

    val subscribed by stack.subscribeAsState2()

//    val backStackSize = remember {
//        mutableStateOf(subscribed.backStack.size)
//    }
//
//
//    LaunchedEffect(0) {
//        snapshotFlow { subscribed }.debounce(50).collectLatest {
//            backStackSize.value = it.backStack.size
//            println(it)
//        }
//    }

    val backStackSize = rememberUpdatedState(subscribed.backStack.size)


    PredictiveSheetGestureOverlay(
        backDispatcher = backDispatcher,
        topPadding = LocalDensity.current.run {
            windowInsets.getTop(LocalDensity.current) + SheetTopPadding.toPx()
        },
        modifier = modifier
            .background(backgroundColor),
    ) {
        Children(
            stack = stack,
            animation = predictiveBackAnimation(
                animation = stackAnimation(
                    cupertinoSheetStackAnimator(
                        backStackSize = backStackSize,
                        shape = shape,
                        windowInsets = windowInsets,
                        animationSpec = cupertinoTween(durationMillis = 1000)
                    )
                ),
                selector = { initialBackEvent, _, _ ->
                    cupertinoSheetPredictiveBackAnimatable(
                        initialBackEvent = initialBackEvent,
                        shape = shape,
                        windowInsets = windowInsets,
                        backStackSize = backStackSize
                    )
                },
                backHandler = backDispatcher,
                onBack = onBack
            ),
            content = content
        )
    }
}

internal val DefaultSheetShape = RoundedCornerShape(16.dp)