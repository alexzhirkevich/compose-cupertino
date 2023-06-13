package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.ComposeUIViewController
import com.github.alexzhirkevich.lookandfeel.app.ApplicationFromConfig
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
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
import platform.UIKit.UIAlertControllerStyleAlert
import platform.UIKit.UIView
import platform.UIKit.UIViewController
import platform.UIKit.UIViewControllerAnimatedTransitioningProtocol
import platform.UIKit.UIViewControllerInteractiveTransitioningProtocol
import platform.UIKit.UIViewControllerTransitioningDelegateProtocol
import platform.UIKit.addChildViewController
import platform.UIKit.didMoveToParentViewController
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
    buttonsOrientation: Orientation,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
) = UIAlertController(
        onDismissRequest = onDismissRequest,
        title = title,
        message = message,
        style = UIAlertControllerStyleAlert,
        buttons = buttons,
        containerColor = containerColor
    )


@Composable
@NonRestartableComposable
actual fun CupertinoActionSheetNative(
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    containerColor: Color,
    buttons: CupertinoNativeAlertDialogButtonsScope.() -> Unit
) = UIAlertController(
        onDismissRequest = onDismissRequest,
        title = title,
        message = message,
        style = UIAlertControllerStyleActionSheet,
        buttons = buttons,
        containerColor = containerColor
    )


@Composable
@NonRestartableComposable
actual fun CupertinoSheetNative(
    onDismissRequest: () -> Unit,
    containerColor: Color,
    shape: Shape,
    elevation : Dp,
    gesturesEnabled : Boolean,
    content: @Composable () -> Unit
) {
    val context = currentCompositionLocalContext
    PresentableDialog(
        factory = {
            ComposeUIViewController {
                CompositionLocalProvider(context) {
                    LocalPlatformConfiguration.current?.let {
                        ApplicationFromConfig(it, content)
                    } ?: content()
                }
            }
        },
        onDismissRequest = onDismissRequest,
        update = {}
    )
}


@Composable
internal fun UIAlertController(
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    style: UIAlertActionStyle,
    containerColor : Color,
    buttons: CupertinoNativeAlertDialogButtonsScope.() -> Unit,
) {

    PresentableDialog(
        factory = {
            UIAlertController.alertControllerWithTitle(
                title = title,
                message = message,
                preferredStyle = style
            ).apply {
                NativeAlertDialogButtonsScopeCupertino(onDismissRequest)
                    .apply(buttons)
                    .buttons.forEach {
                        addAction(it)
                    }
            }
        },
        update = {
            setTitle(title)
            setMessage(message)
            if (containerColor.isSpecified) {
                // the design is very human
                val first = view.subviews.firstOrNull() as? UIView
                val second = first?.subviews?.firstOrNull() as? UIView
                second?.backgroundColor = containerColor.ui
                first?.clipsToBounds = true
            }
        },
        onDismissRequest = onDismissRequest,
        title, message
    )
}

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
    vararg updateKeys : Any?
){
    val dark = isDark

    val dialogController = remember {
        UIViewControllerWrapper(onDismissRequest, factory())
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
    factory : () -> T,
    update : T.() -> Unit,
    onDismissRequest: () -> Unit,
    vararg updateKeys : Any?
){
    val dark = isDark

    val presentController = remember {
        factory()
    }

    val controller = LocalUIViewController.current

    val presentMutex = remember(presentController) { Mutex(locked = true) }

    LaunchedEffect(dark, *updateKeys){
        presentController.applyTheme(dark)
        update(presentController)
    }

    LaunchedEffect(presentController) {
        presentMutex.withLock {
            //TODO: replace with transitioningDelegate or smth more optimized
            while (true) {
                delay(100)
                if (controller.presentedViewController != presentController) {
                    onDismissRequest()
                    return@withLock
                }
            }
        }
    }

    DisposableEffect(0) {
        controller.presentViewController(presentController, true){
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