/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
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

@file: Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")


package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalContext
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.SaveableStateHolder
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.interop.UIKitView
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.Child
import com.arkivanov.decompose.InternalDecomposeApi
import com.arkivanov.decompose.hashString
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackDispatcher
import io.github.alexzhirkevich.cupertino.InternalCupertinoApi
import io.github.alexzhirkevich.cupertino.SystemBarAppearance
import io.github.alexzhirkevich.cupertino.rememberCupertinoHapticFeedback
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.isInitializedCupertinoTheme
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIGestureRecognizer
import platform.UIKit.UIGestureRecognizerDelegateProtocol
import platform.UIKit.UINavigationController
import platform.UIKit.UIView
import platform.UIKit.UIViewController
import platform.UIKit.addChildViewController
import platform.UIKit.didMoveToParentViewController
import platform.UIKit.willMoveToParentViewController

@Composable
fun <C : Any, T : Any> UIKitChildren(
    stack: Value<ChildStack<C, T>>,
    modifier: Modifier = Modifier,
    backDispatcher: BackDispatcher,
    content: @Composable (child: Child.Created<C, T>) -> Unit,
) {

    val compositionLocalContext = rememberUpdatedState(currentCompositionLocalContext)

    val stateHolder = rememberSaveableStateHolder()

    val navController = remember {
        NavController(
            compositionLocalContext = compositionLocalContext,
            stateHolder = stateHolder,
            stack = stack,
            backDispatcher = backDispatcher,
            content = content,
        )
    }

    navController.Content(modifier)

    DisposableEffect(navController){
        onDispose {
            navController.release()
        }
    }
}

private class UIViewControllerWrapper<C: Any,T : Any>(
    val item : Child.Created<C,T>,
    private val backDispatcher: BackDispatcher,
    private val compositionLocalContext: State<CompositionLocalContext>,
    private val content: @Composable () -> Unit,
) : UIViewController(null,null), UIGestureRecognizerDelegateProtocol {

    @OptIn(ExperimentalForeignApi::class, InternalCupertinoApi::class)
    override fun loadView() {
        super.loadView()
        val controller = ComposeUIViewController(
            configure = {
                onFocusBehavior = OnFocusBehavior.DoNothing
            }
        ) {

            val foundationContext = currentCompositionLocalContext

            CompositionLocalProvider(
                compositionLocalContext.value,
            ) {
                CompositionLocalProvider(
                    context = foundationContext,
                ){

                    if (isInitializedCupertinoTheme()) {
                        SystemBarAppearance(CupertinoTheme.colorScheme.isDark, this)
                    }

                    CompositionLocalProvider(
                        LocalHapticFeedback provides rememberCupertinoHapticFeedback(),
                        LocalUIViewController provides this,
                        content = content
                    )
                }
            }
        }

        controller.willMoveToParentViewController(this)
        controller.view.setFrame(view.frame)
        view.addSubview(controller.view)
        addChildViewController(controller)
        controller.didMoveToParentViewController(this)
    }

    @OptIn(ExperimentalForeignApi::class)
    override fun viewWillLayoutSubviews() {
        super.viewWillLayoutSubviews()
        this.view.subviews.forEach {
            it as UIView
            it.setFrame(view.frame)
        }
    }

    override fun viewDidDisappear(animated: Boolean) {
        super.viewDidDisappear(animated)
        if (isMovingFromParentViewController()) {
            backDispatcher.back()
        }
    }
}

private class NavController<C : Any,T : Any>(
    private val compositionLocalContext: State<CompositionLocalContext>,
    private val stateHolder: SaveableStateHolder,
    private val stack : Value<ChildStack<C,T>>,
    private val backDispatcher: BackDispatcher,
    private val content: @Composable (child: Child.Created<C, T>) -> Unit,
) : UINavigationController(nibName = null, bundle = null), UIGestureRecognizerDelegateProtocol {

    init {
        navigationBarHidden = true
    }

    private val cancellation = stack.observe {
        onChanged(it)
    }

    @OptIn(ExperimentalForeignApi::class)
    @Composable
    fun Content(modifier: Modifier) {

        stateHolder.retainStates(stack.value.getConfigurations())

        UIKitView(
            modifier = modifier,
            factory = {
                view
            },
            background = CupertinoTheme.colorScheme.systemBackground
        )
    }

    override fun viewDidLoad() {
        super.viewDidLoad()
        interactivePopGestureRecognizer?.delegate = this
    }

    override fun gestureRecognizerShouldBegin(gestureRecognizer: UIGestureRecognizer): Boolean {
        return backDispatcher.isEnabled && viewControllers.size > 1
    }

    fun release() {
        cancellation.cancel()
    }

    private fun onChanged(stack: ChildStack<C, T>) {

        val controllers = viewControllers.filterIsInstance<UIViewControllerWrapper<C, T>>()

        val newControllers = stack.items.map {
            controllers.fastFirstOrNull { c -> c.item.instance === it.instance }
                ?: makeUIViewController(it)
        }

        setViewControllers(newControllers, animated = true)
    }

    @OptIn(InternalDecomposeApi::class)
    private fun makeUIViewController(
        item: Child.Created<C, T>
    ) = UIViewControllerWrapper(
        backDispatcher = backDispatcher,
        compositionLocalContext = compositionLocalContext,
        content = {
            stateHolder.SaveableStateProvider(item.configuration.hashString()) {
                content(item)
            }
        },
        item = item,
    )
}


@OptIn(InternalDecomposeApi::class)
private fun ChildStack<*, *>.getConfigurations(): Set<String> =
    items.mapTo(HashSet()) { it.configuration.hashString() }

@Composable
private fun SaveableStateHolder.retainStates(currentKeys: Set<Any>) {
    val keys = remember(this) { Keys(currentKeys) }

    DisposableEffect(this, currentKeys) {
        keys.set.forEach {
            if (it !in currentKeys) {
                removeState(it)
            }
        }

        keys.set = currentKeys

        onDispose {}
    }
}

private class Keys(
    var set: Set<Any>
)
