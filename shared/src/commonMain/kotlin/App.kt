@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class,
    ExperimentalFoundationApi::class, ExperimentalMaterialApi::class
)

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.BackdropValue
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.app.AdaptiveApplication
import com.github.alexzhirkevich.lookandfeel.app.ProvideLookAndFeel
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveBackdropScaffold
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveContextMenu
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveIconButton
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBar
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBarItem
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveScaffold
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSection
import com.github.alexzhirkevich.lookandfeel.components.TopBarType
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoBackdropScaffold
import com.github.alexzhirkevich.lookandfeel.components.rememberAdaptiveBackdropScaffoldState
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveArrowBack
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveSettings
import com.github.alexzhirkevich.lookandfeel.modifiers.adaptiveVerticalScroll
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import kotlinx.coroutines.launch

enum class Screen {
    Main, Backdrop
}
@Composable
fun App() {

    var isMaterial by remember {
        mutableStateOf(false)
    }

    var isDark by remember {
        mutableStateOf(false)
    }

    var screen by  remember {
        mutableStateOf(Screen.Main)
    }


    AdaptiveApplication(
        darkMode = isDark
    ) {
        AnimatedContent(isMaterial) {
            ProvideLookAndFeel(if (isMaterial) LookAndFeel.Material3 else LookAndFeel.Cupertino) {
                when (screen) {
                    Screen.Main ->Scaffold(
                        isMaterial = it,
                        isDark = isDark,
                        onDarkChanged = { isDark = it },
                        onMaterialChanged = { isMaterial = it },
                        onNavigateToBackdrop = {
                            screen = Screen.Backdrop
                        }
                    )
                    Screen.Backdrop -> BackdropDemo{
                        screen = Screen.Main
                    }
                }
            }
        }
    }
}

@Composable
fun BackdropDemo(onBack : () -> Unit) {
    val state = rememberAdaptiveBackdropScaffoldState(BackdropValue.Concealed)
    val scope = rememberCoroutineScope()

    AdaptiveBackdropScaffold(
        scaffoldState = state,
        appBar = {
            AdaptiveTopAppBar(
                modifier = Modifier,
                navigationIcon = {
                    AdaptiveIconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.Default.AdaptiveArrowBack,
                            contentDescription = null
                        )
                    }
                },
                title = { Text("Backdrop Demo") }
            )
        },
        backLayerContent = {
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    scope.launch {
                        state.reveal()
                    }
                }) {
                    Text("Show front layer")
                }
            }
        },
        frontLayerContent = {
            Box(Modifier.fillMaxSize()) {
                Button(
                    modifier = Modifier.align(Alignment.Center),
                    onClick = {
                        scope.launch {
                            state.conceal()
                        }
                    }) {
                    Text("Hide front layer")
                }
            }
        }
    )
}

@Composable
fun Scaffold(
    isMaterial : Boolean,
    onMaterialChanged : (Boolean) -> Unit,
    isDark : Boolean,
    onDarkChanged : (Boolean) -> Unit,
    onNavigateToBackdrop : () -> Unit
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

        val state = rememberScrollState()
        Box(
            Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            Column(
                Modifier
                    .fillMaxSize()
                    .adaptiveVerticalScroll(state)
            ) {
                CupertinoSection(
                    title = "Appearance",
                    caption = "Change appearance of the application"
                ) {

                    toggle(
                        title = {
                            Text(text = "Use Material UI")
                        },
                        checked = isMaterial,
                        onCheckedChange = onMaterialChanged
                    )

                    toggle(
                        title = {
                            Text(text = "Dark mode")
                        },
                        checked = isDark,
                        onCheckedChange = onDarkChanged
                    )
                }

                CupertinoSection {
                    label(onClick = onNavigateToBackdrop) {
                        Text("Backdrop demo")
                    }

                    item {
                        ContextMenuSample(it)
                    }
                }
            }
        }
    }
}

@Composable
fun ContextMenuSample(paddingValues: PaddingValues) {

    var menuVisible by remember { mutableStateOf(false) }

    AdaptiveContextMenu(
        modifier = Modifier,
        visible = menuVisible,
        onDismissRequest = { menuVisible = false },
        menu = {
            label(
                onClick = {},
                icon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null
                    )
                }
            ) {
                Text(
                    text = "Option 1"
                )
            }
            label(
                onClick = {},
                icon = {
                    Icon(
                        imageVector = Icons.Default.Send,
                        contentDescription = null
                    )
                }
            ) {
                Text(
                    text = "Option 2"
                )
            }
        }
    ) {
        Text(
            text = "Context menu (long press)",
            modifier = Modifier
                .shadow(
                    elevation = if (menuVisible && currentLookAndFeel == LookAndFeel.Cupertino)
                        10.dp else 0.dp,
                    shape = CardDefaults.shape
                )
                .combinedClickable(
                    enabled = menuVisible.not(),
                    onLongClick = {
                        menuVisible = true
                    }
                ) { }
                .clip(CardDefaults.shape)
                .background(AdaptiveTheme.colorScheme.surfaceVariant)
                .padding(paddingValues)
                .fillMaxWidth()

        )
    }
}

expect fun getPlatformName(): String