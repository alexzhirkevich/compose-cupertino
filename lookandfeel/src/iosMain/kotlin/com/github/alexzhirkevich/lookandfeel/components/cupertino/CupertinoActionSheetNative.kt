package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.interop.LocalUIViewController
import com.github.alexzhirkevich.lookandfeel.util.applyTheme
import com.github.alexzhirkevich.lookandfeel.util.isDark
import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertActionStyle
import platform.UIKit.UIAlertActionStyleCancel
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertActionStyleDestructive
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleActionSheet


@Composable
actual fun CupertinoActionSheetNative(
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    buttons: CupertinoNativeAlertDialogButtonsScope.() -> Unit
) {

    val dark = isDark

    val alertController = remember(title, message) {

        UIAlertController.alertControllerWithTitle(
            title = title,
            message = message,
            preferredStyle = UIAlertControllerStyleActionSheet
        ).apply {
            applyTheme(dark)
            NativeAlertDialogButtonsScopeCupertino(onDismissRequest)
                .apply(buttons)
                .buttons.forEach {
                    addAction(it)
                }
        }
    }

    val controller = LocalUIViewController.current
    val presentMutex = remember { Mutex(locked = true) }

    LaunchedEffect(alertController){
        presentMutex.withLock {
            while (true) {
                delay(100)
                if (controller.presentedViewController != alertController) {
                    onDismissRequest()
                    return@LaunchedEffect
                }
            }
        }
    }
    DisposableEffect(alertController) {
        controller.presentViewController(alertController, true){
            presentMutex.unlock()
        }
        onDispose {
            controller.dismissViewControllerAnimated(true, null)
        }
    }
}

private class NativeAlertDialogButtonsScopeCupertino(
    val onDismissRequest: () -> Unit,
) : CupertinoNativeAlertDialogButtonsScope {

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