package io.github.alexzhirkevich.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.PopupProperties
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


@OptIn(ExperimentalComposeUiApi::class)
@Composable
@ReadOnlyComposable
internal actual fun FullscreenPopupProperties(
    dismissOnBackPress: Boolean,
    dismissOnClickOutside: Boolean,
    usePlatformDefaultWidth: Boolean,
) : PopupProperties = PopupProperties(
    dismissOnBackPress = dismissOnBackPress,
    dismissOnClickOutside = dismissOnClickOutside,
    usePlatformDefaultWidth = usePlatformDefaultWidth
)