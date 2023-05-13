package moe.tlaster.precompose.lifecycle

interface Lifecycle {
    enum class State {
        Initialized,
        Active,
        InActive,
        Destroyed,
    }

    val currentState: State
    fun removeObserver(observer: LifecycleObserver)
    fun addObserver(observer: LifecycleObserver)
    fun hasObserver(): Boolean
}
