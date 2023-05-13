package com.github.alexzhirkevich.lookandfeel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

expect class NavigationController {

    fun push(
        key: String ?= null,
        title : String? = null,
        content:  @Composable () -> Unit
    )

    fun present(
        content:  @Composable () -> Unit
    )

    fun dismiss()

    fun popUpTo(key: String, inclusive : Boolean, animate : Boolean)

    fun pop()
}

val LocalNavigationController = staticCompositionLocalOf<NavigationController> {
    error("")
}

@Composable
fun NavigationLink(
    key : String ?= null,
    title: String ?= null,
    label: @Composable (onClick : () -> Unit) -> Unit,
    content: @Composable () -> Unit,
) {
//    val nav = requireNotNull(LocalUIViewController.current.navigationController)
//    val config = requireNotNull(LocalPlatformConfiguration.current)
    val controller = LocalNavigationController.current
    label {
        controller.push(key, title, content)
    }
}

@Composable
fun Sheet(
    label: @Composable (onClick: () -> Unit) -> Unit,
    content: @Composable () -> Unit
) {
    val controller = LocalNavigationController.current
    label {
        controller.present(content)
    }
}