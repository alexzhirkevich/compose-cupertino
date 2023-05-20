@file:OptIn(ExperimentalMaterialApi::class)

package com.github.alexzhirkevich.lookandfeel.components

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.compose.material.BackdropScaffoldState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowInsetsControllerCompat
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

@Composable
internal actual fun applyPlatformBackdropScaffoldStyle(state: BackdropScaffoldState) {

    val activity = LocalContext.current as? Activity ?: return
    val insetsController = remember(activity) {
        activity.window?.let { window ->
            WindowInsetsControllerCompat(window, window.decorView)
        }
    } ?: return

    val initialStatusBarStyle = remember(insetsController) {
        insetsController.isAppearanceLightStatusBars
    }
    if (currentLookAndFeel == LookAndFeel.Cupertino){
        DisposableEffect(state.isRevealed){

            if (state.isRevealed) {
                insetsController.isAppearanceLightStatusBars = true
            } else {
                insetsController.isAppearanceLightStatusBars = initialStatusBarStyle
            }
            onDispose {
                insetsController.isAppearanceLightStatusBars = initialStatusBarStyle
            }
        }
    }
}