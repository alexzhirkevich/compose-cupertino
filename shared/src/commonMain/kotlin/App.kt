@file:OptIn(ExperimentalMaterial3Api::class)

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FindReplace
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
import com.github.alexzhirkevich.lookandfeel.app.CupertinoApplication
import com.github.alexzhirkevich.lookandfeel.app.MaterialApplication
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveIconButton
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBar
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveNavigationBarItem
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveScaffold
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveSwitch
import com.github.alexzhirkevich.lookandfeel.components.AdaptiveTopAppBar
import com.github.alexzhirkevich.lookandfeel.components.Section
import com.github.alexzhirkevich.lookandfeel.components.TopBarType
import com.github.alexzhirkevich.lookandfeel.icons.PlatformArrowBack
import com.github.alexzhirkevich.lookandfeel.icons.PlatformSettings

@Composable
fun App() {

    MaterialApplication {
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
                                    imageVector = Icons.Default.PlatformSettings,
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
                                imageVector = Icons.Default.PlatformArrowBack,
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
                    .padding(paddingValues)
            ) {
                Section(
                    title = "Section",
                    caption = "Caption of this section"
                ) {

                    Row(
                        Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        var switchState by remember {
                            mutableStateOf(true)
                        }

                        Text(
                            text = "Some preference",
                            modifier = Modifier.weight(1f)
                        )
                        AdaptiveSwitch(
                            modifier = Modifier,
                            checked = switchState,
                            onCheckedChange = { switchState = it }
                        )
                    }

                    Row(
                        Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        var switchState by remember {
                            mutableStateOf(true)
                        }

                        Text(
                            text = "Some other preference",
                            modifier = Modifier.weight(1f)
                        )
                        AdaptiveSwitch(
                            modifier = Modifier,
                            checked = switchState,
                            onCheckedChange = { switchState = it }
                        )
                    }
                }
            }
        }
    }
}

expect fun getPlatformName(): String