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
actual fun FullscreenPopupProperties(
    dismissOnBackPress: Boolean,
    dismissOnClickOutside: Boolean,
    usePlatformDefaultWidth: Boolean,
) : PopupProperties = PopupProperties(
    focusable = true,
    dismissOnClickOutside = dismissOnClickOutside,
    dismissOnBackPress = dismissOnBackPress,
    usePlatformDefaultWidth = usePlatformDefaultWidth,
    usePlatformInsets = false
)