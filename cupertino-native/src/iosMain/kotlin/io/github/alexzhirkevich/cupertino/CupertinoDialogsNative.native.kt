@file:OptIn(ExperimentalForeignApi::class)

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
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
    properties: DialogProperties,
    buttonsOrientation: Orientation,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
) = UIAlertController(
    onDismissRequest = onDismissRequest,
    title = title,
    message = message,
    style = UIAlertControllerStyleAlert,
    buttons = buttons,
    containerColor = containerColor,
)

@Composable
actual fun CupertinoActionSheetNative(
    onDismissRequest : () -> Unit,
    title : String?,
    message : String?,
    containerColor : Color,
    secondaryContainerColor : Color,
    properties: DialogProperties,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
) = UIAlertController(
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
    onDismissRequest: () -> Unit,
    title: String?,
    message: String?,
    style: UIAlertActionStyle,
    containerColor : Color,
//    presentationStyle : UIModalPresentationStyle,
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
                second?.backgroundColor = containerColor.toUIColor()
                first?.clipsToBounds = true
            }
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
    factory : () -> T,
    update : T.() -> Unit,
    onDismissRequest: () -> Unit,
    vararg updateKeys : Any?
){
    val dark = CupertinoTheme.colorScheme.isDark

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
        withContext(Dispatchers.Default) {
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