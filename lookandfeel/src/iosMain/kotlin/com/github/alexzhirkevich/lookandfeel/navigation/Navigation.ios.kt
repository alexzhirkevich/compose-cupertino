package com.github.alexzhirkevich.lookandfeel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.window.ComposeUIViewController
import com.github.alexzhirkevich.lookandfeel.app.AdaptiveApplication
import platform.UIKit.UINavigationController
import platform.UIKit.UIViewController
import platform.UIKit.navigationController

//@ExportObjCClass
//private class UIKeyViewController(
//    val key: String?,
//    child : UIViewController
//) : UIViewController() {
//
//    @OverrideInit
//    constructor() : super(nibName = null, bundle = null)
//
//    @OverrideInit
//    constructor(coder: NSCoder) : super(coder)
//
//    init {
//        addChildViewController(child)
//    }
//}

actual class NavigationController(
    initial : UIViewController,
) : UINavigationController(initial) {

    private val stack = ArrayDeque<String>()

    actual fun present(
        content:  @Composable () -> Unit
    ) {
        presentViewController(ComposeUIViewController {
            AdaptiveApplication {
                CompositionLocalProvider(
                    LocalNavigationController provides this
                ) {
                    content()
                }
            }
        }, true) {}
    }

    actual fun dismiss(){
        dismissViewControllerAnimated(true){}
    }

    actual fun push(
        key: String?,
        title : String?,
        content: @Composable () -> Unit
    ) {
        pushViewController(ComposeUIViewController {
            AdaptiveApplication {
                CompositionLocalProvider(LocalNavigationController provides this) {
                    content()
                }
            }
//            }
        }.apply {
            setTitle(title)
        }, true)
    }

    actual fun popUpTo(key: String, inclusive: Boolean, animate: Boolean) {
//        val pop = viewControllers.indexOfLast {
//            (it as UIKeyViewController).key == it
//        }.takeIf { it >=0 } ?: return
//
//        if (!inclusive && uiNavigationController.viewControllers.lastIndex == pop)
//            return
//
//        val controller = if (inclusive)
//            uiNavigationController.viewControllers[pop]
//        else uiNavigationController.viewControllers[pop+1]
//
//        uiNavigationController.popToViewController(controller as UIViewController, animate)
    }

    actual fun pop() {
        popViewControllerAnimated(true)
    }

}

fun Application(
    title: String? = null,
    content: @Composable () -> Unit
) : UINavigationController {
    return NavigationController(ComposeUIViewController {
//        val nav = requireNotNull(LocalUIViewController.current.navigationController)
//        val navcontroller = remember { NavigationController(nav) }

        CompositionLocalProvider(
            LocalNavigationController provides LocalUIViewController.current.navigationController as NavigationController
        ){
            content()
        }
    }.apply {
        setTitle(title)
//        navigationItem.standardAppearance = UINavigationBarAppearance()
//            .apply { configureWithOpaqueBackground() }
    }).apply {

//        navigationBar.standardAppearance = UINavigationBarAppearance().apply {
//            configureWithTransparentBackground()
//            backgroundColor = clearColor
//            backgroundEffect = UIBlurEffect
//                .effectWithStyle(UIBlurEffectStyle.UIBlurEffectStyleSystemUltraThinMaterial)
//        }
//        navigationBar.prefersLargeTitles = true
//        navigationItem.largeTitleDisplayMode = UINavigationItemLargeTitleDisplayMode
//            .UINavigationItemLargeTitleDisplayModeAlways
    }
}
//
//@Composable
//actual fun NavigationLink(
//    key : String?,
//    title: String?,
//    label: @Composable (onClick : () -> Unit) -> Unit,
//    content: @Composable () -> Unit,
//) {
////    val nav = requireNotNull(LocalUIViewController.current.navigationController)
////    val config = requireNotNull(LocalPlatformConfiguration.current)
//    val controller = LocalNavigationController.current
//    label {
//        controller.push(key,content)
//    }
//}