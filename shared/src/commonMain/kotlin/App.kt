@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class)

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.github.alexzhirkevich.lookandfeel.app.AdaptiveApplication
import com.github.alexzhirkevich.lookandfeel.app.ProvideLookAndFeel
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveIconButton
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBar
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBarItem
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveScaffold
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveSwitch
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.Section
import com.github.alexzhirkevich.lookandfeel.components.TopBarType
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveArrowBack
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveSettings
import com.github.alexzhirkevich.lookandfeel.modifiers.adaptiveVerticalScroll
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel

@Composable
fun App() {

    var isMaterial by remember {
        mutableStateOf(false)
    }

    var isDark by remember {
        mutableStateOf(false)
    }

    AdaptiveApplication(
        darkMode = isDark
    ) {
        AnimatedContent(isMaterial) {
            ProvideLookAndFeel(if (it) LookAndFeel.Material3 else LookAndFeel.Cupertino) {
                Scaffold(
                    isMaterial = it,
                    isDark = isDark,
                    onDarkChanged = { isDark = it },
                    onMaterialChanged = { isMaterial = it }
                )
            }
        }
    }
}

@Composable
fun Scaffold(
    isMaterial : Boolean,
    onMaterialChanged : (Boolean) -> Unit,
    isDark : Boolean,
    onDarkChanged : (Boolean) -> Unit,
) {
    AdaptiveScaffold(
        topBarType = TopBarType.Small,
        bottomBar = {
            var selected by remember {
                mutableStateOf(0)
            }
            AdaptiveNavigationBar {
                repeat(3) {
                    AdaptiveNavigationBarItem(
                        icon = {
                            Icon(
                                imageVector = Icons.Default.AdaptiveSettings,
                                contentDescription = null
                            )
                        },
                        label = { Text("Settings") },
                        selected = it == selected,
                        onClick = { selected = it }
                    )
                }
            }
        },
        topBar = {
            AdaptiveTopAppBar(
                modifier = Modifier,
                navigationIcon = {
                    AdaptiveIconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.AdaptiveArrowBack,
                            contentDescription = null
                        )
                    }
                },
                title = { Text("Settings") }
            )
        }
    ) { paddingValues, _ ->
        Column(
            Modifier
                .fillMaxSize()
                .adaptiveVerticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
            Section(
                title = "Appearance",
                caption = "Change appearance of the application"
            ) {

                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Use Material UI",
                        modifier = Modifier.weight(1f)
                    )
                    AdaptiveSwitch(
                        modifier = Modifier,
                        checked = isMaterial,
                        onCheckedChange = { onMaterialChanged(it) }
                    )
                }

                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Dark mode",
                        modifier = Modifier.weight(1f)
                    )
                    AdaptiveSwitch(
                        modifier = Modifier,
                        checked = isDark,
                        onCheckedChange = { onDarkChanged(it) }
                    )
                }
            }
        }
    }
}

expect fun getPlatformName(): String