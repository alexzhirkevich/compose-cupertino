package moe.tlaster.precompose.navigation

import androidx.compose.runtime.saveable.SaveableStateHolder

interface UiClosable {
    fun close(stateId: String)
}

internal class ComposeUiClosable(
    val composeSaveableStateHolder: SaveableStateHolder,
) : UiClosable {
    override fun close(stateId: String) {
        composeSaveableStateHolder.removeState(stateId)
    }
}
