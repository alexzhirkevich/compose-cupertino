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


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.popWhile
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.essenty.backhandler.BackDispatcher
import com.arkivanov.essenty.backhandler.BackHandler
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi
import io.github.alexzhirkevich.cupertino.decompose.CupertinoSheetStack
import kotlinx.serialization.builtins.serializer


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
        windowInsets =  WindowInsets(top = 34.dp),// WindowInsets.statusBars,
        onBack = {
            stackComponent.pop()
        },
    ) { child ->
        Surface(
            color = Color.White//.copy(alpha = 0.2f)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text("Sheet ${child.instance}")
                Button(onClick = {
                    stackComponent.push()
                }) {
                    Text("Push")
                }
                if (child.instance != 1) {
                    Button(onClick = {
                        stackComponent.pop()
                    }) {
                        Text("Back")
                    }
                }
                if (child.instance > 2) {
                    Button(onClick = {
                        stackComponent.popAll()
                    }) {
                        Text("To first")
                    }
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

    fun popAll() {
        navigation.popWhile { i -> i != 1 }
    }
}