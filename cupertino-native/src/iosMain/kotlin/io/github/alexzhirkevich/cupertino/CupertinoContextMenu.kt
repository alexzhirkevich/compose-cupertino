///*
// * Copyright (c) 2023-2024 Compose Cupertino project and open source contributors.
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
//package io.github.alexzhirkevich.cupertino
//
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.CompositionLocalProvider
//import androidx.compose.runtime.currentCompositionLocalContext
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.rememberUpdatedState
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.interop.UIKitView
//import androidx.compose.ui.platform.LocalHapticFeedback
//import androidx.compose.ui.window.ComposeUIViewController
//import kotlinx.cinterop.CValue
//import kotlinx.cinterop.ExperimentalForeignApi
//import platform.CoreGraphics.CGPoint
//import platform.UIKit.UIAction
//import platform.UIKit.UIContextMenuConfiguration
//import platform.UIKit.UIContextMenuInteraction
//import platform.UIKit.UIContextMenuInteractionDelegateProtocol
//import platform.UIKit.UIMenu
//import platform.UIKit.addInteraction
//import platform.darwin.NSObject
//
//@OptIn(ExperimentalForeignApi::class)
//@Composable
//fun CupertinoContextMenu(
//    modifier: Modifier,
//    containerColor : Color = LocalContainerColor.current,
//    preview : @Composable (() -> Unit)? = null,
//    content : @Composable () -> Unit
//) {
//    val haptic = LocalHapticFeedback.current
//
//    val outContext by rememberUpdatedState(currentCompositionLocalContext)
//
//
//    val interaction = remember {
//        UIContextMenuInteraction(ContextMenuInteractionDelegate(preview))
//    }
//    UIKitView(
//        modifier = modifier,
//        background = containerColor,
//        factory = {
//            ComposeUIViewController {
//                val selfContext by rememberUpdatedState(currentCompositionLocalContext)
//                CompositionLocalProvider(outContext){
//                    CompositionLocalProvider(selfContext){
//                        CompositionLocalProvider(
//                            LocalHapticFeedback provides haptic,
//                            content = content
//                        )
//                    }
//                }
//            }.view.apply {
//                addInteraction(interaction)
//            }
//        }
//    )
//}
//
//private class ContextMenuInteractionDelegate(
//    private val preview: @Composable (() -> Unit)?
//) : NSObject(), UIContextMenuInteractionDelegateProtocol {
//
//    @ExperimentalForeignApi
//    override fun contextMenuInteraction(
//        interaction: UIContextMenuInteraction,
//        configurationForMenuAtLocation: CValue<CGPoint>
//    ): UIContextMenuConfiguration? {
//        return UIContextMenuConfiguration.configurationWithIdentifier(
//            identifier = null,
//            previewProvider = null,
//        ) {
//
//            val action = UIAction.actionWithTitle(
//                "Test", null, null
//            ) {
//                println("TEST")
//            }
//            UIMenu.menuWithChildren(listOf(action))
//        }
//    }
//}