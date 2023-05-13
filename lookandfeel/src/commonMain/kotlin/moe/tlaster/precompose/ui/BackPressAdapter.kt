package moe.tlaster.precompose.ui

import androidx.compose.runtime.compositionLocalOf
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map

val LocalBackDispatcherOwner = compositionLocalOf<BackDispatcherOwner?> { null }

interface BackDispatcherOwner {
    val backDispatcher: BackDispatcher
}

class BackDispatcher {
    private val handlers = arrayListOf<BackHandler>()

    fun onBackPress() {
        handlers.lastOrNull {
            it.isEnabled
        }?.handleBackPress()
    }

    private val canHandleBackPressFlow = MutableStateFlow(0)
    val canHandleBackPress: Flow<Boolean> = canHandleBackPressFlow.map {
        handlers.any { it.isEnabled }
    }

    internal fun onBackStackChanged() {
        canHandleBackPressFlow.value++
    }

    internal fun register(handler: BackHandler) {
        handlers.add(0, handler)
    }

    internal fun unregister(handler: BackHandler) {
        handlers.remove(handler)
    }
}

interface BackHandler {
    val isEnabled: Boolean
    fun handleBackPress()
}

internal class DefaultBackHandler(
    override var isEnabled: Boolean = true,
    private val onBackPress: () -> Unit,
) : BackHandler {
    override fun handleBackPress() {
        onBackPress()
    }
}
