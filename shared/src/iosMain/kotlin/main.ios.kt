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


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController
import androidx.compose.ui.window.Popup
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import platform.UIKit.UIViewController

actual val IsIos : Boolean
    get() = true

fun RootComponent(lifecycleRegistry: LifecycleRegistry): RootComponent =
    DefaultRootComponent(DefaultComponentContext(lifecycleRegistry))

@OptIn(ExperimentalComposeApi::class)
fun MainViewController(component: RootComponent) : UIViewController {
    return ComposeUIViewController(
        configure = {
            onFocusBehavior = OnFocusBehavior.DoNothing
            platformLayers = false
        }
    ) {



        App(component)

//        val state = rememberCupertinoSheetNativeState(
//            presentationStyle = PresentationStyle.Modal(
//                detents = setOf(
//                    PresentationDetent.Medium,
//                    PresentationDetent.Large,
//                )
//            )
//        )
//
//        LaunchedEffect(state) {
//            delay(2000)
//            state.show()
//            delay(2000)
//            state.expand()
//        }
//
//        LaunchedEffect(state.currentValue){
//            println(state.currentValue)
//        }
//
//        CupertinoSheetNative(
//            swipeEnabled = false,
//            state = state
//        ){
//            Text("какой ты наблюдательный")
//        }

//        var color by remember {
//            mutableStateOf(Color.Black)
//        }
//
//        var visible by remember {
//            mutableStateOf(true)
//        }
////
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
