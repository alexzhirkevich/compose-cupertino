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
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.window.DialogProperties
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyle
import platform.UIKit.UIAlertActionStyleCancel
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertActionStyleDestructive
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleActionSheet
import platform.UIKit.UIAlertControllerStyleAlert
import platform.UIKit.UIModalPresentationStyle
import platform.UIKit.UIView
import platform.UIKit.UIViewController
import platform.UIKit.addChildViewController
import platform.UIKit.didMoveToParentViewController
import platform.UIKit.removeFromParentViewController

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
    visible = true,
    onDismissRequest = onDismissRequest,
    title = title,
    message = message,
    style = UIAlertControllerStyleAlert,
    buttons = buttons,
    containerColor = containerColor,
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
) = UIAlertController(
    visible = visible,
    onDismissRequest = onDismissRequest,
    title = title,
    message = message,
    style = UIAlertControllerStyleActionSheet,
    buttons = buttons,
    containerColor = containerColor,
)



//@Composable
//@NonRestartableComposable
//actual fun CupertinoActionSheetNative(
//    onDismissRequest: () -> Unit,
//    title: String?,
//    message: String?,
//    containerColor: Color,
//    buttons: CupertinoNativeAlertDialogButtonsScope.() -> Unit
//) = UIAlertController(
//    onDismissRequest = onDismissRequest,
//    title = title,
//    message = message,
//    style = UIAlertControllerStyleActionSheet,
//    buttons = buttons,
//    containerColor = containerColor
//)


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
    visible: Boolean,
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    style: UIAlertActionStyle,
    containerColor : Color,
//    presentationStyle : UIModalPresentationStyle,
    buttons: NativeAlertDialogButtonsScope.() -> Unit,
) {

    PresentableDialog(
        visible = visible,
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

@OptIn(ExperimentalForeignApi::class)
private class UIViewControllerWrapper<T : UIViewController>(
    private val onDismissRequest: () -> Unit,
    val child: T,
) : UIViewController(null, null) {
    override fun viewDidLoad() {
        super.viewDidLoad()
        addChildViewController(child)
        child.view.setFrame(view.frame)
        view.addSubview(child.view)
        child.didMoveToParentViewController(this)

        modalPresentationStyle = child.modalPresentationStyle
        modalTransitionStyle = child.modalTransitionStyle
    }

    override fun viewDidDisappear(animated: Boolean) {
        super.viewDidDisappear(animated)
        onDismissRequest()
    }
}

@Composable
internal fun <T : UIViewController> PresentableDialogWrapped(
    factory : () -> T,
    update : T.() -> Unit,
    onDismissRequest: () -> Unit,
    presentationStyle : UIModalPresentationStyle,
    vararg updateKeys : Any?
){
    val dark = CupertinoTheme.colorScheme.isDark

    val dialogController = remember {
        UIViewControllerWrapper(onDismissRequest, factory()).apply {
//            modalPresentationStyle = presentationStyle
        }
    }

    val controller = LocalUIViewController.current

    LaunchedEffect(dark, *updateKeys){
        dialogController.applyTheme(dark)
        update(dialogController.child)
    }

    DisposableEffect(0) {
        controller.presentViewController(dialogController, true){

        }
        onDispose {
            dialogController.removeFromParentViewController()
        }
    }
}


@Composable
internal fun <T : UIViewController> PresentableDialog(
    visible: Boolean,
    factory : () -> T,
    update : T.() -> Unit,
    onDismissRequest: () -> Unit,
    vararg updateKeys : Any?
){
    if (visible) {
        val dark = CupertinoTheme.colorScheme.isDark

        val presentController = remember {
            factory()
        }

        val controller = LocalUIViewController.current

        val presentMutex = remember(presentController) { Mutex(locked = true) }

        LaunchedEffect(dark, *updateKeys) {
            presentController.applyTheme(dark)
            update(presentController)
        }

        LaunchedEffect(presentController) {
            withContext(Dispatchers.Default) {
                presentMutex.withLock {
                    //TODO: replace smth more optimized
                    while (true) {
                        delay(100)
                        if (controller.presentedViewController != presentController) {
                            onDismissRequest()
                            return@withLock
                        }
                    }
                }
            }
        }

        DisposableEffect(controller) {
            controller.presentViewController(presentController, true) {
                if (presentMutex.isLocked) {
                    presentMutex.unlock()
                }
            }
            onDispose {
                if (controller.presentedViewController == presentController) {
                    controller.dismissViewControllerAnimated(true, null)
                }
            }
        }
    }
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