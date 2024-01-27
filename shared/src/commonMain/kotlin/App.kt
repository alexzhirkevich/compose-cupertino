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


import adaptive.AdaptiveWidgetsScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.essenty.backhandler.BackDispatcher
import com.arkivanov.essenty.backhandler.BackHandler
import cupertino.CupertinoWidgetsScreen
import icons.IconsScreen
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTheme
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi
import io.github.alexzhirkevich.cupertino.adaptive.Theme
import io.github.alexzhirkevich.cupertino.decompose.CupertinoSheetStack
import kotlinx.serialization.builtins.serializer
import sections.SectionsScreen


expect val IsIos : Boolean

@OptIn(ExperimentalDecomposeApi::class, ExperimentalAdaptiveApi::class)
@Composable
fun App(rootComponent: RootComponent) {
    val stackComponent = remember(rootComponent) {
        SheetStackComponent(rootComponent)
    }

    CupertinoSheetStack(
        stack = stackComponent.stack,
        backDispatcher = stackComponent.backDispatcher,
        onBack = {
            stackComponent.pop()
        }
    ) {
        Surface {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text("Sheet ${it.instance}")
                Button(onClick = {
                    stackComponent.push()
                }) {
                    Text("Push")
                }
            }
        }
    }
}


class SheetStackComponent(context: ComponentContext) : ComponentContext by context {
    private val navigation = StackNavigation<Int>()

    val stack = childStack(
        source = navigation,
        key = "SheetStack",
        initialStack = { listOf(1) },
        handleBackButton = true,
        serializer = Int.serializer(),
        childFactory = { i, _ -> i }
    )

    val backDispatcher = (backHandler as? BackDispatcher)
        ?: object : BackDispatcher, BackHandler by backHandler {
            override val isEnabled: Boolean
                get() = stack.value.backStack.isNotEmpty()

            override fun back(): Boolean {
                navigation.pop()
                return true
            }

        }

    fun push() {
        navigation.push(stack.value.items.size + 1)
    }

    fun pop() {
        navigation.pop()
    }
}

@OptIn(ExperimentalDecomposeApi::class, ExperimentalAdaptiveApi::class)
@Composable
fun App2(rootComponent: RootComponent) {

    val theme by derivedStateOf {
        if (rootComponent.isMaterial.value)
            Theme.Material3 else Theme.Cupertino
    }

    val (lightAccent, darkAccent) = rootComponent.accentColor.value

//    CupertinoTheme(
//        colorScheme = if (isSystemInDarkTheme())
//            darkColorScheme(accentColor.value.second) else lightColorScheme(accentColor.value.first)
//    )

    val isDark by rootComponent.isDark

    val direction = LocalLayoutDirection.current

    val directionState by remember {
        derivedStateOf {
            if (rootComponent.isInvertLayoutDirection.value) {
                if (direction == LayoutDirection.Rtl)
                    LayoutDirection.Ltr else
                    LayoutDirection.Rtl
            } else {
                direction
            }
        }
    }

    ActualPredictiveBackGestureOverlay(
        modifier = Modifier.fillMaxSize(),
        backDispatcher = rootComponent.backDispatcher
    ) {
        CupertinoSheetStack(
            stack = rootComponent.stack,
            modifier = Modifier.fillMaxSize(),
            backDispatcher = rootComponent.backDispatcher,
            onBack = rootComponent::onBack,
//            animation = cupertinoPredictiveBackAnimation(
//                backHandler = rootComponent.backHandler,
//                onBack = rootComponent::onBack,
//            ),
        ) { child ->
            CompositionLocalProvider(
                LocalLayoutDirection provides directionState
            ) {

//                AnimatedContent(
//                    targetState = theme to isDark,
//                    transitionSpec = {
//                        fadeIn() togetherWith fadeOut()
//                    },
//                ) { (theme, isDark) ->

                    AdaptiveTheme(
                        target = theme,
                        primaryColor = if (isDark)
                            lightAccent else darkAccent,
                        useSystemColorTheme = false,
                        useDarkTheme = isDark
                    ) {

                        when (val c = child.instance) {
                            is RootComponent.Child.Cupertino -> CupertinoWidgetsScreen(c.component)
                            is RootComponent.Child.Adaptive -> AdaptiveWidgetsScreen(c.component)
                            is RootComponent.Child.Icons -> IconsScreen(c.component)
                            is RootComponent.Child.Sections -> SectionsScreen(c.component)
                        }
//                    }
                }
            }
        }
    }
}