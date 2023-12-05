/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.Child
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimation
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackDispatcher


/**
 * Native children will use UINavigationController on iOS and [Children] on other platforms
 *
 * @param stack children stack
 * @param backDispatcher back dispatcher that will be triggered when child is swiped out. Child will not be swipeable if dispatcher is disabled
 * @param modifier stack modifier. Must declare fixed size.
 * @param animation stack animation used for [Children]. Not used on iOS
 * @param content child content
 * */
@Composable
expect fun <C : Any, T : Any> NativeChildren(
    stack: Value<ChildStack<C, T>>,
    backDispatcher: BackDispatcher,
    modifier: Modifier = Modifier,
    animation: StackAnimation<C, T>? = null,
    content: @Composable (child: Child.Created<C, T>) -> Unit,
)
