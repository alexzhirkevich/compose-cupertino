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
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.runtime.State
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.uikit.ComposeUIViewControllerConfiguration
import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.util.fastMap
import androidx.compose.ui.viewinterop.UIKitInteropProperties
import androidx.compose.ui.viewinterop.UIKitViewController
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.Child
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
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
import platform.UIKit.childViewControllers
import platform.UIKit.didMoveToParentViewController
import platform.UIKit.removeFromParentViewController
import platform.UIKit.willMoveToParentViewController

@OptIn(ExperimentalComposeApi::class)
@Composable
fun <C : Any, T : Any> UIKitChildren(
    stack: Value<ChildStack<C, T>>,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    configuration : ComposeUIViewControllerConfiguration.() -> Unit = {
        onFocusBehavior = OnFocusBehavior.DoNothing
        platformLayers = false
    },
    content: @Composable (child: Child.Created<C, T>) -> Unit,
) {

    val compositionLocalContext = rememberUpdatedState(currentCompositionLocalContext)
    val updatedOnBack by rememberUpdatedState(onBack)
    val updatedConfiguration by rememberUpdatedState(configuration)
    val updatedContent by rememberUpdatedState(content)

    val navController = remember(stack) {
        NavController(
            compositionLocalContext = compositionLocalContext,
            stack = stack,
            onBack = {
                updatedOnBack.invoke()
            },
            configuration = {
                updatedConfiguration.invoke(this)
            },
            content = {
                updatedContent(it)
            },
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
    private val onBack : () -> Unit,
    private val compositionLocalContext: State<CompositionLocalContext>,
    private val configuration: ComposeUIViewControllerConfiguration.() -> Unit,
    private val content: @Composable () -> Unit,
) : UIViewController(null,null), UIGestureRecognizerDelegateProtocol {

    @OptIn(ExperimentalForeignApi::class, InternalCupertinoApi::class)
    override fun loadView() {
        super.loadView()
        val controller = ComposeUIViewController(
            configure = {
                configuration.invoke(this)
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
            onBack()
            view.subviews.forEach {
                it as UIView
                it.removeFromSuperview()
            }
            childViewControllers.forEach {
                it as UIViewController
                it.removeFromParentViewController()
            }
        }
    }
}

private class NavController<C : Any,T : Any>(
    private val compositionLocalContext: State<CompositionLocalContext>,
    stack : Value<ChildStack<C,T>>,
    private val onBack: () -> Unit,
    private val configuration: ComposeUIViewControllerConfiguration.() -> Unit,
    private val content: @Composable (child: Child.Created<C, T>) -> Unit,
) : UINavigationController(nibName = null, bundle = null), UIGestureRecognizerDelegateProtocol {

    init {
        navigationBarHidden = true
    }

    private val cancellation = stack.subscribe {
        onChanged(it)
    }

    @Composable
    fun Content(modifier: Modifier) {

        UIKitViewController(
            factory = { this },
            modifier = modifier,
            properties = UIKitInteropProperties(
                isInteractive = true,
                isNativeAccessibilityEnabled = true
            )
        )
    }

    override fun viewDidLoad() {
        super.viewDidLoad()
        interactivePopGestureRecognizer?.delegate = this
    }

    override fun gestureRecognizerShouldBegin(gestureRecognizer: UIGestureRecognizer): Boolean {
        return viewControllers.size > 1
    }

    fun release() {
        cancellation.cancel()
    }

    private fun onChanged(stack: ChildStack<C, T>) {

        val controllers = viewControllers
            .filterIsInstance<UIViewControllerWrapper<C, T>>()

        val newControllers = stack.items.fastMap {
            controllers.fastFirstOrNull { c -> c.item.instance === it.instance }
                ?: makeUIViewController(it)
        }

        if (controllers != newControllers) {
            setViewControllers(newControllers, animated = true)
        }
    }

    private fun makeUIViewController(
        item: Child.Created<C, T>
    ) = UIViewControllerWrapper(
        onBack = onBack,
        compositionLocalContext = compositionLocalContext,
        content = {
            content(item)
        },
        item = item,
        configuration = configuration
    )
}
