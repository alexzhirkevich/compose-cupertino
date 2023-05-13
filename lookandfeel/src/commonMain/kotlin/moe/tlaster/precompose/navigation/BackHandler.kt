package moe.tlaster.precompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import moe.tlaster.precompose.lifecycle.LocalLifecycleOwner
import moe.tlaster.precompose.ui.DefaultBackHandler
import moe.tlaster.precompose.ui.LocalBackDispatcherOwner

@Composable
fun BackHandler(enabled: Boolean = true, onBack: () -> Unit) {
    // Safely update the current `onBack` lambda when a new one is provided
    val backDispatcher = checkNotNull(LocalBackDispatcherOwner.current) {
        "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"
    }.backDispatcher
    val currentOnBack by rememberUpdatedState(onBack)
    // Remember in Composition a back callback that calls the `onBack` lambda
    val backCallback = remember { DefaultBackHandler(enabled) { currentOnBack.invoke() } }
    // On every successful composition, update the callback with the `enabled` value
    SideEffect {
        if (backCallback.isEnabled != enabled) {
            backDispatcher.onBackStackChanged()
        }
        backCallback.isEnabled = enabled
    }
    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect(lifecycleOwner, backDispatcher) {
        // Add callback to the backDispatcher
        backDispatcher.register(backCallback)
        // When the effect leaves the Composition, remove the callback
        onDispose {
            backDispatcher.unregister(backCallback)
        }
    }
}
