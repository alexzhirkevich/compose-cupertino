package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle

@Composable
internal actual fun applyPlatformBackdropScaffoldStyle(state: AdaptiveBackdropScaffoldState) {

    if (currentLookAndFeel == LookAndFeel.Cupertino) {
        val oldStyle = remember {
            UIApplication.sharedApplication.statusBarStyle
        }

        DisposableEffect(state.isConcealed) {
            if (state.isConcealed) {
                UIApplication.sharedApplication
                    .setStatusBarStyle(oldStyle, true)
            } else {
                UIApplication.sharedApplication.setStatusBarStyle(
                    UIStatusBarStyleLightContent,
                    true
                )
            }
            onDispose { UIApplication.sharedApplication.setStatusBarStyle(oldStyle, true) }
        }
    }
}