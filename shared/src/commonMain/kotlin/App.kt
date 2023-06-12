@file:OptIn(ExperimentalMaterialApi::class)

import androidx.compose.foundation.background
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.github.alexzhirkevich.lookandfeel.app.AdaptiveApplication
import com.github.alexzhirkevich.lookandfeel.app.ProvideLookAndFeel
import com.github.alexzhirkevich.lookandfeel.app.platformLookAndFeel
import com.github.alexzhirkevich.lookandfeel.components.DropdownMenu
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator

enum class Screen {
    Main, Backdrop, Dialogs
}

@Composable
fun App() {
    
    var isDark by remember {
        mutableStateOf(false)
    }

    MaterialTheme {
        AdaptiveApplication(
            darkMode = isDark,
        ) {
            var isMaterial by remember {
                mutableStateOf(platformLookAndFeel == LookAndFeel.Material3)
            }

            // Optional part.
            // Demo of look and feel provisioning.
            // AdaptiveApplication automatically provides platformLookAndFeel
            ProvideLookAndFeel(
                if (isMaterial) {
                    LookAndFeel.Material3
                } else {
                    LookAndFeel.Cupertino
                },
            ) {
                val navigator = rememberNavigator()

                NavHost(
                    navigator = navigator,
                    initialRoute = Screen.Main.name,
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                ) {
                    scene(Screen.Main.name) {

                        MainScreen(
                            isMaterial = isMaterial,
                            onMaterialChanged = { isMaterial = it },
                            isDark = isDark,
                            onDarkChanged = { isDark = it },
                            onNavigateToBackdrop = {
                                navigator.navigate(Screen.Backdrop.name)
                            },
                            onNavigateToDialogs = {
                                navigator.navigate(Screen.Dialogs.name)
                            },
                        )
                    }

                    scene(Screen.Backdrop.name) {
                        BackdropScreen()
                    }
//                    scene(Screen.Modal/BottomSheet.name) {
//                        ModalBottomSheetScreen()
//                    }

                    scene(Screen.Dialogs.name) {
                        DialogsScreen()
                    }
                }
            }
        }
    }
}
