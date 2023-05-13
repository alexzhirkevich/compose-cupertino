package moe.tlaster.precompose.lifecycle

import androidx.compose.runtime.compositionLocalOf

interface LifecycleOwner {
    val lifecycle: Lifecycle
}

val LocalLifecycleOwner = compositionLocalOf<LifecycleOwner> { noLocalProvidedFor("LocalLifecycleOwner") }

private fun noLocalProvidedFor(name: String): Nothing {
    error("CompositionLocal $name not present")
}
