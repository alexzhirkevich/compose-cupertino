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

@file:OptIn(ExperimentalForeignApi::class)

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.window.DialogProperties
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIAdaptivePresentationControllerDelegateProtocol
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyle
import platform.UIKit.UIAlertActionStyleCancel
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertActionStyleDestructive
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleActionSheet
import platform.UIKit.UIAlertControllerStyleAlert
import platform.UIKit.UIModalPresentationStyle
import platform.UIKit.UIPresentationController
import platform.UIKit.UIViewController
import platform.UIKit.UIViewControllerAnimatedTransitioningProtocol
import platform.UIKit.UIViewControllerTransitioningDelegateProtocol
import platform.UIKit.addChildViewController
import platform.UIKit.didMoveToParentViewController
import platform.UIKit.presentationController
import platform.UIKit.removeFromParentViewController
import platform.UIKit.transitioningDelegate
import platform.darwin.NSObject

@Composable
@NonRestartableComposable
actual fun CupertinoAlertDialogNative(
    onDismissRequest : () -> Unit,
    title: String?,
    message: String?,
    containerColor : Color,
    shape: Shape,
    properties: DialogProperties,
    buttonsOrientation: Orientation,
    buttons : NativeAlertDialogButtonsScope.() -> Unit
) = UIAlertController(
    onDismissRequest = onDismissRequest,
    title = title,
    message = message,
    style = UIAlertControllerStyleAlert,
    buttons = buttons,
)

@Composable
actual fun CupertinoActionSheetNative(
    visible : Boolean,
    onDismissRequest : () -> Unit,
    title : String?,
    message : String?,
    containerColor : Color,
    secondaryContainerColor : Color,
    properties: DialogProperties,
    buttons : NativeAlertDialogButtonsScope.() -> Unit
) {
    if (visible) {
        UIAlertController(
            onDismissRequest = onDismissRequest,
            title = title,
            message = message,
            style = UIAlertControllerStyleActionSheet,
            buttons = buttons,
        )
    }
}


//@Composable
//@NonRestartableComposable
//actual fun CupertinoSheetNative(
//    onDismissRequest: () -> Unit,
//    containerColor: Color,
//    shape: Shape,
//    elevation : Dp,
//    gesturesEnabled : Boolean,
//    content: @Composable () -> Unit
//) {
//    val context = currentCompositionLocalContext
//
//    PresentableDialog(
//        factory = {
//            ComposeUIViewController {
//                CompositionLocalProvider(context) {
//                    content()
//                }
//            }
//        },
//        onDismissRequest = onDismissRequest,
//        update = {}
//    )
//}


@Composable
internal fun UIAlertController(
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    style: UIAlertActionStyle,
    buttons: NativeAlertDialogButtonsScope.() -> Unit,
) {

    PresentationController(
        factory = {
            UIAlertController.alertControllerWithTitle(
                title = title,
                message = message,
                preferredStyle = style
            ).apply {
                NativeAlertDialogButtonsScopeImpl(onDismissRequest)
                    .apply(buttons)
                    .buttons.forEach {
                        addAction(it)
                    }
            }
        },
        update = {
            setTitle(title)
            setMessage(message)
        },
        onDismissRequest = onDismissRequest,
//        presentationStyle = presentationStyle,
        title, message
    )
}

private class NativeAlertDialogButtonsScopeImpl(
    val onDismissRequest: () -> Unit,
) : NativeAlertDialogButtonsScope {

    val buttons = mutableListOf<UIAlertAction>()

    override fun button(
        onClick: () -> Unit,
        style: AlertActionStyle,
        enabled: Boolean,
        title: String
    ) {
        buttons.add(UIAlertAction.actionWithTitle(
            title = title, style = style.ui, handler = {
                onClick()
                onDismissRequest()
            }
        ).apply {
            setEnabled(enabled)
        })
    }
}



internal val AlertActionStyle.ui : UIAlertActionStyle get() =
    when(this){
        AlertActionStyle.Default -> UIAlertActionStyleDefault
        AlertActionStyle.Cancel -> UIAlertActionStyleCancel
        AlertActionStyle.Destructive -> UIAlertActionStyleDestructive
    }