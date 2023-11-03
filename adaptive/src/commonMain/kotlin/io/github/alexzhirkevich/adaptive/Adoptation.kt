package io.github.alexzhirkevich.adaptive

import androidx.compose.runtime.Composable

abstract class AdaptationScope<C,M> internal constructor() {

    @Composable
    abstract fun cupertino(block : @Composable C.() -> Unit)

    @Composable
    abstract fun material(block: @Composable M.() -> Unit)
}