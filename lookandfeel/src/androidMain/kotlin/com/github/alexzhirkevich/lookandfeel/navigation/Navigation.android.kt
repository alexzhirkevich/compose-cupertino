package com.github.alexzhirkevich.lookandfeel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

actual class NavigationController {
    actual fun push(
        key: String?,
        title : String?,
        content:  @Composable () -> Unit
    ) {
    }

    actual fun present(
        content:  @Composable () -> Unit
    ){

    }

    actual fun dismiss(){

    }



    actual fun pop() {
    }

    actual fun popUpTo(key: String, inclusive: Boolean, animate: Boolean) {
    }

}

//@Composable
//actual fun NavigationLink(
//    key : String?,
//
//    label: @Composable (onClick : () -> Unit) -> Unit,
//    content: @Composable () -> Unit,
//){
//
//}