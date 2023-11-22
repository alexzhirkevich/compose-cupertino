///*
// * Copyright (c) 2023 Compose Cupertino project and open source contributors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package io.github.alexzhirkevich.cupertino.decompose
//
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.CompositionLocalContext
//import androidx.compose.runtime.CompositionLocalProvider
//import androidx.compose.runtime.DisposableEffect
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.State
//import androidx.compose.runtime.currentCompositionLocalContext
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.rememberUpdatedState
//import androidx.compose.runtime.saveable.SaveableStateHolder
//import androidx.compose.runtime.saveable.rememberSaveableStateHolder
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.interop.UIKitView
//import androidx.compose.ui.uikit.OnFocusBehavior
//import androidx.compose.ui.window.ComposeUIViewController
//import com.arkivanov.decompose.Child
//import com.arkivanov.decompose.InternalDecomposeApi
//import com.arkivanov.decompose.Relay
//import com.arkivanov.decompose.hashString
//import com.arkivanov.decompose.router.stack.ChildStack
//import com.arkivanov.decompose.router.stack.StackNavigation
//import com.arkivanov.decompose.router.stack.StackNavigationSource
//import com.arkivanov.decompose.router.stack.StackNavigator
//import kotlinx.cinterop.ExperimentalForeignApi
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.sync.Mutex
//import kotlinx.coroutines.sync.withLock
//import platform.UIKit.UINavigationController
//import platform.UIKit.UINavigationControllerDelegateProtocol
//import platform.UIKit.UIViewController
//import platform.UIKit.addChildViewController
//import platform.UIKit.didMoveToParentViewController
//import platform.UIKit.willMoveToParentViewController
//
//private class UIViewControllerWrapper<C: Any,T : Any>(
//    val item : Child.Created<C,T>,
//    private val onBack : () -> Unit,
//    private val compositionLocalContext: State<CompositionLocalContext>,
//    private val content: @Composable () -> Unit,
//    private val onViewAppeared : () -> Unit
//) : UIViewController(null,null){
//
//    @OptIn(ExperimentalForeignApi::class)
//    override fun loadView() {
//        super.loadView()
//        val controller = ComposeUIViewController(
//            configure = {
//                onFocusBehavior = OnFocusBehavior.DoNothing
//            }
//        ) {
//            CompositionLocalProvider(compositionLocalContext.value){
//                content()
//            }
//        }
//        controller.willMoveToParentViewController(this)
//        controller.view.setFrame(view.frame)
//        view.addSubview(controller.view)
//        addChildViewController(controller)
//        controller.didMoveToParentViewController(this)
//    }
//
//    override fun viewDidDisappear(animated: Boolean) {
//        super.viewDidDisappear(animated)
//        if (isMovingFromParentViewController()) {
//            onBack()
//        }
//    }
//
//    override fun viewDidAppear(animated: Boolean) {
//        if (animated){
//            onViewAppeared()
//        }
//    }
//}
//
//private class NavController<C : Any,T : Any>(
//    private var initialStack : ChildStack<C,T>,
//    private val onBack: () -> Unit,
//    private val content: @Composable (child: Child.Created<C, T>) -> Unit,
//) : UINavigationController(nibName = null, bundle = null) {
//
//    private lateinit var compositionLocalContext: State<CompositionLocalContext>
//    private lateinit var stateHolder: SaveableStateHolder
//
//    fun onChanged(stack: ChildStack<C, T>) {
//
//        if (this.initialStack === stack){
//            return
//        }
//
//        println(stack)
//
//        val controllers = viewControllers.filterIsInstance<UIViewControllerWrapper<C, T>>()
//        val items = controllers.map { it.item }
//
//        val newControllers = when {
////            items == stack.backStack -> controllers + makeUIViewController(stack.active)
////            items.dropLast(1) == stack.items -> controllers.dropLast(1)
//            else -> stack.items.map { makeUIViewController(it) }
//        }
//
//        setViewControllers(newControllers, animated = true)
//
//        initialStack = stack
//    }
//
//    @OptIn(InternalDecomposeApi::class)
//    private fun makeUIViewController(
//        item: Child.Created<C, T>
//    ) = UIViewControllerWrapper(
//        onBack = onBack,
//        compositionLocalContext = compositionLocalContext,
//        content = {
//            stateHolder.SaveableStateProvider(item.configuration.hashString()) {
//                content(item)
//            }
//        },
//        item = item
//    )
//
//    @OptIn(ExperimentalForeignApi::class)
//    @Composable
//    fun Content(modifier: Modifier) {
//
//        compositionLocalContext = rememberUpdatedState(currentCompositionLocalContext)
//
//        stateHolder = rememberSaveableStateHolder()
//
//        stateHolder.retainStates(initialStack.getConfigurations())
//
//        UIKitView(
//            modifier = modifier,
//            factory = {
//                setViewControllers(initialStack.items.map {
//                    makeUIViewController(it)
//                })
//                view
//            },
//        )
//    }
//}
//
//
//@OptIn(InternalDecomposeApi::class)
//private fun ChildStack<*, *>.getConfigurations(): Set<String> =
//    items.mapTo(HashSet()) { it.configuration.hashString() }
//
//@Composable
//private fun SaveableStateHolder.retainStates(currentKeys: Set<Any>) {
//    val keys = remember(this) { Keys(currentKeys) }
//
//
//    DisposableEffect(this, currentKeys) {
//        keys.set.forEach {
//            if (it !in currentKeys) {
//                removeState(it)
//            }
//        }
//
//        keys.set = currentKeys
//
//        onDispose {}
//    }
//}
//
//private class Keys(
//    var set: Set<Any>
//)
//
//@Composable
//fun <C : Any, T : Any> UIKitChildren(
//    stack: ChildStack<C, T>,
//    modifier: Modifier = Modifier,
//    onBack : () -> Unit,
//    content: @Composable (child: Child.Created<C, T>) -> Unit,
//) {
//    val navController = remember {
//        NavController(stack,onBack, content)
//    }
//
//    val delayMutex = remember { Mutex() }
//
//    LaunchedEffect(stack) {
//        if (delayMutex.isLocked)
//            return@LaunchedEffect
//        delayMutex.withLock {
//            navController.onChanged(stack)
//            delay(200)
//        }
//    }
//
//    navController.Content(modifier)
//}