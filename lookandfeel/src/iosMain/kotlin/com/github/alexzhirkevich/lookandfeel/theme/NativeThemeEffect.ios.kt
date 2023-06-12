package com.github.alexzhirkevich.lookandfeel.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.interop.LocalUIViewController
import com.github.alexzhirkevich.lookandfeel.components.cupertino.ui
import com.github.alexzhirkevich.lookandfeel.util.applyTheme
import com.github.alexzhirkevich.lookandfeel.util.isDark
import platform.UIKit.UIApplication
import platform.UIKit.UIColor.Companion.blackColor
import platform.UIKit.UIColor.Companion.whiteColor
import platform.UIKit.UIStatusBarManager
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle

@Composable
internal actual fun NativeThemeEffect(configuration: PlatformConfiguration?) {
    val controller = LocalUIViewController.current

    val dark = isDark
    val bg = AdaptiveTheme.colorScheme.background
    LaunchedEffect(dark){
        controller.applyTheme(dark)
        controller.view.backgroundColor = bg.ui
        UIApplication.sharedApplication.setStatusBarStyle(
            if (dark) UIStatusBarStyleLightContent else UIStatusBarStyleDarkContent
        )
    }
}