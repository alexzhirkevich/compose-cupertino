package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.interop.LocalUIViewController
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle

@Composable
internal actual fun SystemBarAppearance(dark: Boolean) {
    val viewController = LocalUIViewController.current

    LaunchedEffect(dark) {
        UIApplication.sharedApplication.setStatusBarStyle(
            if (dark) UIStatusBarStyleLightContent else UIStatusBarStyleDarkContent
        )
        viewController.setNeedsStatusBarAppearanceUpdate()
    }
}