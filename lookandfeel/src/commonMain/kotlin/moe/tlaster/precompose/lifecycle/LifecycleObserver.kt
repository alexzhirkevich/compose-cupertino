package moe.tlaster.precompose.lifecycle

interface LifecycleObserver {
    fun onStateChanged(state: Lifecycle.State)
}
