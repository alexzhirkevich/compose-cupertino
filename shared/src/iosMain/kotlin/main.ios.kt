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


@file:OptIn(ExperimentalMaterial3Api::class)

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import io.github.alexzhirkevich.cupertino.CupertinoColorPickerNative
import platform.UIKit.UIViewController

fun RootComponent(lifecycleRegistry: LifecycleRegistry): RootComponent =
    DefaultRootComponent(DefaultComponentContext(lifecycleRegistry))

@OptIn(ExperimentalFoundationApi::class)
fun MainViewController(component: RootComponent) : UIViewController {
//    optOutOfCupertinoOverscroll()
    return ComposeUIViewController(
        configure = {
            onFocusBehavior = OnFocusBehavior.DoNothing
        }
    ) {
        App(component)

//        var color by remember {
//            mutableStateOf(Color.Black)
//        }
//
//        var visible by remember {
//            mutableStateOf(true)
//        }
//
//        if (visible) {
//            CupertinoColorPickerNative(
//                color = color,
//                onColorChanged = {
//                    color = it
//                    println(it)
//                },
//                onDismissRequest = {
//                    visible = false
//                    println("dismissed")
//                }
//            )
//        }
    }
}