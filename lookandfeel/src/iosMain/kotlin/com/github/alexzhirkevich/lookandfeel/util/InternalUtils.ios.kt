package com.github.alexzhirkevich.lookandfeel.util

import platform.UIKit.UIUserInterfaceStyle
import platform.UIKit.UIView
import platform.UIKit.UIViewController

fun UIViewController.applyTheme(dark: Boolean) {
    overrideUserInterfaceStyle = if (dark)
        UIUserInterfaceStyle.UIUserInterfaceStyleDark
    else UIUserInterfaceStyle.UIUserInterfaceStyleLight
}

fun UIView.applyTheme(dark : Boolean){
    listOf(this, superview).forEach {
        it?.overrideUserInterfaceStyle = if (dark)
            UIUserInterfaceStyle.UIUserInterfaceStyleDark
        else UIUserInterfaceStyle.UIUserInterfaceStyleLight
    }
}