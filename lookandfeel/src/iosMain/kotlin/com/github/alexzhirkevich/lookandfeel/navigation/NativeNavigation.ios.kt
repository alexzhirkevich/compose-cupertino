package com.github.alexzhirkevich.lookandfeel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.window.ComposeUIViewController
import com.github.alexzhirkevich.lookandfeel.app.AdaptiveApplication
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import kotlinx.cinterop.ExportObjCClass
import platform.Foundation.NSCoder
import platform.UIKit.UIBlurEffect
import platform.UIKit.UIBlurEffectStyle
import platform.UIKit.UINavigationBarAppearance
import platform.UIKit.UINavigationController
import platform.UIKit.UINavigationItemLargeTitleDisplayMode
import platform.UIKit.UIViewController
import platform.UIKit.addChildViewController
import platform.UIKit.navigationController
import platform.UIKit.navigationItem

@ExportObjCClass
private class UIKeyViewController(
    val key: String?,
    child : UIViewController
) : UIViewController(null, null) {

    init {
        addChildViewController(child)
    }
}

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
        }.apply {
            setTitle(title)
        }, true)
    }

    actual fun popUpTo(key: String, inclusive: Boolean, animate: Boolean) {
        val pop = viewControllers.indexOfLast {
            (it as UIKeyViewController).key == it
        }.takeIf { it >=0 } ?: return

        if (!inclusive && viewControllers.lastIndex == pop)
            return

        val controller = if (inclusive)
            viewControllers[pop]
        else viewControllers[pop+1]

        popToViewController(controller as UIViewController, animate)
    }

    actual fun pop() {
        popViewControllerAnimated(true)
    }

}

fun Application(
    title: String? = null,
    content: @Composable () -> Unit
) : UIViewController {
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

        navigationBar.standardAppearance = UINavigationBarAppearance().apply {
            configureWithTransparentBackground()
//            backgroundColor = clearColor
            backgroundEffect = UIBlurEffect
                .effectWithStyle(UIBlurEffectStyle.UIBlurEffectStyleSystemUltraThinMaterial)
        }
        navigationBar.prefersLargeTitles = true
        navigationItem.largeTitleDisplayMode = UINavigationItemLargeTitleDisplayMode
            .UINavigationItemLargeTitleDisplayModeAlways
    }
}